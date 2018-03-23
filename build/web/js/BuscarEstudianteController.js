'use strict';

module.controller('BuscarEstudianteCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = [];
        $scope.datosFormulario = {};
        $scope.panelEditar = false;
        $scope.listar = function () {
            $http.get('./webresources/BuscarEstudiante', {})
                    .success(function (data, status, headers, config) {
                        $scope.lista = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };

        $scope.listarCarrera = function () {
            $http.get('./webresources/Carrera', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaCarrera = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de carrera, por favor intente m\xe1s tarde');
            });
        };
        
        $scope.listarCarrera();
        $scope.listarLugarNacimiento = function () {
            $http.get('./webresources/Municipio', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaLugarNacimiento = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de lugarNacimiento, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarLugarNacimiento();
        
//        $scope.listar();
        
        $scope.buscarEstudiante = function (data) {
            $http.get('./webresources/BuscarEstudiante/consulta?nombres='+data, {})
                    .success(function (data, status, headers, config) {
                        $scope.lista = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };

    }]);
