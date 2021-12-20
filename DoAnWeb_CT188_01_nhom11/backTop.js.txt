$(document).ready(function() {
    $("#btn-back-to-top").hide()
    $(window).scroll(function() {
        if ($(this).scrollTop() >= 100) {
            $("#nav").css({
                "position": "fixed",
                "left": 0,
                "right": 0,
                "top": 0,
                "z-index": 999,
                "opacity": 0.7
            })
        } else {
            $("#nav").css({
                "position": "relative",
                "left": 0,
                "right": 0,
                "z-index": 999,
                "opacity": 1
            })
        }

        if ($(this).scrollTop() >= 200)
            $("#btn-back-to-top").show("slow")
        else $("#btn-back-to-top").hide("slow")
    })
    $("#btn-back-to-top").click(function() {
        $("html,body").animate({
            scrollTop: 0
        }, 1000)
    })
    var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
    var tooltipList = tooltipTriggerList.map(function(tooltipTriggerEl) {
        return new bootstrap.Tooltip(tooltipTriggerEl)
    })
})