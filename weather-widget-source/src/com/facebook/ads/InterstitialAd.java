// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import com.facebook.ads.a.k;
import com.facebook.ads.a.l;
import com.facebook.ads.a.n;
import com.facebook.ads.a.o;
import com.facebook.ads.a.s;
import com.facebook.ads.a.y;
import java.util.UUID;

// Referenced classes of package com.facebook.ads:
//            Ad, AdSize, AdError, InterstitialAdListener, 
//            InterstitialAdActivity, ImpressionListener

public class InterstitialAd
    implements Ad
{

    public static final String AD_HEIGHT_INTENT_EXTRA = "adHeight";
    public static final String AD_WIDTH_INTENT_EXTRA = "adWidth";
    public static final String DISPLAY_HEIGHT_INTENT_EXTRA = "displayHeight";
    public static final String DISPLAY_ROTATION_INTENT_EXTRA = "displayRotation";
    public static final String DISPLAY_WIDTH_INTENT_EXTRA = "displayWidth";
    public static final String IMPRESSION_WILL_LOG = "com.facebook.ads.interstitial.impression.logged";
    public static final String INTERSTITIAL_CLICKED = "com.facebook.ads.interstitial.clicked";
    public static final String INTERSTITIAL_DISMISSED = "com.facebook.ads.interstitial.dismissed";
    public static final String INTERSTITIAL_DISPLAYED = "com.facebook.ads.interstitial.displayed";
    public static final String INTERSTITIAL_UNIQUE_ID_EXTRA = "adInterstitialUniqueId";
    public static final String IS_TABLET_INTENT_EXTRA = "isTablet";
    public static final String SEPARATOR = ":";
    public static final String USE_NATIVE_CLOSE_BUTTON_EXTRA = "useNativeCloseButton";
    private int adHeight;
    private InterstitialAdListener adListener;
    private boolean adLoaded;
    private k adRequestController;
    private l adResponse;
    private WebView adWebView;
    private int adWidth;
    private final a broadcastReceiver = new a(null);
    private final Context context;
    private ImpressionListener impListener;
    private boolean isTablet;
    private final String uniqueId = UUID.randomUUID().toString();
    private boolean useNativeCloseButton;

    public InterstitialAd(Context context1, String s1)
    {
        adLoaded = false;
        context = context1;
        adRequestController = new k(context, s1, AdSize.INTERSTITIAL, n.e, false, o.a, 1, new _cls1());
        broadcastReceiver.a();
    }

    private void ensureAdRequestController()
    {
        if (adRequestController == null)
        {
            throw new RuntimeException("No request controller available, has the InterstitialAd been destroyed?");
        } else
        {
            return;
        }
    }

    private void preloadMarkup(y y1)
    {
        if (y1 == null)
        {
            return;
        } else
        {
            adWebView = new WebView(context);
            adWebView.setWebChromeClient(new _cls2());
            adWebView.loadDataWithBaseURL(s.a(), y1.c(), "text/html", "utf-8", null);
            return;
        }
    }

    public void destroy()
    {
        if (adRequestController != null)
        {
            adRequestController.c();
            adRequestController = null;
            broadcastReceiver.b();
        }
        if (adWebView != null)
        {
            s.a(adWebView);
            adWebView.destroy();
            adWebView = null;
        }
    }

    public boolean isAdLoaded()
    {
        return adLoaded;
    }

    public void loadAd()
    {
        ensureAdRequestController();
        adLoaded = false;
        adRequestController.b();
    }

    public void setAdListener(InterstitialAdListener interstitialadlistener)
    {
        adListener = interstitialadlistener;
    }

    public void setImpressionListener(ImpressionListener impressionlistener)
    {
        impListener = impressionlistener;
    }

    public boolean show()
    {
        if (!adLoaded)
        {
            if (adListener != null)
            {
                adListener.onError(this, AdError.INTERNAL_ERROR);
            }
            return false;
        } else
        {
            Intent intent = new Intent(context, com/facebook/ads/InterstitialAdActivity);
            ((y)adResponse.d()).a(intent);
            adLoaded = false;
            Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displaymetrics = new DisplayMetrics();
            display.getMetrics(displaymetrics);
            intent.putExtra("displayRotation", display.getRotation());
            intent.putExtra("displayWidth", displaymetrics.widthPixels);
            intent.putExtra("displayHeight", displaymetrics.heightPixels);
            intent.putExtra("isTablet", isTablet);
            intent.putExtra("adHeight", adHeight);
            intent.putExtra("adWidth", adWidth);
            intent.putExtra("adInterstitialUniqueId", uniqueId);
            intent.putExtra("useNativeCloseButton", useNativeCloseButton);
            context.startActivity(intent);
            return true;
        }
    }


/*
    static l access$002(InterstitialAd interstitialad, l l1)
    {
        interstitialad.adResponse = l1;
        return l1;
    }

*/



/*
    static boolean access$102(InterstitialAd interstitialad, boolean flag)
    {
        interstitialad.adLoaded = flag;
        return flag;
    }

*/



/*
    static boolean access$202(InterstitialAd interstitialad, boolean flag)
    {
        interstitialad.isTablet = flag;
        return flag;
    }

*/


/*
    static int access$302(InterstitialAd interstitialad, int i)
    {
        interstitialad.adHeight = i;
        return i;
    }

*/


/*
    static int access$402(InterstitialAd interstitialad, int i)
    {
        interstitialad.adWidth = i;
        return i;
    }

*/


/*
    static boolean access$502(InterstitialAd interstitialad, boolean flag)
    {
        interstitialad.useNativeCloseButton = flag;
        return flag;
    }

*/




    private class _cls1
        implements com.facebook.ads.a.j.b
    {

        final InterstitialAd a;

        public void a(AdError aderror)
        {
            a.adLoaded = false;
            if (a.adListener != null)
            {
                a.adListener.onError(a, aderror);
            }
        }

        public void a(l l1)
        {
            a.adResponse = l1;
            if (l1.d() == null || !(l1.d() instanceof y)) goto _L2; else goto _L1
_L1:
            a.adLoaded = true;
            l1 = (y)l1.d();
            Map map = l1.h();
            if (map.containsKey("is_tablet"))
            {
                a.isTablet = Boolean.parseBoolean((String)map.get("is_tablet"));
            }
            if (map.containsKey("ad_height"))
            {
                a.adHeight = Integer.parseInt((String)map.get("ad_height"));
            }
            if (map.containsKey("ad_width"))
            {
                a.adWidth = Integer.parseInt((String)map.get("ad_width"));
            }
            if (map.containsKey("native_close"))
            {
                a.useNativeCloseButton = Boolean.valueOf((String)map.get("native_close")).booleanValue();
            }
            if (!l1.g()) goto _L4; else goto _L3
_L3:
            a.preloadMarkup(l1);
_L6:
            return;
_L4:
            if (a.adListener != null)
            {
                a.adListener.onAdLoaded(a);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (l1.d() != null)
            {
                break; /* Loop/switch isn't completed */
            }
            a.adLoaded = false;
            if (a.adListener != null)
            {
                InterstitialAdListener interstitialadlistener = a.adListener;
                InterstitialAd interstitialad = a;
                if (l1.e() != null)
                {
                    l1 = l1.e();
                } else
                {
                    l1 = AdError.INTERNAL_ERROR;
                }
                interstitialadlistener.onError(interstitialad, l1);
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
            a.adLoaded = false;
            if (a.adListener != null)
            {
                a.adListener.onError(a, AdError.INTERNAL_ERROR);
                return;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        _cls1()
        {
            a = InterstitialAd.this;
            super();
        }
    }


    private class a extends BroadcastReceiver
    {

        final InterstitialAd a;

        public void a()
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.displayed:").append(a.uniqueId).toString());
            intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.dismissed:").append(a.uniqueId).toString());
            intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.clicked:").append(a.uniqueId).toString());
            intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.impression.logged:").append(a.uniqueId).toString());
            LocalBroadcastManager.getInstance(a.context).registerReceiver(this, intentfilter);
        }

        public void b()
        {
            try
            {
                LocalBroadcastManager.getInstance(a.context).unregisterReceiver(this);
                return;
            }
            catch (Exception exception)
            {
                return;
            }
        }

        public void onReceive(Context context1, Intent intent)
        {
            context1 = intent.getAction().split(":")[0];
            if (a.adListener != null || context1.equals("com.facebook.ads.interstitial.impression.logged"))
            {
                if ("com.facebook.ads.interstitial.clicked".equals(context1))
                {
                    a.adListener.onAdClicked(a);
                    return;
                }
                if ("com.facebook.ads.interstitial.dismissed".equals(context1))
                {
                    a.adListener.onInterstitialDismissed(a);
                    return;
                }
                if ("com.facebook.ads.interstitial.displayed".equals(context1))
                {
                    a.adListener.onInterstitialDisplayed(a);
                    return;
                }
                if ("com.facebook.ads.interstitial.impression.logged".equals(context1) && a.impListener != null)
                {
                    a.impListener.onLoggingImpression(a);
                    return;
                }
            }
        }

        private a()
        {
            a = InterstitialAd.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2 extends WebChromeClient
    {

        final InterstitialAd a;

        public void onProgressChanged(WebView webview, int i)
        {
            if (i == 100 && a.adListener != null)
            {
                a.adListener.onAdLoaded(a);
            }
        }

        _cls2()
        {
            a = InterstitialAd.this;
            super();
        }
    }

}
