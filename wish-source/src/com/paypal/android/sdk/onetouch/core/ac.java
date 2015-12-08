// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Build;
import java.io.File;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            v

public final class ac
{

    private static v a = new v();

    public static boolean a()
    {
        boolean flag1 = false;
        boolean flag;
        if (Build.TAGS != null && Build.TAGS.contains("test-keys"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || b() || c())
        {
            flag1 = true;
        }
        return flag1;
    }

    private static boolean b()
    {
        boolean flag;
        try
        {
            flag = (new File(v.a("suFileName"))).exists();
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    private static boolean c()
    {
        boolean flag;
        try
        {
            flag = (new File(v.a("superUserApk"))).exists();
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

}
