// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.alipay;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.vendor.alipay.model.AlipayCredentials;
import com.ubercab.client.feature.signup.SignupData;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import cwz;
import czj;
import dfe;
import dfp;
import dup;
import eqn;
import eqo;
import eqp;
import eqq;
import eqt;
import equ;
import gkf;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l;
import n;

public class AddAlipayActivity extends RiderActivity
{

    public chp h;
    private dup i;
    Button mButtonLegal;
    Button mButtonSubmit;
    public AutoCompleteTextView mEditTextAccountId;
    EditText mEditTextMobile;
    public LinearLayout mLayoutAlipayPhoneLayout;
    TextView mTextAlipayAccountLabel;
    TextView mTextAlipayPhoneLabel;
    TextView mTextLegalDescription;

    public AddAlipayActivity()
    {
    }

    private String a(boolean flag, String s1)
    {
        if (flag)
        {
            Matcher matcher = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", 2).matcher(s1);
            s1 = getString(0x7f070287);
            if (matcher.matches())
            {
                s1 = null;
            }
            return s1;
        } else
        {
            return b(true, s1);
        }
    }

    public static void a(AddAlipayActivity addalipayactivity)
    {
        addalipayactivity.f();
    }

    private void a(eqn eqn1)
    {
        eqn1.a(this);
    }

    private eqn b(dfp dfp)
    {
        return eqt.a().a(new dfe(this)).a(dfp).a();
    }

    private String b(boolean flag, String s1)
    {
        if (!flag || Pattern.compile("^1\\d{10}$", 2).matcher(s1).matches())
        {
            return null;
        } else
        {
            return getString(0x7f0702d7);
        }
    }

    public static boolean b(String s1)
    {
        return "CHINA".equals(s1);
    }

    private void f()
    {
        boolean flag = true;
        if (!mEditTextAccountId.getText().toString().contains("@")) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(mEditTextMobile.getText()))
        {
            flag = false;
        }
_L4:
        mButtonSubmit.setEnabled(flag);
        return;
_L2:
        if (TextUtils.isEmpty(mEditTextAccountId.getText()))
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eqn)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300f9);
        ButterKnife.inject(this);
        bundle = new eqq(this, (byte)0);
        eqp eqp1 = new eqp(this, (byte)0);
        mTextAlipayAccountLabel.setText(getString(0x7f070054));
        mEditTextAccountId.setHint(getString(0x7f070204));
        mEditTextAccountId.addTextChangedListener(eqp1);
        mTextAlipayPhoneLabel.setText(getString(0x7f070055));
        mEditTextMobile.addTextChangedListener(bundle);
        mLayoutAlipayPhoneLayout.setVisibility(8);
        mButtonSubmit.setText(getString(0x7f07044b));
        mButtonSubmit.setEnabled(false);
        mTextLegalDescription.setText(getString(0x7f070058));
        mButtonLegal.setText(getString(0x7f070057));
        mButtonLegal.setPaintFlags(mButtonLegal.getPaintFlags() | 8);
        i = new dup((new gkf()).a(new Pair("account_id", new eqo(this, mEditTextAccountId))).a(new Pair("mobile", mEditTextMobile)).a());
    }

    public void onLegalClicked()
    {
        h.a(n.cj);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://www.uber.com/alipay/terms"));
        startActivity(intent);
    }

    public void onSubmitTapped()
    {
        h.a(n.ck);
        String s2 = mEditTextAccountId.getText().toString().trim();
        boolean flag = s2.contains("@");
        String s1;
        Object obj;
        String s3;
        if (flag)
        {
            s1 = mEditTextMobile.getText().toString().trim();
        } else
        {
            s1 = s2;
        }
        obj = new HashMap();
        s3 = a(flag, s2);
        if (s3 != null)
        {
            h.a(l.z);
            ((Map) (obj)).put("account_id", s3);
        }
        s3 = b(flag, s1);
        if (s3 != null)
        {
            h.a(l.A);
            ((Map) (obj)).put("mobile", s3);
        }
        if (!((Map) (obj)).isEmpty())
        {
            i.a(((Map) (obj)));
            i.a();
            return;
        }
        cwz.a(this);
        obj = new Intent();
        ((Intent) (obj)).putExtra("alipay_credentials", new AlipayCredentials(s2, s1));
        if (getIntent().hasExtra("extra_signup_data"))
        {
            SignupData signupdata = (SignupData)getIntent().getParcelableExtra("extra_signup_data");
            signupdata.j(s2);
            signupdata.k(s1);
            ((Intent) (obj)).putExtra("extra_signup_data", signupdata);
        }
        setResult(-1, ((Intent) (obj)));
        finish();
    }

    public final cic s()
    {
        return l.dV;
    }
}
