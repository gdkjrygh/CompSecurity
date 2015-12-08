// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzcj

public class zzep extends zzek.zza
{

    private final NativeAppInstallAdMapper zzza;

    public zzep(NativeAppInstallAdMapper nativeappinstalladmapper)
    {
        zzza = nativeappinstalladmapper;
    }

    public String getBody()
    {
        return zzza.getBody();
    }

    public String getCallToAction()
    {
        return zzza.getCallToAction();
    }

    public Bundle getExtras()
    {
        return zzza.getExtras();
    }

    public String getHeadline()
    {
        return zzza.getHeadline();
    }

    public List getImages()
    {
        Object obj = zzza.getImages();
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
        return zzza.getOverrideClickHandling();
    }

    public boolean getOverrideImpressionRecording()
    {
        return zzza.getOverrideImpressionRecording();
    }

    public String getPrice()
    {
        return zzza.getPrice();
    }

    public double getStarRating()
    {
        return zzza.getStarRating();
    }

    public String getStore()
    {
        return zzza.getStore();
    }

    public void recordImpression()
    {
        zzza.recordImpression();
    }

    public void zzc(zzd zzd1)
    {
        zzza.handleClick((View)zze.zzp(zzd1));
    }

    public void zzd(zzd zzd1)
    {
        zzza.trackView((View)zze.zzp(zzd1));
    }

    public zzcj zzds()
    {
        com.google.android.gms.ads.formats.NativeAd.Image image = zzza.getIcon();
        if (image != null)
        {
            return new zzc(image.getDrawable(), image.getUri());
        } else
        {
            return null;
        }
    }
}
