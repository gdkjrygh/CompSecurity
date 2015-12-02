// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.unionpay;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import chp;
import cic;
import com.ubercab.payment.internal.vendor.shared.SharedVerifyPaymentActivity;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.ui.TextView;
import e;
import f;
import gsa;
import gsd;
import gsg;

public class UnionPayVerifyPaymentActivity extends SharedVerifyPaymentActivity
{

    public UnionPayVerifyPaymentActivity()
    {
    }

    static chp a(UnionPayVerifyPaymentActivity unionpayverifypaymentactivity)
    {
        return unionpayverifypaymentactivity.k();
    }

    static chp b(UnionPayVerifyPaymentActivity unionpayverifypaymentactivity)
    {
        return unionpayverifypaymentactivity.k();
    }

    static void c(UnionPayVerifyPaymentActivity unionpayverifypaymentactivity)
    {
        unionpayverifypaymentactivity.m();
    }

    private void m()
    {
        startActivityForResult(gsa.a(this, c().getTokenType()).b(c()), 100);
    }

    private void n()
    {
        (new android.app.AlertDialog.Builder(this)).setTitle(getString(gsg.ub__payment_confirmation)).setMessage(getString(gsg.ub__payment_verify_exit_confirm)).setPositiveButton(gsg.ub__payment_yes, new android.content.DialogInterface.OnClickListener() {

            final UnionPayVerifyPaymentActivity a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                UnionPayVerifyPaymentActivity.b(a).a(f.aq);
                UnionPayVerifyPaymentActivity.c(a);
            }

            
            {
                a = UnionPayVerifyPaymentActivity.this;
                super();
            }
        }).setNegativeButton(gsg.ub__payment_no, new android.content.DialogInterface.OnClickListener() {

            final UnionPayVerifyPaymentActivity a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                UnionPayVerifyPaymentActivity.a(a).a(f.ap);
            }

            
            {
                a = UnionPayVerifyPaymentActivity.this;
                super();
            }
        }).show();
    }

    protected final cic e()
    {
        return e.ah;
    }

    protected final cic f()
    {
        return e.ai;
    }

    protected final cic h()
    {
        return e.aj;
    }

    protected final int j()
    {
        return 6;
    }

    public void onActivityResult(int i, int k, Intent intent)
    {
        if (i == 100 && k == -1)
        {
            setResult(0);
            finish();
        }
    }

    public void onBackPressed()
    {
        k().a(f.ao);
        n();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        findViewById(gsd.ub__shared_verify_button_resendsms).setVisibility(8);
        bundle = (TextView)findViewById(gsd.ub__shared_verify_textview_servicenotice);
        bundle.setVisibility(0);
        bundle.setText(gsg.ub__payment_unionpay_service_notice);
    }
}
