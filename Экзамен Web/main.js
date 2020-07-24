/*

//Запрос на сервер
const requestURL = 'http://b2ae410e4ff9.ngrok.io/video'
function sendRequest(){   
    return new Promise((resolve, reject)=>{
const xhr = new XMLHttpRequest();
xhr.open('GET', requestURL)
xhr.onload = () =>{
    console.log(JSON.parse(xhr.response))
}
xhr.onerror=()=>{
    console.log(xhr.response)
}
xhr.send()
})
}
sendRequest('GET', requestURL)
.then(data=> console.log(data)) //получаем массив data  с данными
.catch(err => console.log(err))
*/

console.log("***************")
let data = [];
data =[
    {
        "id": "1",
        "preview": "https://cdn.videvo.net/videvo_files/video/free/2019-05/thumbnails/190404_04_KaninBovec_Drone_001_small.jpg",
        "duration": 27,
        "name": "Flying Over Mountain Ridge",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/video/free/2019-05/small_watermarked/190404_04_KaninBovec_Drone_001_preview.webm",
            "viewCount": 457522,
            "type": "video/webm"
        }
    },
    {
        "id": "2",
        "preview": "https://cdn.videvo.net/videvo_files/video/free/2019-11/thumbnails/190301_1_25_11_small.jpg",
        "duration": 37,
        "name": "Pair of Lionesses Walking Together",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/video/free/2019-11/small_watermarked/190301_1_25_11_preview.webm",
            "viewCount": 463057,
            "type": "video/webm"
        }
    },
    {
        "id": "3",
        "preview": "https://cdn.videvo.net/videvo_files/video/free/2020-03/customThumbnails/200314 - Work Life_Hand Sanitiser_04_4k_003_5e6f75e3c7cb1_small.jpg",
        "duration": 21,
        "name": "Close up of Male Cleaning Hands Using Hand Sanitiser",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/video/free/2020-03/small_watermarked/200314 - Work Life_Hand Sanitiser_04_4k_003_preview.webm",
            "viewCount": 464581,
            "type": "video/webm"
        }
    },
    {
        "id": "4",
        "preview": "https://cdn.videvo.net/videvo_files/video/free/2019-05/thumbnails/190404_04_KaninBovec_Drone_024_small.jpg",
        "duration": 17,
        "name": "Rising Over Forest",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/video/free/2019-05/small_watermarked/190404_04_KaninBovec_Drone_024_preview.webm",
            "viewCount": 457545,
            "type": "video/webm"
        }
    },
    {
        "id": "5",
        "preview": "https://cdn.videvo.net/videvo_files/images/preview_FireworksSlowMotion.jpg",
        "duration": 63,
        "name": "Fireworks in Super Slow Motion",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/converted/2015_08/videos/FireworksSlowMotion.mp447732.mp4",
            "viewCount": 3964,
            "type": "video/mp4"
        }
    },
    {
        "id": "6",
        "preview": "https://cdn.videvo.net/videvo_files/video/free/2019-03/thumbnails/190111_08_BuildingsTraffic_Drone_09_small.jpg",
        "duration": 25,
        "name": "Bangkok Cityscape at Night",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/video/free/2019-03/small_watermarked/190111_08_BuildingsTraffic_Drone_09_preview.webm",
            "viewCount": 456577,
            "type": "video/webm"
        }
    },
    {
        "id": "7",
        "preview": "https://cdn.videvo.net/videvo_files/images/preview_Dolphin.jpg",
        "duration": 5,
        "name": "Dolphin Pod",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/converted/2015_08/videos/Dolphin.mp465245.mp4",
            "viewCount": 4073,
            "type": "video/mp4"
        }
    },
    {
        "id": "8",
        "preview": "https://cdn.videvo.net/videvo_files/images/preview_161021_04_CoffeeShop_RecordPlayer_1080p.jpg",
        "duration": 10,
        "name": "Record Player Playing a Record",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/converted/2016_10/videos/161021_04_CoffeeShop_RecordPlayer_1080p.mp414266.mp4",
            "viewCount": 5454,
            "type": "video/mp4"
        }
    },
    {
        "id": "9",
        "preview": "https://cdn.videvo.net/videvo_files/images/preview_180301_22_Timelapses_01.jpg",
        "duration": 14,
        "name": "Timelapse of Traffic in Downtown Hong Kong",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/converted/2018_03/videos/180301_22_Timelapses_01.mp474036_jw.mp4",
            "viewCount": 7914,
            "type": "video/mp4"
        }
    },
    {
        "id": "10",
        "preview": "https://cdn.videvo.net/videvo_files/video/free/2018-10/thumbnails/motionplaces0045-c007-q001-Oct2018_small.jpg",
        "duration": 11,
        "name": "Floating Lanterns in Night Sky",
        "url": {
            "url": "https://cdn.videvo.net/videvo_files/video/free/2018-10/small_watermarked/motionplaces0045-c007-q001-Oct2018_preview.webm",
            "viewCount": 455461,
            "type": "video/webm"
        }
    }
]
  
