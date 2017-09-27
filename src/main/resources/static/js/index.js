
    $("<label>").text("enther any id: ").appendTo($("body"));
    $("<input>").attr({"id":"anyId","type":"text"}).text("input").appendTo ($("body"));
    $("<br>").appendTo($("body"));
    $("<button>").attr("id","DekanInsert").text("DekanInsert").appendTo($("body"));
    $("<button>").attr("id","DekanEdit").text("DekanEdit").appendTo($("body"));
    $("<button>").attr("id","DekanFindAll").text("DekanFindAll").appendTo($("body"));
    $("<button>").attr("id","showPic").text("showPictureId").appendTo($("body"));

    $("<hr>").appendTo($("body"));
    $("h2").text("Teachers").appendTo($("body"));



    $("#showPic").on('click',function () {
        var pictureId = $("#anyId").val();

        $.ajax({

            method : "POST",
            contentType : "application/json",
            url : "dekan/getpicture",
            dataType: 'json',
            data :pictureId,
            success: function(data){

                console.log(data.data);

                $("<a>").attr("href",data.data).text("your picture").appendTo($("body"));

            },
            error:
                function(data){

                    console.log(data.responseText);
                }
        });

    });
    $("#AddPictuare").on('click',function () {
        var form = $('#addpictuare')[0];

        // Create an FormData object
        var data = new FormData(form);

        console.log("form data " + data);

        $.ajax({
            type: 'POST',
            url: 'dekan/addpictuare',
            enctype: 'multipart/form-data',
            contentType: false,
            processData: false,

            data: {file:data},
            success:function(data){
                alert("Profile Picture has been updated successfully");


            },

            error:function(data){
                alert("Profile Picture has not been updated successfully");
            }

        });

    });
    $("#DekanInsert").on('click',function () {

        alert("ok");
        var standart={

            fname:"Norayr",
            lname:"Gharibyan",
            phone:"+37494807718",
            email:"norayr.gharibyan.java@gmail.com",
            addres:"masiv"

        };
        var facultet= {
            name:"programming"

        };

        var dekan={
            standart:standart,
            facultat:facultet
        }

        $.ajax({

            method : "POST",
            contentType : "application/json",
            url : "dekan/insert",
            dataType: 'json',
            data :JSON.stringify(dekan),
            success: function(data){
                console.log(data);
            }
        });

    });
    $("#DekanFindAll").on('click',function () {

        $.ajax({

            method : "POST",
            contentType : "application/json",
            url : "dekan/findall",
            dataType: 'json',
            data :"",
            success: function(data){
                console.log(data);
            }
        });

    });
    $("#DekanEdit").on('click',function () {

        var standart={

            fname:"Saqo",
            lname:"Ghukasyan",
            phone:"+3743245764523",
            email:"s.ghukasyan@gmail.com",
            addres:"masis"

        };
        var facultet= {
            name:"r1"

        };
        var dekan={
            standart:standart,
            facultat:facultet
        };
        var EditDekan={

            id:$("#anyId").val(),
            dekan:dekan
        }
        $.ajax({

            method : "POST",
            contentType : "application/json",
            url : "dekan/edit",
            dataType: 'json',
            data :JSON.stringify(EditDekan),
            success: function(data){
                console.log(data);
            }
        });



    });

////TEACHERS////////

    var teacherDiv= $("<div>").attr("id","TeacherInsertDiv");
        teacherDiv.append( $('<input />', { type: 'checkbox', id: 'cb'+1, value: "programming",name:"facultat"  }).text("programming"));
        teacherDiv.append($("<label>").text("programming"));
        teacherDiv.append($("<br>"));
        teacherDiv.append( $('<input />', { type: 'checkbox', id: 'cb'+2, value: "radio",name:"facultat" }).text("radio"));
        teacherDiv.append($("<label>").text("radio"));
        teacherDiv.append($("<br>"));
        teacherDiv.append( $('<input />', { type: 'checkbox', id: 'cb'+3, value: "fizika",name:"facultat" }).text("fizika"));
        teacherDiv.append($("<label>").text("fizika"));
    teacherDiv.append($("<br>"));

    teacherDiv.appendTo($("body"));
    $("<button>").attr("id","TeacherInsert").text("TeacherInsert").appendTo ($("body"));
    $("<button>").attr("id","TeacherEdit").text("TeacherEdit").appendTo($("body"));
    $("<button>").attr("id","TeacherFindAll").text("TeacherFindAll").appendTo($("body"));


    $("#TeacherInsert").on('click',function () {


        var favorite = [];
        $.each($("input[name='facultat']:checked"), function(){
            favorite.push($(this).val());
        });

        console.log(favorite);




        var standart={

            fname:"Harutyn",
            lname:"Petrosyan",
            phone:"+37494807718",
            email:"s.ghukasyan@gmail.com",
            addres:"masis"

        };

        var NewTeacher={
            facultates:favorite,
            standart:standart
        }
        $.ajax({

            method : "POST",
            contentType : "application/json",
            url : "teacher/insert",
            dataType: 'json',
            data :JSON.stringify(NewTeacher) ,
            success: function(data){
                console.log(data);
            }
        });



    });
        $("#TeacherEdit").on('click',function(){
        var teacherId= $("#anyId").val();
        var newFavorite=[];
        console.log(teacherId);

        $.each($("input[name='facultat']:checked"), function(){
            newFavorite.push($(this).val());
        });

        var standart={

            fname:"Karen",
            lname:"Kirakosyan",
            phone:"+374094625545",
            email:"k.Kirakosyan@gmail.com",
            addres:"kvartal"

        };
        var NewTeacher={
            id:teacherId,
            facultates:newFavorite,
            standart:standart
        }
            $.ajax({

                method : "POST",
                contentType : "application/json",
                url : "teacher/edit",
                dataType: 'json',
                data :JSON.stringify(NewTeacher) ,
                success: function(data){
                    console.log(data);
                }
            });


    });