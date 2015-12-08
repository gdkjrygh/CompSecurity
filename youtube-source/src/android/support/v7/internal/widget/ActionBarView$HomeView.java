// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.a.f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;

class  extends FrameLayout
{

    private ImageView a;
    private ImageView b;
    private int c;
    private int d;
    private Drawable e;

    public final int a()
    {
        if (a.getVisibility() == 8)
        {
            return c;
        } else
        {
            return 0;
        }
    }

    public final void a(int i)
    {
        d = i;
        ImageView imageview = a;
        Drawable drawable;
        if (i != 0)
        {
            drawable = getResources().getDrawable(i);
        } else
        {
            drawable = null;
        }
        imageview.setImageDrawable(drawable);
    }

    public final void a(Drawable drawable)
    {
        b.setImageDrawable(drawable);
    }

    public final void a(boolean flag)
    {
        ImageView imageview = a;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
    }

    public final void b(Drawable drawable)
    {
        ImageView imageview = a;
        if (drawable == null)
        {
            drawable = e;
        }
        imageview.setImageDrawable(drawable);
        d = 0;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        CharSequence charsequence = getContentDescription();
        if (!TextUtils.isEmpty(charsequence))
        {
            accessibilityevent.getText().add(charsequence);
        }
        return true;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (d != 0)
        {
            a(d);
        }
    }

    protected void onFinishInflate()
    {
        a = (ImageView)findViewById(f.G);
        b = (ImageView)findViewById(f.n);
        e = a.getDrawable();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1 = 0;
        int j1 = (l - j) / 2;
        j = i1;
        l = i;
        if (a.getVisibility() != 8)
        {
            android.widget.s s = (android.widget.s)a.getLayoutParams();
            l = a.getMeasuredHeight();
            j = a.getMeasuredWidth();
            i1 = j1 - l / 2;
            a.layout(0, i1, j, l + i1);
            l = s.leftMargin;
            j = s.rightMargin + (l + j);
            l = i + j;
        }
        android.widget.s s1 = (android.widget.s)b.getLayoutParams();
        i = b.getMeasuredHeight();
        i1 = b.getMeasuredWidth();
        k = (k - l) / 2;
        j += Math.max(s1.leftMargin, k - i1 / 2);
        k = Math.max(s1.topMargin, j1 - i / 2);
        b.layout(j, k, i1 + j, i + k);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        measureChildWithMargins(a, i, 0, j, 0);
        android.widget.s s = (android.widget.s)a.getLayoutParams();
        c = s.leftMargin + a.getMeasuredWidth() + s.rightMargin;
        int k1;
        int l1;
        if (a.getVisibility() == 8)
        {
            k = 0;
        } else
        {
            k = c;
        }
        l = s.topMargin;
        i1 = a.getMeasuredHeight();
        j1 = s.bottomMargin;
        measureChildWithMargins(b, i, k, j, 0);
        s = (android.widget.s)b.getLayoutParams();
        k += s.leftMargin + b.getMeasuredWidth() + s.rightMargin;
        k1 = s.topMargin;
        l1 = b.getMeasuredHeight();
        l = Math.max(l + i1 + j1, s.bottomMargin + (k1 + l1));
        l1 = android.view.e(i);
        k1 = android.view.e(j);
        j1 = android.view.e(i);
        i1 = android.view.e(j);
        i = j1;
        l1;
        JVM INSTR lookupswitch 2: default 220
    //                   -2147483648: 275
    //                   1073741824: 223;
           goto _L1 _L2 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        i = k;
_L4:
        j = i1;
        switch (k1)
        {
        default:
            j = l;
            break;

        case -2147483648: 
            break MISSING_BLOCK_LABEL_286;

        case 1073741824: 
            break;
        }
_L5:
        setMeasuredDimension(i, j);
        return;
_L2:
        i = Math.min(k, j1);
          goto _L4
        j = Math.min(l, i1);
          goto _L5
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }
}
