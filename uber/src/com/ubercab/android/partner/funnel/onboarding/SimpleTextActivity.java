// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import cob;
import coc;
import coi;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.ui.TextView;
import cqg;
import crf;
import crn;
import cro;
import crr;
import crs;

public class SimpleTextActivity extends PartnerFunnelActivity
{

    public cqg d;
    TextView e;
    TextView f;

    public SimpleTextActivity()
    {
    }

    public static Intent a(Context context, String s, String s1)
    {
        context = new Intent(context, com/ubercab/android/partner/funnel/onboarding/SimpleTextActivity);
        context.putExtra("content", s1);
        context.putExtra("title", s);
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

    protected final crf a(crs crs)
    {
        return b(crs);
    }

    public final volatile void a(crf crf)
    {
        a((crr)crf);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(coc.ub__partner_funnel_onboarding_activity_simple_text);
        e = (TextView)findViewById(cob.ub__partner_funnel_simpletext_textview_title);
        f = (TextView)findViewById(cob.ub__partner_funnel_simpletext_textview_content);
        d.a();
        d.b();
        bundle = getIntent().getStringExtra("title");
        if (!TextUtils.isEmpty(bundle))
        {
            e.setVisibility(0);
            e.setText(bundle);
        }
        f.setText(getIntent().getStringExtra("content"));
    }
}
