// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.faresplit.master;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import czj;
import czq;
import dar;
import dfe;
import dfp;
import dpg;
import ebj;
import ebk;
import ebr;
import ebs;
import eci;
import hku;
import ica;
import icl;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.faresplit.master:
//            FareSplitInviteFragment

public class FareSplitInviteActivity extends RiderActivity
{

    public hku h;
    public czq i;
    public dpg j;
    private icl k;

    public FareSplitInviteActivity()
    {
    }

    private void a(ebs ebs1)
    {
        ebs1.a(this);
    }

    private ebs b(dfp dfp)
    {
        return ebj.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/faresplit/master/FareSplitInviteFragment) == null)
        {
            a(0x7f0e0127, new FareSplitInviteFragment(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ebs)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030068);
        if (getSupportFragmentManager().findFragmentById(0x7f0e0127) == null)
        {
            f();
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(i);
    }

    public void onFareSplitInvitesSentEvent(eci eci)
    {
        setResult(-1);
        finish();
    }

    public void onPause()
    {
        super.onPause();
        k.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (!j.n())
        {
            if (!(dar1 = dar1.a().getClient().getStatus()).equals("OnTrip") && !dar1.equals("WaitingForPickup"))
            {
                setResult(0);
                finish();
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        k = h.f().c(new ebr(this, (byte)0));
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
