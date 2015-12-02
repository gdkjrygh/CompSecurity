// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.passwordreset;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dfp;
import djb;
import dkf;
import emd;
import eme;
import emp;
import emu;
import emw;
import hpb;
import l;
import n;

public class PasswordResetConfirmMobileTokenFragment extends czb
{

    public chp c;
    public dkf d;
    public emu e;
    EditText mEditTextToken;
    TextView mTextViewTokenMessage;

    public PasswordResetConfirmMobileTokenFragment()
    {
    }

    static RiderActivity a(PasswordResetConfirmMobileTokenFragment passwordresetconfirmmobiletokenfragment)
    {
        return passwordresetconfirmmobiletokenfragment.d();
    }

    public static PasswordResetConfirmMobileTokenFragment a()
    {
        return new PasswordResetConfirmMobileTokenFragment();
    }

    private void a(emw emw1)
    {
        emw1.a(this);
    }

    private emw b()
    {
        return emd.a().a(new djb(this)).a((emp)((RiderActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return b();
    }

    public final volatile void a(czj czj)
    {
        a((emw)czj);
    }

    public final cic f()
    {
        return l.dA;
    }

    public void onClickButtonResendToken()
    {
        d.a(e.a());
        c.a(n.bR);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ea, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        mTextViewTokenMessage.setText(getString(0x7f070326, new Object[] {
            e.a()
        }));
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onResume()
    {
        super.onResume();
        ActionBar actionbar = d().b();
        actionbar.a(getString(0x7f070317).toUpperCase());
        actionbar.b(true);
        actionbar.b(0x7f020343);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mEditTextToken.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(6)
        });
        mEditTextToken.addTextChangedListener(new hpb() {

            final PasswordResetConfirmMobileTokenFragment a;

            public final void afterTextChanged(Editable editable)
            {
                editable = editable.toString();
                if (editable.length() == 6)
                {
                    a.d.a(a.e.a(), editable);
                    a.b(a.getString(0x7f070296));
                    ((InputMethodManager)PasswordResetConfirmMobileTokenFragment.a(a).getSystemService("input_method")).hideSoftInputFromWindow(a.mEditTextToken.getWindowToken(), 0);
                }
            }

            
            {
                a = PasswordResetConfirmMobileTokenFragment.this;
                super();
            }
        });
    }
}
