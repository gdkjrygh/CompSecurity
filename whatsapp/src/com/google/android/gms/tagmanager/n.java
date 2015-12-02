// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ContainerHolder, Container, bh, TagManager

class n
    implements ContainerHolder
{

    private Status Eb;
    private boolean Pf;
    private Container aqu;
    private Container aqv;
    private b aqw;
    private a aqx;
    private TagManager aqy;

    public void cr(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Pf;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aqu.cr(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    void ct(String s)
    {
        if (Pf)
        {
            bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        } else
        {
            aqx.ct(s);
            return;
        }
    }

    String getContainerId()
    {
        if (Pf)
        {
            bh.T("getContainerId called on a released ContainerHolder.");
            return "";
        } else
        {
            return aqu.getContainerId();
        }
    }

    public Status getStatus()
    {
        return Eb;
    }

    String pl()
    {
        if (Pf)
        {
            bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        } else
        {
            return aqx.pl();
        }
    }

    public void refresh()
    {
        this;
        JVM INSTR monitorenter ;
        if (!Pf) goto _L2; else goto _L1
_L1:
        bh.T("Refreshing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aqx.pn();
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
        if (!Pf) goto _L2; else goto _L1
_L1:
        bh.T("Releasing a released ContainerHolder.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Pf = true;
        aqy.b(this);
        aqu.release();
        aqu = null;
        aqv = null;
        aqx = null;
        aqw = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private class a
    {

        public abstract void ct(String s);

        public abstract String pl();

        public abstract void pn();
    }

}
