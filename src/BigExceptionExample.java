import java.io.*;

public class BigExceptionExample {
    /* Никаких throws и связанных с ним падений */
    public static void main(String[] args) {
       /* можно указывать все что угодно,
          если не получится, программа вежливо расскажет,
          что именно пошло не так
        */
        if (copyFileUsingStream("files/utf8.txt",
                "utf-8",
                "files/win1251.txt",
                "windows-1251")) {
            System.out.println("Перекодировка прошла удачно!");
        }

    }

    /* И здесь все удобно, не падает,
   а рассказывает по-русски, почему не получилось */
    private static boolean copyFileUsingStream(String sourceFilename, String sourceEnc,
                                               String destFilename, String destEnc) {

        try (Reader fis = new InputStreamReader(new FileInputStream(new File(sourceFilename)), sourceEnc);
             Writer fos = new OutputStreamWriter(new FileOutputStream(new File(destFilename)), destEnc)) {
            /* все открылось, можно копировать */

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Не удалось открыть файл " + ex.getMessage());
            return false;
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Указана неизвестная кодировка " + ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.out.println("Возникла ошибка при копировании");
            return false;
        }
        return true;
    }
}