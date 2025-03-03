

public class array {
    public static void linearSearch(int a[], int key){
        boolean found = false;
        int index = 0;
        for (int i = 0; i < a.length; i++){
            if( a[i] == key){
                found = true;
                index = i;
                break;
            } 
        }
        if(found == true){
            System.out.println(" found at index "+ index);
        }else{
            System.out.println("not found");
        }   
    }

    public static void linearSearch(String fruit[], String key1){
        boolean found = false;
        int index = 0;
        for (int i = 0; i < fruit.length; i++){
            if (key1.equals(fruit[i])){
                found = true;
                index = i;
                break;
            }
        }
        if(found == true){
            System.out.println(" found at index "+ index);
        }else{
            System.out.println("not found");
        }   
    }

    public static void min_max(int a[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]){
                min = a[i];
            }

            if (max < a[i]){
                max = a[i];
            }
        }

        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }

    public static int binarySearch(int a[], int key){
        int start = 0, end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == key){
                return mid;
            }else if (a[mid] < key) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int num[]){
        int first = 0, last = num.length-1;

        while (first < last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void pairs(int num[]){
        int totalPairs = 0;
        for(int i = 0; i < num.length; i++){
            int curr = num[i];
            for(int j = i+1; j < num.length; j++){
                System.out.print("("+curr +","+ num[j]+")");
                totalPairs += 1;
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }

    public static void SubArray(int num[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++){
            for(int j = i; j < num.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(num[k] +" ");
                    sum += num[k];
                }
                if (min > sum){
                    min = sum;
                }
                if (max < sum){
                    max = sum;
                }
                System.out.println("sum = "+sum);
                System.out.println();
            }
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
    

    public static void main(String[] args) {
        int[] num = {11,22,-33,44,55, -66, 77,88, -99};
        int key = 99;
        //linearSearch(a, key);

        String fruit[] = {"apple", "banana", "orange"};
        String key1 = "orange"; 
        //linearSearch(fruit, key1);  
        
        // min_max(num);

        // System.out.println("found at index "+binarySearch(num, key));
        
        // reverse(num);

        // pairs(num);
        
        SubArray(num);
    }

}