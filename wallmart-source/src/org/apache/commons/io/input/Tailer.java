// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

// Referenced classes of package org.apache.commons.io.input:
//            TailerListener

public class Tailer
    implements Runnable
{

    private static final int DEFAULT_BUFSIZE = 4096;
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final long delayMillis;
    private final boolean end;
    private final File file;
    private final byte inbuf[];
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;

    public Tailer(File file1, TailerListener tailerlistener)
    {
        this(file1, tailerlistener, 1000L);
    }

    public Tailer(File file1, TailerListener tailerlistener, long l)
    {
        this(file1, tailerlistener, l, false);
    }

    public Tailer(File file1, TailerListener tailerlistener, long l, boolean flag)
    {
        this(file1, tailerlistener, l, flag, 4096);
    }

    public Tailer(File file1, TailerListener tailerlistener, long l, boolean flag, int i)
    {
        this(file1, tailerlistener, l, flag, false, i);
    }

    public Tailer(File file1, TailerListener tailerlistener, long l, boolean flag, boolean flag1)
    {
        this(file1, tailerlistener, l, flag, flag1, 4096);
    }

    public Tailer(File file1, TailerListener tailerlistener, long l, boolean flag, boolean flag1, int i)
    {
        run = true;
        file = file1;
        delayMillis = l;
        end = flag;
        inbuf = new byte[i];
        listener = tailerlistener;
        tailerlistener.init(this);
        reOpen = flag1;
    }

    public static Tailer create(File file1, TailerListener tailerlistener)
    {
        return create(file1, tailerlistener, 1000L, false);
    }

    public static Tailer create(File file1, TailerListener tailerlistener, long l)
    {
        return create(file1, tailerlistener, l, false);
    }

    public static Tailer create(File file1, TailerListener tailerlistener, long l, boolean flag)
    {
        return create(file1, tailerlistener, l, flag, 4096);
    }

    public static Tailer create(File file1, TailerListener tailerlistener, long l, boolean flag, int i)
    {
        file1 = new Tailer(file1, tailerlistener, l, flag, i);
        tailerlistener = new Thread(file1);
        tailerlistener.setDaemon(true);
        tailerlistener.start();
        return file1;
    }

    public static Tailer create(File file1, TailerListener tailerlistener, long l, boolean flag, boolean flag1)
    {
        return create(file1, tailerlistener, l, flag, flag1, 4096);
    }

    public static Tailer create(File file1, TailerListener tailerlistener, long l, boolean flag, boolean flag1, int i)
    {
        file1 = new Tailer(file1, tailerlistener, l, flag, flag1, i);
        tailerlistener = new Thread(file1);
        tailerlistener.setDaemon(true);
        tailerlistener.start();
        return file1;
    }

    private long readLines(RandomAccessFile randomaccessfile)
        throws IOException
    {
        StringBuilder stringbuilder;
        boolean flag;
        long l;
        long l1;
        stringbuilder = new StringBuilder();
        l1 = randomaccessfile.getFilePointer();
        l = l1;
        flag = false;
_L5:
        int i;
        int j;
        if (!run)
        {
            break; /* Loop/switch isn't completed */
        }
        j = randomaccessfile.read(inbuf);
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        byte byte0 = inbuf[i];
        switch (byte0)
        {
        case 11: // '\013'
        case 12: // '\f'
        default:
            boolean flag1 = flag;
            if (flag)
            {
                flag1 = false;
                listener.handle(stringbuilder.toString());
                stringbuilder.setLength(0);
                l = (long)i + l1 + 1L;
            }
            stringbuilder.append((char)byte0);
            flag = flag1;
            break;

        case 10: // '\n'
            break; /* Loop/switch isn't completed */

        case 13: // '\r'
            break MISSING_BLOCK_LABEL_187;
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        flag = false;
        listener.handle(stringbuilder.toString());
        stringbuilder.setLength(0);
        l = (long)i + l1 + 1L;
          goto _L3
        if (flag)
        {
            stringbuilder.append('\r');
        }
        flag = true;
          goto _L3
        l1 = randomaccessfile.getFilePointer();
        if (true) goto _L5; else goto _L4
_L4:
        randomaccessfile.seek(l);
        return l;
    }

    public long getDelay()
    {
        return delayMillis;
    }

    public File getFile()
    {
        return file;
    }

    public void run()
    {
        Object obj2;
        long l1;
        long l2;
        l1 = 0L;
        l2 = 0L;
        obj2 = null;
_L1:
        Object obj3;
        Object obj4;
        obj3 = obj2;
        obj4 = obj2;
        boolean flag = run;
        Object obj;
        long l;
        long l3;
        l3 = l1;
        l = l2;
        obj = obj2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        l3 = l1;
        l = l2;
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj3 = obj2;
        obj4 = obj2;
        obj = new RandomAccessFile(file, "r");
_L2:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj2 = obj;
        obj3 = obj;
        Thread.sleep(delayMillis);
        obj2 = obj;
          goto _L1
        obj;
        obj3 = obj2;
        obj4 = obj2;
        listener.fileNotFound();
        obj = obj2;
          goto _L2
        obj2;
        obj2 = obj;
          goto _L1
        obj2 = obj;
        obj3 = obj;
        if (!end)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        obj2 = obj;
        obj3 = obj;
        l2 = file.length();
_L3:
        obj2 = obj;
        obj3 = obj;
        l1 = System.currentTimeMillis();
        obj2 = obj;
        obj3 = obj;
        ((RandomAccessFile) (obj)).seek(l2);
        obj2 = obj;
          goto _L1
        l2 = 0L;
          goto _L3
_L8:
        obj3 = obj;
        obj4 = obj;
        if (!run) goto _L5; else goto _L4
_L4:
        obj3 = obj;
        obj4 = obj;
        flag = FileUtils.isFileNewer(file, l3);
        obj3 = obj;
        obj4 = obj;
        l1 = file.length();
        if (l1 >= l) goto _L7; else goto _L6
_L6:
        obj3 = obj;
        obj4 = obj;
        listener.fileRotated();
        obj3 = obj;
        obj4 = obj;
        RandomAccessFile randomaccessfile = new RandomAccessFile(file, "r");
        l = 0L;
        obj2 = randomaccessfile;
        obj3 = randomaccessfile;
        IOUtils.closeQuietly(((java.io.Closeable) (obj)));
        obj = randomaccessfile;
          goto _L8
        obj2;
_L18:
        obj2 = obj;
        obj3 = obj;
        listener.fileNotFound();
          goto _L8
_L7:
        if (l1 <= l) goto _L10; else goto _L9
_L9:
        obj3 = obj;
        obj4 = obj;
        l = readLines(((RandomAccessFile) (obj)));
        obj3 = obj;
        obj4 = obj;
        l1 = System.currentTimeMillis();
_L12:
        obj3 = obj;
        obj4 = obj;
        if (!reOpen)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        obj3 = obj;
        obj4 = obj;
        IOUtils.closeQuietly(((java.io.Closeable) (obj)));
        obj3 = obj;
        obj4 = obj;
        Thread.sleep(delayMillis);
_L17:
        obj3 = obj;
        obj4 = obj;
        if (!run)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        obj3 = obj;
        obj4 = obj;
        if (!reOpen)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        obj3 = obj;
        obj4 = obj;
        obj = new RandomAccessFile(file, "r");
        obj2 = obj;
        obj3 = obj;
        ((RandomAccessFile) (obj)).seek(l);
        l3 = l1;
          goto _L8
_L10:
        l1 = l3;
        if (!flag) goto _L12; else goto _L11
_L11:
        obj3 = obj;
        obj4 = obj;
        ((RandomAccessFile) (obj)).seek(0L);
        obj3 = obj;
        obj4 = obj;
        l = readLines(((RandomAccessFile) (obj)));
        obj3 = obj;
        obj4 = obj;
        l1 = System.currentTimeMillis();
          goto _L12
_L5:
        IOUtils.closeQuietly(((java.io.Closeable) (obj)));
        return;
        Object obj1;
        obj1;
_L16:
        obj2 = obj3;
        listener.handle(((Exception) (obj1)));
        IOUtils.closeQuietly(((java.io.Closeable) (obj3)));
        return;
        obj1;
        obj2 = obj4;
_L14:
        IOUtils.closeQuietly(((java.io.Closeable) (obj2)));
        throw obj1;
        obj1;
        if (true) goto _L14; else goto _L13
_L13:
        obj1;
        if (true) goto _L16; else goto _L15
_L15:
        InterruptedException interruptedexception;
        interruptedexception;
          goto _L17
        obj1;
        obj1 = randomaccessfile;
          goto _L18
    }

    public void stop()
    {
        run = false;
    }
}
