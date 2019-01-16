package excelReader;

import java.io.IOException;

public class ExcelMain {
    public  static void main (String [] args ) throws IOException {
        String path="C:\\Users\\sadia\\IdeaProjects\\WebAutomationFrameWork2018\\NBC\\src\\main\\java\\excelReader\\myFile1.xls";
        ExcelReaderClass excelReaderClass=new ExcelReaderClass();
        String [][] data ={};
        data=excelReaderClass.fileReader(path,0);

        for (int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                System.out.println(data[i][j]);
            }
        }

    }
}
