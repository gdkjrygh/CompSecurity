// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
import org.codehaus.jackson.map.ser.impl.PropertySerializerMap;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.ser.std:
//            ContainerSerializerBase

public class MapSerializer extends ContainerSerializerBase
    implements ResolvableSerializer
{

    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final HashSet _ignoredEntries;
    protected JsonSerializer _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected JsonSerializer _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;

    protected MapSerializer()
    {
        this((HashSet)null, null, null, false, null, null, null, null);
    }

    protected MapSerializer(HashSet hashset, JavaType javatype, JavaType javatype1, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, 
            BeanProperty beanproperty)
    {
        super(java/util/Map, false);
        _property = beanproperty;
        _ignoredEntries = hashset;
        _keyType = javatype;
        _valueType = javatype1;
        _valueTypeIsStatic = flag;
        _valueTypeSerializer = typeserializer;
        _keySerializer = jsonserializer;
        _valueSerializer = jsonserializer1;
        _dynamicValueSerializers = PropertySerializerMap.emptyMap();
    }

    public static MapSerializer construct(String as[], JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        return construct(as, javatype, flag, typeserializer, beanproperty, null, null);
    }

    public static MapSerializer construct(String as[], JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
    {
        HashSet hashset = toSet(as);
        boolean flag1;
        if (javatype == null)
        {
            javatype = UNSPECIFIED_TYPE;
            as = javatype;
        } else
        {
            as = javatype.getKeyType();
            javatype = javatype.getContentType();
        }
        flag1 = flag;
        if (!flag)
        {
            if (javatype != null && javatype.isFinal())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        return new MapSerializer(hashset, as, javatype, flag1, typeserializer, jsonserializer, jsonserializer1, beanproperty);
    }

    private static HashSet toSet(String as[])
    {
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        HashSet hashset = null;
_L4:
        return hashset;
_L2:
        HashSet hashset1 = new HashSet(as.length);
        int j = as.length;
        int i = 0;
        do
        {
            hashset = hashset1;
            if (i >= j)
            {
                continue;
            }
            hashset1.add(as[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        class1 = propertyserializermap.findAndAddSerializer(class1, serializerprovider, _property);
        if (propertyserializermap != ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicValueSerializers = ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        javatype = propertyserializermap.findAndAddSerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicValueSerializers = ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((org.codehaus.jackson.map.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    public ContainerSerializerBase _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        typeserializer = new MapSerializer(_ignoredEntries, _keyType, _valueType, _valueTypeIsStatic, typeserializer, _keySerializer, _valueSerializer, _property);
        if (_valueSerializer != null)
        {
            typeserializer._valueSerializer = _valueSerializer;
        }
        return typeserializer;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        return createSchemaNode("object", true);
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_valueTypeIsStatic && _valueSerializer == null)
        {
            _valueSerializer = serializerprovider.findValueSerializer(_valueType, _property);
        }
        if (_keySerializer == null)
        {
            _keySerializer = serializerprovider.findKeySerializer(_keyType, _property);
        }
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Map)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartObject();
        if (!map.isEmpty())
        {
            if (_valueSerializer != null)
            {
                serializeFieldsUsing(map, jsongenerator, serializerprovider, _valueSerializer);
            } else
            {
                serializeFields(map, jsongenerator, serializerprovider);
            }
        }
        jsongenerator.writeEndObject();
    }

    public void serializeFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_valueTypeSerializer == null) goto _L2; else goto _L1
_L1:
        serializeTypedFields(map, jsongenerator, serializerprovider);
_L6:
        return;
_L2:
        Object obj;
        JsonSerializer jsonserializer1;
        HashSet hashset;
        Object obj3;
        Object obj4;
        boolean flag;
        jsonserializer1 = _keySerializer;
        hashset = _ignoredEntries;
        java.util.Map.Entry entry;
        Iterator iterator;
        if (!serializerprovider.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = _dynamicValueSerializers;
        iterator = map.entrySet().iterator();
_L4:
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)iterator.next();
        obj3 = entry.getValue();
        obj4 = entry.getKey();
        if (obj4 == null)
        {
            serializerprovider.getNullKeySerializer().serialize(null, jsongenerator, serializerprovider);
        } else
        {
            if (flag && obj3 == null || hashset != null && hashset.contains(obj4))
            {
                break; /* Loop/switch isn't completed */
            }
            jsonserializer1.serialize(obj4, jsongenerator, serializerprovider);
        }
        if (obj3 == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            break; /* Loop/switch isn't completed */
        }
        Class class1 = obj3.getClass();
        JsonSerializer jsonserializer = ((PropertySerializerMap) (obj)).serializerFor(class1);
        Object obj2 = jsonserializer;
        Object obj1 = obj;
        if (jsonserializer == null)
        {
            if (_valueType.hasGenericTypes())
            {
                obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
            } else
            {
                obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), class1, serializerprovider);
            }
            obj1 = _dynamicValueSerializers;
            obj2 = obj;
        }
        ((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
        obj = obj1;
        break; /* Loop/switch isn't completed */
        obj;
        wrapAndThrow(serializerprovider, ((Throwable) (obj)), map, (new StringBuilder()).append("").append(obj4).toString());
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void serializeFieldsUsing(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        JsonSerializer jsonserializer1;
        HashSet hashset;
        TypeSerializer typeserializer;
        Object obj;
        Object obj1;
        boolean flag;
        jsonserializer1 = _keySerializer;
        hashset = _ignoredEntries;
        typeserializer = _valueTypeSerializer;
        Iterator iterator;
        if (!serializerprovider.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iterator = map.entrySet().iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (java.util.Map.Entry)iterator.next();
        obj = ((java.util.Map.Entry) (obj1)).getValue();
        obj1 = ((java.util.Map.Entry) (obj1)).getKey();
        if (obj1 == null)
        {
            serializerprovider.getNullKeySerializer().serialize(null, jsongenerator, serializerprovider);
        } else
        {
            if (flag && obj == null || hashset != null && hashset.contains(obj1))
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
        }
        if (obj == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            continue; /* Loop/switch isn't completed */
        }
        if (typeserializer == null)
        {
            try
            {
                jsonserializer.serialize(obj, jsongenerator, serializerprovider);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                wrapAndThrow(serializerprovider, ((Throwable) (obj)), map, (new StringBuilder()).append("").append(obj1).toString());
            }
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void serializeTypedFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        JsonSerializer jsonserializer = _keySerializer;
        Object obj = null;
        Class class1 = null;
        HashSet hashset = _ignoredEntries;
        Iterator iterator;
        boolean flag;
        if (!serializerprovider.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iterator = map.entrySet().iterator();
        do
        {
            if (iterator.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Object obj2 = entry.getValue();
                Object obj3 = entry.getKey();
                if (obj3 == null)
                {
                    serializerprovider.getNullKeySerializer().serialize(null, jsongenerator, serializerprovider);
                } else
                {
                    if (flag && obj2 == null || hashset != null && hashset.contains(obj3))
                    {
                        continue;
                    }
                    jsonserializer.serialize(obj3, jsongenerator, serializerprovider);
                }
                if (obj2 == null)
                {
                    serializerprovider.defaultSerializeNull(jsongenerator);
                } else
                {
                    Class class2 = obj2.getClass();
                    Object obj1;
                    if (class2 == class1)
                    {
                        obj1 = obj;
                    } else
                    {
                        obj1 = serializerprovider.findValueSerializer(class2, _property);
                        obj = obj1;
                        class1 = class2;
                    }
                    try
                    {
                        ((JsonSerializer) (obj1)).serializeWithType(obj2, jsongenerator, serializerprovider, _valueTypeSerializer);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        wrapAndThrow(serializerprovider, ((Throwable) (obj1)), map, (new StringBuilder()).append("").append(obj3).toString());
                    }
                }
                continue;
            }
            return;
        } while (true);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((Map)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForObject(map, jsongenerator);
        if (!map.isEmpty())
        {
            if (_valueSerializer != null)
            {
                serializeFieldsUsing(map, jsongenerator, serializerprovider, _valueSerializer);
            } else
            {
                serializeFields(map, jsongenerator, serializerprovider);
            }
        }
        typeserializer.writeTypeSuffixForObject(map, jsongenerator);
    }

}
