// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// Referenced classes of package com.google.android.ads:
//            q, b, u, v

public abstract class r
    implements q
{

    protected DisplayMetrics a;
    protected u b;
    private v c;

    protected r(Context context, u u1, v v1)
    {
        b = u1;
        c = v1;
        try
        {
            a = context.getResources().getDisplayMetrics();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a = new DisplayMetrics();
        }
        a.density = 1.0F;
    }

    private String a(Context context, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a();
        b(context);
        s = b();
        this;
        JVM INSTR monitorexit ;
        try
        {
            if (s.length == 0)
            {
                return Integer.toString(5);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Integer.toString(7);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Integer.toString(7);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Integer.toString(3);
        }
        break MISSING_BLOCK_LABEL_40;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = s;
        if (s.length > 239)
        {
            a();
            a(20, 1L);
            context = b();
        }
        if (context.length >= 239)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        s = new byte[239 - context.length];
        (new SecureRandom()).nextBytes(s);
        context = ByteBuffer.allocate(240).put((byte)context.length).put(context).put(s).array();
_L1:
        s = MessageDigest.getInstance("MD5");
        s.update(context);
        s = s.digest();
        context = ByteBuffer.allocate(256).put(s).put(context).array();
        s = new byte[256];
        (new b()).a(context, s);
        if (true)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        throw new NullPointerException();
        return b.a(s, true);
        context = ByteBuffer.allocate(240).put((byte)context.length).put(context).array();
          goto _L1
    }

    private void a()
    {
        c.a();
    }

    private byte[] b()
    {
        return c.b();
    }

    public final String a(Context context)
    {
        return a(context, null, false);
    }

    protected final void a(int i, long l)
    {
        c.a(i, l);
    }

    protected final void a(int i, String s)
    {
        c.a(i, s);
    }

    protected abstract void b(Context context);
}
