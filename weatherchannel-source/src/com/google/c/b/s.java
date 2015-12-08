// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.c.b:
//            k, ae, g, ab, 
//            af

public abstract class s extends k
    implements Set
{

    s()
    {
    }

    public static s a(Object obj)
    {
        return new ae(obj);
    }

    public static s f()
    {
        return g.a;
    }

    public abstract af a();

    boolean c()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof s) && c() && ((s)obj).c() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return ab.a(this, obj);
        }
    }

    public int hashCode()
    {
        return ab.a(this);
    }

    public Iterator iterator()
    {
        return a();
    }
}
