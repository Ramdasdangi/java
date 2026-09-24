import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.file.*;

public class csvTOexcel {
    public static void main(String[] args) {

        try (
                BufferedReader br = Files.newBufferedReader(Paths.get("student.txt"));
                Workbook workbook = new XSSFWorkbook();
                FileOutputStream fos = new FileOutputStream("student.xlsx")
        ) {

            Sheet sheet = workbook.createSheet("Sheet1");

            String line;
            int rowNum = 0;

            while ((line = br.readLine()) != null) {

                Row row = sheet.createRow(rowNum++);

                String[] values = line.split(",");

                for (int i = 0; i < values.length; i++) {
                    row.createCell(i).setCellValue(values[i]);
                }
            }

            workbook.write(fos);

            System.out.println("CSV converted to XLSX successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
