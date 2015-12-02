// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.android.gms.internal:
//            qw, qz, qp

public class qr
{

    protected final Class ayX;
    protected final boolean ayY;
    public final int tag;
    protected final int type;

    int B(Object obj)
    {
label0:
        {
            int i;
            try
            {
                if (!ayY)
                {
                    break label0;
                }
                i = C(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return i;
        }
        return D(obj);
    }

    protected int C(Object obj)
    {
        int i = 0;
        boolean flag = qw.a;
        int l = Array.getLength(obj);
        int k = 0;
        int j;
        do
        {
            j = i;
            if (k >= l)
            {
                break;
            }
            j = i;
            if (Array.get(obj, k) != null)
            {
                j = i + D(Array.get(obj, k));
            }
            k++;
            i = j;
        } while (!flag);
        return j;
    }

    protected int D(Object obj)
    {
        int i = qz.hl(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());

        case 10: // '\n'
            return qp.b(i, (qw)obj);

        case 11: // '\013'
            return qp.c(i, (qw)obj);
        }
    }

    void a(Object obj, qp qp1)
    {
        boolean flag;
        try
        {
            flag = ayY;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        c(obj, qp1);
        if (!qw.a)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        b(obj, qp1);
        return;
    }

    protected void b(Object obj, qp qp1)
    {
        boolean flag;
        flag = qw.a;
        int i;
        try
        {
            qp1.hd(tag);
            i = type;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        i;
        JVM INSTR tableswitch 10 11: default 44
    //                   10 87
    //                   11 118;
           goto _L1 _L2 _L3
_L1:
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
_L2:
        qw qw1 = (qw)obj;
        int j = qz.hl(tag);
        qp1.b(qw1);
        qp1.x(j, 4);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        obj = (qw)obj;
        qp1.c(((qw) (obj)));
        if (flag) goto _L1; else goto _L4
_L4:
    }

    protected void c(Object obj, qp qp1)
    {
        boolean flag = qw.a;
        int j = Array.getLength(obj);
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                try
                {
                    b(obj1, qp1);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            }
            i++;
        } while (!flag);
    }
}
