// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.b;


class b
{

    private int a;

    b()
    {
        a = 100;
        b();
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if ("INFO" == null) goto _L2; else goto _L1
_L1:
        if (!"INFO".equals("ASSERT")) goto _L4; else goto _L3
_L3:
        a = 7;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!"INFO".equals("ERROR"))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        a = 6;
          goto _L2
        Exception exception;
        exception;
        throw exception;
label0:
        {
            if (!"INFO".equals("WARN"))
            {
                break label0;
            }
            a = 5;
        }
          goto _L2
label1:
        {
            if (!"INFO".equals("INFO"))
            {
                break label1;
            }
            a = 4;
        }
          goto _L2
        if (!"INFO".equals("DEBUG")) goto _L6; else goto _L5
_L5:
        a = 3;
          goto _L2
_L6:
        if (!"INFO".equals("VERBOSE")) goto _L2; else goto _L7
_L7:
        a = 2;
          goto _L2
    }

    final boolean a()
    {
        return false;
    }

    final boolean a(int i)
    {
        return i >= a;
    }
}
