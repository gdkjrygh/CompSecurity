// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer, StdDeserializer

public static final class  extends StdScalarDeserializer
{

    public Number deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken;
        jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT)
        {
            if (deserializationcontext.isEnabled(org.codehaus.jackson.map.IG_INTEGER_FOR_INTS))
            {
                return jsonparser.getBigIntegerValue();
            } else
            {
                return jsonparser.getNumberValue();
            }
        }
        if (jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            if (deserializationcontext.isEnabled(org.codehaus.jackson.map.IG_DECIMAL_FOR_FLOATS))
            {
                return jsonparser.getDecimalValue();
            } else
            {
                return Double.valueOf(jsonparser.getDoubleValue());
            }
        }
        if (jsontoken != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.indexOf('.') < 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.IG_DECIMAL_FOR_FLOATS))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        jsonparser = new BigDecimal(jsonparser);
        return jsonparser;
        return new Double(jsonparser);
        long l;
        if (deserializationcontext.isEnabled(org.codehaus.jackson.map.IG_INTEGER_FOR_INTS))
        {
            return new BigInteger(jsonparser);
        }
        l = Long.parseLong(jsonparser);
        if (l <= 0x7fffffffL && l >= 0xffffffff80000000L)
        {
            try
            {
                return Integer.valueOf((int)l);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid number");
            }
        } else
        {
            return Long.valueOf(l);
        }
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        switch (dehaus.jackson.JsonToken[jsonparser.getCurrentToken().ordinal()])
        {
        default:
            return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return deserialize(jsonparser, deserializationcontext);
        }
    }

    public ()
    {
        super(java/lang/Number);
    }
}
