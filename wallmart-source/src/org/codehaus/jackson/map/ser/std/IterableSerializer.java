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
//            AsArraySerializerBase, ContainerSerializerBase

public class IterableSerializer extends AsArraySerializerBase
{

    public IterableSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        super(java/lang/Iterable, javatype, flag, typeserializer, beanproperty, null);
    }

    public ContainerSerializerBase _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new IterableSerializer(_elementType, _staticTyping, typeserializer, _property);
    }

    public void serializeContents(Iterable iterable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext())
        {
            TypeSerializer typeserializer = _valueTypeSerializer;
            iterable = null;
            Class class1 = null;
            do
            {
                Object obj1 = iterator.next();
                if (obj1 == null)
                {
                    serializerprovider.defaultSerializeNull(jsongenerator);
                } else
                {
                    Class class2 = obj1.getClass();
                    Object obj;
                    if (class2 == class1)
                    {
                        obj = iterable;
                    } else
                    {
                        obj = serializerprovider.findValueSerializer(class2, _property);
                        iterable = ((Iterable) (obj));
                        class1 = class2;
                    }
                    if (typeserializer == null)
                    {
                        ((JsonSerializer) (obj)).serialize(obj1, jsongenerator, serializerprovider);
                    } else
                    {
                        ((JsonSerializer) (obj)).serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
                    }
                }
            } while (iterator.hasNext());
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((Iterable)obj, jsongenerator, serializerprovider);
    }
}
