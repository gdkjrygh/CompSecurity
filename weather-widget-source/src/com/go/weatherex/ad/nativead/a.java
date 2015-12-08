// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.nativead;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAd;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.sidebar.shuffle.f;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.List;

// Referenced classes of package com.go.weatherex.ad.nativead:
//            b, e, d, c

public class a extends FrameLayout
{

    private Context a;
    private LayoutInflater b;
    private View c;
    private NativeAd d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private Button i;
    private ImageView j;
    private ImageView k;
    private int l;
    private SharedPreferences m;
    private LinearLayout n;
    private NativeContentAdView o;
    private NativeAppInstallAdView p;
    private int q;
    private AdListener r;

    public a(Context context)
    {
        super(context);
        l = 1;
        q = 1;
        r = new b(this);
        a = context;
        b = LayoutInflater.from(context);
        c = b.inflate(0x7f03000a, null, false);
        c();
        context = new android.widget.FrameLayout.LayoutParams(-1, -2);
        context.gravity = 17;
        addView(c, context);
        m = GoWidgetApplication.c(a.getApplicationContext()).b();
    }

    static void a(a a1)
    {
        a1.d();
    }

    static void a(a a1, NativeAppInstallAd nativeappinstallad, NativeAppInstallAdView nativeappinstalladview)
    {
        a1.a(nativeappinstallad, nativeappinstalladview);
    }

    static void a(a a1, NativeContentAd nativecontentad, NativeContentAdView nativecontentadview)
    {
        a1.a(nativecontentad, nativecontentadview);
    }

    private void a(NativeAppInstallAd nativeappinstallad, NativeAppInstallAdView nativeappinstalladview)
    {
        Log.i("FacebookNativeAd", "AppInstall onAdLoaded");
        c.setVisibility(0);
        c.setBackgroundResource(0x7f020104);
        p.setVisibility(0);
        o.setVisibility(8);
        n.setVisibility(8);
        p.findViewById(0x7f090093).setVisibility(0);
        ((ImageView)p.findViewById(0x7f090094)).setImageBitmap(com.go.weatherex.sidebar.shuffle.f.a(0xff00afee));
        nativeappinstalladview.setHeadlineView(nativeappinstalladview.findViewById(0x7f090096));
        nativeappinstalladview.setImageView(nativeappinstalladview.findViewById(0x7f090098));
        nativeappinstalladview.setBodyView(nativeappinstalladview.findViewById(0x7f090097));
        nativeappinstalladview.setCallToActionView(nativeappinstalladview.findViewById(0x7f09009b));
        nativeappinstalladview.setIconView(nativeappinstalladview.findViewById(0x7f090095));
        ((TextView)nativeappinstalladview.getHeadlineView()).setText(nativeappinstallad.getHeadline());
        ((TextView)nativeappinstalladview.getBodyView()).setText(nativeappinstallad.getBody());
        ((Button)nativeappinstalladview.getCallToActionView()).setText(nativeappinstallad.getCallToAction());
        ((ImageView)nativeappinstalladview.getIconView()).setImageDrawable(nativeappinstallad.getIcon().getDrawable());
        Object obj = nativeappinstallad.getImages();
        if (((List) (obj)).size() > 0)
        {
            obj = ((com.google.android.gms.ads.formats.NativeAd.Image)((List) (obj)).get(0)).getDrawable();
            float f1;
            if (obj != null && ((Drawable) (obj)).getIntrinsicHeight() != 0)
            {
                f1 = (1.0F * (float)((Drawable) (obj)).getIntrinsicWidth()) / (float)((Drawable) (obj)).getIntrinsicHeight();
            } else
            {
                f1 = 0.0F;
            }
            if (f1 >= 1.6F)
            {
                ((ImageView)nativeappinstalladview.getImageView()).setImageDrawable(((Drawable) (obj)));
            } else
            {
                ((ImageView)nativeappinstalladview.getImageView()).setVisibility(8);
            }
        }
        nativeappinstalladview.setNativeAd(nativeappinstallad);
    }

