// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.client.feature.payment.PaymentActivity;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import java.util.ArrayList;

public final class epu
{

    private final Intent a;

    public epu(Context context, String s)
    {
        a = new Intent(context, com/ubercab/client/feature/payment/PaymentActivity);
        a.setAction(s);
    }

    public final Intent a()
    {
        return a;
    }

    public final epu a(TripExpenseInfo tripexpenseinfo)
    {
        a.putExtra("com.ubercab.EXPENSE_INFO", RiderTripExpenseInfo.create(tripexpenseinfo));
        return this;
    }

    public final epu a(dwq dwq1)
    {
        if (dwq1 == null || dwq1.a() == null)
        {
            return this;
        } else
        {
            a.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", dwq1.a());
            return this;
        }
    }

    public final epu a(String s)
    {
        a.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", s);
        return this;
    }

    public final epu a(ArrayList arraylist)
    {
        a.putParcelableArrayListExtra("com.ubercab.UNPAID_BILLS", arraylist);
        return this;
    }

    public final epu a(boolean flag)
    {
        a.putExtra("com.ubercab.SHOW_PROMO", flag);
        return this;
    }

    public final epu b(String s)
    {
        a.putExtra("com.ubercab.client.feature.payment.SELECTED_PROFILE_UUID", s);
        return this;
    }

    public final epu b(boolean flag)
    {
        a.putExtra("com.ubercab.USE_CREDITS", flag);
        return this;
    }

    public final epu c(boolean flag)
    {
        a.putExtra("com.ubercab.USE_POINTS", flag);
        return this;
    }
}
