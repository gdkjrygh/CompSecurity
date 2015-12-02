// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;

public final class dfw
    implements hst
{

    static final boolean a;
    private final dfq b;

    private dfw(dfq dfq1)
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
        return new dfw(dfq1);
    }

    private Application b()
    {
        Application application = b.a();
        if (application == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return application;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dfw.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
