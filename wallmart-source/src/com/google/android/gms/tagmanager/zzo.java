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

        public abstract void zzey(String s);

        public abstract String zzzE();

        public abstract void zzzG();
    }

    private class zzb extends Handler
    {

        private final ContainerHolder.ContainerAvailableListener zzaPf;
        final zzo zzaPg;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                zzbg.e("Don't know how to handle this message.");
                return;

            case 1: // '\001'
                zzeA((String)message.obj);
                break;
            }
        }

        protected void zzeA(String s)
        {
            zzaPf.onContainerAvailable(zzaPg, s);
        }

        public void zzez(String s)
        {
            sendMessage(obtainMessage(1, s));
        }

        public zzb(ContainerHolder.ContainerAvailableListener containeravailablelistener, Looper looper)
        {
            zzaPg = zzo.this;
            super(looper);
            zzaPf = containeravailablelistener;
        }
    }


    private Status zzQA;
    private final Looper zzYV;
    private Container zzaPa;
    private Container zzaPb;
    private zzb zzaPc;
    private zza zzaPd;
    private TagManager zzaPe;
    private boolean zzahz;

    public zzo(Status status)
    {
        zzQA = status;
        zzYV = null;
    }

    public zzo(TagManager tagmanager, Looper looper, Container container, zza zza1)
    {
        zzaPe = tagmanager;
        if (looper == null)
        {
            looper = Looper.getMainLooper();
        }
        zzYV = looper;
        zzaPa = container;
        zzaPd = zza1;
        zzQA = Status.zzaaD;
        tagmanager.zza(this);
    }

    private void zzzF()
    {
        if (zzaPc != null)
        {
            zzaPc.zzez(zzaPb.zzzC());
        }
    }

    public Container getContainer()
    {
        Container container = null;
        this;
        JVM INSTR monitorenter ;
        if (!zzahz) goto _L2; else goto _L1
_L1:
        zzbg.e("ContainerHolder is released.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return container;
_L2:
        if (zzaPb != null)
        {
            zzaPa = zzaPb;
            zzaPb = null;
        }
        container = zzaPa;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    String getContainerId()
    {
        if (zzahz)
        {
            zzbg.e("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return zzaPa.getContainerId();
        }
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!zzahz) goto _L2; else goto _L1
_L1:
        zzbg.e("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaPd.zzzG();
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
        if (!zzahz) goto _L2; else goto _L1
_L1:
        zzbg.e("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzahz = true;
        zzaPe.zzb(this);
        zzaPa.release();
        zzaPa = null;
        zzaPb = null;
        zzaPd = null;
        zzaPc = null;
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
        if (!zzahz) goto _L2; else goto _L1
_L1:
        zzbg.e("ContainerHolder is released.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (containeravailablelistener != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        zzaPc = null;
          goto _L3
        containeravailablelistener;
        throw containeravailablelistener;
        zzaPc = new zzb(containeravailablelistener, zzYV);
        if (zzaPb != null)
        {
            zzzF();
        }
          goto _L3
    }

    public void zza(Container container)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzahz;
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
        zzbg.e("Unexpected null container.");
          goto _L1
        container;
        throw container;
        zzaPb = container;
        zzzF();
          goto _L1
    }

    public void zzew(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzahz;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        zzaPa.zzew(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void zzey(String s)
    {
        if (zzahz)
        {
            zzbg.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            zzaPd.zzey(s);
            return;
        }
    }

    String zzzE()
    {
        if (zzahz)
        {
            zzbg.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return zzaPd.zzzE();
        }
    }
}
