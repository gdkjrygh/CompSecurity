// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

public final class hsp
{

    public static String a(Context context)
    {
        Object obj = context.getSharedPreferences("ubercab_prefs_file", 0);
        context = ((SharedPreferences) (obj)).getString("client.token", "");
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).clear();
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        return context;
    }

    public static boolean a(String s)
    {
        Object obj = Uri.parse("https://m.uber.com");
        s = Uri.parse(s);
        obj = ((Uri) (obj)).getHost();
        return obj != null && ((String) (obj)).equals(s.getHost());
    }
}
