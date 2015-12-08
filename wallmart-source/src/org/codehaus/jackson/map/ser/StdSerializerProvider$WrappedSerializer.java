// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser:
//            StdSerializerProvider

private static final class _serializer extends JsonSerializer
{

    protected final JsonSerializer _serializer;
    protected final TypeSerializer _typeSerializer;

    public Class handledType()
    {
        return java/lang/Object;
    }

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        _serializer.serializeWithType(obj, jsongenerator, serializerprovider, _typeSerializer);
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        _serializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
    }

    public (TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        _typeSerializer = typeserializer;
        _serializer = jsonserializer;
    }
}
