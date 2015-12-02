// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.receipt.ReceiptFragment;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.TripPendingRating;

public final class fdg
    implements ide
{

    final ReceiptFragment a;

    private fdg(ReceiptFragment receiptfragment)
    {
        a = receiptfragment;
        super();
    }

    public fdg(ReceiptFragment receiptfragment, byte byte0)
    {
        this(receiptfragment);
    }

    private void a(fdh fdh1)
    {
        com.ubercab.rider.realtime.model.Client client = fdh1.a;
        fdh1 = (ClientStatus)fdh1.b.d();
        if (ReceiptFragment.a(a) != null)
        {
            ReceiptFragment.a(a, ReceiptFragment.a(a));
        } else
        {
            if (fdh1 == null)
            {
                fdh1 = null;
            } else
            {
                fdh1 = fdh1.getTripPendingRating();
            }
            if (client != null && fdh1 != null && !TextUtils.isEmpty(fdh1.getId()))
            {
                ReceiptFragment.a(a, client, fdh1);
                return;
            }
        }
    }

    public final void call(Object obj)
    {
        a((fdh)obj);
    }
}
