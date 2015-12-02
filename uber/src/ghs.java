// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import java.util.ArrayList;
import java.util.List;

public class ghs extends ghw
{

    hku c;
    gmg d;
    dpg e;
    private ArrayList f;
    private icl g;

    public ghs()
    {
    }

    private ghu a()
    {
        return ggx.a().a(new djb(this)).a((fqp)((TripActivity)getActivity()).d()).a();
    }

    private void a(Client client)
    {
        gsa gsa1;
        String s;
        if (d.a(dbf.t))
        {
            if ((client = client.getInactivePaymentProfiles()) != null && !client.isEmpty() && !"alipay".equals((client = dui.a((PaymentProfile)client.get(0))).getTokenType()) && ((gsa1 = gsa.a(getActivity(), client.getTokenType())) != null && gsa1.s()) && !f.contains(s = client.getUuid()))
            {
                f.add(s);
                getActivity().startActivity(gsa1.c(client));
                return;
            }
        }
    }

    static void a(ghs ghs1, Client client)
    {
        ghs1.a(client);
    }

    private void a(ghu ghu1)
    {
        ghu1.a(this);
    }

    protected final volatile czj a(dfp dfp)
    {
        return a();
    }

    public final volatile void a(czj czj)
    {
        a((ghu)czj);
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
            f = bundle.getStringArrayList("com.ubercab.HANDLED_PAYMENT_PROFILE_UUIDS");
        }
        if (f == null)
        {
            f = new ArrayList();
        }
    }

    public void onPause()
    {
        super.onPause();
        g.b();
    }

    public void onResume()
    {
        super.onResume();
        g = c.d().c(new ght(this, (byte)0));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("com.ubercab.HANDLED_PAYMENT_PROFILE_UUIDS", f);
    }
}
