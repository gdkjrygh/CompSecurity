// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzcj

public class zzeq extends zzel.zza
{

    private final NativeContentAdMapper zzzb;

    public zzeq(NativeContentAdMapper nativecontentadmapper)
    {
        zzzb = nativecontentadmapper;
    }

    public String getAdvertiser()
    {
        return zzzb.getAdvertiser();
    }

    public String getBody()
    {
        return zzzb.getBody();
    }

    public String getCallToAction()
    {
        return zzzb.getCallToAction();
    }

    public Bundle getExtras()
    {
        return zzzb.getExtras();
    }

    public String getHeadline()
    {
        return zzzb.getHeadline();
    }

    public List getImages()
    {
        Object obj = zzzb.getImages();
        if (obj != null)
        {
            ArrayList arraylist = new ArrayList();
            com.google.android.gms.ads.formats.NativeAd.Image image;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new zzc(image.getDrawable(), image.getUri())))
            {
                image = (com.google.android.gms.ads.formats.NativeAd.Image)((Iterator) (obj)).next();
            }

            return arraylist;
        } else
        {
            return null;
        }
    }

    public boolean getOverrideClickHandling()
    {
        return zzzb.getOverrideClickHandling();
    }

    public boolean getOverrideImpressionRecording()
    {
        return zzzb.getOverrideImpressionRecording();
    }

    public void recordImpression()
    {
        zzzb.recordImpression();
    }

    public void zzc(zzd zzd1)
    {
        zzzb.handleClick((View)zze.zzp(zzd1));
    }

    public void zzd(zzd zzd1)
    {
        zzzb.trackView((View)zze.zzp(zzd1));
    }

    public zzcj zzdw()
    {
        com.google.android.gms.ads.formats.NativeAd.Image image = zzzb.getLogo();
        if (image != null)
        {
            return new zzc(image.getDrawable(), image.getUri());
        } else
        {
            return null;
        }
    }
}
