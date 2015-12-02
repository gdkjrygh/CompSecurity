// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.rider.realtime.model.Client;

public class ghl extends ghw
{

    hku c;
    hkh d;
    dpg e;
    cyy f;
    private icl g;
    private icl h;
    private int i;

    public ghl()
    {
        i = 0;
    }

    static int a(ghl ghl1, int j)
    {
        ghl1.i = j;
        return j;
    }

    private gho a()
    {
        return ggv.a().a(new djb(this)).a((fqp)((TripActivity)getActivity()).d()).a();
    }

    private void a(Client client)
    {
        if (client.getIsAdmin() && i == 0 && ("com.ubercab".equals("com.ubercab") || "com.ubercab.nightly".equals("com.ubercab")))
        {
            i = 1;
            if ("".isEmpty())
            {
                client = "rider_beta";
            } else
            {
                client = "rider_nightly_v2";
            }
            h = d.a(client).a(ico.a()).a(new ghn(this, (byte)0));
        }
    }

    static void a(ghl ghl1, Client client)
    {
        ghl1.a(client);
    }

    private void a(gho gho1)
    {
        gho1.a(this);
    }

    protected final volatile czj a(dfp dfp)
    {
        return a();
    }

    public final volatile void a(czj czj)
    {
        a((gho)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClientEvent(ClientEvent clientevent)
    {
        if (e.n())
        {
            return;
        } else
        {
            a(clientevent.getClient());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            i = bundle.getInt("com.ubercab.UPGRADE_CHECKED");
        }
    }

    public void onPause()
    {
        super.onPause();
        g.b();
        if (h != null)
        {
            h.b();
        }
    }

    public void onResume()
    {
        super.onResume();
        g = c.d().c(new ghm(this, (byte)0));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.ubercab.UPGRADE_CHECKED", i);
    }
}
