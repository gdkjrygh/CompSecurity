// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.notification.NotificationActionReceiver;

public final class ekr
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;

    private ekr(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5)
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
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        } else
        {
            g = hzb5;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5)
    {
        return new ekr(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5);
    }

    private void a(NotificationActionReceiver notificationactionreceiver)
    {
        if (notificationactionreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(notificationactionreceiver);
            notificationactionreceiver.a = (hkr)c.a();
            notificationactionreceiver.b = (dpg)d.a();
            notificationactionreceiver.c = (dkn)e.a();
            notificationactionreceiver.d = (hkm)f.a();
            notificationactionreceiver.e = (eky)g.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((NotificationActionReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!ekr.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
