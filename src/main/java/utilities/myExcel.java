package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class myExcel {

    public static void main(String[] args) throws IOException {

        String path="src/test/java/excelFiles/releaseNotes.xlsx";

        FileInputStream instream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(instream);

        Sheet sheet = workbook.getSheet("Sheet1");

        Row row = sheet.getRow(0);

        Cell cell = row.getCell(0);

        System.out.println(cell);
    }

}
