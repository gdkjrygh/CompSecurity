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

private final class zzabO
    implements Runnable
{

    final ImageManager zzabM;
    private final zza zzabO;

    public void run()
    {
        zzb.zzch("LoadImageRunnable must be executed on the main thread");
        Object obj = (eReceiver)ImageManager.zza(zzabM).get(zzabO);
        if (obj != null)
        {
            ImageManager.zza(zzabM).remove(zzabO);
            ((eReceiver) (obj)).zzc(zzabO);
        }
        eReceiver ereceiver1 = zzabO.zzabQ;
        if (ereceiver1.zzabO == null)
        {
            zzabO.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ImageManager.zzc(zzabM), true);
            return;
        }
        obj = ImageManager.zza(zzabM, ereceiver1);
        if (obj != null)
        {
            zzabO.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ((android.graphics.Bitmap) (obj)), true);
            return;
        }
        obj = (Long)ImageManager.zzd(zzabM).get(ereceiver1.zzabM);
        if (obj != null)
        {
            if (SystemClock.elapsedRealtime() - ((Long) (obj)).longValue() < 0x36ee80L)
            {
                zzabO.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ImageManager.zzc(zzabM), true);
                return;
            }
            ImageManager.zzd(zzabM).remove(ereceiver1.zzabM);
        }
        zzabO.zza(com.google.android.gms.common.images.ImageManager.zzb(zzabM), ImageManager.zzc(zzabM));
        eReceiver ereceiver = (eReceiver)ImageManager.zze(zzabM).get(ereceiver1.zzabM);
        obj = ereceiver;
        if (ereceiver == null)
        {
            obj = new eReceiver(zzabM, ereceiver1.zzabM);
            ImageManager.zze(zzabM).put(ereceiver1.zzabM, obj);
        }
        ((eReceiver) (obj)).zzb(zzabO);
        if (!(zzabO instanceof zzabO))
        {
            ImageManager.zza(zzabM).put(zzabO, obj);
        }
        synchronized (ImageManager.zzoa())
        {
            if (!ImageManager.zzob().contains(ereceiver1.))
            {
                ImageManager.zzob().add(ereceiver1.);
                ((eReceiver) (obj)).zzoc();
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
        zzabM = imagemanager;
        super();
        zzabO = zza1;
    }
}
