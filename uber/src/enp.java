// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.ubercab.client.feature.payment.BaseAddPaymentV2Fragment;
import com.ubercab.payment.model.PaymentAddOptions;
import com.ubercab.payment.model.PaymentUserInfo;
import com.ubercab.rider.realtime.model.Client;
import java.util.List;

public class enp extends BaseAddPaymentV2Fragment
    implements epx
{

    private enq i;

    public enp()
    {
    }

    public static enp a()
    {
        return new enp();
    }

    private PaymentUserInfo q()
    {
        PaymentUserInfo paymentuserinfo = PaymentUserInfo.create();
        Client client = e.c();
        if (client != null)
        {
            paymentuserinfo.setEmail(client.getEmail()).setFirstName(client.getFirstName()).setLastName(client.getLastName()).setMobile(client.getMobileDigits()).setMobileCountryIso2(client.getMobileCountryIso2());
        }
        return paymentuserinfo;
    }

    protected final void a(gsa gsa1)
    {
        if (gsa1.o())
        {
            PaymentAddOptions paymentaddoptions = PaymentAddOptions.create().setCardScanFirst(false);
            startActivityForResult(gsa1.a(q(), paymentaddoptions), 100);
            return;
        } else
        {
            cwm.a(getActivity(), 0x7f07032b);
            return;
        }
    }

    protected final boolean a(gmg gmg)
    {
        return false;
    }

    public final void b()
    {
        k();
    }

    protected final boolean g()
    {
        return false;
    }

    protected final boolean h()
    {
        return false;
    }

    protected final List i()
    {
        Client client = e.c();
        if (client == null)
        {
            return null;
        } else
        {
            return g.a(getActivity(), h.a(), client);
        }
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        super.onActivityResult(j, k, intent);
        if (j == 100 && k == -1)
        {
            l();
            i.f();
        }
    }

    public void onAttach(Context context)
    {
        super.onAttach(context);
        i = (enq)context;
    }

    public void onDetach()
    {
        super.onDetach();
        i = null;
    }
}
