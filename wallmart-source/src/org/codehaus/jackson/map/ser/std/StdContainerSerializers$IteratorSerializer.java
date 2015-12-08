// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.util.Iterator;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            AsArraySerializerBase, StdContainerSerializers, ContainerSerializerBase

public static class Q extends AsArraySerializerBase
{

    public ContainerSerializerBase _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new <init>(_elementType, _staticTyping, typeserializer, _property);
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((Iterator)obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(Iterator iterator, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (iterator.hasNext())
        {
            TypeSerializer typeserializer = _valueTypeSerializer;
            JsonSerializer jsonserializer = null;
            Class class1 = null;
            do
            {
                Object obj = iterator.next();
                if (obj == null)
                {
                    serializerprovider.defaultSerializeNull(jsongenerator);
                } else
                {
                    Class class2 = obj.getClass();
                    JsonSerializer jsonserializer1;
                    if (class2 == class1)
                    {
                        jsonserializer1 = jsonserializer;
                    } else
                    {
                        jsonserializer1 = serializerprovider.findValueSerializer(class2, _property);
                        jsonserializer = jsonserializer1;
                        class1 = class2;
                    }
                    if (typeserializer == null)
                    {
                        jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
                    } else
                    {
                        jsonserializer1.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
                    }
                }
            } while (iterator.hasNext());
        }
    }

    public Q(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        super(java/util/Iterator, javatype, flag, typeserializer, beanproperty, null);
    }
}
