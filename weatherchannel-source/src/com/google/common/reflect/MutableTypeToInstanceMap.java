// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.reflect:
//            TypeToInstanceMap, TypeToken

public final class MutableTypeToInstanceMap extends ForwardingMap
    implements TypeToInstanceMap
{
    private static final class UnmodifiableEntry extends ForwardingMapEntry
    {

        private final java.util.Map.Entry _flddelegate;

        private static Iterator transformEntries(Iterator iterator)
        {
            return Iterators.transform(iterator, new Function() {

                public volatile Object apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public java.util.Map.Entry apply(java.util.Map.Entry entry)
                {
                    return new UnmodifiableEntry(entry);
                }

            });
        }

        static Set transformEntries(Set set)
        {
            return new ForwardingSet(set) {

                final Set val$entries;

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
                    return entries;
                }

                public Iterator iterator()
                {
                    return UnmodifiableEntry.transformEntries(iterator());
                }

                public Object[] toArray()
                {
                    return standardToArray();
                }

                public Object[] toArray(Object aobj[])
                {
                    return standardToArray(aobj);
                }

            
            {
                entries = set;
                super();
            }
            };
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected java.util.Map.Entry _mthdelegate()
        {
            return _flddelegate;
        }

        public Object setValue(Object obj)
        {
            throw new UnsupportedOperationException();
        }


        private UnmodifiableEntry(java.util.Map.Entry entry)
        {
            _flddelegate = (java.util.Map.Entry)Preconditions.checkNotNull(entry);
        }

    }


    private final Map backingMap = Maps.newHashMap();

    public MutableTypeToInstanceMap()
    {
    }

    private Object trustedGet(TypeToken typetoken)
    {
        return backingMap.get(typetoken);
    }

    private Object trustedPut(TypeToken typetoken, Object obj)
    {
        return backingMap.put(typetoken, obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return backingMap;
    }

    public Set entrySet()
    {
        return UnmodifiableEntry.transformEntries(super.entrySet());
    }

    public Object getInstance(TypeToken typetoken)
    {
        return trustedGet(typetoken.rejectTypeVariables());
    }

    public Object getInstance(Class class1)
    {
        return trustedGet(TypeToken.of(class1));
    }

    public Object put(TypeToken typetoken, Object obj)
    {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((TypeToken)obj, obj1);
    }

    public void putAll(Map map)
    {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    public Object putInstance(TypeToken typetoken, Object obj)
    {
        return trustedPut(typetoken.rejectTypeVariables(), obj);
    }

    public Object putInstance(Class class1, Object obj)
    {
        return trustedPut(TypeToken.of(class1), obj);
    }
}
