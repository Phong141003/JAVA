public class bai1_5{
    public static void main(String[] args) {
        if(args.length>0) {
            System.out.print("Doi so dong lenh duoc truyen vao");
            for(int i=0;i<args.length;i++){
                System.out.println("Doi so"+i+"="+args[i]);
            }
        }
        else
            System.out.println("Doi so khong duoc truyen");
    }
}