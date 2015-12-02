// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.client.feature.payment.alipay.AlipayVerificationCodeReceiver;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Client;
import java.util.ArrayList;
import java.util.List;

public class gfu extends ghw
{

    hku c;
    gmg d;
    dpg e;
    euz f;
    hoc g;
    private ArrayList h;
    private icl i;

    public gfu()
    {
    }

    private gfv a()
    {
        return ggj.a().a(new djb(this)).a((fqp)((TripActivity)getActivity()).d()).a();
    }

    private void a(Client client)
    {
        if (client != null && client.getInactivePaymentProfiles() != null) goto _L2; else goto _L1
_L1:
        final class _cls1
            implements gjv
        {

            final gfu a;

            private static PaymentProfile a(com.ubercab.rider.realtime.model.PaymentProfile paymentprofile)
            {
                return dui.a(paymentprofile);
            }

            public final Object apply(Object obj1)
            {
                return a((com.ubercab.rider.realtime.model.PaymentProfile)obj1);
            }

            
            {
                a = gfu.this;
                super();
            }
        }

        final class _cls2
            implements gka
        {

            final gfu a;

            private static boolean a(PaymentProfile paymentprofile)
            {
                return "alipay".equals(paymentprofile.getTokenType());
            }

            public final boolean apply(Object obj1)
            {
                return a((PaymentProfile)obj1);
            }

            
            {
                a = gfu.this;
                super();
            }
        }

        return;
_L2:
        Object obj;
        if ((client = (PaymentProfile)gkj.d(gkj.a(client.getInactivePaymentProfiles().iterator(), new _cls1()), new _cls2()).d()) == null || client.getTokenType() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = client.getUuid();
        if (!h.contains(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        if (d.a(dbf.z))
        {
            g.a(com/ubercab/client/feature/payment/alipay/AlipayVerificationCodeReceiver);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        h.add(obj);
        obj = getActivity();
        if (obj != null)
        {
            gsa gsa1 = gsa.a(((android.content.Context) (obj)), client.getTokenType());
            if (gsa1 != null)
            {
                if (d.a(dbf.z))
                {
                    ((Activity) (obj)).startActivity(gsa1.b(client, f.a()));
                    return;
                } else
                {
                    ((Activity) (obj)).startActivity(gsa1.b(client, null));
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void a(gfu gfu1, Client client)
    {
        gfu1.a(client);
    }

    private void a(gfv gfv1)
    {
        gfv1.a(this);
    }

    protected final volatile czj a(dfp dfp)
    {
        return a();
    }

    public final volatile void a(czj czj)
    {
        a((gfv)czj);
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
            h = bundle.getStringArrayList("com.ubercab.HANDLED_PAYMENT_PROFILE_UUIDS");
        }
        if (h == null)
        {
            h = new ArrayList();
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
        i = c.d().c(new gfw(this, (byte)0));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("com.ubercab.HANDLED_PAYMENT_PROFILE_UUIDS", h);
    }
}
