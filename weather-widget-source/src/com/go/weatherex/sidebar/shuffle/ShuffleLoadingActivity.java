// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.service.a.i;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAdView;
import com.jiubang.core.b.a;
import java.util.List;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            z, aa, w, ShuffleIconDialog, 
//            StarView, b, f, v, 
//            q, r, ac, ad, 
//            o, s, t, u, 
//            ag, ShuffleButton, p, a, 
//            ah, ai, aj, g

public class ShuffleLoadingActivity extends Activity
{

    private Paint a;
    private RelativeLayout b;
    private int c;
    private int d;
    private volatile boolean e;
    private Drawable f[];
    private int g;
    private long h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private String s;
    private Handler t;
    private Runnable u;
    private i v;

    public ShuffleLoadingActivity()
    {
        s = "1624435071119252_1702129763349782";
        t = new z(this);
        u = new aa(this);
        v = new w(this);
    }

    private float a(float f1, float f2)
    {
        return (float)(Math.random() * (double)((f2 - f1) + 1.0F)) + f1;
    }

    private Context a()
    {
        return this;
    }

    static RelativeLayout a(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.b;
    }

    private ShuffleIconDialog a(int i1, float f1, String s1, String s2, Bitmap bitmap, Bitmap bitmap1)
    {
        ShuffleIconDialog shuffleicondialog = (ShuffleIconDialog)LayoutInflater.from(this).inflate(0x7f03010d, b, false);
        if (i1 == 2)
        {
            shuffleicondialog.y().setVisibility(0);
            shuffleicondialog.h().setVisibility(8);
            shuffleicondialog.q().setVisibility(8);
            shuffleicondialog.u().a(f1);
            if (!TextUtils.isEmpty(s1))
            {
                shuffleicondialog.c().setText(s1);
            } else
            {
                shuffleicondialog.c().setVisibility(8);
            }
            if (!TextUtils.isEmpty(s2))
            {
                shuffleicondialog.f().setText(s2);
            } else
            {
                shuffleicondialog.f().setVisibility(8);
            }
            s1 = shuffleicondialog.b();
            if (bitmap != null)
            {
                s1.setImageBitmap(bitmap);
                return shuffleicondialog;
            } else
            {
                s1.setVisibility(8);
                return shuffleicondialog;
            }
        }
        if (i1 == 1)
        {
            shuffleicondialog.y().setVisibility(8);
            shuffleicondialog.h().setVisibility(8);
            shuffleicondialog.q().setVisibility(0);
            shuffleicondialog.m().a(f1);
            if (!TextUtils.isEmpty(s1))
            {
                shuffleicondialog.c().setText(s1);
            } else
            {
                shuffleicondialog.c().setVisibility(8);
            }
            if (!TextUtils.isEmpty(s2))
            {
                shuffleicondialog.f().setText(s2);
            } else
            {
                shuffleicondialog.f().setVisibility(8);
            }
            s1 = shuffleicondialog.b();
            if (bitmap != null)
            {
                s1.setImageBitmap(bitmap);
                return shuffleicondialog;
            } else
            {
                s1.setVisibility(8);
                return shuffleicondialog;
            }
        }
        shuffleicondialog.y().setVisibility(8);
        shuffleicondialog.h().setVisibility(0);
        shuffleicondialog.q().setVisibility(8);
        shuffleicondialog.d().a(f1);
        if (!TextUtils.isEmpty(s1))
        {
            shuffleicondialog.c().setText(s1);
        } else
        {
            shuffleicondialog.c().setVisibility(8);
        }
        if (!TextUtils.isEmpty(s2))
        {
            shuffleicondialog.f().setText(s2);
        } else
        {
            shuffleicondialog.f().setVisibility(8);
        }
        s1 = shuffleicondialog.b();
        if (bitmap != null)
        {
            s1.setImageBitmap(bitmap);
        } else
        {
            s1.setVisibility(8);
        }
        s1 = (ImageView)shuffleicondialog.findViewById(0x7f090515);
        if (bitmap1 != null)
        {
            s2 = com.go.weatherex.sidebar.shuffle.f.a(bitmap1, bitmap1.getWidth(), bitmap1.getHeight(), com.go.weatherex.sidebar.shuffle.b.a(2.0F));
            i1 = getResources().getDimensionPixelSize(0x7f0c00c9);
            s1.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i1, (int)(((float)i1 / (float)s2.getWidth()) * (float)s2.getHeight())));
            s1.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            s1.setImageBitmap(s2);
            ((ImageView)shuffleicondialog.findViewById(0x7f090516)).setImageBitmap(com.go.weatherex.sidebar.shuffle.f.a(0xffa8c600));
            return shuffleicondialog;
        } else
        {
            s1.setVisibility(8);
            return shuffleicondialog;
        }
    }

    private void a(int i1, int j1, int k1, View view)
    {
        ImageView imageview = new ImageView(a());
        imageview.setBackgroundDrawable(getResources().getDrawable(0x7f0205a2));
        int l1 = com.go.weatherex.sidebar.shuffle.b.a(36F);
        Object obj = new android.widget.RelativeLayout.LayoutParams(l1, l1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(i1, k1, 0, 0);
        b.addView(imageview, ((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new AnimationSet(true);
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.5F);
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        translateanimation.setRepeatCount(1);
        alphaanimation.setRepeatCount(1);
        ((AnimationSet) (obj)).addAnimation(alphaanimation);
        ((AnimationSet) (obj)).addAnimation(translateanimation);
        ((AnimationSet) (obj)).setStartOffset(300L);
        ((AnimationSet) (obj)).setDuration(1500L);
        ((AnimationSet) (obj)).setAnimationListener(new v(this, imageview, view, i1, j1));
        imageview.startAnimation(((android.view.animation.Animation) (obj)));
    }

    private void a(int i1, ShuffleIconDialog shuffleicondialog)
    {
        int j1 = 0;
        byte byte0 = 2;
        Object obj = new ColorDrawable(0xff000000);
        int k1;
        int l1;
        int i2;
        if (i1 == 1 || i1 == 2)
        {
            i2 = 300;
            l1 = 0;
            k1 = 1;
            j1 = 1;
        } else
        {
            i2 = 500;
            l1 = -1;
            k1 = 2;
            byte0 = 1;
        }
        obj = new q(this, k1, l1, byte0, j1, 1, 0.0F, 1, 0.0F, i1, ((ColorDrawable) (obj)));
        ((TranslateAnimation) (obj)).setAnimationListener(new r(this, i1, shuffleicondialog));
        if (i1 == 0)
        {
            ((TranslateAnimation) (obj)).setStartOffset(500L);
        }
        ((TranslateAnimation) (obj)).setFillAfter(true);
        ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
        ((TranslateAnimation) (obj)).setDuration(i2);
        shuffleicondialog.startAnimation(((android.view.animation.Animation) (obj)));
    }

    private void a(Drawable drawable)
    {
        ImageView imageview = new ImageView(a());
        imageview.setImageDrawable(drawable);
        drawable = new android.widget.RelativeLayout.LayoutParams(com.go.weatherex.sidebar.shuffle.b.a(300F), com.go.weatherex.sidebar.shuffle.b.a(186F));
        drawable.addRule(13);
        if (b != null)
        {
            b.addView(imageview, drawable);
        }
        drawable = new ac(this, 2, -1F, 1, 0.0F, 1, 0.0F, 1, 0.0F, new ColorDrawable(0xff000000));
        drawable.setDuration(500L);
        drawable.setAnimationListener(new ad(this, imageview));
        imageview.startAnimation(drawable);
    }

    private void a(View view)
    {
        if (b != null && t != null)
        {
            t.post(new o(this, view));
        }
    }

    private void a(View view, int i1, int j1)
    {
        int k1 = -g;
        int l1 = d / 2;
        int i2 = d / 2;
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setDuration(1000L);
        valueanimator.setObjectValues(new Object[] {
            new PointF(k1, l1)
        });
        valueanimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueanimator.setEvaluator(new s(this, k1, i1 - k1, l1, (i2 - j1) * -2));
        valueanimator.addListener(new t(this, view));
        valueanimator.start();
        valueanimator.addUpdateListener(new u(this, view));
    }

    private void a(ImageView imageview)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 2, -1F);
        translateanimation.setDuration(300L);
        translateanimation.setFillAfter(true);
        translateanimation.setInterpolator(new AccelerateInterpolator());
        translateanimation.setAnimationListener(new ag(this, imageview));
        imageview.startAnimation(translateanimation);
    }

    private void a(NativeAd nativead, Bitmap bitmap, Bitmap bitmap1)
    {
        if (nativead == null)
        {
            return;
        }
        String s2 = nativead.getAdTitle();
        float f1;
        String s1;
        String s3;
        if (nativead.getAdStarRating() == null)
        {
            f1 = 5F;
        } else
        {
            f1 = (float)nativead.getAdStarRating().getValue();
        }
        s3 = nativead.getAdBody();
        s1 = nativead.getAdCallToAction();
        bitmap = a(0, f1, s2, s3, bitmap, bitmap1);
        bitmap1 = (ShuffleButton)bitmap.e();
        if (!TextUtils.isEmpty(s1))
        {
            bitmap1.setText(s1);
        } else
        {
            bitmap1.setText("Install Now");
        }
        bitmap1.a(new p(this, nativead));
        nativead.registerViewForInteraction(bitmap1);
        bitmap.i().setVisibility(8);
        if (bitmap.a().getVisibility() == 8)
        {
            bitmap.g().setVisibility(0);
            bitmap.g().setImageBitmap(com.go.weatherex.sidebar.shuffle.f.a(0xffa8c600));
        }
        nativead = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        nativead.addRule(13);
        if (bitmap.getParent() != null)
        {
            b.removeView(bitmap);
        }
        b.addView(bitmap, nativead);
        a(0, ((ShuffleIconDialog) (bitmap)));
    }

    static void a(ShuffleLoadingActivity shuffleloadingactivity, int i1, int j1, int k1, View view)
    {
        shuffleloadingactivity.a(i1, j1, k1, view);
    }

    static void a(ShuffleLoadingActivity shuffleloadingactivity, int i1, ShuffleIconDialog shuffleicondialog)
    {
        shuffleloadingactivity.a(i1, shuffleicondialog);
    }

    static void a(ShuffleLoadingActivity shuffleloadingactivity, View view)
    {
        shuffleloadingactivity.a(view);
    }

    static void a(ShuffleLoadingActivity shuffleloadingactivity, NativeAd nativead, Bitmap bitmap, Bitmap bitmap1)
    {
        shuffleloadingactivity.a(nativead, bitmap, bitmap1);
    }

    static void a(ShuffleLoadingActivity shuffleloadingactivity, Object obj)
    {
        shuffleloadingactivity.a(obj);
    }

    static void a(ShuffleLoadingActivity shuffleloadingactivity, boolean flag)
    {
        shuffleloadingactivity.a(flag);
    }

    private void a(Object obj)
    {
        float f2 = 5F;
        Object obj1 = null;
        if (obj != null)
        {
            if (obj instanceof NativeContentAd)
            {
                Object obj2 = (NativeContentAd)obj;
                obj = ((NativeContentAd) (obj2)).getImages();
                float f1;
                ShuffleIconDialog shuffleicondialog;
                Object obj3;
                String s1;
                String s2;
                int j1;
                if (((List) (obj)).size() > 0)
                {
                    obj = ((com.google.android.gms.ads.formats.NativeAd.Image)((List) (obj)).get(0)).getDrawable();
                } else
                {
                    obj = null;
                }
                if (obj != null && ((Drawable) (obj)).getIntrinsicWidth() > ((Drawable) (obj)).getIntrinsicHeight())
                {
                    obj = ((BitmapDrawable)obj).getBitmap();
                } else
                {
                    obj = null;
                }
                obj1 = ((NativeContentAd) (obj2)).getLogo();
                if (obj1 != null)
                {
                    obj1 = (BitmapDrawable)((com.google.android.gms.ads.formats.NativeAd.Image) (obj1)).getDrawable();
                } else
                {
                    obj1 = null;
                }
                if (obj1 != null)
                {
                    obj1 = ((BitmapDrawable) (obj1)).getBitmap();
                } else
                {
                    obj1 = null;
                }
                s1 = ((NativeContentAd) (obj2)).getHeadline().toString();
                s2 = ((NativeContentAd) (obj2)).getBody().toString();
                shuffleicondialog = a(1, 5F, s1, s2, ((Bitmap) (obj1)), ((Bitmap) (obj)));
                shuffleicondialog.n().setText("Install Now");
                obj3 = shuffleicondialog.q();
                ((NativeContentAdView) (obj3)).setHeadlineView(shuffleicondialog.l());
                ((NativeContentAdView) (obj3)).setImageView(shuffleicondialog.j());
                ((NativeContentAdView) (obj3)).setBodyView(shuffleicondialog.o());
                ((NativeContentAdView) (obj3)).setCallToActionView(shuffleicondialog.n());
                ((NativeContentAdView) (obj3)).setLogoView(shuffleicondialog.k());
                ((TextView)((NativeContentAdView) (obj3)).getHeadlineView()).setText(s1);
                ((TextView)((NativeContentAdView) (obj3)).getBodyView()).setText(s2);
                ((TextView)((NativeContentAdView) (obj3)).getCallToActionView()).setText(((NativeContentAd) (obj2)).getCallToAction().toString());
                if (obj1 != null)
                {
                    ((ImageView)((NativeContentAdView) (obj3)).getLogoView()).setImageBitmap(((Bitmap) (obj1)));
                }
                obj1 = (ImageView)((NativeContentAdView) (obj3)).getImageView();
                if (obj != null)
                {
                    obj = com.go.weatherex.sidebar.shuffle.f.a(((Bitmap) (obj)), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), com.go.weatherex.sidebar.shuffle.b.a(2.0F));
                    int i1 = getResources().getDimensionPixelSize(0x7f0c00c9);
                    ((ImageView) (obj1)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(i1, (int)(((float)i1 / (float)((Bitmap) (obj)).getWidth()) * (float)((Bitmap) (obj)).getHeight())));
                    ((ImageView) (obj1)).setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                    ((ImageView) (obj1)).setImageBitmap(((Bitmap) (obj)));
                    ((ImageView)shuffleicondialog.findViewById(0x7f090521)).setImageBitmap(com.go.weatherex.sidebar.shuffle.f.a(0xffa8c600));
                } else
                {
                    ((ImageView) (obj1)).setVisibility(8);
                    shuffleicondialog.p().setVisibility(0);
                    ((ImageView)shuffleicondialog.findViewById(0x7f090523)).setImageBitmap(com.go.weatherex.sidebar.shuffle.f.a(0xffa8c600));
                }
                ((NativeContentAdView) (obj3)).setNativeAd(((com.google.android.gms.ads.formats.NativeAd) (obj2)));
                Log.i("lky", "show content ad");
                obj1 = shuffleicondialog;
            } else
            if (obj instanceof NativeAppInstallAd)
            {
                obj2 = (NativeAppInstallAd)obj;
                obj = ((NativeAppInstallAd) (obj2)).getImages();
                if (((List) (obj)).size() > 0)
                {
                    obj = ((com.google.android.gms.ads.formats.NativeAd.Image)((List) (obj)).get(0)).getDrawable();
                } else
                {
                    obj = null;
                }
                if (obj != null && ((Drawable) (obj)).getIntrinsicWidth() > ((Drawable) (obj)).getIntrinsicHeight())
                {
                    obj = ((BitmapDrawable)obj).getBitmap();
                } else
                {
                    obj = null;
                }
                obj1 = ((NativeAppInstallAd) (obj2)).getIcon();
                if (obj1 != null)
                {
                    obj1 = (BitmapDrawable)((com.google.android.gms.ads.formats.NativeAd.Image) (obj1)).getDrawable();
                } else
                {
                    obj1 = null;
                }
                if (obj1 != null)
                {
                    obj1 = ((BitmapDrawable) (obj1)).getBitmap();
                } else
                {
                    obj1 = null;
                }
                s1 = ((NativeAppInstallAd) (obj2)).getHeadline().toString();
                s2 = ((NativeAppInstallAd) (obj2)).getBody().toString();
                f1 = f2;
                if (((NativeAppInstallAd) (obj2)).getStarRating() != null)
                {
                    if (((NativeAppInstallAd) (obj2)).getStarRating().floatValue() == 0.0F)
                    {
                        f1 = f2;
                    } else
                    {
                        f1 = ((NativeAppInstallAd) (obj2)).getStarRating().floatValue();
                    }
                }
                shuffleicondialog = a(2, f1, s1, s2, ((Bitmap) (obj1)), ((Bitmap) (obj)));
                shuffleicondialog.e().setText("Install Now");
                obj3 = shuffleicondialog.y();
                ((NativeAppInstallAdView) (obj3)).setHeadlineView(shuffleicondialog.t());
                ((NativeAppInstallAdView) (obj3)).setImageView(shuffleicondialog.r());
                ((NativeAppInstallAdView) (obj3)).setBodyView(shuffleicondialog.w());
                ((NativeAppInstallAdView) (obj3)).setCallToActionView(shuffleicondialog.v());
                ((NativeAppInstallAdView) (obj3)).setIconView(shuffleicondialog.s());
                ((TextView)((NativeAppInstallAdView) (obj3)).getHeadlineView()).setText(s1);
                ((TextView)((NativeAppInstallAdView) (obj3)).getBodyView()).setText(s2);
                ((TextView)((NativeAppInstallAdView) (obj3)).getCallToActionView()).setText(((NativeAppInstallAd) (obj2)).getCallToAction().toString());
                if (obj1 != null)
                {
                    ((ImageView)((NativeAppInstallAdView) (obj3)).getIconView()).setImageBitmap(((Bitmap) (obj1)));
                }
                obj1 = (ImageView)((NativeAppInstallAdView) (obj3)).getImageView();
                if (obj != null)
                {
                    obj = com.go.weatherex.sidebar.shuffle.f.a(((Bitmap) (obj)), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), com.go.weatherex.sidebar.shuffle.b.a(2.0F));
                    j1 = getResources().getDimensionPixelSize(0x7f0c00c9);
                    ((ImageView) (obj1)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(j1, (int)(((float)j1 / (float)((Bitmap) (obj)).getWidth()) * (float)((Bitmap) (obj)).getHeight())));
                    ((ImageView) (obj1)).setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                    ((ImageView) (obj1)).setImageBitmap(((Bitmap) (obj)));
                    ((ImageView)shuffleicondialog.findViewById(0x7f09052c)).setImageBitmap(com.go.weatherex.sidebar.shuffle.f.a(0xffa8c600));
                } else
                {
                    ((ImageView) (obj1)).setVisibility(8);
                    shuffleicondialog.x().setVisibility(0);
                    ((ImageView)shuffleicondialog.findViewById(0x7f09052e)).setImageBitmap(com.go.weatherex.sidebar.shuffle.f.a(0xffa8c600));
                }
                ((NativeAppInstallAdView) (obj3)).setNativeAd(((com.google.android.gms.ads.formats.NativeAd) (obj2)));
                Log.i("lky", "show app ad");
                obj1 = shuffleicondialog;
            }
            if (obj1 != null)
            {
                obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
                if (((ShuffleIconDialog) (obj1)).getParent() != null)
                {
                    b.removeView(((View) (obj1)));
                }
                b.addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj)));
                a(0, ((ShuffleIconDialog) (obj1)));
                return;
            }
        }
    }

    private void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = GoWidgetApplication.c(getApplicationContext()).a().edit();
        editor.putBoolean("shuttle_show_tip", flag);
        editor.commit();
    }

    static void b(ShuffleLoadingActivity shuffleloadingactivity)
    {
        shuffleloadingactivity.e();
    }

    private boolean b()
    {
        return GoWidgetApplication.c(getApplicationContext()).a().getBoolean("shuttle_show_tip", true);
    }

    static boolean b(ShuffleLoadingActivity shuffleloadingactivity, boolean flag)
    {
        shuffleloadingactivity.e = flag;
        return flag;
    }

    private void c()
    {
        c = com.go.weatherex.sidebar.shuffle.b.b(this);
        d = com.go.weatherex.sidebar.shuffle.b.c(this);
        i = com.go.weatherex.sidebar.shuffle.b.a(98F);
        j = i;
        k = (float)d / 4F;
        l = (float)d * 0.8F;
        m = ((float)c + j) / 3F;
        n = (float)c * 1.2F;
        o = 0.0F;
        p = (float)d / 3F;
        q = d / 2;
        r = d / 1;
    }

    static boolean c(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.e;
    }

    static Handler d(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.t;
    }

    private void d()
    {
        Drawable drawable = getResources().getDrawable(0x7f020488);
        f = new Drawable[4];
        f[0] = drawable;
        f[0].setColorFilter(-65410, android.graphics.PorterDuff.Mode.SRC_IN);
        f[1] = com.go.weatherex.sidebar.shuffle.f.a(this, drawable, com.go.weatherex.sidebar.shuffle.b.a(64F), com.go.weatherex.sidebar.shuffle.b.a(127F));
        f[1].setColorFilter(0xff00e4ff, android.graphics.PorterDuff.Mode.SRC_IN);
        f[2] = com.go.weatherex.sidebar.shuffle.f.a(this, drawable, com.go.weatherex.sidebar.shuffle.b.a(72F), com.go.weatherex.sidebar.shuffle.b.a(143F));
        f[2].setColorFilter(0xff00ff9c, android.graphics.PorterDuff.Mode.SRC_IN);
        f[3] = com.go.weatherex.sidebar.shuffle.f.a(this, drawable, com.go.weatherex.sidebar.shuffle.b.a(68F), com.go.weatherex.sidebar.shuffle.b.a(135F));
        f[3].setColorFilter(-4096, android.graphics.PorterDuff.Mode.SRC_IN);
        g = f[3].getIntrinsicWidth();
    }

    private void e()
    {
        com.go.weatherex.sidebar.shuffle.a a1 = new com.go.weatherex.sidebar.shuffle.a(-a(i, j), a(k, l), a(m, n), a(o, p), -a(q, r));
        ImageView imageview = new ImageView(this);
        imageview.setBackgroundDrawable(f[(int)a(0.0F, 3F)]);
        a(imageview, a1);
    }

    static void e(ShuffleLoadingActivity shuffleloadingactivity)
    {
        shuffleloadingactivity.f();
    }

    private void f()
    {
        Drawable drawable = getResources().getDrawable(0x7f020490);
        if (drawable != null)
        {
            a(drawable);
            return;
        } else
        {
            finish();
            return;
        }
    }

    static void f(ShuffleLoadingActivity shuffleloadingactivity)
    {
        shuffleloadingactivity.i();
    }

    private ShuffleIconDialog g()
    {
        if (b != null)
        {
            int j1 = b.getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = b.getChildAt(i1);
                if (view instanceof ShuffleIconDialog)
                {
                    return (ShuffleIconDialog)view;
                }
            }

        }
        return null;
    }

    static Drawable[] g(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.f;
    }

    static int h(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.c;
    }

    private ImageView h()
    {
        if (b != null)
        {
            int j1 = b.getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = b.getChildAt(i1);
                if (!(view instanceof ImageView))
                {
                    continue;
                }
                Object obj = view.getLayoutParams();
                if (!(obj instanceof android.widget.RelativeLayout.LayoutParams))
                {
                    continue;
                }
                obj = (android.widget.RelativeLayout.LayoutParams)obj;
                if (((android.widget.RelativeLayout.LayoutParams) (obj)).leftMargin != 0 && ((android.widget.RelativeLayout.LayoutParams) (obj)).topMargin != 0)
                {
                    view.clearAnimation();
                    return (ImageView)view;
                }
            }

        }
        return null;
    }

    private void i()
    {
        if (f[3] != null)
        {
            Drawable drawable = f[3];
            ImageView imageview = j();
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            int i1 = -drawable.getIntrinsicHeight() / 3;
            int j1 = (c * 2) / 3;
            layoutparams.leftMargin = -c / 2;
            b.addView(imageview, layoutparams);
            a(imageview, j1, i1);
        }
    }

    static boolean i(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.b();
    }

    static int j(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.d;
    }

    private ImageView j()
    {
        Drawable drawable = f[3];
        ImageView imageview = new ImageView(a());
        imageview.setImageBitmap(a(drawable, getResources().getDrawable(0x7f020495)));
        return imageview;
    }

    static ImageView k(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.j();
    }

    static ShuffleIconDialog l(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.g();
    }

    static i m(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.v;
    }

    static String n(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.s;
    }

    static Runnable o(ShuffleLoadingActivity shuffleloadingactivity)
    {
        return shuffleloadingactivity.u;
    }

    public Bitmap a(Drawable drawable, Drawable drawable1)
    {
        Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() + drawable1.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        if (a == null)
        {
            a = new Paint();
            a.reset();
            a.setAntiAlias(true);
            a.setFilterBitmap(true);
        }
        int i1 = -com.go.weatherex.sidebar.shuffle.b.a(1.0F);
        canvas.drawBitmap(((BitmapDrawable)drawable).getBitmap(), 0.0F, 0.0F, a);
        canvas.drawBitmap(((BitmapDrawable)drawable1).getBitmap(), i1, i1 + drawable.getIntrinsicHeight(), a);
        return bitmap;
    }

    public void a(View view, com.go.weatherex.sidebar.shuffle.a a1)
    {
        if (b != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.leftMargin = -c / 2;
            b.addView(view, layoutparams);
        }
        ValueAnimator valueanimator = new ValueAnimator();
        valueanimator.setDuration(3000L);
        valueanimator.setObjectValues(new Object[] {
            new PointF(a1.a, a1.b)
        });
        valueanimator.setInterpolator(new LinearInterpolator());
        valueanimator.setEvaluator(new ah(this, a1));
        valueanimator.addListener(new ai(this, view));
        valueanimator.start();
        valueanimator.addUpdateListener(new aj(this, view));
    }

    public void onBackPressed()
    {
        long l1 = System.currentTimeMillis();
        if (l1 - h >= 800L)
        {
            h = l1;
            Object obj = g();
            if (obj != null)
            {
                a(2, ((ShuffleIconDialog) (obj)));
            }
            obj = h();
            if (obj != null)
            {
                a(((ImageView) (obj)));
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = new RelativeLayout(this);
        b.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setContentView(b);
        getWindow().setFormat(-3);
        com.go.weatherex.sidebar.shuffle.f.a(this);
        bundle = getIntent();
        if (bundle != null)
        {
            s = bundle.getStringExtra("facebook_id");
        }
        if (s != null && s.isEmpty())
        {
            s = "1624435071119252_1702129763349782";
        }
        if (com.go.weatherex.sidebar.shuffle.f.a())
        {
            com.go.weatherex.sidebar.shuffle.g.a(getApplicationContext()).a(s);
        } else
        {
            com.go.weatherex.sidebar.shuffle.g.a(getApplicationContext()).a();
        }
        com.go.weatherex.sidebar.shuffle.g.a(getApplicationContext()).a(v);
        d();
        c();
        (new Thread(u)).start();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.go.weatherex.sidebar.shuffle.g.a(getApplicationContext()).b();
        e = false;
        if (v != null)
        {
            v = null;
        }
        if (b != null)
        {
            b.removeAllViews();
        }
    }
}
