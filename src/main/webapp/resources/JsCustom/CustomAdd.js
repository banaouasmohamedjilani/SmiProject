/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
$(document).on('click', '.btnSave', function () {
   val1=$('#val1').val();
  val2=$('#val2').val();
  val3=$('#val3').val();
  val4=$('#val4').val();
  val5=$('#val5').val();
  val6=$('#val6').val();
  val7=$('#val7').val();
    console.log(val1,val2,val3,val4);

  var s = "<tr><td>"+ val1+ "</td><td>"+ val2+ "</td><td>"+ val3+ "</td><td>"+ val4+ "</td><td>"+ val5+ "</td><td>"+ val6+ "</td><td>"+ val7+ "</td></tr>"   ; 
  $("tbody#tabs").append(s);
 

} );