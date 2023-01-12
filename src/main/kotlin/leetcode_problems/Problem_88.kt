package leetcode_problems

fun main() {
    merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
    merge(intArrayOf(0), 0, intArrayOf(1), 1)
}

// 1, 2, 3, 0, 0, 6
// 1, 2, 2, 3, 5, 6

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var i = m - 1
    var j = n - 1
    var idx = m + n - 1

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[idx] = nums1[i]
            i--
        } else {
            nums1[idx] = nums2[j]
            j--
        }
        idx--
    }

    while (i >= 0) {
        nums1[idx] = nums1[i]
        i--
        idx--
    }

    while (j >= 0) {
        nums1[idx] = nums2[j]
        j--
        idx--
    }

    println(nums1.toList())
}