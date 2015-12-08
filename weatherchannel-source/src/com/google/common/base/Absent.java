// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.common.base:
//            Optional, Preconditions, Supplier, Function

final class Absent extends Optional
{

    static final Absent INSTANCE = new Absent();
    private static final long serialVersionUID = 0L;

    private Absent()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    static Optional withType()
    {
        return INSTANCE;
    }

    public Set asSet()
    {
        return Collections.emptySet();
    }

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public Object get()
    {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode()
    {
        return 0x598df91c;
    }

    public boolean isPresent()
    {
        return false;
    }

    public Optional or(Optional optional)
    {
        return (Optional)Preconditions.checkNotNull(optional);
    }

    public Object or(Supplier supplier)
    {
        return Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    public Object or(Object obj)
    {
        return Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public Object orNull()
    {
        return null;
    }

    public String toString()
    {
        return "Optional.absent()";
    }

    public Optional transform(Function function)
    {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }

}
