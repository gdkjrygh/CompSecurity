// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.whatsapp.util:
//            a1

final class aa
    implements Comparator
{

    private aa()
    {
    }

    aa(a1 a1)
    {
        this();
    }

    public int a(File file, File file1)
    {
        if (file.lastModified() == file1.lastModified())
        {
            return 0;
        }
        return file.lastModified() >= file1.lastModified() ? 1 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((File)obj, (File)obj1);
    }
}
