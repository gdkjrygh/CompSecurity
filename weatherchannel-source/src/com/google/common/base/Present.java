// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.common.base:
//            Optional, Preconditions, Function, Supplier

final class Present extends Optional
{

    private static final long serialVersionUID = 0L;
    private final Object reference;

    Present(Object obj)
    {
        reference = obj;
    }

    public Set asSet()
    {
        return Collections.singleton(reference);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Present)
        {
            obj = (Present)obj;
            return reference.equals(((Present) (obj)).reference);
        } else
        {
            return false;
        }
    }

    public Object get()
    {
        return reference;
    }

    public int hashCode()
    {
        return 0x598df91c + reference.hashCode();
    }

    public boolean isPresent()
    {
        return true;
    }

    public Optional or(Optional optional)
    {
        Preconditions.checkNotNull(optional);
        return this;
    }

    public Object or(Supplier supplier)
    {
        Preconditions.checkNotNull(supplier);
        return reference;
    }

    public Object or(Object obj)
    {
        Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return reference;
    }

    public Object orNull()
    {
        return reference;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(reference));
        return (new StringBuilder(s.length() + 13)).append("Optional.of(").append(s).append(")").toString();
    }

    public Optional transform(Function function)
    {
        return new Present(Preconditions.checkNotNull(function.apply(reference), "the Function passed to Optional.transform() must not return null."));
    }
}
