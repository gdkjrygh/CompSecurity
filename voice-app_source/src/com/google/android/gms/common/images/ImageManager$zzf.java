// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.zzb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, zza

private final class zzoD
    implements Runnable
{

    private final Bitmap mBitmap;
    private final Uri mUri;
    final ImageManager zzYY;
    private boolean zzZb;
    private final CountDownLatch zzoD;

    private void zza(eReceiver ereceiver, boolean flag)
    {
        ereceiver = eReceiver.zza(ereceiver);
        int j = ereceiver.size();
        int i = 0;
        while (i < j) 
        {
            zza zza1 = (zza)ereceiver.get(i);
            if (flag)
            {
                zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), mBitmap, false);
            } else
            {
                ImageManager.zzd(zzYY).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ImageManager.zzc(zzYY), false);
            }
            if (!(zza1 instanceof zzYY))
            {
                ImageManager.zza(zzYY).remove(zza1);
            }
            i++;
        }
    }

    public void run()
    {
        zzb.zzbY("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean flag;
        if (mBitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ImageManager.zzh(zzYY) != null)
        {
            if (zzZb)
            {
                ImageManager.zzh(zzYY).evictAll();
                System.gc();
                zzZb = false;
                ImageManager.zzg(zzYY).post(this);
                return;
            }
            if (flag)
            {
                ImageManager.zzh(zzYY).put(new put(mUri), mBitmap);
            }
        }
        eReceiver ereceiver = (eReceiver)ImageManager.zze(zzYY).remove(mUri);
        if (ereceiver != null)
        {
            zza(ereceiver, flag);
        }
        zzoD.countDown();
        synchronized (ImageManager.zznm())
        {
            ImageManager.zznn().remove(mUri);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public eReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        zzYY = imagemanager;
        super();
        mUri = uri;
        mBitmap = bitmap;
        zzZb = flag;
        zzoD = countdownlatch;
    }
}
