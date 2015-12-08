// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            a, av, u, v, 
//            w, b

public final class DefaultAdOverlay extends FrameLayout
    implements a, av
{

    private final TextView a;
    private final View b;
    private final TextView c;
    private final ImageView d;
    private final TextView e;
    private b f;
    private final Analytics g;
    private boolean h;
    private String i;
    private String j;
    private int k;
    private int l;
    private int m;
    private State n;
    private final ImageView o;
    private final DisplayMetrics p = getResources().getDisplayMetrics();
    private final View q;

    public DefaultAdOverlay(Context context, Analytics analytics, int i1)
    {
        super(context);
        g = analytics;
        LayoutInflater.from(context).inflate(l.M, this);
        a = (TextView)findViewById(j.l);
        q = findViewById(j.m);
        b = findViewById(j.eL);
        c = (TextView)b.findViewById(j.eN);
        o = (ImageView)b.findViewById(j.eM);
        d = (ImageView)q.findViewById(j.fy);
        e = (TextView)q.findViewById(j.fF);
        context = (android.widget.RelativeLayout.LayoutParams)b.getLayoutParams();
        context.bottomMargin = ((android.widget.RelativeLayout.LayoutParams) (context)).bottomMargin + i1;
        context = new u(this);
        b.setOnClickListener(context);
        b.setOnTouchListener(new v(this));
        context = new w(this, analytics);
        e.setOnClickListener(context);
        d.setOnClickListener(context);
        d();
    }

    private void a()
    {
        int i1;
        if (h)
        {
            i1 = p.g;
        } else
        {
            i1 = p.h;
        }
        if (TextUtils.isEmpty(j))
        {
            a.setText(getResources().getString(i1, new Object[] {
                "", ""
            }));
            return;
        } else
        {
            a.setText(getResources().getString(i1, new Object[] {
                " \267 ", j
            }));
            return;
        }
    }

    static void a(DefaultAdOverlay defaultadoverlay)
    {
        if (defaultadoverlay.n == State.SKIPPABLE)
        {
            defaultadoverlay.g.a("SkipAd", "Overlay");
            defaultadoverlay.f.a(defaultadoverlay.l, defaultadoverlay.m);
        }
    }

    static void a(DefaultAdOverlay defaultadoverlay, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            defaultadoverlay.l = (int)motionevent.getRawX();
            defaultadoverlay.m = (int)motionevent.getRawY();
        }
    }

    static b b(DefaultAdOverlay defaultadoverlay)
    {
        return defaultadoverlay.f;
    }

    private void e()
    {
        byte byte1 = 8;
        Object obj = q;
        byte byte0;
        if (h)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((View) (obj)).setVisibility(byte0);
        obj = e;
        if (getWidth() < (int)TypedValue.applyDimension(1, 500F, p))
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
    }

    private void f()
    {
        if (h || n == State.NOT_SKIPPABLE)
        {
            b.setVisibility(8);
            return;
        }
        if (n == State.WAITING_TO_SKIP)
        {
            if (k <= 0)
            {
                n = State.SKIPPABLE;
                c.setText(getResources().getString(p.fD));
                if (!h)
                {
                    o.setVisibility(0);
                }
                if (f != null)
                {
                    f.c();
                }
            } else
            {
                c.setText(getResources().getString(p.fE, new Object[] {
                    Integer.valueOf(k)
                }));
                o.setVisibility(8);
            }
        }
        b.setVisibility(0);
    }

    public final void a(int i1, int j1)
    {
        j = com.google.android.apps.youtube.common.e.m.a((j1 - i1) / 1000, 3);
        k = 5 - i1 / 1000;
        f();
        a();
    }

    public final void a(String s, boolean flag, boolean flag1, String s1)
    {
        i = s;
        e.setText(s);
        j = null;
        l = -1;
        m = -1;
        if (flag)
        {
            k = 5;
            o.setVisibility(8);
            n = State.WAITING_TO_SKIP;
        } else
        {
            n = State.NOT_SKIPPABLE;
        }
        a();
        f();
        setVisibility(0);
    }

    public final View b()
    {
        return this;
    }

    public final PlayerOverlaysLayout.LayoutParams c()
    {
        return new PlayerOverlaysLayout.LayoutParams(-1, -1, true);
    }

    public final void d()
    {
        setVisibility(8);
        d.setImageDrawable(null);
        e.setText(null);
        o.setVisibility(8);
    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        e();
    }

    public final void setAdTitle(String s)
    {
        i = s;
        e.setText(s);
    }

    public final void setChannel(Bitmap bitmap)
    {
        d.setImageBitmap(bitmap);
    }

    public final void setFullscreen(boolean flag)
    {
    }

    public final void setListener(b b1)
    {
        f = b1;
    }

    public final void setMinimized(boolean flag)
    {
        h = flag;
        f();
        a();
        e();
    }

    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State NOT_SKIPPABLE;
        public static final State SKIPPABLE;
        public static final State WAITING_TO_SKIP;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/DefaultAdOverlay$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            NOT_SKIPPABLE = new State("NOT_SKIPPABLE", 0);
            WAITING_TO_SKIP = new State("WAITING_TO_SKIP", 1);
            SKIPPABLE = new State("SKIPPABLE", 2);
            $VALUES = (new State[] {
                NOT_SKIPPABLE, WAITING_TO_SKIP, SKIPPABLE
            });
        }

        private State(String s, int i1)
        {
            super(s, i1);
        }
    }

}
