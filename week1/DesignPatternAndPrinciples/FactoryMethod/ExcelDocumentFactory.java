package week1.DesignPatternAndPrinciples.FactoryMethod;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
