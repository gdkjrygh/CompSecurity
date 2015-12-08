// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdsManager;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.h.a;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.k;
import com.jiubang.commerce.utils.p;
import com.jiubang.commerce.utils.q;
import com.jiubang.commerce.utils.s;
import com.loopme.LoopMeBanner;
import com.loopme.LoopMeInterstitial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            m, p, q, r, 
//            i, j, a, s, 
//            t, h, g, f, 
//            d, k, l, b

public class c
{

    private static c a;

    private c()
    {
    }

    public static c a()
    {
        if (a == null)
        {
            a = new c();
        }
        return a;
    }

    private void a(Context context, String as[], int i1, f f1, com.jiubang.commerce.ad.i.a.a a1, String s1, Handler handler, 
            s s2, com.jiubang.commerce.ad.i.b b1, m m1)
    {
        if (m1 == null)
        {
            return;
        }
        int j1 = i1 + 1;
        boolean flag = s2.b();
        if (f1 == null || as == null || as.length <= j1 || flag)
        {
            if (flag)
            {
                if (i1 > -1 && as != null && i1 < as.length)
                {
                    as = p.d(as[i1]);
                } else
                {
                    as = null;
                }
                com.jiubang.commerce.b.b.a(context, as, s1, -2, f1);
            } else
            {
                s2.a();
                m1.a(a1);
            }
            handler.getLooper().quit();
            return;
        }
        String s3 = p.d(as[j1]);
        if (TextUtils.isEmpty(s3))
        {
            a(context, as, j1, f1, a1, s1, handler, s2, b1, m1);
            return;
        }
        com.jiubang.commerce.b.b.a(context, s3, s1, f1);
        if (f.a(f1))
        {
            (new Handler(Looper.getMainLooper())).post(new com.jiubang.commerce.ad.i.m(this, b1, context, s3, s1, f1, as, j1, a1, handler, s2, m1));
            return;
        }
        if (f.b(f1))
        {
            InterstitialAd interstitialad = new InterstitialAd(context, s3);
            interstitialad.setAdListener(new com.jiubang.commerce.ad.i.p(this, context, s3, s1, f1, as, j1, a1, handler, s2, b1, m1, interstitialad));
            try
            {
                interstitialad.loadAd();
                return;
            }
            catch (Exception exception)
            {
                if (j.a)
                {
                    j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(f1.a()).append("]loadSingleFaceBookAdInfo(Exception---InterstitialAd, adId:").append(s3).append(")").toString(), exception);
                }
            }
            com.jiubang.commerce.b.b.a(context, s3, s1, -1, f1);
            a(context, as, j1, f1, a1, s1, handler, s2, b1, m1);
            return;
        }
        if (f1.g() > 0)
        {
            i1 = f1.g();
        } else
        {
            i1 = 1;
        }
        if (i1 > 1)
        {
            NativeAdsManager nativeadsmanager = new NativeAdsManager(context, s3, i1);
            nativeadsmanager.setListener(new com.jiubang.commerce.ad.i.q(this, nativeadsmanager, context, s3, s1, f1, m1, a1, as, j1, handler, s2, b1));
            nativeadsmanager.loadAds();
            return;
        } else
        {
            NativeAd nativead = new NativeAd(context, s3);
            nativead.setAdListener(new r(this, context, s3, s1, f1, as, j1, a1, handler, s2, b1, m1, nativead));
            nativead.loadAd();
            return;
        }
    }

    private void a(Context context, String as[], int i1, f f1, com.jiubang.commerce.ad.i.a.a a1, String s1, m m1)
    {
        if (m1 == null)
        {
            return;
        }
        i1++;
        if (as == null || as.length <= i1)
        {
            m1.a(a1);
            return;
        }
        String s2 = p.d(as[i1]);
        if (TextUtils.isEmpty(s2))
        {
            a(context, as, i1, f1, a1, s1, m1);
            return;
        }
        com.jiubang.commerce.b.b.a(context, s2, s1, f1);
        if (f.b(f1))
        {
            LoopMeInterstitial loopmeinterstitial = LoopMeInterstitial.getInstance(s2, context);
            loopmeinterstitial.setListener(new i(this, context, s2, s1, f1, a1, as, i1, m1));
            loopmeinterstitial.load();
            return;
        }
        if (f.a(f1))
        {
            LoopMeBanner loopmebanner;
            try
            {
                loopmebanner = LoopMeBanner.getInstance(s2, context);
            }
            catch (Exception exception)
            {
                com.jiubang.commerce.b.b.a(context, s2, s1, -1, f1);
                if (j.a)
                {
                    j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(f1.a()).append("]loadSingleLoopMeAdInfo(onError---LoopMeBanner, adId:").append(s2).append(")").toString(), exception);
                }
                a(context, as, i1, f1, a1, s1, m1);
                return;
            }
            loopmebanner.setListener(new com.jiubang.commerce.ad.i.j(this, context, s2, s1, f1, a1, as, i1, m1));
            loopmebanner.load();
            return;
        } else
        {
            com.jiubang.commerce.b.b.a(context, s2, s1, -1, f1);
            a(context, as, i1, f1, a1, s1, m1);
            return;
        }
    }

    private void a(Context context, String as[], int i1, f f1, com.jiubang.commerce.ad.i.a.a a1, String s1, com.jiubang.commerce.ad.i.a a2, 
            m m1)
    {
        if (m1 == null)
        {
            return;
        }
        i1++;
        if (as == null || as.length <= i1)
        {
            m1.a(a1);
            return;
        }
        String s2 = p.d(as[i1]);
        if (TextUtils.isEmpty(s2))
        {
            a(context, as, i1, f1, a1, s1, a2, m1);
            return;
        }
        com.jiubang.commerce.b.b.a(context, s2, s1, f1);
        if (f.a(f1))
        {
            AdView adview = new AdView(context);
            AdSize adsize1 = AdSize.BANNER;
            AdSize adsize = adsize1;
            if (a2 != null)
            {
                adsize = adsize1;
                if (a2.a != null)
                {
                    adsize = a2.a;
                }
            }
            adview.setAdSize(adsize);
            adview.setAdUnitId(s2);
            adview.setAdListener(new com.jiubang.commerce.ad.i.s(this, context, s2, s1, f1, adview, a1, as, i1, a2, m1));
            adview.loadAd((new com.google.android.gms.ads.AdRequest.Builder()).addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
            return;
        }
        if (f.b(f1))
        {
            com.google.android.gms.ads.InterstitialAd interstitialad = new com.google.android.gms.ads.InterstitialAd(context);
            interstitialad.setAdUnitId(s2);
            interstitialad.setAdListener(new t(this, context, s2, s1, f1, interstitialad, a1, as, i1, a2, m1));
            AdRequest adrequest = (new com.google.android.gms.ads.AdRequest.Builder()).addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
            try
            {
                interstitialad.loadAd(adrequest);
                return;
            }
            catch (Exception exception)
            {
                if (j.a)
                {
                    j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(f1.a()).append("]loadSingleAdMobAdInfo(Exception---InterstitialAd, adId:").append(s2).append(")").toString(), exception);
                }
            }
            com.jiubang.commerce.b.b.a(context, s2, s1, -1, f1);
            a(context, as, i1, f1, a1, s1, a2, m1);
            return;
        } else
        {
            (new com.google.android.gms.ads.AdLoader.Builder(context, s2)).forContentAd(new h(this, context, s2, s1, f1, a1, as, i1, a2, m1)).forAppInstallAd(new g(this, context, s2, s1, f1, a1, as, i1, a2, m1)).withAdListener(new com.jiubang.commerce.ad.i.f(this, context, s2, s1, f1, as, i1, a1, a2, m1)).build().loadAd((new com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder()).build());
            return;
        }
    }

    static void a(c c1, Context context, String as[], int i1, f f1, com.jiubang.commerce.ad.i.a.a a1, String s1, Handler handler, 
            s s2, com.jiubang.commerce.ad.i.b b1, m m1)
    {
        c1.a(context, as, i1, f1, a1, s1, handler, s2, b1, m1);
    }

    static void a(c c1, Context context, String as[], int i1, f f1, com.jiubang.commerce.ad.i.a.a a1, String s1, m m1)
    {
        c1.a(context, as, i1, f1, a1, s1, m1);
    }

    static void a(c c1, Context context, String as[], int i1, f f1, com.jiubang.commerce.ad.i.a.a a1, String s1, com.jiubang.commerce.ad.i.a a2, 
            m m1)
    {
        c1.a(context, as, i1, f1, a1, s1, a2, m1);
    }

    public void a(a a1, f f1, m m1)
    {
        Object obj1;
        Object obj2;
        Context context;
        int i1;
        if (m1 == null)
        {
            return;
        }
        context = a1.a;
        boolean flag;
        if (f1 != null)
        {
            i1 = f1.a();
        } else
        {
            i1 = -1;
        }
        if (com.jiubang.commerce.utils.b.a(context, "com.facebook.katana") || com.jiubang.commerce.utils.b.a(context, "com.facebook.lite"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || !k.a(context))
        {
            if (j.a)
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadFaceBookAdInfo(\u5E7F\u544A\u52A0\u8F7D\u5931\u8D25\uFF0C\u56E0facebook\u672A\u5B89\u88C5\u6216\u7F51\u7EDC\u95EE\u9898\uFF0C\u4EC5\u8FD4\u56DE\u6A21\u5757\u63A7\u5236\u4FE1\u606F!").toString());
            }
            m1.a(null);
            return;
        }
        if (!q.b)
        {
            if (j.a)
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadFaceBookAdInfo(version error, android sdk above 2.3 required!)").toString());
            }
            m1.a(null);
            return;
        }
        obj2 = "";
        obj1 = obj2;
        if (!f.c(f1)) goto _L2; else goto _L1
_L1:
        Object obj = "com.facebook.ads.NativeAd";
_L5:
        obj1 = obj;
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        m1.a(null);
        obj1 = obj;
        obj2 = (new StringBuilder()).append("[vmId:").append(i1).append("]loadFaceBookAdInfo(ad show type error, ");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_651;
        }
        obj1 = obj;
        a1 = Integer.valueOf(f1.n());
