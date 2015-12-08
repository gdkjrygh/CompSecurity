// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.zzb;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager

private final class zzYZ
    implements Runnable
{

    private final Uri mUri;
    final ImageManager zzYY;
    private final ParcelFileDescriptor zzYZ;

    public void run()
    {
        Object obj;
        CountDownLatch countdownlatch;
        boolean flag;
        boolean flag1;
        zzb.zzbZ("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        flag = false;
        flag1 = false;
        obj = null;
        countdownlatch = null;
        if (zzYZ == null) goto _L2; else goto _L1
_L1:
        obj = BitmapFactory.decodeFileDescriptor(zzYZ.getFileDescriptor());
        flag = flag1;
_L3:
        OutOfMemoryError outofmemoryerror;
        try
        {
            zzYZ.close();
        }
        catch (IOException ioexception)
        {
            Log.e("ImageManager", "closed failed", ioexception);
        }
_L2:
        countdownlatch = new CountDownLatch(1);
        ImageManager.zzg(zzYY).post(new <init>(zzYY, mUri, ((android.graphics.Bitmap) (obj)), flag, countdownlatch));
        try
        {
            countdownlatch.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("ImageManager", (new StringBuilder()).append("Latch interrupted while posting ").append(mUri).toString());
        }
        break MISSING_BLOCK_LABEL_164;
        outofmemoryerror;
        Log.e("ImageManager", (new StringBuilder()).append("OOM while loading bitmap for uri: ").append(mUri).toString(), outofmemoryerror);
        flag = true;
        outofmemoryerror = countdownlatch;
          goto _L3
    }

    public (ImageManager imagemanager, Uri uri, ParcelFileDescriptor parcelfiledescriptor)
    {
        zzYY = imagemanager;
        super();
        mUri = uri;
        zzYZ = parcelfiledescriptor;
    }
}
