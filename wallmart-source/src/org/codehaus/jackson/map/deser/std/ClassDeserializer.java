// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.util.ClassUtil;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer

public class ClassDeserializer extends StdScalarDeserializer
{

    public ClassDeserializer()
    {
        super(java/lang/Class);
    }

    public Class deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText();
            try
            {
                jsonparser = ClassUtil.findClass(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.instantiationException(_valueClass, jsonparser);
            }
            return jsonparser;
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }
}
