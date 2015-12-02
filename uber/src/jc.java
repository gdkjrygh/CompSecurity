// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

public class jc
{

    private static volatile Integer a;

    public jc()
    {
    }

    private static int a()
    {
        int i = jb.a();
        if (i <= 0)
        {
            return -1;
        }
        if (i == 1)
        {
            return 2008;
        }
        return i > 3 ? 2012 : 2011;
    }

    public static int a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        jc;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = Integer.valueOf(b(context));
        }
        jc;
        JVM INSTR monitorexit ;
_L2:
        return a.intValue();
        context;
        jc;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void a(ArrayList arraylist, int i)
    {
        if (i != -1)
        {
            arraylist.add(Integer.valueOf(i));
        }
    }

    private static int b()
    {
        long l = jb.b();
        if (l == -1L)
        {
            return -1;
        }
        if (l <= 0x80e80L)
        {
            return 2008;
        }
        if (l <= 0x975e0L)
        {
            return 2009;
        }
        if (l <= 0xf9060L)
        {
            return 2010;
        }
        if (l <= 0x129da0L)
        {
            return 2011;
        }
        if (l <= 0x173180L)
        {
            return 2012;
        }
        return l > 0x1ed2a0L ? 2014 : 2013;
    }

    private static int b(Context context)
    {
        ArrayList arraylist = new ArrayList();
        a(arraylist, a());
        a(arraylist, b());
        a(arraylist, c(context));
        if (arraylist.isEmpty())
        {
            return -1;
        }
        Collections.sort(arraylist);
        if ((arraylist.size() & 1) == 1)
        {
            return ((Integer)arraylist.get(arraylist.size() / 2)).intValue();
        } else
        {
            int i = arraylist.size() / 2 - 1;
            int j = ((Integer)arraylist.get(i)).intValue();
            return (((Integer)arraylist.get(i + 1)).intValue() - ((Integer)arraylist.get(i)).intValue()) / 2 + j;
        }
    }

    private static int c(Context context)
    {
        long l = jb.a(context);
        if (l <= 0L)
        {
            return -1;
        }
        if (l <= 0xc000000L)
        {
            return 2008;
        }
        if (l <= 0x12200000L)
        {
            return 2009;
        }
        if (l <= 0x20000000L)
        {
            return 2010;
        }
        if (l <= 0x40000000L)
        {
            return 2011;
        }
        if (l <= 0x60000000L)
        {
            return 2012;
        }
        return l > 0x80000000L ? 2014 : 2013;
    }
}
