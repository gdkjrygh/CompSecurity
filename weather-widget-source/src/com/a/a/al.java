// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.util.Log;
import com.a.b.b;
import com.a.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.a.a:
//            ai, n

class al extends ai
{

    n h;
    int i;
    private b j;

    public transient al(c c1, int ai1[])
    {
        super(c1, null);
        a(ai1);
        if (c1 instanceof b)
        {
            j = (b)b;
        }
    }

    public transient al(String s, int ai1[])
    {
        super(s, null);
        a(ai1);
    }

    public ai a()
    {
        return e();
    }

    void a(float f)
    {
        i = h.b(f);
    }

    void a(Class class1)
    {
        if (b != null)
        {
            return;
        } else
        {
            super.a(class1);
            return;
        }
    }

    public transient void a(int ai1[])
    {
        super.a(ai1);
        h = (n)e;
    }

    void b(Object obj)
    {
        if (j != null)
        {
            j.a(obj, i);
        } else
        {
            if (b != null)
            {
                b.a(obj, Integer.valueOf(i));
                return;
            }
            if (c != null)
            {
                try
                {
                    g[0] = Integer.valueOf(i);
                    c.invoke(obj, g);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
                }
                return;
            }
        }
    }

    public Object clone()
    {
        return e();
    }

    Object d()
    {
        return Integer.valueOf(i);
    }

    public al e()
    {
        al al1 = (al)super.a();
        al1.h = (n)al1.e;
        return al1;
    }
}
