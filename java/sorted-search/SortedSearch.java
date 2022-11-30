public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        int start = 0;
        int end = sortedArray.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (sortedArray[mid] < lessThan) {
                if (mid < sortedArray.length - 1 && sortedArray[mid + 1] < lessThan) {
                    start = mid + 1;
                    continue;
                } else {
                    return mid + 1;
                }
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
        //System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 4, 5, 6, 7, 8 ,10, 18, 54 }, 17));
        //System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 4, 5, 6, 7, 8 ,10, 18, 54 }, 50));
        //System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 4, 5, 6, 7, 8 ,10, 18, 54 }, 54));
    }
}