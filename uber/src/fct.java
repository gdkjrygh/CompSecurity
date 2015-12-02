// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.receipt.MealReceiptActivity;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.TripPendingRating;

public final class fct
    implements ide
{

    final MealReceiptActivity a;

    private fct(MealReceiptActivity mealreceiptactivity)
    {
        a = mealreceiptactivity;
        super();
    }

    public fct(MealReceiptActivity mealreceiptactivity, byte byte0)
    {
        this(mealreceiptactivity);
    }

    private void a(ClientStatus clientstatus)
    {
        clientstatus = clientstatus.getTripPendingRating();
        if (clientstatus == null)
        {
            a.setResult(-1);
            a.finish();
        } else
        if (!MealReceiptActivity.b(a))
        {
            if (!TextUtils.isEmpty(clientstatus.getId()) && a.j == null)
            {
                a.j = clientstatus.getId();
            }
            MealReceiptActivity.a(a, clientstatus);
            return;
        }
    }

    public final void call(Object obj)
    {
        a((ClientStatus)obj);
    }
}
