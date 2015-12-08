// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ContainerSerializerBase

public class ObjectArraySerializer extends StdArraySerializers.ArraySerializerBase
    implements ResolvableSerializer
{

    protected PropertySerializerMap _dynamicSerializers;
    protected JsonSerializer _elementSerializer;
    protected final JavaType _elementType;
    protected final boolean _staticTyping;

    public ObjectArraySerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        this(javatype, flag, typeserializer, beanproperty, null);
    }

    public ObjectArraySerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
        super([Ljava/lang/Object;, typeserializer, beanproperty);
        _elementType = javatype;
        _staticTyping = flag;
        _dynamicSerializers = PropertySerializerMap.emptyMap();
        _elementSerializer = jsonserializer;
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

    public ContainerSerializerBase _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new ObjectArraySerializer(_elementType, _staticTyping, typeserializer, _property, _elementSerializer);
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        throws JsonMappingException
    {
        ObjectNode objectnode;
label0:
        {
            objectnode = createSchemaNode("array", true);
            if (type != null)
            {
                type = serializerprovider.constructType(type);
                if (type.isArrayType())
                {
                    type = ((ArrayType)type).getContentType().getRawClass();
                    if (type != java/lang/Object)
                    {
                        break label0;
                    }
                    objectnode.put("items", JsonSchema.getDefaultSchemaNode());
                }
            }
            return objectnode;
        }
        type = serializerprovider.findValueSerializer(type, _property);
        if (type instanceof SchemaAware)
        {
            serializerprovider = ((SchemaAware)type).getSchema(serializerprovider, null);
        } else
        {
            serializerprovider = JsonSchema.getDefaultSchemaNode();
        }
        objectnode.put("items", serializerprovider);
        return objectnode;
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_staticTyping && _elementSerializer == null)
        {
            _elementSerializer = serializerprovider.findValueSerializer(_elementType, _property);
        }
    }

    public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serializeContents((Object[])obj, jsongenerator, serializerprovider);
    }

    public void serializeContents(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int k = aobj.length;
        if (k != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        if (_elementSerializer != null)
        {
            serializeContentsUsing(aobj, jsongenerator, serializerprovider, _elementSerializer);
            return;
        }
        if (_valueTypeSerializer != null)
        {
            serializeTypedContents(aobj, jsongenerator, serializerprovider);
            return;
        }
        int j = 0;
        i = 0;
        Object obj = null;
        JsonSerializer jsonserializer;
        Object obj1;
        JsonSerializer jsonserializer1;
        PropertySerializerMap propertyserializermap;
        Class class1;
        try
        {
            propertyserializermap = _dynamicSerializers;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            for (; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Throwable) (aobj)).getCause()) { }
            if (aobj instanceof Error)
            {
                throw (Error)aobj;
            } else
            {
                throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, j);
            }
        }
_L11:
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = aobj[i];
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
          goto _L5
_L4:
        obj = obj1;
        j = i;
        class1 = obj1.getClass();
        obj = obj1;
        j = i;
        jsonserializer1 = propertyserializermap.serializerFor(class1);
        jsonserializer = jsonserializer1;
        if (jsonserializer1 != null) goto _L7; else goto _L6
_L6:
        obj = obj1;
        j = i;
        if (!_elementType.hasGenericTypes()) goto _L9; else goto _L8
_L8:
        obj = obj1;
        j = i;
        jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
_L7:
        obj = obj1;
        j = i;
        jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
        break; /* Loop/switch isn't completed */
_L9:
        obj = obj1;
        j = i;
        jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
        if (true) goto _L7; else goto _L5
_L5:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        if (true) goto _L1; else goto _L12
_L12:
    }

    public void serializeContentsUsing(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        TypeSerializer typeserializer;
        int i;
        int j;
        j = aobj.length;
        typeserializer = _valueTypeSerializer;
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        Object obj = aobj[i];
        if (obj == null)
        {
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                throw aobj;
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                for (; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Throwable) (aobj)).getCause()) { }
                if (aobj instanceof Error)
                {
                    throw (Error)aobj;
                } else
                {
                    throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, i);
                }
            }
            break MISSING_BLOCK_LABEL_118;
        }
        if (typeserializer != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
        break MISSING_BLOCK_LABEL_118;
        jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
        break MISSING_BLOCK_LABEL_118;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void serializeTypedContents(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        int i;
        int k = aobj.length;
        TypeSerializer typeserializer = _valueTypeSerializer;
        int j = 0;
        i = 0;
        Object obj = null;
        JsonSerializer jsonserializer;
        Object obj1;
        JsonSerializer jsonserializer1;
        PropertySerializerMap propertyserializermap;
        Class class1;
        try
        {
            propertyserializermap = _dynamicSerializers;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            for (; (aobj instanceof InvocationTargetException) && ((Throwable) (aobj)).getCause() != null; aobj = ((Throwable) (aobj)).getCause()) { }
            if (aobj instanceof Error)
            {
                throw (Error)aobj;
            } else
            {
                throw JsonMappingException.wrapWithPath(((Throwable) (aobj)), obj, j);
            }
        }
_L2:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        obj1 = aobj[i];
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = obj1;
        j = i;
        serializerprovider.defaultSerializeNull(jsongenerator);
        break MISSING_BLOCK_LABEL_189;
        obj = obj1;
        j = i;
        class1 = obj1.getClass();
        obj = obj1;
        j = i;
        jsonserializer1 = propertyserializermap.serializerFor(class1);
        jsonserializer = jsonserializer1;
        if (jsonserializer1 != null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = obj1;
        j = i;
        jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
        obj = obj1;
        j = i;
        jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
        break MISSING_BLOCK_LABEL_189;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
