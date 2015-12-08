// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.File;

// Referenced classes of package com.google.common.io:
//            Files

static final class nit> extends nit>
{

    public boolean apply(File file)
    {
        return file.isFile();
    }

    public volatile boolean apply(Object obj)
    {
        return apply((File)obj);
    }

    public String toString()
    {
        return "Files.isFile()";
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
