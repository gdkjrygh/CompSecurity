// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import bhx;
import bhy;
import bhz;
import bia;
import bic;
import bie;
import cic;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.LineItem;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.ProxyCard;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.ApiResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.City;
import czf;
import czj;
import dal;
import dfe;
import dfp;
import dkn;
import dlo;
import dtg;
import dwh;
import dwi;
import dwn;
import dwo;
import dxf;
import eqg;
import eqm;
import gjz;
import gkf;
import hkr;
import ijg;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import rz;
import sq;
import sr;
import ss;
import st;

public class GoogleWalletActivity extends RiderActivity
    implements ss, st
{

    private static final List m;
    public hkr h;
    public dkn i;
    public czf j;
    public dal k;
    public eqm l;
    private int n;
    private boolean o;
    private boolean p;
    private String q;
    private FullWallet r;
    private MaskedWallet s;
    private dwo t;
    private ProgressDialog u;
    private sq v;

    public GoogleWalletActivity()
    {
    }

    public static sq a(GoogleWalletActivity googlewalletactivity)
    {
        return googlewalletactivity.v;
    }

    private void a(dwn dwn1)
    {
        dwn1.a(this);
    }

    public static boolean a(Context context, String s1)
    {
        if ("CHINA".equals(s1))
        {
            return false;
        }
        if (!dxf.b(context))
        {
            return false;
        }
        context = ((TelephonyManager)context.getSystemService("phone")).getSimCountryIso();
        if (TextUtils.isEmpty(context))
        {
            return m.contains(Locale.getDefault());
        }
        for (s1 = m.iterator(); s1.hasNext();)
        {
            if (context.equalsIgnoreCase(((Locale)s1.next()).getCountry()))
            {
                return true;
            }
        }

        return false;
    }

    private dwn b(dfp dfp)
    {
        return dwh.a().a(new dfe(this)).a(new eqg()).a(dfp).a();
    }

    private void b(ConnectionResult connectionresult)
    {
        if (connectionresult == null)
        {
            return;
        }
        int i1 = connectionresult.c();
        if (connectionresult.a())
        {
            try
            {
                connectionresult.a(this, 8000);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ConnectionResult connectionresult)
            {
                j();
            }
            return;
        }
        if (rz.b(i1))
        {
            rz.a(i1, this, 8000, new android.content.DialogInterface.OnCancelListener() {

                final GoogleWalletActivity a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    GoogleWalletActivity.a(a).b();
                }

            
            {
                a = GoogleWalletActivity.this;
                super();
            }
            }).show();
            return;
        }
        switch (i1)
        {
        default:
            c(i1);
            return;

        case 7: // '\007'
        case 8: // '\b'
            j();
            break;
        }
    }

    private void c(int i1)
    {
        i1;
        JVM INSTR tableswitch 402 413: default 64
    //                   402 82
    //                   403 64
    //                   404 82
    //                   405 82
    //                   406 82
    //                   407 64
    //                   408 64
    //                   409 69
    //                   410 64
    //                   411 82
    //                   412 82
    //                   413 82;
           goto _L1 _L2 _L1 _L2 _L2 _L2 _L1 _L1 _L3 _L1 _L2 _L2 _L2
_L1:
        finish();
        return;
_L3:
        a_(getString(0x7f070263));
        continue; /* Loop/switch isn't completed */
_L2:
        d(i1);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void d(int i1)
    {
        ijg.b("Unrecoverable Google Wallet Error: %d", new Object[] {
            Integer.valueOf(i1)
        });
        a_(getString(0x7f070262));
        setResult(0, getIntent());
    }

    private void f()
    {
        Object obj = Double.toString(833.33000000000004D);
        String s1 = Currency.getInstance(Locale.US).getCurrencyCode();
        obj = MaskedWalletRequest.a().c().b(s1).a().b().c("Uber").a(((String) (obj))).d();
        p = true;
        bic.a(v, ((MaskedWalletRequest) (obj)));
    }

    private void g()
    {
        p = true;
        bic.a(v, s.b(), s.c());
    }

    private void h()
    {
        p = true;
        if (s == null)
        {
            f();
            return;
        }
        String s1 = k.E();
        Object obj = h.b();
        Object obj1;
        String s2;
        String s3;
        if (obj != null)
        {
            obj = ((City) (obj)).getCityName();
        } else
        {
            obj = null;
        }
        obj1 = String.format("%s %s %s", new Object[] {
            "Uber", obj, s1
        });
        s2 = Integer.toString(1);
        obj = Double.toString(833.33000000000004D);
        s3 = Double.toString(833.33000000000004D);
        s1 = Currency.getInstance(Locale.US).getCurrencyCode();
        obj1 = LineItem.a().a(((String) (obj1))).e(s1).d(((String) (obj))).c(s3).b(s2).a();
        obj = Cart.a().b(s1).a(((String) (obj))).a(((LineItem) (obj1))).a();
        obj = FullWalletRequest.a().a(s.b()).b(s.c()).a(((Cart) (obj))).a();
        bic.a(v, ((FullWalletRequest) (obj)));
    }

    private void i()
    {
        if (u != null)
        {
            u.dismiss();
            return;
        } else
        {
            u = dtg.b(this, getString(0x7f070264));
            u.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final GoogleWalletActivity a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    a.setResult(0);
                    a.finish();
                }

            
            {
                a = GoogleWalletActivity.this;
                super();
            }
            });
            u.show();
            return;
        }
    }

    private void j()
    {
        if (n >= 3)
        {
            d(402);
            return;
        } else
        {
            android.os.Message message = t.obtainMessage(400);
            long l1 = (long)(2000D * Math.pow(2D, n));
            t.sendMessageDelayed(message, l1);
            n = n + 1;
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1)
    {
    }

    public final void a(Bundle bundle)
    {
        if (!p)
        {
            if (s == null)
            {
                bic.a(v);
                return;
            }
            if (q.equals("com.ubercab.ACTION_CHANGE_MASKED_WALLET"))
            {
                g();
                return;
            }
            if (q.equals("com.ubercab.ACTION_LOAD_MASKED_WALLET"))
            {
                f();
                return;
            }
            if (q.equals("com.ubercab.ACTION_LOAD_FULL_WALLET") || q.equals("com.ubercab.ACTION_CREATE_PAYMENT_PROFILE"))
            {
                h();
                return;
            }
        }
    }

    public final void a(ConnectionResult connectionresult)
    {
        b(connectionresult);
    }

    public final volatile void a(czj czj)
    {
        a((dwn)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        gjz.a(getIntent().getAction());
        if (!a(this, null))
        {
            finish();
            return;
        } else
        {
            i();
            q = getIntent().getAction();
            s = (MaskedWallet)getIntent().getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
            bundle = (new bie()).a(j.n()).a();
            v = (new sr(this)).a(bic.a, bundle).a(this).a(this).b();
            t = new dwo(this);
            return;
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        p = false;
        if (j1 == 0)
        {
            setResult(0);
            finish();
        } else
        {
            if (j1 == 1)
            {
                if (intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 0) == 410)
                {
                    s = null;
                    r = null;
                    f();
                    return;
                } else
                {
                    a_(getString(0x7f070262));
                    setResult(0);
                    finish();
                    return;
                }
            }
            if (i1 == 8001 && j1 == -1)
            {
                o = intent.getBooleanExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", false);
                f();
                return;
            }
            if (i1 == 8003 && j1 == -1)
            {
                setResult(j1, intent);
                finish();
                return;
            }
            if (i1 == 8002 && j1 == -1)
            {
                s = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                if (q.equals("com.ubercab.ACTION_CHANGE_MASKED_WALLET"))
                {
                    if (o)
                    {
                        g();
                        return;
                    } else
                    {
                        setResult(j1, intent);
                        finish();
                        return;
                    }
                }
                if (q.equals("com.ubercab.ACTION_LOAD_MASKED_WALLET"))
                {
                    setResult(j1, intent);
                    finish();
                    return;
                }
                if (q.equals("com.ubercab.ACTION_LOAD_FULL_WALLET") || q.equals("com.ubercab.ACTION_CREATE_PAYMENT_PROFILE"))
                {
                    h();
                    return;
                }
            }
            if (i1 == 8004 && j1 == -1)
            {
                r = (FullWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET");
                if (r == null)
                {
                    s = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                    h();
                    return;
                }
                if (q.equals("com.ubercab.ACTION_LOAD_FULL_WALLET"))
                {
                    intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", s);
                    setResult(-1, intent);
                    finish();
                    return;
                }
                if (q.equals("com.ubercab.ACTION_CREATE_PAYMENT_PROFILE"))
                {
                    intent = r.b();
                    Address address = r.c();
                    i.a(l.a(intent.b()), l.a(Integer.toString(intent.d())), l.a(Integer.toString(intent.e())), l.a(intent.c()), address.b(), address.c(), "personal", true, false);
                    return;
                }
            }
        }
    }

    public void onCreatePaymentProfileResponseEvent(dlo dlo1)
    {
        if (dlo1.e())
        {
            Intent intent = new Intent();
            dlo1 = ((Ping)dlo1.g()).getApiResponse().getData();
            if (dlo1 != null && dlo1.containsKey("uuid"))
            {
                intent.putExtra("com.ubercab.PAYMENT_PROFILE_UUID", (String)dlo1.get("uuid"));
            }
            intent.putExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET", r);
            intent.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", s);
            setResult(-1, intent);
            finish();
            return;
        } else
        {
            a_(getString(0x7f070262));
            setResult(0);
            finish();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        i();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        r = (FullWallet)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_FULL_WALLET");
        s = (MaskedWallet)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
        p = bundle.getBoolean("com.ubercab.SDK_IN_FORGROUND");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.google.android.gms.wallet.EXTRA_FULL_WALLET", r);
        bundle.putParcelable("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", s);
        bundle.putBoolean("com.ubercab.SDK_IN_FORGROUND", p);
    }

    protected void onStart()
    {
        super.onStart();
        v.b();
    }

    protected void onStop()
    {
        super.onStop();
        t.removeMessages(400);
        v.c();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    static 
    {
        m = (new gkf()).a(Locale.US).a();
    }
}
