// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.cache;

import android.content.Context;
import android.os.Environment;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.FileUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.weather.dal2.cache:
//            FileNameUtils, FileCache

public class FileCaches
{

    private static final Collection CACHES = new CopyOnWriteArrayList();
    public static final FileCaches INSTANCE = new FileCaches();
    private static final String TAG = "FileCaches";

    public FileCaches()
    {
    }

    public static void clearFiles(File file)
    {
        if (file != null && file.exists() && file.isDirectory()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((file = file.listFiles()) != null)
        {
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                File file1 = file[i];
                if (!file1.isDirectory() && FileNameUtils.isCachedFile(file1.getName()))
                {
                    FileUtils.delete(file1);
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    void add(FileCache filecache)
    {
        for (Iterator iterator = CACHES.iterator(); iterator.hasNext();)
        {
            FileCache filecache1 = (FileCache)iterator.next();
            if (filecache.getCacheId().equals(filecache1.getCacheId()))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate cacheId:").append(filecache.getCacheId()).toString());
            }
        }

        CACHES.add(filecache);
    }

    void cleanup()
    {
        int i = 0;
        for (Iterator iterator = CACHES.iterator(); iterator.hasNext();)
        {
            i += ((FileCache)iterator.next()).cleanup();
        }

        LogUtil.d("FileCaches", LoggingMetaTags.TWC_DAL_CACHE, "cleanup - Total files kept: %d", new Object[] {
            Integer.valueOf(i)
        });
    }

    void clearOldCacheDirectories()
    {
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            clearFiles(FileUtils.getExternalAppDir());
            clearFiles(FileUtils.getExternalCacheDir());
        }
        clearFiles(AbstractTwcApplication.getRootContext().getFilesDir());
        clearFiles(AbstractTwcApplication.getRootContext().getCacheDir());
    }

    void invalidateAllCaches()
    {
        com/weather/dal2/cache/FileCache;
        JVM INSTR monitorenter ;
        for (Iterator iterator = CACHES.iterator(); iterator.hasNext(); ((FileCache)iterator.next()).invalidateAll()) { }
        break MISSING_BLOCK_LABEL_42;
        Exception exception;
        exception;
        com/weather/dal2/cache/FileCache;
        JVM INSTR monitorexit ;
        throw exception;
        com/weather/dal2/cache/FileCache;
        JVM INSTR monitorexit ;
    }

    void remove(FileCache filecache)
    {
        CACHES.remove(filecache);
    }

}
