// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.receipt.EnhancedReceiptDialogFragment;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.TripPendingRating;

public final class fck
    implements ide
{

    final EnhancedReceiptDialogFragment a;

    private fck(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        a = enhancedreceiptdialogfragment;
        super();
    }

    public fck(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, byte byte0)
    {
        this(enhancedreceiptdialogfragment);
    }

    private void a(fcl fcl1)
    {
        com.ubercab.rider.realtime.model.Client client = fcl1.a;
        fcl1 = fcl1.b;
        if (EnhancedReceiptDialogFragment.i(a) != null)
        {
            EnhancedReceiptDialogFragment.a(a, client, EnhancedReceiptDialogFragment.i(a));
            return;
        }
        if (fcl1 == null)
        {
            fcl1 = null;
        } else
        {
            fcl1 = fcl1.getTripPendingRating();
        }
        if (client == null || fcl1 == null || TextUtils.isEmpty(fcl1.getId()))
        {
            a.dismiss();
            return;
        } else
        {
            EnhancedReceiptDialogFragment.a(a, client, fcl1);
            return;
        }
    }

    public final void call(Object obj)
    {
        a((fcl)obj);
    }
}
