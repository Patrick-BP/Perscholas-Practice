

const loginform = document.getElementById("loginform");
const message = document.getElementById("message")

loginform.addEventListener("submit",(e)=>{

     e.preventDefault();
    const email = loginform.email.value;
    const pass = loginform.password.value;
    if (email === "test@gmail.com" && pass === "1aA") {
        window.location = "home.html"
    } else {
        message.style.color ="red"
        message.textContent = "Invalid username or password. Please try again.";
    }
    
})
   
    
   
