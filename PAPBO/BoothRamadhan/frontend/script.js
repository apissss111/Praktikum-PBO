const API = "http://localhost:8080/admin";

// LOAD BOOTH
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

// LOAD SELECT
async function loadSelect() {
    const res = await fetch(API + "/booth");
    const data = await res.json();

    let opt = `<option value="">Pilih Booth</option>`;

    data.forEach(b => {
        opt += `<option value="${b.id}">${b.namaBooth}</option>`;
    });

    document.getElementById("pilihBooth").innerHTML = opt;
}

// SUBMIT RESERVASI
document.getElementById("reservation-form").onsubmit = async e => {
    e.preventDefault();

    const nama = document.getElementById("namaPelanggan").value;
    const boothId = document.getElementById("pilihBooth").value;
    const tanggal = document.getElementById("tanggal").value;

    await fetch(API + "/reservasi", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            nama,
            boothId,
            tanggal
        })
    });

    alert("Reservasi berhasil!");
    tampilReservasi();
};

// TAMPIL RESERVASI
async function tampilReservasi() {
    const res = await fetch(API + "/reservasi");
    const data = await res.json();

    let html = "";

    data.forEach(r => {
        html += `
        <div class="reservation-card">
            <h3>${r.nama}</h3>
            <p>Booth ID: ${r.boothId}</p>
            <p>Tanggal: ${r.tanggal}</p>
        </div>
        `;
    });

    document.getElementById("reservationList").innerHTML = html;
}

// INIT
window.onload = () => {
    loadBooth();
    loadSelect();
    tampilReservasi();
};