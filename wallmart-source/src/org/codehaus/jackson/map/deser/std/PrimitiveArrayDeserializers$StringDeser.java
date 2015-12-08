// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.util.ObjectBuffer;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            PrimitiveArrayDeserializers

static final class  extends 
{

    private final String[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj = null;
        if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.GLE_VALUE_AS_ARRAY))
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.TY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            } else
            {
                throw deserializationcontext.mappingException(_valueClass);
            }
        }
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            jsonparser = obj;
        } else
        {
            jsonparser = jsonparser.getText();
        }
        return (new String[] {
            jsonparser
        });
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj[] = objectbuffer.resetAndStart();
        int i = 0;
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj != JsonToken.END_ARRAY)
            {
                Object aobj1[];
                int j;
                if (obj == JsonToken.VALUE_NULL)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.getText();
                }
                aobj1 = aobj;
                j = i;
                if (i >= aobj.length)
                {
                    aobj1 = objectbuffer.appendCompletedChunk(aobj);
                    j = 0;
                }
                aobj1[j] = obj;
                i = j + 1;
                aobj = aobj1;
            } else
            {
                jsonparser = (String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String);
                deserializationcontext.returnObjectBuffer(objectbuffer);
                return jsonparser;
            }
        } while (true);
    }

    public ()
    {
        super([Ljava/lang/String;);
    }
}
