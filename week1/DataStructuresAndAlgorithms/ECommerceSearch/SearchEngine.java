package week1.DataStructuresAndAlgorithms.ECommerceSearch;

import java.util.Arrays;

public class SearchEngine {

    public static void main(String[] args) {
        Product[] catalog = {
            new Product(11, "Tablet", "Electronics"),
            new Product(12, "Headphones", "Audio"),
            new Product(13, "Sneakers", "Footwear"),
            new Product(14, "Backpack", "Accessories"),
            new Product(15, "Camera", "Photography")
        };

        System.out.println("LINEAR SEARCH");
        Product resultLinear = findUsingLinearSearch(catalog, "Camera");
        printResult(resultLinear);

        System.out.println("\nBINARY SEARCH");
        sortCatalog(catalog); // Sort before binary search
        Product resultBinary = findUsingBinarySearch(catalog, "Camera");
        printResult(resultBinary);
    }

    static void sortCatalog(Product[] catalog) {
        Arrays.sort(catalog);
    }

    static Product findUsingLinearSearch(Product[] catalog, String name) {
        for (Product item : catalog) {
            if (item.name.equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    static Product findUsingBinarySearch(Product[] catalog, String name) {
        int left = 0, right = catalog.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = catalog[mid].name.compareToIgnoreCase(name);

            if (compare == 0) return catalog[mid];
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    static void printResult(Product product) {
        if (product != null)
            System.out.println("Product Found: " + product);
        else
            System.out.println("Product Not Found.");
    }
}
