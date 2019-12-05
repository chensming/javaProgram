//泛型方法示例


public class Test{
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"Alice","Bob", "Jack","Stack"};

        Test.<Integer>print(integers);
        Test.<String>print(strings);
    }

    public static <E> void print(E[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }
}