// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
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
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            SerializerBase

public class JsonValueSerializer extends SerializerBase
    implements ResolvableSerializer, SchemaAware
{

    protected final Method _accessorMethod;
    protected boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected JsonSerializer _valueSerializer;

    public JsonValueSerializer(Method method, JsonSerializer jsonserializer, BeanProperty beanproperty)
    {
        super(java/lang/Object);
        _accessorMethod = method;
        _valueSerializer = jsonserializer;
        _property = beanproperty;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        throws JsonMappingException
    {
        if (_valueSerializer instanceof SchemaAware)
        {
            return ((SchemaAware)_valueSerializer).getSchema(serializerprovider, null);
        } else
        {
            return JsonSchema.getDefaultSchemaNode();
        }
    }

    protected boolean isNaturalTypeWithStdHandling(JavaType javatype, JsonSerializer jsonserializer)
    {
        for (Class class1 = javatype.getRawClass(); (javatype.isPrimitive() ? class1 != Integer.TYPE && class1 != Boolean.TYPE && class1 != Double.TYPE : class1 != java/lang/String && class1 != java/lang/Integer && class1 != java/lang/Boolean && class1 != java/lang/Double) || jsonserializer.getClass().getAnnotation(org/codehaus/jackson/map/annotate/JacksonStdImpl) == null;)
        {
            return false;
        }

        return true;
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_valueSerializer == null && (serializerprovider.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.USE_STATIC_TYPING) || Modifier.isFinal(_accessorMethod.getReturnType().getModifiers())))
        {
            JavaType javatype = serializerprovider.constructType(_accessorMethod.getGenericReturnType());
            _valueSerializer = serializerprovider.findTypedValueSerializer(javatype, false, _property);
            _forceTypeInformation = isNaturalTypeWithStdHandling(javatype, _valueSerializer);
        }
    }

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        Object obj1 = _accessorMethod.invoke(obj, new Object[0]);
        if (obj1 == null)
        {
            JsonSerializer jsonserializer;
            JsonSerializer jsonserializer1;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
            break MISSING_BLOCK_LABEL_70;
        }
        jsonserializer1 = _valueSerializer;
        jsonserializer = jsonserializer1;
        if (jsonserializer1 != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        jsonserializer = serializerprovider.findTypedValueSerializer(obj1.getClass(), true, _property);
        jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
        return;
        for (; (jsongenerator instanceof InvocationTargetException) && jsongenerator.getCause() != null; jsongenerator = jsongenerator.getCause()) { }
        if (jsongenerator instanceof Error)
        {
            throw (Error)jsongenerator;
        } else
        {
            throw JsonMappingException.wrapWithPath(jsongenerator, obj, (new StringBuilder()).append(_accessorMethod.getName()).append("()").toString());
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        Object obj1 = _accessorMethod.invoke(obj, new Object[0]);
        if (obj1 == null)
        {
            JsonSerializer jsonserializer;
            try
            {
                serializerprovider.defaultSerializeNull(jsongenerator);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
            break MISSING_BLOCK_LABEL_102;
        }
        jsonserializer = _valueSerializer;
        if (jsonserializer == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (_forceTypeInformation)
        {
            typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
        }
        jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
        if (_forceTypeInformation)
        {
            typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
            return;
        }
        break MISSING_BLOCK_LABEL_167;
        serializerprovider.findTypedValueSerializer(obj1.getClass(), true, _property).serialize(obj1, jsongenerator, serializerprovider);
        return;
        for (; (jsongenerator instanceof InvocationTargetException) && jsongenerator.getCause() != null; jsongenerator = jsongenerator.getCause()) { }
        if (jsongenerator instanceof Error)
        {
            throw (Error)jsongenerator;
        } else
        {
            throw JsonMappingException.wrapWithPath(jsongenerator, obj, (new StringBuilder()).append(_accessorMethod.getName()).append("()").toString());
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("(@JsonValue serializer for method ").append(_accessorMethod.getDeclaringClass()).append("#").append(_accessorMethod.getName()).append(")").toString();
    }
}
