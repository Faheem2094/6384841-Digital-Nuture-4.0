package week1.DataStructuresAndAlgorithms.ECommerceSearch;

public class Product implements Comparable<Product> {
    int id;
    String name;
    String category;

    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return "Product { ID = " + id + ", Name = " + name + ", Category = " + category + " }";
    }
}

