package org.example.dsa.dequy


// input : abc
// output : abc, acb, bac, bca, cab, cba

fun CharArray.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

fun printPermutationsHelper(chars: CharArray, index: Int) {
    // Dieu kien dung (Base Case)
    if (index == chars.size) {

        print("${String(chars)} ")
        return
    }

    // Thu tat ca cac ky tu (Try all possibilities)
    for (i in index until chars.size) {
        // Hoa doi (Swap)
        chars.swap(index, i)

        // Goi de quy (Recurse)
        printPermutationsHelper(chars, index + 1)

        // Hoan tra (Backtrack - Undo the swap)

        chars.swap(index, i)
    }
}

// 3. The Main Wrapper Function (The "Manager")
fun printPermutations(str: String) {
    print("Các hoán vị của \"$str\": ")

    val chars = str.toCharArray()

    printPermutationsHelper(chars, 0)

}

// Usage
fun main() {
    printPermutations("ABC")
}