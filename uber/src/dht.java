// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderApplication;

public final class dht
    implements hst
{

    static final boolean a;
    private final dfq b;

    private dht(dfq dfq1)
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
        return new dht(dfq1);
    }

    private RiderApplication b()
    {
        RiderApplication riderapplication = b.b();
        if (riderapplication == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return riderapplication;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dht.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
