// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.core.ui.TouchImageView;
import com.google.android.youtube.b;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.k;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            af

public final class DefaultOverflowOverlay extends FrameLayout
    implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener
{

    private LinearLayout a;
    private TouchImageView b;
    private TouchImageView c;
    private TouchImageView d;
    private TouchImageView e;
    private Animation f;
    private Animation g;
    private Animation h;
    private Animation i;
    private ControlsOverlay.Style j;
    private boolean k;
    private boolean l;
    private boolean m;
    private af n;

    public DefaultOverflowOverlay(Context context)
    {
        this(context, null);
    }

    public DefaultOverflowOverlay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = AnimationUtils.loadAnimation(context, b.c);
        g = AnimationUtils.loadAnimation(context, b.d);
        g.setAnimationListener(this);
        int i1 = context.getResources().getInteger(k.j);
        f.setDuration(i1);
        g.setDuration(i1);
        h = AnimationUtils.loadAnimation(context, b.k);
        i = AnimationUtils.loadAnimation(context, b.l);
    }

    private void e()
    {
        boolean flag1 = true;
        TouchImageView touchimageview = c;
        boolean flag;
        if (k && j.supportsPlayHQCC)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        touchimageview.setEnabled(flag);
        touchimageview = b;
        if (l && j.supportsPlayHQCC)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        touchimageview.setEnabled(flag);
        e.setEnabled(m);
    }

    public final void a()
    {
        clearAnimation();
        setVisibility(0);
        a.startAnimation(h);
        startAnimation(f);
    }

    public final void b()
    {
        clearAnimation();
        setVisibility(8);
        g.setStartTime(0L);
    }

    public final void c()
    {
        if (c.isEnabled())
        {
            n.b();
        }
    }

    public final void d()
    {
        k = false;
        l = false;
        m = false;
        e();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (animation == g)
        {
            b();
            g.setStartTime(0L);
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
        if (view != b) goto _L2; else goto _L1
_L1:
        n.a();
_L4:
        if (!g.hasStarted())
        {
            a.startAnimation(i);
            startAnimation(g);
            n.e();
        }
        return;
_L2:
        if (view == c)
        {
            n.b();
        } else
        if (view == d)
        {
            n.c();
        } else
        if (view == e)
        {
            n.d();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        a = (LinearLayout)findViewById(j.cY);
        b = (TouchImageView)findViewById(j.bA);
        b.setOnClickListener(this);
        c = (TouchImageView)findViewById(j.af);
        c.setOnClickListener(this);
        d = (TouchImageView)findViewById(j.bp);
        d.setOnClickListener(this);
        e = (TouchImageView)findViewById(j.q);
        e.setOnClickListener(this);
        setShowAudioOnly(false);
        setOnClickListener(this);
    }

    public final void setAudioOnlyEnabled(boolean flag)
    {
        e.setSelected(flag);
    }

    public final void setCC(boolean flag)
    {
        c.setSelected(flag);
    }

    public final void setHQ(boolean flag)
    {
        b.setSelected(flag);
    }

    public final void setHQisHD(boolean flag)
    {
        TouchImageView touchimageview = b;
        int i1;
        if (flag)
        {
            i1 = h.aq;
        } else
        {
            i1 = h.ar;
        }
        touchimageview.setImageResource(i1);
    }

    public final void setHasAudioOnly(boolean flag)
    {
        m = flag;
        e();
    }

    public final void setHasCC(boolean flag)
    {
        k = flag;
        e();
    }

    public final void setHasQuality(boolean flag)
    {
        l = flag;
        e();
    }

    public final void setListener(af af1)
    {
        n = af1;
    }

    public final void setShowAudioOnly(boolean flag)
    {
        TouchImageView touchimageview = e;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        touchimageview.setVisibility(i1);
    }

    public final void setStyle(ControlsOverlay.Style style)
    {
        j = style;
    }
}
