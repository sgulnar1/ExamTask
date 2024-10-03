import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 1, 2, 1, 2, 3, 5};
        int duplicateElement = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicateElement++;
                    break;
                }
            }
        }
        System.out.println(duplicateElement);
        int k = 0;
        int[] unique = new int[arr.length - duplicateElement];
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < unique.length; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate)
                unique[k++] = arr[i];
        }
        System.out.println(Arrays.toString(unique));
    }
}
