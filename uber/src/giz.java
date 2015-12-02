// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import com.ubercab.client.feature.signup.PhoneNumber;
import com.ubercab.client.feature.verification.MobileVerificationIntentService;
import com.ubercab.rider.realtime.model.Client;

public final class giz
{

    private final cev a;
    private final Context b;
    private final hkr c;
    private PhoneNumber d;
    private boolean e;

    public giz(cev cev1, Context context, hkr hkr1)
    {
        a = cev1;
        b = context;
        c = hkr1;
    }

    private String i()
    {
        return j().getString((new StringBuilder()).append(k()).append("verification_code").toString(), null);
    }

    private SharedPreferences j()
    {
        return b.getSharedPreferences(".sms_receiver_handler", 0);
    }

    private String k()
    {
        return getClass().getName();
    }

    public final void a()
    {
        if (!e)
        {
            a.a(this);
            e = true;
        }
    }

    public final void a(String s)
    {
        MobileVerificationIntentService.a(b, s);
    }

    public final void b()
    {
        if (e)
        {
            a.b(this);
            e = false;
            d = null;
        }
    }

    public final void b(String s)
    {
        j().edit().putString((new StringBuilder()).append(k()).append("verification_code").toString(), s).apply();
    }

    public final boolean c()
    {
        boolean flag = false;
        int l = j().getInt((new StringBuilder()).append(k()).append("retry_count").toString(), 0) + 1;
        j().edit().putInt((new StringBuilder()).append(k()).append("retry_count").toString(), l).apply();
        if (l < 3)
        {
            flag = true;
        }
        return flag;
    }

    public final void d()
    {
        j().edit().putInt((new StringBuilder()).append(k()).append("retry_count").toString(), 0).apply();
    }

    public final boolean e()
    {
        String s = i();
        if (s != null)
        {
            a(s);
            return true;
        } else
        {
            return false;
        }
    }

    public final PhoneNumber f()
    {
        return d;
    }

    public final PhoneNumber g()
    {
        Object obj = f();
        if (obj != null)
        {
            return ((PhoneNumber) (obj));
        }
        obj = c.c();
        if (obj != null && !((Client) (obj)).isMobileRevoked().booleanValue())
        {
            String s = ((Client) (obj)).getMobileCountryIso2();
            return PhoneNumber.a(duj.d(((Client) (obj)).getCurrentMobile(), s), s);
        } else
        {
            return null;
        }
    }

    public final void h()
    {
        j().edit().remove((new StringBuilder()).append(k()).append("verification_code").toString()).apply();
    }

    public final void onPhoneNumberChangeEvent(gjp gjp1)
    {
        d = PhoneNumber.a(gjp1.a(), gjp1.b());
    }
}
