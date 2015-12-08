// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.util.Log;
import com.a.b.a;
import com.a.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.a.a:
//            ai, l

class ak extends ai
{

    l h;
    float i;
    private a j;

    public transient ak(c c1, float af[])
    {
        super(c1, null);
        a(af);
        if (c1 instanceof a)
        {
            j = (a)b;
        }
    }

    public transient ak(String s, float af[])
    {
        super(s, null);
        a(af);
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

    public transient void a(float af[])
    {
        super.a(af);
        h = (l)e;
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
                b.a(obj, Float.valueOf(i));
                return;
            }
            if (c != null)
            {
                try
                {
                    g[0] = Float.valueOf(i);
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
        return Float.valueOf(i);
    }

    public ak e()
    {
        ak ak1 = (ak)super.a();
        ak1.h = (l)ak1.e;
        return ak1;
    }
}
