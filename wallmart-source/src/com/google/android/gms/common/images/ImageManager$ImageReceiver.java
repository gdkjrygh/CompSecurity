// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.zzb;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, zza

private final class mUri extends ResultReceiver
{

    private final Uri mUri;
    private final ArrayList zzabL = new ArrayList();
    final ImageManager zzabM;

    static ArrayList zza(mUri muri)
    {
        return muri.zzabL;
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.zzf(zzabM).execute(new zzabM(zzabM, mUri, bundle));
    }

    public void zzb(zza zza1)
    {
        com.google.android.gms.common.internal.zzb.zzch("ImageReceiver.addImageRequest() must be called in the main thread");
        zzabL.add(zza1);
    }

    public void zzc(zza zza1)
    {
        com.google.android.gms.common.internal.zzb.zzch("ImageReceiver.removeImageRequest() must be called in the main thread");
        zzabL.remove(zza1);
    }

    public void zzoc()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        com.google.android.gms.common.images.ImageManager.zzb(zzabM).sendBroadcast(intent);
    }

    (ImageManager imagemanager, Uri uri)
    {
        zzabM = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        mUri = uri;
    }
}
