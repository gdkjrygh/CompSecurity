// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.google.android.apps.common.a.a.a;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.datalib.innertube.model.media.PlayerConfig;
import com.google.android.apps.youtube.datalib.innertube.model.media.VideoStreamingData;
import com.google.android.exoplayer.aa;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            x, i, h, y

public final class g
    implements x
{

    private final x a;
    private final x b;
    private final Context c;
    private final h d;
    private x e;
    private boolean f;
    private y g;

    public g(x x1, x x2, Context context, h h1)
    {
        a = x1;
        b = x2;
        e = x1;
        c = context;
        d = h1;
    }

    private boolean a(VideoStreamingData videostreamingdata, PlayerConfig playerconfig)
    {
        boolean flag1 = com.google.android.apps.common.a.a.a.a();
label0:
        {
            if (flag1)
            {
                return true;
            }
            break label0;
        }
        Exception exception;
        exception;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 16 || !m())
        {
            return true;
        }
        if (videostreamingdata.isLive())
        {
            return true;
        }
        if (videostreamingdata.getProgressiveFormatStreams().isEmpty())
        {
            return false;
        }
        if (!playerconfig.isExoPlayerEnabled())
        {
            return true;
        }
        if (videostreamingdata.isAudioOnly())
        {
            flag = true;
        } else
        {
label1:
            {
                videostreamingdata = videostreamingdata.getAdaptiveFormatStreams().iterator();
                do
                {
                    if (!videostreamingdata.hasNext())
                    {
                        break label1;
                    }
                } while (!com.google.android.apps.youtube.medialib.player.i.b(((FormatStream)videostreamingdata.next()).getItag()));
                flag = true;
            }
        }
_L1:
        return !flag;
        flag = false;
          goto _L1
    }

    private static boolean m()
    {
        boolean flag;
        try
        {
            flag = aa.a(2, 64);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return false;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return false;
        }
        return flag;
    }

    public final FormatStream a()
    {
        return e.a();
    }

    public final void a(float f1)
    {
        a.a(f1);
        b.a(f1);
    }

    public final void a(int i1)
    {
        e.a(i1);
    }

    public final void a(int i1, int j1)
    {
        e.a(i1, j1);
    }

    public final void a(int i1, VideoStreamingData videostreamingdata, int j1, String s, PlayerConfig playerconfig)
    {
        boolean flag = a(videostreamingdata, playerconfig);
        Object obj;
        if (flag)
        {
            obj = b;
        } else
        {
            obj = a;
        }
        if (obj != e)
        {
            if (f)
            {
                e.l();
                ((x) (obj)).a(g);
            }
            e = ((x) (obj));
        }
        if (d != null && d.a())
        {
            if (flag)
            {
                obj = "Using fallback player";
            } else
            {
                obj = "Using ExoPlayer";
            }
            Toast.makeText(c, ((CharSequence) (obj)), 0).show();
        }
        e.a(i1, videostreamingdata, j1, s, playerconfig);
    }

    public final void a(Handler handler)
    {
        a.a(handler);
        b.a(handler);
    }

    public final void a(y y)
    {
        f = true;
        g = y;
        e.a(y);
    }

    public final void a(boolean flag)
    {
        e.a(flag);
    }

    public final void b()
    {
        e.b();
    }

    public final void b(Handler handler)
    {
        a.b(handler);
        b.b(handler);
    }

    public final void c()
    {
        e.c();
    }

    public final void d()
    {
        e.d();
    }

    public final void e()
    {
        e.e();
    }

    public final int f()
    {
        return e.f();
    }

    public final int g()
    {
        return e.g();
    }

    public final int h()
    {
        return e.h();
    }

    public final boolean i()
    {
        return e.i();
    }

    public final boolean j()
    {
        return e.j();
    }

    public final void k()
    {
        e.k();
    }

    public final void l()
    {
        f = false;
        g = null;
        e.l();
    }
}
