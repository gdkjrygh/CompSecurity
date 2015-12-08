// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdDeserializer

public static final class rializer extends rializer
{

    public Character deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT)
        {
            int i = jsonparser.getIntValue();
            if (i >= 0 && i <= 65535)
            {
                return Character.valueOf((char)i);
            }
        } else
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText();
            if (jsonparser.length() == 1)
            {
                return Character.valueOf(jsonparser.charAt(0));
            }
            if (jsonparser.length() == 0)
            {
                return (Character)getEmptyValue();
            }
        }
        throw deserializationcontext.mappingException(_valueClass, jsontoken);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public rializer(Class class1, Character character)
    {
        super(class1, character);
    }
}
