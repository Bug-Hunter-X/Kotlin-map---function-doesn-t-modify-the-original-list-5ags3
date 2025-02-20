fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1,2,3)
    mutableList.map { it * 2 }
    println(mutableList) //Output: [1,2,3]

    // Modify the list in place:
    val mutableList2 = mutableListOf(1, 2, 3)
    mutableList2.mapTo(mutableList2){it * 2}
    println(mutableList2) // Output: [2, 4, 6]
    
    //Another approach to modify the list in place
    val mutableList3 = mutableListOf(1, 2, 3)
    for(i in mutableList3.indices){
        mutableList3[i] *=2
    }
    println(mutableList3) //Output: [2,4,6]
}