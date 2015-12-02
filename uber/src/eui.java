// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.payment.paytm.PaytmWalletFragment;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;

public final class eui
    implements icg
{

    final PaytmWalletFragment a;

    private eui(PaytmWalletFragment paytmwalletfragment)
    {
        a = paytmwalletfragment;
        super();
    }

    public eui(PaytmWalletFragment paytmwalletfragment, byte byte0)
    {
        this(paytmwalletfragment);
    }

    private void b()
    {
        a.e();
        a.c.a(l.ec);
        if (PaytmWalletFragment.c(a) != null)
        {
            PaytmWalletFragment.c(a).a();
        }
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        b();
    }

    public final void a(Throwable throwable)
    {
        a.e();
        throwable = ((Error)throwable).getRealtimeError();
        if (throwable != null && !TextUtils.isEmpty(throwable.getMessage()))
        {
            a.c(throwable.getMessage());
            return;
        } else
        {
            a.c(a.getString(0x7f070570));
            return;
        }
    }
}
