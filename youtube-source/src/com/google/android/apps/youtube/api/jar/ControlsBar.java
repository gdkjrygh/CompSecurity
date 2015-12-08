// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Region;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.youtube.api.b;
import com.google.android.youtube.api.f;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ControlsOptionsView, NormalTimeBar, r, af

public class ControlsBar extends ViewGroup
    implements android.view.View.OnClickListener
{

    private final int a;
    private final int b;
    private final int c;
    private final ControlsOptionsView d;
    private final View e;
    private final NormalTimeBar f;
    private final ImageButton g;
    private final ImageButton h;
    private p i;
    private TextView j;

    public ControlsBar(Context context, r r, af af)
    {
        super((Context)com.google.android.apps.youtube.common.fromguava.c.a(context, "context cannot be null"));
        com.google.android.apps.youtube.common.fromguava.c.a(r, "optionsViewListener cannot be null");
        Resources resources = getResources();
        float f1 = resources.getDisplayMetrics().density;
        a = (int)(50F * f1 + 0.5F);
        b = (int)(45F * f1 + 0.5F);
        c = (int)(f1 * 7F + 0.5F);
        d = new ControlsOptionsView(context, r);
        addView(d);
        e = new View(context);
        e.setBackgroundResource(b.u);
        addView(e);
        f = new NormalTimeBar(context, af);
        addView(f);
        j = new TextView(context);
        j.setBackgroundResource(b.o);
        j.setText("LIVE");
        j.setTextSize(16F);
        j.setTextColor(-1);
        j.setGravity(16);
        addView(j);
        r = new StateListDrawable();
        r.addState(View.PRESSED_ENABLED_STATE_SET, resources.getDrawable(b.q));
        r.addState(View.ENABLED_STATE_SET, resources.getDrawable(b.p));
        g = new ImageButton(context);
        g.setBackgroundDrawable(null);
        g.setImageDrawable(r);
        g.setPadding(c, c, c, c);
        g.setOnClickListener(this);
        g.setContentDescription(context.getText(f.l));
        addView(g);
        r = new StateListDrawable();
        r.addState(View.PRESSED_ENABLED_SELECTED_STATE_SET, resources.getDrawable(b.s));
        r.addState(View.ENABLED_SELECTED_STATE_SET, resources.getDrawable(b.r));
        r.addState(View.PRESSED_ENABLED_STATE_SET, resources.getDrawable(b.n));
        r.addState(View.ENABLED_STATE_SET, resources.getDrawable(b.m));
        h = new ImageButton(context);
        h.setBackgroundDrawable(null);
        h.setImageDrawable(r);
        g.setPadding(c, c, c, c);
        h.setOnClickListener(this);
        h.setContentDescription(context.getText(f.b));
        addView(h);
    }

    private int a(View view, int k)
    {
        int l = e.getHeight() - view.getMeasuredHeight();
        view.layout(k, e.getTop() + l / 2, view.getMeasuredWidth() + k, e.getBottom() - l / 2);
        return view.getWidth();
    }

    public final void a()
    {
        d.setVisibility(4);
    }

    public final int b()
    {
        return a;
    }

    public final int c()
    {
        return (a + b) - 2;
    }

    public boolean gatherTransparentRegion(Region region)
    {
        int ai[] = new int[2];
        getLocationInWindow(ai);
        region.op(ai[0], ai[1], (ai[0] + getRight()) - getLeft(), (ai[1] + getBottom()) - getTop(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    public void onClick(View view)
    {
        boolean flag1 = true;
        boolean flag;
        if (i != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "listener not set for ControlsOverlay");
        if (view == h)
        {
            if (!h.isSelected())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            setFullscreen(flag);
            i.b(view.isSelected());
        } else
        if (view == g)
        {
            d.a();
            return;
        }
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        k = i1 - k;
        l = j1 - l;
        e.layout(0, l - e.getMeasuredHeight(), k, l);
        l = e.getTop() + 2;
        d.layout(0, l - d.getMeasuredHeight(), k, l);
        k = c;
        if (f.getVisibility() != 8)
        {
            k += a(f, k);
        } else
        {
            a(j, k);
            k += f.getMeasuredWidth();
        }
        k += c;
        l = a(g, k);
        if (h.getVisibility() != 8)
        {
            a(h, k + l);
        }
    }

    protected void onMeasure(int k, int l)
    {
        k = getDefaultSize(0, k);
        setMeasuredDimension(k, resolveSize(c(), l));
        l = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
        d.measure(l, android.view.View.MeasureSpec.makeMeasureSpec(b, 0x40000000));
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(a, 0x40000000);
        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(a, 0x80000000);
        e.measure(l, j1);
        g.measure(i1, i1);
        l = k - c * 2 - g.getMeasuredWidth();
        k = l;
        if (h.getVisibility() != 8)
        {
            h.measure(i1, i1);
            k = l - h.getMeasuredWidth();
        }
        k = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
        f.measure(k, i1);
        j.measure(k, i1);
    }

    public void setCcEnabled(boolean flag)
    {
        d.setCcEnabled(flag);
    }

    public void setControlsListener(p p1)
    {
        i = p1;
        d.setControlsListener(p1);
    }

    public void setFullscreen(boolean flag)
    {
        h.setSelected(flag);
        ImageButton imagebutton = h;
        Context context = getContext();
        int k;
        if (flag)
        {
            k = f.c;
        } else
        {
            k = f.b;
        }
        imagebutton.setContentDescription(context.getText(k));
    }

    public void setHQ(boolean flag)
    {
        d.setHq(flag);
    }

    public void setHQisHD(boolean flag)
    {
        d.setHQisHD(flag);
    }

    public void setHasCc(boolean flag)
    {
        d.setHasCc(flag);
    }

    public void setScrubberTime(int k)
    {
        f.setScrubberTime(k);
    }

    public void setScrubbing(boolean flag)
    {
        f.setScrubbing(flag);
    }

    public void setScrubbingEnabled(boolean flag)
    {
        f.setEnabled(flag);
    }

    public void setShowFullscreenButton(boolean flag)
    {
        ImageButton imagebutton = h;
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        imagebutton.setVisibility(k);
    }

    public void setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style style)
    {
        if (style == com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.LIVE)
        {
            f.setVisibility(8);
            j.setVisibility(0);
            return;
        } else
        {
            f.setStyle(style);
            f.setVisibility(0);
            j.setVisibility(8);
            return;
        }
    }

    public void setSupportsQualityToggle(boolean flag)
    {
        d.setSupportsQualityToggle(flag);
    }

    public void setTimes(int k, int l, int i1)
    {
        f.setTimes(k, l, i1);
    }

    public void setVideoTitle(String s)
    {
        d.setVideoTitle(s);
    }
}
