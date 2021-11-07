// Bai 1
function dataSend() {
    var input = document.getElementById("enterPress").value;
    alert("Input: " + input + "\nInput length: "+ input.length);
    if(input.length === 0) {
        return;
    }
    else alert("Complete data send");
}


// catch try ???
function enterPress(event) {
    if(event.keyCode === 13 || event.key === "Enter") {
        console.log("Enter pressed");
        dataSend();
    }
    else return;
}

// Bai 2

function dataConfirmation(frm) {
    if(dataConfirmationEmail(frm) === true && dataConfirmationPassword(frm) === true && dataConfirmationName(frm) === true && dataConfirmationContact(frm) === true) {
        alert("Đã gửi dữ liệu");
        return true;
    }
    else {
        alert("Error");
        return false;
    }
}

function dataConfirmationEmail() {
    var emailReg = /^[a-zA-Z0-9._-]+@[a-zA-z0-9.-]+\.[a-zA-a] {2, 4}$/;
    if(emailReg.test(document.getElementById("email").value) == false) {
        alert("Mã xử lý dự liệu không hợp lệ - email");
        return false;
    }
    else return true;
}

function dataConfirmationPassword() {
    if(document.getElementById("password").value.length < 8) {
        alert("Mã xử lý dự liệu không hợp lệ - password");
        return false;
    }
    else return true;
}

function dataConfirmationName() {
    if (document.getElementById("name").value.length < 4) {
        alert("Mã xử lý dự liệu không hợp lệ - name");
        return false;
    }
    else
        return true;
}

function dataConfirmationContact() {
    if(document.getElementById("contact").value.length < 10) {
        alert("Mã xử lý dự liệu không hợp lệ - contact");
        return false;
    }
    else return true;
}

// Bai 3 ???
var itemList = {
        "sp001": {  "name": "Sữa Chua Vị Kiwi", "price": 21000, "photo": "images/sanpham/kiwi.jpg"},
        "sp002": {  "name": "Sữa Chua Vị Xoài", "price": 22000, "photo": "images/sanpham/mango.jpg"},
        "sp003": {  "name": "Sữa Chua Vị Dưa lưới", "price": 23000, "photo": "images/sanpham/cantaloupe.jpg"},
        "sp004": {  "name": "Sữa Chua Vị Mâm Xôi", "price": 24000, "photo": "images/sanpham/blackberry.jpg"},
        "sp005": {  "name": "Sữa Chua Vị Dâu Tây", "price": 25000, "photo": "images/sanpham/strawberry.jpg"},
        "sp006": {  "name": "Sữa Chua Vị Việt Quất", "price": 26000, "photo": "images/sanpham/blueberry.jpg"},
        "sp007": {  "name": "Sữa Chua Vị Bưởi", "price": 27000, "photo": "images/sanpham/grapes.jpg"},
        "sp008": {  "name": "Sữa Chua Vị Táo Xanh", "price": 28000, "photo": "images/sanpham/green-apple.jpg"},
        "sp009": {  "name": "Sữa Chua Vị Dứa", "price": 29000, "photo": "images/sanpham/pineapple.jpg"}
};

if(typeof localStorage[code] === "undefined") {
    window.localStorage.setItem(code, Number);
}

// Bai 4
function cart() {
    window.location.href = "donhang.html"
}

function showCart() {

}