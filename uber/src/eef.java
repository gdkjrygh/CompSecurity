// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.legal.LegalFragment;

public final class eef
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private eef(hsr hsr1, hzb hzb1)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1)
    {
        return new eef(hsr1, hzb1);
    }

    private void a(LegalFragment legalfragment)
    {
        if (legalfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(legalfragment);
            legalfragment.h = (cev)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((LegalFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!eef.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
