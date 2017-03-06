var myApp = angular.module("myApp", []);

myApp.controller("myController", function ($scope) {

    console.log("in controller...");
    $scope.newUser = {};
    $scope.users = [];
    $scope.save = function () {
        $scope.users.push($scope.newUser);
        $scope.newUser = {};
        console.log($scope.users);
    };
});
    
//    $http.get("http://169.254.223.24:1111/STB_Serveur/ref/allDeviseQ").then(function(response){
//       
//        $scope.list = response.data;
//        console.log($scope.list);
//    });
myApp.controller("myctrl1",function($scope,$http){
        
        $http.get("http://169.254.223.24:7258/STB_Serveur/ref/allAgence").then(function(response){
        $scope.objects = response.data;
      console.log($scope.objects);
        
    });
    
});
myApp.controller("myctrl2",function($scope,$http){
        
        $http.get("http://169.254.223.24:7258/STB_Serveur/ref/allDeviseQ").then(function(response){
        $scope.objects = response.data;
      console.log($scope.objects);
        
    });
    
});
