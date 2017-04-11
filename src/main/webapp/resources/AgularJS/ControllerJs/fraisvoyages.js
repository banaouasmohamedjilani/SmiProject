/*
 * Frais de voyages
 */
myApp.controller("fraisVoyage", function ($rootScope, $scope, $http, objectsRetreiver, $filter) {

    //info sur le dossier Actif
    objectsRetreiver
            .getInfoDossClient()
            .then(function (response) {
                $scope.InfoDos = response;
                $rootScope.codeAgenceAva = response.data[0].operationsDelegueesPK.codeAgenceAva;
                $rootScope.codeTypeDossier = response.data[0].codeTypeDosAva;
                $rootScope.numDossier = response.data[0].operationsDelegueesPK.numDossier;
                console.log($rootScope.numDossier);
                $rootScope.dateDossier = $filter('date')(response.data[0].operationsDelegueesPK.dateDossier, 'MM/dd/yyyy');
                console.log($rootScope.dateDossier);
                objectsRetreiver
                        .getLibAgence()
                        .then(function (response) {
                            $scope.LibAgence = response.data.libAgence;
                        }).catch(function (message) {
                    console.log(message);
                });
                objectsRetreiver
                        .getLibTypeDoss()
                        .then(function (response) {
                            $scope.LibTypeDossAva = response.data.libTypeDosAva;
                    console.log($scope.LibTypeDossAva);
                        }).catch(function (message) {
                    console.log(message);
                });
                objectsRetreiver
                        .getAllModePaiement()
                        .then(function (response) {
                            $scope.modePaie = response.data;
                        }).catch(function (message) {
                    console.log(message);
                });
                objectsRetreiver
                        .getAllPays()
                        .then(function (response) {
                            $scope.pays = response.data;
                        }).catch(function (message) {
                    console.log(message);
                });
                objectsRetreiver
                        .getBeneficiaireDoss()
                        .then(function (response) {
                            $scope.benefDoss = response.data;
                            console.log($scope.benefDoss);
                        }).catch(function (message) {
                    console.log(message);
                });
                objectsRetreiver
                        .getAllDevise()
                        .then(function (response) {
                            $scope.allDevise = response.data;
                        }).catch(function (message) {
                    console.log(message);
                });
                objectsRetreiver
                        .getAllAgenceCodeBanque()
                        .then(function (response) {
                            $scope.allAgenceCodeBanque = response.data;
                        }).catch(function (message) {
                    console.log(message);
                });
            }).catch(function (message) {
        console.log(message);
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


