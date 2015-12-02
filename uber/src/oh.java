// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class oh extends lg
    implements acs, ada, adc, aec, afi, ahc, ait, aqg, kp, mk, mo, na, nf, on
{

    private abs a;
    private abr b;
    private abr c;
    private AdRequestParcel d;
    private final aej e;
    private final oj f;
    private final or g;
    private final aqi h;
    private final Messenger i;
    private boolean j;
    private boolean k;

    public oh(Context context, AdSizeParcel adsizeparcel, String s1, aej aej, VersionInfoParcel versioninfoparcel)
    {
        this(new oj(context, adsizeparcel, s1, versioninfoparcel), aej);
    }

    private oh(oj oj1, aej aej)
    {
        f = oj1;
        e = aej;
        g = new or(this);
        ot.e().b(f.b);
        ot.h().a(f.b, f.d);
        h = ot.h().i();
        i = new Messenger(new afu(f.b));
    }

    private void A()
    {
        of.c("Ad closing.");
        if (f.h == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        f.h.a();
        return;
        RemoteException remoteexception;
        remoteexception;
        of.d("Could not call AdListener.onAdClosed().", remoteexception);
        return;
    }

    private void B()
    {
        of.c("Ad leaving application.");
        if (f.h == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        f.h.b();
        return;
        RemoteException remoteexception;
        remoteexception;
        of.d("Could not call AdListener.onAdLeftApplication().", remoteexception);
        return;
    }

    private void C()
    {
        of.c("Ad opening.");
        if (f.h == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        f.h.d();
        return;
        RemoteException remoteexception;
        remoteexception;
        of.d("Could not call AdListener.onAdOpened().", remoteexception);
        return;
    }

    private void D()
    {
        of.c("Ad finished loading.");
        if (f.h != null)
        {
            try
            {
                f.h.c();
            }
            catch (RemoteException remoteexception)
            {
                of.d("Could not call AdListener.onAdLoaded().", remoteexception);
            }
        }
        k = true;
    }

    private boolean E()
    {
        boolean flag = true;
        ot.e();
        if (!ajc.a(f.b.getPackageManager(), f.b.getPackageName(), "android.permission.INTERNET"))
        {
            if (!f.j.e)
            {
                kx.a();
                oe.a(f.g, f.j, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            }
            flag = false;
        }
        ot.e();
        if (!ajc.a(f.b))
        {
            if (!f.j.e)
            {
                kx.a();
                oe.a(f.g, f.j, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            }
            flag = false;
        }
        if (!flag && f.g != null)
        {
            f.g.setVisibility(0);
        }
        return flag;
    }

    private void F()
    {
        if (f.x == 0)
        {
            f.b();
            f.k = null;
            f.z = false;
            k = false;
        }
    }

    private akk a(ok ok1)
    {
        if (f.j.e)
        {
            ot.f();
            akk akk1 = akp.a(f.b, f.j, false, false, f.c, f.d);
            akk1.i().a(this, null, this, this, ((Boolean)abn.I.c()).booleanValue(), this, this, ok1, null);
            return akk1;
        }
        if (f.j.i) goto _L2; else goto _L1
_L1:
        Object obj = f.g.getNextView();
        if (!(obj instanceof akk)) goto _L4; else goto _L3
_L3:
        obj = (akk)obj;
        ((akk) (obj)).a(f.b, f.j);
_L5:
        ((akk) (obj)).i().a(this, this, this, this, false, this, null, ok1, this);
        return ((akk) (obj));
_L4:
        if (obj != null)
        {
            f.g.removeView(((View) (obj)));
        }
        ot.f();
        akk akk2 = akp.a(f.b, f.j, false, false, f.c, f.d);
        obj = akk2;
        if (f.j.h == null)
        {
            b(akk2.a());
            obj = akk2;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return null;
    }

    private static Bundle a(aav aav1)
    {
        if (aav1 != null)
        {
            if (aav1.d())
            {
                aav1.c();
            }
            aas aas1 = aav1.b();
            if (aas1 != null)
            {
                aav1 = aas1.b();
                of.a((new StringBuilder("In AdManger: loadAd, ")).append(aas1.toString()).toString());
            } else
            {
                aav1 = null;
            }
            if (aav1 != null)
            {
                Bundle bundle = new Bundle(1);
                bundle.putString("fingerprint", aav1);
                bundle.putInt("v", 1);
                return bundle;
            }
        }
        return null;
    }

    private String a(String s1, String s2, int i1)
    {
        String s3 = s1;
        if (((Boolean)abn.K.c()).booleanValue())
        {
            s3 = s1;
            if (oq.a(f.b).a())
            {
                s3 = s1;
                if (!TextUtils.isEmpty(s1))
                {
                    s3 = Uri.parse(s1).buildUpon().appendQueryParameter("ga_cid", s2).appendQueryParameter("ga_hid", String.valueOf(i1)).build().toString();
                }
            }
        }
        return s3;
    }

    private ArrayList a(List list)
    {
        String s1 = f.k.x;
        int i1 = oq.a(f.b).c();
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(a((String)list.next(), s1, i1))) { }
        return arraylist;
    }

    private nd a(AdRequestParcel adrequestparcel, Bundle bundle)
    {
        ApplicationInfo applicationinfo = f.b.getApplicationInfo();
        android.content.pm.PackageInfo packageinfo;
        Object obj;
        String s1;
        DisplayMetrics displaymetrics;
        String s2;
        String s3;
        Bundle bundle1;
        int j1;
        long l2;
        long l3;
        boolean flag1;
        try
        {
            packageinfo = f.b.getPackageManager().getPackageInfo(applicationinfo.packageName, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = null;
        }
        displaymetrics = f.b.getResources().getDisplayMetrics();
        s1 = null;
        obj = s1;
        if (f.g != null)
        {
            obj = s1;
            if (f.g.getParent() != null)
            {
                obj = new int[2];
                f.g.getLocationOnScreen(((int []) (obj)));
                int k1 = obj[0];
                int l1 = obj[1];
                int i2 = f.g.getWidth();
                int j2 = f.g.getHeight();
                boolean flag = false;
                int i1 = ((flag) ? 1 : 0);
                if (f.g.isShown())
                {
                    i1 = ((flag) ? 1 : 0);
                    if (k1 + i2 > 0)
                    {
                        i1 = ((flag) ? 1 : 0);
                        if (l1 + j2 > 0)
                        {
                            i1 = ((flag) ? 1 : 0);
                            if (k1 <= displaymetrics.widthPixels)
                            {
                                i1 = ((flag) ? 1 : 0);
                                if (l1 <= displaymetrics.heightPixels)
                                {
                                    i1 = 1;
                                }
                            }
                        }
                    }
                }
                obj = new Bundle(5);
                ((Bundle) (obj)).putInt("x", k1);
                ((Bundle) (obj)).putInt("y", l1);
                ((Bundle) (obj)).putInt("width", i2);
                ((Bundle) (obj)).putInt("height", j2);
                ((Bundle) (obj)).putInt("visible", i1);
            }
        }
        s1 = ot.h().b();
        f.m = new aip(s1, f.a);
        f.m.a(adrequestparcel);
        ot.e();
        s2 = ajc.a(f.b, f.g, f.j);
        j1 = oq.a(f.b).c();
        flag1 = oq.a(f.b).a();
        l3 = 0L;
        l2 = l3;
        if (f.A != null)
        {
            try
            {
                l2 = f.A.a();
            }
            catch (RemoteException remoteexception)
            {
                of.e("Cannot get correlation id, default to 0.");
                l2 = l3;
            }
        }
        s3 = UUID.randomUUID().toString();
        bundle1 = ot.h().a(f.b, this, s1);
        return new nd(((Bundle) (obj)), adrequestparcel, f.j, f.a, applicationinfo, packageinfo, s1, ot.h().a(), f.d, bundle1, f.t, bundle, ot.h().f(), i, displaymetrics.widthPixels, displaymetrics.heightPixels, displaymetrics.density, s2, flag1, j1, l2, s3, abn.a());
    }

    static oj a(oh oh1)
    {
        return oh1.f;
    }

    private void a(int i1)
    {
        of.e((new StringBuilder("Failed to load ad: ")).append(i1).toString());
        if (f.h == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        f.h.a(i1);
        return;
        RemoteException remoteexception;
        remoteexception;
        of.d("Could not call AdListener.onAdFailedToLoad().", remoteexception);
        return;
    }

    private void a(Bundle bundle)
    {
        ot.e();
        ajc.a(f.b, f.d.b, "gmob-apps", bundle);
    }

    private boolean a(ain ain1, boolean flag)
    {
        boolean flag1 = false;
        AdRequestParcel adrequestparcel;
        if (d != null)
        {
            adrequestparcel = d;
            d = null;
        } else
        {
            AdRequestParcel adrequestparcel1 = ain1.a;
            adrequestparcel = adrequestparcel1;
            if (adrequestparcel1.c != null)
            {
                flag1 = adrequestparcel1.c.getBoolean("_noRefresh", false);
                adrequestparcel = adrequestparcel1;
            }
        }
        if (f.j.e)
        {
            if (f.x == 0)
            {
                ot.g().a(ain1.b.a());
            }
        } else
        if (!(flag1 | flag) && f.x == 0)
        {
            if (ain1.h > 0L)
            {
                g.a(adrequestparcel, ain1.h);
            } else
            if (ain1.o != null && ain1.o.g > 0L)
            {
                g.a(adrequestparcel, ain1.o.g);
            } else
            if (!ain1.k && ain1.d == 2)
            {
                g.a(adrequestparcel);
            }
        }
        return g.d();
    }

    private void b(View view)
    {
        f.g.addView(view, ot.g().d());
    }

    private boolean b(ain ain1)
    {
        if (ain1.k)
        {
            View view;
            try
            {
                ain1 = (View)aai.a(ain1.m.a());
            }
            // Misplaced declaration of an exception variable
            catch (ain ain1)
            {
                of.d("Could not get View from mediation adapter.", ain1);
                return false;
            }
            view = f.g.getNextView();
            if (view != null)
            {
                if (view instanceof akk)
                {
                    ((akk)view).destroy();
                }
                f.g.removeView(view);
            }
            try
            {
                b(((View) (ain1)));
            }
            // Misplaced declaration of an exception variable
            catch (ain ain1)
            {
                of.d("Could not add mediation view to view hierarchy.", ain1);
                return false;
            }
        } else
        if (ain1.r != null)
        {
            ain1.b.a(ain1.r);
            f.g.removeAllViews();
            f.g.setMinimumWidth(ain1.r.g);
            f.g.setMinimumHeight(ain1.r.d);
            b(((View) (ain1.b.a())));
        }
        if (f.g.getChildCount() > 1)
        {
            f.g.showNext();
        }
        if (f.k != null)
        {
            ain1 = f.g.getNextView();
            if (ain1 instanceof akk)
            {
                ((akk)ain1).a(f.b, f.j);
            } else
            if (ain1 != null)
            {
                f.g.removeView(ain1);
            }
            f.c();
        }
        f.g.setVisibility(0);
        return true;
    }

    private void c(boolean flag)
    {
        if (f.k == null)
        {
            of.e("Ad state was null when trying to ping impression URLs.");
        } else
        {
            of.a("Pinging Impression URLs.");
            f.m.a();
            if (f.k.e != null)
            {
                ot.e();
                ajc.a(f.b, f.d.b, a(f.k.e));
            }
            if (f.k.o != null && f.k.o.d != null)
            {
                ot.o();
                aeh.a(f.b, f.d.b, f.k, f.a, flag, a(f.k.o.d));
            }
            if (f.k.l != null && f.k.l.g != null)
            {
                ot.o();
                aeh.a(f.b, f.d.b, f.k, f.a, flag, f.k.l.g);
                return;
            }
        }
    }

    private void x()
    {
        a = new abs("load_ad");
        b = new abr(-1L, null, null);
        c = new abr(-1L, null, null);
    }

    private void y()
    {
        wn.b("setNativeTemplates must be called on the main UI thread.");
        f.t = null;
    }

    private boolean z()
    {
        if (!(f.b instanceof Activity))
        {
            return false;
        }
        Window window = ((Activity)f.b).getWindow();
        if (window == null || window.getDecorView() == null)
        {
            return false;
        }
        Rect rect = new Rect();
        Rect rect1 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect1);
        return rect.bottom != 0 && rect1.bottom != 0 && rect.top == rect1.top;
    }

    public final aaf a()
    {
        wn.b("getAdFrame must be called on the main UI thread.");
        return aai.a(f.g);
    }

    public final void a(abz abz1)
    {
        wn.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        f.s = abz1;
    }

    public final void a(afz afz1)
    {
        wn.b("setInAppPurchaseListener must be called on the main UI thread.");
        f.p = afz1;
    }

    public final void a(agl agl1, String s1)
    {
        wn.b("setPlayStorePurchaseParams must be called on the main UI thread.");
        f.u = new nb(s1);
        f.o = agl1;
        if (!ot.h().e() && agl1 != null)
        {
            (new ms(f.b, f.o, f.u)).e();
        }
    }

    public final void a(ain ain1)
    {
        a.a(c, new String[] {
            "awr"
        });
        a.a(b, new String[] {
            "ttc"
        });
        f.i = null;
        boolean flag = f.j.i;
        y();
        if (ain1.d != -2 && ain1.d != 3)
        {
            ot.h().a(f.a());
        }
        if (ain1.d != -1)
        {
            if (a(ain1, flag))
            {
                of.a("Ad refresh scheduled.");
            }
            if (ain1.d == 3 && ain1.o != null && ain1.o.e != null)
            {
                of.a("Pinging no fill URLs.");
                ot.o();
                aeh.a(f.b, f.d.b, ain1, f.a, false, ain1.o.e);
            }
            if (ain1.d != -2)
            {
                a(ain1.d);
                return;
            }
            if (!f.j.e && !flag && f.x == 0)
            {
                if (!b(ain1))
                {
                    a(0);
                    return;
                }
                if (f.g != null)
                {
                    oi.a(f.g).a(ain1.v);
                }
            }
            if (f.k != null && f.k.p != null)
            {
                f.k.p.a(null);
            }
            if (ain1.p != null)
            {
                ain1.p.a(this);
            }
            h.a(f.k);
            f.k = ain1;
            f.m.a(ain1.t);
            f.m.b(ain1.u);
            f.m.a(f.j.e);
            f.m.b(ain1.k);
            if (!f.j.e && !flag && f.x == 0)
            {
                c(false);
            }
            if (f.v == null)
            {
                f.v = new aiu(f.a);
            }
            int i1;
            int j1;
            if (ain1.o != null)
            {
                j1 = ain1.o.h;
                i1 = ain1.o.i;
            } else
            {
                i1 = 0;
                j1 = 0;
            }
            f.v.a(j1, i1);
            if (f.x == 0)
            {
                if (!f.j.e && ain1.b != null && (ain1.b.i().b() || ain1.j != null))
                {
                    aqj aqj1 = h.a(f.j, f.k);
                    if (ain1.b.i().b() && aqj1 != null)
                    {
                        aqj1.a(this);
                    }
                }
                if (f.k.b != null)
                {
                    f.k.b.i().d();
                }
                if (flag)
                {
                    ain1 = ain1.w;
                    if ((!(ain1 instanceof acg) || f.r == null) && (!(ain1 instanceof acf) || f.q == null))
                    {
                        of.e("No matching listener for retrieved native ad template.");
                        a(0);
                        return;
                    }
                }
                D();
            } else
            if (f.w != null && ain1.j != null)
            {
                h.a(f.j, f.k, f.w);
            }
            if (ot.h().d() != null)
            {
                ot.h().d().a(a);
                return;
            }
        }
    }

    public final void a(aio aio1)
    {
        Object obj = null;
        a.a(b, new String[] {
            "arf"
        });
        c = abs.a();
        f.e = null;
        f.l = aio1;
        akk akk1;
        if (!f.j.i)
        {
            ok ok1 = new ok();
            akk1 = a(ok1);
            ok1.a(new om(aio1, akk1));
            akk1.setOnTouchListener(new _cls1(ok1));
            akk1.setOnClickListener(new _cls2(ok1));
        } else
        {
            akk1 = null;
        }
        if (aio1.d != null)
        {
            f.j = aio1.d;
        }
        if (aio1.e != -2)
        {
            a(new ain(aio1, akk1));
            return;
        }
        if (!aio1.b.h && aio1.b.s)
        {
            if (aio1.b.b != null)
            {
                obj = Uri.parse(aio1.b.b).buildUpon().query(null).build().toString();
            }
            obj = new abt(this, ((String) (obj)), aio1.b.c);
            try
            {
                if (f.s != null)
                {
                    f.x = 1;
                    f.s.a(((abw) (obj)));
                    return;
                }
            }
            catch (RemoteException remoteexception)
            {
                of.d("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
            }
            catch (RuntimeException runtimeexception)
            {
                of.d("Exception happens when invoking onCustomRenderedAdLoaded.", runtimeexception);
                ot.h().a(runtimeexception, true);
            }
        }
        f.x = 0;
        remoteexception = f;
        ot.d();
        remoteexception.i = ahb.a(f.b, this, aio1, f.c, akk1, e, this);
        of.a((new StringBuilder("AdRenderer: ")).append(f.i.getClass().getName()).toString());
    }

    public final void a(View view)
    {
        f.w = view;
        a(new ain(f.l, null));
    }

    public final void a(AdSizeParcel adsizeparcel)
    {
        wn.b("setAdSize must be called on the main UI thread.");
        f.j = adsizeparcel;
        if (f.k != null && f.x == 0)
        {
            f.k.b.a(adsizeparcel);
        }
        if (f.g.getChildCount() > 1)
        {
            f.g.removeView(f.g.getNextView());
        }
        f.g.setMinimumWidth(adsizeparcel.g);
        f.g.setMinimumHeight(adsizeparcel.d);
        f.g.requestLayout();
    }

    public final void a(String s1, String s2)
    {
        if (f.n == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        f.n.a(s1, s2);
        return;
        s1;
        of.d("Could not call the AppEventListener.", s1);
        return;
    }

    public final void a(String s1, ArrayList arraylist)
    {
        arraylist = new mt(s1, arraylist, f.b, f.d.b);
        if (f.p == null)
        {
            of.e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            kx.a();
            if (!oe.b(f.b))
            {
                of.e("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if (f.o == null)
            {
                of.e("PlayStorePurchaseListener is not set.");
                return;
            }
            if (f.u == null)
            {
                of.e("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if (f.y)
            {
                of.e("An in-app purchase request is already in progress, abort");
                return;
            }
            f.y = true;
            try
            {
                if (!f.o.a(s1))
                {
                    f.y = false;
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                of.e("Could not start In-App purchase.");
                f.y = false;
                return;
            }
            ot.n();
            mz.a(f.b, f.d.e, new GInAppPurchaseManagerInfoParcel(f.b, f.u, arraylist, this));
            return;
        }
        try
        {
            f.p.a(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            of.e("Could not start In-App purchase.");
        }
    }

    public final void a(String s1, boolean flag, int i1, Intent intent, mv mv)
    {
        try
        {
            if (f.o != null)
            {
                f.o.a(new mw(f.b, s1, flag, i1, intent, mv));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            of.e("Fail to invoke PlayStorePurchaseListener.");
        }
        ajc.a.postDelayed(new _cls3(intent), 500L);
    }

    public final void a(HashSet hashset)
    {
        f.a(hashset);
    }

    public final void a(kz kz1)
    {
        wn.b("setAdListener must be called on the main UI thread.");
        f.f = kz1;
    }

    public final void a(lc lc1)
    {
        wn.b("setAdListener must be called on the main UI thread.");
        f.h = lc1;
    }

    public final void a(ll ll1)
    {
        wn.b("setAppEventListener must be called on the main UI thread.");
        f.n = ll1;
    }

    public final void a(lo lo1)
    {
        wn.b("setCorrelationIdProvider must be called on the main UI thread");
        f.A = lo1;
    }

    public final void a(boolean flag)
    {
        if (f.k != null && f.k.b != null)
        {
            HashMap hashmap = new HashMap();
            String s1;
            if (flag)
            {
                s1 = "1";
            } else
            {
                s1 = "0";
            }
            hashmap.put("isVisible", s1);
            f.k.b.a("onAdVisibilityChanged", hashmap);
        }
    }

    public final boolean a(AdRequestParcel adrequestparcel)
    {
        wn.b("loadAd must be called on the main UI thread.");
        if (f.e != null || f.i != null)
        {
            if (d != null)
            {
                of.e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            d = adrequestparcel;
        } else
        {
            if (f.j.e && f.k != null)
            {
                of.e("An interstitial is already loading. Aborting.");
                return false;
            }
            if (E())
            {
                of.c("Starting ad request.");
                x();
                b = abs.a();
                if (!adrequestparcel.f)
                {
                    StringBuilder stringbuilder = new StringBuilder("Use AdRequest.Builder.addTestDevice(\"");
                    kx.a();
                    of.c(stringbuilder.append(oe.a(f.b)).append("\") to get test ads on this device.").toString());
                }
                Object obj = a(ot.h().a(f.b));
                g.a();
                f.x = 0;
                adrequestparcel = a(adrequestparcel, ((Bundle) (obj)));
                obj = f;
                ot.a();
                obj.e = ne.a(f.b, adrequestparcel, f.c, this);
                return true;
            }
        }
        return false;
    }

    public final void b()
    {
        wn.b("destroy must be called on the main UI thread.");
        g.a();
        h.b(f.k);
        f.d();
    }

    public final void b(AdRequestParcel adrequestparcel)
    {
        android.view.ViewParent viewparent = f.g.getParent();
        if ((viewparent instanceof View) && ((View)viewparent).isShown() && ot.e().a() && !j)
        {
            a(adrequestparcel);
            return;
        } else
        {
            of.c("Ad is not visible. Not refreshing ad.");
            g.a(adrequestparcel);
            return;
        }
    }

    public final void b(boolean flag)
    {
        f.z = flag;
    }

    public final boolean c()
    {
        wn.b("isLoaded must be called on the main UI thread.");
        return f.e == null && f.i == null && f.k != null;
    }

    public final void d()
    {
        wn.b("pause must be called on the main UI thread.");
        if (f.k != null && f.x == 0)
        {
            ot.g().a(f.k.b.a());
        }
        if (f.k != null && f.k.m != null)
        {
            try
            {
                f.k.m.d();
            }
            catch (RemoteException remoteexception)
            {
                of.e("Could not pause mediation adapter.");
            }
        }
        h.c(f.k);
        g.b();
    }

    public final void e()
    {
        v();
    }

    public final void f()
    {
        wn.b("resume must be called on the main UI thread.");
        if (f.k != null && f.x == 0)
        {
            ot.g().b(f.k.b.a());
        }
        if (f.k != null && f.k.m != null)
        {
            try
            {
                f.k.m.e();
            }
            catch (RemoteException remoteexception)
            {
                of.e("Could not resume mediation adapter.");
            }
        }
        g.c();
        h.d(f.k);
    }

    public final void g()
    {
        wn.b("showInterstitial must be called on the main UI thread.");
        if (!f.j.e)
        {
            of.e("Cannot call showInterstitial on a banner ad.");
        } else
        {
            if (f.k == null)
            {
                of.e("The interstitial has not loaded.");
                return;
            }
            if (!k)
            {
                of.e("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", f.b.getApplicationContext().getPackageName());
                bundle.putString("action", "show_interstitial_before_load_finish");
                a(bundle);
            }
            ot.e();
            if (!ajc.f(f.b))
            {
                of.e("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle1 = new Bundle();
                bundle1.putString("appid", f.b.getApplicationContext().getPackageName());
                bundle1.putString("action", "show_interstitial_app_not_in_foreground");
                a(bundle1);
            }
            if (f.x != 1)
            {
                if (f.k.b.m())
                {
                    of.e("The interstitial is already showing.");
                    return;
                }
                f.k.b.a(true);
                if (f.k.b.i().b() || f.k.j != null)
                {
                    aqj aqj1 = h.a(f.j, f.k);
                    if (f.k.b.i().b() && aqj1 != null)
                    {
                        aqj1.a(this);
                    }
                }
                if (f.k.k)
                {
                    try
                    {
                        f.k.m.b();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        of.d("Could not show interstitial.", remoteexception);
                    }
                    F();
                    return;
                }
                Object obj = new InterstitialAdParameterParcel(f.z, z());
                int j1 = f.k.b.n();
                int i1 = j1;
                if (j1 == -1)
                {
                    i1 = f.k.g;
                }
                obj = new AdOverlayInfoParcel(this, this, this, f.k.b, i1, f.d, f.k.v, ((InterstitialAdParameterParcel) (obj)));
                ot.c();
                mi.a(f.b, ((AdOverlayInfoParcel) (obj)));
                return;
            }
        }
    }

    public final void h()
    {
        wn.b("stopLoading must be called on the main UI thread.");
        f.a(true);
    }

    public final void i()
    {
        wn.b("recordManualImpression must be called on the main UI thread.");
        if (f.k == null)
        {
            of.e("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            of.a("Pinging manual tracking URLs.");
            if (f.k.f != null)
            {
                ot.e();
                ajc.a(f.b, f.d.b, f.k.f);
                return;
            }
        }
    }

    public final AdSizeParcel j()
    {
        wn.b("getAdSize must be called on the main UI thread.");
        return f.j;
    }

    public final String k()
    {
        if (f.k != null)
        {
            return f.k.n;
        } else
        {
            return null;
        }
    }

    public final void l()
    {
        h.a(f.k);
        if (f.j.e)
        {
            F();
        }
        j = false;
        A();
        f.m.c();
    }

    public final void m()
    {
        if (f.j.e)
        {
            c(false);
        }
        j = true;
        C();
    }

    public final void n()
    {
        B();
    }

    public final void o()
    {
        e();
    }

    public final void p()
    {
        l();
    }

    public final void q()
    {
        n();
    }

    public final void r()
    {
        m();
    }

    public final void s()
    {
        if (f.k != null)
        {
            of.e((new StringBuilder("Mediation adapter ")).append(f.k.n).append(" refreshed, but mediation adapters should never refresh.").toString());
        }
        c(true);
        D();
    }

    public final void t()
    {
        C();
    }

    public final void u()
    {
        A();
    }

    public final void v()
    {
        if (f.k == null)
        {
            of.e("Ad state was null when trying to ping click URLs.");
        } else
        {
            of.a("Pinging click URLs.");
            f.m.b();
            if (f.k.c != null)
            {
                ot.e();
                ajc.a(f.b, f.d.b, a(f.k.c));
            }
            if (f.k.o != null && f.k.o.c != null)
            {
                ot.o();
                aeh.a(f.b, f.d.b, f.k, f.a, false, a(f.k.o.c));
            }
            if (f.k.l != null && f.k.l.f != null)
            {
                ot.o();
                aeh.a(f.b, f.d.b, f.k, f.a, false, f.k.l.f);
            }
            if (f.f != null)
            {
                try
                {
                    f.f.a();
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    of.d("Could not notify onAdClicked event.", remoteexception);
                }
                return;
            }
        }
    }

    public final void w()
    {
        c(false);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
