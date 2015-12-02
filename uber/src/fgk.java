// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.settings.AccountPictureActivity;

public final class fgk
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private fgk(hsr hsr1, hzb hzb1)
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
        return new fgk(hsr1, hzb1);
    }

    private void a(AccountPictureActivity accountpictureactivity)
    {
        if (accountpictureactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(accountpictureactivity);
            accountpictureactivity.h = (gmg)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((AccountPictureActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!fgk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
