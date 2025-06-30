package JavaStreamPractice.DSA;

public class DuplicateNoFloydTortoiseHare {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 8};

        int slow=0;
        int fast =0;

        slow=arr[slow];
        fast=arr[arr[fast]];

        while(slow!=fast){
            slow=arr[slow];
            fast=arr[arr[fast]];
        }
        slow=0;

        while (slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        System.out.println(slow);
    }
}

//O(N)....//O(1)