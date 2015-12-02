// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.PaytmOtpFragment;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.ui.TextView;

public final class eue
    implements ide
{

    final PaytmOtpFragment a;

    private eue(PaytmOtpFragment paytmotpfragment)
    {
        a = paytmotpfragment;
        super();
    }

    public eue(PaytmOtpFragment paytmotpfragment, byte byte0)
    {
        this(paytmotpfragment);
    }

    private void a(Client client)
    {
        a.mTextViewOtpAddresses.setText(client.getMobile());
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
