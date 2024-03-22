public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        String[] nums = {"99", "-10", "100123", "18", "-978", "5623", "463", "-9", "287", "49"};
        int a, b;
        int size = 10;

        System.out.print("Array: ");
        for(int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        for(a = 1; a < size; a++)
            for(b = size - 1; b >= a; b--)
            {
                if(nums[b - 1].compareTo(nums[b]) > 0)
                {
                    String t = new String(nums[b - 1]);
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.print("Sort array: ");
        for(int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}

