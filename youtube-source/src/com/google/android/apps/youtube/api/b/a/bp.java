// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.ch;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.overlay.g;
import com.google.android.apps.youtube.core.player.overlay.h;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bq

public final class bp
    implements g
{

    private final bq a;
    private ch b;

    public bp(Handler handler, ch ch1)
    {
        b = (ch)com.google.android.apps.youtube.common.fromguava.c.a(ch1, "client cannot be null");
        a = new bq(handler);
        try
        {
            ch1.a(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            return;
        }
    }

    public final void a()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.b();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void a(boolean flag)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.b(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
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
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.c();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void e()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.d();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void f()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.e();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void g()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.f();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void h()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.g();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void i()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.h();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void j()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.i();
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setAdStyle(boolean flag)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.c(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public final void setCallToActionImage(Bitmap bitmap)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.c(bitmap);
        return;
        bitmap;
    }

    public final void setCallToActionText(String s, String s1)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        b.a(s, s1);
        return;
        s;
    }

    public final void setFeaturedChannelImage(Bitmap bitmap)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(bitmap);
        return;
        bitmap;
    }

    public final void setFeaturedVideoImage(Bitmap bitmap)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.b(bitmap);
        return;
        bitmap;
    }

    public final void setFeaturedVideoTitle(String s)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(s);
        return;
        s;
    }

    public final void setInfoCardTeaserImage(Bitmap bitmap)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.d(bitmap);
        return;
        bitmap;
    }

    public final void setInfoCardTeaserMessage(CharSequence charsequence)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(charsequence);
        return;
        charsequence;
    }

    public final void setListener(h h1)
    {
        a.a(h1);
    }

    public final void setVisible(boolean flag)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }
}
