// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.g;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            r, gz, ClingView, gy

public class TutorialView extends RelativeLayout
    implements android.view.View.OnClickListener, r
{

    private ClingView a;
    private View b;
    private TextView c;
    private LinearLayout d;
    private gz e;
    private int f;

    public TutorialView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = 7;
    }

    private void a()
    {
        setVisibility(8);
        e.a();
    }

    static void a(TutorialView tutorialview, int i)
    {
        tutorialview.View.setVisibility(i);
    }

    public final void a(Rect rect)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)d.getLayoutParams();
        if (f != 7) goto _L2; else goto _L1
_L1:
        d.setMinimumHeight(rect.height());
        layoutparams.topMargin = rect.top;
        layoutparams.leftMargin = rect.right;
        layoutparams.bottomMargin = ((View)d.getParent()).getHeight() - rect.bottom;
_L4:
        d.setLayoutParams(layoutparams);
        c.setVisibility(0);
        return;
_L2:
        if (f == 8)
        {
            layoutparams.topMargin = rect.bottom;
            int i = getResources().getDimensionPixelSize(g.af);
            layoutparams.rightMargin = i;
            layoutparams.leftMargin = i;
            layoutparams.addRule(12, 0);
            rect = (android.widget.LinearLayout.LayoutParams)c.getLayoutParams();
            rect.gravity = 49;
            c.setLayoutParams(rect);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        if (view == b)
        {
            a();
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
        d = (LinearLayout)findViewById(j.fx);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a.a().contains((int)motionevent.getX(), (int)motionevent.getY()))
        {
            if (motionevent.getAction() == 0)
            {
                a();
            }
            return false;
        } else
        {
            return true;
        }
    }

    public void setAlignTextToCling(int i)
    {
        boolean flag;
        if (i == 8 || i == 7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "Only  RelativeLayout.ALIGN_BOTTOM or RelativeLayout.ALIGN_RIGHT are supported at the moment");
        f = i;
    }

    public void setDismissListener(gz gz1)
    {
        e = gz1;
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
        alphaanimation.setAnimationListener(new gy(this, i));
        if (flag)
        {
            super.setVisibility(0);
        }
        startAnimation(alphaanimation);
    }
}
