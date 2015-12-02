// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.airtel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import chp;
import com.ubercab.payment.internal.inject.PaymentActivityWithInjection;
import com.ubercab.payment.internal.model.GatewayInfo;
import com.ubercab.payment.internal.network.PaymentProfileClient;
import com.ubercab.payment.internal.network.model.CheckBalanceResponse;
import com.ubercab.payment.internal.ui.ContentLoadingView;
import com.ubercab.payment.internal.vendor.airtel.model.AirtelDepositErrorObject;
import com.ubercab.payment.internal.vendor.airtel.model.AirtelDepositPayload;
import com.ubercab.payment.internal.vendor.airtel.model.request.AirtelDepositRequest;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelCheckBonusResponse;
import com.ubercab.payment.internal.vendor.airtel.model.response.AirtelDepositErrorResponse;
import cwm;
import e;
import f;
import gjz;
import gmg;
import gsd;
import gse;
import gsf;
import gsg;
import gsn;
import gss;
import gtb;
import gtc;
import gtu;
import guo;
import guy;
import gva;
import gvc;
import gve;
import gwa;
import gwb;
import gxa;
import gxb;
import gxc;
import gxd;
import org.json.JSONException;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.airtel:
//            Airtel2faActivity, AirtelLinkPaymentActivity, AirtelAddFundsPromotionView, AirtelAddFundsView, 
//            AirtelAddFundsNoPromotionView, AirtelApi

