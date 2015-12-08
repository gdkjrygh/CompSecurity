// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            StdDeserializerProvider

protected static final class _deserializer extends JsonDeserializer
{

    final JsonDeserializer _deserializer;
    final TypeDeserializer _typeDeserializer;

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserializer.deserializeWithType(jsonparser, deserializationcontext, _typeDeserializer);
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        return _deserializer.deserialize(jsonparser, deserializationcontext, obj);
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public (TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
    {
        _typeDeserializer = typedeserializer;
        _deserializer = jsondeserializer;
    }
}
