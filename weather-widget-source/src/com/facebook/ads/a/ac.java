// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.ImpressionListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.ads.a:
//            k, o, b, c, 
//            p, aa, ab, n

public class ac
    implements Ad
{

    private static final String CLICK = "com.facebook.ads.native.click";
    private static final String IMPRESSION = "com.facebook.ads.native.impression";
    private static final String SEPARATOR = ":";
    private static final String TAG = com/facebook/ads/a/ac.getSimpleName();
    private static WeakHashMap viewMapping = new WeakHashMap();
    private aa adDataModel;
    private AdListener adListener;
    private k adRequestController;
    private View adView;
    private b broadcastReceiver;
    private List clickListeners;
    private final Context context;
    private a eventHandler;
    private ab handler;
    private ImpressionListener impListener;
    private android.view.View.OnTouchListener touchListener;
    private final String uniqueId = UUID.randomUUID().toString();
    private int viewabilityThreshold;

    public ac(Context context1, String s, AdSize adsize, n n, boolean flag)
    {
        context = context1;
        clickListeners = new ArrayList();
        adRequestController = new k(context, s, adsize, n, flag, o.b, 1, new _cls1());
    }

    private void addListener(View view)
    {
        clickListeners.add(view);
        view.setOnClickListener(eventHandler);
        view.setOnTouchListener(eventHandler);
    }

    private void collectAllSubviews(List list, View view)
    {
        list.add(view);
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int i = 0; i < view.getChildCount(); i++)
            {
                collectAllSubviews(list, view.getChildAt(i));
            }

        }
    }

    private void detachListeners()
    {
        View view;
        for (Iterator iterator = clickListeners.iterator(); iterator.hasNext(); view.setOnTouchListener(null))
        {
            view = (View)iterator.next();
            view.setOnClickListener(null);
        }

        clickListeners.clear();
    }

    private void ensureAdRequestController()
    {
        if (adRequestController == null)
        {
            RuntimeException runtimeexception = new RuntimeException("No request controller available, has the NativeAd been destroyed?");
            c.a(b.a(runtimeexception));
            throw runtimeexception;
        } else
        {
            return;
        }
    }

    private boolean isViewOnScreen()
    {
        return isAdLoaded() && p.a(context, adView, adView.getWidth(), adView.getHeight(), viewabilityThreshold);
    }

    private void registerManualLogReceiver()
    {
        if (adDataModel != null && adDataModel.j())
        {
            broadcastReceiver = new b(null);
            broadcastReceiver.a();
            handler = new ab(new _cls2(), 1000L, adDataModel, context);
        }
    }

    public void destroy()
    {
        if (adRequestController != null)
        {
            adRequestController.c();
            adRequestController = null;
        }
        detachListeners();
        if (handler != null)
        {
            handler.c();
            handler = null;
        }
        if (adView != null)
        {
            viewMapping.remove(adView);
            adView = null;
        }
        if (broadcastReceiver != null)
        {
            broadcastReceiver.b();
            broadcastReceiver = null;
        }
    }

    void disableAutoRefresh()
    {
        adRequestController.a();
    }

    public String getAdBody()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.f();
        }
    }

    public String getAdCallToAction()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.g();
        }
    }

    com.facebook.ads.NativeAd.Image getAdChoicesIcon()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.k();
        }
    }

    String getAdChoicesLinkUrl()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.l();
        }
    }

    public com.facebook.ads.NativeAd.Image getAdCoverImage()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.d();
        }
    }

    public com.facebook.ads.NativeAd.Image getAdIcon()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.c();
        }
    }

    public String getAdSocialContext()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.h();
        }
    }

    public com.facebook.ads.NativeAd.Rating getAdStarRating()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.i();
        }
    }

    public String getAdTitle()
    {
        if (!isAdLoaded())
        {
            return null;
        } else
        {
            return adDataModel.e();
        }
    }

    public String getId()
    {
        return uniqueId;
    }

    public boolean isAdLoaded()
    {
        return adDataModel != null;
    }

    public void loadAd()
    {
        ensureAdRequestController();
        adRequestController.b();
    }

    protected void onWindowVisibilityChanged(int i)
    {
label0:
        {
            if (adRequestController != null)
            {
                adRequestController.a(i);
            }
            if (handler != null)
            {
                if (i != 0)
                {
                    break label0;
                }
                handler.b();
            }
            return;
        }
        handler.c();
    }

    public void registerViewForInteraction(View view)
    {
        ArrayList arraylist = new ArrayList();
        collectAllSubviews(arraylist, view);
        registerViewForInteraction(view, ((List) (arraylist)));
    }

    public void registerViewForInteraction(View view, List list)
    {
        if (view == null)
        {
            view = new IllegalArgumentException("Must provide a View");
            com.facebook.ads.a.c.a(com.facebook.ads.a.b.a(view));
            throw view;
        }
        if (list == null || list.size() == 0)
        {
            view = new IllegalArgumentException("Invalid set of clickable views");
            com.facebook.ads.a.c.a(com.facebook.ads.a.b.a(view));
            throw view;
        }
        if (!isAdLoaded())
        {
            Log.e(TAG, "Ad not loaded");
            return;
        }
        if (adView != null)
        {
            Log.w(TAG, "Native Ad was already registered with a View. Auto unregistering and proceeding.");
            unregisterView();
        }
        if (viewMapping.containsKey(view))
        {
            Log.w(TAG, "View already registered with a NativeAd. Auto unregistering and proceeding.");
            ((ac)((WeakReference)viewMapping.get(view)).get()).unregisterView();
        }
        eventHandler = new a(null);
        adView = view;
        for (list = list.iterator(); list.hasNext(); addListener((View)list.next())) { }
        handler = new ab(new c(null), 1000L, adDataModel, context);
        handler.d();
        viewMapping.put(view, new WeakReference(this));
    }

    public void setAdListener(AdListener adlistener)
    {
        adListener = adlistener;
    }

    public void setImpressionListener(ImpressionListener impressionlistener)
    {
        impListener = impressionlistener;
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        touchListener = ontouchlistener;
    }

    public void unregisterView()
    {
        if (adView == null)
        {
            return;
        }
        if (!viewMapping.containsKey(adView) || ((WeakReference)viewMapping.get(adView)).get() != this)
        {
            IllegalStateException illegalstateexception = new IllegalStateException("View not registered with this NativeAd");
            com.facebook.ads.a.c.a(com.facebook.ads.a.b.a(illegalstateexception));
            throw illegalstateexception;
        } else
        {
            viewMapping.remove(adView);
            detachListeners();
            handler.c();
            handler = null;
            adView = null;
            return;
        }
    }











