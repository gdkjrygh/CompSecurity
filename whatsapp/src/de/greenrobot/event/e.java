// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


// Referenced classes of package de.greenrobot.event:
//            k

final class e
{

    volatile boolean a;
    final k b;
    final int c;
    final Object d;

    e(Object obj, k k1, int i)
    {
        d = obj;
        b = k1;
        c = i;
        a = true;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof e)
        {
            obj = (e)obj;
            flag = flag1;
            if (d == ((e) (obj)).d)
            {
                flag = flag1;
                if (b.equals(((e) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return d.hashCode() + b.c.hashCode();
    }
}
