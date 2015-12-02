// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.rider.realtime.model.PaymentProfile;

public class ggc extends ghw
{

    chp c;
    gxx d;
    hku e;
    gmg f;
    dpg g;
    private boolean h;
    private icl i;

    public ggc()
    {
    }

    private void a()
    {
        d.a(new ggd((byte)0));
    }

    private void a(gge gge1)
    {
        gge1.a(this);
    }

    private static boolean a(Client client)
    {
        if (client == null || client.getPaymentProfiles() == null)
        {
            return false;
        } else
        {
            return gki.d(client.getPaymentProfiles(), new gka() {

                private static boolean a(PaymentProfile paymentprofile)
                {
                    return gjx.a(paymentprofile.getCardType(), "Cash");
                }

                public final boolean apply(Object obj)
                {
                    return a((PaymentProfile)obj);
                }

            }).b();
        }
    }

    static boolean a(com.ubercab.rider.realtime.model.Client client)
    {
        return b(client);
    }

    static boolean a(ggc ggc1)
    {
        return ggc1.h;
    }

    private gge b(dfp dfp)
    {
        return ggn.a().a(new djb(this)).a(dfp).a();
    }

    private static boolean b(com.ubercab.rider.realtime.model.Client client)
    {
        client = client.getPaymentProfiles();
        if (client == null)
        {
            return false;
        } else
        {
            return gki.d(client, new gka() {

                private static boolean a(PaymentProfile paymentprofile)
                {
                    return gjx.a(paymentprofile.getCardType(), "Cash");
                }

                public final boolean apply(Object obj)
                {
                    return a((PaymentProfile)obj);
                }

            }).b();
        }
    }

    static boolean b(ggc ggc1)
    {
        ggc1.h = true;
        return true;
    }

    static void c(ggc ggc1)
    {
        ggc1.a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gge)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClientEvent(ClientEvent clientevent)
    {
        while (g.n() || !duh.c(f, null) || h || a(clientevent.getClient())) 
        {
            return;
        }
        h = true;
        a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            h = bundle.getBoolean("sent_request");
        }
    }

    public void onPause()
    {
        super.onPause();
        i.b();
    }

    public void onResume()
    {
        super.onResume();
        i = e.d().c(new ggh(this, (byte)0));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("sent_request", h);
    }
}
