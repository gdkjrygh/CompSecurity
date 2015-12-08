// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;

// Referenced classes of package org.codehaus.jackson.map:
//            SerializerProvider, TypeSerializer

public abstract class JsonSerializer
{
    public static abstract class None extends JsonSerializer
    {

        public None()
        {
        }
    }


    public JsonSerializer()
    {
    }

    public Class handledType()
    {
        return null;
    }

    public boolean isUnwrappingSerializer()
    {
        return false;
    }

    public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException;

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serialize(obj, jsongenerator, serializerprovider);
    }

    public JsonSerializer unwrappingSerializer()
    {
        return this;
    }
}
