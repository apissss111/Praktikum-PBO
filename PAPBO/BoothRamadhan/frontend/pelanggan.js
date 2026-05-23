const API_BOOTH = "http://localhost:8080/admin/booth";
const API_RESERVASI = "http://localhost:8080/pelanggan/reservasi";

function loadBooth() {

    fetch(API_BOOTH)
    .then(r => r.json())
    .then(data => {

        let html = "";
        let opt = "";

        data.forEach(b => {

            html += `<p>${b.nama} - ${b.lokasi}</p>`;
            opt += `<option value="${b.id}">${b.nama}</option>`;
        });

        listBooth.innerHTML = html;
        boothSelect.innerHTML = opt;
    });
}

function pesan() {

    const username = namaUser.value;

    fetch(API_RESERVASI, {
        method: "POST",
        headers: {"Content-Type":"application/json"},
        body: JSON.stringify({
            username,
            boothId: Number(boothSelect.value),
            tanggal: tanggal.value
        })
    })
    .then(r => r.text())
    .then(msg => {

        alert(msg);

        loadRiwayat(username); 
    });
}

function loadRiwayat(username) {

    fetch(API_RESERVASI + "/" + username)
        .then(r => r.json())
        .then(data => {

            let html = "";

            if (!data || data.length === 0) {
                html = "<p>Belum ada pemesanan</p>";
            } else {

                data.forEach(r => {

                    html += `
                        <div style="border:1px solid #ccc;padding:10px;margin:10px 0;">
                            <p><b>ID Booth:</b> ${r.boothId}</p>
                            <p><b>Username:</b> ${r.username}</p>
                            <p><b>Tanggal:</b> ${r.tanggal}</p>
                        </div>
                    `;
                });
            }

            document.getElementById("riwayat").innerHTML = html;
        });
}

loadBooth();