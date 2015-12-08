// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.ContextualSerializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ResolvableSerializer;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.SerializerFactory;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.ser.impl.FailingSerializer;
import org.codehaus.jackson.map.ser.impl.ReadOnlyClassToSerializerMap;
import org.codehaus.jackson.map.ser.impl.SerializerCache;
import org.codehaus.jackson.map.ser.impl.UnknownSerializer;
import org.codehaus.jackson.map.ser.std.NullSerializer;
import org.codehaus.jackson.map.ser.std.StdKeySerializer;
import org.codehaus.jackson.map.ser.std.StdKeySerializers;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.RootNameLookup;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

public class StdSerializerProvider extends SerializerProvider
{
    private static final class WrappedSerializer extends JsonSerializer
    {

        protected final JsonSerializer _serializer;
        protected final TypeSerializer _typeSerializer;

        public Class handledType()
        {
            return java/lang/Object;
        }

        public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws IOException, JsonProcessingException
        {
            _serializer.serializeWithType(obj, jsongenerator, serializerprovider, _typeSerializer);
        }

        public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
            throws IOException, JsonProcessingException
        {
            _serializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
        }

        public WrappedSerializer(TypeSerializer typeserializer, JsonSerializer jsonserializer)
        {
            _typeSerializer = typeserializer;
            _serializer = jsonserializer;
        }
    }


    static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final JsonSerializer DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
    public static final JsonSerializer DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    public static final JsonSerializer DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected DateFormat _dateFormat;
    protected JsonSerializer _keySerializer;
    protected final ReadOnlyClassToSerializerMap _knownSerializers;
    protected JsonSerializer _nullKeySerializer;
    protected JsonSerializer _nullValueSerializer;
    protected final RootNameLookup _rootNames;
    protected final SerializerCache _serializerCache;
    protected final SerializerFactory _serializerFactory;
    protected JsonSerializer _unknownTypeSerializer;

    public StdSerializerProvider()
    {
        super(null);
        _unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        _nullValueSerializer = NullSerializer.instance;
        _nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        _serializerFactory = null;
        _serializerCache = new SerializerCache();
        _knownSerializers = null;
        _rootNames = new RootNameLookup();
    }

    protected StdSerializerProvider(SerializationConfig serializationconfig, StdSerializerProvider stdserializerprovider, SerializerFactory serializerfactory)
    {
        super(serializationconfig);
        _unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        _nullValueSerializer = NullSerializer.instance;
        _nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        if (serializationconfig == null)
        {
            throw new NullPointerException();
        } else
        {
            _serializerFactory = serializerfactory;
            _serializerCache = stdserializerprovider._serializerCache;
            _unknownTypeSerializer = stdserializerprovider._unknownTypeSerializer;
            _keySerializer = stdserializerprovider._keySerializer;
            _nullValueSerializer = stdserializerprovider._nullValueSerializer;
            _nullKeySerializer = stdserializerprovider._nullKeySerializer;
            _rootNames = stdserializerprovider._rootNames;
            _knownSerializers = _serializerCache.getReadOnlyLookupMap();
            return;
        }
    }

    protected JsonSerializer _createAndCacheUntypedSerializer(Class class1, BeanProperty beanproperty)
        throws JsonMappingException
    {
        try
        {
            beanproperty = _createUntypedSerializer(_config.constructType(class1), beanproperty);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new JsonMappingException(class1.getMessage(), null, class1);
        }
        if (beanproperty != null)
        {
            _serializerCache.addAndResolveNonTypedSerializer(class1, beanproperty, this);
        }
        return beanproperty;
    }

    protected JsonSerializer _createAndCacheUntypedSerializer(JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        try
        {
            beanproperty = _createUntypedSerializer(javatype, beanproperty);
        }
        // Misplaced declaration of an exception variable
        catch (JavaType javatype)
        {
            throw new JsonMappingException(javatype.getMessage(), null, javatype);
        }
        if (beanproperty != null)
        {
            _serializerCache.addAndResolveNonTypedSerializer(javatype, beanproperty, this);
        }
        return beanproperty;
    }

    protected JsonSerializer _createUntypedSerializer(JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return _serializerFactory.createSerializer(_config, javatype, beanproperty);
    }

