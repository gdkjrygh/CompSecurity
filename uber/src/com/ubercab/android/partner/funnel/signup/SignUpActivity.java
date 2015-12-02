// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import cob;
import coc;
import coi;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.android.partner.funnel.signup.model.PartnerFunnelClient;
import cps;
import cqg;
import crf;
import crn;
import cro;
import crr;
import crs;
import cvj;

public class SignUpActivity extends PartnerFunnelActivity
{

    public cqg d;
    public cps e;

    public SignUpActivity()
    {
    }

    public static Intent a(Context context, PartnerFunnelClient partnerfunnelclient)
    {
        context = new Intent(context, com/ubercab/android/partner/funnel/signup/SignUpActivity);
        context.putExtra("SignUpActivity.BUNDLE_CLIENT", partnerfunnelclient);
        return context;
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
        if (a(cvj) == null)
        {
            a(cob.ub__partner_funnel_signup_viewgroup_content, cvj.a((PartnerFunnelClient)getIntent().getParcelableExtra("SignUpActivity.BUNDLE_CLIENT")));
        }
    }

    protected final crf a(crs crs)
    {
        return b(crs);
    }

    public final volatile void a(crf crf)
    {
        a((crr)crf);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(coc.ub__partner_funnel_signup_activity_signup);
        bundle = d;
        e.a(this);
        bundle.a(true);
        f();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            e.a(this);
            break;
        }
        startActivity(e.a(this));
        finish();
        return true;
    }
}
