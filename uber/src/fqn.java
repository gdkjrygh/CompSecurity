// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.payment.model.PaymentError;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.PaymentProfile;
import java.util.Map;

public final class fqn extends ick
{

    final TripActivity a;

    public fqn(TripActivity tripactivity)
    {
        a = tripactivity;
        super();
    }

    private void a(frp frp1)
    {
        if (frp1.a != null)
        {
            frp1 = frp1.a.getStatus();
        } else
        {
            frp1 = null;
        }
        if (frp1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        byte byte0;
        byte0 = -1;
        switch (frp1.hashCode())
        {
        default:
            break;

        case 2014441667: 
            break; /* Loop/switch isn't completed */

        case -1561136888: 
            break;
        }
        break MISSING_BLOCK_LABEL_114;
_L4:
        switch (byte0)
        {
        default:
            a.G.e(false);
            b();
            return;

        case 0: // '\0'
        case 1: // '\001'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (frp1.equals("Looking"))
        {
            byte0 = 0;
        }
          goto _L4
        if (frp1.equals("Dispatching"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((frp)obj);
    }

    public final void a(Throwable throwable)
    {
        a.G.e(false);
        b();
        throwable = ((Error)throwable).getRealtimeError();
        if (throwable != null)
        {
            Client client = a.k.c();
            String s = throwable.getCode();
            String s1 = throwable.getMessage();
            if (a.n.a(dbf.ao) && client != null && client.getLastSelectedPaymentProfile() != null)
            {
                PaymentProfile paymentprofile = client.getLastSelectedPaymentProfile();
                gsa gsa1 = gsa.a(a, paymentprofile.getTokenType());
                PaymentError paymenterror = PaymentError.create(s);
                if (gsa1 != null && gsa1.a(paymenterror))
                {
                    throwable = gsa1.a(dui.a(paymentprofile), paymenterror);
                    a.startActivity(throwable);
                    return;
                }
            }
            if ("rtapi.riders.pickup.arrears".equals(s))
            {
                a.a(client, fth.a(throwable));
                return;
            }
            if ("rtapi.riders.pickup.insufficient_balance".equals(s))
            {
                a.i.a(l.jz);
                dtj.a(a, 0, a.getString(0x7f070280), a.getString(0x7f07027f), a.getString(0x7f070048), a.getString(0x7f07007b));
                return;
            }
            if ("rtapi.riders.pickup.out_of_policy".equals(s))
            {
                if (a.u.f())
                {
                    ezd.a(a.j, a);
                } else
                {
                    dtj.a(a, 0, a.getString(0x7f07049a), s1, a.getString(0x7f07008d), null);
                }
                a.i.a(l.e);
                return;
            }
            if ("rtapi.riders.pickup.invalid_upfront_fare".equals(s))
            {
                dtp.a(a, 0, s1);
                return;
            }
            if (!a.n.b(dbf.i) && "rtapi.riders.pickup.request_without_confirm_surge".equals(s))
            {
                ijg.c("Fare has expired", new Object[0]);
                a.G.r();
                return;
            }
            if (a.n.a(dbf.al) && "rtapi.riders.pickup.payment_error".equals(s) && throwable.getData().containsKey("error_verify_payment"))
            {
                TripActivity.e(a);
                return;
            }
            if (client != null && "rtapi.riders.pickup.mobile_confirmation_required".equals(s))
            {
                if (client.getHasToOptInSmsNotifications())
                {
                    throwable = "com.ubercab.ACTION_MOBILE_VERIFICATION_SMS";
                } else
                {
                    throwable = "com.ubercab.ACTION_MOBILE_VERIFICATION_TOKEN";
                }
                a.startActivity(new Intent(throwable));
                return;
            }
            ijg.d("Unexpected realtime pickup request error, code [%s]: %s", new Object[] {
                s, s1
            });
            if (a.G.o())
            {
                a.G.r();
                return;
            }
        }
    }
}
