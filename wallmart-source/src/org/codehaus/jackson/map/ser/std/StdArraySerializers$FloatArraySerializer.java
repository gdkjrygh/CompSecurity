// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.node.ObjectNode;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            StdArraySerializers, ContainerSerializerBase

public static final class init> extends init>
{

    public ContainerSerializerBase _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new <init>(typeserializer);
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        serializerprovider = createSchemaNode("array", true);
        serializerprovider.put("items", createSchemaNode("number"));
        return serializerprovider;
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((float[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(float af[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int i = 0;
        for (int j = af.length; i < j; i++)
        {
            jsongenerator.writeNumber(af[i]);
        }

    }

    public ()
    {
        this(null);
    }

    public <init>(TypeSerializer typeserializer)
    {
        super([F, typeserializer, null);
    }
}
