// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.ubercab.client.core.app.RiderApplication;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class dxg
{

    public static String a = null;
    public static Boolean b = null;
    private static final Locale c;
    private static final Locale d;
    private static final Locale e;
    private static final Locale f;
    private static final Locale g;
    private static final List h;

    public static String a(Context context)
    {
        if (RiderApplication.a(context).i() && !TextUtils.isEmpty(a))
        {
            return a;
        } else
        {
            return PayPalConfiguration.a(context);
        }
    }

    public static boolean a(String s, String s1, gmg gmg1)
    {
        if (b != null)
        {
            return b.booleanValue();
        }
        if ("CHINA".equals(s1))
        {
            return false;
        }
        if (gmg1.a(dbf.aq))
        {
            return true;
        }
        if (TextUtils.isEmpty(s))
        {
            return h.contains(Locale.getDefault());
        }
        for (s1 = h.iterator(); s1.hasNext();)
        {
            if (s.equalsIgnoreCase(((Locale)s1.next()).getCountry()))
            {
                return true;
            }
        }

        return false;
    }

    static 
    {
        c = new Locale("en", "AU");
        d = new Locale("de", "AT");
        e = new Locale("nl", "BE");
        f = new Locale("en", "IE");
        g = new Locale("nl", "NL");
        h = (new gkf()).a(c).a(d).a(e).a(Locale.GERMANY).a(Locale.FRANCE).a(f).a(Locale.ITALY).a(g).a(Locale.US).a();
    }
}
