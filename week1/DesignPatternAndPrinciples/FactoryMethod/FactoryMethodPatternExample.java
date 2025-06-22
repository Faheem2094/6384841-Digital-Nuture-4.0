package week1.DesignPatternAndPrinciples.FactoryMethod;

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();

        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}