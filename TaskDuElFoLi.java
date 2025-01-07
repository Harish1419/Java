package Allprogram;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class TaskDuElFoLi {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("Unique Elements: " + uniqueNumbers);
    }

}
