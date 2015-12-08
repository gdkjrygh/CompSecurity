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

static final class  extends 
{

    private final float[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.PTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
        {
            return null;
        }
        if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.NGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_valueClass);
        } else
        {
            return (new float[] {
                _parseFloatPrimitive(jsonparser, deserializationcontext)
            });
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public float[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        org.codehaus.jackson.map.util.eser eser = deserializationcontext.getArrayBuilders().getFloatBuilder();
        float af[] = (float[])eser.t();
        int i = 0;
        while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
        {
            float f = _parseFloatPrimitive(jsonparser, deserializationcontext);
            float af1[] = af;
            int j = i;
            if (i >= af.length)
            {
                af1 = (float[])eser.tedChunk(af, i);
                j = 0;
            }
            af1[j] = f;
            i = j + 1;
            af = af1;
        }
        return (float[])eser.learBuffer(af, i);
    }

    public ()
    {
        super([F);
    }
}
