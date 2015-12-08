// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.math.BigDecimal;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer, StdDeserializer

public static class  extends StdScalarDeserializer
{

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public BigDecimal deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return jsonparser.getDecimalValue();
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.length() == 0)
            {
                return null;
            }
            try
            {
                jsonparser = new BigDecimal(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid representation");
            }
            return jsonparser;
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    public ()
    {
        super(java/math/BigDecimal);
    }
}
