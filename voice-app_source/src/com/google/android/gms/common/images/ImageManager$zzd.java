// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzb;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, zza

private final class zzZa
    implements Runnable
{

    final ImageManager zzYY;
    private final zza zzZa;

    public void run()
    {
        zzb.zzbY("LoadImageRunnable must be executed on the main thread");
        Object obj = (eReceiver)ImageManager.zza(zzYY).get(zzZa);
        if (obj != null)
        {
            ImageManager.zza(zzYY).remove(zzZa);
            ((eReceiver) (obj)).zzc(zzZa);
        }
        eReceiver ereceiver1 = zzZa.zzZc;
        if (ereceiver1.zzZa == null)
        {
            zzZa.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ImageManager.zzc(zzYY), true);
            return;
        }
        obj = ImageManager.zza(zzYY, ereceiver1);
        if (obj != null)
        {
            zzZa.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.zzd(zzYY).get(ereceiver1.zzYY);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                zzZa.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ImageManager.zzc(zzYY), true);
                return;
            }
            ImageManager.zzd(zzYY).remove(ereceiver1.zzYY);
        }
        zzZa.zza(com.google.android.gms.common.images.ImageManager.zzb(zzYY), ImageManager.zzc(zzYY));
        eReceiver ereceiver = (eReceiver)ImageManager.zze(zzYY).get(ereceiver1.zzYY);
        obj = ereceiver;
        if (ereceiver == null)
        {
            obj = new eReceiver(zzYY, ereceiver1.zzYY);
            ImageManager.zze(zzYY).put(ereceiver1.zzYY, obj);
        }
        ((eReceiver) (obj)).zzb(zzZa);
        if (!(zzZa instanceof zzZa))
        {
            ImageManager.zza(zzYY).put(zzZa, obj);
        }
        synchronized (ImageManager.zznm())
        {
            if (!ImageManager.zznn().contains(ereceiver1.))
            {
                ImageManager.zznn().add(ereceiver1.);
                ((eReceiver) (obj)).zzno();
            }
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public eReceiver(ImageManager imagemanager, zza zza1)
    {
        zzYY = imagemanager;
        super();
        zzZa = zza1;
    }
}
