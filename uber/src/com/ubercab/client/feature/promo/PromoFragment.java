// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import cwz;
import cyz;
import czj;
import dfp;
import diw;
import dkn;
import dlg;
import dpg;
import dtj;
import fak;
import fal;
import fao;
import fap;
import far;
import hkp;
import ica;
import icl;
import ico;
import java.util.Map;
import l;
import n;

public class PromoFragment extends cyz
{

    public static final String a = com/ubercab/client/feature/promo/PromoFragment.getName();
    public cev b;
    public chp c;
    public dpg d;
    public dkn g;
    public hkp h;
    icl i;
    private l j;
    private l k;
    private n l;
    private n m;
    Button mButtonApply;
    EditText mEditTextCode;
    ProgressBar mProgressBarLoading;
    ViewGroup mViewGroupContent;

    public PromoFragment()
    {
        j = l.fA;
    }

    static void a(PromoFragment promofragment)
    {
        promofragment.e();
    }

    public static void a(PromoFragment promofragment, String s)
    {
        promofragment.b(s);
    }

    private void a(fap fap1)
    {
        fap1.a(this);
    }

    private void a(String s)
    {
        c("rejected");
        mEditTextCode.postDelayed(new Runnable(s) {

            final String a;
            final PromoFragment b;

            public final void run()
            {
                if (b.isAdded())
                {
                    b.mEditTextCode.setError(a);
                }
            }

            
            {
                b = PromoFragment.this;
                a = s;
                super();
            }
        }, getResources().getInteger(0x10e0000));
    }

    private fap b(dfp dfp)
    {
        return fak.a().a(new diw(this)).a(dfp).a();
    }

    public static void b(PromoFragment promofragment)
    {
        promofragment.b(false);
    }

    public static void b(PromoFragment promofragment, String s)
    {
        promofragment.a(s);
    }

    private void b(String s)
    {
        mEditTextCode.setError(null);
        mEditTextCode.setText(null);
        (new android.app.AlertDialog.Builder(getActivity())).setMessage(s).setTitle(getString(0x7f070381)).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final PromoFragment a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                PromoFragment.a(a);
                a.b.c(new far());
            }

            
            {
                a = PromoFragment.this;
                super();
            }
        }).show();
        c("accepted");
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            mProgressBarLoading.setVisibility(0);
            mViewGroupContent.setVisibility(4);
            return;
        } else
        {
            mViewGroupContent.setVisibility(0);
            mProgressBarLoading.setVisibility(4);
            return;
        }
    }

    private void c(String s)
    {
        s = AnalyticsEvent.create("impression").setName(k).setValue(s);
        c.a(s);
    }

    public static PromoFragment d()
    {
        return new PromoFragment();
    }

    private void e()
    {
        cwz.b(getActivity(), mEditTextCode);
    }

    public final cic a()
    {
        return j;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fap)czj);
    }

    final void a(boolean flag)
    {
        c.a(l);
        String s = mEditTextCode.getText().toString();
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        b(true);
        mEditTextCode.setError(null);
        if (d.c())
        {
            i = h.a(s, flag).a(ico.a()).a(new fao(this, (byte)0));
            return;
        } else
        {
            g.a(s, flag);
            return;
        }
    }

    public void onApplyPromoResponse(dlg dlg1)
    {
        b(false);
        if (dlg1.i())
        {
            return;
        }
        if (dlg1.a())
        {
            dtj.a((RiderActivity)getActivity(), 1321, null, dlg1.b(), dlg1.c(), dlg1.d());
            return;
        }
        String s = dlg1.f();
        if (!TextUtils.isEmpty(s))
        {
            a(s);
            return;
        }
        dlg1 = ((Ping)dlg1.g()).getApiResponse().getData();
        if (dlg1 != null)
        {
            dlg1 = (String)dlg1.get("description");
        } else
        {
            dlg1 = null;
        }
        b(dlg1);
    }

    public void onClickApply()
    {
        a(false);
    }

    public void onClickCancel()
    {
        c.a(m);
        e();
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0x7f09017b);
        if (getShowsDialog())
        {
            j = l.fC;
            m = n.dK;
            k = l.fD;
            l = n.dL;
            return;
        } else
        {
            j = l.fA;
            m = n.dI;
            k = l.fB;
            l = n.dJ;
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (getDialog() == null)
        {
            layoutinflater = layoutinflater.inflate(0x7f03015a, viewgroup, false);
        } else
        {
            layoutinflater = layoutinflater.inflate(0x7f03015b, viewgroup, false);
        }
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public boolean onEditorActionCode()
    {
        a(false);
        return true;
    }

    public void onPause()
    {
        super.onPause();
        e();
        if (i != null)
        {
            i.b();
        }
    }

    public void onResume()
    {
        super.onResume();
        mEditTextCode.requestFocus();
    }

    public void onStop()
    {
        cwz.a(getActivity());
        super.onStop();
    }

    public void onTextChangedPromo(CharSequence charsequence)
    {
        charsequence = mButtonApply;
        boolean flag;
        if (!TextUtils.isEmpty(mEditTextCode.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        charsequence.setEnabled(flag);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        view = mButtonApply;
        boolean flag;
        if (!TextUtils.isEmpty(mEditTextCode.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
    }

}
