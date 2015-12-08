// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ResolvableSerializer;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.util.EnumValues;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ContainerSerializerBase, SerializerBase, EnumSerializer

public class EnumMapSerializer extends ContainerSerializerBase
    implements ResolvableSerializer
{

    protected final EnumValues _keyEnums;
    protected final BeanProperty _property;
    protected final boolean _staticTyping;
    protected JsonSerializer _valueSerializer;
    protected final JavaType _valueType;
    protected final TypeSerializer _valueTypeSerializer;

    public EnumMapSerializer(JavaType javatype, boolean flag, EnumValues enumvalues, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        this(javatype, flag, enumvalues, typeserializer, beanproperty, null);
    }

    public EnumMapSerializer(JavaType javatype, boolean flag, EnumValues enumvalues, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
label0:
        {
            boolean flag1 = false;
            super(java/util/EnumMap, false);
            if (!flag)
            {
                flag = flag1;
                if (javatype == null)
                {
                    break label0;
                }
                flag = flag1;
                if (!javatype.isFinal())
                {
                    break label0;
                }
            }
            flag = true;
        }
        _staticTyping = flag;
        _valueType = javatype;
        _keyEnums = enumvalues;
        _valueTypeSerializer = typeserializer;
        _property = beanproperty;
        _valueSerializer = jsonserializer;
    }

    public ContainerSerializerBase _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new EnumMapSerializer(_valueType, _staticTyping, _keyEnums, typeserializer, _property, _valueSerializer);
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        throws JsonMappingException
    {
        ObjectNode objectnode = createSchemaNode("object", true);
        if (type instanceof ParameterizedType)
        {
            Type atype[] = ((ParameterizedType)type).getActualTypeArguments();
            if (atype.length == 2)
            {
                type = serializerprovider.constructType(atype[0]);
                JavaType javatype = serializerprovider.constructType(atype[1]);
                ObjectNode objectnode1 = JsonNodeFactory.instance.objectNode();
                Enum aenum[] = (Enum[])type.getRawClass().getEnumConstants();
                int j = aenum.length;
                int i = 0;
                while (i < j) 
                {
                    Enum enum = aenum[i];
                    type = serializerprovider.findValueSerializer(javatype.getRawClass(), _property);
                    if (type instanceof SchemaAware)
                    {
                        type = ((SchemaAware)type).getSchema(serializerprovider, null);
                    } else
                    {
                        type = JsonSchema.getDefaultSchemaNode();
                    }
                    objectnode1.put(serializerprovider.getConfig().getAnnotationIntrospector().findEnumValue(enum), type);
                    i++;
                }
                objectnode.put("properties", objectnode1);
            }
        }
        return objectnode;
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_staticTyping && _valueSerializer == null)
        {
            _valueSerializer = serializerprovider.findValueSerializer(_valueType, _property);
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((EnumMap)obj, jsongenerator, serializerprovider);
    }

    public void serialize(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartObject();
        if (!enummap.isEmpty())
        {
            serializeContents(enummap, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndObject();
    }

    protected void serializeContents(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_valueSerializer == null) goto _L2; else goto _L1
_L1:
        serializeContentsUsing(enummap, jsongenerator, serializerprovider, _valueSerializer);
_L6:
        return;
_L2:
        Object obj;
        Class class1;
        Object obj1;
        Iterator iterator;
        obj = null;
        class1 = null;
        obj1 = _keyEnums;
        iterator = enummap.entrySet().iterator();
_L4:
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        Object obj2 = (Enum)entry.getKey();
        EnumValues enumvalues = ((EnumValues) (obj1));
        if (obj1 == null)
        {
            enumvalues = ((EnumSerializer)(SerializerBase)serializerprovider.findValueSerializer(((Enum) (obj2)).getDeclaringClass(), _property)).getEnumValues();
        }
        jsongenerator.writeFieldName(enumvalues.serializedValueFor(((Enum) (obj2))));
        Object obj3 = entry.getValue();
        if (obj3 == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            obj1 = enumvalues;
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj3.getClass();
        if (obj2 == class1)
        {
            obj1 = obj;
        } else
        {
            obj1 = serializerprovider.findValueSerializer(((Class) (obj2)), _property);
            obj = obj1;
            class1 = ((Class) (obj2));
        }
        ((JsonSerializer) (obj1)).serialize(obj3, jsongenerator, serializerprovider);
        obj1 = enumvalues;
        break; /* Loop/switch isn't completed */
        obj1;
        wrapAndThrow(serializerprovider, ((Throwable) (obj1)), enummap, ((Enum)entry.getKey()).name());
        obj1 = enumvalues;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void serializeContentsUsing(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        Object obj;
        Iterator iterator;
        obj = _keyEnums;
        iterator = enummap.entrySet().iterator();
_L2:
        EnumValues enumvalues;
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)iterator.next();
        Enum enum = (Enum)entry.getKey();
        enumvalues = ((EnumValues) (obj));
        if (obj == null)
        {
            enumvalues = ((EnumSerializer)(SerializerBase)serializerprovider.findValueSerializer(enum.getDeclaringClass(), _property)).getEnumValues();
        }
        jsongenerator.writeFieldName(enumvalues.serializedValueFor(enum));
        obj = entry.getValue();
        if (obj == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            obj = enumvalues;
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
        obj = enumvalues;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        wrapAndThrow(serializerprovider, exception, enummap, ((Enum)entry.getKey()).name());
        exception = enumvalues;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((EnumMap)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(EnumMap enummap, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForObject(enummap, jsongenerator);
        if (!enummap.isEmpty())
        {
            serializeContents(enummap, jsongenerator, serializerprovider);
        }
        typeserializer.writeTypeSuffixForObject(enummap, jsongenerator);
    }
}
