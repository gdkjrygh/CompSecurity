// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStorage

public class QueueFileEventStorage
    implements EventsStorage
{

    private final Context context;
    private QueueFile queueFile;
    private File targetDirectory;
    private final String targetDirectoryName;
    private final File workingDirectory;
    private final File workingFile;

    public QueueFileEventStorage(Context context1, File file, String s, String s1)
        throws IOException
    {
        context = context1;
        workingDirectory = file;
        targetDirectoryName = s1;
        workingFile = new File(workingDirectory, s);
        queueFile = new QueueFile(workingFile);
        createTargetDirectory();
    }

    private void createTargetDirectory()
    {
        targetDirectory = new File(workingDirectory, targetDirectoryName);
        if (!targetDirectory.exists())
        {
            targetDirectory.mkdirs();
        }
    }

    private void move(File file, File file1)
        throws IOException
    {
        File file2;
        Object obj1;
        Object obj2;
        obj2 = null;
        file2 = null;
        obj1 = null;
        Object obj = new FileInputStream(file);
        file2 = obj2;
        file1 = getMoveOutputStream(file1);
        file2 = file1;
        CommonUtils.copyStream(((java.io.InputStream) (obj)), file1, new byte[1024]);
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close file input stream");
        CommonUtils.closeOrLog(file1, "Failed to close output stream");
        file.delete();
        return;
        obj;
        file1 = obj1;
_L2:
        CommonUtils.closeOrLog(file1, "Failed to close file input stream");
        CommonUtils.closeOrLog(file2, "Failed to close output stream");
        file.delete();
        throw obj;
        Exception exception;
        exception;
        file1 = ((File) (obj));
        obj = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void add(byte abyte0[])
        throws IOException
    {
        queueFile.add(abyte0);
    }

    public boolean canWorkingFileStore(int i, int j)
    {
        return queueFile.hasSpaceFor(i, j);
    }

    public void deleteFilesInRollOverDirectory(List list)
    {
        File file;
        for (list = list.iterator(); list.hasNext(); file.delete())
        {
            file = (File)list.next();
            CommonUtils.logControlled(context, String.format("deleting sent analytics file %s", new Object[] {
                file.getName()
            }));
        }

    }

    public void deleteWorkingFile()
    {
        try
        {
            queueFile.close();
        }
        catch (IOException ioexception) { }
        workingFile.delete();
    }

    public List getAllFilesInRollOverDirectory()
    {
        return Arrays.asList(targetDirectory.listFiles());
    }

    public List getBatchOfFilesToSend(int i)
    {
        ArrayList arraylist = new ArrayList();
        File afile[] = targetDirectory.listFiles();
        int k = afile.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    arraylist.add(afile[j]);
                    if (arraylist.size() < i)
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            j++;
        } while (true);
    }

    public OutputStream getMoveOutputStream(File file)
        throws IOException
    {
        return new FileOutputStream(file);
    }

    public File getRollOverDirectory()
    {
        return targetDirectory;
    }

    public File getWorkingDirectory()
    {
        return workingDirectory;
    }

    public int getWorkingFileUsedSizeInBytes()
    {
        return queueFile.usedBytes();
    }

    public boolean isWorkingFileEmpty()
    {
        return queueFile.isEmpty();
    }

    public void rollOver(String s)
        throws IOException
    {
        queueFile.close();
        move(workingFile, new File(targetDirectory, s));
        queueFile = new QueueFile(workingFile);
    }
}
