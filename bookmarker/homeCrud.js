const categoryForm = document.getElementById("categoryForm");
const resourceForm = document.getElementById("resourceForm");
const selectCat = document.getElementById("selectCateg");

const categories = localStorage.getItem("categories");
const categoriesList = JSON.parse(categories);

categoriesList.forEach((elmnt) => {
  selectCat.innerHTML += `
    <option value='${elmnt.name}'>${elmnt.name}</option>
    `;
});

categoryForm.addEventListener("submit", (e) => {
  e.preventDefault();
  const name = categoryForm.name.value;
  addCategory(name);
  categoryForm.name.value = " ";
  location.reload();
});

resourceForm.addEventListener("submit", (e) => {
  e.preventDefault();
  const title = resourceForm.title.value;
  const url = resourceForm.url.value;
  const description = resourceForm.description.value;
  const category = resourceForm.category.value;
  addResource(title, url, description, category);
  resourceForm.title.value = " ";
  resourceForm.description.value = " ";
  resourceForm.url.value = " ";
  location.reload();
});

const addCategory = async (name) => {
  const categoryObj = { name };
  fetch("http://localhost:8082/category", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(categoryObj),
  });
};
const addResource = async (title, url, description, category) => {
  const resourceObj = { title, url, description, category };
  fetch("http://localhost:8082/resource", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(resourceObj),
  });
};

