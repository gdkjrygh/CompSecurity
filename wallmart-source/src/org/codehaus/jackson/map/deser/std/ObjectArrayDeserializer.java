// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.lang.reflect.Array;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.util.ObjectBuffer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            ContainerDeserializerBase

public class ObjectArrayDeserializer extends ContainerDeserializerBase
{

    protected final JavaType _arrayType;
    protected final Class _elementClass;
    protected final JsonDeserializer _elementDeserializer;
    protected final TypeDeserializer _elementTypeDeserializer;
    protected final boolean _untyped;

    public ObjectArrayDeserializer(ArrayType arraytype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super([Ljava/lang/Object;);
        _arrayType = arraytype;
        _elementClass = arraytype.getContentType().getRawClass();
        boolean flag;
        if (_elementClass == java/lang/Object)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _untyped = flag;
        _elementDeserializer = jsondeserializer;
        _elementTypeDeserializer = typedeserializer;
    }

    private final Object[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
        {
            return null;
        }
        if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && _elementClass == java/lang/Byte)
            {
                return deserializeFromBase64(jsonparser, deserializationcontext);
            } else
            {
                throw deserializationcontext.mappingException(_arrayType.getRawClass());
            }
        }
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            jsonparser = null;
        } else
        if (_elementTypeDeserializer == null)
        {
            jsonparser = ((JsonParser) (_elementDeserializer.deserialize(jsonparser, deserializationcontext)));
        } else
        {
            jsonparser = ((JsonParser) (_elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, _elementTypeDeserializer)));
        }
        if (_untyped)
        {
            deserializationcontext = ((DeserializationContext) (new Object[1]));
        } else
        {
            deserializationcontext = ((DeserializationContext) ((Object[])(Object[])Array.newInstance(_elementClass, 1)));
        }
        deserializationcontext[0] = jsonparser;
        return deserializationcontext;
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return ((Object) (deserialize(jsonparser, deserializationcontext)));
    }

    public Object[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj[] = objectbuffer.resetAndStart();
        int i = 0;
        TypeDeserializer typedeserializer = _elementTypeDeserializer;
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj == JsonToken.END_ARRAY)
            {
                break;
            }
            Object aobj1[];
            int j;
            if (obj == JsonToken.VALUE_NULL)
            {
                obj = null;
            } else
            if (typedeserializer == null)
            {
                obj = _elementDeserializer.deserialize(jsonparser, deserializationcontext);
            } else
            {
                obj = _elementDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
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
        } while (true);
        if (_untyped)
        {
            jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj, i)));
        } else
        {
            jsonparser = ((JsonParser) (objectbuffer.completeAndClearBuffer(aobj, i, _elementClass)));
        }
        deserializationcontext.returnObjectBuffer(objectbuffer);
        return jsonparser;
    }

    protected Byte[] deserializeFromBase64(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        jsonparser = jsonparser.getBinaryValue(deserializationcontext.getBase64Variant());
        deserializationcontext = new Byte[jsonparser.length];
        int i = 0;
        for (int j = jsonparser.length; i < j; i++)
        {
            deserializationcontext[i] = Byte.valueOf(jsonparser[i]);
        }

        return deserializationcontext;
    }

    public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
    }

    public Object[] deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return (Object[])(Object[])typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _elementDeserializer;
    }

    public JavaType getContentType()
    {
        return _arrayType.getContentType();
    }
}
