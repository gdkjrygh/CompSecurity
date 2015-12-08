// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            BaseNodeDeserializer

public class JsonNodeDeserializer extends BaseNodeDeserializer
{

    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    protected JsonNodeDeserializer()
    {
        super(org/codehaus/jackson/JsonNode);
    }

    public static JsonDeserializer getDeserializer(Class class1)
    {
    /* block-local class not found */
    class ObjectDeserializer {}

        if (class1 == org/codehaus/jackson/node/ObjectNode)
        {
            return ObjectDeserializer.getInstance();
        }
    /* block-local class not found */
    class ArrayDeserializer {}

        if (class1 == org/codehaus/jackson/node/ArrayNode)
        {
            return ArrayDeserializer.getInstance();
        } else
        {
            return instance;
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public JsonNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsonparser.getCurrentToken().ordinal()])
        {
        default:
            return deserializeAny(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());

        case 1: // '\001'
            return deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());

        case 2: // '\002'
            return deserializeArray(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
        }
    }

    public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return super.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
    }

}
