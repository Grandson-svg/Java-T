import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Hello {
  
  public static void main(String[] args) throws InterruptedException  
  {
  ;


   
List<Integer>nums = Arrays.asList(4,5,7,3,2,6);
Stream<Integer>s1 = nums.stream();
Stream<Integer>s2 = s1.filter(n->n%2==0);
Stream<Integer>s3 = s2.map(n->n*2);
int result = s3.reduce(1,(e,c)->e*c);
System.out.println(result);
                  


// s3.forEach(n->System.out.println(n));

// for(int n: nums)
// System.out.println( n);






   
    


      



      

      
    
  


 
    
     
   
    


    
    
  

    

    
    


 






























    // int num[][] = new int[3][];
    // num[0] = new int[3];
    // num[1] = new int[4];
    // num[2] = new int[2];



    // for(int i =0;i< num.length;i++)
    // {
    //   for(int j=0;j<num[i].length;j++)
    //   {
    //     num[i][j]=(int)(Math.random()*10);
    //   }
    // }
      
    
    // for(int n[] : num)
    // {
    //   for(int m: n)
    //   {
    //     System.out.print(m + " ");
    //   }
    //   System.out.println();
    // }
  }
}