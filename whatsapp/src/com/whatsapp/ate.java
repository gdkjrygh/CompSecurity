// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.whatsapp:
//            App

public class ate
{

    private int a;
    private LinkedList b;

    public ate()
    {
        a = 0;
        b = new LinkedList();
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        b.clear();
        a = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        b.addFirst(abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public byte[] a(int i)
    {
        int j = App.am;
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = b.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        byte abyte1[] = (byte[])iterator.next();
        if (abyte1.length < i) goto _L4; else goto _L3
_L3:
        iterator.remove();
        this;
        JVM INSTR monitorexit ;
        return abyte1;
_L2:
        byte abyte0[];
        a = a + i;
        abyte0 = new byte[i];
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        if (j == 0) goto _L5; else goto _L2
    }
}
