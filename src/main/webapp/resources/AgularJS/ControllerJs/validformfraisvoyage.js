var vform = angular.module("myForm",[]);

vform.controller('vform', function($scope) {
   
    
   $scope.checkErr = function(startDate,endDate) {
       console.log("aaaa");
        $scope.errMessage = "";
        var curDate = new Date();
        console.log(curDate);
        
        if(startDate > endDate){
          $scope.errMessage = "End Date should be greater than start date";
          return false;
        }
        if(startDate < curDate){
           $scope.errMessage = 'Start date should not be before today.';
           return false;
        }
    };
    
});
