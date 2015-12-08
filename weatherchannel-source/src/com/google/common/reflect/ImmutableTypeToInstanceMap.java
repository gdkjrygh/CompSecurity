// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

// Referenced classes of package com.google.common.reflect:
//            TypeToInstanceMap, TypeToken

public final class ImmutableTypeToInstanceMap extends ForwardingMap
    implements TypeToInstanceMap
{
    public static final class Builder
    {

        private final com.google.common.collect.ImmutableMap.Builder mapBuilder;

        public ImmutableTypeToInstanceMap build()
        {
            return new ImmutableTypeToInstanceMap(mapBuilder.build());
        }

        public Builder put(TypeToken typetoken, Object obj)
        {
            mapBuilder.put(typetoken.rejectTypeVariables(), obj);
            return this;
        }

        public Builder put(Class class1, Object obj)
        {
            mapBuilder.put(TypeToken.of(class1), obj);
            return this;
        }

        private Builder()
        {
            mapBuilder = ImmutableMap.builder();
        }

    }


    private final ImmutableMap _flddelegate;

    private ImmutableTypeToInstanceMap(ImmutableMap immutablemap)
    {
        _flddelegate = immutablemap;
    }


    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableTypeToInstanceMap of()
    {
        return new ImmutableTypeToInstanceMap(ImmutableMap.of());
    }

    private Object trustedGet(TypeToken typetoken)
    {
        return _flddelegate.get(typetoken);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return _flddelegate;
    }

    public Object getInstance(TypeToken typetoken)
    {
        return trustedGet(typetoken.rejectTypeVariables());
    }

    public Object getInstance(Class class1)
    {
        return trustedGet(TypeToken.of(class1));
    }

    public Object putInstance(TypeToken typetoken, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public Object putInstance(Class class1, Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
