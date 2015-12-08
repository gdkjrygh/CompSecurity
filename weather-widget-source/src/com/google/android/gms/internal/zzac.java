// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import java.io.File;

// Referenced classes of package com.google.android.gms.internal:
//            zzz, zzt, zzl, zzv, 
//            zzw, zzy

public class zzac
{

    public static zzl zza(Context context)
    {
        return zza(context, null);
    }

    public static zzl zza(Context context, zzy zzy)
    {
        Object obj;
        File file;
        file = new File(context.getCacheDir(), "volley");
        obj = "volley/0";
        String s = context.getPackageName();
        context = context.getPackageManager().getPackageInfo(s, 0);
        context = (new StringBuilder()).append(s).append("/").append(((PackageInfo) (context)).versionCode).toString();
        obj = context;
_L2:
        context = zzy;
        if (zzy == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                context = new zzz();
            } else
            {
                context = new zzw(AndroidHttpClient.newInstance(((String) (obj))));
            }
        }
        context = new zzt(context);
        context = new zzl(new zzv(file), context);
        context.start();
        return context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
