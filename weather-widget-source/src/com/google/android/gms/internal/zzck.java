// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzcj

public class zzck
    implements com.google.android.gms.ads.formats.NativeAd.Image
{

    private final Drawable mDrawable;
    private final Uri mUri;
    private final zzcj zzww;

    public zzck(zzcj zzcj1)
    {
        Object obj;
        obj = null;
        super();
        zzww = zzcj1;
        zzcj1 = zzww.zzdr();
        if (zzcj1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        zzcj1 = (Drawable)zze.zzp(zzcj1);
_L1:
        mDrawable = zzcj1;
        try
        {
            zzcj1 = zzww.getUri();
        }
        // Misplaced declaration of an exception variable
        catch (zzcj zzcj1)
        {
            zzb.zzb("Failed to get uri.", zzcj1);
            zzcj1 = obj;
        }
        mUri = zzcj1;
        return;
        zzcj1;
        zzb.zzb("Failed to get drawable.", zzcj1);
        zzcj1 = null;
          goto _L1
    }

    public Drawable getDrawable()
    {
        return mDrawable;
    }

    public Uri getUri()
    {
        return mUri;
    }
}
