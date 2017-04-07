/*
 * Frais de voyages
 */	
myApp.controller("myCntrl", function ($scope,$http) {		
		
$http.get("https://jsonplaceholder.typicode.com/users").then(function(response){		
        $scope.objects = response.data;		
       console.log($scope.objects);		
   });		
   $http.get("https://jsonplaceholder.typicode.com/users?id=1").then(function(response){		
         $scope.Obbj = response.data;		
         		
       console.log($scope.Obbj);		
  });		
     $scope.checkErr = function (startDate, endDate) {		
         console.log("aaaa");		
         $scope.errMessage = "";		
         var curDate = new Date();		
        console.log(curDate);		
 		
        if (startDate > endDate) {		
            $scope.errMessage = "End Date should be greater than start date";		
             angular.element('#endDate').css('background-color', 'pink');		
             return false;		
         }		
         if (startDate < curDate.setDate(curDate.getDate() - 1)) {		
             $scope.errMessage = 'Start date should not be before today.';		
             angular.element('#startDate').css('background-color', 'pink');		
             return false;		
         }		
         angular.element('#startDate').css('background-color', 'lightgreen');		
         angular.element('#endDate').css('background-color', 'lightgreen');		
         return true;		
     };		
 		
 });		
 		
 		
