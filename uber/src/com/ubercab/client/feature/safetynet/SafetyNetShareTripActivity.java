// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.MenuItem;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.safetynet.contactpicker.ContactPickerFragment;
import cwm;
import czj;
import czq;
import dar;
import dfe;
import dfp;
import dpg;
import fdy;
import fdz;
import fei;
import fep;
import feq;
import ffb;
import ffd;
import ffh;
import ffm;
import ffn;
import hku;
import ica;
import icl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetConfiguredShareTripFragment, SafetyNetNotConfiguredShareTripFragment

public class SafetyNetShareTripActivity extends RiderActivity
{

    public cev h;
    public hku i;
    public czq j;
    public dpg k;
    public fei l;
    private ffb m;
    private icl n;

    public SafetyNetShareTripActivity()
    {
    }

    private void a(int i1, ArrayList arraylist)
    {
        if (a(com/ubercab/client/feature/safetynet/contactpicker/ContactPickerFragment) == null)
        {
            a(0x7f0e0435, ((android.support.v4.app.Fragment) (ContactPickerFragment.a(i1, arraylist))));
        }
    }

    private void a(feq feq1)
    {
        feq1.a(this);
    }

    private feq b(dfp dfp)
    {
        return fdy.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/safetynet/SafetyNetConfiguredShareTripFragment) == null)
        {
            B();
            a(0x7f0e0435, SafetyNetConfiguredShareTripFragment.a(), true);
        }
    }

    private void g()
    {
        if (a(com/ubercab/client/feature/safetynet/SafetyNetNotConfiguredShareTripFragment) == null)
        {
            a(0x7f0e0435, new SafetyNetNotConfiguredShareTripFragment(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((feq)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030167);
        l.i();
        if (l.k())
        {
            f();
            return;
        } else
        {
            g();
            return;
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(j);
    }

    public void onAddContactsClickedEvent(ffd ffd1)
    {
        a(ffd1.a(), ffd1.b());
    }

    public void onContactsAddedEvent(ffb ffb)
    {
        m = ffb;
        A();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c && a(com/ubercab/client/feature/safetynet/contactpicker/ContactPickerFragment) != null && getFragmentManager().getBackStackEntryCount() > 0)
        {
            A();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        super.onPause();
        n.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (!k.n())
        {
            if (!(dar1 = dar1.a().getClient().getStatus()).equals("OnTrip") && !dar1.equals("WaitingForPickup"))
            {
                finish();
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        n = i.f().c(new fep(this, (byte)0));
    }

    public void onSafetyNetNetworkErrorEvent(ffh ffh1)
    {
        u();
        switch (ffh1.a())
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return;

        case 0: // '\0'
        case 4: // '\004'
            cwm.a(this, 0x7f0703ba);
            finish();
            return;

        case 3: // '\003'
            cwm.a(this, 0x7f0703bb);
            break;
        }
    }

    public void onSafetyNetTripSharedSuccessfullyEvent(ffm ffm)
    {
        u();
        cwm.a(this, getString(0x7f0703c2));
        finish();
    }

    public void onShareTripClickedEvent(ffn ffn1)
    {
        b(getString(0x7f070296), null);
        l.b(ffn1.a());
    }

    public ffb produceContactsAdded()
    {
        return m;
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
