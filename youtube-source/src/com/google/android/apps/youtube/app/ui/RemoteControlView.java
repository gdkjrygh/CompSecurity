// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.remote.ar;
import com.google.android.apps.youtube.app.remote.as;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.DefaultControlsOverlay;
import com.google.android.apps.youtube.core.ui.u;
import com.google.android.apps.youtube.core.ui.v;
import com.google.android.youtube.f;
import com.google.android.youtube.h;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            er

public class RemoteControlView extends RelativeLayout
{

    private View a;
    private TextView b;
    private DefaultControlsOverlay c;
    private final LayoutInflater d;
    private android.view.View.OnClickListener e;
    private View f;
    private u g;
    private View h;
    private ImageView i;
    private boolean j;
    private Button k;
    private boolean l;
    private TextView m;
    private ImageView n;
    private boolean o;

    public RemoteControlView(Context context, DefaultControlsOverlay defaultcontrolsoverlay, v v, android.view.View.OnClickListener onclicklistener)
    {
        super(context);
        d = LayoutInflater.from(context);
        c = (DefaultControlsOverlay)com.google.android.apps.youtube.common.fromguava.c.a(defaultcontrolsoverlay);
        com.google.android.apps.youtube.common.fromguava.c.a(v);
        com.google.android.apps.youtube.common.fromguava.c.a(onclicklistener);
        i = new ImageView(getContext());
        context = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        i.setLayoutParams(context);
        i.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        addView(i);
        context = new View(getContext());
        context.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        context.setBackgroundColor(getResources().getColor(f.n));
        addView(context);
        a = d.inflate(l.aS, this, false);
        addView(a);
        b = (TextView)a.findViewById(j.m);
        f = a.findViewById(j.cb);
        a.setVisibility(8);
        m = (TextView)d.inflate(l.aG, this, false);
        addView(m);
        context = new android.widget.RelativeLayout.LayoutParams(m.getLayoutParams());
        context.addRule(10);
        context.setMargins(0, defaultcontrolsoverlay.h(), 0, 0);
        m.setLayoutParams(context);
        c = defaultcontrolsoverlay;
        addView(defaultcontrolsoverlay);
        defaultcontrolsoverlay.setShowFullscreen(true);
        h = d.inflate(l.aT, this, false);
        g = u.a(getContext(), h, v);
        g.a();
        k = (Button)h.findViewById(j.ek);
        addView(h);
        n = new ImageView(getContext());
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        context.addRule(13);
        n.setLayoutParams(context);
        n.setImageResource(h.q);
        n.setVisibility(8);
        addView(n);
    }

    private void f()
    {
        c.b().setVisibility(0);
        c.setMinimized(false);
        c.e();
    }

    private void g()
    {
        c.f();
        c.b().setVisibility(8);
    }

    private void h()
    {
        n.setVisibility(8);
        f();
        a.setVisibility(8);
        g.b();
        c.setHasCc(j);
        c.setCcEnabled(l);
    }

    private void i()
    {
        if (o)
        {
            g();
        }
    }

    public final ImageView a()
    {
        return i;
    }

    public final void a(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState remoteplayerstate)
    {
        a(remoteplayerstate, ((ar) (null)));
    }

    public final void a(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState remoteplayerstate, ar ar1)
    {
        if (o)
        {
            d();
            return;
        }
        c.setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.REMOTE);
        m.setVisibility(0);
        n.setVisibility(8);
        switch (er.a[remoteplayerstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h();
            c.setPlaying();
            return;

        case 2: // '\002'
        case 3: // '\003'
            h();
            c.setAndShowPaused();
            return;

        case 4: // '\004'
            h();
            c.setAndShowEnded();
            return;

        case 5: // '\005'
            if (o)
            {
                d();
                return;
            }
            if (ar1 == null)
            {
                g.a(p.u, false);
            } else
            {
                g.b();
                c.setPlaying();
                boolean flag;
                if (!TextUtils.isEmpty(ar1.a))
                {
                    b.setText(ar1.a);
                } else
                {
                    b.setText(p.u);
                }
                if (ar1.b != null && !Uri.EMPTY.equals(ar1.b))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    f.setVisibility(0);
                    f.setOnClickListener(e);
                } else
                {
                    f.setVisibility(8);
                }
                a.setVisibility(0);
            }
            g();
            n.setVisibility(8);
            return;

        case 6: // '\006'
        case 7: // '\007'
            c.setLoading();
            f();
            g.b();
            a.setVisibility(8);
            c.setHasCc(j);
            c.setCcEnabled(l);
            return;
        }
    }

    public final void a(as as1, String s)
    {
        a(Html.fromHtml(getContext().getString(as1.b, new Object[] {
            s
        })).toString(), as1.c);
    }

    public final void a(String s, int i1)
    {
        if (o)
        {
            d();
            return;
        } else
        {
            n.setVisibility(8);
            k.setText(i1);
            g.a(s, true);
            g();
            a.setVisibility(8);
            m.setVisibility(8);
            return;
        }
    }

    public final void a(String s, boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = p.fs;
        } else
        {
            i1 = p.K;
        }
        a(s, i1);
    }

    public final void a(List list)
    {
        c.a(list);
        i();
    }

    public final boolean b()
    {
        return o;
    }

    public final void c()
    {
        g.a(p.az, true);
        n.setVisibility(8);
        g();
        a.setVisibility(8);
        m.setVisibility(8);
    }

    public final void d()
    {
        g.b();
        a.setVisibility(8);
        m.setVisibility(8);
        n.setVisibility(0);
        c.setMinimized(true);
        g();
    }

    public final void e()
    {
        i.setImageBitmap(null);
        a(com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNCONFIRMED, ((ar) (null)));
    }

    public void setCcEnabled(boolean flag)
    {
        l = flag;
        c.setCcEnabled(flag);
        i();
    }

    public void setHasCc(boolean flag)
    {
        j = flag;
    }

    public void setHasNext(boolean flag)
    {
        c.setHasNext(flag);
        i();
    }

    public void setHasPrevious(boolean flag)
    {
        c.setHasPrevious(flag);
        i();
    }

    public void setMinimized(boolean flag)
    {
        o = flag;
    }

    public void setPlayingOnText(String s)
    {
        m.setText(s);
    }

    public void setScrubbingEnabled(boolean flag)
    {
        c.setScrubbingEnabled(flag);
        i();
    }

    public void setTimes(int i1, int j1, int k1)
    {
        c.setTimes(i1, j1, k1);
        i();
    }
}
