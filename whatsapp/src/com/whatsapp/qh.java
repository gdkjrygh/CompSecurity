// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

// Referenced classes of package com.whatsapp:
//            ir

class qh
    implements ir
{

    File a;

    public qh(File file)
    {
        a = file;
    }

    public String a()
    {
        return a.getName();
    }

    public InputStream b()
    {
        return new FileInputStream(a);
    }

    public long c()
    {
        return a.length();
    }
}