    private void a(NativeContentAd nativecontentad, NativeContentAdView nativecontentadview)
    {
        Log.i("FacebookNativeAd", "ContentAd onAdLoaded");
        c.setVisibility(0);
        c.setBackgroundResource(0x7f020104);
        p.setVisibility(8);
        o.setVisibility(0);
        n.setVisibility(8);
        o.findViewById(0x7f090089).setVisibility(0);
        ((ImageView)o.findViewById(0x7f09008a)).setImageBitmap(com.go.weatherex.sidebar.shuffle.f.a(0xff00afee));
        nativecontentadview.setHeadlineView(nativecontentadview.findViewById(0x7f09008c));
        nativecontentadview.setImageView(nativecontentadview.findViewById(0x7f09008e));
        nativecontentadview.setBodyView(nativecontentadview.findViewById(0x7f09008d));
        nativecontentadview.setCallToActionView(nativecontentadview.findViewById(0x7f090091));
        nativecontentadview.setLogoView(nativecontentadview.findViewById(0x7f09008b));
        ((TextView)nativecontentadview.getHeadlineView()).setText(nativecontentad.getHeadline());
        ((TextView)nativecontentadview.getBodyView()).setText(nativecontentad.getBody());
        ((TextView)nativecontentadview.getCallToActionView()).setText(nativecontentad.getCallToAction());
        Object obj = nativecontentad.getImages();
        if (((List) (obj)).size() > 0)
        {
            obj = ((com.google.android.gms.ads.formats.NativeAd.Image)((List) (obj)).get(0)).getDrawable();
            float f1;
            if (obj != null && ((Drawable) (obj)).getIntrinsicHeight() != 0)
            {
                f1 = (1.0F * (float)((Drawable) (obj)).getIntrinsicWidth()) / (float)((Drawable) (obj)).getIntrinsicHeight();
            } else
            {
                f1 = 0.0F;
            }
            if (f1 >= 1.6F)
            {
                ((ImageView)nativecontentadview.getImageView()).setImageDrawable(((Drawable) (obj)));
            } else
            {
                ((ImageView)nativecontentadview.getImageView()).setVisibility(8);
            }
        }
        obj = nativecontentad.getLogo();
        if (obj != null)
        {
            ((ImageView)nativecontentadview.getLogoView()).setImageDrawable(((com.google.android.gms.ads.formats.NativeAd.Image) (obj)).getDrawable());
        }
        nativecontentadview.setNativeAd(nativecontentad);
    }

    static NativeAd b(a a1)
    {
        return a1.d;
    }

    public static boolean b()
    {
        boolean flag3 = false;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(GoWidgetApplication.b(), "com.facebook.katana") || com.gau.go.launcherex.gowidget.weather.util.r.a(GoWidgetApplication.b(), "com.facebook.lite"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (com.gau.go.launcherex.gowidget.c.g.a(GoWidgetApplication.b()))
        {
            flag2 = flag3;
            if (flag)
            {
                flag2 = flag3;
                if (flag1)
                {
                    flag2 = true;
                }
            }
        }
        return flag2;
    }

    static View c(a a1)
    {
        return a1.c;
    }

    private void c()
    {
        e = (ImageView)c.findViewById(0x7f090082);
        f = (TextView)c.findViewById(0x7f090061);
        g = (TextView)c.findViewById(0x7f090083);
        h = (ImageView)c.findViewById(0x7f090084);
        i = (Button)c.findViewById(0x7f090087);
        k = (ImageView)c.findViewById(0x7f090085);
        j = (ImageView)c.findViewById(0x7f090086);
        c.setVisibility(8);
        n = (LinearLayout)c.findViewById(0x7f090081);
        o = (NativeContentAdView)c.findViewById(0x7f090088);
        p = (NativeAppInstallAdView)c.findViewById(0x7f090092);
    }

    static LinearLayout d(a a1)
    {
        return a1.n;
    }

    private void d()
    {
        if (q == 2)
        {
            return;
        } else
        {
            com.google.android.gms.ads.formats.NativeAdOptions.Builder builder = new com.google.android.gms.ads.formats.NativeAdOptions.Builder();
            builder.setImageOrientation(2);
            (new com.google.android.gms.ads.AdLoader.Builder(a, "ca-app-pub-6646759830189405/8570563171")).forAppInstallAd(new e(this)).forContentAd(new d(this)).withAdListener(new c(this)).withNativeAdOptions(builder.build()).build().loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
            return;
        }
    }

    static NativeAppInstallAdView e(a a1)
    {
        return a1.p;
    }

    static NativeContentAdView f(a a1)
    {
        return a1.o;
    }

    static TextView g(a a1)
    {
        return a1.f;
    }

    static TextView h(a a1)
    {
        return a1.g;
    }

    static ImageView i(a a1)
    {
        return a1.e;
    }

    static ImageView j(a a1)
    {
        return a1.h;
    }

    static Button k(a a1)
    {
        return a1.i;
    }

    public void a()
    {
        if (c != null)
        {
            c.setVisibility(8);
        }
        if (d != null)
        {
            d.setAdListener(null);
            d.unregisterView();
            d.destroy();
            d = null;
        }
    }

    public void a(int i1)
    {
        q = i1;
    }

    public void a(String s)
    {
        if (b())
        {
            if (d == null)
            {
                d = new NativeAd(a, s);
                d.setAdListener(r);
                d.loadAd();
            }
            return;
        } else
        {
            d();
            return;
        }
    }
}
