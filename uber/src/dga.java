// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;

public final class dga
    implements hst
{

    static final boolean a;
    private final dfq b;

    private dga(dfq dfq1)
    {
        if (!a && dfq1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = dfq1;
            return;
        }
    }

    public static hst a(dfq dfq1)
    {
        return new dga(dfq1);
    }

    private ContentResolver b()
    {
        return b.j();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dga.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
