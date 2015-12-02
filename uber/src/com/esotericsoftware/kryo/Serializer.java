// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

// Referenced classes of package com.esotericsoftware.kryo:
//            KryoException, Kryo

public abstract class Serializer
{

    private boolean acceptsNull;
    private boolean immutable;

    public Serializer()
    {
    }

    public Serializer(boolean flag)
    {
        acceptsNull = flag;
    }

    public Serializer(boolean flag, boolean flag1)
    {
        acceptsNull = flag;
        immutable = flag1;
    }

    public Object copy(Kryo kryo, Object obj)
    {
        if (immutable)
        {
            return obj;
        } else
        {
            throw new KryoException((new StringBuilder("Serializer does not support copy: ")).append(getClass().getName()).toString());
        }
    }

    public boolean getAcceptsNull()
    {
        return acceptsNull;
    }

    public boolean isImmutable()
    {
        return immutable;
    }

    public abstract Object read(Kryo kryo, Input input, Class class1);

    public void setAcceptsNull(boolean flag)
    {
        acceptsNull = flag;
    }

    public void setGenerics(Kryo kryo, Class aclass[])
    {
    }

    public void setImmutable(boolean flag)
    {
        immutable = flag;
    }

    public abstract void write(Kryo kryo, Output output, Object obj);
}
