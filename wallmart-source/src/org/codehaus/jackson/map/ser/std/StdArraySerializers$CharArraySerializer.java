// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.node.ObjectNode;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            SerializerBase, StdArraySerializers

public static final class  extends SerializerBase
{

    private final void _writeArrayContents(JsonGenerator jsongenerator, char ac[])
        throws IOException, JsonGenerationException
    {
        int i = 0;
        for (int j = ac.length; i < j; i++)
        {
            jsongenerator.writeString(ac, i, 1);
        }

    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        serializerprovider = createSchemaNode("array", true);
        type = createSchemaNode("string");
        type.put("type", "string");
        serializerprovider.put("items", type);
        return serializerprovider;
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((char[])obj, jsongenerator, serializerprovider);
    }

    public void serialize(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (serializerprovider.isEnabled(org.codehaus.jackson.map.RRAYS_AS_JSON_ARRAYS))
        {
            jsongenerator.writeStartArray();
            _writeArrayContents(jsongenerator, ac);
            jsongenerator.writeEndArray();
            return;
        } else
        {
            jsongenerator.writeString(ac, 0, ac.length);
            return;
        }
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((char[])obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        if (serializerprovider.isEnabled(org.codehaus.jackson.map.RRAYS_AS_JSON_ARRAYS))
        {
            typeserializer.writeTypePrefixForArray(ac, jsongenerator);
            _writeArrayContents(jsongenerator, ac);
            typeserializer.writeTypeSuffixForArray(ac, jsongenerator);
            return;
        } else
        {
            typeserializer.writeTypePrefixForScalar(ac, jsongenerator);
            jsongenerator.writeString(ac, 0, ac.length);
            typeserializer.writeTypeSuffixForScalar(ac, jsongenerator);
            return;
        }
    }

    public ()
    {
        super([C);
    }
}
