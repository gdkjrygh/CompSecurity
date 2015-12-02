// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public final class dom
{

    private final SharedPreferences a;

    public dom(Context context)
    {
        a = context.getSharedPreferences(".push", 0);
    }

    public final String a(hav hav1)
    {
        String s = a.getString("push_vendor", null);
        if (!TextUtils.isEmpty(s) && s.equalsIgnoreCase(hav1.name()))
        {
            if (!TextUtils.isEmpty(hav1 = a.getString("registration_id", null)) && a.getInt("app_version", 0x80000000) == 30982)
            {
                return hav1;
            }
        }
        return null;
    }

    final void a()
    {
        a.edit().clear().apply();
    }

    final void a(hav hav1, String s)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        if (!TextUtils.isEmpty(s))
        {
            editor.putString("push_vendor", hav1.name());
            editor.putString("registration_id", s);
            editor.putInt("app_version", 30982);
        } else
        {
            editor.clear();
        }
        editor.apply();
    }

    public final boolean b()
    {
        return a.getBoolean("registered_with_notifier", false);
    }

    final void c()
    {
        a.edit().putBoolean("registered_with_notifier", true).apply();
    }
}
