document.getElementById('createFile').addEventListener('click', () => {
    const path = document.getElementById('filePath').value;
    const content = document.getElementById('fileContent').value;
    fetch('/api/files', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ path, content })
    })
        .then(response => response.json())
        .then(data => document.getElementById('outputContent').textContent = JSON.stringify(data, null, 2));
});

document.getElementById('readFile').addEventListener('click', () => {
    const path = document.getElementById('filePath').value;
    fetch(`/api/files?path=${encodeURIComponent(path)}`)
        .then(response => response.json())
        .then(data => document.getElementById('outputContent').textContent = data.content);
});

document.getElementById('deleteFile').addEventListener('click', () => {
    const path = document.getElementById('filePath').value;
    fetch(`/api/files?path=${encodeURIComponent(path)}`, {
        method: 'DELETE'
    })
        .then(response => response.json())
        .then(data => document.getElementById('outputContent').textContent = JSON.stringify(data, null, 2));
});

document.getElementById('createDir').addEventListener('click', () => {
    const path = document.getElementById('dirPath').value;
    fetch('/api/directories', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ path })
    })
        .then(response => response.json())
        .then(data => document.getElementById('outputContent').textContent = JSON.stringify(data, null, 2));
});

document.getElementById('deleteDir').addEventListener('click', () => {
    const path = document.getElementById('dirPath').value;
    fetch(`/api/directories?path=${encodeURIComponent(path)}`, {
        method: 'DELETE'
    })
        .then(response => response.json())
        .then(data => document.getElementById('outputContent').textContent = JSON.stringify(data, null, 2));
});