    protected JsonSerializer _findExplicitUntypedSerializer(Class class1, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer = _knownSerializers.untypedValueSerializer(class1);
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        jsonserializer = _serializerCache.untypedValueSerializer(class1);
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        try
        {
            class1 = _createAndCacheUntypedSerializer(class1, beanproperty);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    protected JsonSerializer _handleContextualResolvable(JsonSerializer jsonserializer, BeanProperty beanproperty)
        throws JsonMappingException
    {
        if (!(jsonserializer instanceof ContextualSerializer))
        {
            return jsonserializer;
        }
        JsonSerializer jsonserializer1 = ((ContextualSerializer)jsonserializer).createContextual(_config, beanproperty);
        beanproperty = jsonserializer;
        if (jsonserializer1 != jsonserializer)
        {
            if (jsonserializer1 instanceof ResolvableSerializer)
            {
                ((ResolvableSerializer)jsonserializer1).resolve(this);
            }
            beanproperty = jsonserializer1;
        }
        return beanproperty;
    }

    protected void _reportIncompatibleRootType(Object obj, JavaType javatype)
        throws IOException, JsonProcessingException
    {
        if (javatype.isPrimitive() && ClassUtil.wrapperType(javatype.getRawClass()).isAssignableFrom(obj.getClass()))
        {
            return;
        } else
        {
            throw new JsonMappingException((new StringBuilder()).append("Incompatible types: declared root type (").append(javatype).append(") vs ").append(obj.getClass().getName()).toString());
        }
    }

    protected void _serializeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonProcessingException
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer;
        boolean flag;
        jsonserializer = getNullValueSerializer();
        flag = false;
_L4:
        JsonSerializer jsonserializer1;
        boolean flag1;
        try
        {
            jsonserializer.serialize(obj, jsongenerator, this);
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            throw jsongenerator;
        }
        catch (Exception exception)
        {
            obj = exception.getMessage();
            jsongenerator = ((JsonGenerator) (obj));
            if (obj == null)
            {
                jsongenerator = (new StringBuilder()).append("[no message for ").append(exception.getClass().getName()).append("]").toString();
            }
            throw new JsonMappingException(jsongenerator, exception);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        jsongenerator.writeEndObject();
        return;
_L2:
        jsonserializer1 = findTypedValueSerializer(obj.getClass(), true, null);
        flag1 = _config.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRAP_ROOT_VALUE);
        jsonserializer = jsonserializer1;
        flag = flag1;
        if (flag1)
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(_rootNames.findRootName(obj.getClass(), _config));
            jsonserializer = jsonserializer1;
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void _serializeValue(JsonGenerator jsongenerator, Object obj, JavaType javatype)
        throws IOException, JsonProcessingException
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer;
        boolean flag;
        jsonserializer = getNullValueSerializer();
        flag = false;
_L4:
        JsonSerializer jsonserializer1;
        boolean flag1;
        try
        {
            jsonserializer.serialize(obj, jsongenerator, this);
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            throw jsongenerator;
        }
        // Misplaced declaration of an exception variable
        catch (JavaType javatype)
        {
            obj = javatype.getMessage();
            jsongenerator = ((JsonGenerator) (obj));
            if (obj == null)
            {
                jsongenerator = (new StringBuilder()).append("[no message for ").append(javatype.getClass().getName()).append("]").toString();
            }
            throw new JsonMappingException(jsongenerator, javatype);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        jsongenerator.writeEndObject();
        return;
_L2:
        if (!javatype.getRawClass().isAssignableFrom(obj.getClass()))
        {
            _reportIncompatibleRootType(obj, javatype);
        }
        jsonserializer1 = findTypedValueSerializer(javatype, true, null);
        flag1 = _config.isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRAP_ROOT_VALUE);
        jsonserializer = jsonserializer1;
        flag = flag1;
        if (flag1)
        {
            jsongenerator.writeStartObject();
            jsongenerator.writeFieldName(_rootNames.findRootName(javatype, _config));
            jsonserializer = jsonserializer1;
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int cachedSerializersCount()
    {
        return _serializerCache.size();
    }

    protected StdSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
    {
        return new StdSerializerProvider(serializationconfig, this, serializerfactory);
    }

    public void defaultSerializeDateKey(long l, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        if (isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
        {
            jsongenerator.writeFieldName(String.valueOf(l));
            return;
        }
        if (_dateFormat == null)
        {
            _dateFormat = (DateFormat)_config.getDateFormat().clone();
        }
        jsongenerator.writeFieldName(_dateFormat.format(new Date(l)));
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        if (isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
        {
            jsongenerator.writeFieldName(String.valueOf(date.getTime()));
            return;
        }
        if (_dateFormat == null)
        {
            _dateFormat = (DateFormat)_config.getDateFormat().clone();
        }
        jsongenerator.writeFieldName(_dateFormat.format(date));
    }

    public final void defaultSerializeDateValue(long l, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        if (isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS))
        {
            jsongenerator.writeNumber(l);
            return;
        }
        if (_dateFormat == null)
        {
            _dateFormat = (DateFormat)_config.getDateFormat().clone();
        }
        jsongenerator.writeString(_dateFormat.format(new Date(l)));
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        if (isEnabled(org.codehaus.jackson.map.SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS))
        {
            jsongenerator.writeNumber(date.getTime());
            return;
        }
        if (_dateFormat == null)
        {
            _dateFormat = (DateFormat)_config.getDateFormat().clone();
        }
        jsongenerator.writeString(_dateFormat.format(date));
    }

    public JsonSerializer findKeySerializer(JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer1 = _serializerFactory.createKeySerializer(_config, javatype, beanproperty);
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            if (_keySerializer == null)
            {
                jsonserializer = StdKeySerializers.getStdKeySerializer(javatype);
            } else
            {
                jsonserializer = _keySerializer;
            }
        }
        javatype = jsonserializer;
        if (jsonserializer instanceof ContextualSerializer)
        {
            javatype = ((ContextualSerializer)jsonserializer).createContextual(_config, beanproperty);
        }
        return javatype;
    }

    public JsonSerializer findTypedValueSerializer(Class class1, boolean flag, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer = _knownSerializers.typedValueSerializer(class1);
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        jsonserializer = _serializerCache.typedValueSerializer(class1);
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        jsonserializer = findValueSerializer(class1, beanproperty);
        TypeSerializer typeserializer = _serializerFactory.createTypeSerializer(_config, _config.constructType(class1), beanproperty);
        beanproperty = jsonserializer;
        if (typeserializer != null)
        {
            beanproperty = new WrappedSerializer(typeserializer, jsonserializer);
        }
        if (flag)
        {
            _serializerCache.addTypedSerializer(class1, beanproperty);
        }
        return beanproperty;
    }

    public JsonSerializer findTypedValueSerializer(JavaType javatype, boolean flag, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer = _knownSerializers.typedValueSerializer(javatype);
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        jsonserializer = _serializerCache.typedValueSerializer(javatype);
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        jsonserializer = findValueSerializer(javatype, beanproperty);
        TypeSerializer typeserializer = _serializerFactory.createTypeSerializer(_config, javatype, beanproperty);
        beanproperty = jsonserializer;
        if (typeserializer != null)
        {
            beanproperty = new WrappedSerializer(typeserializer, jsonserializer);
        }
        if (flag)
        {
            _serializerCache.addTypedSerializer(javatype, beanproperty);
        }
        return beanproperty;
    }

    public JsonSerializer findValueSerializer(Class class1, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(class1);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                JsonSerializer jsonserializer3 = _serializerCache.untypedValueSerializer(_config.constructType(class1));
                jsonserializer = jsonserializer3;
                if (jsonserializer3 == null)
                {
                    JsonSerializer jsonserializer4 = _createAndCacheUntypedSerializer(class1, beanproperty);
                    jsonserializer = jsonserializer4;
                    if (jsonserializer4 == null)
                    {
                        return getUnknownTypeSerializer(class1);
                    }
                }
            }
        }
        return _handleContextualResolvable(jsonserializer, beanproperty);
    }

    public JsonSerializer findValueSerializer(JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
        JsonSerializer jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(javatype);
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                JsonSerializer jsonserializer3 = _createAndCacheUntypedSerializer(javatype, beanproperty);
                jsonserializer = jsonserializer3;
                if (jsonserializer3 == null)
                {
                    return getUnknownTypeSerializer(javatype.getRawClass());
                }
            }
        }
        return _handleContextualResolvable(jsonserializer, beanproperty);
    }

    public void flushCachedSerializers()
    {
        _serializerCache.flush();
    }

    public JsonSchema generateJsonSchema(Class class1, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
        throws JsonMappingException
    {
        if (class1 == null)
        {
            throw new IllegalArgumentException("A class must be provided");
        }
        serializationconfig = createInstance(serializationconfig, serializerfactory);
        if (serializationconfig.getClass() != getClass())
        {
            throw new IllegalStateException((new StringBuilder()).append("Broken serializer provider: createInstance returned instance of type ").append(serializationconfig.getClass()).append("; blueprint of type ").append(getClass()).toString());
        }
        serializerfactory = serializationconfig.findValueSerializer(class1, null);
        if (serializerfactory instanceof SchemaAware)
        {
            serializationconfig = ((SchemaAware)serializerfactory).getSchema(serializationconfig, null);
        } else
        {
            serializationconfig = JsonSchema.getDefaultSchemaNode();
        }
        if (!(serializationconfig instanceof ObjectNode))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getName()).append(" would not be serialized as a JSON object and therefore has no schema").toString());
        } else
        {
            return new JsonSchema((ObjectNode)serializationconfig);
        }
    }

    public JsonSerializer getNullKeySerializer()
    {
        return _nullKeySerializer;
    }

    public JsonSerializer getNullValueSerializer()
    {
        return _nullValueSerializer;
    }

    public JsonSerializer getUnknownTypeSerializer(Class class1)
    {
        return _unknownTypeSerializer;
    }

    public boolean hasSerializerFor(SerializationConfig serializationconfig, Class class1, SerializerFactory serializerfactory)
    {
        return createInstance(serializationconfig, serializerfactory)._findExplicitUntypedSerializer(class1, null) != null;
    }

    public final void serializeValue(SerializationConfig serializationconfig, JsonGenerator jsongenerator, Object obj, SerializerFactory serializerfactory)
        throws IOException, JsonGenerationException
    {
        if (serializerfactory == null)
        {
            throw new IllegalArgumentException("Can not pass null serializerFactory");
        }
        serializationconfig = createInstance(serializationconfig, serializerfactory);
        if (serializationconfig.getClass() != getClass())
        {
            throw new IllegalStateException((new StringBuilder()).append("Broken serializer provider: createInstance returned instance of type ").append(serializationconfig.getClass()).append("; blueprint of type ").append(getClass()).toString());
        } else
        {
            serializationconfig._serializeValue(jsongenerator, obj);
            return;
        }
    }

    public final void serializeValue(SerializationConfig serializationconfig, JsonGenerator jsongenerator, Object obj, JavaType javatype, SerializerFactory serializerfactory)
        throws IOException, JsonGenerationException
    {
        if (serializerfactory == null)
        {
            throw new IllegalArgumentException("Can not pass null serializerFactory");
        }
        serializationconfig = createInstance(serializationconfig, serializerfactory);
        if (serializationconfig.getClass() != getClass())
        {
            throw new IllegalStateException((new StringBuilder()).append("Broken serializer provider: createInstance returned instance of type ").append(serializationconfig.getClass()).append("; blueprint of type ").append(getClass()).toString());
        } else
        {
            serializationconfig._serializeValue(jsongenerator, obj, javatype);
            return;
        }
    }

    public void setDefaultKeySerializer(JsonSerializer jsonserializer)
    {
        if (jsonserializer == null)
        {
            throw new IllegalArgumentException("Can not pass null JsonSerializer");
        } else
        {
            _keySerializer = jsonserializer;
            return;
        }
    }

    public void setNullKeySerializer(JsonSerializer jsonserializer)
    {
        if (jsonserializer == null)
        {
            throw new IllegalArgumentException("Can not pass null JsonSerializer");
        } else
        {
            _nullKeySerializer = jsonserializer;
            return;
        }
    }

    public void setNullValueSerializer(JsonSerializer jsonserializer)
    {
        if (jsonserializer == null)
        {
            throw new IllegalArgumentException("Can not pass null JsonSerializer");
        } else
        {
            _nullValueSerializer = jsonserializer;
            return;
        }
    }

}
