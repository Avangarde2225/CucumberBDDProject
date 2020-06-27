package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class readExcel {
    public static String getData(String excelPath, String sheetName, String whichRow) {

        String path = ReadProperties.getData(excelPath);

        FileInputStream instream = null;

        try {
            instream = new FileInputStream(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Workbook workbook = null;

        try {
            workbook = WorkbookFactory.create(instream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Sheet sheet = workbook.getSheet(sheetName);

        Row row;

        Cell cell;

        int maxRow = sheet.getPhysicalNumberOfRows();
        System.out.println(maxRow);

        for (int i = 0; i < maxRow; i++) {
            row = sheet.getRow(i);

            int cellCount  = row.getLastCellNum();

            System.out.println(cellCount);

            cell = row.getCell(0);

            if(cell.equals(whichRow)){

            }
        }

        return "";
    }

}
