// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.google.android.gms.common.internal.g;

// Referenced classes of package com.google.android.gms.b:
//            a

public class w
{

    public static boolean a()
    {
        return g.a && com.google.android.gms.b.a.b() && com.google.android.gms.b.a.a() == Process.myUid();
    }

    public static boolean a(Context context, String s)
    {
        boolean flag = false;
        context = context.getPackageManager();
        int i;
        try
        {
            i = context.getApplicationInfo(s, 0).flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if ((i & 0x200000) != 0)
        {
            flag = true;
        }
        return flag;
    }
}