//функция для динамического создания блоков див для prewiev
function createPreview(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '500px';
    div.style.height = '300px';
    div.style.backgroundColor = 'red';
    div.style.margin = '15px';
    return div;
}

//функция для динамического создания блоков див для name
function createName(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '400px';
    div.style.height = '30px';
    div.style.backgroundColor = 'green';
    div.style.margin = '15px';
    return div;
}

//функция для динамического создания блоков див для timeVideo
function createTime(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '50px';
    div.style.height = '30px';
    div.style.backgroundColor = 'yellow';
    div.style.margin = '15px';
    return div;
}

function createCard(id){
    var div = document.createElement('div');
    div.id = id;
    div.style.width  = '550px';
    div.style.height = '450px';
    div.style.background = 'grey';
    div.style.margin = '35px';
    div.style.display = 'flex';
    div.style.flexDirection = 'column';
   div.style.alignItems = 'center';
    return div;
}

//Функция создания тега <video>
function createVideo(id){
    var video =document.createElement('video');
    video.id = id;
    video.style.width="250";
    video.style.backgroundColor = 'pink';
    return video;
}

//Функция создания тега <source>
function createSource(src){
    var source = document.createElement('source');
    source.src = src;
    return source;
}

//Вспомогательные массивы
let PREVIEW = [];
let NAME =[];
let TIME =[];
let previewVideo =[];
let PLAY = [];
let playVideo = [];
 
//Динамическое создание блоков div
for(var i =0 ; i < data.length; i++){
    document.body.appendChild(createCard('cardID' + i));
}

for(var i =0 ; i < data.length; i++){
    //document.body.appendChild(createCard('cardID' + i))
    document.getElementById("cardID" +i ).appendChild(createPreview('previewID'+i));
    document.getElementById("cardID" +i ).appendChild(createName('nameID'+i));
    document.getElementById("cardID" +i ).appendChild(createTime('timeID'+i));
    let test;
    }

//Массив с ссылками на видео
let arrVideo = [];
for(i = 0; i < data.length; i++){
    arrVideo [i] = data[i].url.url;
}

//Создание тега video    
document.getElementById("videoPlayer").appendChild(createVideo('videoID')); 

//Запись значений в динамически созданные блоки
for(var i =0 ; i < data.length; i++){
  
    previewVideo[i] = document.getElementById("previewID" + i);
    PREVIEW[i] = document.createElement("img");
    PREVIEW[i].src = data[i].preview;
    previewVideo[i].appendChild( PREVIEW[i]);
  
    NAME[i] =  document.getElementById('nameID' + i);
    NAME[i] .innerText = data[i].name;

    TIME[i] =  document.getElementById('timeID' + i);
    TIME[i] .innerText = data[i].duration;

   /* playVideo[i] = document.getElementById('videoID' + i);
    PLAY[i] = document.createElement("video");
    PLAY[i].src = data[i].url.url;
    playVideo[i].appendChild( PLAY[i]);
   */
     }

  console.log(arrVideo);
  /*
  let video = document.getElementById("video" );
  for(var i =0 ; i < data.length; i++){
  video.setAttribute('src', data[i].url.url)
  //video.src = arrVideo[5];
  }
  
  */

     //всплывающее окно
     let secondWindow = document.getElementById('secondWindow');
     let btn = [];

     for(var i =0 ; i < data.length; i++){
         btn[i] = document.getElementById('previewID' + i);
        }

     let btnClose = document.querySelector('.close');

     for(var i =0 ; i < data.length; i++){
     btn[i].onclick=function(){
        secondWindow.style.display ="block"; 
    //  document.getElementById("videoID").appendChild(createSource(arrVideo[i]));
    }
    document.getElementById("videoID").appendChild(createSource(arrVideo[i])); //Воспроизводится только видео с 0 индексом из массива
    }

    //Закрытие всплывющего окна
    btnClose.onclick = function(){
        secondWindow.style.display ="none";
    }
   
           

     

  
    