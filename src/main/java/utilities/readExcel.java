package utilities;

import java.io.FileInputStream;

public class readExcel {
    public String getData(String excelPath) {

        String path = ReadProperties.getData(excelPath);

        try {
            FileInputStream instream = new FileInputStream(path);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }


        return "a";
    }

}
