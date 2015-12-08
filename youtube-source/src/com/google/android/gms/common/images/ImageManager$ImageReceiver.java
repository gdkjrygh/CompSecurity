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
import com.google.android.gms.internal.fa;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, c, e

final class mUri extends ResultReceiver
{

    private final Uri mUri;
    private final ArrayList sm = new ArrayList();
    boolean sn;
    final ImageManager so;

    static ArrayList a(mUri muri)
    {
        return muri.sm;
    }

    public final void bG()
    {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.putExtra("com.google.android.gms.extras.uri", mUri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.a(so).sendBroadcast(intent);
    }

    public final void c(e e)
    {
        boolean flag;
        if (!sn)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fa.a(flag, "Cannot add an ImageRequest when mHandlingRequests is true");
        fa.a("ImageReceiver.addImageRequest() must be called in the main thread");
        sm.add(e);
    }

    public final void d(e e)
    {
        boolean flag;
        if (!sn)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fa.a(flag, "Cannot remove an ImageRequest when mHandlingRequests is true");
        fa.a("ImageReceiver.removeImageRequest() must be called in the main thread");
        sm.remove(e);
    }

    public final void onReceiveResult(int i, Bundle bundle)
    {
        bundle = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.d(so).execute(new c(so, mUri, bundle));
    }

    (ImageManager imagemanager, Uri uri)
    {
        so = imagemanager;
        super(new Handler(Looper.getMainLooper()));
        sn = false;
        mUri = uri;
    }
}
