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

private final class zzoR
    implements Runnable
{

    private final Bitmap mBitmap;
    private final Uri mUri;
    final ImageManager zzabM;
    private boolean zzabP;
    private final CountDownLatch zzoR;

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
                zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), mBitmap, false);
            } else
            {
                ImageManager.zzd(zzabM).put(mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                zza1.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ImageManager.zzc(zzabM), false);
            }
            if (!(zza1 instanceof zzabM))
            {
                ImageManager.zza(zzabM).remove(zza1);
            }
            i++;
        }
    }

    public void run()
    {
        zzb.zzch("OnBitmapLoadedRunnable must be executed in the main thread");
        boolean flag;
        if (mBitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ImageManager.zzh(zzabM) != null)
        {
            if (zzabP)
            {
                ImageManager.zzh(zzabM).evictAll();
                System.gc();
                zzabP = false;
                ImageManager.zzg(zzabM).post(this);
                return;
            }
            if (flag)
            {
                ImageManager.zzh(zzabM).put(new put(mUri), mBitmap);
            }
        }
        eReceiver ereceiver = (eReceiver)ImageManager.zze(zzabM).remove(mUri);
        if (ereceiver != null)
        {
            zza(ereceiver, flag);
        }
        zzoR.countDown();
        synchronized (ImageManager.zzoa())
        {
            ImageManager.zzob().remove(mUri);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public eReceiver(ImageManager imagemanager, Uri uri, Bitmap bitmap, boolean flag, CountDownLatch countdownlatch)
    {
        zzabM = imagemanager;
        super();
        mUri = uri;
        mBitmap = bitmap;
        zzabP = flag;
        zzoR = countdownlatch;
    }
}
