// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

public class t> extends ForwardingSet
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final TypeToken this$0;
    private transient ImmutableSet types;

    public t> classes()
    {
        return new (TypeToken.this, null);
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
        ImmutableSet immutableset1 = types;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = FluentIterable.from(ector.FOR_GENERIC_TYPE.collectTypes(TypeToken.this)).filter(er.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            types = immutableset;
        }
        return immutableset;
    }

    public types interfaces()
    {
        return new eSet(TypeToken.this, this);
    }

    public Set rawTypes()
    {
        return ImmutableSet.copyOf(ector.FOR_RAW_TYPE.collectTypes(TypeToken.access$200(TypeToken.this)));
    }

    eSet()
    {
        this$0 = TypeToken.this;
        super();
    }
}
