/* global aze */

var myApp = angular.module("myApp", ['datatables', 'ngCookies']);

myApp.controller("myController", function ($rootScope, $scope, objectsRetreiver, $q, $http, $cookieStore) {
    $scope.newUser = {};
    $scope.users = [];
    $scope.isdisabled = true;
    $scope.index = null;
    $scope.cookie = $cookieStore.get('refOperation');

    objectsRetreiver
            .getAllAgence()
            .then(function (response) {
                $scope.agences = response;
            }).catch(function (message) {
        console.log(message);
    });
    objectsRetreiver
            .getAllCompteClient()
            .then(function (response) {
                $scope.CompteC = response;
            }).catch(function (message) {
        console.log(message);
    });
    objectsRetreiver
            .getAllTPiece()
            .then(function (response) {
                $scope.tpiece = response;
            }).catch(function (message) {
        console.log(message);
    });
    objectsRetreiver
            .getallActivite()
            .then(function (response) {
                $scope.activite = response;
            }).catch(function (message) {
        console.log(message);
    });
    objectsRetreiver
            .getAllTypesDossier()
            .then(function (response) {
                $scope.tdossier = response;
            }).catch(function (message) {
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
                var user = {
                    "beneficiairesMvtPK": {
                        "codeProduitService": 108,
                        "codeOperation": 1,
                        "refOperation": $rootScope.refOperation,
                        "dateOperation": Date.now(),
                        "noPieceBenef": $scope.newUser.noPieceBenef
                    },
                    "numDossier": 2,
                    "uniteOperation": 4
                };
                for (var elem in $scope.newUser) {
                    user[elem] = $scope.newUser[elem];
                }
                $scope.users.push(user);
            } else {

                $scope.users[$scope.index] = $scope.newUser;
                $scope.index = null;
            }
        }
        ;

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

    $rootScope.ava = {};
    var compte = this;
    compte = $scope.compte;
    $scope.filter = function () {
        $rootScope.ava.cleRib = parseInt($scope.compte.substr(0, 2));
        $rootScope.ava.codeAgenceBct = parseInt($scope.compte.substr(2, 3));
        $rootScope.ava.racineCompte = $scope.compte.substr(5, 14);
    };

    $scope.submit = function () {
        $http.get("http://localhost:7258/SMI_Server/ava/getSequence")
                .then(function (response) {
                    $rootScope.refOperation = response.data;
                    for (var i = 0; i < $scope.users.length; i++) {
                        $scope.users[i].beneficiairesMvtPK.refOperation = $rootScope.refOperation;
                        $scope.users[i].codeAgenceAva = $rootScope.ava.codeAgenceAva;
                        $scope.users[i].codeTypeDos = $rootScope.ava.codeTypeDosAva;
                    }
                    ;
                    $rootScope.ava = {
                        "operationsDelegueesMvtPK": {
                            "codeProduitService": 108,
                            "codeOperation": 1,
                            "refOperation": $rootScope.refOperation,
                            "dateOperation": Date.now(),
                            "uniteOperation": 4
                        },
                        "noPieceClient": $('#aze').val(),
                        "codeAgenceAva": $rootScope.ava.codeAgenceAva,
                        "codeTypeDosAva": $rootScope.ava.codeTypeDosAva,
                        "codeActivite": $rootScope.ava.codeActivite,
                        "codeAgenceBct": $rootScope.ava.codeAgenceBct,
                        "cleRib": $rootScope.ava.cleRib,
                        "racineCompte": $rootScope.ava.racineCompte,
                        "dateValidation": Date.now(),
                        "status": "V"
                    };
                    var data1 = {operationsDelegueesMvt: $rootScope.ava, beneficiairesMvts: $scope.users};

                    var urls = "http://localhost:7258/SMI_Server/ava/ouverture";
                    $http({
                        method: 'POST',
                        url: urls,
                        headers: {'Content-Type': 'application/json'},
                        data: angular.toJson(data1)
                    }).then(function () {
                        $cookieStore.put('refOperation', $rootScope.refOperation);
                    });

                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data: aaaaa", e.status);
        });
    };
});

myApp.controller("mcrlt", function ($cookieStore, $scope) {

    $scope.deleteCookie = function () {
        $cookieStore.remove('refOperation');

    };
});
myApp.factory("objectsRetreiver", function ($http, $q) {
    function getAllCompteClient() {
        var url = "http://localhost:7258/SMI_Server/ref/allCompte?noPieceClient=" + $('#aze').val();
        return $http
                .get(url)
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });

    }
    function getAllAgence() {

        return $http
                .get("http://localhost:7258/SMI_Server/ref/allAgence")
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });

    }
    function getAllTPiece() {

        return $http
                .get("http://localhost:7258/SMI_Server/ref/allTPiece")
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });

    }
    function getallActivite() {

        return $http
                .get("http://localhost:7258/SMI_Server/ref/allActivite")
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });

    }


    function getAllTypesDossier() {

        return $http
                .get("http://localhost:7258/SMI_Server/ref/allTypeDossierAva")
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });

    }
    return {
        getAllCompteClient: getAllCompteClient,
        getallActivite: getallActivite,
        getAllTypesDossier: getAllTypesDossier,
        getAllAgence: getAllAgence,
        getAllTPiece: getAllTPiece
    };

});