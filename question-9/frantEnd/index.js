
const apiUrl = "http://localhost:8080"; // Replace with your Spring Boot API URL


function registerUser() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    const user = {
        name: name,
        email: email,
        password: password,
    };

    fetch(apiUrl + "/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(user),
    })
    .then((response) => response.text())
    .then((data) => alert(data))
    .catch((error) => console.error("Error:", error));
}




function loginUser() {
    
    const email = document.getElementById("loginEmail").value;
    const password = document.getElementById("loginpassword").value;

    const user = {
        
        email: email,
        password: password,
    };

    fetch(apiUrl + "/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(user),
    })
    .then((response) => response.text())
    .then((data) => alert(data))
    .catch((error) =>
     console.error("Error:", error));
}





function viewUsers() {
    fetch(apiUrl + "/view")
    .then((rs) => {
        if (!rs.ok) {
            throw new Error("Network response was not ok");
        }
        return rs.json();
    })
    .then((data) => {
        const userList = document.getElementById("userList");
        userList.innerHTML = "";
        data.forEach((user) => {
            userList.innerHTML += `<p>Name: ${user.name}, Email: ${user.email}</p>`;
        });
    })
    .catch((error) => console.error("Error:", error));
}