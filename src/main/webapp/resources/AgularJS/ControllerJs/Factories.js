
//Consommation des services Web : listes déroulantes (à généraliser)
myApp.factory("objectsRetreiver", function ($http, $q, $rootScope) {
    function getAllCompteClient() {
        var url = "http://localhost:7258/SMI_Server/ref/allCompteNPro?noPieceClient=" + $('#noPiecePersonne').val();
        return $http
                .get(url)
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }

    function getBeneficiaireDoss() {
        console.log($rootScope.numDossier);
        return $http
                .get("http://localhost:7258/SMI_Server/ava/getBeneficiaireDoss?numDossier="
                        + $rootScope.numDossier
                        + "&dateDossier=" + $rootScope.dateDossier)
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }

    function getLibTypeDoss() {
        console.log($rootScope.codeAgenceAva);
        return $http
                .get("http://localhost:7258/SMI_Server/ref/oneTypeDossierAva?codeTypeDosAva="
                        + $rootScope.codeTypeDossier)
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }

    function getLibAgence() {
        console.log($rootScope.codeAgenceAva);
        return $http
                .get("http://localhost:7258/SMI_Server/ref/oneAgence?codeBanque="
                        + $('#codeBanque').val()
                        + "&codeAgenceBct=" + $rootScope.codeAgenceAva)
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }

    function getAllModePaiement() {
        return $http
                .get("http://localhost:7258/SMI_Server/ref/allModePaiement")
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }
    
    function getAllAgenceCodeBanque() {
        return $http
                .get("http://localhost:7258/SMI_Server/ref/allAgenceCodeBanque?codeBanque="
                + $('#codeBanque').val())
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }

    function getAllDevise() {
        return $http
                .get("http://localhost:7258/SMI_Server/ref/allDeviseQ")
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }
    
    function getAllPays() {
        return $http
                .get("http://localhost:7258/SMI_Server/ref/allPays")
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }

    function getInfoDossClient() {
        return $http
                .get("http://localhost:7258/SMI_Server/ava/InfoDossClientActif?typePieceClient="
                        + $('#typePiecePersonne').val()
                        + "&noPieceClient=" + $('#noPiecePersonne').val())
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

    function verifExistanceDossActif() {
        return $http
                .get("http://localhost:7258/SMI_Server/ava/verifExistanceDosActif?typePieceClient="
                        + $('#typePiecePersonne').val()
                        + "&noPieceClient=" + $('#noPiecePersonne').val())
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }

    return {
        getAllAgenceCodeBanque:getAllAgenceCodeBanque,
        getAllPays:getAllPays,
        getAllModePaiement: getAllModePaiement,
        getBeneficiaireDoss: getBeneficiaireDoss,
        getAllDevise: getAllDevise,
        getLibTypeDoss: getLibTypeDoss,
        getLibAgence: getLibAgence,
        getInfoDossClient: getInfoDossClient,
        verifExistanceDossActif: verifExistanceDossActif,
        getAllCompteClient: getAllCompteClient,
        getallActivite: getallActivite,
        getAllTypesDossier: getAllTypesDossier,
        getAllAgence: getAllAgence,
        getAllTPiece: getAllTPiece
    };

});