/*
    static aa access$202(ac ac1, aa aa1)
    {
        ac1.adDataModel = aa1;
        return aa1;
    }

*/



/*
    static int access$402(ac ac1, int i)
    {
        ac1.viewabilityThreshold = i;
        return i;
    }

*/



    private class _cls1
        implements j.b
    {

        final ac a;

        public void a(AdError aderror)
        {
            if (a.adListener != null)
            {
                a.adListener.onError(a, aderror);
            }
        }

        public void a(l l1)
        {
            if (l1.d() != null && !(l1.d() instanceof aa))
            {
                if (a.adListener != null)
                {
                    a.adListener.onError(a, AdError.INTERNAL_ERROR);
                }
                if (a.adRequestController != null)
                {
                    a.adRequestController.a("on internal error");
                }
            } else
            {
                aa aa1 = (aa)l1.d();
                if (aa1 != null)
                {
                    a.adDataModel = aa1;
                    a.registerManualLogReceiver();
                    if (a.adListener != null)
                    {
                        a.adListener.onAdLoaded(a);
                    }
                    a.viewabilityThreshold = l1.c();
                    return;
                }
                if (a.adListener != null)
                {
                    AdListener adlistener = a.adListener;
                    ac ac1 = a;
                    if (l1.e() != null)
                    {
                        l1 = l1.e();
                    } else
                    {
                        l1 = AdError.INTERNAL_ERROR;
                    }
                    adlistener.onError(ac1, l1);
                }
                if (a.adRequestController != null)
                {
                    a.adRequestController.a("on no fill");
                    return;
                }
            }
        }

        _cls1()
        {
            a = ac.this;
            super();
        }
    }


    private class b extends BroadcastReceiver
    {

        final ac a;

        public void a()
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.native.impression:").append(a.uniqueId).toString());
            intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.native.click:").append(a.uniqueId).toString());
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
            intent = intent.getAction().split(":")[0];
            if ("com.facebook.ads.native.impression".equals(intent))
            {
                a.handler.d();
            } else
            if ("com.facebook.ads.native.click".equals(intent))
            {
                a.adDataModel.a(context1, null, true);
                return;
            }
        }

        private b()
        {
            a = ac.this;
            super();
        }

        b(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls2 extends c
    {
        private class c
            implements f.a
        {

            final ac b;

            public boolean a()
            {
                return b.isViewOnScreen();
            }

            public void b()
            {
                if (b.adRequestController != null)
                {
                    b.adRequestController.a("on imp sent");
                }
            }

            public void c()
            {
                if (b.impListener != null)
                {
                    b.impListener.onLoggingImpression(b);
                }
            }

            public boolean d()
            {
                return false;
            }

            private c()
            {
                b = ac.this;
                super();
            }

            c(_cls1 _pcls1)
            {
                this();
            }
        }


        final ac a;

        public boolean a()
        {
            return true;
        }

        public boolean d()
        {
            return true;
        }

        _cls2()
        {
            a = ac.this;
            super(null);
        }
    }


    private class a
        implements android.view.View.OnClickListener, android.view.View.OnTouchListener
    {

        final ac a;
        private int b;
        private int c;
        private int d;
        private int e;
        private float f;
        private float g;
        private int h;
        private int i;
        private boolean j;

        public Map a()
        {
            HashMap hashmap = new HashMap();
            hashmap.put("clickX", Integer.valueOf(b));
            hashmap.put("clickY", Integer.valueOf(c));
            hashmap.put("width", Integer.valueOf(d));
            hashmap.put("height", Integer.valueOf(e));
            hashmap.put("adPositionX", Float.valueOf(f));
            hashmap.put("adPositionY", Float.valueOf(g));
            hashmap.put("visibleWidth", Integer.valueOf(i));
            hashmap.put("visibleHeight", Integer.valueOf(h));
            return hashmap;
        }

        public void onClick(View view)
        {
            if (a.adListener != null)
            {
                a.adListener.onAdClicked(a);
            }
            if (!j)
            {
                Log.e("FBAudienceNetworkLog", "No touch data recorded, please ensure touch events reach the ad View by returning false if you intercept the event.");
            }
            a.adDataModel.a(a.context, a(), false);
        }

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            boolean flag = false;
            if (motionevent.getAction() == 0 && a.adView != null)
            {
                d = a.adView.getWidth();
                e = a.adView.getHeight();
                int ai[] = new int[2];
                a.adView.getLocationInWindow(ai);
                f = ai[0];
                g = ai[1];
                Rect rect = new Rect();
                a.adView.getGlobalVisibleRect(rect);
                i = rect.width();
                h = rect.height();
                int ai1[] = new int[2];
                view.getLocationInWindow(ai1);
                b = ((int)motionevent.getX() + ai1[0]) - ai[0];
                int l = (int)motionevent.getY();
                c = (ai1[1] + l) - ai[1];
                j = true;
            }
            if (a.touchListener != null)
            {
                flag = a.touchListener.onTouch(view, motionevent);
            }
            return flag;
        }

        private a()
        {
            a = ac.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }

}
