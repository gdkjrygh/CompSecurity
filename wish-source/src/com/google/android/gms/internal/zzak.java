// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.common.internal.zzv;
import java.util.List;

public class zzak
{

    private final Context mContext;

    public zzak(Context context)
    {
        zzv.zzb(context, "Context can not be null");
        mContext = context;
    }

    public static boolean zzbZ()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean zza(Intent intent)
    {
        boolean flag = false;
        zzv.zzb(intent, "Intent can not be null");
        if (!mContext.getPackageManager().queryIntentActivities(intent, 0).isEmpty())
        {
            flag = true;
        }
        return flag;
    }

    public boolean zzbV()
    {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return zza(intent);
    }

    public boolean zzbW()
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return zza(intent);
    }

    public boolean zzbX()
    {
        return zzbZ() && mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean zzbY()
    {
        return true;
    }

    public boolean zzca()
    {
        Intent intent = (new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.dir/event");
        return android.os.Build.VERSION.SDK_INT >= 14 && zza(intent);
    }
}
