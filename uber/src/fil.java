// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.share.wechat.ShareActivity;

public final class fil
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private fil(hsr hsr1, hzb hzb1)
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
        return new fil(hsr1, hzb1);
    }

    private void a(ShareActivity shareactivity)
    {
        if (shareactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(shareactivity);
            shareactivity.h = (chp)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((ShareActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!fil.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
