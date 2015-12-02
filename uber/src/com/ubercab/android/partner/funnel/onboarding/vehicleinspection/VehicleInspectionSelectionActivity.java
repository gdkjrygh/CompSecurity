// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.vehicleinspection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import b;
import c;
import chp;
import cif;
import coe;
import coi;
import com.ubercab.android.partner.funnel.signup.form.model.PointOfInterest;
import cqg;
import crf;
import crn;
import cro;
import crr;
import crs;
import cun;
import cuq;
import cut;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.vehicleinspection:
//            PointOfInterestSelectionActivity

public class VehicleInspectionSelectionActivity extends PointOfInterestSelectionActivity
{

    private static final long i;
    private boolean j;
    private long k;

    public VehicleInspectionSelectionActivity()
    {
    }

    public static Intent a(Context context, ArrayList arraylist, String s)
    {
        context = new Intent(context, com/ubercab/android/partner/funnel/onboarding/vehicleinspection/VehicleInspectionSelectionActivity);
        context.putParcelableArrayListExtra("KEY_POINT_OF_INTEREST_LIST", arraylist);
        if (s != null)
        {
            context.putExtra("KEY_IMAGE_URL", s);
        }
        return context;
    }

    private void a(crr crr1)
    {
        crr1.a(this);
    }

    private crr b(crs crs)
    {
        return crn.a().a((new coi(this)).a().b()).a(crs).a();
    }

    protected final crf a(crs crs)
    {
        return b(crs);
    }

    protected final cun a(ArrayList arraylist)
    {
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = arraylist.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        if (!"uber_lot".equalsIgnoreCase(((PointOfInterest)iterator.next()).getType())) goto _L5; else goto _L4
_L4:
        int l = 1;
_L7:
        if (l != 0)
        {
            l = coe.ub__partner_funnel_vehicle_inspection_list_header_with_lots;
        } else
        {
            l = coe.ub__partner_funnel_vehicle_inspection_list_header_no_lots;
        }
        return cun.a(arraylist, getString(l), getString(coe.ub__partner_funnel_get_your_own_inspection), true, b.E);
_L2:
        l = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected final cuq a(ArrayList arraylist, PointOfInterest pointofinterest)
    {
        return cuq.a(arraylist, pointofinterest, b.B, c.x, c.y);
    }

    public final volatile void a(crf crf)
    {
        a((crr)crf);
    }

    protected final cif f()
    {
        return c.v;
    }

    protected final ArrayList g()
    {
        return getIntent().getParcelableArrayListExtra("KEY_POINT_OF_INTEREST_LIST");
    }

    protected final int h()
    {
        return coe.ub__partner_funnel_choose_a_location;
    }

    public final void i()
    {
        d.a(c.w);
        cut cut1 = cut.b(getIntent().getStringExtra("KEY_IMAGE_URL"));
        e.a(coe.ub__partner_funnel_get_your_own_inspection);
        a(cut1, false);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j = true;
    }

    public void onStart()
    {
        super.onStart();
        if (!j && System.currentTimeMillis() - k > i)
        {
            NavUtils.navigateUpFromSameTask(this);
            finish();
        }
        j = false;
    }

    protected void onStop()
    {
        super.onStop();
        k = System.currentTimeMillis();
    }

    static 
    {
        i = TimeUnit.MINUTES.toMillis(5L);
    }
}