_L7:
        obj1 = obj;
        try
        {
            j.d("Ad_SDK", ((StringBuilder) (obj2)).append(a1).append(")").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1) { }
        if (j.a)
        {
            obj = (new StringBuilder()).append("[vmId:").append(i1).append("]loadFaceBookAdInfo(").append(((String) (obj1))).append(", FaceBook SDK does not exist ");
            if (f1 != null)
            {
                a1 = f1.getMessage();
            } else
            {
                a1 = "";
            }
            j.a("Ad_SDK", ((StringBuilder) (obj)).append(a1).append(")").toString(), f1);
        }
        m1.a(null);
        return;
_L2:
        obj1 = obj2;
        if (!f.a(f1))
        {
            break MISSING_BLOCK_LABEL_379;
        }
        obj = "com.facebook.ads.AdView";
          goto _L5
        obj = obj2;
        obj1 = obj2;
        if (!f.b(f1)) goto _L5; else goto _L6
_L6:
        obj = "com.facebook.ads.InterstitialAd";
          goto _L5
_L4:
        obj1 = obj;
        obj2 = Class.forName(((String) (obj)));
        obj1 = obj;
        if (!j.a)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        obj1 = obj;
        j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadFaceBookAdInfo(").append(((String) (obj))).append(", ").append(((Class) (obj2)).getName()).append(")").toString());
        String as[];
        if (f1 != null)
        {
            as = f1.h();
        } else
        {
            as = null;
        }
        if (context == null || as == null || as.length < 1)
        {
            j.d("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadFaceBookAdInfo(faceBook id is null!)").toString());
            m1.a(null);
            return;
        }
        String s1 = a1.n;
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadFaceBookAdInfo:tabCategory=").append(s1).toString());
        }
        a1 = new Thread(new d(this, i1, m1, context, as, f1, s1, a1.r));
        a1.setName("loadFaceBookAdInfo");
        a1.start();
        return;
        a1 = "null";
          goto _L7
    }

    public void b(a a1, f f1, m m1)
    {
        Object obj;
        Object obj1;
        int i1;
        if (m1 == null)
        {
            return;
        }
        obj1 = a1.a;
        if (f1 != null)
        {
            i1 = f1.a();
        } else
        {
            i1 = -1;
        }
        if (!k.a(((Context) (obj1))))
        {
            if (j.a)
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadAdMobAdInfo(\u5E7F\u544A\u52A0\u8F7D\u5931\u8D25\uFF0C\u56E0\u7F51\u7EDC\u95EE\u9898\uFF0C\u4EC5\u8FD4\u56DE\u6A21\u5757\u63A7\u5236\u4FE1\u606F!").toString());
            }
            m1.a(null);
            return;
        }
        if (!q.b)
        {
            if (j.a)
            {
                j.c("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadAdMobAdInfo(version error, android sdk above 2.3 required!)").toString());
            }
            m1.a(null);
            return;
        }
        obj = new ArrayList();
        if (!f.a(f1)) goto _L2; else goto _L1
