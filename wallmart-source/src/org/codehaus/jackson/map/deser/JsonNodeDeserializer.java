// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;

public class JsonNodeDeserializer extends org.codehaus.jackson.map.deser.std.JsonNodeDeserializer
{

    public static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    public JsonNodeDeserializer()
    {
    }

    protected final JsonNode deserializeAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserializeAny(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
    }

    protected final ArrayNode deserializeArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserializeArray(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
    }

    protected final ObjectNode deserializeObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
    }

}
