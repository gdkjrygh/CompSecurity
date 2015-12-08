// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.a;


// Referenced classes of package org.a.c.a:
//            d, f

public abstract class e extends Number
{

    public static final d a(double d1)
    {
        if (d1 >= 2147483647D)
        {
            return new d(0x7fffffff, 1);
        }
        if (d1 <= -2147483647D)
        {
            return new d(0x80000001, 1);
        }
        Object obj;
        Object obj1;
        f f1;
        f f2;
        Object obj2;
        boolean flag;
        int i;
        if (d1 < 0.0D)
        {
            d1 = Math.abs(d1);
            flag = true;
        } else
        {
            flag = false;
        }
        if (d1 == 0.0D)
        {
            return new d(0, 1);
        }
        if (d1 >= 1.0D)
        {
            i = (int)d1;
            if ((double)i < d1)
            {
                obj = new d(i, 1);
                obj1 = new d(i + 1, 1);
            } else
            {
                obj = new d(i - 1, 1);
                obj1 = new d(i, 1);
            }
        } else
        {
            i = (int)(1.0D / d1);
            if (1.0D / (double)i < d1)
            {
                obj = new d(1, i);
                obj1 = new d(1, i - 1);
            } else
            {
                obj = new d(1, i + 1);
                obj1 = new d(1, i);
            }
        }
        f1 = f.a(((d) (obj)), d1);
        obj1 = f.a(((d) (obj1)), d1);
        if (f1.b < ((f) (obj1)).b)
        {
            obj = f1;
        } else
        {
            obj = obj1;
        }
        i = 0;
        f2 = f1;
        f1 = ((f) (obj1));
        obj1 = obj;
        if (((f) (obj1)).b > 1E-08D && i < 100) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            return ((f) (obj1)).a.a();
        } else
        {
            return ((f) (obj1)).a;
        }
_L2:
        obj2 = d.a((long)f2.a.a + (long)f1.a.a, (long)f2.a.b + (long)f1.a.b);
        obj = f.a(((d) (obj2)), d1);
        if (d1 >= ((d) (obj2)).doubleValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1.b <= ((f) (obj)).b) goto _L1; else goto _L3
_L3:
        f1 = ((f) (obj));
_L5:
        obj2 = obj1;
        if (((f) (obj)).b < ((f) (obj1)).b)
        {
            obj2 = obj;
        }
        i++;
        obj1 = obj2;
        break MISSING_BLOCK_LABEL_151;
        if (f2.b <= ((f) (obj)).b) goto _L1; else goto _L4
_L4:
        f2 = ((f) (obj));
          goto _L5
    }
}
