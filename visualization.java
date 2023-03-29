import javax.swing.JOptionPane;

public class visualization {

    public static void printStars(int[]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                System.out.print(" \033[0;32m*\033[0;37m ");
            }
            System.out.println();
        }
    }

    public static void printCurrentStars(int[]arr, int i, int j){
        for(int k=0;k<arr.length;k++){

            if(k==i || k==j){
                System.out.print(arr[k]+": \033[0;34m");
            }
            else{
                System.out.print(arr[k]+": \033[0;37m");
            }

            for(int l=0; l<arr[k]; l++){
                System.out.print("* ");
            }
            System.out.println("\033[0;37m");
        }
    }

    public static void bubbleSort(int[]arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                try {
                    printCurrentStars(arr, i, j);
                    Thread.sleep(900);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }

        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        printStars(arr);
    }
    public static void main(String[] args) {
        
        String s;

        int size;

        s = JOptionPane.showInputDialog("Enter array size");
        size = Integer.parseInt(s);

        int[]arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            s = JOptionPane.showInputDialog("Enter the element at index["+i+"]");
            arr[i] = Integer.parseInt(s);
        }

        bubbleSort(arr);

        System.out.println();
        
    }
}
