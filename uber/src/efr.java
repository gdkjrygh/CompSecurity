// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.ubercab.client.feature.payment.AddPaymentActivity;
import com.ubercab.rider.realtime.model.MobileMessage;

public final class efr
    implements efj
{

    public efr()
    {
    }

    public final eew a(Context context, MobileMessage mobilemessage, String s)
    {
        context.startActivity(new Intent(context, com/ubercab/client/feature/payment/AddPaymentActivity));
        return (new eex()).a(true).a().a(n.bd).a(mobilemessage.getId()).b();
    }
}
