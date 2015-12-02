// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.vehicleinspection;

import android.content.Context;
import android.content.Intent;
import b;
import c;
import cif;
import coe;
import cof;
import coi;
import com.ubercab.android.partner.funnel.signup.form.model.PointOfInterest;
import crf;
import crn;
import cro;
import crr;
import crs;
import cun;
import cuq;
import java.util.ArrayList;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.vehicleinspection:
//            PointOfInterestSelectionActivity

public class OfficeHoursSelectionActivity extends PointOfInterestSelectionActivity
{

    public OfficeHoursSelectionActivity()
    {
    }

    public static Intent a(Context context, ArrayList arraylist)
    {
        context = new Intent(context, com/ubercab/android/partner/funnel/onboarding/vehicleinspection/OfficeHoursSelectionActivity);
        context.putParcelableArrayListExtra("KEY_POINT_OF_INTEREST_LIST", arraylist);
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
        return cun.a(arraylist, getString(coe.ub__partner_funnel_officehours_list_header_no_kit), null, false, b.r);
    }

    protected final cuq a(ArrayList arraylist, PointOfInterest pointofinterest)
    {
        return cuq.a(arraylist, pointofinterest, b.q, c.r, null);
    }

    public final volatile void a(crf crf)
    {
        a((crr)crf);
    }

    public final int e()
    {
        return cof.Theme_Uber_Partner_Funnel_Toolbar;
    }

    protected final cif f()
    {
        return c.q;
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
    }
}
