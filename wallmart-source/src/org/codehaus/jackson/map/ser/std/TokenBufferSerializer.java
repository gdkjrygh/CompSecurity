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
import org.codehaus.jackson.util.TokenBuffer;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            SerializerBase

public class TokenBufferSerializer extends SerializerBase
{

    public TokenBufferSerializer()
    {
        super(org/codehaus/jackson/util/TokenBuffer);
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        return createSchemaNode("any", true);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((TokenBuffer)obj, jsongenerator, serializerprovider);
    }

    public void serialize(TokenBuffer tokenbuffer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        tokenbuffer.serialize(jsongenerator);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((TokenBuffer)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public final void serializeWithType(TokenBuffer tokenbuffer, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForScalar(tokenbuffer, jsongenerator);
        serialize(tokenbuffer, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(tokenbuffer, jsongenerator);
    }
}
