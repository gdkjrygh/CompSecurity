// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.TripPendingRating;
import com.ubercab.client.feature.trip.TripActivity;

public class ghh extends ghw
{

    cev c;
    hku d;
    dpg e;
    private icl f;

    public ghh()
    {
    }

    private ghj a()
    {
        return ggt.a().a(new djb(this)).a((fqp)((TripActivity)getActivity()).d()).a();
    }

    private void a(ghj ghj1)
    {
        ghj1.a(this);
    }

    protected final volatile czj a(dfp dfp)
    {
        return a();
    }

    public final volatile void a(czj czj)
    {
        a((ghj)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onPause()
    {
        super.onPause();
        f.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (!e.n())
        {
            dar1 = dar1.a();
            Client client = dar1.getClient();
            if (dul.j(dar1))
            {
                dar1 = client.getTripPendingRating();
                c.c(new fdo(dar1.getId()));
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        f = d.f().c(new ghi(this, (byte)0));
    }
}
