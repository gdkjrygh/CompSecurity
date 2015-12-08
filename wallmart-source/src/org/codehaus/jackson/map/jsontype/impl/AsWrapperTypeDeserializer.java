// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.jsontype.impl;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.jsontype.impl:
//            TypeDeserializerBase

public class AsWrapperTypeDeserializer extends TypeDeserializerBase
{

    public AsWrapperTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, BeanProperty beanproperty)
    {
        this(javatype, typeidresolver, beanproperty, null);
    }

    public AsWrapperTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, BeanProperty beanproperty, Class class1)
    {
        super(javatype, typeidresolver, beanproperty, null);
    }

    private final Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.START_OBJECT, (new StringBuilder()).append("need JSON Object to contain As.WRAPPER_OBJECT type information for class ").append(baseTypeName()).toString());
        }
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.FIELD_NAME, (new StringBuilder()).append("need JSON String that contains type id (for subtype of ").append(baseTypeName()).append(")").toString());
        }
        Object obj = _findDeserializer(deserializationcontext, jsonparser.getText());
        jsonparser.nextToken();
        obj = ((JsonDeserializer) (obj)).deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() != JsonToken.END_OBJECT)
        {
            throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_OBJECT, "expected closing END_OBJECT after type information and deserialized value");
        } else
        {
            return obj;
        }
    }

    public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeTypedFromScalar(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _deserialize(jsonparser, deserializationcontext);
    }

    public org.codehaus.jackson.annotate.JsonTypeInfo.As getTypeInclusion()
    {
        return org.codehaus.jackson.annotate.JsonTypeInfo.As.WRAPPER_OBJECT;
    }
}
