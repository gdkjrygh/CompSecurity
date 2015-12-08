// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.sequencer;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.player.event.r;
import com.google.android.apps.youtube.core.player.fetcher.PlayerFetcher;
import com.google.android.apps.youtube.core.player.fetcher.e;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.datalib.a.k;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.apps.youtube.core.player.sequencer:
//            u, aa, ad, z, 
//            ac, ab

final class y
    implements Runnable
{

    final u a;
    private final PlaybackStartDescriptor b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile Runnable e;
    private final boolean f;

    public y(u u1, PlaybackStartDescriptor playbackstartdescriptor, boolean flag)
    {
        a = u1;
        super();
        d = true;
        b = playbackstartdescriptor;
        f = flag;
    }

    private void a(Exception exception)
    {
        u.b(a).post(new aa(this, exception));
    }

    static boolean a(y y1)
    {
        return y1.c;
    }

    static PlaybackStartDescriptor b(y y1)
    {
        return y1.b;
    }

    private void b(Exception exception)
    {
        u.b(a).post(new ad(this, exception));
    }

    public final boolean a()
    {
        if (d)
        {
            c = true;
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        e = runnable;
        this;
        JVM INSTR monitorexit ;
        return true;
        runnable;
        throw runnable;
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        obj1 = null;
        a.c.c(new r());
        k k1 = k.a();
        com.google.android.apps.youtube.core.player.sequencer.u.a(a).a(b, k1);
        String s = b.getVideoId();
        obj = s;
        if (f)
        {
            obj = s;
            if (TextUtils.isEmpty(s))
            {
                try
                {
                    obj = ((WatchNextResponse)k1.get()).getVideoId();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    a(((Exception) (obj)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    a(((Exception) (obj)));
                    return;
                }
            }
        }
        if (!f) goto _L2; else goto _L1
_L1:
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        obj = a.a.a(((String) (obj)), b.getClickTrackingParams(), b.getPlayerParams(), b.getPlaylistId(), b.getPlaylistIndex(), -1);
        d = false;
        u.b(a).post(new z(this, ((com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair) (obj))));
_L3:
        InterruptedException interruptedexception1;
        try
        {
            obj1 = (WatchNextResponse)k1.get();
            u.b(a).post(new ac(this, ((WatchNextResponse) (obj1))));
        }
        catch (ExecutionException executionexception)
        {
            b(executionexception);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            b(interruptedexception);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        u.b(a).post(new ab(this));
        this;
        JVM INSTR monitorenter ;
        d = true;
        if (e != null)
        {
            u.b(a).post(e);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj = null;
_L5:
        a(((Exception) (obj1)));
          goto _L3
        interruptedexception1;
        obj = obj1;
        obj1 = interruptedexception1;
_L4:
        a(((Exception) (obj1)));
          goto _L3
_L2:
        obj = a.h;
          goto _L3
        Exception exception;
        exception;
        throw exception;
        obj1;
          goto _L4
        obj1;
          goto _L5
    }
}
