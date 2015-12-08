// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.go.weatherex.home.b:
//            a

class d
    implements Comparator
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public int a(File file, File file1)
    {
        if (file.lastModified() > file1.lastModified())
        {
            return 1;
        }
        return file.lastModified() != file1.lastModified() ? -1 : 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((File)obj, (File)obj1);
    }
}
