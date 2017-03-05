///* 
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//    
//$(document).on('click', '.btnSave', function () {
//   val1=$('#val1').val();
//  val2=$('#val2').val();
//  val3=$('#val3').val();
//  val4=$('#val4').val();
//  val5=$('#val5').val();
//  val6=$('#val6').val();
//  val7=$('#val7').val();
//    console.log(val1,val2,val3,val4);
//
//  var s = "<tr><td>"+ val1+ "</td><td>"+ val2+ "</td><td>"+ val3+ "</td><td>"+ val4+ "</td><td>"+ val5+ "</td><td>"+ val6+ "</td><td>"+ val7+ "</td></tr>"   ; 
//  $("tbody#tabs").append(s);
// 
//
//} );
//
//$(document).ready(function() {
    
        
//    $.ajax({
//        url: "http://169.254.223.24:7258/STB-ServerApp/ref/allDeviseQ"
//    }).then(function(data) {
//        console.log(data.message+" aaaaa");
//       $('.greeting-id').append(data.status);
//       $('.greeting-content').append(data.message);
//    });
//var url ="http://169.254.223.24:8080/STB-ServerApp/ref/allDeviseQ";
//crossDomain: true,
//$.getJSON(url, function (data) {
//    console.log(data.message+"aaaa");
//    
////});
//$(document).ready(function() {
//    $.ajax({
//        url: "http://169.254.223.24:7258/Stb-Server-7.0/ref/allDeviseQ"
//    }).then(function(data, status, xhr) {
//        $.each(data,function(i,c){
//            console.log(c.codeDevise);
//        });
//       $('.greeting-id').append(data.codeDevise);
//       $('.greeting-content').append(data.content);
//       console.log(xhr);
//    });
//    });