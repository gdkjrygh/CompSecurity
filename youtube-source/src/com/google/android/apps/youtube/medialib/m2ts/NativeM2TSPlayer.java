// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.m2ts;

import com.google.android.apps.youtube.common.fromguava.c;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.google.android.apps.youtube.medialib.m2ts:
//            d

public class NativeM2TSPlayer
    implements d
{

    private final Queue a;
    private boolean b;
    private boolean c;
    private boolean d;

    public NativeM2TSPlayer()
    {
        if (!createPlayer())
        {
            throw new InitException();
        } else
        {
            c = false;
            a = new LinkedList();
            return;
        }
    }

    public static void a(float f1)
    {
        setVolumeLevel(f1);
    }

    private static native boolean createPlayer();

    private static native void enqueueBuffer(ByteBuffer bytebuffer, int i);

    private static native void enqueueEos();

    public static long f()
    {
        return (long)getPositionMillis() * 1000L;
    }

    private static native int getPositionMillis();

    private static native ByteBuffer getUnusedBuffer();

    private static native void setPlaybackState(boolean flag);

    private static native void setVolumeLevel(float f1);

    private static native void shutdown();

    public final void a(byte abyte0[])
    {
        a.add(abyte0);
    }

    public final boolean a()
    {
        if (a.size() == 0)
        {
            if (b)
            {
                enqueueEos();
                d = true;
            }
        } else
        {
            ByteBuffer bytebuffer = getUnusedBuffer();
            if (bytebuffer != null)
            {
                bytebuffer.clear();
                for (; a.size() > 0 && bytebuffer.position() + 188 <= bytebuffer.capacity(); bytebuffer.put((byte[])a.remove())) { }
                enqueueBuffer(bytebuffer, bytebuffer.position());
                return true;
            }
        }
        return false;
    }

    public final void b()
    {
        b = true;
    }

    public final void c()
    {
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        setPlaybackState(true);
    }

    public final void d()
    {
        boolean flag;
        if (!c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        setPlaybackState(false);
    }

    public final void e()
    {
        if (!c)
        {
            c = true;
            setPlaybackState(false);
            shutdown();
        }
    }

    public final boolean g()
    {
        return d;
    }

    static 
    {
        System.loadLibrary("m2ts_player");
    }

    private class InitException extends Exception
    {

        public InitException()
        {
        }
    }

}
