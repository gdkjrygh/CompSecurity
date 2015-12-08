// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            zzaj, zzaq, zzai, zzap, 
//            zzre

public abstract class zzak
    implements zzaj
{

    protected MotionEvent zzmR;
    protected DisplayMetrics zzmS;
    protected zzap zzmT;
    private zzaq zzmU;

    protected zzak(Context context, zzap zzap1, zzaq zzaq1)
    {
        zzmT = zzap1;
        zzmU = zzaq1;
        try
        {
            zzmS = context.getResources().getDisplayMetrics();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzmS = new DisplayMetrics();
        }
        zzmS.density = 1.0F;
    }

    private void zzS()
    {
        zzmU.reset();
    }

    private byte[] zzT()
        throws IOException
    {
        return zzmU.zzac();
    }

    private String zza(Context context, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zzS();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        zzd(context);
_L1:
        context = zzT();
        this;
        JVM INSTR monitorexit ;
        if (context.length != 0)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        context = Integer.toString(5);
        return context;
        zzc(context);
          goto _L1
        context;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
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
        context = zza(((byte []) (context)), s);
        return context;
    }

    public String zza(Context context, String s)
    {
        return zza(context, s, true);
    }

    String zza(byte abyte0[], String s)
        throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException
    {
        byte abyte1[] = abyte0;
        if (abyte0.length > 239)
        {
            zzS();
            zza(20, 1L);
            abyte1 = zzT();
        }
        if (abyte1.length < 239)
        {
            abyte0 = new byte[239 - abyte1.length];
            (new SecureRandom()).nextBytes(abyte0);
            abyte0 = ByteBuffer.allocate(240).put((byte)abyte1.length).put(abyte1).put(abyte0).array();
        } else
        {
            abyte0 = ByteBuffer.allocate(240).put((byte)abyte1.length).put(abyte1).array();
        }
        abyte1 = MessageDigest.getInstance("MD5");
        abyte1.update(abyte0);
        abyte1 = abyte1.digest();
        abyte0 = ByteBuffer.allocate(256).put(abyte1).put(abyte0).array();
        abyte1 = new byte[256];
        (new zzai()).zzb(abyte0, abyte1);
        if (s != null && s.length() > 0)
        {
            zza(s, abyte1);
        }
        return zzmT.zza(abyte1, true);
    }

    public void zza(int i, int j, int k)
    {
        if (zzmR != null)
        {
            zzmR.recycle();
        }
        zzmR = MotionEvent.obtain(0L, k, 1, (float)i * zzmS.density, (float)j * zzmS.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    }

    protected void zza(int i, long l)
        throws IOException
    {
        zzmU.zzb(i, l);
    }

    protected void zza(int i, String s)
        throws IOException
    {
        zzmU.zzb(i, s);
    }

    public void zza(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            if (zzmR != null)
            {
                zzmR.recycle();
            }
            zzmR = MotionEvent.obtain(motionevent);
        }
    }

    void zza(String s, byte abyte0[])
        throws UnsupportedEncodingException
    {
        String s1 = s;
        if (s.length() > 32)
        {
            s1 = s.substring(0, 32);
        }
        (new zzre(s1.getBytes("UTF-8"))).zzy(abyte0);
    }

    public String zzb(Context context)
    {
        return zza(context, ((String) (null)), false);
    }

    protected abstract void zzc(Context context);

    protected abstract void zzd(Context context);

    protected String zzk(String s)
    {
        Object obj = s;
        if (s != null)
        {
            obj = s;
            if (s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"))
            {
                s = UUID.fromString(s);
                obj = new byte[16];
                ByteBuffer bytebuffer = ByteBuffer.wrap(((byte []) (obj)));
                bytebuffer.putLong(s.getMostSignificantBits());
                bytebuffer.putLong(s.getLeastSignificantBits());
                obj = zzmT.zza(((byte []) (obj)), true);
            }
        }
        return ((String) (obj));
    }
}
