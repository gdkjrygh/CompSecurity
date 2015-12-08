// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            r, iu, ClingView, it

public class WatchMinimizedTutorialView extends RelativeLayout
    implements android.view.View.OnClickListener, r
{

    private ClingView a;
    private View b;
    private TextView c;
    private iu d;
    private View e;
    private ImageView f;
    private ImageView g;
    private Rect h;

    public WatchMinimizedTutorialView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new Rect();
    }

    static void a(WatchMinimizedTutorialView watchminimizedtutorialview, int i)
    {
        watchminimizedtutorialview.View.setVisibility(i);
    }

    private void a(boolean flag)
    {
        setVisibility(8);
        if (flag)
        {
            d.a();
            return;
        } else
        {
            d.b();
            return;
        }
    }

    public final void a(Rect rect)
    {
        h = rect;
        requestLayout();
    }

    public void onClick(View view)
    {
        if (view == b)
        {
            a(true);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = findViewById(j.cV);
        b.setOnClickListener(this);
        a = (ClingView)findViewById(j.av);
        a.setHighlightBoundsListener(this);
        c = (TextView)findViewById(j.fw);
        e = findViewById(j.fF);
        f = (ImageView)findViewById(j.aZ);
        g = (ImageView)findViewById(j.aN);
    }

    protected void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        super.onLayout(flag, i, k, l, i1);
        i = h.left + (h.width() - f.getWidth()) / 2;
        k = h.top - f.getHeight();
        f.layout(i, k, f.getWidth() + i, f.getHeight() + k);
        i = h.left - g.getWidth();
        k = h.top + (h.height() - g.getHeight()) / 2;
        g.layout(i, k, g.getWidth() + i, g.getHeight() + k);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a.a().contains((int)motionevent.getX(), (int)motionevent.getY()))
        {
            if (motionevent.getAction() == 0)
            {
                a(false);
            }
            return false;
        } else
        {
            return true;
        }
    }

    public void setDismissListener(iu iu1)
    {
        d = iu1;
    }

    public void setTargetView(View view, View view1)
    {
        a.setViewToCling(view, view1);
        postInvalidate();
    }

    public void setText(CharSequence charsequence)
    {
        c.setText(charsequence);
    }

    public void setVisibility(int i)
    {
        float f2 = 1.0F;
        if (i == getVisibility())
        {
            return;
        }
        float f1;
        AlphaAnimation alphaanimation;
        boolean flag;
        long l;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        if (!flag)
        {
            f2 = 0.0F;
        }
        alphaanimation = new AlphaAnimation(f1, f2);
        if (flag)
        {
            l = 1000L;
        } else
        {
            l = 500L;
        }
        alphaanimation.setDuration(l);
        alphaanimation.setAnimationListener(new it(this, i));
        if (flag)
        {
            super.setVisibility(0);
        }
        startAnimation(alphaanimation);
    }
}
