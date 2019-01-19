package excelReader;

import java.io.IOException;

public class ExcelMainPage {
    public  static void main (String [] args ) throws IOException {
        String path="/Users/mohammadsharif/IdeaProjects/WebAutomationFrameWork2018/Twitter/src/main/java/excelReader/File1.xls";
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
