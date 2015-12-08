// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ContainerSerializerBase, StdArraySerializers

public static abstract class _property extends ContainerSerializerBase
{

    protected final BeanProperty _property;
    protected final TypeSerializer _valueTypeSerializer;

    public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartArray();
        serializeContents(obj, jsongenerator, serializerprovider);
        jsongenerator.writeEndArray();
    }

    protected abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException;

    public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForArray(obj, jsongenerator);
        serializeContents(obj, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForArray(obj, jsongenerator);
    }

    protected (Class class1, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        super(class1);
        _valueTypeSerializer = typeserializer;
        _property = beanproperty;
    }
}
