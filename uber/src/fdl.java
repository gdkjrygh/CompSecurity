// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.payment.PayNowActivity;
import com.ubercab.client.feature.receipt.EnhancedReceiptDialogFragment;
import com.ubercab.client.feature.receipt.ReceiptActivity;
import com.ubercab.rider.realtime.model.Client;
import java.util.ArrayList;
import java.util.List;

public final class fdl
{

    private final djw a;
    private final hkr b;
    private final gmg c;
    private final doa d;
    private final RiderActivity e;
    private boolean f;

    public fdl(djw djw1, hkr hkr1, RiderActivity rideractivity, doa doa1, gmg gmg1)
    {
        a = djw1;
        b = hkr1;
        e = rideractivity;
        d = doa1;
        c = gmg1;
    }

    public final void a()
    {
        Client client = b.c();
        if (client != null)
        {
            if (doa.a(client))
            {
                a.a(client.getUuid());
                return;
            }
            if (c.a(dbf.E))
            {
                if (e.getSupportFragmentManager().findFragmentByTag(com/ubercab/client/feature/receipt/EnhancedReceiptDialogFragment.getName()) == null)
                {
                    EnhancedReceiptDialogFragment.a(e);
                    return;
                }
            } else
            {
                e.startActivityForResult(new Intent(e, com/ubercab/client/feature/receipt/ReceiptActivity), 2008);
                return;
            }
        }
    }

    public final void a(erk erk1)
    {
        erk1 = erk1.a();
        Intent intent = new Intent(e, com/ubercab/client/feature/receipt/ReceiptActivity);
        if (erk1 == null || erk1.isEmpty())
        {
            e.startActivityForResult(intent, 2008);
        } else
        {
            erk1 = PayNowActivity.a(e, new ArrayList(erk1), intent);
            if (!f)
            {
                f = true;
                e.startActivityForResult(erk1, 2016);
                return;
            }
        }
    }

    public final void b()
    {
        f = false;
    }
}
