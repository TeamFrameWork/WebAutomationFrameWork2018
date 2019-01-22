package excelReader;

import java.io.IOException;

public class ExcelMainPage {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\farha\\Desktop\\WebAutomationFrameWork2018\\Amazon\\src\\main\\java\\excelReader\\FarhanaExcel.xls";
        excelReaderClass excelReaderClass = new excelReaderClass();
        String[][] data = {};
        data = excelReaderClass.fileReader(path, 0);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.println(data[i][j]);
            }
        }
    }
}
