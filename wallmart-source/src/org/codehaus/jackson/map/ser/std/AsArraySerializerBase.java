// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ResolvableSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ContainerSerializerBase

public abstract class AsArraySerializerBase extends ContainerSerializerBase
    implements ResolvableSerializer
{

    protected PropertySerializerMap _dynamicSerializers;
    protected JsonSerializer _elementSerializer;
    protected final JavaType _elementType;
    protected final BeanProperty _property;
    protected final boolean _staticTyping;
    protected final TypeSerializer _valueTypeSerializer;

    protected AsArraySerializerBase(Class class1, JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        this(class1, javatype, flag, typeserializer, beanproperty, null);
    }

    protected AsArraySerializerBase(Class class1, JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
label0:
        {
            boolean flag1 = false;
            super(class1, false);
            _elementType = javatype;
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
        _valueTypeSerializer = typeserializer;
        _property = beanproperty;
        _elementSerializer = jsonserializer;
        _dynamicSerializers = PropertySerializerMap.emptyMap();
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        class1 = propertyserializermap.findAndAddSerializer(class1, serializerprovider, _property);
        if (propertyserializermap != ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicSerializers = ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        javatype = propertyserializermap.findAndAddSerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicSerializers = ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        throws JsonMappingException
    {
        ObjectNode objectnode = createSchemaNode("array", true);
        JavaType javatype = null;
        if (type != null)
        {
            JavaType javatype1 = serializerprovider.constructType(type).getContentType();
            javatype = javatype1;
            if (javatype1 == null)
            {
                javatype = javatype1;
                if (type instanceof ParameterizedType)
                {
                    type = ((ParameterizedType)type).getActualTypeArguments();
                    javatype = javatype1;
                    if (type.length == 1)
                    {
                        javatype = serializerprovider.constructType(type[0]);
                    }
                }
            }
        }
        Object obj1 = javatype;
        if (javatype == null)
        {
            obj1 = javatype;
            if (_elementType != null)
            {
                obj1 = _elementType;
            }
        }
        if (obj1 != null)
        {
            Object obj = null;
            type = obj;
            if (((JavaType) (obj1)).getRawClass() != java/lang/Object)
            {
                obj1 = serializerprovider.findValueSerializer(((JavaType) (obj1)), _property);
                type = obj;
                if (obj1 instanceof SchemaAware)
                {
                    type = ((SchemaAware)obj1).getSchema(serializerprovider, null);
                }
            }
            serializerprovider = type;
            if (type == null)
            {
                serializerprovider = JsonSchema.getDefaultSchemaNode();
            }
            objectnode.put("items", serializerprovider);
        }
        return objectnode;
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_staticTyping && _elementType != null && _elementSerializer == null)
        {
            _elementSerializer = serializerprovider.findValueSerializer(_elementType, _property);
        }
    }

    public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartArray();
        serializeContents(obj, jsongenerator, serializerprovider);
        jsongenerator.writeEndArray();
    }

    protected abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException;

    public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForArray(obj, jsongenerator);
        serializeContents(obj, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForArray(obj, jsongenerator);
    }
}
