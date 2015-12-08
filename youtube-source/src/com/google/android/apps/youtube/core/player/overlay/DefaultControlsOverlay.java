// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.ui.TouchImageView;
import com.google.android.apps.youtube.core.utils.Typefaces;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.b;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.k;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            ControlsOverlay, av, at, ab, 
//            ControlsState, bb, aa, z, 
//            TimeBar, DefaultOverflowOverlay, x, p, 
//            ad, y, ac

public class DefaultControlsOverlay extends FrameLayout
    implements android.os.Handler.Callback, android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener, ControlsOverlay, av
{

    private final aa A = new aa(this, (byte)0);
    private final z B = new z(this, (byte)0);
    private Animation C;
    private Animation D;
    private int E;
    private int F;
    private Animation G;
    private Animation H;
    private Animation I;
    private Animation J;
    private Animation K;
    private Animation L;
    private ControlsState M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private ControlsOverlay.Style Z;
    private com.google.android.apps.youtube.core.player.overlay.p a;
    private final FrameLayout aa;
    private ad b;
    private y c;
    private ac d;
    private final TimeBar e;
    private final TouchImageView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final LinearLayout j;
    private final TouchImageView k;
    private final TouchImageView l;
    private final TouchImageView m;
    private final TextView n;
    private final TouchImageView o;
    private final TouchImageView p;
    private final TouchImageView q;
    private final TouchImageView r;
    private final TouchImageView s;
    private final bb t;
    private final RelativeLayout u;
    private final ProgressBar v;
    private final TextView w;
    private final DefaultOverflowOverlay x;
    private final at y = new at(new ab(this, (byte)0));
    private final Handler z = new Handler(this);

    public DefaultControlsOverlay(Context context)
    {
        super(context);
        C = AnimationUtils.loadAnimation(context, b.d);
        C.setAnimationListener(this);
        D = AnimationUtils.loadAnimation(context, b.c);
        I = AnimationUtils.loadAnimation(context, b.a);
        J = AnimationUtils.loadAnimation(context, b.b);
        K = AnimationUtils.loadAnimation(context, b.g);
        L = AnimationUtils.loadAnimation(context, b.h);
        E = getResources().getInteger(k.h);
        F = getResources().getInteger(k.i);
        D.setDuration(E);
        G = AnimationUtils.loadAnimation(context, b.c);
        H = AnimationUtils.loadAnimation(context, b.d);
        int i1 = context.getResources().getInteger(k.j);
        G.setDuration(i1);
        H.setDuration(i1);
        H.setAnimationListener(this);
        Z = ControlsOverlay.Style.YOUTUBE;
        M = ControlsState.NEW;
        t = new bb(context);
        setClipToPadding(false);
        LayoutInflater layoutinflater = LayoutInflater.from(context);
        layoutinflater.inflate(l.N, this);
        layoutinflater.inflate(l.O, this);
        u = (RelativeLayout)findViewById(j.aF);
        e = (TimeBar)findViewById(j.fC);
        e.setListener(A);
        f = (TouchImageView)findViewById(j.br);
        f.setOnClickListener(this);
        g = (TextView)findViewById(j.ci);
        g.setTypeface(Typefaces.ROBOTO_LIGHT.toTypeface(context));
        h = findViewById(j.G);
        i = findViewById(j.fI);
        j = (LinearLayout)findViewById(j.fD);
        v = (ProgressBar)findViewById(j.dz);
        w = (TextView)findViewById(j.dw);
        o = (TouchImageView)findViewById(j.du);
        o.setOnClickListener(this);
        q = (TouchImageView)findViewById(j.dv);
        q.setOnClickListener(this);
        p = (TouchImageView)findViewById(j.dt);
        p.setOnClickListener(this);
        l = (TouchImageView)findViewById(j.dr);
        l.setOnClickListener(this);
        m = (TouchImageView)findViewById(j.dB);
        m.setOnClickListener(this);
        n = (TextView)findViewById(j.dy);
        n.setOnClickListener(this);
        n.setTypeface(Typefaces.ROBOTO_LIGHT.toTypeface(context));
        r = (TouchImageView)findViewById(j.ds);
        r.setOnClickListener(this);
        s = (TouchImageView)findViewById(j.bL);
        s.setOnClickListener(this);
        k = (TouchImageView)findViewById(j.dA);
        k.setOnClickListener(this);
        x = (DefaultOverflowOverlay)findViewById(j.cZ);
        x.setListener(B);
        x.setStyle(Z);
        aa = (FrameLayout)findViewById(j.dq);
        f();
    }

    static com.google.android.apps.youtube.core.player.overlay.p a(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        return defaultcontrolsoverlay.a;
    }

    private void a(boolean flag)
    {
        Animation animation = C;
        long l1;
        if (flag)
        {
            l1 = E;
        } else
        {
            l1 = F;
        }
        animation.setDuration(l1);
        animation = L;
        if (flag)
        {
            l1 = E;
        } else
        {
            l1 = F;
        }
        animation.setDuration(l1);
        animation = J;
        if (flag)
        {
            l1 = E;
        } else
        {
            l1 = F;
        }
        animation.setDuration(l1);
        if (!Z.alwaysVisibleTimeBar)
        {
            b(e);
        }
        b(m);
        b(n);
        b(aa);
        b(k);
        b(i);
        b(h);
        b(f);
        b(g);
        b(l);
        b(r);
        b(s);
        b(o);
        b(p);
        b(q);
        b(x);
    }

    static TimeBar b(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        return defaultcontrolsoverlay.e;
    }

    private void b(View view)
    {
label0:
        {
            if (view.getVisibility() == 0)
            {
                if (view != h)
                {
                    break label0;
                }
                view.startAnimation(J);
            }
            return;
        }
        if (view == i)
        {
            view.startAnimation(L);
            return;
        } else
        {
            view.startAnimation(C);
            return;
        }
    }

    static ad c(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        return defaultcontrolsoverlay.b;
    }

    private void c(View view)
    {
label0:
        {
            if (view.getVisibility() == 0)
            {
                if (view != h)
                {
                    break label0;
                }
                view.startAnimation(I);
            }
            return;
        }
        if (view == i)
        {
            view.startAnimation(K);
            return;
        } else
        {
            view.startAnimation(D);
            return;
        }
    }

    static Animation d(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        return defaultcontrolsoverlay.G;
    }

    static RelativeLayout e(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        return defaultcontrolsoverlay.u;
    }

    static void f(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        defaultcontrolsoverlay.j();
    }

    static aa g(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        return defaultcontrolsoverlay.A;
    }

    static ControlsState h(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        return defaultcontrolsoverlay.M;
    }

    static DefaultOverflowOverlay i(DefaultControlsOverlay defaultcontrolsoverlay)
    {
        return defaultcontrolsoverlay.x;
    }

    private void j()
    {
        if ((M == ControlsState.PLAYING || M == ControlsState.LOADING) && !N && !z.hasMessages(1) && !V)
        {
            z.sendEmptyMessageDelayed(1, 2500L);
        }
    }

    private void k()
    {
label0:
        {
label1:
            {
                boolean flag2 = false;
                z.removeMessages(2);
                Object obj;
                boolean flag;
                if (M == ControlsState.PAUSED)
                {
                    o.setImageResource(h.at);
                    o.setContentDescription(getContext().getText(p.b));
                } else
                if (M == ControlsState.PLAYING)
                {
                    o.setImageResource(h.as);
                    o.setContentDescription(getContext().getText(p.a));
                } else
                {
                    o.setImageResource(h.au);
                    o.setContentDescription(getContext().getText(p.c));
                }
                ah.a(w, M.isError());
                obj = v;
                if (M == ControlsState.LOADING || M == ControlsState.NEW)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ah.a(((View) (obj)), flag);
                if (!N && !M.isError())
                {
                    break label0;
                }
                ah.a(k, false);
                ah.a(l, false);
                ah.a(m, false);
                ah.a(n, false);
                ah.a(r, false);
                ah.a(s, false);
                ah.a(aa, false);
                ah.a(i, false);
                obj = e;
                if (Z.alwaysVisibleTimeBar && M.isOnVideo())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ah.a(((View) (obj)), flag);
                ah.a(g, false);
                ah.a(h, false);
                ah.a(f, false);
                x.b();
                ah.a(o, false);
                ah.a(p, false);
                ah.a(q, false);
                if (!Z.alwaysVisibleTimeBar || !M.isOnVideo())
                {
                    flag = flag2;
                    if (M.isReady())
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            ah.a(this, flag);
            return;
        }
        ah.a(r, Q);
        ah.a(s, R);
        Object obj1 = k;
        int i1;
        boolean flag1;
        if (Z != ControlsOverlay.Style.AD && M.isOnVideo())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(((View) (obj1)), flag1);
        obj1 = l;
        if (Z != ControlsOverlay.Style.AD && M.isOnVideo())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(((View) (obj1)), flag1);
        obj1 = m;
        if (Z != ControlsOverlay.Style.AD && M.isOnVideo())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(((View) (obj1)), flag1);
        obj1 = n;
        if (W && Z == ControlsOverlay.Style.AD && M.isOnVideo())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(((View) (obj1)), flag1);
        obj1 = aa;
        if (!M.isError())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(((View) (obj1)), flag1);
        ah.a(i, true);
        ah.a(e, Z.supportsTimeBar);
        obj1 = f;
        if (Z != ControlsOverlay.Style.REMOTE && Q)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(((View) (obj1)), flag1);
        obj1 = g;
        if (Z == ControlsOverlay.Style.LIVE)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(((View) (obj1)), flag1);
        obj1 = h;
        if (M.isOnVideo() && !Z.alwaysVisibleTimeBar)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(((View) (obj1)), flag1);
        obj1 = o;
        if (M.isReady() && Z.supportsPlayHQCC)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        ((TouchImageView) (obj1)).setVisibility(i1);
        if (Z.supportsNextPrevious && (T || U) && M != ControlsState.NEW)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ah.a(p, flag1);
        ah.a(q, flag1);
        p.setEnabled(T);
        q.setEnabled(U);
        ah.a(u, true);
        ah.a(x, false);
        ah.a(this, true);
    }

    public final void a()
    {
        e();
        if (!Z.alwaysVisibleTimeBar)
        {
            c(e);
        }
        c(m);
        c(n);
        c(aa);
        c(k);
        c(i);
        c(h);
        c(f);
        c(g);
        c(l);
        c(r);
        c(s);
        c(o);
        c(p);
        c(q);
    }

    public final void a(View view)
    {
        aa.addView(view);
    }

    public final void a(List list)
    {
        t.a(list, new x(this));
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
        e.a();
    }

    public final void e()
    {
        if (S)
        {
            k();
            return;
        }
        i();
        N = false;
        k();
        if (a != null)
        {
            a.j();
        }
        j();
    }

    public final void f()
    {
        i();
        N = true;
        k();
        if (a != null)
        {
            a.k();
        }
    }

    public final void g()
    {
        t.a();
        x.d();
    }

    public final int h()
    {
        return e.b();
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            a(false);
            return true;
        }
        if (message.what == 2)
        {
            k();
            return true;
        } else
        {
            return false;
        }
    }

    protected final void i()
    {
        z.removeMessages(1);
        e.clearAnimation();
        f.clearAnimation();
        g.clearAnimation();
        i.clearAnimation();
        h.clearAnimation();
        m.clearAnimation();
        n.clearAnimation();
        aa.clearAnimation();
        l.clearAnimation();
        r.clearAnimation();
        s.clearAnimation();
        p.clearAnimation();
        q.clearAnimation();
        o.clearAnimation();
        k.clearAnimation();
    }

    public void onAnimationEnd(Animation animation)
    {
        if (animation == C)
        {
            f();
        } else
        if (animation == H)
        {
            u.setVisibility(4);
            N = true;
            return;
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    public void onClick(View view)
    {
        boolean flag1 = true;
        if (a != null)
        {
            if (view == p)
            {
                if (T && Z.supportsNextPrevious)
                {
                    a(true);
                    a.d();
                }
            } else
            if (view == q)
            {
                if (U && Z.supportsNextPrevious)
                {
                    a(true);
                    a.e();
                }
            } else
            if (view == o)
            {
                if (M == ControlsState.ENDED)
                {
                    a.m();
                } else
                if (M == ControlsState.PLAYING)
                {
                    a.b();
                } else
                if (M == ControlsState.PAUSED)
                {
                    a.a();
                }
            } else
            if (view == r)
            {
                d.H();
            } else
            if (view == s)
            {
                a.i();
            } else
            if (view == k)
            {
                x.a();
                u.startAnimation(H);
            } else
            if (view == f)
            {
                boolean flag = flag1;
                if (f.isSelected())
                {
                    if (P)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                O = flag;
                k();
                a.b(O);
            }
        }
        if (b != null)
        {
            if (view == l)
            {
                b.d();
            } else
            if (view == m)
            {
                b.b();
            }
        }
        if (c != null && view == n)
        {
            c.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        i();
        return super.onInterceptTouchEvent(motionevent);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        boolean flag;
        if (!keyevent.isSystem() || com.google.android.apps.youtube.core.player.overlay.at.b(i1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e();
        }
        if (M != ControlsState.RECOVERABLE_ERROR || !flag) goto _L2; else goto _L1
_L1:
        if (i1 == 20 || i1 == 21 || i1 == 22 || i1 == 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L3
_L3:
        a.l();
_L5:
        return true;
_L2:
        if (!y.a(i1, keyevent) && !super.onKeyDown(i1, keyevent))
        {
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        return y.a(i1) || super.onKeyUp(i1, keyevent);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        i1 = (int)((float)i1 * 0.1666667F);
        w.setPadding(i1, 10, i1, 10);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!super.onTouchEvent(motionevent))
        {
            if (S)
            {
                return false;
            }
            if (motionevent.getAction() == 1)
            {
                if (M == ControlsState.RECOVERABLE_ERROR && a != null)
                {
                    a.l();
                    return true;
                }
                if (N)
                {
                    a();
                    return true;
                }
                if (!V)
                {
                    a(true);
                    return true;
                }
            }
        }
        return true;
    }

    public void setAdActionsListener(y y1)
    {
        c = y1;
    }

    public void setAlwaysShowControls(boolean flag)
    {
        V = flag;
        k();
    }

    public void setAndShowEnded()
    {
        if (M == ControlsState.ENDED)
        {
            return;
        } else
        {
            M = ControlsState.ENDED;
            e.setBufferedPercent(0);
            e();
            return;
        }
    }

    public void setAndShowPaused()
    {
        if (M == ControlsState.PAUSED)
        {
            return;
        } else
        {
            M = ControlsState.PAUSED;
            e();
            return;
        }
    }

    public void setAudioOnlyEnabled(boolean flag)
    {
        x.setAudioOnlyEnabled(flag);
    }

    public void setCcEnabled(boolean flag)
    {
        x.setCC(flag);
    }

    public void setErrorAndShowMessage(int i1, boolean flag)
    {
        setErrorAndShowMessage(getContext().getString(i1), flag);
    }

    public void setErrorAndShowMessage(String s1, boolean flag)
    {
        Object obj;
        TextView textview;
        StringBuilder stringbuilder;
        boolean flag1;
        if (flag)
        {
            obj = ControlsState.RECOVERABLE_ERROR;
        } else
        {
            obj = ControlsState.UNRECOVERABLE_ERROR;
        }
        M = ((ControlsState) (obj));
        obj = getContext();
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        if (((Context) (obj)).getResources().getConfiguration().touchscreen != 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            obj = getContext().getString(p.fZ);
        } else
        {
            obj = getContext().getString(p.am);
        }
        textview = w;
        stringbuilder = (new StringBuilder()).append(s1);
        if (flag)
        {
            s1 = (new StringBuilder("\n\n")).append(((String) (obj))).toString();
        } else
        {
            s1 = "";
        }
        textview.setText(stringbuilder.append(s1).toString());
        e();
    }

    public void setFullscreen(boolean flag)
    {
        O = flag;
        f.setSelected(flag);
        if (M == ControlsState.PLAYING)
        {
            i();
            a(true);
        }
    }

    public void setHQ(boolean flag)
    {
        x.setHQ(flag);
    }

    public void setHQisHD(boolean flag)
    {
        x.setHQisHD(flag);
    }

    public void setHasAudioOnly(boolean flag)
    {
        x.setHasAudioOnly(flag);
    }

    public void setHasCc(boolean flag)
    {
        x.setHasCC(flag);
    }

    public void setHasInfoCard(boolean flag)
    {
        R = flag;
        k();
    }

    public void setHasNext(boolean flag)
    {
        T = flag;
        k();
    }

    public void setHasPrevious(boolean flag)
    {
        U = flag;
        k();
    }

    public void setInitial()
    {
        if (M == ControlsState.NEW)
        {
            return;
        } else
        {
            M = ControlsState.NEW;
            k();
            return;
        }
    }

    public void setLearnMoreEnabled(boolean flag)
    {
        W = flag;
        k();
    }

    public void setListener(com.google.android.apps.youtube.core.player.overlay.p p1)
    {
        a = p1;
    }

    public void setLoading()
    {
        if (M == ControlsState.LOADING)
        {
            return;
        } else
        {
            M = ControlsState.LOADING;
            k();
            j();
            return;
        }
    }

    public void setLockedInFullscreen(boolean flag)
    {
        P = flag;
        setFullscreen(O);
    }

    public void setMenuActionsListener(ad ad1)
    {
        b = ad1;
    }

    public void setMinimized(boolean flag)
    {
label0:
        {
            if (S != flag)
            {
                S = flag;
                if (!flag)
                {
                    break label0;
                }
                i();
                a(true);
            }
            return;
        }
        if (V)
        {
            e();
            return;
        }
        if (M.isReady())
        {
            a();
            return;
        } else
        {
            k();
            return;
        }
    }

    public void setPlaying()
    {
        if (M == ControlsState.PLAYING)
        {
            return;
        } else
        {
            M = ControlsState.PLAYING;
            k();
            j();
            return;
        }
    }

    public void setScrubbingEnabled(boolean flag)
    {
        e.setEnabled(flag);
    }

    public void setShowAudioOnly(boolean flag)
    {
        x.setShowAudioOnly(flag);
    }

    public void setShowFullscreen(boolean flag)
    {
        Q = flag;
        k();
    }

    public void setStyle(ControlsOverlay.Style style)
    {
        Z = style;
        e.setProgressColor(style.progressColor);
        e.setShowBuffered(style.supportsBuffered);
        e.setShowTimes(style.supportsShowTime);
        e.setShowScrubber(style.supportsScrubber);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)j.getLayoutParams();
        if (style == ControlsOverlay.Style.AD)
        {
            layoutparams.addRule(11);
        } else
        {
            layoutparams.addRule(11, 0);
            layoutparams.addRule(0, f.getId());
        }
        j.setLayoutParams(layoutparams);
        k();
        x.setStyle(style);
        j();
    }

    public void setSupportsQualityToggle(boolean flag)
    {
        x.setHasQuality(flag);
    }

    public void setTimes(int i1, int j1, int k1)
    {
        e.setTime(i1, j1, k1);
        y.a(i1, j1);
    }

    public void setUiListener(ac ac1)
    {
        d = ac1;
    }
}
