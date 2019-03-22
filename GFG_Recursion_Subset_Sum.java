import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class GFG_Recursion_Subset_Sum {
    
    
    public static void SubSet_Sum(List<Integer> list, int pos, int add, int arr[])
    {
        if(pos==arr.length)
        {
            list.add(add);
            return ;
        }
        SubSet_Sum(list,pos+1,add+arr[pos],arr);
        SubSet_Sum(list,pos+1,add,arr);
    }

    public static void main(String[] args)throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int tc = Integer.parseInt(br.readLine());
       while(tc-->0)
       {
           int N = Integer.parseInt(br.readLine());
           String line = br.readLine();
           String s[] = line.trim().split("\\s+");
           int i = 0;
           int arr[] = new int[N];
           for(;i<N;i++)
               arr[i] = Integer.parseInt(s[i]);
           List<Integer> list = new ArrayList<>();
           SubSet_Sum(list,0,0,arr);
           Collections.sort(list);
           for(int a : list)
               System.out.print(a+" ");
           System.out.println();
       }
    }
    
}
