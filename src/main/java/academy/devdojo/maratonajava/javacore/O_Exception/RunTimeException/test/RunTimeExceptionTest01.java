package academy.devdojo.maratonajava.javacore.O_Exception.RunTimeException.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {

        //Checked (Classe->Exception) e Unchecked (Classe->RunTimeException)

        // NullPointerException
        //Object obj = null;
        //System.out.println(obj.toString());

        // ArrayIndexOutofBoundsException
        int[] nums = {1, 2};
        System.out.println(nums[2]);

    }

}
