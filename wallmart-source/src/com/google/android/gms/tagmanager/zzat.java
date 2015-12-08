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

    private static zzat zzaQj;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean zzMT;
    private final LinkedBlockingQueue zzaQi = new LinkedBlockingQueue();
    private volatile zzau zzaQk;

    private zzat(Context context)
    {
        super("GAThread");
        zzMT = false;
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
        return zzat1.zzaQk;
    }

    static zzau zza(zzat zzat1, zzau zzau)
    {
        zzat1.zzaQk = zzau;
        return zzau;
    }

    static zzat zzaO(Context context)
    {
        if (zzaQj == null)
        {
            zzaQj = new zzat(context);
        }
        return zzaQj;
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
        Runnable runnable = (Runnable)zzaQi.take();
        if (!zzMT)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        try
        {
            zzbg.zzaD(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            zzbg.e((new StringBuilder()).append("Error on Google TagManager Thread: ").append(zzd(throwable)).toString());
            zzbg.e("Google TagManager is shutting down.");
            zzMT = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void zzeL(String s)
    {
        zzh(s, System.currentTimeMillis());
    }

    public void zzg(Runnable runnable)
    {
        zzaQi.add(runnable);
    }

    void zzh(String s, long l)
    {
        zzg(new Runnable(this, l, s) {

            final zzas zzaQl;
            final long zzaQm;
            final zzat zzaQn;
            final String zzxv;

            public void run()
            {
                if (zzat.zza(zzaQn) == null)
                {
                    zzcu zzcu1 = zzcu.zzAP();
                    zzcu1.zza(zzat.zzb(zzaQn), zzaQl);
                    zzat.zza(zzaQn, zzcu1.zzAS());
                }
                zzat.zza(zzaQn).zzg(zzaQm, zzxv);
            }

            
            {
                zzaQn = zzat.this;
                zzaQl = zzas1;
                zzaQm = l;
                zzxv = s;
                super();
            }
        });
    }
}
