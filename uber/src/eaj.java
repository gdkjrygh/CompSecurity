// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;
import android.preference.PreferenceFragment;
import java.lang.reflect.Method;

final class eaj
    implements android.preference.Preference.OnPreferenceClickListener
{

    private final Method a;
    private final PreferenceFragment b;

    public eaj(Method method, PreferenceFragment preferencefragment)
    {
        a = method;
        b = preferencefragment;
    }

    public final boolean onPreferenceClick(Preference preference)
    {
        try
        {
            a.setAccessible(true);
            a.invoke(b, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Preference preference)
        {
            throw new RuntimeException(preference);
        }
        return true;
    }
}
