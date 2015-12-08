// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.ControlsState;
import com.google.android.apps.youtube.core.player.overlay.at;
import com.google.android.apps.youtube.core.player.overlay.bb;
import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.youtube.api.b;
import com.google.android.youtube.api.f;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            b, aa, ControlsBar, f, 
//            g, MinimalTimeBar, e, d, 
//            ai, c

public final class ApiMobileControlsOverlay extends ViewGroup
    implements android.os.Handler.Callback, android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener, com.google.android.apps.youtube.api.jar.b
{

    private ai a;
    private com.google.android.apps.youtube.api.jar.c b;
    private final aa c;
    private final ControlsBar d;
    private final MinimalTimeBar e;
    private final ProgressBar f;
    private final ImageButton g;
    private final ImageButton h;
    private final ImageButton i;
    private final ImageView j;
    private final TextView k;
    private final at l = new at(new e(this, (byte)0));
    private final Handler m = new Handler(this);
    private final Animation n = new AlphaAnimation(1.0F, 0.0F);
    private final bb o;
    private com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style p;
    private ControlsState q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ApiMobileControlsOverlay(Context context, aa aa1)
    {
        super(context);
        c = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        d = new ControlsBar(context, new com.google.android.apps.youtube.api.jar.f(this, (byte)0), new g(this, (byte)0));
        e = new MinimalTimeBar(context);
        addView(d);
        addView(e);
        q = ControlsState.NEW;
        f = new ProgressBar(context);
        f.setIndeterminate(true);
        addView(f);
        g = new ImageButton(context);
        g.setBackgroundResource(b.i);
        g.setOnClickListener(this);
        g.setContentDescription(context.getText(f.h));
        addView(g);
        j = new ImageView(context);
        j.setBackgroundResource(b.l);
        addView(j);
        k = new TextView(context);
        k.setGravity(17);
        k.setBackgroundResource(b.u);
        k.setTextColor(-1);
        k.setMinimumHeight(d.b());
        addView(k, -1, -2);
        h = new ImageButton(context);
        h.setBackgroundResource(b.g);
        h.setOnClickListener(this);
        h.setContentDescription(context.getText(f.f));
        addView(h);
        i = new ImageButton(context);
        i.setBackgroundResource(b.j);
        i.setOnClickListener(this);
        i.setContentDescription(context.getText(f.j));
        addView(i);
        n.setAnimationListener(this);
        n.setInterpolator(new LinearInterpolator());
        o = new bb(context);
        setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.YOUTUBE);
        f();
    }

    static ai a(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        return apimobilecontrolsoverlay.a;
    }

    private void a(View view)
    {
        if (view.getVisibility() == 0)
        {
            view.startAnimation(n);
        }
    }

    private static void a(View view, int i1, int j1)
    {
        i1 -= view.getMeasuredWidth() / 2;
        j1 -= view.getMeasuredHeight() / 2;
        view.layout(i1, j1, view.getMeasuredWidth() + i1, view.getMeasuredHeight() + j1);
    }

    private static void a(View view, boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    private void a(boolean flag)
    {
        z = true;
        Animation animation = n;
        long l1;
        if (flag)
        {
            l1 = 100L;
        } else
        {
            l1 = 500L;
        }
        animation.setDuration(l1);
        if (!u)
        {
            a(((View) (d)));
        }
        a(((View) (g)));
        a(((View) (h)));
        a(((View) (i)));
    }

    static boolean a(ApiMobileControlsOverlay apimobilecontrolsoverlay, boolean flag)
    {
        apimobilecontrolsoverlay.v = flag;
        return flag;
    }

    static void b(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        apimobilecontrolsoverlay.i();
    }

    static void c(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        apimobilecontrolsoverlay.h();
    }

    static com.google.android.apps.youtube.api.jar.c d(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        return apimobilecontrolsoverlay.b;
    }

    static void e(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        apimobilecontrolsoverlay.j();
    }

    static ControlsBar f(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        return apimobilecontrolsoverlay.d;
    }

    static MinimalTimeBar g(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        return apimobilecontrolsoverlay.e;
    }

    static ControlsState h(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        return apimobilecontrolsoverlay.q;
    }

    private void h()
    {
        if ((q == ControlsState.PLAYING || q == ControlsState.LOADING) && !y && !m.hasMessages(1))
        {
            m.sendEmptyMessageDelayed(1, 2500L);
        }
    }

    private void i()
    {
        z = false;
        m.removeMessages(1);
        n.setAnimationListener(null);
        if (!u)
        {
            d.clearAnimation();
        }
        h.clearAnimation();
        i.clearAnimation();
        g.clearAnimation();
        n.setAnimationListener(this);
    }

    static boolean i(ApiMobileControlsOverlay apimobilecontrolsoverlay)
    {
        return apimobilecontrolsoverlay.r;
    }

    private void j()
    {
        boolean flag3 = true;
        boolean flag;
        if (q == ControlsState.PAUSED)
        {
            g.setBackgroundResource(b.i);
            g.setContentDescription(getContext().getText(f.h));
        } else
        if (q == ControlsState.PLAYING)
        {
            g.setBackgroundResource(b.h);
            g.setContentDescription(getContext().getText(f.g));
        } else
        {
            g.setBackgroundResource(b.k);
            g.setContentDescription(getContext().getText(f.k));
        }
        if (v && d.getTop() < g.getBottom())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        boolean flag2;
        if (y || q.isError() || q == ControlsState.NEW)
        {
            int i1 = 0;
            while (i1 < getChildCount()) 
            {
                View view = getChildAt(i1);
                boolean flag1;
                if (view == f && q == ControlsState.LOADING || (view == j || view == k) && q.isError() || view == e && u)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                a(view, flag1);
                i1++;
            }
            ImageButton imagebutton;
            if (u && !x || q == ControlsState.LOADING || q.isError())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(this, flag2);
        } else
        {
            Object obj = j;
            if (q.isError() && !flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(((View) (obj)), flag2);
            obj = k;
            if (q.isError() && !flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(((View) (obj)), flag2);
            obj = f;
            if (q == ControlsState.LOADING && !flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(((View) (obj)), flag2);
            obj = g;
            if (!q.isError() && q != ControlsState.LOADING && p.supportsPlayHQCC && !flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(((View) (obj)), flag2);
            obj = d;
            if (!u)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(((View) (obj)), flag2);
            obj = e;
            if (p.supportsTimeBar && u)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            a(((View) (obj)), flag2);
            setVisibility(0);
        }
        if (!y && q != ControlsState.LOADING && p.supportsNextPrevious && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton = h;
        if (flag && s)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        a(imagebutton, flag2);
        imagebutton = i;
        if (flag && t)
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
        a(imagebutton, flag2);
    }

    public final int a()
    {
        return d.c();
    }

    public final void a(List list)
    {
        o.a(list, new d(this));
    }

    public final View b()
    {
        return this;
    }

    public final com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams c()
    {
        return new com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams(-1, -1, true);
    }

    public final void d()
    {
        d.setTimes(0, 0, 0);
        e.setTimes(0, 0, 0);
    }

    public final void e()
    {
        if (x)
        {
            return;
        }
        boolean flag = y;
        i();
        y = false;
        j();
        setFocusable(false);
        if (flag && a != null)
        {
            a.j();
        }
        h();
    }

    public final void f()
    {
        i();
        if (!y)
        {
            y = true;
            d.a();
            j();
            setFocusable(true);
            requestFocus();
            if (a != null)
            {
                a.k();
                return;
            }
        }
    }

    public final void g()
    {
        o.a();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            a(false);
            return true;
        } else
        {
            return false;
        }
    }

    public final void onAnimationEnd(Animation animation)
    {
        z = false;
        f();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    public final void onClick(View view)
    {
        if (a != null)
        {
            if (view == h)
            {
                f();
                a.d();
            } else
            {
                if (view == i)
                {
                    f();
                    a.e();
                    return;
                }
                if (view == g)
                {
                    if (q == ControlsState.ENDED)
                    {
                        a.m();
                        return;
                    }
                    if (q == ControlsState.PLAYING)
                    {
                        a.b();
                        return;
                    }
                    if (q == ControlsState.PAUSED)
                    {
                        a.a();
                        return;
                    }
                }
            }
        }
    }

    public final boolean onFilterTouchEventForSecurity(MotionEvent motionevent)
    {
        ai ai1 = a;
        boolean flag;
        if ((motionevent.getFlags() & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai1.a(flag);
        return super.onFilterTouchEventForSecurity(motionevent);
    }

    public final boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        boolean flag;
        if (!keyevent.isSystem() || at.b(i1))
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
        if (flag && q == ControlsState.RECOVERABLE_ERROR)
        {
            a.l();
        } else
        if (!l.a(i1, keyevent) && !super.onKeyDown(i1, keyevent))
        {
            return false;
        }
        return true;
    }

    public final boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        return l.a(i1) || super.onKeyUp(i1, keyevent);
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2 = l1 - j1;
        j1 = getPaddingLeft();
        l1 = i2 - getPaddingBottom();
        i1 = (k1 - i1) / 2;
        k1 = i2 / 2;
        Object obj;
        if (u)
        {
            obj = e;
        } else
        {
            obj = d;
        }
        ((View) (obj)).layout(j1, l1 - ((View) (obj)).getMeasuredHeight(), ((View) (obj)).getMeasuredWidth() + j1, l1);
        a(g, i1, k1);
        a(j, i1, k1);
        a(f, i1, k1);
        a(i, g.getLeft() - i.getMeasuredWidth() / 2, k1);
        a(h, g.getRight() + h.getMeasuredWidth() / 2, k1);
        k.layout(j1, l1 - k.getMeasuredHeight(), k.getMeasuredWidth() + j1, l1);
    }

    protected final void onMeasure(int i1, int j1)
    {
        int k1 = getDefaultSize(0, i1);
        setMeasuredDimension(k1, getDefaultSize(0, j1));
        k1 = (k1 * 10) / 100;
        k.setPadding(k1, k.getPaddingTop(), k1, k.getPaddingBottom());
        measureChild(f, i1, j1);
        measureChild(g, i1, j1);
        measureChild(j, i1, j1);
        measureChild(k, i1, j1);
        measureChild(h, i1, j1);
        measureChild(i, i1, j1);
        Object obj;
        if (u)
        {
            obj = e;
        } else
        {
            obj = d;
        }
        measureChild(((View) (obj)), i1, j1);
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 195
    //                   2 36
    //                   3 241;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        if (y) goto _L6; else goto _L5
_L5:
        boolean flag;
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        int i1;
        if (u)
        {
            motionevent = e;
        } else
        {
            motionevent = d;
        }
        if (!u && !v)
        {
            i1 = d.getBottom() - d.b();
        } else
        {
            i1 = motionevent.getTop();
        }
        if ((float)motionevent.getLeft() <= f1 && f1 <= (float)motionevent.getRight() && (float)i1 <= f2 && f2 <= (float)motionevent.getBottom())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0 && !z) goto _L7; else goto _L6
_L6:
        flag = true;
_L8:
        w = flag;
        e();
        return true;
_L7:
        flag = false;
          goto _L8
_L3:
        if (q == ControlsState.RECOVERABLE_ERROR)
        {
            a.l();
        } else
        if (!y && !w)
        {
            a(true);
        }
        w = false;
        return true;
_L4:
        w = false;
        return true;
    }

    public final void setAndShowEnded()
    {
        if (q == ControlsState.ENDED)
        {
            return;
        } else
        {
            q = ControlsState.ENDED;
            j();
            e();
            return;
        }
    }

    public final void setAndShowPaused()
    {
        if (q == ControlsState.PAUSED)
        {
            return;
        } else
        {
            q = ControlsState.PAUSED;
            j();
            e();
            return;
        }
    }

    public final void setAudioOnlyEnabled(boolean flag)
    {
    }

    public final void setCcEnabled(boolean flag)
    {
        d.setCcEnabled(flag);
    }

    public final void setControlsPermanentlyHidden(boolean flag)
    {
        x = flag;
        if (flag)
        {
            f();
        } else
        if (q == ControlsState.PAUSED || q == ControlsState.ENDED)
        {
            e();
            return;
        }
        j();
    }

    public final void setErrorAndShowMessage(int i1, boolean flag)
    {
        setErrorAndShowMessage(getContext().getString(i1), flag);
    }

    public final void setErrorAndShowMessage(String s1, boolean flag)
    {
        Object obj;
        int i1;
        if (flag)
        {
            obj = ControlsState.RECOVERABLE_ERROR;
        } else
        {
            obj = ControlsState.UNRECOVERABLE_ERROR;
        }
        q = ((ControlsState) (obj));
        obj = j;
        if (flag)
        {
            i1 = b.k;
        } else
        {
            i1 = b.l;
        }
        ((ImageView) (obj)).setImageResource(i1);
        k.setText(s1);
        j();
        e();
    }

    public final void setFullscreen(boolean flag)
    {
        d.setFullscreen(flag);
    }

    public final void setHQ(boolean flag)
    {
        d.setHQ(flag);
    }

    public final void setHQisHD(boolean flag)
    {
        d.setHQisHD(flag);
    }

    public final void setHasAudioOnly(boolean flag)
    {
    }

    public final void setHasCc(boolean flag)
    {
        r = flag;
        d.setHasCc(flag);
    }

    public final void setHasInfoCard(boolean flag)
    {
    }

    public final void setHasNext(boolean flag)
    {
        s = flag;
        j();
    }

    public final void setHasPrevious(boolean flag)
    {
        t = flag;
        j();
    }

    public final void setInitial()
    {
        if (q == ControlsState.NEW)
        {
            return;
        } else
        {
            q = ControlsState.NEW;
            j();
            return;
        }
    }

    public final void setLearnMoreEnabled(boolean flag)
    {
    }

    public final void setListener(p p1)
    {
        a = new ai(p1, c);
        d.setControlsListener(a);
    }

    public final void setLoading()
    {
        if (q == ControlsState.LOADING)
        {
            return;
        } else
        {
            q = ControlsState.LOADING;
            j();
            h();
            return;
        }
    }

    public final void setMinimal(boolean flag)
    {
        u = flag;
        j();
    }

    public final void setOnPlayInYouTubeListener(com.google.android.apps.youtube.api.jar.c c1)
    {
        b = c1;
    }

    public final void setPlaying()
    {
        if (q == ControlsState.PLAYING)
        {
            return;
        } else
        {
            q = ControlsState.PLAYING;
            j();
            h();
            return;
        }
    }

    public final void setScrubbingEnabled(boolean flag)
    {
        d.setScrubbingEnabled(flag);
    }

    public final void setShowAudioOnly(boolean flag)
    {
    }

    public final void setShowFullscreen(boolean flag)
    {
        d.setShowFullscreenButton(flag);
    }

    public final void setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style style)
    {
        p = style;
        d.setStyle(style);
        e.setStyle(style);
    }

    public final void setSupportsQualityToggle(boolean flag)
    {
        d.setSupportsQualityToggle(flag);
    }

    public final void setTimes(int i1, int j1, int k1)
    {
        d.setTimes(i1, j1, k1);
        e.setTimes(i1, j1, k1);
        l.a(i1, j1);
    }

    public final void setVideoTitle(String s1)
    {
        d.setVideoTitle(s1);
    }
}
