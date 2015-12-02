// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.sms.SmsReceiver;

public final class drm
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;

    private drm(hsr hsr1, hzb hzb1)
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
        return new drm(hsr1, hzb1);
    }

    private void a(SmsReceiver smsreceiver)
    {
        if (smsreceiver == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(smsreceiver);
            smsreceiver.a = (dri)c.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((SmsReceiver)obj);
    }

    static 
    {
        boolean flag;
        if (!drm.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
