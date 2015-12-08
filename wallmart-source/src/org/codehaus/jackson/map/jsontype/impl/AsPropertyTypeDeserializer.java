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
import org.codehaus.jackson.util.JsonParserSequence;
import org.codehaus.jackson.util.TokenBuffer;

// Referenced classes of package org.codehaus.jackson.map.jsontype.impl:
//            AsArrayTypeDeserializer

public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer
{

    protected final String _typePropertyName;

    public AsPropertyTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, BeanProperty beanproperty, Class class1, String s)
    {
        super(javatype, typeidresolver, beanproperty, class1);
        _typePropertyName = s;
    }

    public AsPropertyTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, BeanProperty beanproperty, String s)
    {
        this(javatype, typeidresolver, beanproperty, null, s);
    }

    protected Object _deserializeIfNatural(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
    /* anonymous class not found */
    class _anm1 {}

        _cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsonparser.getCurrentToken().ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 46
    //                   2 66
    //                   3 89
    //                   4 112
    //                   5 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return null;
_L2:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/String))
        {
            return jsonparser.getText();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/Integer))
        {
            return Integer.valueOf(jsonparser.getIntValue());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/Double))
        {
            return Double.valueOf(jsonparser.getDoubleValue());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/Boolean))
        {
            return Boolean.TRUE;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (_baseType.getRawClass().isAssignableFrom(java/lang/Boolean))
        {
            return Boolean.FALSE;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    protected Object _deserializeTypedUsingDefaultImpl(JsonParser jsonparser, DeserializationContext deserializationcontext, TokenBuffer tokenbuffer)
        throws IOException, JsonProcessingException
    {
        if (_defaultImpl != null)
        {
            JsonDeserializer jsondeserializer = _findDefaultImplDeserializer(deserializationcontext);
            JsonParser jsonparser1 = jsonparser;
            if (tokenbuffer != null)
            {
                tokenbuffer.writeEndObject();
                jsonparser1 = tokenbuffer.asParser(jsonparser);
                jsonparser1.nextToken();
            }
            tokenbuffer = ((TokenBuffer) (jsondeserializer.deserialize(jsonparser1, deserializationcontext)));
        } else
        {
            Object obj = _deserializeIfNatural(jsonparser, deserializationcontext);
            tokenbuffer = ((TokenBuffer) (obj));
            if (obj == null)
            {
                if (jsonparser.getCurrentToken() == JsonToken.START_ARRAY)
                {
                    return super.deserializeTypedFromAny(jsonparser, deserializationcontext);
                } else
                {
                    throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.FIELD_NAME, (new StringBuilder()).append("missing property '").append(_typePropertyName).append("' that is to contain type id  (for class ").append(baseTypeName()).append(")").toString());
                }
            }
        }
        return tokenbuffer;
    }

    public Object deserializeTypedFromAny(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() == JsonToken.START_ARRAY)
        {
            return super.deserializeTypedFromArray(jsonparser, deserializationcontext);
        } else
        {
            return deserializeTypedFromObject(jsonparser, deserializationcontext);
        }
    }

    public Object deserializeTypedFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj1 = jsonparser.getCurrentToken();
        Object obj;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        } else
        {
            if (obj1 == JsonToken.START_ARRAY)
            {
                return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, null);
            }
            obj = obj1;
            if (obj1 != JsonToken.FIELD_NAME)
            {
                return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, null);
            }
        }
        obj1 = null;
        for (Object obj2 = obj; obj2 == JsonToken.FIELD_NAME;)
        {
            obj2 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            if (_typePropertyName.equals(obj2))
            {
                obj2 = _findDeserializer(deserializationcontext, jsonparser.getText());
                obj = jsonparser;
                if (obj1 != null)
                {
                    obj = JsonParserSequence.createFlattened(((TokenBuffer) (obj1)).asParser(jsonparser), jsonparser);
                }
                ((JsonParser) (obj)).nextToken();
                return ((JsonDeserializer) (obj2)).deserialize(((JsonParser) (obj)), deserializationcontext);
            }
            obj = obj1;
            if (obj1 == null)
            {
                obj = new TokenBuffer(null);
            }
            ((TokenBuffer) (obj)).writeFieldName(((String) (obj2)));
            ((TokenBuffer) (obj)).copyCurrentStructure(jsonparser);
            obj2 = jsonparser.nextToken();
            obj1 = obj;
        }

        return _deserializeTypedUsingDefaultImpl(jsonparser, deserializationcontext, ((TokenBuffer) (obj1)));
    }

    public String getPropertyName()
    {
        return _typePropertyName;
    }

    public org.codehaus.jackson.annotate.JsonTypeInfo.As getTypeInclusion()
    {
        return org.codehaus.jackson.annotate.JsonTypeInfo.As.PROPERTY;
    }
}
