
window.onload =function () {

    function _objToStrMap(obj){
        let strMap = new Map();
        for (let k of Object.keys(obj)) {
            strMap.set(k,obj[k]);
        }
        return strMap;
    }
    function _jsonToMap(jsonStr){
        return _objToStrMap(JSON.parse(jsonStr));
    }

    function img_read() {
        var miaoshu = null;
    }
    function demo() {
        $.ajax({
            type:"post",
            url:"https://sczlzys.cn/homepage",
            dataType:"json",
            async:false,
            success:function (data) {
                var d = data.toJSON();
                var sum = d[0].sum;
                var json = {"miaoshu":"","src":""};
                for (i=1;i<sum;i++){
                    var array =d[i];
                    array.push(json);
                }
                //<li>
                // 	<h1 id="miaoshu_1">hhh</h1>
                // 	<img src="" width="80%" id="img_1" class="img_bu">
                //</li>
                // lihiimg = "<li><h1></h1><img></li>";
                // liimg = "";
                // for (i=1;i<sum;i++){
                //
                //     lihiimg0 = "<li><h1></h1><img></li>";
                //     lihiimg1 = "<li><h1 id='h1_"+i+"'></h1><img id='img_"+i+"'></li>";
                //     liimg = liimg+lihiimg1;
                //     lihiimg = lihiimg + lihiimg0;
                // }
                // document.getElementById("ulid").innerHTML = lihiimg1;
                // document.getElementById("uiid").innerHTML = liimg;

                let map = new HashMap();

                sum = 10;
                let classID = "img_bu";
                let widthID = "90";
                let heightID= "80";
                srcID = "../img/no.jpg";
                for (let i = 0;i<sum;i++){
                    let h1ID = "miaoshu_" + i.toString();
                    let imgID= "img_" + i.toString();
                    let h1TEXT = json[i].miaoshu;
                    let srcID = json[i].src;

                    map.put(srcID,h1TEXT);

                    var lihiimg = "<li><h1 id="+h1ID+">"+h1TEXT+"</h1>"+"<img src="+srcID+" width="+widthID+" id="+imgID+" class="+classID+">" + "</li>";
                }


                $("img").on('click',function (e) {
                    var target = $(event.target);

                    if (target.className == "img_bu"){
                        target.href = "particulars.html";
                        var miaoshuID = map.get(target.src);

                        sessionStorage.setItem("miaoshuID",miaoshuID);
                        sessionStorage.setItem("srcID",target.src);


                    }

                })
            }
        })
    }

    function imgRead() {


        var imgReadDTO = {
            miaoshu: null,
            src: null,
            remark: null,
            UserId:null
            // id:null
        };

        var map = new HashMap();


        sessionStorage.setItem("UserName","baby");

        var imgDTO = {
            UserName: sessionStorage.getItem("UserName")
        };
        // var imgRequest = {
        //     ImgDTO: imgDTO
        // };
        var imgRequest = {
            UserName: "baby"
        };

        $.ajax({
            url: "http://localhost:9096/wexin/ImgRequest",
            data: JSON.stringify(imgRequest),
            type: "POST",
            dataType: "json",
            contentType: "application/json; charset=UTF-8",
            success: function (d) {
                const size = d.size;
                // alert(size)// 2
                const ImgMap = d.imgMap;
                var map1 = _objToStrMap(ImgMap)
                // console.log(map1)
                // var miaoshu1 = map1.get("0")
                // console.log(miaoshu1)
                // console.log(miaoshu1.miaoshu)
                // let k = (0).toString()
                // console.log(k)
                // alert(k)
                // var miao = map1.get(k)
                // console.log(miao)
                // var w = JSON.stringify(miao)
                // var m = JSON.parse(w)
                // console.log(m)

                let h1ID = "miaoshu_1";
                let imgID = "img_1";
                let h1TEXT = "hhh";

                let classID = "img_bu";
                let widthID = "60%";
                let HeightID = "80";
                let srcID = "../img/no.jpg";
                for (let i = 0;i<size;i++){
                    let k = (i).toString()
                    let j = map1.get(k);
                    if(j){
                        if (j.miaoshu){
                            imgReadDTO.miaoshu = j.miaoshu;
                            imgReadDTO.src = j.src;
                            imgReadDTO.remark = j.remark;
                            imgReadDTO.UserId = j.UserId;
                            // imgReadDTO.id = j.id
                            map.put(i,imgReadDTO)
                        }
                    }
                        console.log(i)
                        let h1ID = "miaoshu_" + i.toString();
                        let imgID = "img_" + i.toString();

                        let imginformation = map.get(i);
                        let h1TEXT = imginformation.miaoshu;
                        let srcID = imginformation.src;
                        let remarkID = imginformation.remark;
                        let userID = imginformation.UserId;
                        let lihiimg = "<li><h1 id="+h1ID+">"+h1TEXT+"</h1>"+"<img src="+srcID+" width="+widthID+" id="+imgID+" class="+classID+">"+remarkID+"</img>" + "</li>";
                        $("#ulid").append(lihiimg);
                }




                // var jm =0;
                // console.log(map.values())
                // while (map.get(jm)){
                //     console.log(jm)
                //     let h1ID = "miaoshu_" + jm.toString();
                //     let imgID = "img_" + jm.toString();
                //
                //     let imginformation = map.get(jm);
                //     let h1TEXT = imginformation.miaoshu;
                //     let srcID = imginformation.src;
                //     let remarkID = imginformation.remark;
                //     let userID = imginformation.UserId;
                //     let lihiimg = "<li><h1 id="+h1ID+">"+h1TEXT+"</h1>"+"<img src="+srcID+" width="+widthID+" id="+imgID+" class="+classID+">"+remarkID+"</img>" + "</li>";
                //     $("#ulid").append(lihiimg);
                //     jm++;
                // }
            },
            error: function (error) {
                var that = JSON.stringify(error);
                alert(that)
            }
    })

    }

    imgRead();

};