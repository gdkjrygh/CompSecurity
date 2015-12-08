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

    private static zzat zzaDB;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean zzGY;
    private final LinkedBlockingQueue zzaDA = new LinkedBlockingQueue();
    private volatile zzau zzaDC;

    private zzat(Context context)
    {
        super("GAThread");
        zzGY = false;
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
        return zzat1.zzaDC;
    }

    static zzau zza(zzat zzat1, zzau zzau)
    {
        zzat1.zzaDC = zzau;
        return zzau;
    }

    static zzat zzaq(Context context)
    {
        if (zzaDB == null)
        {
            zzaDB = new zzat(context);
        }
        return zzaDB;
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
        Runnable runnable = (Runnable)zzaDA.take();
        if (!zzGY)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        try
        {
            zzbg.zzal(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            zzbg.zzak((new StringBuilder()).append("Error on Google TagManager Thread: ").append(zzd(throwable)).toString());
            zzbg.zzak("Google TagManager is shutting down.");
            zzGY = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void zzdO(String s)
    {
        zzf(s, System.currentTimeMillis());
    }

    public void zzf(Runnable runnable)
    {
        zzaDA.add(runnable);
    }

    void zzf(String s, long l)
    {
        zzf(new Runnable(this, l, s) {

            final zzas zzaDD;
            final long zzaDE;
            final zzat zzaDF;
            final String zztT;

            public void run()
            {
                if (zzat.zza(zzaDF) == null)
                {
                    zzcu zzcu1 = zzcu.zzxD();
                    zzcu1.zza(zzat.zzb(zzaDF), zzaDD);
                    zzat.zza(zzaDF, zzcu1.zzxG());
                }
                zzat.zza(zzaDF).zzg(zzaDE, zztT);
            }

            
            {
                zzaDF = zzat.this;
                zzaDD = zzas1;
                zzaDE = l;
                zztT = s;
                super();
            }
        });
    }
}
