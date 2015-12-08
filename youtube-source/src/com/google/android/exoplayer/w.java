// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.e.a;
import com.google.android.exoplayer.e.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer:
//            ak, a, ah, l, 
//            y, ag, ai, ExoPlaybackException, 
//            b, aj, aa, c, 
//            DecoderInitializationException, x, z

public abstract class w extends ak
{

    private long A;
    public final com.google.android.exoplayer.a a = new com.google.android.exoplayer.a();
    protected final Handler b;
    private final com.google.android.exoplayer.c.a c;
    private final ai d;
    private final ah e = new ah(false);
    private final l f = new l();
    private final HashSet g = new HashSet();
    private final android.media.MediaCodec.BufferInfo h = new android.media.MediaCodec.BufferInfo();
    private final z i;
    private ag j;
    private Map k;
    private MediaCodec l;
    private boolean m;
    private ByteBuffer n[];
    private ByteBuffer o[];
    private long p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public w(ai ai1, com.google.android.exoplayer.c.a a1, Handler handler, z z1)
    {
        boolean flag;
        if (k.a >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.exoplayer.e.a.b(flag);
        d = ai1;
        c = a1;
        b = handler;
        i = z1;
    }

    static z a(w w1)
    {
        return w1.i;
    }

    private void a(android.media.MediaCodec.CryptoException cryptoexception)
    {
        if (b != null && i != null)
        {
            b.post(new y(this, cryptoexception));
        }
    }

    private void a(l l1)
    {
        ag ag1 = j;
        j = l1.a;
        k = l1.b;
        if (l != null)
        {
            l1 = l;
            if (a(m, ag1, j))
            {
                t = true;
                u = 1;
                return;
            }
        }
        o();
        l();
    }

    private boolean v()
    {
        if (!w) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (q >= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        q = l.dequeueInputBuffer(0L);
        if (q < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        e.c = n[q];
        e.c.clear();
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        int i1;
        if (y)
        {
            i1 = -3;
        } else
        {
            if (u == 1)
            {
                for (i1 = 0; i1 < j.g.size(); i1++)
                {
                    byte abyte0[] = (byte[])j.g.get(i1);
                    e.c.put(abyte0);
                }

                u = 2;
            }
            i1 = d.a(v, A, f, e);
        }
        if (i1 == -2)
        {
            com.google.android.exoplayer.a a1 = a;
            a1.f = a1.f + 1L;
            return false;
        }
        if (i1 == -4)
        {
            if (u == 2)
            {
                e.c.clear();
                u = 1;
            }
            a(f);
            return true;
        }
        if (i1 == -1)
        {
            if (u == 2)
            {
                e.c.clear();
                u = 1;
            }
            w = true;
            try
            {
                l.queueInputBuffer(q, 0, 0, 0L, 4);
                q = -1;
                com.google.android.exoplayer.a a2 = a;
                a2.h = a2.h + 1L;
            }
            catch (android.media.MediaCodec.CryptoException cryptoexception)
            {
                a(cryptoexception);
                throw new ExoPlaybackException(cryptoexception);
            }
            return false;
        }
        if (z)
        {
            if ((e.e & 1) == 0)
            {
                e.c.clear();
                if (u == 2)
                {
                    u = 1;
                }
                return true;
            }
            z = false;
        }
        int j1;
        if ((e.e & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!s)
        {
            break MISSING_BLOCK_LABEL_676;
        }
        j1 = c.b();
        if (j1 == 0)
        {
            throw new ExoPlaybackException(c.e());
        }
        if (j1 == 4 || !flag && c.a())
        {
            break MISSING_BLOCK_LABEL_676;
        }
        flag1 = true;
_L8:
        y = flag1;
        if (y) goto _L1; else goto _L4
_L4:
        int k1;
        long l2;
        Object obj;
        int ai1[];
        int l1;
        try
        {
            k1 = e.c.position();
            l1 = k1 - e.d;
            l2 = e.f;
            if (e.g)
            {
                g.add(Long.valueOf(l2));
            }
        }
        catch (android.media.MediaCodec.CryptoException cryptoexception1)
        {
            a(cryptoexception1);
            throw new ExoPlaybackException(cryptoexception1);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_656;
        }
        obj = e.b.a();
        if (l1 != 0) goto _L6; else goto _L5
_L5:
        l.queueSecureInputBuffer(q, 0, ((android.media.MediaCodec.CryptoInfo) (obj)), l2, 0);
_L7:
        obj = a;
        obj.e = ((com.google.android.exoplayer.a) (obj)).e + 1L;
        if ((e.e & 1) != 0)
        {
            obj = a;
            obj.g = ((com.google.android.exoplayer.a) (obj)).g + 1L;
        }
        q = -1;
        u = 0;
        return true;
_L6:
        if (((android.media.MediaCodec.CryptoInfo) (obj)).numBytesOfClearData == null)
        {
            obj.numBytesOfClearData = new int[1];
        }
        ai1 = ((android.media.MediaCodec.CryptoInfo) (obj)).numBytesOfClearData;
        ai1[0] = l1 + ai1[0];
          goto _L5
        l.queueInputBuffer(q, 0, k1, l2, 0);
          goto _L7
        flag1 = false;
          goto _L8
    }

    protected final int a()
    {
        int i1;
        try
        {
            d.a();
        }
        catch (IOException ioexception)
        {
            throw new ExoPlaybackException(ioexception);
        }
        for (i1 = 0; i1 < d.b(); i1++)
        {
            if (a(d.a(0).a))
            {
                v = 0;
                return 1;
            }
        }

        return -1;
    }

    protected void a(long l1)
    {
        A = l1;
        if (!d.b(l1))
        {
            return;
        }
        if (l != null)
        {
            p = -1L;
            q = -1;
            r = -1;
            g.clear();
            if (k.a >= 18)
            {
                l.flush();
            } else
            {
                o();
                l();
            }
            if (t && j != null)
            {
                u = 1;
            }
        }
        w = false;
        x = false;
        y = false;
    }

    protected void a(long l1, boolean flag)
    {
        d.a(v, l1);
        w = false;
        x = false;
        y = false;
        A = l1;
    }

    protected void a(MediaCodec mediacodec, MediaFormat mediaformat, MediaCrypto mediacrypto)
    {
        mediacodec.configure(mediaformat, null, mediacrypto, 0);
    }

    protected void a(MediaFormat mediaformat)
    {
    }

    protected abstract boolean a(long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, int i1);

    protected boolean a(String s1)
    {
        return true;
    }

    protected boolean a(boolean flag, ag ag1, ag ag2)
    {
        return false;
    }

    protected void b()
    {
        o();
        j = null;
        k = null;
        if (s)
        {
            com.google.android.exoplayer.c.a a1 = c;
            s = false;
        }
        d.b(v);
    }

    protected void b(long l1)
    {
        d.a(l1);
        if (j != null) goto _L2; else goto _L1
_L1:
        if (d.a(v, A, f, e) == -4)
        {
            a(f);
            return;
        }
          goto _L3
_L2:
        if (l != null || m() || p() != 3) goto _L5; else goto _L4
_L4:
        e.c = null;
        int i1 = -3;
_L6:
        if (i1 != -3)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1;
        if (A > l1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = d.a(v, A, f, e);
        if (j1 == -3)
        {
            try
            {
                A = e.f;
                com.google.android.exoplayer.a a1 = a;
                a1.k = a1.k + 1L;
            }
            catch (IOException ioexception)
            {
                throw new ExoPlaybackException(ioexception);
            }
            i1 = j1;
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (j1 != -4)
        {
            continue; /* Loop/switch isn't completed */
        }
        a(f);
        i1 = j1;
        if (true) goto _L6; else goto _L3
_L5:
        if (l == null && m())
        {
            l();
        }
        if (l == null) goto _L3; else goto _L7
_L7:
        if (x) goto _L9; else goto _L8
_L8:
        if (r < 0)
        {
            r = l.dequeueOutputBuffer(h, 0L);
        }
        if (r != -2) goto _L11; else goto _L10
_L10:
        a(l.getOutputFormat());
        com.google.android.exoplayer.a a2 = a;
        a2.c = a2.c + 1L;
        boolean flag = true;
          goto _L12
_L21:
        while (v()) ;
        return;
_L11:
        if (r != -3) goto _L14; else goto _L13
_L13:
        o = l.getOutputBuffers();
        com.google.android.exoplayer.a a3 = a;
        a3.d = a3.d + 1L;
        flag = true;
          goto _L12
_L14:
        if (r < 0) goto _L9; else goto _L15
_L15:
        if ((h.flags & 4) == 0) goto _L17; else goto _L16
_L16:
        x = true;
          goto _L9
_L17:
        if (!g.remove(Long.valueOf(h.presentationTimeUs))) goto _L19; else goto _L18
_L18:
        l.releaseOutputBuffer(r, false);
        r = -1;
        flag = true;
          goto _L12
_L19:
        if (!a(l1, l, o[r], h, r)) goto _L9; else goto _L20
_L20:
        A = h.presentationTimeUs;
        r = -1;
        flag = true;
          goto _L12
_L3:
        return;
_L12:
        if (flag) goto _L7; else goto _L21
_L9:
        flag = false;
          goto _L12
    }

    protected final void c()
    {
        d.d();
    }

    protected long d()
    {
        return A;
    }

    protected final long e()
    {
        return d.a(v).b;
    }

    protected final long f()
    {
        long l1 = d.c();
        if (l1 == -1L || l1 == -3L)
        {
            return l1;
        } else
        {
            return Math.max(l1, d());
        }
    }

    protected void g()
    {
    }

    protected void h()
    {
    }

    protected boolean i()
    {
        return x;
    }

    protected boolean j()
    {
label0:
        {
            if (j == null || y)
            {
                break label0;
            }
            if ((l != null || m()) && r < 0 && q >= 0)
            {
                boolean flag;
                if (SystemClock.elapsedRealtime() < p + 1000L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    protected final void l()
    {
        if (m()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        String s1;
        boolean flag;
        s1 = j.a;
        obj = null;
        flag = false;
        if (k == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c == null)
        {
            throw new ExoPlaybackException("Media requires a DrmSessionManager");
        }
        if (!s)
        {
            obj = c;
            obj = k;
            s = true;
        }
        int i1 = c.b();
        if (i1 == 0)
        {
            throw new ExoPlaybackException(c.e());
        }
        if (i1 != 3 && i1 != 4)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = c.c();
        flag = c.d();
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        c c1 = com.google.android.exoplayer.aa.a(s1);
        s1 = c1.a;
        if (flag)
        {
            s1 = (new StringBuilder()).append(s1).append(".secure").toString();
        }
        m = c1.b;
        long l1;
        try
        {
            l = MediaCodec.createByCodecName(s1);
            a(l, j.a(), ((MediaCrypto) (obj)));
            l.start();
            n = l.getInputBuffers();
            o = l.getOutputBuffers();
        }
        catch (Exception exception)
        {
            DecoderInitializationException decoderinitializationexception = new DecoderInitializationException(s1, exception);
            if (b != null && i != null)
            {
                b.post(new x(this, decoderinitializationexception));
            }
            throw new ExoPlaybackException(decoderinitializationexception);
        }
        if (p() == 3)
        {
            l1 = SystemClock.elapsedRealtime();
        } else
        {
            l1 = -1L;
        }
        p = l1;
        q = -1;
        r = -1;
        z = true;
        obj = a;
        obj.a = ((com.google.android.exoplayer.a) (obj)).a + 1L;
        return;
    }

    protected boolean m()
    {
        return l == null && j != null;
    }

    protected final boolean n()
    {
        return l != null;
    }

    protected final void o()
    {
        if (l != null)
        {
            p = -1L;
            q = -1;
            r = -1;
            g.clear();
            n = null;
            o = null;
            l.stop();
            l.release();
            l = null;
            t = false;
            m = false;
            u = 0;
            com.google.android.exoplayer.a a1 = a;
            a1.b = a1.b + 1L;
        }
    }
}
