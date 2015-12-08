// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.i;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

public class a
{

    public static boolean a(Context context, String s)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return flag1;
_L2:
        Intent intent;
        intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(s).toString()));
        intent.setPackage("com.android.vending");
        intent.setFlags(0x10000000);
        context.startActivity(intent);
        flag = true;
_L4:
        flag1 = flag;
        if (!flag)
        {
            return b(context, (new StringBuilder()).append("http://play.google.com/store/apps/details?id=").append(s).toString());
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
          goto _L4
        obj;
          goto _L4
    }

    public static boolean b(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.setFlags(0x10000000);
        try
        {
            context.startActivity(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean c(Context context, String s)
    {
        context = ((ActivityManager)context.getSystemService("activity")).getRunningServices(30);
        if (context.size() > 0)
        {
            int i = 0;
            while (i < context.size()) 
            {
                if (((android.app.ActivityManager.RunningServiceInfo)context.get(i)).service.getClassName().equals(s))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
