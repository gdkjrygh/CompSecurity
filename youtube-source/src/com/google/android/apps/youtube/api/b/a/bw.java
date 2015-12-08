// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.cn;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.ControlsOverlay;
import com.google.android.apps.youtube.core.player.overlay.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bx

public final class bw
    implements ControlsOverlay
{

    private final Context a;
    private final bx b;
    private cn c;

    public bw(Context context, Handler handler, cn cn1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context, "context cannot be null");
        com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
        c = (cn)com.google.android.apps.youtube.common.fromguava.c.a(cn1, "client cannot be null");
        b = new bx(handler);
        try
        {
            cn1.a(b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public final void a()
    {
        c = null;
    }

    public final void a(List list)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.a(list);
        return;
        list;
    }

    public final View b()
    {
        return null;
    }

    public final com.google.android.apps.youtube.core.player.overlay.PlayerOverlaysLayout.LayoutParams c()
    {
        return null;
    }

    public final void d()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.i();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void e()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.b();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void f()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.c();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void g()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.j();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (c != null)
        {
            try
            {
                c.a(i, keyevent);
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent) { }
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (c != null)
        {
            try
            {
                c.b(i, keyevent);
            }
            // Misplaced declaration of an exception variable
            catch (KeyEvent keyevent) { }
        }
        return true;
    }

    public final void setAndShowEnded()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.h();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setAndShowPaused()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.g();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setAudioOnlyEnabled(boolean flag)
    {
    }

    public final void setCcEnabled(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.k(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setErrorAndShowMessage(String s, boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        c.a(s, flag);
        return;
        s;
    }

    public final void setFullscreen(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.d(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setHQ(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.b(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setHQisHD(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.c(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setHasCc(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.j(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setHasInfoCard(boolean flag)
    {
    }

    public final void setHasNext(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.f(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setHasPrevious(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.g(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setInitial()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.f();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setLearnMoreEnabled(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.i(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setListener(p p)
    {
        b.a(p);
    }

    public final void setLoading()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.e();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setPlaying()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        c.d();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setScrubbingEnabled(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.h(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setShowFullscreen(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.e(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style style)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        c.a(style.name());
        return;
        style;
    }

    public final void setSupportsQualityToggle(boolean flag)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        c.a(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setTimes(int i, int j, int k)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        c.a(i, j, k);
        return;
        RemoteException remoteexception;
        remoteexception;
    }
}
