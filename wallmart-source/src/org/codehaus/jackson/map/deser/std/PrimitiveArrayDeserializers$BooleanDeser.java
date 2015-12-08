// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.util.ArrayBuilders;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            PrimitiveArrayDeserializers

static final class Q extends Q
{

    private final boolean[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.Y_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
        {
            return null;
        }
        if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.LE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_valueClass);
        } else
        {
            return (new boolean[] {
                _parseBooleanPrimitive(jsonparser, deserializationcontext)
            });
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        org.codehaus.jackson.map.util.eser eser = deserializationcontext.getArrayBuilders().getBooleanBuilder();
        boolean aflag[] = (boolean[])eser.t();
        int i = 0;
        while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
        {
            boolean flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
            boolean aflag1[] = aflag;
            int j = i;
            if (i >= aflag.length)
            {
                aflag1 = (boolean[])eser.tedChunk(aflag, i);
                j = 0;
            }
            aflag1[j] = flag;
            i = j + 1;
            aflag = aflag1;
        }
        return (boolean[])eser.learBuffer(aflag, i);
    }

    public Q()
    {
        super([Z);
    }
}
