// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.a.a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import java.util.List;

public class a
{

    public static String a(Context context)
    {
        if (b(context, "com.gtp.nextlauncher"))
        {
            return "com.gtp.nextlauncher";
        }
        if (b(context, "com.gtp.nextlauncher.trial"))
        {
            return "com.gtp.nextlauncher.trial";
        } else
        {
            return null;
        }
    }

    public static void a(Context context, int i, int j, String s, String s1, String s2, String s3)
    {
        switch (i)
        {
        default:
            return;

        case 200: 
            if (c(context, "com.android.vending"))
            {
                if (j == 1)
                {
                    a(context, s1, "com.android.vending");
                    return;
                } else
                {
                    a(context, s, "com.android.vending");
                    return;
                }
            } else
            {
                Toast.makeText(context, s2, 0).show();
                return;
            }

        case 201: 
            break;
        }
        if (a(context, "com.amazon.venezia"))
        {
            if (j == 1)
            {
                a(context, "http://www.amazon.com/gp/mas/dl/android?p=com.gtp.nextlauncher.trial", "com.amazon.venezia");
                return;
            } else
            {
                a(context, "http://www.amazon.com/gp/mas/dl/android?p=com.gtp.nextlauncher", "com.amazon.venezia");
                return;
            }
        } else
        {
            Toast.makeText(context, s3, 0).show();
            return;
        }
    }

    public static void a(Context context, String s, String s1)
    {
        try
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse(s));
            s.setPackage(s1);
            s.setFlags(0x10000000);
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static boolean a(Context context, String s)
    {
        try
        {
            context.createPackageContext(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean b(Context context, String s)
    {
        if (context != null && s != null)
        {
            try
            {
                context.getPackageManager().getPackageInfo(s, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean c(Context context, String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("market://search?q=")).append(context.getPackageName()).toString()));
        intent.setPackage(s);
        intent.addCategory("android.intent.category.DEFAULT");
        context = context.getPackageManager().queryIntentActivities(intent, 0);
        return context != null && context.size() != 0;
    }
}
