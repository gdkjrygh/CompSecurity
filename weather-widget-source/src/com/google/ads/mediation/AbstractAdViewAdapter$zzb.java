// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static class setOverrideClickHandling extends NativeContentAdMapper
{

    private final NativeContentAd zzaO;

    public void trackView(View view)
    {
        if (view instanceof NativeAdView)
        {
            ((NativeAdView)view).setNativeAd(zzaO);
        }
    }

    public dMapper(NativeContentAd nativecontentad)
    {
        zzaO = nativecontentad;
        setHeadline(nativecontentad.getHeadline().toString());
        setImages(nativecontentad.getImages());
        setBody(nativecontentad.getBody().toString());
        setLogo(nativecontentad.getLogo());
        setCallToAction(nativecontentad.getCallToAction().toString());
        setAdvertiser(nativecontentad.getAdvertiser().toString());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
    }
}
