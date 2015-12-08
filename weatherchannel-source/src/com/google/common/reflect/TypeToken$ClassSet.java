// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

private final class <init> extends <init>
{

    private static final long serialVersionUID = 0L;
    private transient ImmutableSet classes;
    final TypeToken this$0;

    private Object readResolve()
    {
        return getTypes().lasses();
    }

    public lasses classes()
    {
        return this;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Set _mthdelegate()
    {
        ImmutableSet immutableset1 = classes;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = FluentIterable.from(ctor.FOR_GENERIC_TYPE.classesOnly().collectTypes(TypeToken.this)).filter(r.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            classes = immutableset;
        }
        return immutableset;
    }

    public classes interfaces()
    {
        throw new UnsupportedOperationException("classes().interfaces() not supported.");
    }

    public Set rawTypes()
    {
        return ImmutableSet.copyOf(ctor.FOR_RAW_TYPE.classesOnly().collectTypes(TypeToken.access$200(TypeToken.this)));
    }

    private r()
    {
        this$0 = TypeToken.this;
        super(TypeToken.this);
    }

    init>(init> init>)
    {
        this();
    }
}
