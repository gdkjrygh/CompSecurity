// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.client.feature.payment.amex.AmexRewardInfoActivity;

public class gfy extends ghw
{

    hku c;
    dpg d;
    private icl e;
    private boolean f;

    public gfy()
    {
    }

    private void a(gfz gfz1)
    {
        gfz1.a(this);
    }

    static boolean a(gfy gfy1)
    {
        return gfy1.f;
    }

    private gfz b(dfp dfp)
    {
        return ggl.a().a(new djb(this)).a(dfp).a();
    }

    static boolean b(gfy gfy1)
    {
        gfy1.f = true;
        return true;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gfz)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClientEvent(ClientEvent clientevent)
    {
        if (!d.n())
        {
            if ((clientevent = AmexRewardInfoActivity.a(clientevent.getClient().getPaymentProfiles())) != null && !f)
            {
                f = true;
                startActivity(AmexRewardInfoActivity.a(getActivity(), clientevent));
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            f = bundle.getBoolean("come.ubercab.CHECKED_AMEX_REWARDS_ENROLLMENT");
        }
    }

    public void onPause()
    {
        super.onPause();
        e.b();
    }

    public void onResume()
    {
        super.onResume();
        e = c.d().c(new gga(this, (byte)0));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("come.ubercab.CHECKED_AMEX_REWARDS_ENROLLMENT", f);
    }
}
