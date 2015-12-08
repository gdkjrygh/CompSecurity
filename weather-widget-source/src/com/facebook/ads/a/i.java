// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ImpressionListener;
import com.facebook.ads.NativeAd;
import java.util.Arrays;

// Referenced classes of package com.facebook.ads.a:
//            af, d, x, ac, 
//            n, ah, w

public class i extends af
    implements AdListener, d, x
{

    private final AdView a;
    private ProgressBar b;
    private DisplayMetrics c;
    private ac d;
    private AdListener e;
    private boolean f;
    private RelativeLayout g;
    private TextView h;
    private boolean i;
    private ViewGroup j;
    private View k;
    private View l;
    private ah m;

    public i(AdView adview, String s, AdSize adsize)
    {
        super(adview.getContext());
        f = false;
        i = false;
        a = adview;
        if (adsize == null || adsize != AdSize.RECTANGLE_HEIGHT_250)
        {
            throw new IllegalArgumentException("adSize");
        } else
        {
            adview = adview.getContext();
            c = adview.getResources().getDisplayMetrics();
            setMinWidth(Math.round(300F * c.density));
            setMaxWidth(Math.round(360F * c.density));
            setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, Math.round(250F * c.density)));
            setGravity(17);
            b = new ProgressBar(adview, null, 0x1010079);
            b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
            addView(b);
            d = new ac(adview, s, AdSize.RECTANGLE_HEIGHT_250, n.j, true);
            d.setAdListener(this);
            return;
        }
    }

    private View a(View view)
    {
        TextView textview = new TextView(getContext());
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(3, view.getId());
        layoutparams.setMargins(Math.round(5F * c.density), Math.round(c.density * 10F), Math.round(0.0F), Math.round(c.density * 10F));
        textview.setTextColor(0xff4e5665);
        textview.setLayoutParams(layoutparams);
        textview.setText(d.getAdBody());
        textview.setTextSize(10F);
        textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textview.setMaxLines(3);
        textview.setGravity(16);
        return textview;
    }

    private View a(ViewGroup viewgroup, View view)
    {
        RelativeLayout relativelayout = new RelativeLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -1);
        layoutparams.weight = 1.0F;
        relativelayout.setLayoutParams(layoutparams);
        viewgroup = b(viewgroup, view);
        relativelayout.addView(viewgroup);
        view = a(((View) (viewgroup)));
        relativelayout.addView(view);
        m = (new ah(viewgroup, view)).a(Math.round(60F * c.density)).a();
        return relativelayout;
    }

    static boolean a(i i1)
    {
        return i1.f;
    }

    static boolean a(i i1, boolean flag)
    {
        i1.f = flag;
        return flag;
    }

    private View b(ViewGroup viewgroup, View view)
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(10);
        layoutparams.setMargins(Math.round(5F * c.density), Math.round(c.density * 10F), Math.round(0.0F), Math.round(c.density * 10F));
        linearlayout.setLayoutParams(layoutparams);
        linearlayout.setOrientation(1);
        linearlayout.addView(c(viewgroup, view));
        linearlayout.addView(i());
        return linearlayout;
    }

    static ac b(i i1)
    {
        return i1.d;
    }

    private View c(ViewGroup viewgroup, View view)
    {
        TextView textview = new TextView(getContext());
        textview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F));
        textview.setText(d.getAdTitle());
        textview.setTypeface(Typeface.DEFAULT_BOLD);
        textview.setTextColor(0xff000000);
        textview.setTextSize(16F);
        textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textview.setSingleLine(true);
        android.text.TextPaint textpaint = textview.getPaint();
        String s2 = d.getAdTitle();
        String s1 = s2.substring(0, Math.min(20, s2.length()));
        String s = s1;
        if (s2.length() > 20)
        {
            s = (new StringBuilder()).append(s1).append("\u2026").toString();
        }
        if (textpaint.measureText(s) >= (float)getMeasuredWidth() - 185F * c.density)
        {
            viewgroup.removeView(view);
        }
        return textview;
    }

    static void c(i i1)
    {
        i1.m();
    }

    static ViewGroup d(i i1)
    {
        return i1.j;
    }

    static View e(i i1)
    {
        return i1.k;
    }

    private ViewGroup e()
    {
        RelativeLayout relativelayout = new RelativeLayout(getContext());
        Object obj = new android.widget.RelativeLayout.LayoutParams(-1, Math.round(190F * c.density));
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
        relativelayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = new ImageView(getContext());
        relativelayout.addView(((View) (obj)));
        ((ImageView) (obj)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        (new w(((ImageView) (obj)))).a(this).execute(new String[] {
            d.getAdCoverImage().getUrl()
        });
        l = k();
        relativelayout.addView(l);
        return relativelayout;
    }

    private View f()
    {
        RelativeLayout relativelayout = new RelativeLayout(getContext());
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, Math.round(60F * c.density));
        layoutparams.addRule(12);
        relativelayout.setLayoutParams(layoutparams);
        relativelayout.addView(g());
        return relativelayout;
    }

    static RelativeLayout f(i i1)
    {
        return i1.g;
    }

    private View g()
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        linearlayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        linearlayout.setBackgroundColor(-1);
        linearlayout.setOrientation(0);
        View view = h();
        linearlayout.addView(view);
        linearlayout.addView(a(linearlayout, view));
        View view1 = j();
        linearlayout.addView(view1);
        d.unregisterView();
        d.registerViewForInteraction(this, Arrays.asList(new View[] {
            view, view1
        }));
        return linearlayout;
    }

    static TextView g(i i1)
    {
        return i1.h;
    }

    private View h()
    {
        ImageView imageview = new ImageView(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(Math.round(c.density * 50F), Math.round(c.density * 50F));
        layoutparams.setMargins(Math.round(c.density * 5F), Math.round(c.density * 5F), Math.round(c.density * 5F), Math.round(c.density * 5F));
        imageview.setLayoutParams(layoutparams);
        NativeAd.downloadAndDisplayImage(d.getAdIcon(), imageview);
        return imageview;
    }

    private View i()
    {
        com.facebook.ads.NativeAd.Rating rating = d.getAdStarRating();
        if (rating != null && rating.getValue() >= 3.5D)
        {
            RatingBar ratingbar = new RatingBar(getContext(), null, 0x101007d);
            ratingbar.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            ratingbar.setStepSize(0.1F);
            ratingbar.setIsIndicator(true);
            ratingbar.setNumStars((int)rating.getScale());
            ratingbar.setRating((float)rating.getValue());
            return ratingbar;
        } else
        {
            TextView textview = new TextView(getContext());
            textview.setText(d.getAdSocialContext());
            textview.setTextColor(0xff000000);
            textview.setTextSize(12F);
            textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textview.setSingleLine(true);
            return textview;
        }
    }

    private View j()
    {
        Button button = new Button(getContext(), null, 0x101032b);
        Object obj = new android.widget.LinearLayout.LayoutParams(Math.round(100F * c.density), Math.round(40F * c.density));
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(Math.round(c.density * 10F), Math.round(c.density * 10F), Math.round(c.density * 10F), Math.round(c.density * 10F));
        button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        button.setTextColor(-1);
        button.setText(d.getAdCallToAction());
        button.setTextSize(14F);
        button.setGravity(17);
        obj = new GradientDrawable();
        ((GradientDrawable) (obj)).setColor(0xff8bc615);
        ((GradientDrawable) (obj)).setCornerRadius(5F * c.density);
        button.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        return button;
    }

    private View k()
    {
        g = new RelativeLayout(getContext());
        Object obj = d.getAdChoicesIcon();
        Object obj1 = new android.widget.RelativeLayout.LayoutParams(Math.round((float)(((com.facebook.ads.NativeAd.Image) (obj)).getWidth() + 4) * c.density), Math.round((float)(((com.facebook.ads.NativeAd.Image) (obj)).getHeight() + 2) * c.density));
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(11);
        g.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        obj1 = new GradientDrawable();
        ((GradientDrawable) (obj1)).setColor(0xb3000000);
        ((GradientDrawable) (obj1)).setCornerRadii(new float[] {
            0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, (float)Math.round(c.density * 8F), (float)Math.round(c.density * 8F)
        });
        g.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj1)));
        g.setOnTouchListener(new _cls1());
        obj1 = new ImageView(getContext());
        g.addView(((View) (obj1)));
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(Math.round((float)((com.facebook.ads.NativeAd.Image) (obj)).getWidth() * c.density), Math.round((float)((com.facebook.ads.NativeAd.Image) (obj)).getHeight() * c.density));
        layoutparams.addRule(9);
        layoutparams.addRule(15, -1);
        layoutparams.setMargins(Math.round(4F * c.density), Math.round(c.density * 2.0F), Math.round(c.density * 2.0F), Math.round(c.density * 2.0F));
        ((ImageView) (obj1)).setLayoutParams(layoutparams);
        NativeAd.downloadAndDisplayImage(((com.facebook.ads.NativeAd.Image) (obj)), ((ImageView) (obj1)));
        h = new TextView(getContext());
        g.addView(h);
        obj = new android.widget.RelativeLayout.LayoutParams(0, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11, ((ImageView) (obj1)).getId());
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(15, -1);
        h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        h.setSingleLine();
        h.setText("AdChoices");
        h.setTextSize(10F);
        h.setTextColor(0xffbdc1c9);
        f = false;
        return g;
    }

    private void l()
    {
        _cls2 _lcls2 = new _cls2();
        _lcls2.setDuration(300L);
        _lcls2.setFillAfter(true);
        _lcls2.setAnimationListener(new _cls3());
        startAnimation(_lcls2);
    }

    private void m()
    {
        Object obj = new Paint();
        ((Paint) (obj)).setTextSize(h.getTextSize());
        int j1 = Math.round(((Paint) (obj)).measureText("AdChoices") + 4F * c.density);
        int i1 = g.getWidth();
        j1 += i1;
        f = true;
        obj = new _cls4(i1, j1);
        ((Animation) (obj)).setAnimationListener(new _cls5(j1, i1));
        ((Animation) (obj)).setDuration(300L);
        ((Animation) (obj)).setFillAfter(true);
        g.startAnimation(((Animation) (obj)));
    }

    public void a()
    {
        d.disableAutoRefresh();
    }

    public void b()
    {
        d.loadAd();
    }

    public void c()
    {
        d.destroy();
    }

    public void d()
    {
        if (i)
        {
            j.setVisibility(4);
            k.setVisibility(4);
            addView(j);
            addView(k);
            l();
        } else
        {
            i = true;
            removeView(b);
            setGravity(0);
            addView(j);
            addView(k);
        }
        e.onAdLoaded(a);
    }

    public void onAdClicked(Ad ad)
    {
        e.onAdClicked(a);
    }

    public void onAdLoaded(Ad ad)
    {
        if (d == null || d != ad)
        {
            return;
        } else
        {
            j = e();
            k = f();
            return;
        }
    }

    public void onError(Ad ad, AdError aderror)
    {
        e.onError(a, aderror);
        removeView(b);
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        d.onWindowVisibilityChanged(i1);
        if (i1 == 0)
        {
            if (m != null)
            {
                m.a();
            }
            if (j != null && l != null)
            {
                j.removeView(l);
                l = k();
                j.addView(l);
            }
        }
    }

    public void setAdListener(AdListener adlistener)
    {
        e = adlistener;
    }

    public void setImpressionListener(ImpressionListener impressionlistener)
    {
        d.setImpressionListener(impressionlistener);
    }

    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final i a;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                if (i.a(a))
                {
                    view = new Intent();
                    view.setAction("android.intent.action.VIEW");
                    view.addCategory("android.intent.category.BROWSABLE");
                    view.setData(Uri.parse(i.b(a).getAdChoicesLinkUrl()));
                    a.getContext().startActivity(view);
                } else
                {
                    i.c(a);
                }
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            a = i.this;
            super();
        }
    }


    private class _cls2 extends Animation
    {

        final i a;
        private boolean b;
        private boolean c;

        protected void applyTransformation(float f1, Transformation transformation)
        {
            double d1 = 3.1415926535897931D * (double)f1;
            float f3 = (float)((180D * d1) / 3.1415926535897931D);
            float f2 = f3;
            if (f1 >= 0.5F)
            {
                f1 = f3 - 180F;
                f2 = f1;
                if (!b)
                {
                    b = true;
                    i.d(a).setVisibility(0);
                    i.e(a).setVisibility(0);
                    f2 = f1;
                }
            }
            f1 = f2;
            if (c)
            {
                f1 = -f2;
            }
            Camera camera = new Camera();
            transformation = transformation.getMatrix();
            camera.save();
            camera.translate(0.0F, 0.0F, (float)(Math.sin(d1) * 150D));
            camera.rotateY(f1);
            camera.getMatrix(transformation);
            camera.restore();
            int i1 = a.getWidth() / 2;
            int j1 = a.getHeight() / 2;
            transformation.preTranslate(-i1, -j1);
            transformation.postTranslate(i1, j1);
        }

        _cls2()
        {
            a = i.this;
            super();
            b = false;
            c = false;
        }
    }


    private class _cls3
        implements android.view.animation.Animation.AnimationListener
    {

        final i a;

        public void onAnimationEnd(Animation animation)
        {
            a.removeView(a.getChildAt(0));
            a.removeView(a.getChildAt(0));
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls3()
        {
            a = i.this;
            super();
        }
    }


    private class _cls4 extends Animation
    {

        final int a;
        final int b;
        final i c;

        protected void applyTransformation(float f1, Transformation transformation)
        {
            int i1 = (int)((float)a + (float)(b - a) * f1);
            i.f(c).getLayoutParams().width = i1;
            i.f(c).requestLayout();
            i.g(c).getLayoutParams().width = i1 - a;
            i.g(c).requestLayout();
        }

        public boolean willChangeBounds()
        {
            return true;
        }

        _cls4(int j1, int k1)
        {
            c = i.this;
            a = j1;
            b = k1;
            super();
        }
    }


    private class _cls5
        implements android.view.animation.Animation.AnimationListener
    {

        final int a;
        final int b;
        final i c;

        public void onAnimationEnd(Animation animation)
        {
            class _cls1
                implements Runnable
            {

                final _cls5 a;

                public void run()
                {
                    if (!i.a(a.c))
                    {
                        return;
                    } else
                    {
                        i.a(a.c, false);
                        class _cls1 extends Animation
                        {

                            final _cls1 a;

                            protected void applyTransformation(float f1, Transformation transformation)
                            {
                                int i1 = (int)((float)a.a.a + (float)(a.a.b - a.a.a) * f1);
                                i.f(a.a.c).getLayoutParams().width = i1;
                                i.f(a.a.c).requestLayout();
                                i.g(a.a.c).getLayoutParams().width = i1 - a.a.b;
                                i.g(a.a.c).requestLayout();
                            }

                            public boolean willChangeBounds()
                            {
                                return true;
                            }

                            _cls1()
                            {
                                a = _cls1.this;
                                super();
                            }
                        }

                        _cls1 _lcls1 = new _cls1();
                        _lcls1.setDuration(300L);
                        _lcls1.setFillAfter(true);
                        i.f(a.c).startAnimation(_lcls1);
                        return;
                    }
                }

                _cls1()
                {
                    a = _cls5.this;
                    super();
                }
            }

            (new Handler()).postDelayed(new _cls1(), 3000L);
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls5(int j1, int k1)
        {
            c = i.this;
            a = j1;
            b = k1;
            super();
        }
    }

}
