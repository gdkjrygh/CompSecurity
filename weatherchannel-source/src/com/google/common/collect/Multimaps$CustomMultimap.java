// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, Multimaps

private static class factory extends AbstractMapBasedMultimap
{

    private static final long serialVersionUID = 0L;
    transient Supplier factory;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        factory = (Supplier)objectinputstream.readObject();
        setMap((Map)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(factory);
        objectoutputstream.writeObject(backingMap());
    }

    protected Collection createCollection()
    {
        return (Collection)factory.get();
    }

    (Map map, Supplier supplier)
    {
        super(map);
        factory = (Supplier)Preconditions.checkNotNull(supplier);
    }
}
