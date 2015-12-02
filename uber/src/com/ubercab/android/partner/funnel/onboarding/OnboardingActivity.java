// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import cob;
import coc;
import coi;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import crf;
import crn;
import cro;
import crr;
import crs;
import csr;
import csx;

public class OnboardingActivity extends PartnerFunnelActivity
{

    public csx d;

    public OnboardingActivity()
    {
    }

    public static Intent a(Activity activity)
    {
        activity = new Intent(activity, com/ubercab/android/partner/funnel/onboarding/OnboardingActivity);
        activity.putExtra("is_resuming", true);
        return activity;
    }

    private void a(crr crr1)
    {
        crr1.a(this);
    }

    private crr b(crs crs)
    {
        return crn.a().a((new coi(this)).b()).a(crs).a();
    }

    private void f()
    {
        if (a(csr) == null)
        {
            a(cob.ub__partner_funnel_onboarding_viewgroup_content, csr.a(getIntent().getBooleanExtra("is_resuming", false)));
        }
    }

    protected final crf a(crs crs)
    {
        return b(crs);
    }

    public final void a(int i, int j, Bundle bundle)
    {
        super.a(i, j, bundle);
        bundle = (csr)a(csr);
        if (bundle != null)
        {
            bundle.a(i, j);
        }
    }

    public final volatile void a(crf crf)
    {
        a((crr)crf);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(coc.ub__partner_funnel_onboarding_activity_onboarding);
        f();
    }
}
