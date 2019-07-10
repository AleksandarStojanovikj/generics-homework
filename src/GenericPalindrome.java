import java.util.Arrays;
import java.util.List;

public class GenericPalindrome {
    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(1);
        List<Integer> integerList2 = Arrays.asList(1, 2, 1);
        List<Integer> integerList3 = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> integerList4 = Arrays.asList(1, 2, 3, 4, 1);

        List<String> stringList1 = Arrays.asList("one", "two", "one");
        List<String> stringList2 = Arrays.asList("one", "two", "two", "one");
        List<String> stringList3 = Arrays.asList("one", "two", "three", "one");

        List<User> userList1 = Arrays.asList(new User("John", "admin"),
                new User("george", "user"),
                new User("jane", "user"),
                new User("jo", "admin"));
        List<User> userList2 = Arrays.asList(new User("doe", "user"),
                new User("hunter2", "user"),
                new User("janine", "admin"));

        System.out.println(isPalindrome(integerList1));
        System.out.println(isPalindrome(integerList2));
        System.out.println(isPalindrome(integerList3));
        System.out.println(isPalindrome(integerList4));

        System.out.println(isPalindrome(stringList1));
        System.out.println(isPalindrome(stringList2));
        System.out.println(isPalindrome(stringList3));

        System.out.println(isPalindrome(userList1));
        System.out.println(isPalindrome(userList2));
    }

    public static boolean isPalindrome(List<?> list) {
        System.out.printf("Is %s a palindrome?\n", list);

        int listEnd = list.size() - 1;

        for (int i = 0; i <= listEnd / 2; i++) {
            if (!list.get(i).equals(list.get(listEnd - i))) {
                return false;
            }
        }
        return true;
    }
}
