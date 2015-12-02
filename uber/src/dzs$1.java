// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;

final class ang.Object
    implements android.preference.ence.OnPreferenceChangeListener
{

    final dzs a;

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        preference = preference.getKey().substring(dzs.a(a).length());
        if (((Boolean)obj).booleanValue())
        {
            a.n.b(preference);
        } else
        {
            a.n.c(preference);
        }
        a.c();
        return true;
    }

    (dzs dzs1)
    {
        a = dzs1;
        super();
    }
}
