// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.receipt.ReceiptActivity;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.TripPendingRating;

public final class fdc
    implements ide
{

    final ReceiptActivity a;

    private fdc(ReceiptActivity receiptactivity)
    {
        a = receiptactivity;
        super();
    }

    public fdc(ReceiptActivity receiptactivity, byte byte0)
    {
        this(receiptactivity);
    }

    private void a(ClientStatus clientstatus)
    {
        if (clientstatus != null)
        {
            clientstatus = clientstatus.getTripPendingRating();
        } else
        {
            clientstatus = null;
        }
        if (clientstatus == null || TextUtils.isEmpty(clientstatus.getId()))
        {
            a.setResult(-1);
            a.finish();
        }
    }

    public final void call(Object obj)
    {
        a((ClientStatus)obj);
    }
}
