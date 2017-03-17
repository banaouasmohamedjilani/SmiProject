var myApp = angular.module("myApp", ['datatables']);

myApp.controller("myController", function ($scope,$http) {
   $scope.dtOptions = {responsive : true}
    $scope.newUser = {};
    $scope.users = [];
    $scope.isdisabled= true;
    $scope.checkVide = function(){
        console.log($scope.users.length + "222");
        if ($scope.users.length > 0){
            $scope.isdisabled=false;
            return false;
        }
        return true;
        
    };
    
   $scope.edit =function(index){
     console.log($scope.users[index]+"index");
     $scope.index = index;
       
   };
        console.log($scope.users.length+"111");
        console.log($scope.users);
    $http.get("https://jsonplaceholder.typicode.com/users").then(function(response){
        $scope.objects = response.data;
      console.log($scope.objects);
  });
  $scope.index = null;
    $scope.save = function () {
        if (($scope.newUser.Typepiece != null) && ($scope.newUser.Numero != null) && ($scope.newUser.DatePiece != null              ) && ($scope.newUser.Nom != null) && ($scope.newUser.Adresse != null) && ($scope.newUser.Qualite != null                ) && ($scope.newUser.Etat != null)){
            if($scope.index === null){
        $scope.users.push($scope.newUser);
        console.log($scope.users.length);
        
    }
            else {
                $scope.users[$scope.index]= $scope.newUser ;
            }
            $scope.index = null ;
    };
    
    
    };
   
    $scope.reset= function (){
        $scope.newUser ={};
    };
    
     
     $scope.delete = function (index) {
         console.log($scope.users.length+"333");
        $scope.users.splice(index, 1);
        $scope.reset();
    };
    });
    
//    $http.get("http://169.254.223.24:1111/STB_Serveur/ref/allDeviseQ").then(function(response){
//       
//        $scope.list = response.data;
//        console.log($scope.list);
//    });
myApp.controller("myctrl1",function($scope,$http){
        
        $http.get("https://jsonplaceholder.typicode.com/users").then(function(response){
        $scope.objects = response.data;
      console.log($scope.objects);
    });
    
});
myApp.controller("myctrl2",function($scope,$http){
        
        $http.get("https://jsonplaceholder.typicode.com/users").then(function(response){
        $scope.objects = response.data;
      console.log($scope.objects);
        
    });
    
});
