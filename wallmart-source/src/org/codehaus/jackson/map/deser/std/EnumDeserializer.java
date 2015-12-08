// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.EnumResolver;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer

public class EnumDeserializer extends StdScalarDeserializer
{

    protected final EnumResolver _resolver;

    public EnumDeserializer(EnumResolver enumresolver)
    {
        super(java/lang/Enum);
        _resolver = enumresolver;
    }

    public static JsonDeserializer deserializerForCreator(DeserializationConfig deserializationconfig, Class class1, AnnotatedMethod annotatedmethod)
    {
        Object obj = annotatedmethod.getParameterClass(0);
    /* block-local class not found */
    class FactoryBasedDeserializer {}

        if (obj == java/lang/String)
        {
            obj = null;
        } else
        if (obj == Integer.TYPE || obj == java/lang/Integer)
        {
            obj = java/lang/Integer;
        } else
        if (obj == Long.TYPE || obj == java/lang/Long)
        {
            obj = java/lang/Long;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Parameter #0 type for factory method (").append(annotatedmethod).append(") not suitable, must be java.lang.String or int/Integer/long/Long").toString());
        }
        if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.CAN_OVERRIDE_ACCESS_MODIFIERS))
        {
            ClassUtil.checkAndFixAccess(annotatedmethod.getMember());
        }
        return new FactoryBasedDeserializer(class1, annotatedmethod, ((Class) (obj)));
    }

    public Enum deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_STRING || jsontoken == JsonToken.FIELD_NAME)
        {
            jsonparser = jsonparser.getText();
            jsonparser = _resolver.findEnum(jsonparser);
            if (jsonparser == null)
            {
                throw deserializationcontext.weirdStringException(_resolver.getEnumClass(), "value not one of declared Enum instance names");
            } else
            {
                return jsonparser;
            }
        }
        if (jsontoken == JsonToken.VALUE_NUMBER_INT)
        {
            if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_NUMBERS_FOR_ENUMS))
            {
                throw deserializationcontext.mappingException("Not allowed to deserialize Enum value out of JSON number (disable DeserializationConfig.Feature.FAIL_ON_NUMBERS_FOR_ENUMS to allow)");
            }
            int i = jsonparser.getIntValue();
            jsonparser = _resolver.getEnum(i);
            if (jsonparser == null)
            {
                throw deserializationcontext.weirdNumberException(_resolver.getEnumClass(), (new StringBuilder()).append("index value outside legal index range [0..").append(_resolver.lastValidIndex()).append("]").toString());
            } else
            {
                return jsonparser;
            }
        } else
        {
            throw deserializationcontext.mappingException(_resolver.getEnumClass());
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }
}
