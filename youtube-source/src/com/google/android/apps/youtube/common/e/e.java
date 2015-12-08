// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import android.os.StatFs;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.File;
import java.io.IOException;

public final class e
{

    public static void a(File file)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(file);
        com.google.android.apps.youtube.common.fromguava.c.a(file.isDirectory());
        File afile[] = file.listFiles();
        if (afile != null)
        {
            int j = afile.length;
            int i = 0;
            while (i < j) 
            {
                File file1 = afile[i];
                if (file1.isDirectory())
                {
                    a(file1);
                } else
                {
                    file1.delete();
                }
                i++;
            }
        }
        file.delete();
    }

    public static final File b(File file)
    {
        Object obj = file.getParent();
        if (obj != null)
        {
            obj = new File(((String) (obj)));
            com.google.android.apps.youtube.common.fromguava.c.a(obj);
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            if (!((File) (obj)).isDirectory())
            {
                throw new IOException((new StringBuilder("Failed to create directory ")).append(((File) (obj)).getPath()).toString());
            }
        }
        return file;
    }

    public static long c(File file)
    {
        if (file == null || !file.exists())
        {
            return 0L;
        } else
        {
            file = new StatFs(file.getAbsolutePath());
            return (long)file.getAvailableBlocks() * (long)file.getBlockSize();
        }
    }
}
