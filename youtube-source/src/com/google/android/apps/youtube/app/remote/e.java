// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            RemoteControl, k, o, n, 
//            m, g, f, p, 
//            j, l, i, h, 
//            as, YouTubeTvScreen, aq, au, 
//            aw, bg

public abstract class e
    implements RemoteControl
{

    private final Set a = new HashSet();
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    private final Handler e;
    private RemoteControl.State f;
    private as g;
    private final l h;
    private final bc i;

    public e(Context context, l l1, bc bc1)
    {
        h = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        i = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        e = new Handler(context.getMainLooper());
        f = RemoteControl.State.OFFLINE;
    }

    static Set a(e e1)
    {
        return e1.d;
    }

    static Set b(e e1)
    {
        return e1.a;
    }

    private void b(RemoteControl.State state)
    {
        e.post(new k(this, state));
    }

    static Set c(e e1)
    {
        return e1.c;
    }

    protected final void a()
    {
        e.post(new o(this));
    }

    protected final void a(int i1)
    {
        e.post(new n(this, i1));
    }

    protected final void a(RemoteControl.RemotePlayerState remoteplayerstate, String s)
    {
        e.post(new m(this, remoteplayerstate, s));
    }

    protected void a(RemoteControl.State state)
    {
        RemoteControl.State state1;
        boolean flag;
        if (state != RemoteControl.State.ERROR)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "use toErrorState for ERROR state");
        state1 = f;
        f = state;
        if (state1 != state)
        {
            b(f);
        }
        if (f == RemoteControl.State.SLEEP || f == RemoteControl.State.OFFLINE)
        {
            a(((String) (null)), null);
        }
    }

    protected final void a(YouTubeTvScreen youtubetvscreen)
    {
        e.post(new g(this, youtubetvscreen));
    }

    public final void a(aq aq)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(aq);
        a.add(aq);
        this;
        JVM INSTR monitorexit ;
        return;
        aq;
        throw aq;
    }

    protected void a(as as)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(as);
        if (f == RemoteControl.State.OFFLINE)
        {
            L.c("Remote control trying to move to ERROR state while OFFLINE");
            return;
        } else
        {
            g = as;
            f = RemoteControl.State.ERROR;
            b(f);
            return;
        }
    }

    public final void a(au au)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(au);
        e.post(new f(this, au));
    }

    public final void a(aw aw)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(aw);
        c.add(aw);
        this;
        JVM INSTR monitorexit ;
        return;
        aw;
        throw aw;
    }

    protected final void a(SubtitleTrack subtitletrack)
    {
        e.post(new p(this, subtitletrack));
    }

    protected final void a(String s)
    {
        e.post(new j(this, s));
    }

    protected abstract void a(String s, String s1);

    protected final void a(List list)
    {
        list = Collections.unmodifiableList(new ArrayList(list));
        e.post(new com.google.android.apps.youtube.app.remote.l(this, list));
    }

    public final boolean a(bg bg)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(bg);
        RemoteControl.State state = f;
        return (state == RemoteControl.State.CONNECTED || state == RemoteControl.State.CONNECTING) && bg.equals(o());
    }

    public final RemoteControl.State b()
    {
        return f;
    }

    public final void b(aq aq)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(aq);
        a.remove(aq);
        if (b.remove(aq))
        {
            b.isEmpty();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        aq;
        throw aq;
    }

    public final void b(au au)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(au);
        e.post(new i(this, au));
        this;
        JVM INSTR monitorexit ;
        return;
        au;
        throw au;
    }

    public final void b(aw aw)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(aw);
        c.remove(aw);
        this;
        JVM INSTR monitorexit ;
        return;
        aw;
        throw aw;
    }

    protected final void b(String s)
    {
        if (!TextUtils.isEmpty(s) && h.b())
        {
            i.l(s, new h(this));
        }
    }

    public final as c()
    {
        return g;
    }

    public final void c(aq aq)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        com.google.android.apps.youtube.common.fromguava.c.a(aq);
        com.google.android.apps.youtube.common.fromguava.c.a(a.contains(aq), "listener not added, cannot be made active");
        flag = b.isEmpty();
        b.add(aq);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        aq;
        throw aq;
    }

    protected abstract void d();
}
