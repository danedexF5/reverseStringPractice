//1. Convert the input string into character array by using the toCharArray() built in method of the String Class .
//2. In this method we will scan the character array from both sides , that is from the start index (left) as well as from last index(right) simultaneously.
//3. Set the left index equal to 0 and right index equal to the length of the string -1.
//4. Swap the characters of the start index scanning with the last index scanning  one by one .After that  increase the left index by 1 (left++) and decrease the right by 1 i.e (right--) to move on to the next characters in the character array .
//5. Continue till left is less than or equal to the right .

public class reverseString {
    public static void main(String[] args) {
        String input = "Be in present";
        char[] tempArray = input.toCharArray();
        int left,right=0;
        right = tempArray.length-1;
        for (left=0; left < right ; left++ ,right--)
        {
            // Swap values of left and right
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right]=temp;
        }
        for (char c : tempArray)
            System.out.print(c);
        System.out.println();
    }}


