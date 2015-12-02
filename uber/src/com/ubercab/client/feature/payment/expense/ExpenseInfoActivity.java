// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.expense;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import czj;
import czq;
import dfe;
import dfp;
import dkn;
import dle;
import dpg;
import erf;
import ern;
import erw;
import erx;
import esa;
import esb;
import gmg;
import hkm;
import ica;
import icl;
import ico;
import java.util.Collection;
import java.util.Collections;
import n;

// Referenced classes of package com.ubercab.client.feature.payment.expense:
//            ExpenseInfoFragment

public class ExpenseInfoActivity extends RiderActivity
{

    public chp h;
    public dpg i;
    public dkn j;
    public hkm k;
    public czq l;
    public gmg m;
    private icl n;

    public ExpenseInfoActivity()
    {
    }

    public static Intent a(Context context, TripExpenseInfo tripexpenseinfo)
    {
        context = new Intent(context, com/ubercab/client/feature/payment/expense/ExpenseInfoActivity);
        context.setAction("ACTION_CHANGE_EXPENSE_INFO");
        context.putExtra("com.ubercab.EXPENSE_INFO", RiderTripExpenseInfo.create(tripexpenseinfo));
        context.putExtra("EXTRA_SHOW_SKIP_BUTTON", false);
        return context;
    }

    public static Intent a(Context context, TripExpenseInfo tripexpenseinfo, boolean flag, PaymentProfile paymentprofile)
    {
        context = new Intent(context, com/ubercab/client/feature/payment/expense/ExpenseInfoActivity);
        context.setAction("ACTION_SET_EXPENSE_INFO");
        context.putExtra("com.ubercab.EXPENSE_INFO", RiderTripExpenseInfo.create(tripexpenseinfo));
        context.putExtra("EXTRA_SHOW_SKIP_BUTTON", flag);
        context.putExtra("EXTRA_ACTIVITY_STARTED", true);
        if (paymentprofile != null)
        {
            context.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", paymentprofile.getUuid());
            context.putExtra("EXTRA_PAYMENT_PROFILE_UUID", paymentprofile.getUuid());
        }
        return context;
    }

    private void a(RiderTripExpenseInfo ridertripexpenseinfo)
    {
        b(getString(0x7f07063b), new android.content.DialogInterface.OnDismissListener() {

            final ExpenseInfoActivity a;

            public final void onDismiss(DialogInterface dialoginterface)
            {
            }

            
            {
                a = ExpenseInfoActivity.this;
                super();
            }
        });
        if (!i.b())
        {
            j.a(ridertripexpenseinfo);
            return;
        } else
        {
            n = k.a(ridertripexpenseinfo.isExpenseTrip(), ridertripexpenseinfo.getCode(), ridertripexpenseinfo.getMemo()).a(ico.a()).a(new esa(this, (byte)0));
            return;
        }
    }

    public static void a(ExpenseInfoActivity expenseinfoactivity)
    {
        expenseinfoactivity.f();
    }

    private void a(esb esb1)
    {
        esb1.a(this);
    }

    private esb b(dfp dfp)
    {
        return erw.a().a(new dfe(this)).a(dfp).a();
    }

    public static void b(ExpenseInfoActivity expenseinfoactivity)
    {
        expenseinfoactivity.g();
    }

    private void f()
    {
        u();
        finish();
    }

    private void g()
    {
        u();
        Toast.makeText(this, getString(0x7f070631), 0).show();
    }

    private void h()
    {
        if (a(com/ubercab/client/feature/payment/expense/ExpenseInfoFragment) == null)
        {
            TripExpenseInfo tripexpenseinfo = (TripExpenseInfo)getIntent().getParcelableExtra("com.ubercab.EXPENSE_INFO");
            a(0x7f0e0126, ExpenseInfoFragment.a(getIntent().getBooleanExtra("EXTRA_SHOW_SKIP_BUTTON", false), tripexpenseinfo), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((esb)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030066);
        h();
    }

    protected final Collection e()
    {
        return Collections.singleton(l);
    }

    public void onAddExpenseInfoResponseEvent(dle dle1)
    {
        if (dle1.e())
        {
            f();
            return;
        } else
        {
            g();
            return;
        }
    }

    public void onBackPressed()
    {
        h.a(n.ag);
        super.onBackPressed();
    }

    public void onCancelExpenseInfoEvent(erf erf)
    {
        setResult(0, getIntent());
        h.a(n.ag);
        finish();
    }

    public void onPause()
    {
        super.onPause();
        if (n != null && !n.c())
        {
            n.b();
        }
    }

    public void onSaveExpenseInfoEvent(ern ern1)
    {
        Intent intent = getIntent();
        RiderTripExpenseInfo ridertripexpenseinfo = (RiderTripExpenseInfo)intent.getParcelableExtra("com.ubercab.EXPENSE_INFO");
        ridertripexpenseinfo.setCode(ern1.a());
        ridertripexpenseinfo.setMemo(ern1.b());
        h.a(n.ah);
        setResult(-1, intent);
        if (getIntent() != null && "ACTION_CHANGE_EXPENSE_INFO".equals(getIntent().getAction()))
        {
            a(ridertripexpenseinfo);
            return;
        } else
        {
            finish();
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
