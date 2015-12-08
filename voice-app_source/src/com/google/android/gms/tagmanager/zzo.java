// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ContainerHolder, TagManager, Container, zzbg

class zzo
    implements ContainerHolder
{
    public static interface zza
    {

        public abstract void zzej(String s);

        public abstract String zzyo();

        public abstract void zzyq();
    }

    private class zzb extends Handler
    {

        private final ContainerHolder.ContainerAvailableListener zzaKL;
        final zzo zzaKM;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                zzbg.zzaz("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                zzel((String)message.obj);
                break;
            }
        }

        public void zzek(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        protected void zzel(String s)
        {
            zzaKL.onContainerAvailable(zzaKM, s);
        }

        public zzb(ContainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
        {
            zzaKM = zzo.this;
            super(looper);
            zzaKL = containeravailablelistener;
        }
    }


    private Status zzOt;
    private final Looper zzWt;
    private Container zzaKG;
    private Container zzaKH;
    private zzb zzaKI;
    private zza zzaKJ;
    private TagManager zzaKK;
    private boolean zzaea;

    public zzo(Status status)
    {
        zzOt = status;
        zzWt = null;
    }

    public zzo(TagManager tagmanager, Looper looper, Container container, zza zza1)
    {
        zzaKK = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        zzWt = looper;
        zzaKG = container;
        zzaKJ = zza1;
        zzOt = Status.zzXP;
        tagmanager.zza(this);
    }

    private void zzyp()
    {
        if (zzaKI != null)
        {
            zzaKI.zzek(zzaKH.zzym());
        }
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!zzaea) goto _L2; else goto _L1
_L1:
        zzbg.zzaz("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (zzaKH != null)
        {
            zzaKG = zzaKH;
            zzaKH = null;
        }
        container = zzaKG;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if (zzaea)
        {
            zzbg.zzaz("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return zzaKG.getContainerId();
        }
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzaea) goto _L2; else goto _L1
_L1:
        zzbg.zzaz("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaKJ.zzyq();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzaea) goto _L2; else goto _L1
_L1:
        zzbg.zzaz("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaea = true;
        zzaKK.zzb(this);
        zzaKG.release();
        zzaKG = null;
        zzaKH = null;
        zzaKJ = null;
        zzaKI = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener containeravailablelistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzaea) goto _L2; else goto _L1
_L1:
        zzbg.zzaz("ContainerHolder is released.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (containeravailablelistener != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        zzaKI = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        zzaKI = new zzb(containeravailablelistener, zzWt);
        if (zzaKH != null)
        {
            zzyp();
        }
          goto _L3
    }

    public void zza(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzaea;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (container != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        zzbg.zzaz("Unexpected null container.");
          goto _L1
        container;
        throw container;
        zzaKH = container;
        zzyp();
          goto _L1
    }

    public void zzeh(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzaea;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaKG.zzeh(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void zzej(String s)
    {
        if (zzaea)
        {
            zzbg.zzaz("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            zzaKJ.zzej(s);
            return;
        }
    }

    String zzyo()
    {
        if (zzaea)
        {
            zzbg.zzaz("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return zzaKJ.zzyo();
        }
    }
}
