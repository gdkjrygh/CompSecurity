// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class dfo
    implements hst
{

    static final boolean a;
    private final dfe b;

    private dfo(dfe dfe1)
    {
        if (!a && dfe1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = dfe1;
            return;
        }
    }

    public static hst a(dfe dfe1)
    {
        return new dfo(dfe1);
    }

    private RiderActivity b()
    {
        RiderActivity rideractivity = b.a();
        if (rideractivity == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return rideractivity;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dfo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
