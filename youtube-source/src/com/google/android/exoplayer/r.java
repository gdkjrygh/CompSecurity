// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.os.Handler;
import com.google.android.exoplayer.c.a;
import com.google.android.exoplayer.e.k;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer:
//            w, u, v, s, 
//            a, t, ai, z

public final class r extends w
{

    private long A;
    private float B;
    private byte C[];
    private int D;
    private int E;
    private final ConditionVariable c;
    private final t d;
    private final long e[];
    private int f;
    private int g;
    private long h;
    private long i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private AudioTrack s;
    private Method t;
    private int u;
    private long v;
    private boolean w;
    private long x;
    private long y;
    private long z;

    public r(ai ai, a a1)
    {
        this(ai, null, null, null);
    }

    private r(ai ai, a a1, Handler handler, z z1)
    {
        super(ai, a1, null, null);
        c = new ConditionVariable(true);
        if (k.a >= 19)
        {
            d = new u();
        } else
        {
            d = new v((byte)0);
        }
        if (k.a >= 18)
        {
            try
            {
                t = android/media/AudioTrack.getMethod("getLatency", null);
            }
            // Misplaced declaration of an exception variable
            catch (ai ai) { }
        }
        e = new long[10];
        B = 1.0F;
    }

    static ConditionVariable a(r r1)
    {
        return r1.c;
    }

    private long c(long l1)
    {
        return (0xf4240L * l1) / (long)n;
    }

    private void v()
    {
        if (s != null)
        {
            v = 0L;
            E = 0;
            l = 0L;
            m = 0L;
            x = 0L;
            w = false;
            w();
            if (s.getPlayState() == 3)
            {
                s.pause();
            }
            AudioTrack audiotrack = s;
            s = null;
            c.close();
            (new s(this, audiotrack)).start();
        }
    }

    private void w()
    {
        h = 0L;
        g = 0;
        f = 0;
        i = 0L;
        j = false;
        k = 0L;
    }

    private long x()
    {
        return c(y());
    }

    private long y()
    {
        long l1 = 0xffffffffL & (long)s.getPlaybackHeadPosition();
        if (l > l1)
        {
            m = m + 1L;
        }
        l = l1;
        return l1 + (m << 32);
    }

    private int z()
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return (int)(v / (long)o - y());
        }
    }

    public final void a(int i1, Object obj)
    {
        if (i1 == 1)
        {
            float f1 = ((Float)obj).floatValue();
            B = f1;
            if (s != null)
            {
                s.setStereoVolume(f1, f1);
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
        v();
        z = 0L;
    }

    protected final void a(long l1, boolean flag)
    {
        super.a(l1, flag);
        z = 0L;
    }

    protected final void a(MediaFormat mediaformat)
    {
        int j1;
        v();
        n = mediaformat.getInteger("sample-rate");
        j1 = mediaformat.getInteger("channel-count");
        j1;
        JVM INSTR tableswitch 1 6: default 60
    //                   1 84
    //                   2 122
    //                   3 60
    //                   4 60
    //                   5 60
    //                   6 128;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unsupported channel count: ")).append(j1).toString());
_L2:
        int i1 = 4;
_L6:
        p = i1;
        q = AudioTrack.getMinBufferSize(n, i1, 2);
        r = q * 4;
        o = j1 * 2;
        return;
_L3:
        i1 = 12;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 252;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final boolean a(long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, int i1)
    {
        if (!w)
        {
            x = Math.max(0L, bufferinfo.presentationTimeUs - c(bufferinfo.size / o));
            w = true;
        }
        if (E == 0)
        {
            if (C == null || C.length < bufferinfo.size)
            {
                C = new byte[bufferinfo.size];
            }
            bytebuffer.position(bufferinfo.offset);
            bytebuffer.get(C, 0, bufferinfo.size);
            D = 0;
            E = bufferinfo.size;
        }
        if (s == null)
        {
            c.block();
            int k1;
            if (u == 0)
            {
                s = new AudioTrack(3, n, p, 2, r, 1);
                u = s.getAudioSessionId();
                int j1 = u;
            } else
            {
                s = new AudioTrack(3, n, p, 2, r, 1, u);
            }
            s.setStereoVolume(B, B);
            if (p() == 3)
            {
                y = System.nanoTime() / 1000L;
                s.play();
            }
        }
        k1 = (int)(v - y() * (long)o);
        k1 = r - k1;
        if (k1 > 0)
        {
            k1 = Math.min(E, k1);
            s.write(C, D, k1);
            D = D + k1;
            E = E - k1;
            v = v + (long)k1;
            if (E == 0)
            {
                mediacodec.releaseOutputBuffer(i1, false);
                mediacodec = a;
                mediacodec.i = ((com.google.android.exoplayer.a) (mediacodec)).i + 1L;
                return true;
            }
        }
        return false;
    }

    protected final boolean a(String s1)
    {
        return com.google.android.exoplayer.e.k.a(s1) && super.a(s1);
    }

    protected final void b()
    {
        super.b();
        v();
        u = 0;
    }

    protected final void b(long l1)
    {
        super.b(l1);
        if (s != null && w && p() == 3)
        {
            if ((l1 = x()) != 0L)
            {
                long l2 = System.nanoTime() / 1000L;
                if (l2 - i >= 30000L)
                {
                    e[f] = l1 - l2;
                    f = (f + 1) % 10;
                    if (g < 10)
                    {
                        g = g + 1;
                    }
                    i = l2;
                    h = 0L;
                    for (int i1 = 0; i1 < g; i1++)
                    {
                        h = h + e[i1] / (long)g;
                    }

                }
                if (l2 - k >= 0x7a120L)
                {
                    j = d.a(s);
                    if (j && d.a() / 1000L < y)
                    {
                        j = false;
                    }
                    if (t != null)
                    {
                        try
                        {
                            A = (long)((Integer)t.invoke(s, null)).intValue() * 1000L - c(r / o);
                            A = Math.max(A, 0L);
                        }
                        catch (Exception exception)
                        {
                            t = null;
                        }
                    }
                    k = l2;
                    return;
                }
            }
        }
    }

    protected final long d()
    {
        long l1 = System.nanoTime() / 1000L;
        if (s != null && w) goto _L2; else goto _L1
_L1:
        l1 = super.d();
_L4:
        l1 = Math.max(z, l1);
        z = l1;
        return l1;
_L2:
        if (j)
        {
            l1 = c(((l1 - d.a() / 1000L) * (long)n) / 0xf4240L + d.b()) + x;
        } else
        {
            long l2;
            if (g == 0)
            {
                l2 = x() + x;
            } else
            {
                l2 = l1 + h + x;
            }
            l1 = l2;
            if (!i())
            {
                l1 = l2 - A;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void g()
    {
        super.g();
        if (s != null)
        {
            y = System.nanoTime() / 1000L;
            s.play();
        }
    }

    protected final void h()
    {
        super.h();
        if (s != null)
        {
            w();
            s.pause();
        }
    }

    protected final boolean i()
    {
        return super.i() && (z() == 0 || v < (long)q);
    }

    protected final boolean j()
    {
        return z() > 0;
    }

    protected final boolean k()
    {
        return true;
    }
}
