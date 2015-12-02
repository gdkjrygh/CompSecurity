// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.receipt.MealReceiptActivity;
import com.ubercab.rider.realtime.model.Client;

public final class fcx
{

    private final djw a;
    private final hkr b;
    private final gmg c;
    private final RiderActivity d;
    private final doa e;

    public fcx(djw djw1, hkr hkr1, gmg gmg1, RiderActivity rideractivity, doa doa1)
    {
        a = djw1;
        b = hkr1;
        c = gmg1;
        d = rideractivity;
        e = doa1;
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
            if (!c.b(dbf.H))
            {
                d.startActivityForResult(new Intent(d, com/ubercab/client/feature/receipt/MealReceiptActivity), 2008);
                return;
            }
        }
    }
}
