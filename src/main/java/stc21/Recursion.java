package stc21;
/**
 * @author Ilsur Chubarkin
 * EJB file
 *  class Recursion
 */
import javax.ejb.Stateless;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
@Stateless
public class Recursion {
    /**
     * @param file текущая директроия
     * @return ArrayList список файлов и директорий, включая вложенные.
     */
    public List<String> showFiles(File file)
    {
        List<String> fileList = new ArrayList<>();
        File[] folders = file.listFiles();
        System.out.println(Arrays.toString(folders));
        for (File entry : folders)
        {
            if (entry.isDirectory())
            {
               fileList.add(entry.toString());
                showFiles(entry);
                continue;
            }
            fileList.add(entry.toString());
        }
        return fileList;
    }

    }


