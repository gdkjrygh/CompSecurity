// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.os.Handler;
import com.google.android.apps.youtube.medialib.player.n;
import com.google.android.apps.youtube.medialib.player.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            j, aq

public final class TvWidevineMediaPlayer extends j
{

    public static final Set b;
    private final Handler c;
    private final Runnable d;
    private o e;
    private int f;
    private int g;
    private State h;
    private boolean i;

    static int a(TvWidevineMediaPlayer tvwidevinemediaplayer, int k)
    {
        tvwidevinemediaplayer.g = -1;
        return -1;
    }

    public final void a(int k)
    {
        g = k;
        if (i || h != State.PLAYING)
        {
            f = k;
            return;
        } else
        {
            f = 0;
            i = true;
            super.a(k);
            return;
        }
    }

    public final void a(n n)
    {
        i = false;
        if (f != 0)
        {
            a(f);
        } else
        {
            c.postDelayed(new aq(this), 500L);
        }
        if (h != State.PAUSED) goto _L2; else goto _L1
_L1:
        super.b();
        super.c();
_L4:
        super.a(n);
        return;
_L2:
        if (h == State.PLAYING)
        {
            super.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(o o)
    {
        super.a(o);
        e = o;
    }

    public final boolean a(n n, int k, int l)
    {
        k;
        JVM INSTR tableswitch 753 754: default 24
    //                   753 34
    //                   754 102;
           goto _L1 _L2 _L3
_L1:
        super.a(n, k, l);
        return false;
_L2:
        long l1 = f() - e();
        if (h == State.PLAYING && l1 > 60000L)
        {
            super.c();
            super.a(n, 701, -1);
            i = true;
        }
        c.postDelayed(d, 20000L);
        continue; /* Loop/switch isn't completed */
_L3:
        c.removeCallbacks(d);
        i = false;
        if (h == State.PLAYING)
        {
            super.b();
            super.a(n, 702, -1);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void b()
    {
        if (!i)
        {
            super.b();
            h = State.PLAYING;
            if (f != 0)
            {
                a(f);
                return;
            }
        }
    }

    public final void c()
    {
        if (i)
        {
            return;
        } else
        {
            super.c();
            h = State.PAUSED;
            return;
        }
    }

    public final void d()
    {
        c.removeCallbacks(d);
        super.d();
        h = State.IDLE;
    }

    public final int e()
    {
        if (g >= 0)
        {
            return g;
        } else
        {
            return super.e();
        }
    }

    public final Set h()
    {
        return b;
    }

    static 
    {
        HashSet hashset = new HashSet();
        hashset.add("video/wvm");
        b = Collections.unmodifiableSet(hashset);
    }

    private class State extends Enum
    {

        private static final State $VALUES[];
        public static final State IDLE;
        public static final State PAUSED;
        public static final State PLAYING;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/android/apps/youtube/core/player/TvWidevineMediaPlayer$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            IDLE = new State("IDLE", 0);
            PLAYING = new State("PLAYING", 1);
            PAUSED = new State("PAUSED", 2);
            $VALUES = (new State[] {
                IDLE, PLAYING, PAUSED
            });
        }

        private State(String s, int k)
        {
            super(s, k);
        }
    }

}
