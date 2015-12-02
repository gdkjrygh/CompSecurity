// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import butterknife.ButterKnife;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.TextView;
import cyz;
import czj;
import dfp;
import diw;
import dtt;
import gij;
import gik;
import gix;
import gke;
import java.util.List;
import l;

public class MobileVerificationDialogFragment extends cyz
{

    ListView mListViewOptions;
    TextView mTextViewTitle;

    public MobileVerificationDialogFragment()
    {
    }

    private static MobileVerificationDialogFragment a(String s)
    {
        MobileVerificationDialogFragment mobileverificationdialogfragment = new MobileVerificationDialogFragment();
        Bundle bundle = b(1);
        bundle.putString("phone_number", s);
        mobileverificationdialogfragment.setArguments(bundle);
        return mobileverificationdialogfragment;
    }

    public static void a(RiderActivity rideractivity, String s)
    {
        a(s).show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/verification/MobileVerificationDialogFragment.getName());
    }

    private void a(gix gix1)
    {
        gix1.a(this);
    }

    private gix b(dfp dfp)
    {
        return gij.a().a(new diw(this)).a(dfp).a();
    }

    private void b(String s)
    {
        s = new SpannableString(s);
        s.setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0d00bc)), 0, s.length(), 33);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(getString(0x7f070642));
        spannablestringbuilder.append(" ").append(s);
        mTextViewTitle.setText(dtt.a(spannablestringbuilder));
    }

    public final cic a()
    {
        return l.jm;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gix)czj);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        Object obj = getActivity().getLayoutInflater().inflate(0x7f030215, null);
        ButterKnife.inject(this, ((View) (obj)));
        b(getArguments().getString("phone_number"));
        bundle.setView(((View) (obj)));
        bundle.setNegativeButton(0x7f07007b, null);
        obj = getString(0x7f070653);
        String s = getString(0x7f070660);
        String s1 = getString(0x7f070651);
        gke gke1 = gke.a(obj, s, s1);
        ArrayAdapter arrayadapter = new ArrayAdapter(getActivity(), 0x7f03008b, gke1);
        mListViewOptions.setAdapter(arrayadapter);
        mListViewOptions.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(gke1, ((String) (obj)), s, s1) {

            final List a;
            final String b;
            final String c;
            final String d;
            final MobileVerificationDialogFragment e;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l1)
            {
                adapterview = (String)a.get(i);
                if (b.equals(adapterview))
                {
                    e.c(101);
                }
                if (c.equals(adapterview))
                {
                    e.c(102);
                }
                if (d.equals(adapterview))
                {
                    e.c(100);
                }
                e.dismiss();
            }

            
            {
                e = MobileVerificationDialogFragment.this;
                a = list;
                b = s;
                c = s1;
                d = s2;
                super();
            }
        });
        return bundle.create();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onStart()
    {
        super.onStart();
        Button button = ((AlertDialog)getDialog()).getButton(-2);
        if (button != null)
        {
            button.setTextColor(getResources().getColor(0x7f0d0071));
        }
    }
}
