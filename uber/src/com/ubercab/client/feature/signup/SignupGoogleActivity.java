// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import bac;
import bae;
import baf;
import bbn;
import bbo;
import bbp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.vendor.google.GoogleApiActivity;
import czj;
import dfe;
import dfp;
import dkn;
import dkr;
import dmi;
import dnv;
import dpg;
import duj;
import dwm;
import fks;
import fkt;
import fme;
import fmf;
import gqg;
import gqj;
import hkp;
import ica;
import icl;
import ico;
import java.util.Locale;
import java.util.concurrent.Executor;
import retrofit.client.Response;
import rq;
import sq;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData

public class SignupGoogleActivity extends GoogleApiActivity
{

    public dpg i;
    public dkn j;
    public RiderApplication k;
    public dkr l;
    public hkp m;
    private String n;
    private Executor o;
    private icl p;
    private String q;
    private SignupData r;

    public SignupGoogleActivity()
    {
    }

    static icl a(SignupGoogleActivity signupgoogleactivity, icl icl1)
    {
        signupgoogleactivity.p = icl1;
        return icl1;
    }

    static String a(SignupGoogleActivity signupgoogleactivity)
    {
        return signupgoogleactivity.n;
    }

    static String a(SignupGoogleActivity signupgoogleactivity, String s1)
    {
        signupgoogleactivity.n = s1;
        return s1;
    }

    private void a(SignupData signupdata)
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.SIGNUP_DATA", signupdata);
        setResult(-1, intent);
        finish();
    }

    public static void a(SignupGoogleActivity signupgoogleactivity, String s1, String s2)
    {
        signupgoogleactivity.a(s1, s2, ((String) (null)));
    }

    private void a(fmf fmf1)
    {
        fmf1.a(this);
    }

    private void a(String s1, String s2, String s3)
    {
        k.a(s1, s2, s3);
        setResult(1);
        finish();
    }

    private fmf b(dfp dfp)
    {
        return fks.a().a(new dfe(this)).a(dfp).a();
    }

    static String b(SignupGoogleActivity signupgoogleactivity)
    {
        return signupgoogleactivity.q;
    }

    static String b(SignupGoogleActivity signupgoogleactivity, String s1)
    {
        signupgoogleactivity.q = s1;
        return s1;
    }

    private void b(String s1)
    {
        dwm.a(this, q);
        u();
        a_(s1);
        setResult(0);
    }

    public static void c(SignupGoogleActivity signupgoogleactivity)
    {
        signupgoogleactivity.i();
    }

    public static void c(SignupGoogleActivity signupgoogleactivity, String s1)
    {
        signupgoogleactivity.b(s1);
    }

    private String g()
    {
        return baf.h.a(h);
    }

    private bbn h()
    {
        return baf.g.a(h);
    }

    private void i()
    {
        SignupData signupdata = SignupData.n().a(n).i(q);
        Object obj = (TelephonyManager)getSystemService("phone");
        if (!TextUtils.isEmpty(((TelephonyManager) (obj)).getLine1Number()) && !TextUtils.isEmpty(((TelephonyManager) (obj)).getSimCountryIso()))
        {
            signupdata.b(duj.b(((TelephonyManager) (obj)).getLine1Number(), ((TelephonyManager) (obj)).getSimCountryIso()));
            signupdata.c(((TelephonyManager) (obj)).getSimCountryIso().toUpperCase(Locale.US));
        }
        obj = h();
        if (obj != null)
        {
            if (((bbn) (obj)).g())
            {
                signupdata.e(((bbn) (obj)).f().e());
                signupdata.f(((bbn) (obj)).f().d());
            }
            if (((bbn) (obj)).e() && ((bbn) (obj)).d().e())
            {
                signupdata.g(((bbn) (obj)).d().d());
            }
        }
        if (signupdata.o())
        {
            r = signupdata;
            b(getString(0x7f070667), null);
            l.a(signupdata.a(), signupdata.b(), signupdata.c(), "thisisnotarealpassword1234567$");
            return;
        } else
        {
            a(signupdata);
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    final String a(String s1, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("suppressProgressScreen", true);
        return rq.a(this, s1, s2, bundle);
    }

    public final void a(Bundle bundle)
    {
        bundle = getResources().getString(0x7f0706c0);
        AsyncTask asynctask = new AsyncTask(g(), bundle) {

            final String a;
            final String b;
            final SignupGoogleActivity c;
            private Exception d;

            private transient String a()
            {
                String s1;
                try
                {
                    s1 = c.a(a, b);
                }
                catch (Exception exception)
                {
                    d = exception;
                    return null;
                }
                return s1;
            }

            private void a(String s1)
            {
                if (c.isFinishing())
                {
                    return;
                }
                if (d != null)
                {
                    c.a_(d.getMessage());
                    c.setResult(0);
                    c.finish();
                    return;
                }
                SignupGoogleActivity.a(c, a);
                SignupGoogleActivity.b(c, s1);
                if (!c.i.d())
                {
                    c.j.i(SignupGoogleActivity.a(c), SignupGoogleActivity.b(c));
                    return;
                } else
                {
                    SignupGoogleActivity.a(c, c.m.a(SignupGoogleActivity.a(c), SignupGoogleActivity.b(c)).a(ico.a()).a(new fme(c, (byte)0)));
                    return;
                }
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj)
            {
                a((String)obj);
            }

            protected final void onPreExecute()
            {
                c.b(c.getString(0x7f070296), null);
            }

            
            {
                c = SignupGoogleActivity.this;
                a = s1;
                b = s2;
                super();
            }
        };
        if (o != null)
        {
            bundle = o;
        } else
        {
            bundle = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        asynctask.executeOnExecutor(bundle, new Void[0]);
    }

    public final volatile void a(czj czj)
    {
        a((fmf)czj);
    }

    public final void a(gqg gqg, Ping ping, Response response)
    {
    }

    public final volatile void a(gqg gqg, gqj gqj, Response response)
    {
        a(gqg, (Ping)gqj, response);
    }

    public final void b(Bundle bundle)
    {
        super.b(bundle);
        b(getString(0x7f070296), null);
    }

    public void onLoginGoogleResponseEvent(dmi dmi1)
    {
        if (!h.d())
        {
            return;
        }
        if (dmi1.e())
        {
            dmi1 = (Ping)dmi1.g();
            a(dmi1.getClient().getUuid(), dmi1.getClient().getToken(), dmi1.getClient().getEmail());
            return;
        }
        if (dmi1.h() != null)
        {
            b(dmi1.a(this));
            return;
        } else
        {
            i();
            return;
        }
    }

    public void onPause()
    {
        super.onPause();
        if (p != null)
        {
            p.b();
        }
    }

    public void onValidateAccountResponseEvent(dnv dnv1)
    {
        u();
        if (!dnv1.i() || r == null)
        {
            a_(getString(0x7f0702a9));
            setResult(0);
            finish();
            return;
        } else
        {
            a(r);
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
