// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;

// Referenced classes of package org.codehaus.jackson.map:
//            TypeDeserializer, DeserializationContext

public abstract class JsonDeserializer
{
    public static abstract class None extends JsonDeserializer
    {

        public None()
        {
        }
    }


    public JsonDeserializer()
    {
    }

    public abstract Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException;

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Can not update object of type ").append(obj.getClass().getName()).append(" (by deserializer of type ").append(getClass().getName()).append(")").toString());
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }

    public Object getEmptyValue()
    {
        return getNullValue();
    }

    public Object getNullValue()
    {
        return null;
    }

    public JsonDeserializer unwrappingDeserializer()
    {
        return this;
    }
}
