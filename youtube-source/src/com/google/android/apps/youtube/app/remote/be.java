// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.text.TextUtils;
import com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup;
import com.google.android.apps.youtube.core.player.notification.j;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bb, RemoteControl

final class be
    implements j
{

    final bb a;

    private be(bb bb1)
    {
        a = bb1;
        super();
    }

    be(bb bb1, byte byte0)
    {
        this(bb1);
    }

    private boolean i()
    {
        return bb.a(a).n() == RemoteControl.RemotePlayerState.ADVERTISEMENT;
    }

    public final void a()
    {
        if (bb.a(a) != null)
        {
            bb.b(a).a(bb.a(a).h(), bb.a(a).k());
        }
    }

    public final void a(long l)
    {
        bb.a(a).c((int)l);
    }

    public final void b()
    {
        if (!i())
        {
            bb.a(a).e();
        }
    }

    public final void c()
    {
        if (!i())
        {
            bb.a(a).f();
        }
    }

    public final void d()
    {
        if (bb.a(a).n() == RemoteControl.RemotePlayerState.PLAYING)
        {
            bb.a(a).f();
        } else
        if (!i())
        {
            bb.a(a).e();
            return;
        }
    }

    public final void e()
    {
        if (bb.a(a).h())
        {
            bb.a(a).i();
        } else
        if (!TextUtils.isEmpty(bb.a(a).p()))
        {
            bb.a(a).c(0);
            return;
        }
    }

    public final void f()
    {
        if (bb.a(a).k())
        {
            bb.a(a).m();
        }
    }

    public final void g()
    {
        bb.a(a).g();
        bb.b(a).b();
    }

    public final void h()
    {
        bb.a(a).c(0);
    }
}
