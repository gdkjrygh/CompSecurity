// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import org.codehaus.jackson.map.TypeSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            SerializerBase

public abstract class ContainerSerializerBase extends SerializerBase
{

    protected ContainerSerializerBase(Class class1)
    {
        super(class1);
    }

    protected ContainerSerializerBase(Class class1, boolean flag)
    {
        super(class1, flag);
    }

    public abstract ContainerSerializerBase _withValueTypeSerializer(TypeSerializer typeserializer);

    public ContainerSerializerBase withValueTypeSerializer(TypeSerializer typeserializer)
    {
        if (typeserializer == null)
        {
            return this;
        } else
        {
            return _withValueTypeSerializer(typeserializer);
        }
    }
}
