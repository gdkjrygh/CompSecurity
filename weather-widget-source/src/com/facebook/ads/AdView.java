// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.a.d;
import com.facebook.ads.a.i;
import com.facebook.ads.a.q;

// Referenced classes of package com.facebook.ads:
//            Ad, AdSize, AdListener, ImpressionListener

public class AdView extends RelativeLayout
    implements Ad
{

    private static final String TAG = com/facebook/ads/AdView.getSimpleName();
    private d adContentView;

    public AdView(Context context, String s, AdSize adsize)
    {
        super(context);
        if (adsize == null || adsize == AdSize.INTERSTITIAL)
        {
            throw new IllegalArgumentException("adSize");
        }
        _cls1.a[adsize.ordinal()];
        JVM INSTR tableswitch 1 1: default 52
    //                   1 78;
           goto _L1 _L2
_L1:
        adContentView = new q(this, s, adsize);
_L4:
        addView((View)adContentView);
        return;
_L2:
        adContentView = new i(this, s, adsize);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void destroy()
    {
        if (adContentView != null)
        {
            removeView((View)adContentView);
            adContentView.c();
            adContentView = null;
        }
    }

    public void disableAutoRefresh()
    {
        adContentView.a();
    }

    public void loadAd()
    {
        adContentView.b();
    }

    public void setAdListener(AdListener adlistener)
    {
        adContentView.setAdListener(adlistener);
    }

    public void setImpressionListener(ImpressionListener impressionlistener)
    {
        adContentView.setImpressionListener(impressionlistener);
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[AdSize.values().length];
            try
            {
                a[AdSize.RECTANGLE_HEIGHT_250.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }

}
