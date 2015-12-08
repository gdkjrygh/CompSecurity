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
//            zzck

public class zzcl
    implements com.google.android.gms.ads.formats.NativeAd.Image
{

    private final Uri mUri;
    private final zzck zzvI;
    private final Drawable zzvJ;

    public zzcl(zzck zzck1)
    {
        Object obj;
        obj = null;
        super();
        zzvI = zzck1;
        zzck1 = zzvI.zzdw();
        if (zzck1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        zzck1 = (Drawable)zze.zzn(zzck1);
_L1:
        zzvJ = zzck1;
        try
        {
            zzck1 = zzvI.getUri();
        }
        // Misplaced declaration of an exception variable
        catch (zzck zzck1)
        {
            zzb.zzb("Failed to get uri.", zzck1);
            zzck1 = obj;
        }
        mUri = zzck1;
        return;
        zzck1;
        zzb.zzb("Failed to get drawable.", zzck1);
        zzck1 = null;
          goto _L1
    }

    public Drawable getDrawable()
    {
        return zzvJ;
    }

    public Uri getUri()
    {
        return mUri;
    }
}
