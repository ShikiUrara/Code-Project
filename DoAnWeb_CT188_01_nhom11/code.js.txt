//xác thực dư liệu Đăng nhập
function frmDangNhap(fm) {
    var emailReg = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (emailReg.test(fm.mail.value) == false) {
        alert("Email không hợp lệ!!");
        fm.mail.focus();
        return false;
    }
    if (fm.pws.value.length < 8) {
        alert("Mật khẩu ít nhất 8 ký tự!!")
        fm.pws.focus();
        return false
    }
    alert("Đăng nhập thành công!!");
    return true;
}
//xác thực dư liệu Đăng ký
function frmDangky(fm) {
    var emailReg = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (emailReg.test(fm.mail.value) == false) {
        alert("Email không hợp lệ!!");
        fm.mail.focus();
        return false;
    }
    if (fm.pws.value.length < 8) {
        alert("Mật khẩu ít nhất 8 ký tự!!")
        fm.pws.focus();
        return false
    }
    if (fm.pws.value != fm.pws1.value) {
        alert("Mật khẩu nhập lại không đúng!!")
        fm.pws1.focus();
        return false;
    }
    alert("Đăng ký thành công!!");
    return true;
}