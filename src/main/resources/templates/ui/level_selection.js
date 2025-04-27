const API_URL = `http://localhost:8080`;

function fetchLevelSelection() {
    fetch(`${API_URL}/levelselect`)
    .then(res => {
    return res.json();
    })
    .then(data => {
        console.log(data);
        show(data);
    })
    .catch(error => {
    errm = `Error message : ${error}`
    console.log(errm);
    document.getElementById('level_selection').innerHTML = errm;
    });
}

function show(info) {

    const ul = document.getElementById('level_selection');
    const list = document.createDocumentFragment();

    info.map(function (level) {
        console.log('Level name:', level_selection);
        let li = document.createElement('li');
        let name = document.createElement('p');

    name.innerHTML = `<a href="./location.html?id=1"> ${level.name}</a>`})
    li.appendChild(name)
}

fetchLevelSelection();