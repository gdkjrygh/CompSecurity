// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ResolvableSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            StaticListSerializerBase

public final class IndexedStringListSerializer extends StaticListSerializerBase
    implements ResolvableSerializer
{

    protected JsonSerializer _serializer;

    public IndexedStringListSerializer(BeanProperty beanproperty)
    {
        this(beanproperty, null);
    }

    public IndexedStringListSerializer(BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        super(java/util/List, beanproperty);
        _serializer = jsonserializer;
    }

    private final void serializeContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int i;
        int j;
        j = 0;
        i = 0;
        int k = list.size();
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        j = i;
        String s = (String)list.get(i);
        if (s == null)
        {
            j = i;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                break MISSING_BLOCK_LABEL_79;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                wrapAndThrow(serializerprovider, jsongenerator, list, j);
            }
            break MISSING_BLOCK_LABEL_78;
        }
        j = i;
        jsongenerator.writeString(s);
        break MISSING_BLOCK_LABEL_79;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private final void serializeUsingCustom(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int i;
        int j;
        i = 0;
        j = i;
        int k = list.size();
        j = i;
        JsonSerializer jsonserializer = _serializer;
        i = 0;
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        j = i;
        String s = (String)list.get(i);
        if (s == null)
        {
            j = i;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                break MISSING_BLOCK_LABEL_96;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                wrapAndThrow(serializerprovider, jsongenerator, list, j);
            }
            break MISSING_BLOCK_LABEL_95;
        }
        j = i;
        jsonserializer.serialize(s, jsongenerator, serializerprovider);
        break MISSING_BLOCK_LABEL_96;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected JsonNode contentSchema()
    {
        return createSchemaNode("string", true);
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_serializer == null)
        {
            serializerprovider = serializerprovider.findValueSerializer(java/lang/String, _property);
            if (!isDefaultSerializer(serializerprovider))
            {
                _serializer = serializerprovider;
            }
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((List)obj, jsongenerator, serializerprovider);
    }

    public void serialize(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartArray();
        if (_serializer == null)
        {
            serializeContents(list, jsongenerator, serializerprovider);
        } else
        {
            serializeUsingCustom(list, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndArray();
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((List)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForArray(list, jsongenerator);
        if (_serializer == null)
        {
            serializeContents(list, jsongenerator, serializerprovider);
        } else
        {
            serializeUsingCustom(list, jsongenerator, serializerprovider);
        }
        typeserializer.writeTypeSuffixForArray(list, jsongenerator);
    }
}
