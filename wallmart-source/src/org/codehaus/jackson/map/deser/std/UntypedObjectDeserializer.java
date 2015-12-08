// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.util.ObjectBuffer;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdDeserializer

public class UntypedObjectDeserializer extends StdDeserializer
{

    private static final Object NO_OBJECTS[] = new Object[0];

    public UntypedObjectDeserializer()
    {
        super(java/lang/Object);
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        static class _cls1
        {

            static final int $SwitchMap$org$codehaus$jackson$JsonToken[];

            static 
            {
                $SwitchMap$org$codehaus$jackson$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$org$codehaus$jackson$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsonparser.getCurrentToken().ordinal()])
        {
        case 2: // '\002'
        case 4: // '\004'
        default:
            throw deserializationcontext.mappingException(java/lang/Object);

        case 1: // '\001'
            return mapObject(jsonparser, deserializationcontext);

        case 3: // '\003'
            return mapArray(jsonparser, deserializationcontext);

        case 5: // '\005'
            return mapObject(jsonparser, deserializationcontext);

        case 6: // '\006'
            return jsonparser.getEmbeddedObject();

        case 7: // '\007'
            return jsonparser.getText();

        case 8: // '\b'
            if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_BIG_INTEGER_FOR_INTS))
            {
                return jsonparser.getBigIntegerValue();
            } else
            {
                return jsonparser.getNumberValue();
            }

        case 9: // '\t'
            if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                return jsonparser.getDecimalValue();
            } else
            {
                return Double.valueOf(jsonparser.getDoubleValue());
            }

        case 10: // '\n'
            return Boolean.TRUE;

        case 11: // '\013'
            return Boolean.FALSE;

        case 12: // '\f'
            return null;
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        switch (_cls1..SwitchMap.org.codehaus.jackson.JsonToken[jsontoken.ordinal()])
        {
        case 2: // '\002'
        case 4: // '\004'
        default:
            throw deserializationcontext.mappingException(java/lang/Object);

        case 1: // '\001'
        case 3: // '\003'
        case 5: // '\005'
            return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);

        case 7: // '\007'
            return jsonparser.getText();

        case 8: // '\b'
            if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_BIG_INTEGER_FOR_INTS))
            {
                return jsonparser.getBigIntegerValue();
            } else
            {
                return Integer.valueOf(jsonparser.getIntValue());
            }

        case 9: // '\t'
            if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                return jsonparser.getDecimalValue();
            } else
            {
                return Double.valueOf(jsonparser.getDoubleValue());
            }

        case 10: // '\n'
            return Boolean.TRUE;

        case 11: // '\013'
            return Boolean.FALSE;

        case 6: // '\006'
            return jsonparser.getEmbeddedObject();

        case 12: // '\f'
            return null;
        }
    }

    protected Object mapArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_JAVA_ARRAY_FOR_JSON_ARRAY))
        {
            return ((Object) (mapArrayToArray(jsonparser, deserializationcontext)));
        }
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            return new ArrayList(4);
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj1[] = objectbuffer.resetAndStart();
        int i = 0;
        int j = 0;
        do
        {
            Object obj = deserialize(jsonparser, deserializationcontext);
            int k = j + 1;
            j = i;
            Object aobj[] = aobj1;
            if (i >= aobj1.length)
            {
                aobj = objectbuffer.appendCompletedChunk(aobj1);
                j = 0;
            }
            i = j + 1;
            aobj[j] = obj;
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                jsonparser = new ArrayList((k >> 3) + k + 1);
                objectbuffer.completeAndClearBuffer(aobj, i, jsonparser);
                return jsonparser;
            }
            j = k;
            aobj1 = aobj;
        } while (true);
    }

    protected Object[] mapArrayToArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            return NO_OBJECTS;
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj[] = objectbuffer.resetAndStart();
        int i = 0;
        do
        {
            Object obj = deserialize(jsonparser, deserializationcontext);
            int j = i;
            Object aobj1[] = aobj;
            if (i >= aobj.length)
            {
                aobj1 = objectbuffer.appendCompletedChunk(aobj);
                j = 0;
            }
            i = j + 1;
            aobj1[j] = obj;
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                return objectbuffer.completeAndClearBuffer(aobj1, i);
            }
            aobj = aobj1;
        } while (true);
    }

    protected Object mapObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj1 = jsonparser.getCurrentToken();
        Object obj = obj1;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
        if (obj != JsonToken.FIELD_NAME)
        {
            return new LinkedHashMap(4);
        }
        obj = jsonparser.getText();
        jsonparser.nextToken();
        obj1 = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            jsonparser = new LinkedHashMap(4);
            jsonparser.put(obj, obj1);
            return jsonparser;
        }
        String s1 = jsonparser.getText();
        jsonparser.nextToken();
        Object obj2 = deserialize(jsonparser, deserializationcontext);
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            jsonparser = new LinkedHashMap(4);
            jsonparser.put(obj, obj1);
            jsonparser.put(s1, obj2);
            return jsonparser;
        }
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        linkedhashmap.put(obj, obj1);
        linkedhashmap.put(s1, obj2);
        do
        {
            String s = jsonparser.getText();
            jsonparser.nextToken();
            linkedhashmap.put(s, deserialize(jsonparser, deserializationcontext));
        } while (jsonparser.nextToken() != JsonToken.END_OBJECT);
        return linkedhashmap;
    }

}
