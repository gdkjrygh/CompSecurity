// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import chp;
import cic;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.request.param.Location;
import com.ubercab.rider.realtime.response.LoginResponse;
import czj;
import daj;
import dak;
import dal;
import dfe;
import dfp;
import dkn;
import doy;
import dpg;
import fji;
import fjj;
import fjq;
import fjr;
import fjw;
import fke;
import gqg;
import gqj;
import hjm;
import ica;
import ide;
import n;
import retrofit.RetrofitError;
import retrofit.client.Response;

// Referenced classes of package com.ubercab.client.feature.signin:
//            SignInFragment

public class SignInActivity extends RiderActivity
    implements fjw
{

    public chp h;
    public doy i;
    public hjm j;
    public daj k;
    public dpg l;
    public dak m;
    public RiderApplication n;
    public dkn o;
    public dal p;

    public SignInActivity()
    {
    }

    static void a(SignInActivity signinactivity, boolean flag)
    {
        signinactivity.a(flag);
    }

    private void a(fjq fjq1)
    {
        fjq1.a(this);
    }

    private void a(boolean flag)
    {
        if (!l.n())
        {
            o.d();
        }
        setResult(-1, (new Intent()).putExtra("created_account", flag));
        finish();
    }

    private fjq b(dfp dfp)
    {
        return fji.a().a(new dfe(this)).a(dfp).a(new fjr(this)).a();
    }

    private void f()
    {
        h.a(n.fF);
    }

    private void g()
    {
        if (a(com/ubercab/client/feature/signin/SignInFragment) == null)
        {
            a(0x7f0e049c, new SignInFragment(), false);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(LoginResponse loginresponse, boolean flag)
    {
        if (loginresponse == null)
        {
            return;
        }
        String s1 = loginresponse.getUuid();
        String s2 = loginresponse.getToken();
        loginresponse = loginresponse.getUsername();
        n.a(s1, s2, loginresponse);
        if (l.n())
        {
            if (m.c() != null && m.c().getUberLatLng() != null)
            {
                loginresponse = m.c().getUberLatLng();
                loginresponse = Location.create(loginresponse.a(), loginresponse.b());
            } else
            {
                loginresponse = null;
            }
            i.a(null, loginresponse, j).c(new ide(flag) {

                final boolean a;
                final SignInActivity b;

                private void a()
                {
                    SignInActivity.a(b, a);
                }

                public final void call(Object obj)
                {
                    a();
                }

            
            {
                b = SignInActivity.this;
                a = flag;
                super();
            }
            });
            return;
        } else
        {
            a(flag);
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((fjq)czj);
    }

    public final void a(gqg gqg, Ping ping, Response response)
    {
    }

    public final volatile void a(gqg gqg, gqj gqj, Response response)
    {
        a(gqg, (Ping)gqj, response);
    }

    public final void a(gqg gqg, RetrofitError retrofiterror)
    {
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030181);
        p.a(false);
        g();
    }

    public void onBackPressed()
    {
        f();
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            f();
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public void onSignInSuccessfulEvent(fke fke1)
    {
        Object obj = k.b();
        if (l.d() && !TextUtils.isEmpty(fke1.b()) && !TextUtils.isEmpty(fke1.c()))
        {
            n.a(fke1.c(), fke1.b(), null);
        } else
        if (!l.d() && obj != null && ((Ping) (obj)).getClient() != null)
        {
            Object obj1 = ((Ping) (obj)).getClient();
            obj = ((Client) (obj1)).getUuid();
            String s1 = ((Client) (obj1)).getToken();
            obj1 = ((Client) (obj1)).getEmail();
            n.a(((String) (obj)), s1, ((String) (obj1)));
        }
        if (l.n())
        {
            if (m.c() != null && m.c().getUberLatLng() != null)
            {
                obj = m.c().getUberLatLng();
                obj = Location.create(((UberLatLng) (obj)).a(), ((UberLatLng) (obj)).b());
            } else
            {
                obj = null;
            }
            i.a(null, ((Location) (obj)), j).c(new ide(fke1) {

                final fke a;
                final SignInActivity b;

                private void a()
                {
                    SignInActivity.a(b, a.a());
                }

                public final void call(Object obj2)
                {
                    a();
                }

            
            {
                b = SignInActivity.this;
                a = fke1;
                super();
            }
            });
            return;
        } else
        {
            a(fke1.a());
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    protected final boolean t()
    {
        return true;
    }
}
