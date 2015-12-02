// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.safetynet.contactpicker.ContactPickerFragment;
import cwm;
import czj;
import dfe;
import dfp;
import fdq;
import fdr;
import fec;
import fei;
import ffb;
import ffd;
import ffe;
import ffg;
import ffh;
import java.util.ArrayList;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetFragment, SafetyNetTutorialFragment

public class SafetyNetActivity extends RiderActivity
{

    public fei h;

    public SafetyNetActivity()
    {
    }

    private void a(int j, ArrayList arraylist)
    {
        if (a(com/ubercab/client/feature/safetynet/contactpicker/ContactPickerFragment) == null)
        {
            a(0x7f0e0435, ((android.support.v4.app.Fragment) (ContactPickerFragment.a(j, arraylist))));
        }
    }

    private void a(fec fec1)
    {
        fec1.a(this);
    }

    private fec b(dfp dfp)
    {
        return fdq.a().a(new dfe(this)).a(dfp).a();
    }

    private int f()
    {
        return getIntent().getIntExtra("start_fragment", 0);
    }

    private void g()
    {
        if (a(com/ubercab/client/feature/safetynet/SafetyNetFragment) == null)
        {
            a(0x7f0e0435, SafetyNetFragment.a(), true);
        }
    }

    private void h()
    {
        if (a(com/ubercab/client/feature/safetynet/SafetyNetTutorialFragment) == null)
        {
            a(0x7f0e0435, new SafetyNetTutorialFragment(), true);
        }
    }

    private void i()
    {
        if (a(com/ubercab/client/feature/safetynet/contactpicker/ContactPickerFragment) == null)
        {
            a(0x7f0e0435, new ContactPickerFragment(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fec)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030167);
        switch (f())
        {
        default:
            return;

        case 0: // '\0'
            g();
            return;

        case 1: // '\001'
            h();
            return;

        case 2: // '\002'
            i();
            break;
        }
    }

    public void onAddContactsClickedEvent(ffd ffd1)
    {
        a(ffd1.a(), ffd1.b());
    }

    public void onContactsAddedEvent(ffb ffb1)
    {
        b(getString(0x7f070296), null);
        h.a(ffb1.a());
    }

    public void onDeleteSafetyNetContact(ffe ffe1)
    {
        b(getString(0x7f070296), null);
        h.a(ffe1.a());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            int j = f();
            if ((j == 0 || j == 1) && a(com/ubercab/client/feature/safetynet/contactpicker/ContactPickerFragment) != null && getFragmentManager().getBackStackEntryCount() > 0)
            {
                A();
                return true;
            }
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public void onSafetyNetContactsUpdatedEvent(ffg ffg1)
    {
        u();
        if (ffg1.a() != 1) goto _L2; else goto _L1
_L1:
        f();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 54
    //                   1 61
    //                   2 72;
           goto _L3 _L4 _L5 _L6
_L3:
        getIntent().removeExtra("start_fragment");
_L2:
        return;
_L4:
        A();
        continue; /* Loop/switch isn't completed */
_L5:
        A();
        g();
        continue; /* Loop/switch isn't completed */
_L6:
        g();
        if (true) goto _L3; else goto _L7
_L7:
    }

    public void onSafetyNetNetworkErrorEvent(ffh ffh1)
    {
        switch (ffh1.a())
        {
        default:
            return;

        case 0: // '\0'
            cwm.a(this, 0x7f0703ba);
            u();
            finish();
            return;

        case 1: // '\001'
            h.g();
            A();
            g();
            cwm.a(this, 0x7f0703b8);
            return;

        case 2: // '\002'
            cwm.a(this, 0x7f0703b9);
            break;
        }
        u();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
