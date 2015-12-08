// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import com.gau.go.a.a.c;

public class d
{

    private c a;
    private c b;

    public d()
    {
    }

    public c a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L2; else goto _L1
_L1:
        Object obj;
        c c1;
        c1 = a;
        obj = c1.o;
        a = null;
        Object obj1;
        Object obj2;
        int i;
        obj1 = c1;
        i = 1;
        obj2 = null;
_L7:
        if (obj == null || i >= 30) goto _L4; else goto _L3
_L3:
        if (((c) (obj1)).a != ((c) (obj)).a || ((c) (obj1)).j != ((c) (obj)).j) goto _L6; else goto _L5
_L5:
        obj1.o = ((c) (obj));
        i++;
        obj1 = obj;
_L8:
        obj = ((c) (obj)).o;
          goto _L7
_L6:
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        a = ((c) (obj));
          goto _L8
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        a.o = ((c) (obj));
        break MISSING_BLOCK_LABEL_223;
        obj2.o = ((c) (obj));
        break MISSING_BLOCK_LABEL_223;
_L4:
        if (a != null) goto _L10; else goto _L9
_L9:
        a = ((c) (obj));
_L15:
        if (obj == null) goto _L12; else goto _L11
_L11:
        if (obj1 != b) goto _L13; else goto _L12
_L12:
        b = ((c) (obj2));
_L17:
        if (b != null)
        {
            b.o = null;
        }
        obj1.o = null;
        this;
        JVM INSTR monitorexit ;
        return c1;
_L10:
        if (a == null || obj2 != null) goto _L15; else goto _L14
_L14:
        a.o = ((c) (obj));
          goto _L15
_L13:
        if (obj2 == null) goto _L17; else goto _L16
_L16:
        obj2.o = ((c) (obj));
          goto _L17
_L2:
        this;
        JVM INSTR monitorexit ;
        return null;
        obj2 = obj;
          goto _L8
    }

    public void a(c c1)
    {
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = c1;
        }
        if (b == null)
        {
            b = a;
        }
        c c2 = c1;
        if (b == c1)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        b.o = c1;
        c2 = c1;
        while (c2.o != null) 
        {
            c2 = c2.o;
        }
        b = c2;
        b.o = null;
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public void b()
    {
    }
}
