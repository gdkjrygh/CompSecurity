// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ContainerHolder, TagManager, zzbg, Container

class zzo
    implements ContainerHolder
{
    public static interface zza
    {
    }

    private class zzb extends Handler
    {

        private final ContainerHolder.ContainerAvailableListener zzaCx;
        final zzo zzaCy;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                zzbg.zzak("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                zzdD((String)message.obj);
                break;
            }
        }

        protected void zzdD(String s)
        {
            zzaCx.onContainerAvailable(zzaCy, s);
        }
    }


    private Status zzKr;
    private final Looper zzPx;
    private boolean zzWX;
    private Container zzaCs;
    private Container zzaCt;
    private zzb zzaCu;
    private zza zzaCv;
    private TagManager zzaCw;

    public zzo(Status status)
    {
        zzKr = status;
        zzPx = null;
    }

    public zzo(TagManager tagmanager, Looper looper, Container container, zza zza1)
    {
        zzaCw = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        zzPx = looper;
        zzaCs = container;
        zzaCv = zza1;
        zzKr = Status.zzQU;
        tagmanager.zza(this);
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!zzWX) goto _L2; else goto _L1
_L1:
        zzbg.zzak("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (zzaCt != null)
        {
            zzaCs = zzaCt;
            zzaCt = null;
        }
        container = zzaCs;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzWX) goto _L2; else goto _L1
_L1:
        zzbg.zzak("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzWX = true;
        zzaCw.zzb(this);
        zzaCs.release();
        zzaCs = null;
        zzaCt = null;
        zzaCv = null;
        zzaCu = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void zzdz(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzWX;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaCs.zzdz(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }
}
