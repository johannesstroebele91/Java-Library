package de.hdm_stuttgart.mi.Array;

public class SwitchElementPositions {
    public static void main(String[] args) {
        int[] arr = {2,1,10,3,4};

        if(arr.length == 1)
            System.out.println("return;");
        else {
            int tempFirstElement = arr[0];
            for(int i = 0; i<(arr.length); i++){
                arr[i] = arr[arr.length-i-1];
            }
            arr[arr.length-1] = tempFirstElement;
            System.out.println("arr[0] " + arr[0] + "   arr[1] " + arr[1] + "   arr[2] " + arr[2] + "   arr[3] " + arr[3] + "   arr[4] " + arr[4]);
        }
    }

}
