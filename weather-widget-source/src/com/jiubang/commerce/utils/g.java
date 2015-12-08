// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.utils:
//            b, q

public class g
{

    public static boolean a(Context context)
    {
        return com.jiubang.commerce.utils.b.a(context, "com.android.vending");
    }

    private static boolean a(Context context, String s)
    {
        Object obj;
label0:
        {
            if (context == null || TextUtils.isEmpty(s))
            {
                return false;
            }
            obj = s;
            if (s.startsWith("http://play.google.com/store/apps/details"))
            {
                break label0;
            }
            obj = s;
            if (s.startsWith("https://play.google.com/store/apps/details"))
            {
                break label0;
            }
            if (!s.startsWith("market://details?id="))
            {
                obj = s;
                if (s.startsWith("http://"))
                {
                    break label0;
                }
                obj = s;
                if (s.startsWith("https://"))
                {
                    break label0;
                }
            }
            obj = s;
            if (s.startsWith("market://details?id="))
            {
                obj = s.replace("market://details?id=", "?id=");
            }
            obj = (new StringBuilder()).append("https://play.google.com/store/apps/details").append(((String) (obj))).toString();
        }
        Intent intent;
        try
        {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
            s = context.getPackageManager().queryIntentActivities(intent, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.size() <= 0) goto _L2; else goto _L3
_L3:
        if (s.get(0) == null) goto _L5; else goto _L4
_L4:
        obj = ((ResolveInfo)s.get(0)).activityInfo;
_L11:
        if (obj == null) goto _L7; else goto _L6
_L6:
        s = ((ActivityInfo) (obj)).packageName;
_L12:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        obj = ((ActivityInfo) (obj)).name;
_L13:
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(((CharSequence) (obj))))
        {
            intent.setClassName(s, ((String) (obj)));
        }
_L2:
        if (!(context instanceof Activity)) goto _L9; else goto _L8
_L8:
        intent.addFlags(0x40000000);
_L10:
        context.startActivity(intent);
        return true;
_L9:
        intent.addFlags(0x10000000);
        intent.addFlags(32768);
          goto _L10
_L5:
        obj = null;
          goto _L11
_L7:
        s = null;
          goto _L12
        obj = null;
          goto _L13
    }

    public static boolean a(Context context, String s, boolean flag, boolean flag1)
    {
        if (context != null && !TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1;
        String s2;
        if (!a(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = s;
        s2 = s;
        if (s.startsWith("market://details?id=")) goto _L4; else goto _L3
_L3:
        s2 = s;
        if (!s.startsWith("http://play.google.com/store/apps/details")) goto _L6; else goto _L5
_L5:
        s2 = s;
        s1 = s.substring(s.indexOf("id=") + "id=".length());
_L9:
        s2 = s1;
        s1 = (new StringBuilder()).append("market://details?id=").append(s1).toString();
_L4:
        s2 = s1;
        s = new Intent("android.intent.action.VIEW", Uri.parse(s1));
        s2 = s1;
        s.setPackage("com.android.vending");
        s2 = s1;
        if (!(context instanceof Activity)) goto _L8; else goto _L7
_L7:
        s2 = s1;
        s.addFlags(0x80000);
        s2 = s1;
        s.addFlags(0x40000000);
_L11:
        s2 = s1;
        context.startActivity(s);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        s2 = s1;
        b(context);
        break MISSING_BLOCK_LABEL_298;
_L6:
        s2 = s;
        if (!s.startsWith("https://play.google.com/store/apps/details"))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        s2 = s;
        s1 = s.substring(s.indexOf("id=") + "id=".length());
          goto _L9
        s2 = s;
        if (s.startsWith("http://"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        s2 = s;
        if (!s.startsWith("https://")) goto _L9; else goto _L10
_L10:
        s2 = s;
        try
        {
            return a(context, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a(context, s2);
        }
        break MISSING_BLOCK_LABEL_286;
_L8:
        s2 = s1;
        s.addFlags(0x10000000);
        s2 = s1;
        s.addFlags(32768);
          goto _L11
        return false;
        if (!flag) goto _L1; else goto _L12
_L12:
        return a(context, s);
        return true;
    }

    public static boolean a(String s)
    {
        return !TextUtils.isEmpty(s) && (s.contains("play.google.com") || s.contains("market://details"));
    }

    public static void b(Context context)
    {
        if (context != null && !q.e)
        {
            com.jiubang.commerce.ad.j.g.a().c(context);
            Intent intent = new Intent();
            intent.setClassName(context, "com.jiubang.commerce.service.AdService");
            Bundle bundle = new Bundle();
            bundle.putInt("AD_SERVICES_REQUEST", 16);
            intent.putExtras(bundle);
            context.startService(intent);
        }
    }
}
