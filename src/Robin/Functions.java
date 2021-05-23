package Robin;

public class Functions {
    private int[] mas;
    private int size;
    private int num;

    public Functions(){}

    public void Function(int[] mas, int size, int num){
        this.mas = mas;
        this.size = size;
        this.num = num;
    }


    public int firstIndexOf(int[] mas, int size, int num){
        int l = 0;
        int ans = 0;
        int r = size - 1;
        while(l <= r){
            int m = (l+r)/2;
            if(mas[m] > num){
                r = m - 1;
            }
            if (mas[m] < num){
                l = m + 1;
            }
            if (mas[m] == num){
                ans = m;
                r = m - 1;
            }
        }
        return ans;
    }

    public int secondIndexOf(int[] mas, int size, int num){
        int l = 0;
        int ans = -1;
        int r = size - 1;
        while(l <= r){
            int m = (l+r)/2;
            if(mas[m] > num){
                r = m - 1;
            }
            if (mas[m] < num){
                l = m + 1;
            }
            if (mas[m] == num){
                ans = m;
                r = m - 1;
            }
        }
        if (ans != -1){
            if(mas[ans + 1] == num){
                return ans + 1;
            }
            else{
                return -1;
            }
        }
        return ans;
    }

    public int lastIndexOf(int[] mas, int size, int num){
        int l = 0;
        int ans = 0;
        int r = size - 1;
        while(l <= r){
            int m = (l+r)/2;
            if(mas[m] > num){
                r = m - 1;
            }
            if (mas[m] < num){
                l = m + 1;
            }
            if (mas[m] == num){
                ans = m;
                l = m + 1;
            }
        }
        return ans;
    }

    private boolean bs(int[] mas, int size,int num, int left, int right){
        int l = left;
        int r = right;
        while(l <= r){
            int m = (l + r) / 2;
            if(mas[m] > num){
                r = m - 1;
            }
            if (mas[m] < num){
                l = m + 1;
            }
            if (mas[m] == num){
                return true;
            }
        }
        return false;
    }

    public boolean has(int[] mas, int size, int sum){
        for(int i = 0; i < size; i++){
            int x = sum - mas[i];
            if (bs(mas, size, x, 0, i - 1)){
                return true;
            }
        }
        return false;
    }

    public boolean hasTriple(int[] mas, int size, int sum){
        for(int i = 0; i < size; i++){
            for(int k = 0; k < i; k++){
                int x = sum - mas[i] - mas[k];
                if (bs(mas, size, x, 0, k - 1)){
                    return true;
                }
            }
        }
        return false;
    }

}

