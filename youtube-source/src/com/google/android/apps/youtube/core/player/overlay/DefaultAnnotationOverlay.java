// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.b;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            g, h

public class DefaultAnnotationOverlay extends FrameLayout
    implements android.view.View.OnTouchListener, android.view.animation.Animation.AnimationListener, com.google.android.apps.youtube.core.player.overlay.g
{

    private final Animation A;
    private final Animation B;
    private final Animation C;
    private final Animation D;
    private final Animation E;
    private final Animation F;
    protected final TextView a;
    protected final TextView b;
    protected final TextView c;
    protected final TextView d;
    private h e;
    private final ImageView f;
    private final View g;
    private final ImageView h;
    private final ImageButton i;
    private final View j;
    private final ImageView k;
    private final View l;
    private final View m;
    private final ImageView n;
    private final ImageButton o;
    private final View p;
    private final View q;
    private final TextView r;
    private final ImageView s;
    private boolean t;
    private final int u;
    private boolean v;
    private final Animation w;
    private final Animation x;
    private final Animation y;
    private final Animation z;

    public DefaultAnnotationOverlay(Context context)
    {
        super(context);
        Resources resources = context.getResources();
        w = AnimationUtils.loadAnimation(context, b.c);
        x = AnimationUtils.loadAnimation(context, b.d);
        y = AnimationUtils.loadAnimation(context, b.a);
        z = AnimationUtils.loadAnimation(context, b.b);
        A = AnimationUtils.loadAnimation(context, b.e);
        B = AnimationUtils.loadAnimation(context, b.f);
        C = AnimationUtils.loadAnimation(context, b.e);
        D = AnimationUtils.loadAnimation(context, b.f);
        E = AnimationUtils.loadAnimation(context, b.e);
        F = AnimationUtils.loadAnimation(context, b.f);
        int i1 = resources.getInteger(k.h);
        w.setDuration(i1);
        x.setDuration(i1);
        x.setAnimationListener(this);
        z.setAnimationListener(this);
        B.setAnimationListener(this);
        D.setAnimationListener(this);
        A.setAnimationListener(this);
        F.setAnimationListener(this);
        LayoutInflater.from(context).inflate(l.e, this);
        f = (ImageView)findViewById(j.bg);
        g = findViewById(j.bh);
        h = (ImageView)g.findViewById(j.bk);
        a = (TextView)g.findViewById(j.bi);
        b = (TextView)g.findViewById(j.bl);
        i = (ImageButton)g.findViewById(j.bj);
        g.setOnTouchListener(this);
        i.setOnTouchListener(this);
        j = findViewById(j.L);
        k = (ImageView)j.findViewById(j.R);
        l = j.findViewById(j.O);
        j.setOnTouchListener(this);
        m = findViewById(j.P);
        n = (ImageView)m.findViewById(j.R);
        c = (TextView)m.findViewById(j.S);
        d = (TextView)m.findViewById(j.M);
        o = (ImageButton)m.findViewById(j.N);
        m.setOnTouchListener(this);
        o.setOnTouchListener(this);
        p = findViewById(j.bM);
        q = findViewById(j.bN);
        r = (TextView)q.findViewById(j.bP);
        s = (ImageView)q.findViewById(j.bO);
        p.setOnTouchListener(this);
        u = resources.getDimensionPixelSize(g.d) + resources.getDimensionPixelSize(g.c) + resources.getDimensionPixelSize(g.a) * 2 + resources.getDimensionPixelSize(g.b);
        a();
    }

    private static void a(Animation animation, Animation animation1, View view)
    {
        if (animation == animation1)
        {
            view.setVisibility(8);
        }
    }

    private void k()
    {
        byte byte0 = 8;
        Object obj = (android.widget.FrameLayout.LayoutParams)m.getLayoutParams();
        int i1;
        if (t)
        {
            i1 = u;
        } else
        {
            i1 = 0;
        }
        ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(0, 0, 0, i1);
        obj = (android.widget.FrameLayout.LayoutParams)g.getLayoutParams();
        if (t)
        {
            i1 = u;
        } else
        {
            i1 = 0;
        }
        ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(0, 0, 0, i1);
        obj = i;
        if (t)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((ImageButton) (obj)).setVisibility(i1);
        obj = o;
        if (t)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        ((ImageButton) (obj)).setVisibility(i1);
    }

    private boolean l()
    {
        boolean flag1 = true;
        boolean flag = false;
        int i1;
        if (f.getVisibility() == 0 || g.getVisibility() == 0 || m.getVisibility() == 0 || j.getVisibility() == 0 || p.getVisibility() == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0 || v)
        {
            flag1 = false;
        }
        if (flag1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        setVisibility(i1);
        return flag1;
    }

    public final void a()
    {
        t = false;
        v = false;
        setVisibility(8);
        f.setVisibility(8);
        f.setImageBitmap(null);
        g.setVisibility(8);
        b.setText(null);
        h.setImageBitmap(null);
        h.setVisibility(8);
        j.setVisibility(8);
        l.setVisibility(0);
        k.setImageBitmap(null);
        k.setVisibility(8);
        m.setVisibility(8);
        c.setText(null);
        d.setText(null);
        n.setImageBitmap(null);
        n.setVisibility(8);
        p.setVisibility(8);
        q.setVisibility(8);
        k();
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            l.setVisibility(8);
            m.setVisibility(0);
            m.startAnimation(A);
        } else
        if (m.getVisibility() == 0)
        {
            l.setVisibility(8);
            j.setVisibility(0);
            m.startAnimation(B);
        } else
        {
            l.setVisibility(0);
            j.setVisibility(0);
            j.startAnimation(C);
        }
        l();
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
        f.setVisibility(0);
        l();
    }

    public final void e()
    {
        f.setVisibility(8);
    }

    public final void f()
    {
        g.setVisibility(0);
        g.startAnimation(y);
        l();
    }

    public final void g()
    {
        g.startAnimation(z);
    }

    public final void h()
    {
        if (m.getVisibility() == 0)
        {
            m.startAnimation(B);
        }
        if (j.getVisibility() == 0)
        {
            j.startAnimation(D);
        }
    }

    public final void i()
    {
        p.setVisibility(0);
        q.setVisibility(0);
        q.startAnimation(E);
        l();
    }

    public final void j()
    {
        if (q.getVisibility() == 0)
        {
            q.startAnimation(F);
        }
    }

    public void onAnimationEnd(Animation animation)
    {
        a(animation, x, this);
        a(animation, z, g);
        a(animation, D, j);
        a(animation, B, m);
        a(animation, F, p);
        a(animation, A, j);
        if (animation == B)
        {
            l.setVisibility(0);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (e != null && motionevent.getAction() == 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (view == g)
        {
            e.c();
        } else
        if (view == i)
        {
            e.d();
        } else
        if (view == m)
        {
            e.a(true);
        } else
        if (view == j)
        {
            e.a(false);
        } else
        {
            if (view != o)
            {
                continue; /* Loop/switch isn't completed */
            }
            e.b();
        }
_L4:
        return true;
        if (view != p) goto _L1; else goto _L3
_L3:
        e.e();
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setAdStyle(boolean flag)
    {
        t = flag;
        k();
    }

    public void setCallToActionImage(Bitmap bitmap)
    {
        byte byte1 = 8;
        n.setImageBitmap(bitmap);
        ImageView imageview = n;
        byte byte0;
        if (bitmap == null)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
        k.setImageBitmap(bitmap);
        imageview = k;
        if (bitmap == null)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    public void setCallToActionText(String s1, String s2)
    {
        c.setText(s1);
        d.setText(s2);
    }

    public void setFeaturedChannelImage(Bitmap bitmap)
    {
        f.setImageBitmap(bitmap);
    }

    public void setFeaturedVideoImage(Bitmap bitmap)
    {
        h.setImageBitmap(bitmap);
        h.setVisibility(0);
    }

    public void setFeaturedVideoTitle(String s1)
    {
        b.setText(s1);
    }

    public void setInfoCardTeaserImage(Bitmap bitmap)
    {
        s.setImageBitmap(bitmap);
        ImageView imageview = s;
        byte byte0;
        if (bitmap == null)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    public void setInfoCardTeaserMessage(CharSequence charsequence)
    {
        r.setText(charsequence);
    }

    public void setListener(h h1)
    {
        e = h1;
    }

    public void setVisible(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v = flag;
        if (v)
        {
            startAnimation(x);
        } else
        if (l())
        {
            startAnimation(w);
            return;
        }
    }
}
