// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.ControlsState;
import com.google.android.apps.youtube.core.player.overlay.MediaActionHelper;
import com.google.android.apps.youtube.core.player.overlay.bb;
import com.google.android.apps.youtube.core.player.overlay.p;
import com.google.android.youtube.api.d;
import com.google.android.youtube.api.e;
import com.google.android.youtube.player.internal.b.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            b, aa, j, ApiTvControlsView, 
//            l, k, ai, c

public class ApiTvControlsOverlay extends FrameLayout
    implements android.view.View.OnClickListener, b
{

    private static final Map a;
    private final aa b;
    private final View c;
    private final ApiTvControlsView d;
    private final View e;
    private final View f;
    private final TextView g;
    private final Button h;
    private final Button i;
    private final bb j;
    private final int k;
    private final Handler l = new j(this);
    private p m;
    private com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style n;
    private ControlsState o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private final MediaActionHelper u;

    public ApiTvControlsOverlay(Context context, View view, aa aa1)
    {
        super(context);
        c = (View)com.google.android.apps.youtube.common.fromguava.c.a(view);
        b = (aa)com.google.android.apps.youtube.common.fromguava.c.a(aa1);
        o = ControlsState.NEW;
        LayoutInflater.from(context).inflate(e.b, this);
        k = context.getResources().getInteger(d.a);
        d = (ApiTvControlsView)findViewById(com.google.android.youtube.api.c.c);
        e = findViewById(com.google.android.youtube.api.c.n);
        f = findViewById(com.google.android.youtube.api.c.e);
        g = (TextView)findViewById(com.google.android.youtube.api.c.g);
        h = (Button)findViewById(com.google.android.youtube.api.c.f);
        h.setOnClickListener(this);
        u = new MediaActionHelper(getContext(), new l(this, (byte)0), (ImageView)findViewById(com.google.android.youtube.api.c.m));
        d.setMediaActionHelper(u);
        d.a(com.google.android.youtube.api.c.l);
        i = (Button)d.findViewById(com.google.android.youtube.api.c.k);
        i.setOnClickListener(this);
        j = new bb(context);
        f();
    }

    static ControlsState a(ApiTvControlsOverlay apitvcontrolsoverlay)
    {
        return apitvcontrolsoverlay.o;
    }

    private com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action a(int i1)
    {
        if (a.containsKey(Integer.valueOf(i1)))
        {
            return (com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action)a.get(Integer.valueOf(i1));
        }
        if (i1 == 85 || i1 == 62)
        {
            if (o == ControlsState.PLAYING)
            {
                return com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PAUSE;
            } else
            {
                return com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PLAY;
            }
        } else
        {
            return null;
        }
    }

    static p b(ApiTvControlsOverlay apitvcontrolsoverlay)
    {
        return apitvcontrolsoverlay.m;
    }

    static int c(ApiTvControlsOverlay apitvcontrolsoverlay)
    {
        return apitvcontrolsoverlay.s;
    }

    private void h()
    {
        l.removeMessages(0);
        if (o == ControlsState.PLAYING)
        {
            l.sendEmptyMessageDelayed(0, k);
        }
    }

    public final int a()
    {
        return 0;
    }

    public final void a(List list)
    {
        j.a(list, new k(this));
    }

    public final View b()
    {
        return this;
    }

    public final com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams c()
    {
        return new com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams(-1, -1);
    }

    public final void d()
    {
        d.a();
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        h();
        return super.dispatchKeyEventPreIme(keyevent);
    }

    public final void e()
    {
        byte byte0 = 8;
        Object obj;
        ApiTvControlsView apitvcontrolsview;
        boolean flag;
        int i1;
        if (d.getVisibility() != 0 || q)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        apitvcontrolsview = d;
        if (o == ControlsState.PLAYING)
        {
            obj = ApiTvControlsView.PlaybackState.PLAYING;
        } else
        {
            obj = ApiTvControlsView.PlaybackState.PAUSED;
        }
        apitvcontrolsview.setPlaybackState(((ApiTvControlsView.PlaybackState) (obj)));
        obj = e;
        if (o == ControlsState.LOADING)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        obj = f;
        if (o.isError())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        d.setErrorState(o.isError());
        obj = d;
        i1 = byte0;
        if (o != ControlsState.LOADING)
        {
            i1 = byte0;
            if (o != ControlsState.NEW)
            {
                i1 = 0;
            }
        }
        ((ApiTvControlsView) (obj)).setVisibility(i1);
        if (p && !o.isError() && !o.isError())
        {
            f();
        } else
        {
            if (c.hasFocus() && flag && d.getVisibility() == 0)
            {
                d.setFocus(com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PLAY);
            }
            q = false;
            setVisibility(0);
        }
        h();
        if (m != null)
        {
            m.j();
        }
    }

    public final void f()
    {
        q = true;
        setVisibility(4);
        if (m != null)
        {
            m.k();
        }
    }

    public final void g()
    {
        j.a();
    }

    public void onClick(View view)
    {
        boolean flag = false;
        if (view == h && r)
        {
            r = false;
            m.l();
        } else
        if (view == i)
        {
            if (!t)
            {
                flag = true;
            }
            setFullscreen(flag);
            m.b(t);
            return;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        e();
        return super.onInterceptTouchEvent(motionevent);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action;
        boolean flag;
        if (keyevent.getRepeatCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        action = a(i1);
        if (action != null)
        {
            while (!u.a(action, n) || flag) 
            {
                return true;
            }
            u.a(action);
            return true;
        }
        switch (i1)
        {
        default:
            return super.onKeyDown(i1, keyevent);

        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 66: // 'B'
            if (q)
            {
                e();
                return true;
            } else
            {
                return false;
            }

        case 4: // '\004'
            break;
        }
        if (!q)
        {
            f();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action = a(i1);
        if (action != null)
        {
            u.b(action);
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (super.onTouchEvent(motionevent))
        {
            return true;
        }
        if (q)
        {
            e();
            return true;
        } else
        {
            return false;
        }
    }

    public void setAndShowEnded()
    {
        o = ControlsState.ENDED;
        e();
    }

    public void setAndShowPaused()
    {
        o = ControlsState.PAUSED;
        l.removeMessages(0);
        e();
    }

    public void setAudioOnlyEnabled(boolean flag)
    {
    }

    public void setCcEnabled(boolean flag)
    {
        d.setCcEnabled(flag);
    }

    public void setControlsPermanentlyHidden(boolean flag)
    {
        p = flag;
        if (flag)
        {
            f();
        }
    }

    public void setErrorAndShowMessage(int i1, boolean flag)
    {
        setErrorAndShowMessage(getContext().getString(i1), flag);
    }

    public void setErrorAndShowMessage(String s1, boolean flag)
    {
        if (flag)
        {
            o = ControlsState.RECOVERABLE_ERROR;
            g.setText(s1);
            h.setVisibility(0);
            e();
        } else
        {
            o = ControlsState.UNRECOVERABLE_ERROR;
            g.setText(s1);
            h.setVisibility(8);
            e();
        }
        r = flag;
    }

    public void setFullscreen(boolean flag)
    {
        t = flag;
        i.setSelected(flag);
    }

    public void setHQ(boolean flag)
    {
    }

    public void setHQisHD(boolean flag)
    {
    }

    public void setHasAudioOnly(boolean flag)
    {
    }

    public void setHasCc(boolean flag)
    {
        d.setShowCcButton(flag);
    }

    public void setHasInfoCard(boolean flag)
    {
    }

    public void setHasNext(boolean flag)
    {
        d.setNextEnabled(flag);
    }

    public void setHasPrevious(boolean flag)
    {
        d.setPreviousEnabled(flag);
    }

    public void setInitial()
    {
        o = ControlsState.NEW;
        e();
    }

    public void setLearnMoreEnabled(boolean flag)
    {
    }

    public void setListener(p p1)
    {
        m = new ai(p1, b);
    }

    public void setLoading()
    {
        o = ControlsState.LOADING;
        e();
    }

    public void setMinimal(boolean flag)
    {
        if (flag)
        {
            com.google.android.youtube.player.internal.b.a.a("MINIMAL mode is not supported for Google TV controls", new Object[0]);
        }
    }

    public void setOnPlayInYouTubeListener(com.google.android.apps.youtube.api.jar.c c1)
    {
    }

    public void setPlaying()
    {
        o = ControlsState.PLAYING;
        e();
    }

    public void setScrubbingEnabled(boolean flag)
    {
        d.setScrubbingEnabled(flag);
        u.a(flag);
    }

    public void setShowAudioOnly(boolean flag)
    {
    }

    public void setShowFullscreen(boolean flag)
    {
        Button button = i;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        button.setVisibility(i1);
    }

    public void setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style style)
    {
        n = style;
        d.setStyle(style);
    }

    public void setSupportsQualityToggle(boolean flag)
    {
    }

    public void setTimes(int i1, int j1, int k1)
    {
        s = i1;
        d.a(i1, j1, k1);
    }

    public void setVideoTitle(String s1)
    {
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put(Integer.valueOf(90), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.FAST_FORWARD);
        hashmap.put(Integer.valueOf(89), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.REWIND);
        hashmap.put(Integer.valueOf(86), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PAUSE);
        hashmap.put(Integer.valueOf(127), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PAUSE);
        hashmap.put(Integer.valueOf(126), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PLAY);
        hashmap.put(Integer.valueOf(88), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PREVIOUS);
        hashmap.put(Integer.valueOf(87), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.NEXT);
        a = Collections.unmodifiableMap(hashmap);
    }
}
