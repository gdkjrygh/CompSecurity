// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.alipay;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import chp;
import cic;
import cif;
import com.ubercab.payment.internal.vendor.shared.SharedVerifyPaymentActivity;
import com.ubercab.payment.model.PaymentProfile;
import e;
import f;
import gsa;
import gsd;
import gsg;

public class AlipayVerifyPaymentActivity extends SharedVerifyPaymentActivity
{

    boolean a;

    public AlipayVerifyPaymentActivity()
    {
    }

    static chp a(AlipayVerifyPaymentActivity alipayverifypaymentactivity)
    {
        return alipayverifypaymentactivity.k();
    }

    static chp b(AlipayVerifyPaymentActivity alipayverifypaymentactivity)
    {
        return alipayverifypaymentactivity.k();
    }

    static void c(AlipayVerifyPaymentActivity alipayverifypaymentactivity)
    {
        alipayverifypaymentactivity.m();
    }

    private void m()
    {
        startActivityForResult(gsa.a(this, c().getTokenType()).b(c()), 100);
    }

    private void n()
    {
        (new android.app.AlertDialog.Builder(this)).setTitle(getString(gsg.ub__payment_confirmation)).setMessage(getString(gsg.ub__payment_verify_exit_confirm)).setPositiveButton(gsg.ub__payment_yes, new android.content.DialogInterface.OnClickListener() {

            final AlipayVerifyPaymentActivity a;

            public final void onClick(DialogInterface dialoginterface, int j)
            {
                AlipayVerifyPaymentActivity.b(a).a(f.O);
                AlipayVerifyPaymentActivity.c(a);
            }

            
            {
                a = AlipayVerifyPaymentActivity.this;
                super();
            }
        }).setNegativeButton(gsg.ub__payment_no, new android.content.DialogInterface.OnClickListener() {

            final AlipayVerifyPaymentActivity a;

            public final void onClick(DialogInterface dialoginterface, int j)
            {
                AlipayVerifyPaymentActivity.a(a).a(f.N);
            }

            
            {
                a = AlipayVerifyPaymentActivity.this;
                super();
            }
        }).show();
    }

    protected final void a(boolean flag)
    {
        if (!flag)
        {
            a = false;
        }
    }

    protected final cic e()
    {
        if (a)
        {
            return e.J;
        } else
        {
            return e.M;
        }
    }

    protected final cic f()
    {
        if (a)
        {
            return e.K;
        } else
        {
            return e.N;
        }
    }

    protected final cic h()
    {
        if (a)
        {
            return e.L;
        } else
        {
            return e.O;
        }
    }

    protected final cif i()
    {
        return f.P;
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        if (j == 100 && k == -1)
        {
            setResult(0);
            finish();
        }
    }

    public void onBackPressed()
    {
        k().a(f.M);
        n();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        findViewById(gsd.ub__shared_verify_button_resendsms).setVisibility(8);
        if (bundle == null && !TextUtils.isEmpty(d()))
        {
            a = true;
            a(d());
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        a = bundle.getBoolean("com.ubercab.payment.internal.vendor.alipay.IS_AUTO_VERIFY");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.ubercab.payment.internal.vendor.alipay.IS_AUTO_VERIFY", a);
    }
}
