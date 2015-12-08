// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

private final class allTypes extends allTypes
{

    private static final long serialVersionUID = 0L;
    private final transient _cls1.apply allTypes;
    private transient ImmutableSet interfaces;
    final TypeToken this$0;

    private Object readResolve()
    {
        return getTypes().faces();
    }

    public faces classes()
    {
        throw new UnsupportedOperationException("interfaces().classes() not supported.");
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
        ImmutableSet immutableset1 = interfaces;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = FluentIterable.from(allTypes).filter(TERFACE_ONLY).toSet();
            interfaces = immutableset;
        }
        return immutableset;
    }

    public interfaces interfaces()
    {
        return this;
    }

    public Set rawTypes()
    {
        return FluentIterable.from(.FOR_RAW_TYPE.collectTypes(TypeToken.access$200(TypeToken.this))).filter(new Predicate() {

            final TypeToken.InterfaceSet this$1;

            public boolean apply(Class class1)
            {
                return class1.isInterface();
            }

            public volatile boolean apply(Object obj)
            {
                return apply((Class)obj);
            }

            
            {
                this$1 = TypeToken.InterfaceSet.this;
                super();
            }
        }).toSet();
    }

    _cls1.this._cls1(_cls1.this._cls1 _pcls1)
    {
        this$0 = TypeToken.this;
        super(TypeToken.this);
        allTypes = _pcls1;
    }
}
