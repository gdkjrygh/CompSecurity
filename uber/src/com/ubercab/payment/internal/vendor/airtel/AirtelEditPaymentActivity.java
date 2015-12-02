// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import chp;
import com.ubercab.payment.internal.inject.EditPaymentActivityWithInjection;
import com.ubercab.payment.internal.model.PaymentEditOptions;
import com.ubercab.payment.internal.network.PaymentProfileClient;
import com.ubercab.payment.internal.network.model.CheckBalanceResponse;
import com.ubercab.payment.model.PaymentProfile;
import cwm;
import e;
import f;
import gsd;
import gse;
import gsf;
import gsg;
import gss;
import gtb;
import gvg;
import gvh;
import gwo;
import gwp;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            AirtelAddFundsActivity

public class AirtelEditPaymentActivity extends EditPaymentActivityWithInjection
    implements android.view.View.OnClickListener
{

    public chp a;
    public PaymentProfileClient b;
    private boolean c;
    private ProgressBar d;
    private Button e;
    private Button f;
    private TextView g;

    public AirtelEditPaymentActivity()
    {
    }

    static ProgressBar a(AirtelEditPaymentActivity airteleditpaymentactivity)
    {
        return airteleditpaymentactivity.d;
    }

    private void a(gvg gvg1)
    {
        gvg1.a(this);
    }

    private void a(boolean flag)
    {
        boolean flag1 = false;
        c = flag;
        invalidateOptionsMenu();
        Button button = e;
        int i1;
        if (!flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        button.setVisibility(i1);
        button = f;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        button.setVisibility(i1);
    }

    static TextView b(AirtelEditPaymentActivity airteleditpaymentactivity)
    {
        return airteleditpaymentactivity.g;
    }

    public static PaymentProfile c(AirtelEditPaymentActivity airteleditpaymentactivity)
    {
        return airteleditpaymentactivity.c();
    }

    public static PaymentProfile d(AirtelEditPaymentActivity airteleditpaymentactivity)
    {
        return airteleditpaymentactivity.c();
    }

    private gvg f()
    {
        return gwo.a().a(gss.a(getApplication())).a();
    }

    private void h()
    {
        a.a(f.u);
        startActivity(AirtelAddFundsActivity.a(this, c().getUuid(), false));
    }

    private void i()
    {
        a.a(f.v);
        gvh gvh1 = new gvh(this, a);
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(this)).setMessage(gsg.ub__payment_delete_confirm).setPositiveButton(gsg.ub__payment_delete, gvh1).setNegativeButton(gsg.ub__payment_cancel, gvh1).create();
        alertdialog.setOnShowListener(gvh1);
        alertdialog.show();
    }

    private void j()
    {
        setContentView(gse.ub__payment_activity_airtel_edit);
        e = (Button)findViewById(gsd.ub__payment_airtel_edit_button_add_funds);
        f = (Button)findViewById(gsd.ub__payment_airtel_edit_button_delete);
        d = (ProgressBar)findViewById(gsd.ub__payment_airtel_edit_progressbar_balance);
        g = (TextView)findViewById(gsd.ub__payment_airtel_edit_textview_current_balance_value);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
    }

    private void k()
    {
        ActionBar actionbar = b();
        if (actionbar != null)
        {
            actionbar.a(getString(gsg.ub__payment_payment));
            actionbar.b(true);
        }
    }

    private void l()
    {
        b.a(c(), new gtb(this) {

            final AirtelEditPaymentActivity a;

            private void a(CheckBalanceResponse checkbalanceresponse)
            {
                AirtelEditPaymentActivity.b(a).setText(checkbalanceresponse.getDisplayAmount());
            }

            protected final void a()
            {
                AirtelEditPaymentActivity.a(a).setVisibility(8);
            }

            protected final volatile void a(Object obj)
            {
                a((CheckBalanceResponse)obj);
            }

            protected final void a(RetrofitError retrofiterror)
            {
                cwm.a(a, gsg.ub__payment_add_funds_check_balance_error);
            }

            
            {
                a = AirtelEditPaymentActivity.this;
                super(activity);
            }
        });
    }

    protected final volatile void a(Object obj)
    {
        a((gvg)obj);
    }

    protected final Object e()
    {
        return f();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 100 100: default 20
    //                   100 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(i1, j1, intent);
_L4:
        return;
_L2:
        if (j1 == -1)
        {
            a(c());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBackPressed()
    {
        if (c)
        {
            a(false);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onClick(View view)
    {
        if (view == e)
        {
            h();
        } else
        if (view == f)
        {
            i();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        boolean flag;
        if (bundle != null)
        {
            flag = bundle.getBoolean("is_edit_mode", false);
        } else
        {
            flag = getIntent().getBooleanExtra("is_edit_mode", false);
        }
        c = flag;
        k();
        j();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag = false;
        getMenuInflater().inflate(gsf.ub__payment_menu_airtel_edit, menu);
        MenuItem menuitem = menu.findItem(gsd.ub__payment_menu_edit);
        menu = menu.findItem(gsd.ub__payment_menu_done);
        if (d() == null || !d().isDeleteAllowed())
        {
            menuitem.setVisible(false);
            menu.setVisible(false);
            return true;
        }
        if (!c)
        {
            flag = true;
        }
        menuitem.setVisible(flag);
        menu.setVisible(c);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        }
        if (menuitem.getItemId() == gsd.ub__payment_menu_edit)
        {
            a(true);
            return true;
        }
        if (menuitem.getItemId() == gsd.ub__payment_menu_done)
        {
            a(false);
            return true;
        } else
        {
            return false;
        }
    }

    public void onResume()
    {
        super.onResume();
        a(c);
        a.a(e.A);
        l();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_edit_mode", c);
    }
}
