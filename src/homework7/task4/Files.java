package homework7.task4;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Files {
    public static void main(String[] args) {
        File newDir = new File("src/newDir");
        boolean success = newDir.mkdir();
        if(success){
            System.out.println("Directory is created!");
        }
        String forFile1 = "Test for File1";
        String forFile2 = "Test for File2";
        String forFile3 = "Test for File3";

        File file1 = new File(newDir,"File1.txt");
        File file2 = new File(newDir,"File2.txt");
        try (FileOutputStream fos1 = new FileOutputStream(file1);
             FileOutputStream fos2 = new FileOutputStream(file2);
             FileOutputStream fos3 = new FileOutputStream("src/newDir/File3.txt")) {
            byte[] buffer1 = forFile1.getBytes();
            byte[] buffer2 = forFile2.getBytes();
            byte[] buffer3 = forFile3.getBytes();
            fos1.write(buffer1);
            fos2.write(buffer2);
            fos1.write(buffer3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("src/newDir/Output.zip"));
        FileInputStream fis1 = new FileInputStream("src/newDir/File1.txt");
        FileInputStream fis2 = new FileInputStream("src/newDir/File2.txt");
        FileInputStream fis3 = new FileInputStream("src/newDir/File3.txt")){

            ZipEntry entry1 = new ZipEntry("src/newDir/File1.txt");
            ZipEntry entry2 = new ZipEntry("src/newDir/File2.txt");
            ZipEntry entry3 = new ZipEntry("src/newDir/File3.txt");

            zout.putNextEntry(entry1);
            zout.putNextEntry(entry2);
            zout.putNextEntry(entry3);

            byte[] buffer1 = new byte[fis1.available()];
            byte[] buffer2 = new byte[fis2.available()];
            byte[] buffer3 = new byte[fis3.available()];

            fis1.read(buffer1);
            fis2.read(buffer2);
            fis3.read(buffer3);

            zout.write(buffer1);
            zout.write(buffer2);
            zout.write(buffer3);

            zout.closeEntry();
    } catch (IOException e){
            e.printStackTrace();
        }

        File testDir = new File("src/testDir");
        newDir.renameTo(testDir);

        if(testDir.isDirectory()){
            for(File item : testDir.listFiles()){
                System.out.println(item);
                item.delete();
            }
        }
        boolean del = testDir.delete();
        if(del){
            System.out.println("Directory testDir is successfully deleted");
        }
    }
}
