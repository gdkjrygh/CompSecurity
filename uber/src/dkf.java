// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Build;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.PasswordResetCommonData;
import com.ubercab.client.core.model.PasswordResetData;
import com.ubercab.client.core.network.PasswordResetApi;

public final class dkf
{

    private final chp a;
    private final gju b;
    private final Context c;
    private final PasswordResetApi d;
    private final cyy e;
    private final dak f;
    private final dao g;
    private dkg h;

    public dkf(Context context, cyy cyy1, PasswordResetApi passwordresetapi, dak dak1, dao dao1, gju gju1, chp chp)
    {
        d = passwordresetapi;
        e = cyy1;
        c = context;
        f = dak1;
        g = dao1;
        b = gju1;
        a = chp;
    }

    static dkg a(dkf dkf1)
    {
        return dkf1.h;
    }

    private String a()
    {
        return cxf.a(cwt.a(c));
    }

    private void a(PasswordResetData passwordresetdata)
    {
        RiderLocation riderlocation = f.c();
        String s1 = cyy.b();
        String s2 = a();
        String s3 = cwt.f(c);
        String s4 = cwt.d(c);
        String s5 = cwt.e(c);
        String s6 = Build.MODEL;
        String s7 = android.os.Build.VERSION.RELEASE;
        String s8 = cwt.c();
        long l = gju.a();
        String s9 = cwt.a();
        double d1;
        double d2;
        String s;
        if (g.q())
        {
            s = g.r();
        } else
        {
            s = cyy.a();
        }
        if (riderlocation != null)
        {
            d1 = riderlocation.getUberLatLng().a();
        } else
        {
            d1 = 0.0D;
        }
        if (riderlocation != null)
        {
            d2 = riderlocation.getUberLatLng().b();
        } else
        {
            d2 = 0.0D;
        }
        passwordresetdata.setCommonData(PasswordResetCommonData.newInstance(s1, s2, s3, s4, s5, s6, s7, s8, l, s9, s, Double.valueOf(d1), Double.valueOf(d2)));
    }

    public final void a(dkg dkg)
    {
        h = dkg;
    }

    public final void a(String s)
    {
        s = PasswordResetData.createForResendMobileToken(s);
        a(((PasswordResetData) (s)));
        d.requestNextAction(s, new dkh(this, (byte)0));
    }

    public final void a(String s, String s1)
    {
        s = PasswordResetData.createForMobileVerification(s, s1);
        a(((PasswordResetData) (s)));
        d.requestNextAction(s, new dkh(this, (byte)0));
    }

    public final void a(String s, String s1, String s2)
    {
        s = PasswordResetData.createForNameVerification(s, s1, s2);
        a(((PasswordResetData) (s)));
        d.requestNextAction(s, new dkh(this, (byte)0));
    }

    public final void a(String s, String s1, String s2, Boolean boolean1)
    {
        s = PasswordResetData.createForTripChallenge(s, s1, s2, boolean1);
        a(((PasswordResetData) (s)));
        d.requestNextAction(s, new dkh(this, (byte)0));
    }

    public final void b(String s)
    {
        s = PasswordResetData.createForResetAccount(s);
        a(s);
        d.requestNextAction(s, new dkh(this, (byte)0));
    }

    public final void b(String s, String s1)
    {
        s = PasswordResetData.createForNewPassword(s, s1);
        a(s);
        d.requestNextAction(s, new dkh(this, (byte)0));
    }
}
