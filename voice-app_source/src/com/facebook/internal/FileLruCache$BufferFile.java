// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.internal:
//            FileLruCache

private static class _cls2
{

    private static final String FILE_NAME_PREFIX = "buffer";
    private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return !s.startsWith("buffer");
        }

    };
    private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return s.startsWith("buffer");
        }

    };

    static void deleteAll(File file)
    {
        file = file.listFiles(excludeNonBufferFiles());
        if (file == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = file.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        file[i].delete();
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static FilenameFilter excludeBufferFiles()
    {
        return filterExcludeBufferFiles;
    }

    static FilenameFilter excludeNonBufferFiles()
    {
        return filterExcludeNonBufferFiles;
    }

    static File newFile(File file)
    {
        return new File(file, (new StringBuilder("buffer")).append(Long.valueOf(FileLruCache.access$0().incrementAndGet()).toString()).toString());
    }


    private _cls2()
    {
    }
}
