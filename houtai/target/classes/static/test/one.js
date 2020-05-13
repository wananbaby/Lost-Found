window.onload =function () {
    //<li>
    // 	<h1 id="miaoshu_1">hhh</h1>
    // 	<img src="" width="80%" id="img_1" class="img_bu">
    //</li>

    // var spanId="span_"+Math.floor(Math.random()*100000000);
    // var inputId="input_"+Math.floor(Math.random()*100000000);
    // var addTab="<button  style='margin-left:10px;margin-bottom:10px;' class='btn btn-default btn-style indexBtn checked'>"+
    //     "<span  id="+spanId+"></span>"+
    //     "<input id="+inputId+" value='请为当前配置文件命名'  style='border:none;width: 153px;color: black;'  onchange='changeConfNames(this);' /></button>";
    // $("#buttonDivTab").append(addTab);

    lihiimg = "<li><h1></h1><img></li>";
    liimg = "";
    h1_="h1_1";
    ig = "img_1";
    sr = '../img/640.jpg';
    cl = 'img_bu';
    wi = '80%';
    //lihiimg0 = "<li><h1></h1><img></li>";
    //lihiimg1 = "<li><h1 id="+h1_+">abcde</h1>"+"<img id="+ig+"+">" + "</li>";
    lihiimg2 = "<li><h1 id="+h1_+">abcde</h1>"+"<img src="+sr+" width="+wi+" id="+ig+" class="+cl+">" + "</li>";
    // liimg = liimg+lihiimg1;
    alert(lihiimg2);
    $("#ulid").append(lihiimg2);
    // $("img_1").src = "../img/640.jpg";

    // lihiimg = lihiimg + lihiimg0;
    // document.getElementById("ulid").innerHTML = lihiimg1;
    // document.getElementById("uiid").innerHTML = liimg;
    // document.getElementById("h1_1").innerText = "ojbk";
    // document.getElementById("img_1").src = "../img/640.jpg"

}