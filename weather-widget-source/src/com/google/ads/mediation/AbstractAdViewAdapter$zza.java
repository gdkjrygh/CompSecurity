// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static class setOverrideClickHandling extends NativeAppInstallAdMapper
{

    private final NativeAppInstallAd zzaN;

    public void trackView(View view)
    {
        if (view instanceof NativeAdView)
        {
            ((NativeAdView)view).setNativeAd(zzaN);
        }
    }

    public Ad(NativeAppInstallAd nativeappinstallad)
    {
        zzaN = nativeappinstallad;
        setHeadline(nativeappinstallad.getHeadline().toString());
        setImages(nativeappinstallad.getImages());
        setBody(nativeappinstallad.getBody().toString());
        setIcon(nativeappinstallad.getIcon());
        setCallToAction(nativeappinstallad.getCallToAction().toString());
        setStarRating(nativeappinstallad.getStarRating().doubleValue());
        setStore(nativeappinstallad.getStore().toString());
        setPrice(nativeappinstallad.getPrice().toString());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
    }
}
