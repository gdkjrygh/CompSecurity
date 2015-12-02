// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;

// Referenced classes of package com.whatsapp:
//            App, us, np, DialogToastActivity, 
//            sj, e0, hq, ak7, 
//            abz

public class PagerSlidingTabStrip extends HorizontalScrollView
{

    private static final int A[];
    private static final String E;
    private int B;
    private Typeface C;
    private int D;
    private ViewPager a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final us f;
    private int g;
    private android.widget.LinearLayout.LayoutParams h;
    private int i;
    private int j;
    private Paint k;
    private LinearLayout l;
    private int m;
    private android.widget.LinearLayout.LayoutParams n;
    private int o;
    private boolean p;
    private float q;
    private int r;
    private int s;
    private boolean t;
    private int u;
    private Paint v;
    private int w;
    private int x;
    public android.support.v4.view.ViewPager.OnPageChangeListener y;
    private Locale z;

    public PagerSlidingTabStrip(Context context)
    {
        this(context, null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeset, int i1)
    {
        int j1 = App.am;
        super(context, attributeset, i1);
        f = new us(this, null);
        b = 0;
        q = 0.0F;
        i = 0xff666666;
        e = 0x1a000000;
        u = 0x1a000000;
        t = false;
        p = true;
        D = 52;
        m = 8;
        B = 2;
        c = 12;
        w = 24;
        o = 1;
        d = 12;
        j = 0xff666666;
        C = null;
        g = 1;
        s = 0;
        r = 0x7f02009b;
        setFillViewport(true);
        setWillNotDraw(false);
        l = new LinearLayout(context);
        l.setOrientation(0);
        l.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(l);
        Object obj = getResources().getDisplayMetrics();
        D = (int)TypedValue.applyDimension(1, D, ((android.util.DisplayMetrics) (obj)));
        m = (int)TypedValue.applyDimension(1, m, ((android.util.DisplayMetrics) (obj)));
        B = (int)TypedValue.applyDimension(1, B, ((android.util.DisplayMetrics) (obj)));
        c = (int)TypedValue.applyDimension(1, c, ((android.util.DisplayMetrics) (obj)));
        w = (int)TypedValue.applyDimension(1, w, ((android.util.DisplayMetrics) (obj)));
        o = (int)TypedValue.applyDimension(1, o, ((android.util.DisplayMetrics) (obj)));
        d = (int)TypedValue.applyDimension(2, d, ((android.util.DisplayMetrics) (obj)));
        obj = context.obtainStyledAttributes(attributeset, A);
        d = ((TypedArray) (obj)).getDimensionPixelSize(0, d);
        j = ((TypedArray) (obj)).getColor(1, j);
        ((TypedArray) (obj)).recycle();
        context = context.obtainStyledAttributes(attributeset, np.PagerSlidingTabStrip);
        try
        {
            i = context.getColor(0, i);
            e = context.getColor(1, e);
            u = context.getColor(2, u);
            m = context.getDimensionPixelSize(3, m);
            B = context.getDimensionPixelSize(4, B);
            c = context.getDimensionPixelSize(5, c);
            w = context.getDimensionPixelSize(6, w);
            r = context.getResourceId(8, r);
            t = context.getBoolean(9, t);
            D = context.getDimensionPixelSize(7, D);
            p = context.getBoolean(10, p);
            context.recycle();
            v = new Paint();
            v.setAntiAlias(true);
            v.setStyle(android.graphics.Paint.Style.FILL);
            k = new Paint();
            k.setAntiAlias(true);
            k.setStrokeWidth(o);
            h = new android.widget.LinearLayout.LayoutParams(-2, -1);
            n = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            if (z == null)
            {
                z = getResources().getConfiguration().locale;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        try
        {
            if (DialogToastActivity.g != 0)
            {
                App.am = j1 + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
    }

    static float a(PagerSlidingTabStrip pagerslidingtabstrip, float f1)
    {
        pagerslidingtabstrip.q = f1;
        return f1;
    }

    static int a(PagerSlidingTabStrip pagerslidingtabstrip, int i1)
    {
        pagerslidingtabstrip.b = i1;
        return i1;
    }

    static LinearLayout a(PagerSlidingTabStrip pagerslidingtabstrip)
    {
        return pagerslidingtabstrip.l;
    }

    private void a(int i1, int j1)
    {
        int k1;
        try
        {
            k1 = x;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l1 = l.getChildAt(i1).getLeft() + j1;
        if (i1 <= 0)
        {
            i1 = l1;
            if (j1 <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = l1 - D;
        if (i1 == s) goto _L1; else goto _L3
_L3:
        s = i1;
        scrollTo(i1, 0);
        return;
        IllegalStateException illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
    }

    private void a(int i1, View view)
    {
        LinearLayout linearlayout;
        view.setFocusable(true);
        view.setOnClickListener(new sj(this, i1));
        view.setPadding(w, 0, w, 0);
        linearlayout = l;
        if (!t) goto _L2; else goto _L1
_L1:
        android.widget.LinearLayout.LayoutParams layoutparams = n;
_L4:
        linearlayout.addView(view, i1, layoutparams);
        return;
        view;
        throw view;
_L2:
        layoutparams = h;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i1, String s1)
    {
        TextView textview = new TextView(getContext());
        textview.setText(s1);
        textview.setGravity(17);
        textview.setSingleLine();
        a(i1, ((View) (textview)));
    }

    static void a(PagerSlidingTabStrip pagerslidingtabstrip, int i1, int j1)
    {
        pagerslidingtabstrip.a(i1, j1);
    }

    static int b(PagerSlidingTabStrip pagerslidingtabstrip)
    {
        return pagerslidingtabstrip.b;
    }

    private void b()
    {
        int i1;
        int j1;
        j1 = App.am;
        i1 = 0;
_L2:
        Object obj;
        if (i1 >= x)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj = l.getChildAt(i1);
        ((View) (obj)).setBackgroundResource(r);
        if (!(obj instanceof TextView))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        obj = (TextView)obj;
        boolean flag;
        ((TextView) (obj)).setTextSize(0, d);
        ((TextView) (obj)).setTypeface(C, g);
        ((TextView) (obj)).setTextColor(j);
        flag = p;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        int k1 = android.os.Build.VERSION.SDK_INT;
        if (k1 >= 14)
        {
            IllegalStateException illegalstateexception;
            try
            {
                ((TextView) (obj)).setAllCaps(true);
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_125;
            }
        }
        ((TextView) (obj)).setText(((TextView) (obj)).getText().toString().toUpperCase(z));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        return;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void b(int i1, int j1)
    {
        ImageButton imagebutton = new ImageButton(getContext());
        imagebutton.setImageResource(j1);
        a(i1, imagebutton);
    }

    static ViewPager c(PagerSlidingTabStrip pagerslidingtabstrip)
    {
        return pagerslidingtabstrip.a;
    }

    public void a()
    {
        int i1;
        int j1;
        j1 = App.am;
        l.removeAllViews();
        x = a.getAdapter().getCount();
        i1 = 0;
_L2:
        if (i1 >= x)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        boolean flag = a.getAdapter() instanceof e0;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        a(i1, ((e0)a.getAdapter()).a(i1));
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        flag = a.getAdapter() instanceof hq;
        if (flag)
        {
            IllegalStateException illegalstateexception;
            try
            {
                b(i1, ((hq)a.getAdapter()).a(i1));
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_140;
            }
        }
        a(i1, a.getAdapter().getPageTitle(i1).toString());
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        b();
        getViewTreeObserver().addOnGlobalLayoutListener(new ak7(this));
        return;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void onDraw(Canvas canvas)
    {
        int j1 = App.am;
        boolean flag;
        super.onDraw(canvas);
        flag = isInEditMode();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        try
        {
            if (x == 0)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            throw canvas;
        }
        break MISSING_BLOCK_LABEL_35;
        canvas;
        throw canvas;
label0:
        {
            int k1 = getHeight();
            v.setColor(i);
            View view = l.getChildAt(b);
            float f4 = view.getLeft();
            float f3 = view.getRight();
            float f2 = f4;
            float f1 = f3;
            int i1;
            int l1;
            try
            {
                if (q <= 0.0F)
                {
                    break label0;
                }
                i1 = b;
                l1 = x;
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                throw canvas;
            }
            f2 = f4;
            f1 = f3;
            if (i1 < l1 - 1)
            {
                view = l.getChildAt(b + 1);
                f2 = view.getLeft();
                f1 = view.getRight();
                float f5 = q;
                f2 = f4 * (1.0F - q) + f2 * f5;
                f1 = f1 * q + (1.0F - q) * f3;
            }
        }
        canvas.drawRect(f2, k1 - m, f1, k1, v);
        v.setColor(e);
        canvas.drawRect(0.0F, k1 - B, l.getWidth(), k1, v);
        k.setColor(u);
        i1 = 0;
        do
        {
            if (i1 >= x - 1)
            {
                break;
            }
            view = l.getChildAt(i1);
            canvas.drawLine(view.getRight(), c, view.getRight(), k1 - c, k);
            if (j1 != 0)
            {
                break;
            }
            i1++;
        } while (true);
        break MISSING_BLOCK_LABEL_336;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (abz)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        b = ((abz) (parcelable)).a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        abz abz1 = new abz(super.onSaveInstanceState());
        abz1.a = b;
        return abz1;
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        y = onpagechangelistener;
    }

    public void setViewPager(ViewPager viewpager)
    {
        try
        {
            a = viewpager;
            if (viewpager.getAdapter() == null)
            {
                throw new IllegalStateException(E);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ViewPager viewpager)
        {
            throw viewpager;
        }
        viewpager.setOnPageChangeListener(f);
        a();
    }

    static 
    {
        char ac[];
        int i1;
        int j1;
        ac = "T-\032szc#\032v\nf+\032w\nl+\013$Bc2\032$Kf%\017pOpd\026jYv%\021gO,".toCharArray();
        j1 = ac.length;
        i1 = 0;
_L7:
        char c1;
        if (j1 <= i1)
        {
            E = (new String(ac)).intern();
            A = (new int[] {
                0x1010095, 0x1010098
            });
            return;
        }
        c1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 84
    //                   0 102
    //                   1 107
    //                   2 113
    //                   3 119;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_119;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 42;
_L8:
        ac[i1] = (char)(byte0 ^ c1);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 2;
          goto _L8
_L3:
        byte0 = 68;
          goto _L8
_L4:
        byte0 = 127;
          goto _L8
        byte0 = 4;
          goto _L8
    }
}
