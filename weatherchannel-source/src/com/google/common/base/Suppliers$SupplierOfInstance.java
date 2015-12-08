// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Supplier, Suppliers, Objects

private static class instance
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final Object instance;

    public boolean equals(Object obj)
    {
        if (obj instanceof instance)
        {
            obj = (instance)obj;
            return Objects.equal(instance, ((instance) (obj)).instance);
        } else
        {
            return false;
        }
    }

    public Object get()
    {
        return instance;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            instance
        });
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(instance));
        return (new StringBuilder(s.length() + 22)).append("Suppliers.ofInstance(").append(s).append(")").toString();
    }

    _cls9(Object obj)
    {
        instance = obj;
    }
}
