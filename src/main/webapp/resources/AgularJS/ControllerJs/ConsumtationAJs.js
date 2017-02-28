var app = angular.module("mApp",[]);
app.controller('mainCtrl',function($scope,$http){
    $http.get('https://www.w3schools.com/angular/customers.php').then(function(response){
        $scope.list = response.data.records;
        console.log(response.data.records);
    });
});
