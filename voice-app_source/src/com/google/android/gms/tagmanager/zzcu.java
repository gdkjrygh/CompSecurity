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

    private static final Object zzaND = new Object();
    private static zzcu zzaNO;
    private boolean connected;
    private Handler handler;
    private Context zzaNE;
    private zzau zzaNF;
    private volatile zzas zzaNG;
    private int zzaNH;
    private boolean zzaNI;
    private boolean zzaNJ;
    private boolean zzaNK;
    private zzav zzaNL;
    private zzbl zzaNM;
    private boolean zzaNN;

    private zzcu()
    {
        zzaNH = 0x1b7740;
        zzaNI = true;
        zzaNJ = false;
        connected = true;
        zzaNK = true;
        zzaNL = new zzav() {

            final zzcu zzaNP;

            public void zzan(boolean flag)
            {
                zzaNP.zzd(flag, zzcu.zza(zzaNP));
            }

            
            {
                zzaNP = zzcu.this;
                super();
            }
        };
        zzaNN = false;
    }

    static boolean zza(zzcu zzcu1)
    {
        return zzcu1.connected;
    }

    static int zzb(zzcu zzcu1)
    {
        return zzcu1.zzaNH;
    }

    static boolean zzc(zzcu zzcu1)
    {
        return zzcu1.zzaNN;
    }

    static Handler zzd(zzcu zzcu1)
    {
        return zzcu1.handler;
    }

    static zzau zze(zzcu zzcu1)
    {
        return zzcu1.zzaNF;
    }

    private void zzzA()
    {
        zzaNM = new zzbl(this);
        zzaNM.zzaI(zzaNE);
    }

    private void zzzB()
    {
        handler = new Handler(zzaNE.getMainLooper(), new android.os.Handler.Callback() {

            final zzcu zzaNP;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && zzcu.zzzD().equals(message.obj))
                {
                    zzaNP.dispatch();
                    if (zzcu.zzb(zzaNP) > 0 && !zzcu.zzc(zzaNP))
                    {
                        zzcu.zzd(zzaNP).sendMessageDelayed(zzcu.zzd(zzaNP).obtainMessage(1, zzcu.zzzD()), zzcu.zzb(zzaNP));
                    }
                }
                return true;
            }

            
            {
                zzaNP = zzcu.this;
                super();
            }
        });
        if (zzaNH > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, zzaND), zzaNH);
        }
    }

    static Object zzzD()
    {
        return zzaND;
    }

    public static zzcu zzzz()
    {
        if (zzaNO == null)
        {
            zzaNO = new zzcu();
        }
        return zzaNO;
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaNJ) goto _L2; else goto _L1
_L1:
        zzbg.zzaB("Dispatch call queued. Dispatch will run once initialization is complete.");
        zzaNI = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaNG.zzf(new Runnable() {

            final zzcu zzaNP;

            public void run()
            {
                zzcu.zze(zzaNP).dispatch();
            }

            
            {
                zzaNP = zzcu.this;
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
        Context context1 = zzaNE;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaNE = context.getApplicationContext();
        if (zzaNG == null)
        {
            zzaNG = zzas1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    void zzao(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zzd(zzaNN, flag);
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
        if (zzaNN != flag) goto _L2; else goto _L1
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
        if (zzaNH > 0)
        {
            handler.removeMessages(1, zzaND);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (zzaNH > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, zzaND), zzaNH);
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
        zzbg.zzaB(stringbuilder.append(((String) (obj))).toString());
        zzaNN = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void zzhK()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzaNN && connected && zzaNH > 0)
        {
            handler.removeMessages(1, zzaND);
            handler.sendMessage(handler.obtainMessage(1, zzaND));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    zzau zzzC()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaNF != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (zzaNE == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        zzaNF = new zzby(zzaNL, zzaNE);
        zzau zzau;
        if (handler == null)
        {
            zzzB();
        }
        zzaNJ = true;
        if (zzaNI)
        {
            dispatch();
            zzaNI = false;
        }
        if (zzaNM == null && zzaNK)
        {
            zzzA();
        }
        zzau = zzaNF;
        this;
        JVM INSTR monitorexit ;
        return zzau;
    }

}
