// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.apps.youtube.app:
//            ad

public final class ac
{

    private final SharedPreferences a;
    private final Map b = new ConcurrentHashMap();

    public ac(Context context, SharedPreferences sharedpreferences)
    {
        a = sharedpreferences;
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.google.android.youtube.action.set_flag");
        context.registerReceiver(new ad(this, sharedpreferences), intentfilter);
    }

    static String a(ac ac1, String s)
    {
        return a(s);
    }

    private static String a(String s)
    {
        return (new StringBuilder("flag_")).append(s).toString();
    }

    static Map a(ac ac1)
    {
        return ac1.b;
    }

    public final String a(String s, String s1)
    {
        if (b.containsKey(s))
        {
            return (String)b.get(s);
        }
        String s2 = a(s);
        if (a.contains(s2))
        {
            s1 = a.getString(s2, s1);
            b.put(s, s1);
            return s1;
        } else
        {
            return s1;
        }
    }
}
