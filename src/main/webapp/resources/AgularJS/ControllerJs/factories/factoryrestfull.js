//var myApp = angular.module("myApp",['objectsRetreiverProvider']);
//        myApp.factory("objectsRetreiver", function($http, $q){
//    function getAllObjects(){
//        
//   return $http
//            .get("https://jsonplaceholder.typicode.com/users")
//            .then(function (response) {
//                console.log("suceesss");
//        return response.data;
//
//    }).catch (function(e){
//        $q.reject("sorry , we can't retrieve data:" , e.status);
//    }) ;
//
//    }
//    
//    return {
//        
//        getAllObjects : getAllObjects
//    };
//    
//});