// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import android.database.SQLException;

// Referenced classes of package a.a.a:
//            e

public class d extends SQLException
{

    public d()
    {
    }

    public d(String s)
    {
        super(s);
    }

    public d(String s, Throwable throwable)
    {
        super(s);
        a(throwable);
    }

    protected void a(Throwable throwable)
    {
        try
        {
            initCause(throwable);
            return;
        }
        catch (Throwable throwable1)
        {
            e.b("Could not set initial cause", throwable1);
        }
        e.b("Initial cause is:", throwable);
    }
}
