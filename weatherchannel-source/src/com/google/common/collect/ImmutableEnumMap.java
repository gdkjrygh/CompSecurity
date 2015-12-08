// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, Iterables, ImmutableSet, Iterators, 
//            UnmodifiableIterator, ImmutableMapEntrySet, Maps

final class ImmutableEnumMap extends ImmutableMap
{
    private static class EnumSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final EnumMap _flddelegate;

        Object readResolve()
        {
            return new ImmutableEnumMap(_flddelegate);
        }

        EnumSerializedForm(EnumMap enummap)
        {
            _flddelegate = enummap;
        }
    }


    private final transient EnumMap _flddelegate;

    private ImmutableEnumMap(EnumMap enummap)
    {
        _flddelegate = enummap;
        boolean flag;
        if (!enummap.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }


    static ImmutableMap asImmutable(EnumMap enummap)
    {
        switch (enummap.size())
        {
        default:
            return new ImmutableEnumMap(enummap);

        case 0: // '\0'
            return ImmutableMap.of();

        case 1: // '\001'
            enummap = (java.util.Map.Entry)Iterables.getOnlyElement(enummap.entrySet());
            break;
        }
        return ImmutableMap.of(enummap.getKey(), enummap.getValue());
    }

    public boolean containsKey(Object obj)
    {
        return _flddelegate.containsKey(obj);
    }

    ImmutableSet createEntrySet()
    {
        return new ImmutableMapEntrySet() {

            final ImmutableEnumMap this$0;

            public UnmodifiableIterator iterator()
            {
                return new UnmodifiableIterator() {

                    private final Iterator backingIterator;
                    final _cls2 this$1;

                    public boolean hasNext()
                    {
                        return backingIterator.hasNext();
                    }

                    public volatile Object next()
                    {
                        return next();
                    }

                    public java.util.Map.Entry next()
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)backingIterator.next();
                        return Maps.immutableEntry(entry.getKey(), entry.getValue());
                    }

            
            {
                this$1 = _cls2.this;
                super();
                backingIterator = _flddelegate.entrySet().iterator();
            }
                };
            }

            public volatile Iterator iterator()
            {
                return iterator();
            }

            ImmutableMap map()
            {
                return ImmutableEnumMap.this;
            }

            
            {
                this$0 = ImmutableEnumMap.this;
                super();
            }
        };
    }

    ImmutableSet createKeySet()
    {
        return new ImmutableSet() {

            final ImmutableEnumMap this$0;

            public boolean contains(Object obj)
            {
                return _flddelegate.containsKey(obj);
            }

            boolean isPartialView()
            {
                return true;
            }

            public UnmodifiableIterator iterator()
            {
                return Iterators.unmodifiableIterator(_flddelegate.keySet().iterator());
            }

            public volatile Iterator iterator()
            {
                return iterator();
            }

            public int size()
            {
                return ImmutableEnumMap.this.size();
            }

            
            {
                this$0 = ImmutableEnumMap.this;
                super();
            }
        };
    }

    public Object get(Object obj)
    {
        return _flddelegate.get(obj);
    }

    boolean isPartialView()
    {
        return false;
    }

    public int size()
    {
        return _flddelegate.size();
    }

    Object writeReplace()
    {
        return new EnumSerializedForm(_flddelegate);
    }

}
