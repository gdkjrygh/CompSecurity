// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.ubercab.android.location.UberLocation;

public final class dun
{

    public static String a(Context context, UberLocation uberlocation)
    {
        boolean flag;
        if (!duc.a(uberlocation))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uberlocation = context.getString(0x7f070624);
        if (flag)
        {
            return (new StringBuilder()).append(uberlocation).append(context.getString(0x7f0707a8)).toString();
        } else
        {
            return uberlocation;
        }
    }

    public static String a(String s, String s1)
    {
        String s2 = s1;
        if (!s.isEmpty())
        {
            s2 = s1;
            if (!s1.isEmpty())
            {
                s2 = (new StringBuilder()).append(Character.toUpperCase(s1.charAt(0))).append(s1.substring(1)).toString();
            }
        }
        return (new StringBuilder()).append(s).append(s2).toString();
    }

    public static void a(Context context)
    {
        try
        {
            context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:com.ubercab")));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            cwm.a(context, context.getString(0x7f070061));
        }
    }

    public static void a(Context context, Intent intent)
    {
        Intent intent1 = intent;
        if (intent == null)
        {
            intent1 = new Intent("android.intent.action.VIEW", Uri.parse(context.getString(0x7f0706b0)));
        }
        try
        {
            cwq.a(context, intent1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Toast.makeText(context, context.getString(0x7f07005f), 0).show();
        }
    }

    public static void a(Context context, dal dal1)
    {
        context = context.getSharedPreferences("ubercab_prefs_file", 0);
        String s = context.getString("client.token", "");
        if (!TextUtils.isEmpty(s))
        {
            dal1.c(s);
        }
        context = context.edit();
        context.clear();
        context.apply();
    }
}
