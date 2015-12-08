// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ResolvableSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.ser.AnyGetterWriter;
import org.codehaus.jackson.map.ser.BeanPropertyFilter;
import org.codehaus.jackson.map.ser.BeanPropertyWriter;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            SerializerBase, ContainerSerializerBase

public abstract class BeanSerializerBase extends SerializerBase
    implements ResolvableSerializer, SchemaAware
{

    protected static final BeanPropertyWriter NO_PROPS[] = new BeanPropertyWriter[0];
    protected final AnyGetterWriter _anyGetterWriter;
    protected final BeanPropertyWriter _filteredProps[];
    protected final Object _propertyFilterId;
    protected final BeanPropertyWriter _props[];

    public BeanSerializerBase(Class class1, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[], AnyGetterWriter anygetterwriter, Object obj)
    {
        super(class1);
        _props = abeanpropertywriter;
        _filteredProps = abeanpropertywriter1;
        _anyGetterWriter = anygetterwriter;
        _propertyFilterId = obj;
    }

    protected BeanSerializerBase(BeanSerializerBase beanserializerbase)
    {
        this(beanserializerbase._handledType, beanserializerbase._props, beanserializerbase._filteredProps, beanserializerbase._anyGetterWriter, beanserializerbase._propertyFilterId);
    }

    protected BeanSerializerBase(JavaType javatype, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[], AnyGetterWriter anygetterwriter, Object obj)
    {
        super(javatype);
        _props = abeanpropertywriter;
        _filteredProps = abeanpropertywriter1;
        _anyGetterWriter = anygetterwriter;
        _propertyFilterId = obj;
    }

    protected BeanPropertyFilter findFilter(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        Object obj = _propertyFilterId;
        serializerprovider = serializerprovider.getFilterProvider();
        if (serializerprovider == null)
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not resolve BeanPropertyFilter with id '").append(obj).append("'; no FilterProvider configured").toString());
        } else
        {
            return serializerprovider.findFilter(obj);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
        throws JsonMappingException
    {
        ObjectNode objectnode = createSchemaNode("object", true);
        ObjectNode objectnode1 = objectnode.objectNode();
        int i = 0;
        while (i < _props.length) 
        {
            BeanPropertyWriter beanpropertywriter = _props[i];
            type = beanpropertywriter.getSerializationType();
            Object obj;
            org.codehaus.jackson.map.JsonSerializer jsonserializer;
            if (type == null)
            {
                type = beanpropertywriter.getGenericPropertyType();
            } else
            {
                type = type.getRawClass();
            }
            jsonserializer = beanpropertywriter.getSerializer();
            obj = jsonserializer;
            if (jsonserializer == null)
            {
                Class class1 = beanpropertywriter.getRawSerializationType();
                obj = class1;
                if (class1 == null)
                {
                    obj = beanpropertywriter.getPropertyType();
                }
                obj = serializerprovider.findValueSerializer(((Class) (obj)), beanpropertywriter);
            }
            if (obj instanceof SchemaAware)
            {
                type = ((SchemaAware)obj).getSchema(serializerprovider, type);
            } else
            {
                type = JsonSchema.getDefaultSchemaNode();
            }
            objectnode1.put(beanpropertywriter.getName(), type);
            i++;
        }
        objectnode.put("properties", objectnode1);
        return objectnode;
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        BeanPropertyWriter beanpropertywriter1;
        int i;
        int j;
        int k;
        if (_filteredProps == null)
        {
            i = 0;
        } else
        {
            i = _filteredProps.length;
        }
        j = 0;
        k = _props.length;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        beanpropertywriter1 = _props[j];
        if (!beanpropertywriter1.hasSerializer())
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_20;
_L1:
        Object obj1;
label0:
        {
            JavaType javatype = beanpropertywriter1.getSerializationType();
            obj1 = javatype;
            if (javatype != null)
            {
                break label0;
            }
            javatype = serializerprovider.constructType(beanpropertywriter1.getGenericPropertyType());
            obj1 = javatype;
            if (javatype.isFinal())
            {
                break label0;
            }
            if (javatype.isContainerType() || javatype.containedTypeCount() > 0)
            {
                beanpropertywriter1.setNonTrivialBaseType(javatype);
            }
        }
        continue; /* Loop/switch isn't completed */
        org.codehaus.jackson.map.JsonSerializer jsonserializer = serializerprovider.findValueSerializer(((JavaType) (obj1)), beanpropertywriter1);
        Object obj = jsonserializer;
        if (((JavaType) (obj1)).isContainerType())
        {
            obj1 = (TypeSerializer)((JavaType) (obj1)).getContentType().getTypeHandler();
            obj = jsonserializer;
            if (obj1 != null)
            {
                obj = jsonserializer;
                if (jsonserializer instanceof ContainerSerializerBase)
                {
                    obj = ((ContainerSerializerBase)jsonserializer).withValueTypeSerializer(((TypeSerializer) (obj1)));
                }
            }
        }
        obj1 = beanpropertywriter1.withSerializer(((org.codehaus.jackson.map.JsonSerializer) (obj)));
        _props[j] = ((BeanPropertyWriter) (obj1));
        if (j < i)
        {
            BeanPropertyWriter beanpropertywriter = _filteredProps[j];
            if (beanpropertywriter != null)
            {
                _filteredProps[j] = beanpropertywriter.withSerializer(((org.codehaus.jackson.map.JsonSerializer) (obj)));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (_anyGetterWriter != null)
        {
            _anyGetterWriter.resolve(serializerprovider);
        }
        return;
    }

    public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException;

    protected void serializeFields(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        BeanPropertyWriter abeanpropertywriter[];
        BeanPropertyWriter beanpropertywriter;
        int i;
        int j;
        int k;
        int l;
        if (_filteredProps != null && serializerprovider.getSerializationView() != null)
        {
            abeanpropertywriter = _filteredProps;
        } else
        {
            abeanpropertywriter = _props;
        }
        j = 0;
        k = 0;
        i = 0;
        try
        {
            l = abeanpropertywriter.length;
        }
        catch (Exception exception)
        {
            if (j == abeanpropertywriter.length)
            {
                jsongenerator = "[anySetter]";
            } else
            {
                jsongenerator = abeanpropertywriter[j].getName();
            }
            wrapAndThrow(serializerprovider, exception, obj, jsongenerator);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            serializerprovider = new JsonMappingException("Infinite recursion (StackOverflowError)", jsongenerator);
            if (k == abeanpropertywriter.length)
            {
                jsongenerator = "[anySetter]";
            } else
            {
                jsongenerator = abeanpropertywriter[k].getName();
            }
            serializerprovider.prependPath(new org.codehaus.jackson.map.JsonMappingException.Reference(obj, jsongenerator));
            throw serializerprovider;
        }
        if (i >= l) goto _L2; else goto _L1
_L1:
        beanpropertywriter = abeanpropertywriter[i];
        if (beanpropertywriter == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        k = i;
        beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
        i++;
        break MISSING_BLOCK_LABEL_34;
_L2:
        j = i;
        k = i;
        if (_anyGetterWriter == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        j = i;
        k = i;
        _anyGetterWriter.getAndSerialize(obj, jsongenerator, serializerprovider);
    }

    protected void serializeFieldsFiltered(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        BeanPropertyWriter abeanpropertywriter[];
        BeanPropertyFilter beanpropertyfilter;
        if (_filteredProps != null && serializerprovider.getSerializationView() != null)
        {
            abeanpropertywriter = _filteredProps;
        } else
        {
            abeanpropertywriter = _props;
        }
        beanpropertyfilter = findFilter(serializerprovider);
        if (beanpropertyfilter != null) goto _L2; else goto _L1
_L1:
        serializeFields(obj, jsongenerator, serializerprovider);
_L4:
        return;
_L2:
        int i;
        int j;
        int k;
        j = 0;
        k = 0;
        i = 0;
        int l = abeanpropertywriter.length;
_L5:
        BeanPropertyWriter beanpropertywriter;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        beanpropertywriter = abeanpropertywriter[i];
        if (beanpropertywriter == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        j = i;
        k = i;
        beanpropertyfilter.serializeAsField(obj, jsongenerator, serializerprovider, beanpropertywriter);
        break MISSING_BLOCK_LABEL_224;
        j = i;
        k = i;
        if (_anyGetterWriter == null) goto _L4; else goto _L3
_L3:
        j = i;
        k = i;
        try
        {
            _anyGetterWriter.getAndSerialize(obj, jsongenerator, serializerprovider);
            return;
        }
        catch (Exception exception)
        {
            if (j == abeanpropertywriter.length)
            {
                jsongenerator = "[anySetter]";
            } else
            {
                jsongenerator = abeanpropertywriter[j].getName();
            }
            wrapAndThrow(serializerprovider, exception, obj, jsongenerator);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            serializerprovider = new JsonMappingException("Infinite recursion (StackOverflowError)", jsongenerator);
        }
        if (k == abeanpropertywriter.length)
        {
            jsongenerator = "[anySetter]";
        } else
        {
            jsongenerator = abeanpropertywriter[k].getName();
        }
        serializerprovider.prependPath(new org.codehaus.jackson.map.JsonMappingException.Reference(obj, jsongenerator));
        throw serializerprovider;
        i++;
          goto _L5
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForObject(obj, jsongenerator);
        if (_propertyFilterId != null)
        {
            serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
        } else
        {
            serializeFields(obj, jsongenerator, serializerprovider);
        }
        typeserializer.writeTypeSuffixForObject(obj, jsongenerator);
    }

}
