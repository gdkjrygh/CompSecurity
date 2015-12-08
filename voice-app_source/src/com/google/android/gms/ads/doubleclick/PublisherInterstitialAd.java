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

    private final zzz zznQ;

    public PublisherInterstitialAd(Context context)
    {
        zznQ = new zzz(context, this);
    }

    public AdListener getAdListener()
    {
        return zznQ.getAdListener();
    }

    public String getAdUnitId()
    {
        return zznQ.getAdUnitId();
    }

    public AppEventListener getAppEventListener()
    {
        return zznQ.getAppEventListener();
    }

    public String getMediationAdapterClassName()
    {
        return zznQ.getMediationAdapterClassName();
    }

    public OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return zznQ.getOnCustomRenderedAdLoadedListener();
    }

    public boolean isLoaded()
    {
        return zznQ.isLoaded();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        zznQ.zza(publisheradrequest.zzaF());
    }

    public void setAdListener(AdListener adlistener)
    {
        zznQ.setAdListener(adlistener);
    }

    public void setAdUnitId(String s)
    {
        zznQ.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        zznQ.setAppEventListener(appeventlistener);
    }

    public void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zznQ.setOnCustomRenderedAdLoadedListener(oncustomrenderedadloadedlistener);
    }

    public void show()
    {
        zznQ.show();
    }
}
