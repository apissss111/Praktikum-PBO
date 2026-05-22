const API = "http://localhost:8080/admin";

// LOAD DATA
async function loadBooth() {
    const res = await fetch(API + "/booth");
    const data = await res.json();

    let html = "";

    data.forEach(b => {
        html += `
        <div class="booth-card">
            <h3>${b.namaBooth}</h3>
            <p>${b.lokasi}</p>
            <p>Rp ${b.harga}</p>
        </div>
        `;
    });

    document.getElementById("hasil").innerHTML = html;
}

// SUBMIT FORM
document.getElementById("booth-form").onsubmit = async e => {
    e.preventDefault();

    const namaBooth = document.getElementById("namaBooth").value;
    const lokasi = document.getElementById("lokasi").value;
    const harga = document.getElementById("harga").value;

    await fetch(API + "/booth", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            namaBooth,
            lokasi,
            harga
        })
    });

    alert("Booth berhasil ditambah!");
    loadBooth();
};

window.onload = loadBooth;