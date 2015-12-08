// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer.c.a;
import com.google.android.exoplayer.e.j;
import com.google.android.exoplayer.e.k;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer:
//            w, a, ad, ae, 
//            ac, ag, af, ai

public final class ab extends w
{

    private final af c;
    private final long d = 0x4c4b40L;
    private final int e = 1;
    private final int f = 1;
    private Surface g;
    private boolean h;
    private boolean i;
    private long j;
    private long k;
    private int l;

    public ab(ai ai, a a1, int i1, long l1, Handler handler, af af, 
            int j1)
    {
        super(ai, null, handler, af);
        c = af;
        j = -1L;
    }

    static af a(ab ab1)
    {
        return ab1.c;
    }

    private void a(MediaCodec mediacodec, int i1)
    {
        com.google.android.exoplayer.e.j.a("renderVideoBuffer");
        mediacodec.releaseOutputBuffer(i1, true);
        com.google.android.exoplayer.e.j.a();
        mediacodec = a;
        mediacodec.i = ((com.google.android.exoplayer.a) (mediacodec)).i + 1L;
        if (!h)
        {
            h = true;
            mediacodec = g;
            if (b != null && c != null)
            {
                b.post(new ad(this, mediacodec));
            }
        }
    }

    private void v()
    {
        if (b != null && c != null && l > 0)
        {
            long l1 = SystemClock.elapsedRealtime();
            int i1 = l;
            long l2 = k;
            l = 0;
            k = l1;
            b.post(new ae(this, i1, l1 - l2));
        }
    }

    public final void a(int i1, Object obj)
    {
        if (i1 == 1)
        {
            obj = (Surface)obj;
            if (g != obj)
            {
                g = ((Surface) (obj));
                h = false;
                i1 = p();
                if (i1 == 2 || i1 == 3)
                {
                    o();
                    l();
                }
            }
            return;
        } else
        {
            super.a(i1, obj);
            return;
        }
    }

    protected final void a(long l1)
    {
        super.a(l1);
        i = false;
        j = -1L;
    }

    protected final void a(long l1, boolean flag)
    {
        super.a(l1, flag);
        i = false;
        if (flag && d > 0L)
        {
            j = SystemClock.elapsedRealtime() * 1000L + d;
        }
    }

    protected final void a(MediaCodec mediacodec, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        mediacodec.configure(mediaformat, g, mediacrypto, 0);
        mediacodec.setVideoScalingMode(e);
    }

    protected final void a(MediaFormat mediaformat)
    {
        int i1 = mediaformat.getInteger("width");
        int j1 = mediaformat.getInteger("height");
        if (b != null && c != null)
        {
            b.post(new ac(this, i1, j1));
        }
    }

    protected final boolean a(long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, int i1)
    {
        l1 = bufferinfo.presentationTimeUs - l1;
        if (l1 < -30000L)
        {
            com.google.android.exoplayer.e.j.a("dropVideoBuffer");
            mediacodec.releaseOutputBuffer(i1, false);
            com.google.android.exoplayer.e.j.a();
            mediacodec = a;
            mediacodec.j = ((com.google.android.exoplayer.a) (mediacodec)).j + 1L;
            l = l + 1;
            if (l == f)
            {
                v();
            }
            return true;
        }
        if (!i)
        {
            a(mediacodec, i1);
            i = true;
            return true;
        }
        if (p() == 3 && l1 < 30000L)
        {
            if (l1 > 11000L)
            {
                try
                {
                    Thread.sleep((l1 - 10000L) / 1000L);
                }
                // Misplaced declaration of an exception variable
                catch (ByteBuffer bytebuffer)
                {
                    Thread.currentThread().interrupt();
                }
            }
            a(mediacodec, i1);
            return true;
        } else
        {
            return false;
        }
    }

    protected final boolean a(String s)
    {
        return com.google.android.exoplayer.e.k.b(s) && super.a(s);
    }

    protected final boolean a(boolean flag, ag ag1, ag ag2)
    {
        return ag2.a.equals("video/avc") && ag1.a.equals("video/avc") && flag || ag1.c == ag2.c && ag1.d == ag2.d;
    }

    protected final void g()
    {
        super.g();
        l = 0;
        k = SystemClock.elapsedRealtime();
    }

    protected final void h()
    {
        super.h();
        j = -1L;
        v();
    }

    protected final boolean j()
    {
        if (super.j() && (i || !n()))
        {
            j = -1L;
        } else
        {
            if (j == -1L)
            {
                return false;
            }
            if (SystemClock.elapsedRealtime() * 1000L >= j)
            {
                j = -1L;
                return false;
            }
        }
        return true;
    }

    protected final boolean m()
    {
        return super.m() && g != null;
    }
}
