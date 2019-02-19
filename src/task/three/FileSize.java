/**Дан общий размер файла в байтах (размер задаётся в виде целого числа).
 * Разработайте программу, которая вычисляет, сколько это килобайтов, мегабайтов
 *         и т.д.
 */

package task.three;

public class FileSize {
    public static void main(String[] args) {

        int fileSizeInBytes=55786543;
        fileSizeInKiloBytes(fileSizeInBytes);
        fileSizeInMegaBytes(fileSizeInBytes);
            }

    private static void fileSizeInKiloBytes(int fileSizeInBytes) {
        System.out.printf("\n%d bytes is %.3f in Kilobytes\n", fileSizeInBytes, (double)fileSizeInBytes/1024);
    }

    private static void fileSizeInMegaBytes(int fileSizeInBytes) {
        System.out.printf("\n%d bytes is %.6f in Megabytes\n", fileSizeInBytes, (double)fileSizeInBytes/(1024*1024));
    }
}
