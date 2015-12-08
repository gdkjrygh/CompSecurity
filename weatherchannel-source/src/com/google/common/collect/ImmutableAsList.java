// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, ImmutableCollection

abstract class ImmutableAsList extends ImmutableList
{
    static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableCollection collection;

        Object readResolve()
        {
            return collection.asList();
        }

        SerializedForm(ImmutableCollection immutablecollection)
        {
            collection = immutablecollection;
        }
    }


    ImmutableAsList()
    {
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws InvalidObjectException
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public boolean contains(Object obj)
    {
        return delegateCollection().contains(obj);
    }

    abstract ImmutableCollection delegateCollection();

    public boolean isEmpty()
    {
        return delegateCollection().isEmpty();
    }

    boolean isPartialView()
    {
        return delegateCollection().isPartialView();
    }

    public int size()
    {
        return delegateCollection().size();
    }

    Object writeReplace()
    {
        return new SerializedForm(delegateCollection());
    }
}
