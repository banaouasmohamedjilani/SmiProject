
//Consommation des services Web : listes déroulantes (à généraliser)
myApp.factory("objectsRetreiver", function ($http, $q) {
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
                +"&noPieceClient="+ $('#noPiecePersonne').val())
                .then(function (response) {
                    return response;
                }).catch(function (e) {
            $q.reject("sorry , we can't retrieve data:", e.status);
        });
    }

    return {
        verifExistanceDossActif:verifExistanceDossActif,
        getAllCompteClient: getAllCompteClient,
        getallActivite: getallActivite,
        getAllTypesDossier: getAllTypesDossier,
        getAllAgence: getAllAgence,
        getAllTPiece: getAllTPiece
    };

});