// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.signup.PhoneNumber;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dal;
import dar;
import dbf;
import dfp;
import djb;
import djx;
import dkn;
import dlm;
import dmv;
import dmw;
import dpg;
import duj;
import duo;
import gin;
import gio;
import giz;
import gjf;
import gjg;
import gjq;
import gmg;
import hkm;
import hkr;
import hku;
import hpb;
import ica;
import icl;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.verification:
//            MobileVerificationDialogFragment

public class MobileVerificationTokenFragment extends czb
{

    public djx c;
    public chp d;
    public cev e;
    public hkr f;
    public hku g;
    public gmg h;
    public giz i;
    public dpg j;
    public dkn k;
    public hkm l;
    public dal m;
    Button mButtonChangeNumber;
    Button mButtonDialog;
    Button mButtonResendSms;
    EditText mEditTextToken;
    TextView mTextViewTokenMessage;
    private icl n;
    private String o;

    public MobileVerificationTokenFragment()
    {
    }

    public static MobileVerificationTokenFragment a()
    {
        return new MobileVerificationTokenFragment();
    }

    static void a(MobileVerificationTokenFragment mobileverificationtokenfragment, String s)
    {
        mobileverificationtokenfragment.a(s);
    }

    private void a(gjg gjg1)
    {
        gjg1.a(this);
    }

    private void a(String s)
    {
        b(getString(0x7f070669));
        if (h.b(dbf.ac))
        {
            k.f(s);
            return;
        } else
        {
            c.a(m.z(), s);
            return;
        }
    }

    private gjg b(dfp dfp)
    {
        return gin.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gjg)czj);
    }

    public final void a(String s, String s1)
    {
        o = duj.b(s, s1);
        if (!TextUtils.isEmpty(o))
        {
            mTextViewTokenMessage.setText(getString(0x7f070663, new Object[] {
                o
            }));
        }
    }

    public final cic f()
    {
        return l.jp;
    }

    public void onClickButtonChangeNumber()
    {
        e.c(new gjq());
        d.a(n.jy);
    }

    public void onClickButtonResendToken()
    {
        b(getString(0x7f0703a7));
        if (h.b(dbf.ac))
        {
            k.f();
        } else
        {
            c.c(m.z());
        }
        d.a(n.jB);
    }

    public void onClickButtonVerificationOptionsDialog()
    {
        MobileVerificationDialogFragment.a(d(), o);
    }

    public void onConfirmMobileResponseEvent(dlm dlm1)
    {
        e();
        if (!dlm1.e())
        {
            c(dlm1.a(getActivity()));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030214, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        n.b();
    }

    public void onPingEvent(dar dar1)
    {
        while (j.n() || h.a(dbf.Y)) 
        {
            return;
        }
        dar1 = dar1.a().getClient();
        String s = dar1.getMobileCountryIso2();
        a(duj.d(dar1.getCurrentMobile(), s), s);
    }

    public void onRequestMobileConfirmationResponseEvent(dmv dmv1)
    {
        e();
        if (!dmv1.e())
        {
            c(dmv1.a(getActivity()));
        }
    }

    public void onRequestMobileVerificationResponseEvent(dmw dmw)
    {
        e();
        if (!j.n())
        {
            k.b();
            return;
        } else
        {
            l.a().b(duo.a());
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f07064b));
        n = g.d().c(new gjf(this, (byte)0));
        PhoneNumber phonenumber = i.f();
        if (phonenumber != null)
        {
            a(phonenumber.a(), phonenumber.b());
        } else
        {
            Client client = f.c();
            if (client != null)
            {
                String s = client.getMobileCountryIso2();
                a(duj.d(client.getCurrentMobile(), s), s);
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mEditTextToken.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(4)
        });
        mEditTextToken.addTextChangedListener(new hpb() {

            final MobileVerificationTokenFragment a;

            public final void afterTextChanged(Editable editable)
            {
                editable = editable.toString();
                if (editable.length() == 4)
                {
                    MobileVerificationTokenFragment.a(a, editable);
                }
            }

            
            {
                a = MobileVerificationTokenFragment.this;
                super();
            }
        });
        if (h.b(dbf.ab))
        {
            mButtonDialog.setVisibility(8);
            mButtonChangeNumber.setVisibility(0);
            mButtonResendSms.setVisibility(0);
        }
    }
}
