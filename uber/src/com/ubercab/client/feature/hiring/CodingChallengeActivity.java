// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.hiring;

import android.os.Bundle;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.hiring.model.CodingQuestion;
import com.ubercab.client.feature.hiring.template.BaseQuestionTemplate;
import czj;
import dfe;
import dfp;
import ecy;
import ecz;
import edf;
import edg;
import edh;
import edj;
import edk;
import edm;

public class CodingChallengeActivity extends RiderActivity
{

    public cev h;
    public edf i;
    public edm j;
    private boolean k;
    ViewGroup mContentContainer;

    public CodingChallengeActivity()
    {
    }

    private void a(ecy ecy1)
    {
        ecy1.a(this);
    }

    private ecy b(dfp dfp)
    {
        return edg.a().a(new dfe(this)).a(dfp).a(new ecz(this)).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ecy)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030077);
        ButterKnife.inject(this);
    }

    public void onCodingChallengeEndedEvent(edj edj)
    {
        finish();
    }

    public void onCodingChallengeShowQuestionEvent(edk edk1)
    {
        edk1 = edk1.a();
        BaseQuestionTemplate basequestiontemplate = j.a(edk1.getType());
        basequestiontemplate.a(h, edk1);
        mContentContainer.removeAllViews();
        mContentContainer.addView(basequestiontemplate);
    }

    public void onPause()
    {
        super.onPause();
        i.c();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        k = bundle.getBoolean("com.ubercab.client.feature.hiring.IS_CHALLENGE_STARTED", false);
        i.b(bundle);
    }

    public void onResume()
    {
        super.onResume();
        i.b();
        if (!k)
        {
            i.a();
            k = true;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.ubercab.client.feature.hiring.IS_CHALLENGE_STARTED", k);
        i.a(bundle);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
