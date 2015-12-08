// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, MapMaker

private static final class onProxy extends onProxy
{

    private static final long serialVersionUID = 3L;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        _flddelegate = readMapMaker(objectinputstream).makeMap();
        readEntries(objectinputstream);
    }

    private Object readResolve()
    {
        return _flddelegate;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        writeMapTo(objectoutputstream);
    }

    onProxy(onProxy onproxy, onProxy onproxy1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, onProxy onproxy2, ConcurrentMap concurrentmap)
    {
        super(onproxy, onproxy1, equivalence, equivalence1, l, l1, i, j, onproxy2, concurrentmap);
    }
}
