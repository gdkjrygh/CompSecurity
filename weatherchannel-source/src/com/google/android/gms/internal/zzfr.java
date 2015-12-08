// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzfp, zzid, zzfq, zzhl

public class zzfr extends zzfp
{

    zzfr(Context context, zzha.zza zza, zzid zzid1, zzft.zza zza1)
    {
        super(context, zza, zzid1, zza1);
    }

    protected void zzh(long l)
        throws zzfs.zza
    {
        Object obj = zzoA.zzaN();
        int i;
        int j;
        if (((AdSizeParcel) (obj)).zzsn)
        {
            j = mContext.getResources().getDisplayMetrics().widthPixels;
            i = mContext.getResources().getDisplayMetrics().heightPixels;
        } else
        {
            j = ((AdSizeParcel) (obj)).widthPixels;
            i = ((AdSizeParcel) (obj)).heightPixels;
        }
        obj = new zzfq(this, zzoA, j, i);
        zzhl.zzGk.post(new _cls1(((zzfq) (obj))));
        zzg(l);
        if (((zzfq) (obj)).zzfl())
        {
            zzb.zzay("Ad-Network indicated no fill with passback URL.");
            throw new zzfs.zza("AdNetwork sent passback url", 3);
        }
        if (!((zzfq) (obj)).zzfm())
        {
            throw new zzfs.zza("AdNetwork timed out", 2);
        } else
        {
            return;
        }
    }

    /* member class not found */
    class _cls1 {}

}
