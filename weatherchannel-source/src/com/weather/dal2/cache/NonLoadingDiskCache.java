// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.cache;

import android.content.Context;
import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.weather.dal2.cache:
//            FileNameUtils

public class NonLoadingDiskCache
{

    private static final String TAG = "NonLoadingDiskCache";
    private final File dir = initCacheFolder();
    private final int expiration;
    private final String id;
    private final int maxSize;

    private NonLoadingDiskCache(int i, int j, String s)
        throws IOException
    {
        maxSize = i;
        expiration = j;
        id = s;
    }

    private void clean()
    {
        File afile[] = dir.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                deleteIfExpired(afile[i]);
            }

        }
    }

    private static void deleteIfExpired(File file)
    {
        if (FileNameUtils.isCachedFile(file.getName()))
        {
            int i = FileNameUtils.extractExpirationTime(file.getName());
            if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()) >= (long)i)
            {
                FileUtils.delete(file);
            }
        }
    }

    private File getFileFromKey(String s)
    {
        File afile[] = dir.listFiles();
        if (afile != null) goto _L2; else goto _L1
_L1:
        File file = null;
_L6:
        return file;
_L2:
        int i;
        int j;
        j = afile.length;
        i = 0;
_L7:
        if (i >= j) goto _L4; else goto _L3
_L3:
        File file1;
        file1 = afile[i];
        if (!FileNameUtils.isCachedFile(file1.getName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        file = file1;
        if (FileNameUtils.hasKey(file1, s)) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        return null;
    }

    private File initCacheFolder()
        throws IOException
    {
        Object obj = AbstractTwcApplication.getRootContext().getCacheDir();
        if (obj == null)
        {
            EventLog.e("NonLoadingDiskCache", "Unable to get cache dir.");
            throw new IOException("Unable to get cache dir.");
        }
        obj = new File(((File) (obj)), (new StringBuilder()).append("NON_LOADING_CACHE_").append(id).toString());
        if (!((File) (obj)).exists() && !((File) (obj)).mkdirs())
        {
            obj = (new StringBuilder()).append("Unable to create dir at:").append(((File) (obj)).getPath()).toString();
            EventLog.e("NonLoadingDiskCache", ((String) (obj)));
            throw new IOException(((String) (obj)));
        } else
        {
            return ((File) (obj));
        }
    }

    public static NonLoadingDiskCache open(int i, int j, String s)
        throws IOException
    {
        com/weather/dal2/cache/NonLoadingDiskCache;
        JVM INSTR monitorenter ;
        s = new NonLoadingDiskCache(i, j, s);
        com/weather/dal2/cache/NonLoadingDiskCache;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private void removeOldest()
    {
        File afile[] = dir.listFiles();
        if (afile != null && afile.length >= maxSize)
        {
            FileUtils.delete(afile[0]);
        }
    }

    public void clear(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = getFileFromKey(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        FileUtils.delete(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public String get(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        clean();
        obj = getFileFromKey(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = Files.toString(((File) (obj)), Charsets.UTF_8);
        s = ((String) (obj));
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
        IOException ioexception;
        ioexception;
        EventLog.w("NonLoadingDiskCache", (new StringBuilder()).append("Failed to get:").append(s).append(": ").append(ioexception).toString());
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void put(String s, CharSequence charsequence)
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        File afile[];
        s1 = FileNameUtils.createFileName(expiration, s);
        afile = dir.listFiles();
        if (afile == null) goto _L2; else goto _L1
_L1:
        int j = afile.length;
        int i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L3
_L3:
        File file = afile[i];
        if (FileNameUtils.isCachedFile(file.getName()))
        {
            deleteIfExpired(file);
            if (FileNameUtils.hasKey(file, s))
            {
                FileUtils.delete(file);
            }
        }
          goto _L4
_L2:
        removeOldest();
        Files.write(charsequence, new File(dir, s1), Charsets.UTF_8);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
        charsequence;
        EventLog.w("NonLoadingDiskCache", (new StringBuilder()).append("Failed to put:").append(s).append(": ").append(charsequence).toString());
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
_L4:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
