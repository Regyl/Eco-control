var map = null;

function applyFilters(){
	$.ajax({
		type: "POST",
		url: 'filters.php',
		data: $('#filters').serialize(),
		success: function(response){
			var color = 'gray';
			map.geoObjects.removeAll();
			result = JSON.parse(response);
			for (var i = 0; i < result.length; i++) {
				var color = 'gray';
				switch (result[i].organizationType){
					case "LICENSED":
						color = 'green';
						break;
					case "LEGAL_ORGANIZATION":
						color = 'orange';
						break;
					case "POTENTIAL_DANGER":
						color = 'red';
						break;
					default:
				}
				var myPlacemark = new ymaps.Placemark([result[i].location.latitude, result[i].location.longitude], {
					hintContent: result[i].name,
					balloonContent: '<b>' + result[i].name + '</b><br>' + result[i].address,
				},{
					preset: 'islands#dotIcon',
					iconColor: color
				});
				map.geoObjects.add(myPlacemark);
			}
		}
	});
}

$(".searchBar").on('keyup', function (e) {
	if (e.key === 'Enter' || e.keyCode === 13) {
		
	}
});

function search(){
	$.ajax({
		type: "POST",
		url: 'search.php',
		data: $('#search').serialize(),
		success: function(data){
			console.log(data);
		}
	});
}

$(document).ready(function() {
	ymaps.ready(init);
	function init() {
		var myMap = new ymaps.Map("map", {
			center: [55.182465, 61.341370],
			zoom: 12,
			controls: [
				'zoomControl', // Ползунок масштаба
				'rulerControl', // Линейка
				'routeButtonControl', // Панель маршрутизации
				//'trafficControl', // Пробки
				'typeSelector', // Переключатель слоев карты
				'fullscreenControl', // Полноэкранный режим
				new ymaps.control.SearchControl({
					options: {
						size: 'large',
						provider: 'yandex#search'
					}
				})
			]
		});

		map = myMap;

		jQuery.get("http://hackathon/inquiry.php", function (response) {		
			result = JSON.parse(response);
			for (var i = 0; i < result.length; i++) {
				var color = 'gray';
				switch (result[i].organizationType){
					case "LICENSED":
						color = 'green';
						break;
					case "LEGAL_ORGANIZATION":
						color = 'orange';
						break;
					case "POTENTIAL_DANGER":
						color = 'red';
						break;
					default:
				}
				var myPlacemark = new ymaps.Placemark([result[i].location.latitude, result[i].location.longitude], {
					hintContent: result[i].name,
					balloonContent: '<b>' + result[i].name + '</b><br>' + result[i].address,
				},{
					preset: 'islands#dotIcon',
					iconColor: color
				});
				myMap.geoObjects.add(myPlacemark);
			}
		});
	}

});
