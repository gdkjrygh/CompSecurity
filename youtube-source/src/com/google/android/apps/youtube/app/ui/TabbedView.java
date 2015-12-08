// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.core.utils.Typefaces;
import com.google.android.apps.youtube.core.utils.l;
import com.google.android.youtube.d;
import com.google.android.youtube.f;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            gl, gn, gm, gq, 
//            go, gp

public class TabbedView extends LinearLayout
{

    private static final int a;
    private static final int b = Color.parseColor("#e62117");
    private static final int c = Color.parseColor("#33000000");
    private static final int d = Color.parseColor("#333333");
    private static final int e = Color.parseColor("#E1E1E1");
    private gp A;
    private int B;
    private gn C;
    private int D;
    private float E;
    private Rect F;
    private Paint G;
    private Context f;
    private ArrayList g;
    private HorizontalScrollView h;
    private LinearLayout i;
    private ViewPager j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private android.view.View.OnClickListener y;
    private go z;

    public TabbedView(Context context)
    {
        super(context);
        a(context);
    }

    public TabbedView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public TabbedView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a(context);
    }

    static float a(TabbedView tabbedview, float f1)
    {
        tabbedview.E = f1;
        return f1;
    }

    static int a(TabbedView tabbedview, int i1)
    {
        tabbedview.D = i1;
        return i1;
    }

    static ArrayList a(TabbedView tabbedview)
    {
        return tabbedview.g;
    }

    private void a(Context context)
    {
        android.util.DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        l = com.google.android.apps.youtube.core.utils.l.a(displaymetrics, 48);
        m = a;
        n = com.google.android.apps.youtube.core.utils.l.a(displaymetrics, 4);
        o = b;
        k = com.google.android.apps.youtube.core.utils.l.a(displaymetrics, 48);
        p = com.google.android.apps.youtube.core.utils.l.a(displaymetrics, 1);
        q = c;
        r = d;
        s = com.google.android.apps.youtube.core.utils.l.a(displaymetrics, 20);
        t = 16;
        u = com.google.android.apps.youtube.core.utils.l.a(displaymetrics, 1);
        v = e;
        w = com.google.android.apps.youtube.core.utils.l.a(displaymetrics, 10);
        x = com.google.android.apps.youtube.core.utils.l.a(displaymetrics, 10);
        f = context;
        g = new ArrayList(10);
        y = new gl(this);
        setOrientation(1);
        h = new HorizontalScrollView(context);
        h.setHorizontalScrollBarEnabled(false);
        h.setFillViewport(true);
        h.setVisibility(8);
        addView(h, new android.widget.LinearLayout.LayoutParams(-1, -2));
        i = new LinearLayout(context);
        i.setOrientation(0);
        i.setFocusable(false);
        i.setClickable(false);
        i.setBackgroundResource(m);
        h.addView(i, new android.widget.FrameLayout.LayoutParams(-2, l));
        F = new Rect();
        G = new Paint();
        G.setStyle(android.graphics.Paint.Style.FILL);
        j = new ViewPager(context);
        addView(j, new android.widget.LinearLayout.LayoutParams(-1, -1));
        C = new gn(this, (byte)0);
        j.setAdapter(C);
        j.setOnPageChangeListener(new gm(this));
        B = -1;
    }

    static void a(TabbedView tabbedview, View view)
    {
        for (int i1 = 0; i1 < tabbedview.g.size(); i1++)
        {
            if (((gq)tabbedview.g.get(i1)).a == view)
            {
                tabbedview.a(i1);
            }
        }

    }

    static int b(TabbedView tabbedview)
    {
        return tabbedview.k;
    }

    private void b(int i1)
    {
        if (B >= 0)
        {
            int j1 = B;
            gp gp;
            if (A != null)
            {
                gp = A;
            }
        }
        B = i1;
        i1 = B;
        if (z != null)
        {
            z.a(i1);
        }
    }

    static void b(TabbedView tabbedview, int i1)
    {
        tabbedview.b(i1);
    }

    static HorizontalScrollView c(TabbedView tabbedview)
    {
        return tabbedview.h;
    }

    static Rect d(TabbedView tabbedview)
    {
        return tabbedview.F;
    }

    static LinearLayout e(TabbedView tabbedview)
    {
        return tabbedview.i;
    }

    static ViewPager f(TabbedView tabbedview)
    {
        return tabbedview.j;
    }

    public final View a(int i1, int j1)
    {
        View view = LayoutInflater.from(f).inflate(j1, null);
        a(f.getText(i1), view);
        return view;
    }

    public final void a()
    {
        B = -1;
        D = B;
        E = 0.0F;
        h.setVisibility(8);
        i.removeAllViews();
        g.clear();
        C.b();
    }

    public final void a(int i1)
    {
        while (i1 < 0 || i1 >= g.size() || i1 == B) 
        {
            return;
        }
        j.setCurrentItem(i1);
    }

    public final void a(CharSequence charsequence, View view)
    {
        if (g.size() > 0)
        {
            View view1 = new View(f);
            view1.setBackgroundColor(v);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(u, -1);
            layoutparams.bottomMargin = x;
            layoutparams.topMargin = w;
            i.addView(view1, layoutparams);
        }
        TextView textview = new TextView(f);
        textview.setGravity(17);
        textview.setText(charsequence);
        textview.setTextColor(r);
        textview.setTextSize(2, t);
        textview.setTypeface(Typefaces.ROBOTO_REGULAR.toTypeface(f));
        textview.setSingleLine();
        textview.setLines(1);
        textview.setOnClickListener(y);
        charsequence = new TypedValue();
        f.getTheme().resolveAttribute(d.a, charsequence, true);
        textview.setBackgroundResource(((TypedValue) (charsequence)).resourceId);
        textview.setPadding(s, 0, s, 0);
        charsequence = new android.widget.LinearLayout.LayoutParams(-2, -1);
        charsequence.weight = 1.0F;
        i.addView(textview, charsequence);
        charsequence = view.getLayoutParams();
        if (charsequence != null)
        {
            charsequence = new android.widget.FrameLayout.LayoutParams(charsequence);
            charsequence.width = -1;
            charsequence.height = -1;
        } else
        {
            new android.widget.FrameLayout.LayoutParams(-1, -1);
        }
        charsequence = new gq(textview, view);
        g.add(charsequence);
        C.b();
        if (g.size() == 1)
        {
            b(0);
            D = B;
            E = 0.0F;
            i.invalidate(F);
        }
        if (g.size() > 1)
        {
            h.setVisibility(0);
        }
    }

    public final int b()
    {
        return B;
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        boolean flag = super.drawChild(canvas, view, l1);
        if (view == h && g.size() > 0)
        {
            view = ((gq)g.get(D)).a;
            int j1 = view.getLeft();
            int i1 = view.getRight();
            if (E > 0.0F && D < g.size())
            {
                view = ((gq)g.get(D + 1)).a;
                int k1 = Math.round((float)(view.getLeft() - j1) * E);
                i1 = Math.round((float)(view.getRight() - i1) * E) + i1;
                j1 += k1;
            }
            int i2 = F.left - h.getScrollX();
            G.setColor(o);
            canvas.drawRect(j1 + i2, F.top, i1 + i2, F.bottom, G);
            G.setColor(q);
            canvas.drawRect(F.left, F.bottom - p, F.right, F.bottom, G);
        }
        return flag;
    }

    public void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        F.set(i.getLeft(), i.getBottom() - n, i.getRight(), i.getBottom());
    }

    public void setOnTabSelectedListener(go go1)
    {
        z = go1;
    }

    public void setOnTabUnselectedListener(gp gp)
    {
        A = gp;
    }

    static 
    {
        a = f.t;
    }
}
