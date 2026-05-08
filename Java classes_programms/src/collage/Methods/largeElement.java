//no parameter , with return value

package collage.Methods;

public class largeElement {
    int findmax(){
        int arr[]={10,45,22,78,99,1,4};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

    public static void main(String[] arg){
        largeElement ob=new largeElement();
        int o=ob.findmax();
        System.out.println("max is "+o);
    }
}
