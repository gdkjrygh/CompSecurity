// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;
import android.preference.PreferenceFragment;
import java.lang.reflect.Method;

final class eai
    implements android.preference.Preference.OnPreferenceChangeListener
{

    private final Method a;
    private final PreferenceFragment b;

    public eai(Method method, PreferenceFragment preferencefragment)
    {
        a = method;
        b = preferencefragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        try
        {
            a.setAccessible(true);
            a.invoke(b, new Object[] {
                obj
            });
        }
        // Misplaced declaration of an exception variable
        catch (Preference preference)
        {
            throw new RuntimeException(preference);
        }
        return true;
    }
}
