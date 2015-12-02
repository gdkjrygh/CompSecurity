// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.NetworkErrorFragment;
import com.ubercab.client.core.app.RiderApplication;

public final class cyr
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;

    private cyr(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        } else
        {
            f = hzb4;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        return new cyr(hsr1, hzb1, hzb2, hzb3, hzb4);
    }

    private void a(NetworkErrorFragment networkerrorfragment)
    {
        if (networkerrorfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(networkerrorfragment);
            networkerrorfragment.a = (dkn)c.a();
            networkerrorfragment.b = (chp)d.a();
            networkerrorfragment.c = (dal)e.a();
            networkerrorfragment.d = (RiderApplication)f.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((NetworkErrorFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!cyr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
