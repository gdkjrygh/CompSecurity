// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.IOException;

// Referenced classes of package com.whatsapp.util:
//            s, OpusPlayer

class u extends s
{

    private OpusPlayer a;

    public u(String s1)
    {
        a = new OpusPlayer(s1);
    }

    public int a()
    {
        long l;
        try
        {
            l = a.getLength();
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return (int)l;
    }

    public void a(int j)
    {
    }

    public void a(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
    }

    public void a(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
    }

    public int b()
    {
        long l;
        try
        {
            l = a.getCurrentPosition();
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return (int)l;
    }

    public void b(int j)
    {
        try
        {
            a.seek(j);
            return;
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
    }

    public void c()
    {
        a.prepare();
    }

    public void d()
    {
        a.close();
    }

    public int e()
    {
        return 0;
    }

    public boolean f()
    {
        boolean flag;
        try
        {
            flag = a.isPlaying();
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return flag;
    }

    public void g()
    {
        try
        {
            a.stop();
            return;
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
    }

    public void h()
    {
        try
        {
            a.pause();
            return;
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
    }

    public void i()
    {
        try
        {
            a.start();
            return;
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
    }
}
