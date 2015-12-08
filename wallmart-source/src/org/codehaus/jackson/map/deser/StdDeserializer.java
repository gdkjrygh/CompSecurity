// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.Base64Variants;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.std.StdScalarDeserializer;
import org.codehaus.jackson.type.JavaType;

public abstract class StdDeserializer extends org.codehaus.jackson.map.deser.std.StdDeserializer
{
    public class CalendarDeserializer extends org.codehaus.jackson.map.deser.std.CalendarDeserializer
    {

        final StdDeserializer this$0;

        public CalendarDeserializer()
        {
            this$0 = StdDeserializer.this;
            super();
        }
    }

    public class ClassDeserializer extends org.codehaus.jackson.map.deser.std.ClassDeserializer
    {

        final StdDeserializer this$0;

        public ClassDeserializer()
        {
            this$0 = StdDeserializer.this;
            super();
        }
    }

    public static final class StringDeserializer extends StdScalarDeserializer
    {

        public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public String deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                return jsonparser.getText();
            }
            if (jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
            {
                jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
                if (jsonparser == null)
                {
                    return null;
                }
                if (jsonparser instanceof byte[])
                {
                    return Base64Variants.getDefaultVariant().encode((byte[])(byte[])jsonparser, false);
                } else
                {
                    return jsonparser.toString();
                }
            }
            if (jsontoken.isScalarValue())
            {
                return jsonparser.getText();
            } else
            {
                throw deserializationcontext.mappingException(_valueClass, jsontoken);
            }
        }

        public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
        }

        public String deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            return deserialize(jsonparser, deserializationcontext);
        }

        public StringDeserializer()
        {
            super(java/lang/String);
        }
    }


    protected StdDeserializer(Class class1)
    {
        super(class1);
    }

    protected StdDeserializer(JavaType javatype)
    {
        super(javatype);
    }
}
