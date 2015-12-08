// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Field;

// Referenced classes of package com.mapbar.android.location:
//            n, p

public final class g
{

    public static String a;
    public static boolean b;
    public static String c;
    public static String d;
    public static String e;
    public static final int f;

    public g()
    {
    }

    public static String a(PackageManager packagemanager, String s)
    {
        String s1 = "";
        try
        {
            s = packagemanager.getApplicationInfo(s, 128);
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            Log.e("CellLocation", "Could not read apikey meta-data from AndroidManifest.xml.", packagemanager);
            return "";
        }
        packagemanager = s1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        packagemanager = ((ApplicationInfo) (s)).metaData.getString("MAPBAR_APIKEY");
        return packagemanager;
    }

    public static boolean a(String s)
    {
        if (s == null || s.trim().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if ("SYSTEM".equals(c))
        {
            return true;
        }
        s = new n(p.a(s));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        boolean flag;
        if (((n) (s)).a == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        flag = ((n) (s)).a.equalsIgnoreCase(c);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_71;
        }
_L2:
        return false;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        return true;
    }

    static 
    {
        int i;
        int k;
        a = "2.0.110953";
        b = true;
        k = 3;
        i = k;
        int j = Integer.parseInt(android.os.Build.VERSION.SDK);
        i = j;
        k = j;
        android.os.Build.VERSION version = new android.os.Build.VERSION();
        i = j;
        k = j;
        Object obj1 = version.getClass();
        i = j;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        i = j;
        k = j;
        obj1 = ((Class) (obj1)).getField("SDK_INT");
        i = j;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        i = j;
        k = j;
        j = ((Field) (obj1)).getInt(version);
        i = j;
_L2:
        f = i;
        return;
        Object obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
