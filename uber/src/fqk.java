// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;

public final class fqk
    implements ide
{

    final TripActivity a;

    private fqk(TripActivity tripactivity)
    {
        a = tripactivity;
        super();
    }

    public fqk(TripActivity tripactivity, byte byte0)
    {
        this(tripactivity);
    }

    private void a(fql fql1)
    {
        City city;
        Client client;
        city = (City)fql1.a.d();
        client = fql1.b;
        fql1 = fql1.c;
        break MISSING_BLOCK_LABEL_21;
        if (!a.isFinishing() && client != null && !TextUtils.isEmpty(client.getUuid()))
        {
            if (fql1 == null)
            {
                fql1 = null;
            } else
            {
                fql1 = fql1.getStatus();
            }
            if (!"Dispatching".equals(fql1))
            {
                TripActivity.g(a);
                if (TripActivity.h(a) == null)
                {
                    TripActivity.a(a, client.getPictureUrl(), client.getFormattedName());
                }
                if (city != null)
                {
                    a.z.a(city);
                    return;
                }
            }
        }
        return;
    }

    public final void call(Object obj)
    {
        a((fql)obj);
    }
}
