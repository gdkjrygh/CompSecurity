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

    private static final Object zzaRX = new Object();
    private static zzcu zzaSi;
    private boolean connected;
    private Handler handler;
    private Context zzaRY;
    private zzau zzaRZ;
    private volatile zzas zzaSa;
    private int zzaSb;
    private boolean zzaSc;
    private boolean zzaSd;
    private boolean zzaSe;
    private zzav zzaSf;
    private zzbl zzaSg;
    private boolean zzaSh;

    private zzcu()
    {
        zzaSb = 0x1b7740;
        zzaSc = true;
        zzaSd = false;
        connected = true;
        zzaSe = true;
        zzaSf = new zzav() {

            final zzcu zzaSj;

            public void zzas(boolean flag)
            {
                zzaSj.zzd(flag, zzcu.zza(zzaSj));
            }

            
            {
                zzaSj = zzcu.this;
                super();
            }
        };
        zzaSh = false;
    }

    public static zzcu zzAP()
    {
        if (zzaSi == null)
        {
            zzaSi = new zzcu();
        }
        return zzaSi;
    }

    private void zzAQ()
    {
        zzaSg = new zzbl(this);
        zzaSg.zzaP(zzaRY);
    }

    private void zzAR()
    {
        handler = new Handler(zzaRY.getMainLooper(), new android.os.Handler.Callback() {

            final zzcu zzaSj;

            public boolean handleMessage(Message message)
            {
                if (1 == message.what && zzcu.zzAT().equals(message.obj))
                {
                    zzaSj.dispatch();
                    if (zzcu.zzb(zzaSj) > 0 && !zzcu.zzc(zzaSj))
                    {
                        zzcu.zzd(zzaSj).sendMessageDelayed(zzcu.zzd(zzaSj).obtainMessage(1, zzcu.zzAT()), zzcu.zzb(zzaSj));
                    }
                }
                return true;
            }

            
            {
                zzaSj = zzcu.this;
                super();
            }
        });
        if (zzaSb > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, zzaRX), zzaSb);
        }
    }

    static Object zzAT()
    {
        return zzaRX;
    }

    static boolean zza(zzcu zzcu1)
    {
        return zzcu1.connected;
    }

    static int zzb(zzcu zzcu1)
    {
        return zzcu1.zzaSb;
    }

    static boolean zzc(zzcu zzcu1)
    {
        return zzcu1.zzaSh;
    }

    static Handler zzd(zzcu zzcu1)
    {
        return zzcu1.handler;
    }

    static zzau zze(zzcu zzcu1)
    {
        return zzcu1.zzaRZ;
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaSd) goto _L2; else goto _L1
_L1:
        zzbg.v("Dispatch call queued. Dispatch will run once initialization is complete.");
        zzaSc = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaSa.zzg(new Runnable() {

            final zzcu zzaSj;

            public void run()
            {
                zzcu.zze(zzaSj).dispatch();
            }

            
            {
                zzaSj = zzcu.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    zzau zzAS()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaRZ != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (zzaRY == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        zzaRZ = new zzby(zzaSf, zzaRY);
        zzau zzau;
        if (handler == null)
        {
            zzAR();
        }
        zzaSd = true;
        if (zzaSc)
        {
            dispatch();
            zzaSc = false;
        }
        if (zzaSg == null && zzaSe)
        {
            zzAQ();
        }
        zzau = zzaRZ;
        this;
        JVM INSTR monitorexit ;
        return zzau;
    }

    void zza(Context context, zzas zzas1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = zzaRY;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaRY = context.getApplicationContext();
        if (zzaSa == null)
        {
            zzaSa = zzas1;
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    void zzat(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zzd(zzaSh, flag);
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
        if (zzaSh != flag) goto _L2; else goto _L1
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
        if (zzaSb > 0)
        {
            handler.removeMessages(1, zzaRX);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (zzaSb > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, zzaRX), zzaSb);
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
        zzbg.v(stringbuilder.append(((String) (obj))).toString());
        zzaSh = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    void zzhY()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzaSh && connected && zzaSb > 0)
        {
            handler.removeMessages(1, zzaRX);
            handler.sendMessage(handler.obtainMessage(1, zzaRX));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
