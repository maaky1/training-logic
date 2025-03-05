
# 🏆 Latihan Coding: Pilih Item dengan Rasio Terbaik!

## 🛍 Deskripsi Soal
Kamu adalah seorang analis pasar yang sedang mencari barang terbaik berdasarkan rating dan harga.  
Tugasmu adalah mencari produk terbaik dengan cara membandingkan rasio rating terhadap harga dan mengembalikan indeksnya!

⚡ Aturan:
- Jika ada beberapa produk dengan rasio tertinggi, pilih produk dengan indeks terkecil.

## 📥 Input
Kamu diberikan dua array dengan panjang yang sama:
- prices[] → Harga masing-masing produk.
- ratings[] → Rating produk (dari 1 hingga 5).

💡 Ketentuan:
- 1 ≤ n ≤ 100000 (jumlah produk)
- 1 ≤ prices[i] ≤ 10⁶
- 1 ≤ ratings[i] ≤ 5

## 📤 Output
Sebuah bilangan bulat yang merupakan indeks produk terbaik berdasarkan rasio rating / price.

## 📌 Contoh Kasus
### 🎯 Contoh 1
```java
int[] prices = {7, 5, 2, 11};
int[] ratings = {3, 4, 1, 3};
```

### 💡 Output:
```java
solution(prices, ratings) = 1;
```

### 🔍 Penjelasan:
| Produk | Harga | Rating | Rasio (Rating / Harga) |
|--------|-------|--------|-----------------------|
| 0      | 7     | 3      | 0.43                  |
| 1      | 5     | 4      | 0.80  ✅              |
| 2      | 2     | 1      | 0.50                  |
| 3      | 11    | 3      | 0.27                  |

Produk di indeks 1 memiliki rasio tertinggi (0.80) sehingga itu jawabannya!



### 🎯 Contoh 2
```java
int[] prices = {7, 5, 2, 11};
int[] ratings = {3, 4, 1, 3};
```

### 💡 Output:
```java
solution(prices, ratings) = 1;
```

### 🔍 Penjelasan:
| Produk | Harga | Rating | Rasio (Rating / Harga) |
|--------|-------|--------|-----------------------|
| 0      | 10    | 2      | 0.20                  |
| 1      | 10    | 3      | 0.30  ✅              |
| 2      | 10    | 3      | 0.30                  |
| 3      | 10    | 2      | 0.20                  |

Produk 1 & 2 punya rasio yang sama, tapi karena indeks 1 lebih kecil, maka itu jawabannya!


## 🚀 Cara Penyelesaian
1️⃣ Loop semua produk dalam array.  
2️⃣ Hitung rasio ratings[i] / prices[i] untuk tiap produk.  
3️⃣ Cari rasio terbesar dan simpan indeksnya.  
4️⃣ Jika ada beberapa produk dengan rasio yang sama, ambil indeks terkecil.  
5️⃣ Return indeks produk terbaik!