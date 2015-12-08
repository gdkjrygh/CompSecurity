// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.youtube.api.b;
import com.google.android.youtube.api.f;
import com.google.android.youtube.player.e;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            r

public final class ControlsOptionsView extends ViewGroup
    implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener
{

    private final float a;
    private final ImageButton b;
    private final ImageButton c;
    private final ImageButton d;
    private final TextView e;
    private final StateListDrawable f = new StateListDrawable();
    private final StateListDrawable g = new StateListDrawable();
    private final AnimationSet h = new AnimationSet(true);
    private final AnimationSet i = new AnimationSet(true);
    private final r j;
    private p k;

    public ControlsOptionsView(Context context, r r1)
    {
        super((Context)com.google.android.apps.youtube.common.fromguava.c.a(context));
        j = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1, "optionsViewListener cannot be null");
        r1 = getResources();
        a = r1.getDisplayMetrics().density;
        int l = (int)(10F * a);
        b = new ImageButton(context);
        c = new ImageButton(context);
        d = new ImageButton(context);
        e = new TextView(context);
        f.addState(View.SELECTED_STATE_SET, r1.getDrawable(b.f));
        f.addState(View.EMPTY_STATE_SET, r1.getDrawable(b.e));
        g.addState(View.SELECTED_STATE_SET, r1.getDrawable(b.d));
        g.addState(View.EMPTY_STATE_SET, r1.getDrawable(b.c));
        b.setImageDrawable(f);
        b.setBackgroundDrawable(null);
        b.setPadding(l, l, 0, l);
        b.setContentDescription(context.getText(f.d));
        b.setOnClickListener(this);
        b.setVisibility(8);
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(View.SELECTED_STATE_SET, r1.getDrawable(b.b));
        statelistdrawable.addState(View.EMPTY_STATE_SET, r1.getDrawable(b.a));
        c.setImageDrawable(statelistdrawable);
        c.setBackgroundDrawable(null);
        c.setPadding(l, l, 0, l);
        c.setContentDescription(context.getText(f.a));
        c.setOnClickListener(this);
        c.setVisibility(8);
        d.setImageResource(b.t);
        d.setBackgroundDrawable(null);
        d.setPadding(l, l, l, l);
        if (com.google.android.youtube.player.e.a(context))
        {
            d.setContentDescription(context.getText(f.i));
            d.setOnClickListener(this);
        }
        e.setSingleLine();
        e.setTextSize(1, 18F);
        e.setEllipsize(android.text.TextUtils.TruncateAt.END);
        e.setTextColor(-1);
        e.setGravity(17);
        e.setPadding(l * 2, l, l, l);
        h.setInterpolator(new DecelerateInterpolator());
        h.setDuration(200L);
        h.addAnimation(new AlphaAnimation(0.0F, 1.0F));
        h.addAnimation(new TranslateAnimation(1, 0.4F, 1, 0.0F, 1, 0.0F, 1, 0.0F));
        h.setAnimationListener(this);
        i.setInterpolator(new AccelerateInterpolator());
        i.setDuration(200L);
        i.addAnimation(new AlphaAnimation(1.0F, 0.0F));
        i.addAnimation(new TranslateAnimation(1, 0.0F, 1, 0.4F, 1, 0.0F, 1, 0.0F));
        i.setAnimationListener(this);
        addView(b);
        addView(c);
        addView(e);
        addView(d);
        setBackgroundResource(b.w);
        super.setVisibility(4);
    }

    private static int a(View view, int l, int i1)
    {
        i1 = (i1 - view.getMeasuredHeight()) / 2;
        view.layout(l, i1, view.getMeasuredWidth() + l, view.getMeasuredHeight() + i1);
        return view.getMeasuredWidth();
    }

    public final void a()
    {
        if (getVisibility() == 0)
        {
            h.cancel();
            i.reset();
            startAnimation(i);
            return;
        } else
        {
            i.cancel();
            h.reset();
            startAnimation(h);
            setVisibility(0);
            return;
        }
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (animation == i)
        {
            setVisibility(4);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    public final void onClick(View view)
    {
        if (view == b)
        {
            k.f();
            j.b();
        } else
        {
            if (view == c)
            {
                k.g();
                j.b();
                return;
            }
            if (view == d)
            {
                j.a();
                return;
            }
        }
    }

    protected final void onLayout(boolean flag, int l, int i1, int j1, int k1)
    {
        boolean flag1 = false;
        int l1 = k1 - i1;
        i1 = ((flag1) ? 1 : 0);
        if (b.getVisibility() != 8)
        {
            i1 = a(b, 0, l1) + 0;
        }
        k1 = i1;
        if (c.getVisibility() != 8)
        {
            k1 = i1 + a(c, i1, l1);
        }
        if (e.getVisibility() != 8)
        {
            a(e, k1, l1);
        }
        a(d, j1 - l - d.getMeasuredWidth(), l1);
    }

    protected final void onMeasure(int l, int i1)
    {
        l = getDefaultSize(0, l);
        i1 = getDefaultSize(0, i1);
        setMeasuredDimension(l, i1);
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
        d.measure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000), j1);
        i1 = l - d.getMeasuredWidth();
        l = i1;
        if (b.getVisibility() != 8)
        {
            b.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), j1);
            l = i1 - b.getMeasuredWidth();
        }
        i1 = l;
        if (c.getVisibility() != 8)
        {
            c.measure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000), j1);
            i1 = l - c.getMeasuredWidth();
        }
        if (e.getVisibility() != 8)
        {
            e.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000), j1);
        }
    }

    public final void setCcEnabled(boolean flag)
    {
        c.setSelected(flag);
    }

    public final void setControlsListener(p p1)
    {
        k = (p)com.google.android.apps.youtube.common.fromguava.c.a(p1);
    }

    public final void setHQisHD(boolean flag)
    {
        ImageButton imagebutton = b;
        StateListDrawable statelistdrawable;
        if (flag)
        {
            statelistdrawable = g;
        } else
        {
            statelistdrawable = f;
        }
        imagebutton.setImageDrawable(statelistdrawable);
    }

    public final void setHasCc(boolean flag)
    {
        ImageButton imagebutton = c;
        int l;
        if (flag)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        imagebutton.setVisibility(l);
    }

    public final void setHq(boolean flag)
    {
        b.setSelected(flag);
        int l;
        if (flag)
        {
            l = f.e;
        } else
        {
            l = f.d;
        }
        b.setContentDescription(getContext().getText(l));
    }

    public final void setSmallMode(boolean flag)
    {
        TextView textview = e;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    public final void setSupportsQualityToggle(boolean flag)
    {
        ImageButton imagebutton = b;
        int l;
        if (flag)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        imagebutton.setVisibility(l);
    }

    public final void setVideoTitle(String s)
    {
        e.setText(s);
    }

    public final void setVisibility(int l)
    {
        super.setVisibility(l);
        r r1 = j;
        boolean flag;
        if (l == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r1.a(flag);
    }
}
