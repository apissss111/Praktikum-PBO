const API_BOOTH = "http://localhost:8080/admin/booth";
const API_RESERVASI = "http://localhost:8080/admin/reservasi";

function loadBooth() {

    fetch(API_BOOTH)
    .then(r => r.json())
    .then(data => {

        let html = "";

        data.forEach(b => {
            html += `
                <div style="border:1px solid #ccc;padding:10px;margin:10px 0;">
                    <p><b>ID:</b> ${b.id}</p>
                    <p><b>Nama:</b> ${b.nama}</p>
                    <p><b>Lokasi:</b> ${b.lokasi}</p>
                    <p><b>Harga:</b> Rp ${b.harga}</p>

                    <button onclick="hapusBooth(${b.id})">Hapus</button>
                </div>
            `;
        });

        document.getElementById("hasil").innerHTML = html;
    });
}


// TAMBAH BOOTH
document.getElementById("booth-form").addEventListener("submit", function(e) {
    e.preventDefault();

    fetch(API_BOOTH, {
        method: "POST",
        headers: {"Content-Type":"application/json"},
        body: JSON.stringify({
            nama: namaBooth.value,
            lokasi: lokasi.value,
            harga: Number(harga.value)
        })
    })
    .then(() => {
        loadBooth();
        alert("Booth berhasil ditambahkan");
        document.getElementById("booth-form").reset();
    });
});


// DELETE BOOTH
function hapusBooth(id) {

    fetch(API_BOOTH + "/" + id, {
        method: "DELETE"
    })
    .then(() => {
        loadBooth();
        loadRiwayat();
    });
}


// RIWAYAT
function loadRiwayat() {

    Promise.all([
        fetch(API_RESERVASI).then(r => r.json()),
        fetch(API_BOOTH).then(r => r.json())
    ])
    .then(([res, booth]) => {

        let html = "";

        res.forEach(r => {

            let b = booth.find(x => x.id === r.boothId);

            html += `
                <div>
                    <p>User: ${r.username}</p>
                    <p>Booth: ${b ? b.nama : "-"}</p>
                    <p>Tanggal: ${r.tanggal}</p>
                </div>
            `;
        });

        document.getElementById("riwayat").innerHTML = html;
    });
}

loadBooth();
loadRiwayat();