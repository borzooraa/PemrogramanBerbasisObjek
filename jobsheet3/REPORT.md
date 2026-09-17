|  | Pemrograman Berbasis Web |
|--|--|
| NIM |  254107020229|
| Nama | Nurfakiyah Rahmadhani |
| Kelas | TI - 2G |
| Repository | https://github.com/borzooraa/PemrogramanBerbasisObjek |

# JOBSHEET 3 # ENKAPSULASI
Pada jobsheet ini mempraktekkan enkapsulasi (information hiding) pada program. Serta untuk memahami beberapa konsep, seperti konsep: Konstruktor, Akses Modifier, Atribut/method Pada Class, Instansiasi Atribut/Method, Setter dan Getter, dannjuga memahami notasi pada UML Class Diagram

## 3. PERCOBAAN
### 3.1 Percobaan 1 - Enkapsulasi
Untuk hasil runningnya bisa di lihat di bawah ini:

![Screenshot](img/running_p1.png)

Pada percobaan kali ini, ada beberapa informasi yang masih belum di sembunyikan, contohnya di atribut utama dan atribut internal yang menyebabkan hasil running menjadi sedikit janggal.  Kejanggalannya ada di bagian kecepoatan yang tiba-tiba berubah dari 0 ke 50, sementara kontaknya masih Off.

### 3.2 Percobaan 2 -Access Modifier
Hasil running pada percobaan 2 bisa di lihat di bawah ini:

![Screenshot](img/running_p2.png)

Pada percobaan kali ini, atribut utama (kecepatan dan kontakOn) diubah menjadi private, kemudian ditambahkan method-method lain dangan akses modif public. Sehingga pengguna hanya bisa mengakses method saja tanpa perlu mengutak atik kecepatan ataupun kontakOn.

### 3.3 Pertanyaan
1. Hal ini dikarenakan default value dari kontakOn adalah false, dan hanya akan berubah menjadi true ketika memanggil atau menggunakan method nyalakanMesin().
2. Agar atribut tersebut tidak bisa di akses dan diganti nilainya dengan sembarangan oleh pengguna. Jadi pengguna hanya bisa mengakses atribut tersebut secara tidak langsung lewat method yang telah ada.
3. 


