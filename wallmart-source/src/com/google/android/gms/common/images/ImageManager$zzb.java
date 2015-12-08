// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import com.google.android.gms.internal.zzlf;
import com.google.android.gms.internal.zzlv;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager

private static final class zzai extends zzlf
{

    private static int zzai(Context context)
    {
        ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
        int i;
        if ((context.getApplicationInfo().flags & 0x100000) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && zzlv.zzpO())
        {
            i = zza(activitymanager);
        } else
        {
            i = activitymanager.getMemoryClass();
        }
        return (int)((float)(i * 0x100000) * 0.33F);
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        zza(flag, (zza)obj, (Bitmap)obj1, (Bitmap)obj2);
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        return zza((zza)obj, (Bitmap)obj1);
    }

    protected int zza(zza zza1, Bitmap bitmap)
    {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    protected void zza(boolean flag, zza zza1, Bitmap bitmap, Bitmap bitmap1)
    {
        super.entryRemoved(flag, zza1, bitmap, bitmap1);
    }

    public (Context context)
    {
        super(zzai(context));
    }
}
