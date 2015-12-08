// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
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

public class StringCollectionSerializer extends StaticListSerializerBase
    implements ResolvableSerializer
{

    protected JsonSerializer _serializer;

    public StringCollectionSerializer(BeanProperty beanproperty)
    {
        this(beanproperty, null);
    }

    public StringCollectionSerializer(BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        super(java/util/Collection, beanproperty);
        _serializer = jsonserializer;
    }

    private final void serializeContents(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_serializer == null) goto _L2; else goto _L1
_L1:
        serializeUsingCustom(collection, jsongenerator, serializerprovider);
_L6:
        return;
_L2:
        Iterator iterator;
        int i;
        i = 0;
        iterator = collection.iterator();
_L4:
label0:
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            String s = (String)iterator.next();
            if (s == null)
            {
                try
                {
                    serializerprovider.defaultSerializeNull(jsongenerator);
                    break label0;
                }
                catch (Exception exception)
                {
                    wrapAndThrow(serializerprovider, exception, collection, i);
                }
                break; /* Loop/switch isn't completed */
            }
        }
        jsongenerator.writeString(s);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void serializeUsingCustom(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        JsonSerializer jsonserializer;
        Iterator iterator;
        jsonserializer = _serializer;
        iterator = collection.iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)iterator.next();
        if (obj == null)
        {
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                wrapAndThrow(serializerprovider, ((Throwable) (obj)), collection, 0);
            }
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
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
        serialize((Collection)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartArray();
        if (_serializer == null)
        {
            serializeContents(collection, jsongenerator, serializerprovider);
        } else
        {
            serializeUsingCustom(collection, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndArray();
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((Collection)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForArray(collection, jsongenerator);
        if (_serializer == null)
        {
            serializeContents(collection, jsongenerator, serializerprovider);
        } else
        {
            serializeUsingCustom(collection, jsongenerator, serializerprovider);
        }
        typeserializer.writeTypeSuffixForArray(collection, jsongenerator);
    }
}
