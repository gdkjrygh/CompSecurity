// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;

// Referenced classes of package com.whatsapp.util:
//            n, b1, Log, b4, 
//            ag, ar, k, bu, 
//            b_

public class FloatingChildLayout extends FrameLayout
{

    private static boolean a;
    private static final String z;
    private int b;
    private Rect c;
    private int d;
    private ValueAnimator e;
    private android.view.View.OnTouchListener f;
    private final int g;
    private int h;
    private View i;

    public FloatingChildLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Rect();
        d = 0;
        e = null;
        b = 0;
        context = getResources();
        h = context.getDimensionPixelOffset(0x7f0a0050);
        g = context.getInteger(0x10e0000);
        if (a)
        {
            e = ValueAnimator.ofInt(new int[] {
                0, 127
            });
            e.addUpdateListener(new n(this));
        }
        super.setBackgroundDrawable(new ColorDrawable(0));
    }

    private static int a(int j, int l, int i1)
    {
        if (l > i1)
        {
            return (i1 - l) / 2;
        } else
        {
            return Math.min(Math.max(j, 0), i1 - l);
        }
    }

    static int a(FloatingChildLayout floatingchildlayout, int j)
    {
        floatingchildlayout.b = j;
        return j;
    }

    static ValueAnimator a(FloatingChildLayout floatingchildlayout)
    {
        return floatingchildlayout.e;
    }

    private Rect a()
    {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        Rect rect1 = new Rect(c);
        rect1.offset(-rect.left, -rect.top);
        return rect1;
    }

    private static void a(View view, int j, int l)
    {
        view.layout(j, l, view.getMeasuredWidth() + j, view.getMeasuredHeight() + l);
    }

    public static void a(View view, Runnable runnable)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                b1 b1_1 = new b1(view, runnable);
                view.getViewTreeObserver().addOnDrawListener(b1_1);
                if (!Log.f)
                {
                    break label0;
                }
            }
            runnable = new b4(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(runnable);
        }
    }

    private void a(boolean flag, Runnable runnable)
    {
label0:
        {
            float f2 = 0.5F;
            float f3 = 1.0F;
            float f1;
            Object obj;
            if (flag)
            {
                f1 = 0.5F;
            } else
            {
                f1 = 1.0F;
            }
            if (flag)
            {
                f2 = 1.0F;
            }
            if (a)
            {
                ScaleAnimation scaleanimation;
                int j;
                if (flag)
                {
                    j = 0x10c0004;
                } else
                {
                    j = 0x10c0005;
                }
                i.setPivotX(c.centerX() - i.getLeft());
                i.setPivotY(c.centerY() - i.getTop());
                obj = i.animate().setDuration(g).setInterpolator(AnimationUtils.loadInterpolator(getContext(), j)).scaleX(f1).scaleY(f1);
                if (flag)
                {
                    f3 = 0.0F;
                }
                ((ViewPropertyAnimator) (obj)).alpha(f3).setListener(new ag(this, flag, runnable));
                if (!Log.f)
                {
                    break label0;
                }
            }
            scaleanimation = new ScaleAnimation(f2, f1, f2, f1, 0, c.centerX() - i.getLeft(), 0, c.centerY() - i.getTop());
            scaleanimation.setDuration(g);
            scaleanimation.setFillAfter(true);
            if (flag)
            {
                obj = new AccelerateInterpolator();
            } else
            {
                obj = new DecelerateInterpolator();
            }
            scaleanimation.setInterpolator(((android.view.animation.Interpolator) (obj)));
            scaleanimation.setAnimationListener(new ar(this, flag, runnable));
            i.startAnimation(scaleanimation);
        }
    }

    static int b(FloatingChildLayout floatingchildlayout)
    {
        return floatingchildlayout.g;
    }

    public static void b(View view, Runnable runnable)
    {
        runnable = new k(view, runnable);
        view.getViewTreeObserver().addOnGlobalLayoutListener(runnable);
    }

    static int c(FloatingChildLayout floatingchildlayout)
    {
        return floatingchildlayout.b;
    }

    static boolean c()
    {
        return a;
    }

    static View d(FloatingChildLayout floatingchildlayout)
    {
        return floatingchildlayout.i;
    }

    private void d()
    {
        i.invalidate();
    }

    public boolean a(Runnable runnable)
    {
        if (b == 1 || b == 2)
        {
            b = 3;
            d();
            a(true, runnable);
            return true;
        } else
        {
            return false;
        }
    }

    public void b(Runnable runnable)
    {
        if (b == 0)
        {
            b = 1;
            a(false, runnable);
        }
    }

    public boolean b()
    {
        return b == 2;
    }

    public void e()
    {
        if (d == 0)
        {
            d = 1;
            d();
            a(this, new bu(this));
        }
    }

    public void f()
    {
label0:
        {
            boolean flag = Log.f;
            if (d != 1)
            {
                break label0;
            }
            d = 3;
            if (a)
            {
                if (e.isRunning())
                {
                    e.reverse();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                    127, 0
                });
                valueanimator.addUpdateListener(new b_(this));
                valueanimator.setDuration(g).start();
                if (!flag)
                {
                    break label0;
                }
            }
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(g);
            alphaanimation.setFillAfter(true);
            startAnimation(alphaanimation);
        }
    }

    protected void onFinishInflate()
    {
        i = findViewById(0x1020002);
        i.setDuplicateParentStateEnabled(true);
        if (a)
        {
            i.setScaleX(0.5F);
            i.setScaleY(0.5F);
            i.setAlpha(0.0F);
        }
    }

    protected void onLayout(boolean flag, int j, int l, int i1, int j1)
    {
label0:
        {
            View view = i;
            Rect rect = a();
            j = view.getMeasuredWidth();
            l = view.getMeasuredHeight();
            if (h != -1)
            {
                i1 = (getWidth() - j) / 2;
                j1 = h;
                a(view, a(i1, j, getWidth()), a(j1, l, getHeight()));
                if (!Log.f)
                {
                    break label0;
                }
            }
            i1 = rect.centerX();
            j1 = j / 2;
            int k1 = rect.centerY();
            int l1 = Math.round((float)l * 0.75F);
            a(view, a(i1 - j1, j, getWidth()), a(k1 - l1, l, getHeight()));
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (f != null)
        {
            return f.onTouch(this, motionevent);
        } else
        {
            return false;
        }
    }

    public void setBackground(Drawable drawable)
    {
        Log.e(z);
    }

    public void setBackgroundColorAlpha(int j)
    {
        setBackgroundColor(j << 24);
    }

    public void setChildTargetScreen(Rect rect)
    {
        c = rect;
        requestLayout();
    }

    public void setOnOutsideTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        f = ontouchlistener;
    }

    static 
    {
        char ac[];
        int j;
        int l;
        ac = "\013\033k9\000O\007`j6\016\027ny\006\000\001kz\\FX%w\000O\035v>\031\016\032dy\021\013Tlp\000\n\006k\177\030\003\r".toCharArray();
        l = ac.length;
        j = 0;
_L6:
        if (l <= j)
        {
            z = (new String(ac)).intern();
            byte byte0;
            char c1;
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
            return;
        }
        c1 = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 84
    //                   0 102
    //                   1 108
    //                   2 114
    //                   3 119;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_119;
_L1:
        byte0 = 116;
_L7:
        ac[j] = (char)(byte0 ^ c1);
        j++;
          goto _L6
_L2:
        byte0 = 111;
          goto _L7
_L3:
        byte0 = 116;
          goto _L7
_L4:
        byte0 = 5;
          goto _L7
        byte0 = 30;
          goto _L7
    }
}
