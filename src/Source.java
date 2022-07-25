public class Source {
    public static void main(String[] args) {
    float value = 0.5F;
        System.out.println(isPlural(value));
    }
    public static boolean isPlural(float f){
    return Float.compare(f,1)!=0;
    }
}
