// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            SerializerBase

public abstract class ScalarSerializerBase extends SerializerBase
{

    protected ScalarSerializerBase(Class class1)
    {
        super(class1);
    }

    protected ScalarSerializerBase(Class class1, boolean flag)
    {
        super(class1);
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        throws JsonMappingException
    {
        return createSchemaNode("string", true);
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
        serialize(obj, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
    }
}
