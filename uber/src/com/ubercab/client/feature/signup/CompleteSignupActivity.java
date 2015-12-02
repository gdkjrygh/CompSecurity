// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.ClientSignupResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.signup.event.SignupPendingEvent;
import com.ubercab.payment.model.CollectedData;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.request.param.Location;
import czj;
import dak;
import dar;
import dfe;
import dfp;
import dkn;
import dkr;
import dlh;
import doy;
import dpb;
import dpg;
import dtp;
import dul;
import fkf;
import fkg;
import fki;
import fkj;
import gjz;
import gmg;
import gtu;
import hjm;
import ica;
import ico;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import l;
import retrofit.client.Response;
import retrofit.mime.TypedInput;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData, ThirdPartyToken

public class CompleteSignupActivity extends RiderActivity
{

    public chp h;
    public doy i;
    public cev j;
    public gmg k;
    public hjm l;
    public dpb m;
    public dpg n;
    public dkn o;
    public dak p;
    public dkr q;
    private CollectedData r;
    private ArrayList s;
    private SignupData t;

    public CompleteSignupActivity()
    {
    }

    public static Intent a(Context context, SignupData signupdata)
    {
        context = new Intent(context, com/ubercab/client/feature/signup/CompleteSignupActivity);
        context.putExtra("extra_signup_data", signupdata);
        return context;
    }

    private void a(dlh dlh1)
    {
        String s1;
        Object obj;
        s1 = null;
        obj = dlh1.h();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (new Scanner(((Response) (obj)).getBody().in())).next();
        s1 = ((String) (obj));
_L4:
        Intent intent = new Intent();
        intent.putExtra("http_status", dlh1.n());
        intent.putExtra("http_body", s1);
        setResult(5002, intent);
        finish();
        return;
_L2:
        s1 = dlh1.c();
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(fkg fkg1)
    {
        fkg1.a(this);
    }

    private fkg b(dfp dfp)
    {
        return fki.a().a(new dfe(this)).a(dfp).a();
    }

    private void b(dlh dlh1)
    {
        String s1;
        if (dlh1.c() != null)
        {
            s1 = dlh1.c();
        } else
        {
            s1 = getString(0x7f070436);
        }
        dtp.a(this, 1, s1);
        dlh1 = AnalyticsEvent.create("impression").setName(l.hh).setValue(dlh1.d());
        h.a(dlh1);
    }

    private void f()
    {
        Object obj = p.c();
        if (obj != null && ((RiderLocation) (obj)).getUberLatLng() != null)
        {
            obj = ((RiderLocation) (obj)).getUberLatLng();
            obj = Location.create(((UberLatLng) (obj)).a(), ((UberLatLng) (obj)).b());
        } else
        {
            obj = null;
        }
        i.a(null, ((Location) (obj)), l).h();
        m.a().a(ico.a()).c(new fkf(this, (byte)0));
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        if (i1 == 1)
        {
            setResult(5001);
            finish();
        }
    }

    public final void a(Client client)
    {
        Intent intent;
        if (client.getPaymentProfiles() != null && !client.getPaymentProfiles().isEmpty())
        {
            client = (PaymentProfile)client.getPaymentProfiles().get(0);
        } else
        {
            client = null;
        }
        intent = new Intent();
        if (client != null)
        {
            intent.putExtra("payment_profile_uuid", client.getUuid());
        }
        setResult(-1, intent);
        finish();
    }

    public final volatile void a(czj czj)
    {
        a((fkg)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        r = gtu.i(getIntent());
        gjz.a(r);
        s = gtu.k(getIntent());
        if (s == null)
        {
            s = new ArrayList();
        }
        t = (SignupData)getIntent().getParcelableExtra("extra_signup_data");
        gjz.a(t);
    }

    public void onClientSignupResponseEvent(dlh dlh1)
    {
        if (s.contains(Integer.valueOf(dlh1.n())))
        {
            u();
            a(dlh1);
            return;
        }
        if (!dlh1.i())
        {
            u();
            b(dlh1);
            h.a(AnalyticsEvent.create("impression").setName(l.hd).setValue(dlh1.f()));
            return;
        }
        if (dlh1.a())
        {
            u();
            j.c(SignupPendingEvent.b(dlh1.b()));
            return;
        }
        Object obj = (ClientSignupResponse)dlh1.g();
        String s1 = ((ClientSignupResponse) (obj)).getUuid();
        String s2 = ((ClientSignupResponse) (obj)).getToken();
        obj = ((ClientSignupResponse) (obj)).getEmail();
        if (s1 == null || s2 == null || obj == null)
        {
            u();
            b(dlh1);
            h.a(AnalyticsEvent.create("impression").setName(l.hd).setValue(dlh1.f()));
            return;
        }
        RiderApplication.a(this).a(s1, s2, ((String) (obj)));
        h.a(AnalyticsEvent.create("impression").setName(l.hB).setValue(dlh1.f()));
        if (!n.n())
        {
            o.d();
            return;
        } else
        {
            f();
            return;
        }
    }

    public void onPause()
    {
        super.onPause();
        u();
    }

    public void onPingEvent(dar dar1)
    {
        if (n.n())
        {
            return;
        }
        dar1 = dar1.a();
        if (dul.a(dar1))
        {
            a(dar1.getClient());
            return;
        } else
        {
            u();
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        String s1;
        String s2;
        String s3;
        ThirdPartyToken thirdpartytoken;
        long l1;
        if (t.h() != null)
        {
            s1 = t.h().a();
        } else
        {
            s1 = null;
        }
        thirdpartytoken = t.m();
        if (thirdpartytoken != null)
        {
            s2 = thirdpartytoken.e();
        } else
        {
            s2 = null;
        }
        if (thirdpartytoken != null)
        {
            s3 = thirdpartytoken.d();
        } else
        {
            s3 = null;
        }
        if (thirdpartytoken != null)
        {
            l1 = thirdpartytoken.b();
        } else
        {
            l1 = 0L;
        }
        q.a(t.a(), t.b(), t.c(), t.e(), t.f(), t.d(), s1, t.j(), s2, s3, l1, r.getData());
        b(getString(0x7f070435), null);
    }

    public void onSignupPendingEvent(SignupPendingEvent signuppendingevent)
    {
        Intent intent = new Intent();
        intent.putExtra("extra_pending_signup_data", signuppendingevent);
        setResult(6001, intent);
        finish();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
