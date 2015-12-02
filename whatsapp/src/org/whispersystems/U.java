// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.io.Serializable;
import java.util.Set;

// Referenced classes of package org.whispersystems:
//            W, b1, V, J, 
//            as

public abstract class U
    implements Serializable
{

    public static int a;
    private static final long serialVersionUID = 0L;

    U()
    {
    }

    public static U a(Object obj)
    {
        if (obj == null)
        {
            return c();
        } else
        {
            return new W(obj);
        }
    }

    public static U b(Object obj)
    {
        return new W(b1.a(obj));
    }

    public static U c()
    {
        return V.b;
    }

    public abstract Object a();

    public abstract Object a(J j);

    public abstract U a(U u);

    public abstract U a(as as);

    public abstract boolean b();

    public abstract Object c(Object obj);

    public abstract Set d();

    public abstract Object e();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();
}
