// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zzz;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener, OnCustomRenderedAdLoadedListener

public final class PublisherInterstitialAd
{

    private final zzz zznT;

    public PublisherInterstitialAd(Context context)
    {
        zznT = new zzz(context, this);
    }

    public AdListener getAdListener()
    {
        return zznT.getAdListener();
    }

    public String getAdUnitId()
    {
        return zznT.getAdUnitId();
    }

    public AppEventListener getAppEventListener()
    {
        return zznT.getAppEventListener();
    }

    public String getMediationAdapterClassName()
    {
        return zznT.getMediationAdapterClassName();
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return zznT.getOnCustomRenderedAdLoadedListener();
    }

    public boolean isLoaded()
    {
        return zznT.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        zznT.zza(publisheradrequest.zzaF());
    }

    public void setAdListener(AdListener adlistener)
    {
        zznT.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        zznT.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        zznT.setAppEventListener(appeventlistener);
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zznT.setOnCustomRenderedAdLoadedListener(oncustomrenderedadloadedlistener);
    }

    public void show()
    {
        zznT.show();
    }
}
