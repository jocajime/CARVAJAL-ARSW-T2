app = (function (){

    var _module = "js/api.js";
    var map;

    function _updateData(data){
        $("#cname").text("Name: "+data.name);
        $("#ctimezone").text("Timezone: "+data.timezone);
        $("#cweather").text("Weather: "+data.weather.description);
        $("#cclouds").text("Clouds "+data.clouds.all);
        document.getElementById("informacion").style.visibility="visible";
        _initMap(data)
    }

    var markers;
    var bounds;

    function _initMap(data){
        map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: -34.397, lng: 150.644},
            zoom: 8
        });
        plotMarkers(data);
    }

    function plotMarkers(m){
        markers = [];
        bounds = new google.maps.LatLngBounds();

        m.forEach(function (marker) {
            var position = new google.maps.LatLng(marker.coord.lat, marker.coord.lng);

            markers.push(
                new google.maps.Marker({
                    position: position,
                    map: map,
                    animation: google.maps.Animation.DROP
                })
            );

            bounds.extend(position);
        });

        map.fitBounds(bounds);
    }

    return {

        getWeatherByCityName: function (city) {
            $.getScript(_module, function () {
                api.getWeatherByCityName(city, _updateData);
            });
        }
    }

})();