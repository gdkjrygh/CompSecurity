// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

public final class cyl
{

    private final SharedPreferences a;

    public cyl(Context context)
    {
        a = context.getSharedPreferences(".device_prefs", 0);
    }

    public final String a()
    {
        String s1 = a.getString("device_install_id", null);
        String s = s1;
        if (s1 == null)
        {
            s = UUID.randomUUID().toString();
            a.edit().putString("device_install_id", s).apply();
        }
        return s;
    }
}
