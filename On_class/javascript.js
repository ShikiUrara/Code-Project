// strict
"use strict"


// Bai 1 Bo sung chuc nang tim kiem du lieu

function searching() {
    var input = document.getElementById("enterPress").value;
    window.localStorage.setItem("searchKeyword", input);
    var  frm = document.forms["formSearch"];
    if(frm.words.value.length > 0)
        frm.submit();
}
function enterCheck(event) {
    if(event.keyCode === 32) {
        searching();
    }
}

function searchResult() {
    var url = new URL(window.location);
    var wd =  url.searchParams.get("words");
    // if(wd == null) 
    //     document.getElementById("out").innerHTML = "Không tìm thấy từ khóa đã nhập"
    // else
    //     document.getElementById("out").innerHTML = wd + " " + window.localStorage.getItem("searchKeyword") + " " + "URL: " + url;
    document.getElementById("out").innerHTML = window.localStorage.getItem("searchKeyword")
}

// Bai 2 Xac thuc du lieu form

function confirmationLogin(frm) {
    var emailReg = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if(emailReg.test(frm.email.value) == false) {
        alert("Email không hợp lệ!");
        frm.email.focus();
        return false;
    }
    if(frm.pw.value.length < 8) {
        alert("Mật khẩu có ít nhất 8 ký tự");
        frm.pw.focus();
        return false;
    }
    alert("Đã gửi dữ liệu")
    return true;
}

function confirmationRegister(frm) {
    var emailReg = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if(emailReg.test(frm.email.value) == false) {
        alert("Email không hợp lệ!");
        frm.email.focus();
        return false;
    }
    if(frm.pw.value.length < 8) {
        alert("Mật khẩu có ít nhất 8 ký tự");
        frm.pw.focus();
        return false;
    }
    if(frm.pw.value != frm.pw2.value) {
        alert("Mật khẩu xác nhận không hợp lê!")
        frm.pw2.focus();
        return false;
    }
    alert("Đã gửi dữ liệu")
    return true;
}

function confirmationContact(frm) {
    var emailReg = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if(emailReg.test(frm.email.value) == false) {
        alert("Email không hợp lệ!");
        frm.email.focus();
        return false;
    }
    if(frm.name.value.length < 4) {
        alert("Tên không hợp lệ!");
        frm.name.focus();
        return false;
    }
    if(frm.contact.value.length < 10) {
        alert("Nhập nội dung không hợp lê!");
        frm.contact.focus();
        return false;
    }
    alert("Đã gửi dữ liệu")
    return true;
}
// Bai 3 Them san pham vao don dat hang
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
function addCart(code) {
    var number = parseInt(document.getElementById(code).value)
    var name = itemList[code].name
    if(typeof localStorage[code] === "undefined") {
        window.localStorage.setItem(code, number);
        alert("Đã thêm " + number + name + " vào giỏ hàng");
    }
    else {
        if(localStorage.getItem(code) >= 100) {
            window.localStorage.setItem(code, 100);
            alert("Số lượng không vượt quá 100")
        }
        else /* localStorage.getItem("code") < 100 */ {
            var current = parseInt(window.localStorage.getItem(code));
            window.localStorage.setItem(code , current + number);
            alert("Đã thêm " + number + " " + name + " vào giỏ hàng");
        }
    }
}


// Bai 4
function cart() {
    window.location.href = "donhang.html"
}

function showCart() {

}