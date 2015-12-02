// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.ui.TextView;
import cyj;
import cyk;
import cyq;
import cyz;
import czj;
import dal;
import dfp;
import diw;
import dkn;
import dmr;
import l;
import n;

// Referenced classes of package com.ubercab.client.core.app:
//            RiderApplication

public class NetworkErrorFragment extends cyz
{

    public dkn a;
    public chp b;
    public dal c;
    public RiderApplication d;
    LinearLayout mLayoutButtons;
    ProgressBar mProgressBarRetrying;
    TextView mTextViewSignOut;

    public NetworkErrorFragment()
    {
    }

    private void a(cyq cyq1)
    {
        cyq1.a(this);
    }

    private cyq b(dfp dfp)
    {
        return cyj.a().a(new diw(this)).a(dfp).a();
    }

    private CharSequence d()
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        spannablestringbuilder.append(getString(0x7f070307).toUpperCase());
        spannablestringbuilder.append(" ");
        int i = spannablestringbuilder.length();
        spannablestringbuilder.append(getString(0x7f0702a1).toUpperCase());
        spannablestringbuilder.setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0d0078)), i, spannablestringbuilder.length(), 18);
        return spannablestringbuilder;
    }

    public final cic a()
    {
        return l.dn;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((cyq)czj);
    }

    public void onClickButtonRetry()
    {
        b.a(n.bH);
        if (!c.v())
        {
            dismiss();
        } else
        if (isAdded())
        {
            mProgressBarRetrying.setVisibility(0);
            mLayoutButtons.setVisibility(4);
            mLayoutButtons.postDelayed(new Runnable() {

                final NetworkErrorFragment a;

                public final void run()
                {
                    a.a.d();
                }

            
            {
                a = NetworkErrorFragment.this;
                super();
            }
            }, getResources().getInteger(0x10e0002));
            return;
        }
    }

    public void onClickButtonSignOut()
    {
        b.a(n.bI);
        d.a(b());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0);
        setCancelable(false);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return new Dialog(getActivity(), getTheme()) {

            final NetworkErrorFragment a;

            public final void onBackPressed()
            {
                android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
                if (fragmentactivity != null)
                {
                    fragmentactivity.finish();
                }
                super.onBackPressed();
            }

            
            {
                a = NetworkErrorFragment.this;
                super(context, i);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03017a, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onPingClientResponseEvent(dmr dmr1)
    {
        if (!dmr1.e())
        {
            mLayoutButtons.setVisibility(0);
            mProgressBarRetrying.setVisibility(8);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mTextViewSignOut.setText(d());
    }
}
