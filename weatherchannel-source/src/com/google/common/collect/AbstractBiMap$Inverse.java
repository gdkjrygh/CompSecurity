// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractBiMap, BiMap

private static class <init> extends AbstractBiMap
{

    private static final long serialVersionUID = 0L;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        setInverse((AbstractBiMap)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(inverse());
    }

    Object checkKey(Object obj)
    {
        return inverse.checkValue(obj);
    }

    Object checkValue(Object obj)
    {
        return inverse.checkKey(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return super._mthdelegate();
    }

    Object readResolve()
    {
        return inverse().inverse();
    }

    public volatile Collection values()
    {
        return super.values();
    }

    private (Map map, AbstractBiMap abstractbimap)
    {
        super(map, abstractbimap, null);
    }

    (Map map, AbstractBiMap abstractbimap,  )
    {
        this(map, abstractbimap);
    }
}
