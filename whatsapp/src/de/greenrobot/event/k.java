// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.lang.reflect.Method;

// Referenced classes of package de.greenrobot.event:
//            i

final class k
{

    final Class a;
    final Method b;
    String c;
    final i d;

    k(Method method, i i, Class class1)
    {
        b = method;
        d = i;
        a = class1;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            StringBuilder stringbuilder = new StringBuilder(64);
            stringbuilder.append(b.getDeclaringClass().getName());
            stringbuilder.append('#').append(b.getName());
            stringbuilder.append('(').append(a.getName());
            c = stringbuilder.toString();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof k)
        {
            a();
            obj = (k)obj;
            ((k) (obj)).a();
            return c.equals(((k) (obj)).c);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }
}
