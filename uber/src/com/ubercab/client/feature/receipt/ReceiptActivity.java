// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.os.Bundle;
import android.text.TextUtils;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.TripPendingRating;
import czj;
import czq;
import dar;
import dfe;
import dfp;
import dpg;
import dul;
import fcg;
import fch;
import fdc;
import fdd;
import hkr;
import hku;
import ica;
import icl;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            ReceiptFragment

public class ReceiptActivity extends RiderActivity
{

    public hkr h;
    public hku i;
    public czq j;
    public dpg k;
    private icl l;

    public ReceiptActivity()
    {
    }

    private void a(fdd fdd1)
    {
        fdd1.a(this);
    }

    private fdd b(dfp dfp)
    {
        return fcg.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/receipt/ReceiptFragment) == null)
        {
            a(0x7f0e0404, ReceiptFragment.a(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fdd)czj);
    }

    public final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f03015f);
        bundle = h.d();
        if (bundle != null)
        {
            bundle = bundle.getTripPendingRating();
        } else
        {
            bundle = null;
        }
        if (bundle == null || TextUtils.isEmpty(bundle.getId()))
        {
            setResult(-1);
            finish();
            return;
        } else
        {
            f();
            return;
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(j);
    }

    public void onPause()
    {
        super.onPause();
        l.b();
    }

    public void onPingEvent(dar dar1)
    {
        while (k.n() || dul.j(dar1.a())) 
        {
            return;
        }
        setResult(-1);
        finish();
    }

    public void onResume()
    {
        super.onResume();
        l = i.f().c(new fdc(this, (byte)0));
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
