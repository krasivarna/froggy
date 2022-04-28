import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] stones=sc.nextLine().split(", ");
        Lake lake=new Lake(Arrays.stream(stones).map(Integer::parseInt).collect(Collectors.toList()));

        List<String> output= new ArrayList<>();
        Iterator<Integer> frog=lake.iterator();
        while (frog.hasNext()){
            int temp=frog.next();
            output.add(String.valueOf(temp));
        }
        output.stream().forEach(e->System.out.printf(e+", "));
    }
}
