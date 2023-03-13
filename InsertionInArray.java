public class InsertionInArray {
    public static int[] insertAtIndex(int []array, int index, int element) {
        // declaring variables and array
        int []newArray = new int[array.length + 1];
        int arrayIndex = 0;

        // inserting new element at given index
        for(int i = 0; i < newArray.length; i++) {
            if(i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = array[arrayIndex++];
            }
        }

        // returning new array
        return newArray;
    }
}