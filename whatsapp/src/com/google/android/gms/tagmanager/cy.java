// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cx, bh, ar, at, 
//            au

class cy extends cx
{

    private static cy atJ;
    private static final Object yT = new Object();
    private at atA;
    private volatile ar atB;
    private int atC;
    private boolean atD;
    private boolean atE;
    private boolean atF;
    private au atG;
    private boolean atI;
    private boolean connected;
    private Handler handler;

    private cy()
    {
        atC = 0x1b7740;
        atD = true;
        atE = false;
        connected = true;
        atF = true;
        atG = new _cls1();
        atI = false;
    }

    static at e(cy cy1)
    {
        return cy1.atA;
    }

    public static cy qN()
    {
        if (atJ == null)
        {
            atJ = new cy();
        }
        return atJ;
    }

    void C(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(atI, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (atI != flag) goto _L2; else goto _L1
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
        if (atC > 0)
        {
            handler.removeMessages(1, yT);
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (atC > 0)
        {
            handler.sendMessageDelayed(handler.obtainMessage(1, yT), atC);
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
        bh.V(stringbuilder.append(((String) (obj))).toString());
        atI = flag;
        connected = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    public void dispatch()
    {
        this;
        JVM INSTR monitorenter ;
        if (atE) goto _L2; else goto _L1
_L1:
        bh.V("Dispatch call queued. Dispatch will run once initialization is complete.");
        atD = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        atB.b(new _cls3());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void ey()
    {
        this;
        JVM INSTR monitorenter ;
        if (!atI && connected && atC > 0)
        {
            handler.removeMessages(1, yT);
            handler.sendMessage(handler.obtainMessage(1, yT));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }


    private class _cls1
        implements au
    {

        final cy atK;

        _cls1()
        {
            atK = cy.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final cy atK;

        public void run()
        {
            cy.e(atK).dispatch();
        }

        _cls3()
        {
            atK = cy.this;
            super();
        }
    }

}
