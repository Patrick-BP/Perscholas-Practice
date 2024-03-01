function signout() {
  window.location = "index.html";
}


function fetchData(category) {
    document.getElementById("welcome").style.display = "none"

  fetch("http://localhost:8082/resource")
    .then((res) => res.json())
    .then((data) => {
      let items = data.filter((resource) => resource.category === category);
       const itemWrap = document.getElementById("itemsWrap");
       itemWrap.innerHTML =`
       <div class=" my-5">
            <h4 class="fw-bold mb-4 text-uppercase" >${category}</h4>
       `

       if(items.length > 0){
        items.forEach((elm) => {
       
            itemWrap.innerHTML += `
                
                
                <div class="d-flex my-5">
        
                    <div class="col-lg-9  ">
                        <span class="fs-6 fw-bolder " style="color:#455f8d ;">${elm.title}</span>
                        <p class="fw-medium mb-0 ">${elm.description}</p>
                        <span class="fw-bolder " style="color:#455f8d ; font-size: small;">${elm.url.substring(13)}</span><br>
                        <div class="d-flex gap-3">
                            <div ><svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em" viewBox="0 0 20 20"><path fill="currentColor" d="M12.92 2.873a2.975 2.975 0 0 1 4.207 4.207l-.669.669l-4.207-4.207zM11.544 4.25l-7.999 7.999a2.438 2.438 0 0 0-.655 1.194l-.878 3.95a.5.5 0 0 0 .597.597l3.926-.873a2.518 2.518 0 0 0 1.234-.678l7.982-7.982z"/></svg></div>
                            <div onClick="deleteResourceFunc('${elm._id}')" style="cursor: pointer;"><svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em" viewBox="0 0 24 24"><path fill="currentColor" d="M7 21q-.825 0-1.412-.587T5 19V6H4V4h5V3h6v1h5v2h-1v13q0 .825-.587 1.413T17 21zm2-4h2V8H9zm4 0h2V8h-2z"/></svg></div>
                        </div>
                        <a href="${elm.url}" target="_blanc" class="border rounded-5  fw-bolder text-decoration-none  text-dark" style="padding: 4px 15px 4px 15px;background-color:#E8EBF3 ; font-size: 12px; color:#1E1E1E" >Open Website</a>
        
                    </div>
                    <div class="previewCard">
                        <img class="card-img img-fluid img-thumbnail " src="" />
                    </div>
                </div>
            </div>
                
                `;
          });
       }else{
        itemWrap.innerHTML = `
        <p class="m-5 fs-2 ">Comming Soon...</p>
        
        `
       }
     
    })
    .catch(error=>{
        console.error('There was a problem with the fetch resources:', error)
    });
}



(function fetchCategories(){
    fetch("http://localhost:8082/category")
    .then((res) => res.json())
    .then((data) => {
        localStorage.setItem("categories", JSON.stringify(data) );
        const categoryWrap = document.getElementById("categoryWrap");
        data.forEach(elmnt => {
            categoryWrap.innerHTML +=`
            <a href="#" onclick="fetchData('${elmnt.name}')" class="border rounded-5 mt-2   fw-bolder  text-decoration-none  text-dark" style="padding: 4px 15px 4px 15px; background-color:#E8EBF3 ; font-size: 12px; color:#1E1E1E" >${elmnt.name}</a>

            `
        });
    })
    .catch(error=>{
        console.error('There was a problem with the fetch category:', error)
    });
})();


const deleteResourceFunc = (id) => {
    fetch(`http://localhost:8082/resource/${id}`,{
        method:'DELETE',
        headers:{
            'Content-Type':'application/json'
        }
    })
};
const updateResource = () => {};