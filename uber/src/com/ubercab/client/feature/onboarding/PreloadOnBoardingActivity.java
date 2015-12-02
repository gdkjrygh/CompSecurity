// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.launch.MagicActivity;
import czj;
import dbf;
import dfe;
import dfp;
import dod;
import dof;
import elj;
import elk;
import ell;
import gmg;

public class PreloadOnBoardingActivity extends RiderActivity
{

    public cev h;
    public gmg i;
    public dod j;
    TextView mLegalTextView;

    public PreloadOnBoardingActivity()
    {
    }

    private static Spannable a(Spannable spannable)
    {
        URLSpan aurlspan[] = (URLSpan[])spannable.getSpans(0, spannable.length(), android/text/style/URLSpan);
        int l = aurlspan.length;
        for (int k = 0; k < l; k++)
        {
            URLSpan urlspan = aurlspan[k];
            int i1 = spannable.getSpanStart(urlspan);
            int j1 = spannable.getSpanEnd(urlspan);
            spannable.removeSpan(urlspan);
            spannable.setSpan(new URLNoUnderlineSpan(urlspan.getURL()), i1, j1, 0);
        }

        return spannable;
    }

    private void a(ell ell1)
    {
        ell1.a(this);
    }

    private ell b(dfp dfp)
    {
        return elj.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        startActivity(new Intent(this, com/ubercab/client/feature/launch/MagicActivity));
        finish();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ell)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f03013d);
        ButterKnife.inject(this);
        if (i.a(dbf.aA))
        {
            bundle = getString(0x7f07036e, new Object[] {
                "<a href=http://www.uber.com/android/permissions>", "<a href=http://www.uber.com/privacy>", "</a>"
            });
        } else
        {
            bundle = getString(0x7f07036d);
        }
        bundle = a(android.text.Spannable.Factory.getInstance().newSpannable(Html.fromHtml(bundle)));
        mLegalTextView.setText(bundle);
        Linkify.addLinks(mLegalTextView, 15);
        mLegalTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void onPause()
    {
        super.onPause();
        h.b(this);
    }

    public void onResume()
    {
        super.onResume();
        h.a(this);
    }

    public void onSignInButtonClicked()
    {
        j.e();
        h.c(new dof());
        f();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    private class URLNoUnderlineSpan extends URLSpan
    {

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(false);
        }

        public URLNoUnderlineSpan(String s1)
        {
            super(s1);
        }
    }

}
