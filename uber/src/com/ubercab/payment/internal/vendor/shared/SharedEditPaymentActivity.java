// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.shared;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import chp;
import cic;
import cif;
import com.ubercab.payment.internal.activity.EditPaymentActivity;
import com.ubercab.payment.internal.model.PaymentEditOptions;
import com.ubercab.payment.internal.model.PaymentEditResult;
import com.ubercab.payment.model.PaymentProfile;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import gry;
import gsa;
import gsd;
import gse;
import gsg;

public class SharedEditPaymentActivity extends EditPaymentActivity
{

    private chp a;

    public SharedEditPaymentActivity()
    {
    }

    private void a(cic cic)
    {
        if (cic != null)
        {
            a.a(cic);
        }
    }

    private void a(cif cif)
    {
        if (cif != null)
        {
            a.a(cif);
        }
    }

    static void a(SharedEditPaymentActivity sharededitpaymentactivity)
    {
        sharededitpaymentactivity.k();
    }

    static void a(SharedEditPaymentActivity sharededitpaymentactivity, cif cif)
    {
        sharededitpaymentactivity.a(cif);
    }

    static void a(SharedEditPaymentActivity sharededitpaymentactivity, PaymentProfile paymentprofile, PaymentEditResult paymenteditresult)
    {
        sharededitpaymentactivity.a(paymentprofile, paymenteditresult);
    }

    static PaymentProfile b(SharedEditPaymentActivity sharededitpaymentactivity)
    {
        return sharededitpaymentactivity.c();
    }

    static void c(SharedEditPaymentActivity sharededitpaymentactivity)
    {
        sharededitpaymentactivity.j();
    }

    private void j()
    {
        startActivityForResult(gsa.a(this, c().getTokenType()).b(c()), 100);
    }

    private void k()
    {
        (new android.app.AlertDialog.Builder(this)).setTitle(getString(gsg.ub__payment_confirmation)).setMessage(getString(gsg.ub__payment_delete_confirm)).setPositiveButton(gsg.ub__payment_delete, new android.content.DialogInterface.OnClickListener() {

            final SharedEditPaymentActivity a;

            public final void onClick(DialogInterface dialoginterface, int l)
            {
                SharedEditPaymentActivity.a(a, a.i());
                SharedEditPaymentActivity.c(a);
            }

            
            {
                a = SharedEditPaymentActivity.this;
                super();
            }
        }).setNegativeButton(gsg.ub__payment_cancel, new android.content.DialogInterface.OnClickListener() {

            final SharedEditPaymentActivity a;

            public final void onClick(DialogInterface dialoginterface, int l)
            {
                SharedEditPaymentActivity.a(a, a.h());
            }

            
            {
                a = SharedEditPaymentActivity.this;
                super();
            }
        }).show();
    }

    public cic e()
    {
        return null;
    }

    public cif f()
    {
        return null;
    }

    public cif h()
    {
        return null;
    }

    public cif i()
    {
        return null;
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        if (l == 100 && i1 == -1)
        {
            a(c());
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(gse.ub__payment_activity_shared_edit);
        if (b() != null)
        {
            b().b(true);
        }
        if (a == null)
        {
            a = g().e();
        }
        ((ImageView)findViewById(gsd.ub__shared_edit_imageview)).setImageDrawable(gsa.a(this, c().getTokenType()).d());
        ((TextView)findViewById(gsd.ub__shared_edit_textview_title)).setText(c().getDisplayName(getResources()));
        bundle = (Button)findViewById(gsd.ub__shared_edit_button_delete);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final SharedEditPaymentActivity a;

            public final void onClick(View view)
            {
                SharedEditPaymentActivity.a(a, a.f());
                SharedEditPaymentActivity.a(a);
            }

            
            {
                a = SharedEditPaymentActivity.this;
                super();
            }
        });
        Button button = (Button)findViewById(gsd.ub__shared_edit_button_set_as_payment);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final SharedEditPaymentActivity a;

            public final void onClick(View view)
            {
                view = PaymentEditResult.create(Boolean.valueOf(true));
                SharedEditPaymentActivity.a(a, SharedEditPaymentActivity.b(a), view);
            }

            
            {
                a = SharedEditPaymentActivity.this;
                super();
            }
        });
        if (d().isSelectAsPaymentAllowed())
        {
            button.setVisibility(0);
        }
        if (d().isSelectedAsPayment())
        {
            button.setEnabled(false);
        }
        if (!d().isDeleteAllowed())
        {
            bundle.setVisibility(8);
            findViewById(gsd.ub__shared_edit_textview_nodelete).setVisibility(0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        a(e());
    }
}
