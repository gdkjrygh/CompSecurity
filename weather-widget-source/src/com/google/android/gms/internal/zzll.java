// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.google.android.gms.common.internal.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzkq

public class zzll
{

    public static boolean zzi(Context context, String s)
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

    public static boolean zzjk()
    {
        return zzd.zzacF && zzkq.isInitialized() && zzkq.zznM() == Process.myUid();
    }
}
