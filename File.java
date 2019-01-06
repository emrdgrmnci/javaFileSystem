import java.io.File;

public class DirList {

    String dirName = "/Users/aliemredegirmenci/Desktop/JavaFile";
    File f1 = new File(dirName);

    if(f1.isDirectory())
    {
        System.out.print("Directory of" + dirName);
        String s[] = f1.list();

        for (int i = 0; i < s.length; i++) {

            File f = new File(dirName + " /" + s[i]);
            if (f.isDirectory()) {
                System.out.println(s[i] + "is a directory");
            } else {
                System.out.print(s[i] + "is a file");
            }

        }

    } else {

        System.out.print(dirName + "is not a Directory");
    }

}


