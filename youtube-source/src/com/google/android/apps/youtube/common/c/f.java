// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.c;

import com.google.android.apps.youtube.common.fromguava.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.youtube.common.c:
//            d

final class f
    implements d
{

    private final WeakReference a;
    private final Method b;
    private final int c;

    f(Object obj, Method method)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        a = new WeakReference(obj);
        b = (Method)com.google.android.apps.youtube.common.fromguava.c.a(method);
        b.setAccessible(true);
        c = Arrays.hashCode(new Object[] {
            obj, b
        });
    }

    public final void a(Object obj)
    {
        Object obj1 = a.get();
        if (obj1 == null)
        {
            return;
        }
        try
        {
            b.invoke(obj1, new Object[] {
                obj
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((InvocationTargetException) (obj)).getCause());
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof f)
            {
                if (((f) (obj = (f)obj)).a.get() != a.get() || !b.equals(((f) (obj)).b))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return c;
    }
}