_L1:
        ((List) (obj)).add("com.google.android.gms.ads.AdView");
_L7:
        if (!((List) (obj)).isEmpty()) goto _L4; else goto _L3
_L3:
        m1.a(null);
        obj1 = (new StringBuilder()).append("[vmId:").append(f1.a()).append("]loadAdMobAdInfo(ad show type error, ");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_613;
        }
        a1 = Integer.valueOf(f1.n());
_L9:
        j.d("Ad_SDK", ((StringBuilder) (obj1)).append(a1).append(")").toString());
        return;
_L2:
        if (!f.b(f1)) goto _L6; else goto _L5
_L5:
        ((List) (obj)).add("com.google.android.gms.ads.InterstitialAd");
          goto _L7
_L6:
        if (!f.c(f1)) goto _L7; else goto _L8
_L8:
        ((List) (obj)).add("com.google.android.gms.ads.formats.NativeContentAd");
        ((List) (obj)).add("com.google.android.gms.ads.formats.NativeAppInstallAd");
          goto _L7
_L4:
        try
        {
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s2 = (String)iterator.next();
                Class class1 = Class.forName(s2);
                if (j.a)
                {
                    j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadAdMobAdInfo(").append(s2).append(", ").append(class1.getName()).append(")").toString());
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            obj = (new StringBuilder()).append("[vmId:").append(i1).append("]loadAdMobAdInfo(").append(obj).append(", AdMob SDK does not exist");
            if (f1 != null)
            {
                a1 = f1.getMessage();
            } else
            {
                a1 = "";
            }
            j.b("Ad_SDK", ((StringBuilder) (obj)).append(a1).append(")").toString(), f1);
            m1.a(null);
            return;
        }
        String as[];
        if (f1 != null)
        {
            as = f1.h();
        } else
        {
            as = null;
        }
        if (obj1 == null || as == null || as.length < 1)
        {
            j.d("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadAdMobAdInfo(adMob id is null.)").toString());
            m1.a(null);
            return;
        }
        String s1 = a1.n;
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(f1.a()).append("]loadAdMobAdInfo:tabCategory=").append(s1).toString());
        }
        com.jiubang.commerce.c.a.a(new com.jiubang.commerce.ad.i.k(this, ((Context) (obj1)), as, f1, s1, a1, m1));
        return;
        a1 = "null";
          goto _L9
    }

    public void c(a a1, f f1, m m1)
    {
        if (m1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Context context;
        int i1;
        context = a1.a;
        if (f1 != null)
        {
            i1 = f1.a();
        } else
        {
            i1 = -1;
        }
        if (!k.a(context))
        {
            if (j.a)
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadLoopMeAdInfo(\u5E7F\u544A\u52A0\u8F7D\u5931\u8D25\uFF0C\u56E0\u7F51\u7EDC\u95EE\u9898\uFF0C\u4EC5\u8FD4\u56DE\u6A21\u5757\u63A7\u5236\u4FE1\u606F!").toString());
            }
            m1.a(null);
            return;
        }
        if (q.c)
        {
            break; /* Loop/switch isn't completed */
        }
        m1.a(null);
        if (j.a)
        {
            j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadLoopMeAdInfo(version error, android sdk above 4.0 required!)").toString());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj2 = "";
        obj1 = obj2;
        if (!f.a(f1)) goto _L5; else goto _L4
_L4:
        Object obj = "com.loopme.LoopMeBanner";
_L9:
        obj1 = obj;
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L7; else goto _L6
_L6:
        obj1 = obj;
        m1.a(null);
        obj1 = obj;
        obj2 = (new StringBuilder()).append("[vmId:").append(i1).append("]loadLoopMeAdInfo(ad show type error, ");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_567;
        }
        obj1 = obj;
        a1 = Integer.valueOf(f1.n());
_L10:
        obj1 = obj;
        try
        {
            j.d("Ad_SDK", ((StringBuilder) (obj2)).append(a1).append(")").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            obj = (new StringBuilder()).append("[vmId:").append(i1).append("]loadLoopMeAdInfo(").append(((String) (obj1))).append(", LoopMe SDK does not exist");
        }
        if (f1 != null)
        {
            a1 = f1.getMessage();
        } else
        {
            a1 = "";
        }
        j.b("Ad_SDK", ((StringBuilder) (obj)).append(a1).append(")").toString(), f1);
        m1.a(null);
        return;
_L5:
        obj = obj2;
        obj1 = obj2;
        if (!f.b(f1)) goto _L9; else goto _L8
_L8:
        obj = "com.loopme.LoopMeInterstitial";
          goto _L9
_L7:
        obj1 = obj;
        obj2 = Class.forName(((String) (obj)));
        obj1 = obj;
        if (!j.a)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        obj1 = obj;
        j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadLoopMeAdInfo(").append(((String) (obj))).append(", ").append(((Class) (obj2)).getName()).append(")").toString());
        String as[];
        if (f1 != null)
        {
            as = f1.h();
        } else
        {
            as = null;
        }
        if (context == null || as == null || as.length < 1)
        {
            j.d("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadLoopMeAdInfo(loopMe id is null.)").toString());
            m1.a(null);
            return;
        }
        a1 = a1.n;
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(f1.a()).append("]loadLoopMeAdInfo:tabCategory=").append(a1).toString());
        }
        com.jiubang.commerce.c.a.a(new l(this, context, as, f1, a1, m1));
        return;
        a1 = "null";
          goto _L10
    }

    public void d(a a1, f f1, m m1)
    {
        if (j.a)
        {
            int i1;
            if (f1 != null)
            {
                i1 = f1.a();
            } else
            {
                i1 = -1;
            }
            j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadMobileCoreAdInfo()").toString());
        }
        if (m1 != null)
        {
            m1.a(null);
        }
    }
}
