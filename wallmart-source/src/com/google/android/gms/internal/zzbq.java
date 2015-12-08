// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class zzbq
{

    private final Context mContext;

    public zzbq(Context context)
    {
        zzx.zzb(context, "Context can not be null");
        mContext = context;
    }

    public static boolean zzcZ()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean zza(Intent intent)
    {
        boolean flag = false;
        zzx.zzb(intent, "Intent can not be null");
        if (!mContext.getPackageManager().queryIntentActivities(intent, 0).isEmpty())
        {
            flag = true;
        }
        return flag;
    }

    public boolean zzcV()
    {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return zza(intent);
    }

    public boolean zzcW()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return zza(intent);
    }

    public boolean zzcX()
    {
        return zzcZ() && mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean zzcY()
    {
        return true;
    }

    public boolean zzda()
    {
        Intent intent = (new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.dir/event");
        return android.os.Build.VERSION.SDK_INT >= 14 && zza(intent);
    }
}
