package excelReader;

/*import com.google.common.collect.Table;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class excelReaderClass {
    HSSFWorkbook wb =null;
    HSSFSheet sheet=null;
    Table.Cell cell =null ;
    FileOutputStream fio=null;
    int numberOfRows,numberOfCol,rowNum;
    public String [][] fileReader(String path ,int sheetIndex) throws IOException {
        String [][] data ={};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        wb =new HSSFWorkbook(fis);
        sheet=wb.getSheetAt(sheetIndex);
        numberOfRows =sheet.getLastRowNum();
        numberOfCol=sheet.getRow(0).getLastCellNum();
        data =new String[numberOfRows+1][numberOfCol];

        for (int i=0;i<data.length;i++){
            HSSFRow rows = sheet.getRow(i);
            for(int j=0;j<numberOfCol;j++){
                HSSFCell cell =rows.getCell(j);
                String cellData=getCellValue(cell);
                data[i][j]=cellData;

            }

        }
        return data;

    }
    public String getCellValue(HSSFCell cell ){
        Object value =null;
        int dataType=cell.getCellType();
        switch (dataType){
            case HSSFCell.CELL_TYPE_NUMERIC:
                value=cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_STRING:
                value=cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:
                value=cell.getBooleanCellValue();
                break;
        }
        return value.toString();
    }
}*/
