// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.feature.signup.PhoneNumber;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public final class flk
{

    private final Set a = new LinkedHashSet();
    private final Set b = new LinkedHashSet();
    private final Set c = new LinkedHashSet();

    public flk()
    {
    }

    public final fll a()
    {
        return (fll)gki.a(a, null);
    }

    final void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            b.add(s);
        }
    }

    final void a(String s, String s1)
    {
        if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1))
        {
            a.add(new fll(s, s1));
        }
    }

    public final String b()
    {
        return (String)gki.a(b, null);
    }

    final void b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            String s1 = duj.a(s, Locale.getDefault().getCountry());
            if (!TextUtils.isEmpty(s1))
            {
                b(duj.b(s, s1), s1);
            }
        }
    }

    final void b(String s, String s1)
    {
        if (!TextUtils.isEmpty(s))
        {
            c.add(PhoneNumber.a(s, s1));
        }
    }

    public final PhoneNumber c()
    {
        return (PhoneNumber)gki.a(c, null);
    }

    public final Set d()
    {
        return a;
    }

    public final Set e()
    {
        return b;
    }

    public final boolean f()
    {
        return !b.isEmpty();
    }

    public final boolean g()
    {
        return !c.isEmpty();
    }
}
