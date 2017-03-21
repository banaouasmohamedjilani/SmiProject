var myApp = angular.module("myApp", ['datatables']);

myApp.controller("myController", function ($scope, objectsRetreiver ) {
    $scope.dtOptions = {responsive: true};
    $scope.newUser = {};
    $scope.users = [];
    $scope.isdisabled = true;
    $scope.index = null;
    objectsRetreiver
            .getAllObjects()
            .then(function(response){
        $scope.objects = response;
            }).catch(function(message){
        console.log(message);
    });
    
    $scope.checkVide = function () {
        if ($scope.users.length > 0) {
            $scope.isdisabled = false;
            return false;
        }
        return true;

    };
    $scope.edit = function (index) {
        $scope.newUser = $scope.users[index];
        $scope.index = index;
        $scope.users[index];
    };
    
    $scope.save = function () {
        if (($scope.newUser.Typepiece !== null) && ($scope.newUser.Numero !== null) && ($scope.newUser.DatePiece !== null) && ($scope.newUser.Nom !== null) && ($scope.newUser.Adresse !== null) && ($scope.newUser.Qualite !== null) && ($scope.newUser.Etat !== null)) {
            if ($scope.index === null) {
                $scope.users.push($scope.newUser);
            } else {
                $scope.users[$scope.index] = $scope.newUser;
                $scope.index = null;
            }

        };

    };
    $scope.reset = function () {
        $scope.newUser = {};
    $scope.index = null;
    };


    $scope.delete = function (index) {
        $scope.users.splice(index, 1);
        $scope.reset();
    $scope.index = null;
    };
    
//    $scope.validModal = function (){
//        if (!(user.type.$valid && !user.type.$pristine) || !(user.Numero.$valid && !user.Numero.$pristine)|| !(user.date.$valid && !user.date.$pristine) || !(user.nom.$valid && !user.nom.$pristine)|| !(user.adresse.$valid && !user.adresse.$pristine)|| !(user.qualite.$valid && !user.qualite.$pristine) || !(user.etat.$valid && !user.etat.$pristine))
//            return true;
//        return false;
//        
//    };
//    $scope.validForm= function (){
//        if (((!(user.agence.$valid && !user.agence.$pristine ))
//                                                || (!(user.code.$valid && !user.code.$pristine ))
//                                        || (!(user.cmp.$valid && !user.cmp.$pristine ))
//                                || (!(user.ac.$valid && !user.ac.$pristine ))) || checkVide())
//        return true; 
//    return false;
//    };
});

//    $http.get("http://169.254.223.24:1111/STB_Serveur/ref/allDeviseQ").then(function(response){
//       
//        $scope.list = response.data;
//        console.log($scope.list);
//    });
//
myApp.factory("objectsRetreiver", function($http, $q){
    function getAllObjects(){
        
   return $http
            .get("https://jsonplaceholder.typicode.com/users")
            .then(function (response) {
        return response;

    }).catch (function(e){
        $q.reject("sorry , we can't retrieve data:" , e.status);
    }) ;

    }
    
    return {
        
        getAllObjects : getAllObjects
    };
    
});