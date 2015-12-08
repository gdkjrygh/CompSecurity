// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import android.content.Context;
import android.os.Environment;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.File;

public final class k
{

    private final Context a;

    public k(Context context)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
    }

    public final boolean a()
    {
        while (android.os.Build.VERSION.SDK_INT < 19 || a.getExternalFilesDirs(null).length <= 1) 
        {
            return false;
        }
        return true;
    }

    public final boolean b()
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 19) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        File file;
        if (!a()) goto _L4; else goto _L3
_L3:
        if ((file = a.getExternalFilesDirs(null)[1]) == null || !Environment.getStorageState(file).equals("mounted")) goto _L1; else goto _L5
_L5:
        return flag;
_L4:
        flag = false;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final File c()
    {
        while (android.os.Build.VERSION.SDK_INT < 19 || !a()) 
        {
            return null;
        }
        return a.getExternalFilesDirs(null)[1];
    }
}
