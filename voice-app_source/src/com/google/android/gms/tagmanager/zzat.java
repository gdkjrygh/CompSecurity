// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzas, zzbg, zzau, zzcu

class zzat extends Thread
    implements zzas
{

    private static zzat zzaLP;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean zzKU;
    private final LinkedBlockingQueue zzaLO = new LinkedBlockingQueue();
    private volatile zzau zzaLQ;

    private zzat(Context context)
    {
        super("GAThread");
        zzKU = false;
        mClosed = false;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        start();
    }

    static zzau zza(zzat zzat1)
    {
        return zzat1.zzaLQ;
    }

    static zzau zza(zzat zzat1, zzau zzau)
    {
        zzat1.zzaLQ = zzau;
        return zzau;
    }

    static zzat zzaH(Context context)
    {
        if (zzaLP == null)
        {
            zzaLP = new zzat(context);
        }
        return zzaLP;
    }

    static Context zzb(zzat zzat1)
    {
        return zzat1.mContext;
    }

    private String zzd(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    public void run()
    {
_L2:
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        Runnable runnable = (Runnable)zzaLO.take();
        if (!zzKU)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        try
        {
            zzbg.zzaA(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            zzbg.zzaz((new StringBuilder()).append("Error on Google TagManager Thread: ").append(zzd(throwable)).toString());
            zzbg.zzaz("Google TagManager is shutting down.");
            zzKU = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void zzew(String s)
    {
        zzh(s, System.currentTimeMillis());
    }

    public void zzf(Runnable runnable)
    {
        zzaLO.add(runnable);
    }

    void zzh(String s, long l)
    {
        zzf(new Runnable(this, l, s) {

            final zzas zzaLR;
            final long zzaLS;
            final zzat zzaLT;
            final String zzwJ;

            public void run()
            {
                if (zzat.zza(zzaLT) == null)
                {
                    zzcu zzcu1 = zzcu.zzzz();
                    zzcu1.zza(zzat.zzb(zzaLT), zzaLR);
                    zzat.zza(zzaLT, zzcu1.zzzC());
                }
                zzat.zza(zzaLT).zzg(zzaLS, zzwJ);
            }

            
            {
                zzaLT = zzat.this;
                zzaLR = zzas1;
                zzaLS = l;
                zzwJ = s;
                super();
            }
        });
    }
}
