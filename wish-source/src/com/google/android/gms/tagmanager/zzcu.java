// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzct, zzbl, zzbg, zzas, 
//            zzby, zzau, zzav

class zzcu extends zzct
{

    private static zzcu zzaFA;
    private static final Object zzaFp = new Object();
    private boolean connected;
    private Handler handler;
    private Context zzaFq;
    private zzau zzaFr;
    private volatile zzas zzaFs;
    private int zzaFt;
    private boolean zzaFu;
    private boolean zzaFv;
    private boolean zzaFw;
    private zzav zzaFx;
    private zzbl zzaFy;
    private boolean zzaFz;

    private zzcu()
    {
        zzaFt = 0x1b7740;
        zzaFu = true;
        zzaFv = false;
        connected = true;
        zzaFw = true;
        zzaFx = new zzav() {

            final zzcu zzaFB;

            public void zzai(boolean flag)
            {
                zzaFB.zzd(flag, zzcu.zza(zzaFB));
            }

            
            {
                zzaFB = zzcu.this;
                super();
            }
        };
        zzaFz = false;
    }

    static boolean zza(zzcu zzcu1)
    {
        return zzcu1.connected;
    }

    static int zzb(zzcu zzcu1)
    {
        return zzcu1.zzaFt;
    }

    static boolean zzc(zzcu zzcu1)
    {
        return zzcu1.zzaFz;
    }

    static Handler zzd(zzcu zzcu1)
    {
        return zzcu1.handler;
    }

    static zzau zze(zzcu zzcu1)
    {
        return zzcu1.zzaFr;
    }

    public static zzcu zzxD()
    {
        if (zzaFA == null)
        {
            zzaFA = new zzcu();
        }
        return zzaFA;
    }

    private void zzxE()
    {
        zzaFy = new zzbl(this);
        zzaFy.zzar(zzaFq);
    }

    private void zzxF()
    {
        handler = new Handler(zzaFq.getMainLooper(), new android.os.Handler.Callback() {

            final zzcu zzaFB;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && zzcu.zzxH().equals(message.obj))
                {
                    zzaFB.dispatch();
                    if (zzcu.zzb(zzaFB) > 0 && !zzcu.zzc(zzaFB))
                    {
                        zzcu.zzd(zzaFB).sendMessageDelayed(zzcu.zzd(zzaFB).obtainMessage(1, zzcu.zzxH()), zzcu.zzb(zzaFB));
                    }
                }
                return true;
            }

            
            {
                zzaFB = zzcu.this;
                super();
            }
        });
        if (zzaFt > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, zzaFp), zzaFt);
        }
    }

    static Object zzxH()
    {
        return zzaFp;
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaFv) goto _L2; else goto _L1
_L1:
        zzbg.zzam("Dispatch call queued. Dispatch will run once initialization is complete.");
        zzaFu = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaFs.zzf(new Runnable() {

            final zzcu zzaFB;

            public void run()
            {
                zzcu.zze(zzaFB).dispatch();
            }

            
            {
                zzaFB = zzcu.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void zza(Context context, zzas zzas1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = zzaFq;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaFq = context.getApplicationContext();
        if (zzaFs == null)
        {
            zzaFs = zzas1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    void zzaj(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zzd(zzaFz, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void zzd(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaFz != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = connected;
        if (flag2 != flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag && flag1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (zzaFt > 0)
        {
            handler.removeMessages(1, zzaFp);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (zzaFt > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, zzaFp), zzaFt);
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        zzbg.zzam(stringbuilder.append(((String) (obj))).toString());
        zzaFz = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void zzgA()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzaFz && connected && zzaFt > 0)
        {
            handler.removeMessages(1, zzaFp);
            handler.sendMessage(handler.obtainMessage(1, zzaFp));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    zzau zzxG()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaFr != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (zzaFq == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        zzaFr = new zzby(zzaFx, zzaFq);
        zzau zzau;
        if (handler == null)
        {
            zzxF();
        }
        zzaFv = true;
        if (zzaFu)
        {
            dispatch();
            zzaFu = false;
        }
        if (zzaFy == null && zzaFw)
        {
            zzxE();
        }
        zzau = zzaFr;
        this;
        JVM INSTR monitorexit ;
        return zzau;
    }

}