public class AirtelAddFundsActivity extends PaymentActivityWithInjection
    implements gva, gve, gxa, gxb
{

    public AirtelApi a;
    public chp b;
    public gxc c;
    public gmg d;
    public LayoutInflater e;
    public PaymentProfileClient f;
    private AirtelAddFundsView g;
    private ContentLoadingView h;
    private FrameLayout i;
    private AirtelDepositPayload j;
    private String k;
    private double l;
    private Boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public AirtelAddFundsActivity()
    {
    }

    public static Intent a(Context context, String s, double d1)
    {
        return (new Intent(context, com/ubercab/payment/internal/vendor/airtel/AirtelAddFundsActivity)).putExtra("payment_profile_uuid", (String)gjz.a(s)).putExtra("request_amount", d1).putExtra("should_show_ui", false);
    }

    public static Intent a(Context context, String s, boolean flag)
    {
        return (new Intent(context, com/ubercab/payment/internal/vendor/airtel/AirtelAddFundsActivity)).putExtra("payment_profile_uuid", (String)gjz.a(s)).putExtra("request_amount", 0.0D).putExtra("should_show_ui", true).putExtra("should_show_skip", flag);
    }

    static ContentLoadingView a(AirtelAddFundsActivity airteladdfundsactivity)
    {
        return airteladdfundsactivity.h;
    }

    static Boolean a(AirtelAddFundsActivity airteladdfundsactivity, Boolean boolean1)
    {
        airteladdfundsactivity.m = boolean1;
        return boolean1;
    }

    private void a(int i1)
    {
        setResult(i1);
        finish();
    }

    static void a(AirtelAddFundsActivity airteladdfundsactivity, int i1)
    {
        airteladdfundsactivity.a(i1);
    }

    static void a(AirtelAddFundsActivity airteladdfundsactivity, AirtelDepositErrorResponse airteldepositerrorresponse)
    {
        airteladdfundsactivity.a(airteldepositerrorresponse);
    }

    private void a(AirtelAddFundsNoPromotionView airteladdfundsnopromotionview)
    {
        h.a(false);
        f.a(k, new gtb(this, airteladdfundsnopromotionview) {

            final AirtelAddFundsNoPromotionView a;
            final AirtelAddFundsActivity b;

            private void a(CheckBalanceResponse checkbalanceresponse)
            {
                a.a(checkbalanceresponse.getAmount());
                AirtelAddFundsActivity.a(b).a(true);
            }

            protected final volatile void a(Object obj)
            {
                a((CheckBalanceResponse)obj);
            }

            protected final void a(RetrofitError retrofiterror)
            {
                a.a();
                AirtelAddFundsActivity.a(b).a(true);
                cwm.a(b, gsg.ub__payment_add_funds_check_balance_error);
            }

            
            {
                b = AirtelAddFundsActivity.this;
                a = airteladdfundsnopromotionview;
                super(activity);
            }
        });
    }

    private void a(AirtelDepositErrorResponse airteldepositerrorresponse)
    {
        if (airteldepositerrorresponse.getErrorObj() != null && airteldepositerrorresponse.getErrorObj().getPayload() != null)
        {
            try
            {
                j = new AirtelDepositPayload(airteldepositerrorresponse.getErrorObj().getPayload());
            }
            catch (JSONException jsonexception)
            {
                cwm.a(this, gsg.ub__payment_unexpected_error);
                b.a(e.o);
                a(0);
            }
        }
        if (airteldepositerrorresponse.getError() != null) goto _L2; else goto _L1
_L1:
        cwm.a(this, gsg.ub__payment_unexpected_error);
        b.a(e.o);
        a(0);
_L7:
        return;
_L2:
        String s;
        byte byte0;
        s = airteldepositerrorresponse.getError();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 136
    //                   755443163: 205
    //                   1007851179: 191
    //                   1278225960: 177;
           goto _L3 _L4 _L5 _L6
_L3:
        switch (byte0)
        {
        default:
            cwm.a(this, gsg.ub__payment_unexpected_error);
            a(0);
            return;

        case 0: // '\0'
            if (p)
            {
                airteldepositerrorresponse = airteldepositerrorresponse.getErrorObj();
                gvc.a(airteldepositerrorresponse.getCardFirstDigits(), airteldepositerrorresponse.getCardLastDigits()).show(getSupportFragmentManager(), gvc.a);
                return;
            }
            break;

        case 1: // '\001'
            startActivityForResult(Airtel2faActivity.a(this, airteldepositerrorresponse.getErrorObj().getWebAuthUrl(), airteldepositerrorresponse.getErrorObj().getResponseUrl()), 1);
            return;

        case 2: // '\002'
            startActivityForResult(AirtelLinkPaymentActivity.a(this), 2);
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (s.equals("cvv_entry_required"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (s.equals("web_auth_required"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (s.equals("card_entry_required"))
        {
            byte0 = 2;
        }
          goto _L3
    }

    private void a(guo guo1)
    {
        guo1.a(this);
    }

    private void a(String s, String s1, String s2, String s3, String s4)
    {
        j.putCreditCardData(s, s1.replace(" ", ""), s2, s3, s4);
        l();
_L2:
        return;
        s;
_L3:
        cwm.a(this, gsg.ub__payment_unexpected_error);
        b.a(e.o);
        if (o) goto _L2; else goto _L1
_L1:
        a(0);
        return;
        s;
          goto _L3
    }

    static void b(AirtelAddFundsActivity airteladdfundsactivity)
    {
        airteladdfundsactivity.j();
    }

    private void b(String s)
    {
        j.putCvv(s);
        l();
_L2:
        return;
        s;
_L3:
        cwm.a(this, gsg.ub__payment_unexpected_error);
        b.a(e.o);
        if (o) goto _L2; else goto _L1
_L1:
        a(0);
        return;
        s;
          goto _L3
    }

    static boolean c(AirtelAddFundsActivity airteladdfundsactivity)
    {
        return airteladdfundsactivity.o;
    }

    private guo f()
    {
        return gwa.a().a(gss.a(getApplication())).a(gss.a()).a();
    }

    private void h()
    {
        o = getIntent().getBooleanExtra("should_show_ui", true);
        n = getIntent().getBooleanExtra("should_show_skip", false);
        l = getIntent().getDoubleExtra("request_amount", 0.0D);
        k = (String)gjz.a(gtu.c(getIntent()));
    }

    private void i()
    {
        setContentView(gse.ub__payment_activity_airtel_add_funds);
        h = (ContentLoadingView)findViewById(gsd.ub__payment_airtel_add_funds_content_loading);
        i = (FrameLayout)findViewById(gsd.ub__payment_airtel_add_funds_content_placeholder);
    }

    private void j()
    {
        if (m.booleanValue())
        {
            g = (AirtelAddFundsPromotionView)e.inflate(gse.ub__payment_view_airtel_add_funds_promotion, i, false);
        } else
        {
            g = (AirtelAddFundsNoPromotionView)e.inflate(gse.ub__payment_view_airtel_add_funds_no_promotion, i, false);
            a((AirtelAddFundsNoPromotionView)g);
        }
        g.a(this);
        g.a(this);
        i.addView(g, -1, -1);
        g.d();
    }

    private void k()
    {
        h.a(false);
        a.checkBonusStatus(k, new gtb(this) {

            final AirtelAddFundsActivity a;

            private void a(AirtelCheckBonusResponse airtelcheckbonusresponse)
            {
                AirtelAddFundsActivity.a(a, Boolean.valueOf(airtelcheckbonusresponse.getEligibleForBonus()));
                AirtelAddFundsActivity.b(a);
                AirtelAddFundsActivity.a(a).a(true);
            }

            protected final volatile void a(Object obj)
            {
                a((AirtelCheckBonusResponse)obj);
            }

            protected final void a(RetrofitError retrofiterror)
            {
                AirtelAddFundsActivity.a(a, Boolean.valueOf(false));
                AirtelAddFundsActivity.b(a);
                AirtelAddFundsActivity.a(a).a(true);
            }

            
            {
                a = AirtelAddFundsActivity.this;
                super(activity);
            }
        });
    }

    private void l()
    {
        Object obj1 = null;
        h.a(false);
        Object obj;
        if (j != null)
        {
            obj1 = c.a(j.toString());
            if (obj1 == null)
            {
                cwm.a(this, gsg.ub__payment_unexpected_error);
                b.a(e.o);
                a(0);
                return;
            }
            obj = ((gxd) (obj1)).a();
            obj1 = ((gxd) (obj1)).b();
        } else
        {
            obj = null;
        }
        obj = AirtelDepositRequest.create(l, m.booleanValue(), "android", ((String) (obj)), ((String) (obj1)));
        a.deposit(k, ((AirtelDepositRequest) (obj)), new gtc(this, com/ubercab/payment/internal/vendor/airtel/model/response/AirtelDepositErrorResponse) {

            final AirtelAddFundsActivity a;

            private void a(AirtelDepositErrorResponse airteldepositerrorresponse)
            {
                AirtelAddFundsActivity.a(a, airteldepositerrorresponse);
            }

            public final void a(Exception exception)
            {
                super.a(exception);
                a.b.a(e.o);
                if (!AirtelAddFundsActivity.c(a))
                {
                    AirtelAddFundsActivity.a(a, 0);
                }
            }

            public final void a(Object obj2)
            {
                cwm.a(a, gsg.ub__payment_airtel_add_funds_success);
                AirtelAddFundsActivity.a(a, -1);
            }

            public final void a(RetrofitError retrofiterror)
            {
                super.a(retrofiterror);
                a.b.a(e.o);
                if (!AirtelAddFundsActivity.c(a))
                {
                    AirtelAddFundsActivity.a(a, 0);
                }
            }

            public final void a(boolean flag)
            {
                AirtelAddFundsActivity.a(a).a(true);
            }

            public final void b(Object obj2)
            {
                a((AirtelDepositErrorResponse)obj2);
            }

            
            {
                a = AirtelAddFundsActivity.this;
                super(activity, class1);
            }
        });
    }

    public final void a(double d1)
    {
        l = d1;
        l();
    }

    protected final volatile void a(Object obj)
    {
        a((guo)obj);
    }

    public final void a(String s)
    {
        b(s);
    }

    public final void b(double d1)
    {
        l = d1;
        l();
    }

    protected final Object c()
    {
        return f();
    }

    public final void d()
    {
        guy.b().show(getSupportFragmentManager(), guy.a);
    }

    public final void e()
    {
        if (!o)
        {
            a(0);
        }
        j = null;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            switch (j1)
            {
            default:
                return;

            case -1: 
                if (!o)
                {
                    a(0);
                }
                j = null;
                return;

            case 1: // '\001'
                cwm.a(this, gsg.ub__payment_airtel_add_funds_success);
                a(-1);
                return;

            case 0: // '\0'
                cwm.a(this, gsg.ub__payment_add_funds_2fa_error);
                break;
            }
            if (!o)
            {
                a(0);
            }
            j = null;
            return;

        case 2: // '\002'
            break;
        }
        if (j1 == -1)
        {
            GatewayInfo gatewayinfo = (GatewayInfo)intent.getParcelableExtra("credit_card_info");
            intent = intent.getStringExtra("card_type");
            a(gatewayinfo.getCardCode(), gatewayinfo.getCardNumber(), gatewayinfo.getCardExpirationMonth(), gatewayinfo.getCardExpirationYear(), intent);
            return;
        }
        if (!o)
        {
            a(0);
        }
        j = null;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        h();
        i();
        boolean flag;
        if (bundle != null)
        {
            l = bundle.getDouble("request_amount", 0.0D);
            m = Boolean.valueOf(bundle.getBoolean("should_apply_promotion", false));
            if (bundle.containsKey("json_payload"))
            {
                j = (AirtelDepositPayload)bundle.getParcelable("json_payload");
            }
            if (o)
            {
                j();
            }
        } else
        if (!o)
        {
            m = Boolean.valueOf(false);
            l();
        } else
        if (d.b(gsn.d))
        {
            m = Boolean.valueOf(false);
            j();
        } else
        {
            k();
        }
        bundle = b();
        if (!n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.b(flag);
        p = true;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(gsf.ub__payment_menu_airtel_add_funds, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            setResult(0);
            onBackPressed();
            return true;
        }
        if (menuitem.getItemId() != gsd.ub__payment_menu_airtel_add_funds_skip) goto _L2; else goto _L1
_L1:
        if (!Boolean.TRUE.equals(m)) goto _L4; else goto _L3
_L3:
        b.a(f.q);
_L5:
        a(0);
        return true;
_L4:
        if (Boolean.FALSE.equals(m))
        {
            b.a(f.r);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return super.onOptionsItemSelected(menuitem);
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        menu.findItem(gsd.ub__payment_menu_airtel_add_funds_skip).setVisible(n);
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        if (g != null)
        {
            g.d();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putDouble("request_amount", l);
        if (m != null)
        {
            bundle.putBoolean("should_apply_promotion", m.booleanValue());
        }
        if (j != null)
        {
            bundle.putParcelable("json_payload", j);
        }
        p = false;
        super.onSaveInstanceState(bundle);
    }
}
