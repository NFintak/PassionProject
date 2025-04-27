const API_URL = 'http://localhost:8080';

function fetchLevelSelection() {
    fetch(`${API_URL}/level_selection`)
    .then(res => {
    return res.json();
    })
    .then(data => {
        show(data);
    })
    .catch(error => {
    errm = `Error message : ${error}`
    console.log(errm);
    document.getElementById('level').innerHTML = errm;
    });
}

function show(info) {

    const ul = document.getElementById('level');
    const list = document.createDocumentFragment();

    info.map(function (levelSelection) {
        console.log('Levels:', levelSelection);
        let li = document.createElement('li');
        let name = document.createElement('p');
        let desc = document.createElement('p');
        name.innerHTML = `<a href="./location.html?id=1"> ${levelSelection.levelName}</a>`;
        desc.innerHTML = `${levelSelection.desc}`;

        li.appendChild(name);
        li.appendChild(desc);
        list.appendChild(li);

        });

    ul.appendChild(list);
}

fetchLevelSelection();