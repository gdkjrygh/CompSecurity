// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.pickupnote;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Note;
import czj;
import dfe;
import dfp;
import gcr;
import gcs;
import gcv;
import gcx;
import l;

// Referenced classes of package com.ubercab.client.feature.trip.pickupnote:
//            PickupNoteComposeFragment

public class PickupNoteComposeActivity extends RiderActivity
    implements gcx
{

    public chp h;

    public PickupNoteComposeActivity()
    {
    }

    public static Intent a(Context context, Note note, RiderLocation riderlocation)
    {
        context = new Intent(context, com/ubercab/client/feature/trip/pickupnote/PickupNoteComposeActivity);
        context.putExtra("com.ubercab.PICKUPNOTE", note);
        context.putExtra("com.ubercab.LOCATION_PICKUP", riderlocation);
        return context;
    }

    private void a(Note note, RiderLocation riderlocation)
    {
        note = PickupNoteComposeFragment.a(note, riderlocation);
        note.a(this);
        a(0x7f0e037f, ((android.support.v4.app.Fragment) (note)), true);
        h.a(l.eG);
    }

    private void a(gcv gcv1)
    {
        gcv1.a(this);
    }

    private gcv b(dfp dfp)
    {
        return gcr.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        setResult(0);
        finish();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i, int j, Bundle bundle)
    {
        super.a(i, j, bundle);
        bundle = (PickupNoteComposeFragment)a(com/ubercab/client/feature/trip/pickupnote/PickupNoteComposeFragment);
        if (bundle == null || bundle.a(i, j))
        {
            return;
        } else
        {
            f();
            return;
        }
    }

    public final void a(Note note)
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.PICKUPNOTE", note);
        setResult(-1, intent);
        finish();
    }

    public final volatile void a(czj czj)
    {
        a((gcv)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030137);
        if (bundle == null)
        {
            a((Note)getIntent().getParcelableExtra("com.ubercab.PICKUPNOTE"), (RiderLocation)getIntent().getParcelableExtra("com.ubercab.LOCATION_PICKUP"));
        }
    }

    public void onBackPressed()
    {
        PickupNoteComposeFragment pickupnotecomposefragment = (PickupNoteComposeFragment)a(com/ubercab/client/feature/trip/pickupnote/PickupNoteComposeFragment);
        if (pickupnotecomposefragment != null && pickupnotecomposefragment.a())
        {
            return;
        } else
        {
            f();
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
