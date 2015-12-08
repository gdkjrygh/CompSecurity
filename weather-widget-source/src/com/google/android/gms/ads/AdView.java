// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdSize, AdListener

public final class AdView extends ViewGroup
{

    private final zzy zznS;

    public AdView(Context context)
    {
        super(context);
        zznS = new zzy(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zznS = new zzy(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zznS = new zzy(this, attributeset, false);
    }

    public void destroy()
    {
        zznS.destroy();
    }

    public AdListener getAdListener()
    {
        return zznS.getAdListener();
    }

    public AdSize getAdSize()
    {
        return zznS.getAdSize();
    }

    public String getAdUnitId()
    {
        return zznS.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return zznS.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName()
    {
        return zznS.getMediationAdapterClassName();
    }

    public boolean isLoading()
    {
        return zznS.isLoading();
    }

    public void loadAd(AdRequest adrequest)
    {
        zznS.zza(adrequest.zzaF());
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            int i1 = view.getMeasuredWidth();
            int j1 = view.getMeasuredHeight();
            i = (k - i - i1) / 2;
            j = (l - j - j1) / 2;
            view.layout(i, j, i1 + i, j1 + j);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0;
        View view = getChildAt(0);
        int l;
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, i, j);
            l = view.getMeasuredWidth();
            k = view.getMeasuredHeight();
        } else
        {
            AdSize adsize = getAdSize();
            if (adsize != null)
            {
                Context context = getContext();
                l = adsize.getWidthInPixels(context);
                k = adsize.getHeightInPixels(context);
            } else
            {
                l = 0;
            }
        }
        l = Math.max(l, getSuggestedMinimumWidth());
        k = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
    }

    public void pause()
    {
        zznS.pause();
    }

    public void resume()
    {
        zznS.resume();
    }

    public void setAdListener(AdListener adlistener)
    {
        zznS.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zza))
        {
            zznS.zza((zza)adlistener);
        } else
        if (adlistener == null)
        {
            zznS.zza(null);
            return;
        }
    }

    public void setAdSize(AdSize adsize)
    {
        zznS.setAdSizes(new AdSize[] {
            adsize
        });
    }

    public void setAdUnitId(String s)
    {
        zznS.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        zznS.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        zznS.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }
}
