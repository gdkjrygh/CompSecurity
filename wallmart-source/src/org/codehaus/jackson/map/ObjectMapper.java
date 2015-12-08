// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.codehaus.jackson.FormatSchema;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.PrettyPrinter;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.Versioned;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.io.SegmentedStringWriter;
import org.codehaus.jackson.io.SerializedString;
import org.codehaus.jackson.map.deser.BeanDeserializerModifier;
import org.codehaus.jackson.map.deser.StdDeserializationContext;
import org.codehaus.jackson.map.deser.StdDeserializerProvider;
import org.codehaus.jackson.map.deser.ValueInstantiators;
import org.codehaus.jackson.map.introspect.BasicClassIntrospector;
import org.codehaus.jackson.map.introspect.JacksonAnnotationIntrospector;
import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.jsontype.NamedType;
import org.codehaus.jackson.map.jsontype.SubtypeResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.jsontype.impl.StdSubtypeResolver;
import org.codehaus.jackson.map.jsontype.impl.StdTypeResolverBuilder;
import org.codehaus.jackson.map.ser.BeanSerializerFactory;
import org.codehaus.jackson.map.ser.BeanSerializerModifier;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.map.ser.StdSerializerProvider;
import org.codehaus.jackson.map.type.SimpleType;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.type.TypeModifier;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.NullNode;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.TreeTraversingParser;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jackson.util.ByteArrayBuilder;
import org.codehaus.jackson.util.DefaultPrettyPrinter;
import org.codehaus.jackson.util.TokenBuffer;
import org.codehaus.jackson.util.VersionUtil;

// Referenced classes of package org.codehaus.jackson.map:
//            MappingJsonFactory, SerializationConfig, DeserializationConfig, JsonMappingException, 
//            SerializerProvider, JsonDeserializer, DeserializerProvider, DeserializationContext, 
//            MappingIterator, ObjectReader, Module, ObjectWriter, 
//            AnnotationIntrospector, ClassIntrospector, InjectableValues, SerializerFactory, 
//            HandlerInstantiator, PropertyNamingStrategy, BeanProperty, TypeDeserializer, 
//            TypeSerializer, AbstractTypeResolver, Deserializers, KeyDeserializers, 
//            Serializers

public class ObjectMapper extends ObjectCodec
    implements Versioned
{
    public static class DefaultTypeResolverBuilder extends StdTypeResolverBuilder
    {

        protected final DefaultTyping _appliesFor;

        public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, Collection collection, BeanProperty beanproperty)
        {
            if (useForType(javatype))
            {
                return super.buildTypeDeserializer(deserializationconfig, javatype, collection, beanproperty);
            } else
            {
                return null;
            }
        }

        public TypeSerializer buildTypeSerializer(SerializationConfig serializationconfig, JavaType javatype, Collection collection, BeanProperty beanproperty)
        {
            if (useForType(javatype))
            {
                return super.buildTypeSerializer(serializationconfig, javatype, collection, beanproperty);
            } else
            {
                return null;
            }
        }

        public boolean useForType(JavaType javatype)
        {
            JavaType javatype1;
            JavaType javatype2;
            JavaType javatype3;
            boolean flag;
            flag = false;
            javatype1 = javatype;
            javatype2 = javatype;
            javatype3 = javatype;
            static class _cls2
            {

                static final int $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[];

                static 
                {
                    $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping = new int[DefaultTyping.values().length];
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$org$codehaus$jackson$map$ObjectMapper$DefaultTyping[DefaultTyping.NON_FINAL.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls2..SwitchMap.org.codehaus.jackson.map.ObjectMapper.DefaultTyping[_appliesFor.ordinal()];
            JVM INSTR tableswitch 1 3: default 48
        //                       1 59
        //                       2 76
        //                       3 98;
               goto _L1 _L2 _L3 _L4
_L1:
            if (javatype.getRawClass() != java/lang/Object) goto _L6; else goto _L5
_L5:
            return true;
_L2:
            javatype2 = javatype1;
            if (!javatype1.isArrayType()) goto _L3; else goto _L7
_L7:
            javatype1 = javatype1.getContentType();
              goto _L2
_L3:
            if (javatype2.getRawClass() == java/lang/Object || !javatype2.isConcrete())
            {
                flag = true;
            }
            return flag;
_L4:
            for (; javatype3.isArrayType(); javatype3 = javatype3.getContentType()) { }
            if (javatype3.isFinal())
            {
                return false;
            }
            if (true) goto _L5; else goto _L6
_L6:
            return false;
        }

        public DefaultTypeResolverBuilder(DefaultTyping defaulttyping)
        {
            _appliesFor = defaulttyping;
        }
    }

    public static final class DefaultTyping extends Enum
    {

        private static final DefaultTyping $VALUES[];
        public static final DefaultTyping JAVA_LANG_OBJECT;
        public static final DefaultTyping NON_CONCRETE_AND_ARRAYS;
        public static final DefaultTyping NON_FINAL;
        public static final DefaultTyping OBJECT_AND_NON_CONCRETE;

        public static DefaultTyping valueOf(String s)
        {
            return (DefaultTyping)Enum.valueOf(org/codehaus/jackson/map/ObjectMapper$DefaultTyping, s);
        }

        public static DefaultTyping[] values()
        {
            return (DefaultTyping[])$VALUES.clone();
        }

        static 
        {
            JAVA_LANG_OBJECT = new DefaultTyping("JAVA_LANG_OBJECT", 0);
            OBJECT_AND_NON_CONCRETE = new DefaultTyping("OBJECT_AND_NON_CONCRETE", 1);
            NON_CONCRETE_AND_ARRAYS = new DefaultTyping("NON_CONCRETE_AND_ARRAYS", 2);
            NON_FINAL = new DefaultTyping("NON_FINAL", 3);
            $VALUES = (new DefaultTyping[] {
                JAVA_LANG_OBJECT, OBJECT_AND_NON_CONCRETE, NON_CONCRETE_AND_ARRAYS, NON_FINAL
            });
        }

        private DefaultTyping(String s, int i)
        {
            super(s, i);
        }
    }


    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR = new JacksonAnnotationIntrospector();
    protected static final ClassIntrospector DEFAULT_INTROSPECTOR;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(org/codehaus/jackson/JsonNode);
    protected static final VisibilityChecker STD_VISIBILITY_CHECKER = org.codehaus.jackson.map.introspect.VisibilityChecker.Std.defaultInstance();
    protected DeserializationConfig _deserializationConfig;
    protected DeserializerProvider _deserializerProvider;
    protected InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected final ConcurrentHashMap _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected SerializerFactory _serializerFactory;
    protected SerializerProvider _serializerProvider;
    protected SubtypeResolver _subtypeResolver;
    protected TypeFactory _typeFactory;

    public ObjectMapper()
    {
        this(null, null, null);
    }

    public ObjectMapper(JsonFactory jsonfactory)
    {
        this(jsonfactory, null, null);
    }

    public ObjectMapper(JsonFactory jsonfactory, SerializerProvider serializerprovider, DeserializerProvider deserializerprovider)
    {
        this(jsonfactory, serializerprovider, deserializerprovider, null, null);
    }

    public ObjectMapper(JsonFactory jsonfactory, SerializerProvider serializerprovider, DeserializerProvider deserializerprovider, SerializationConfig serializationconfig, DeserializationConfig deserializationconfig)
    {
        _rootDeserializers = new ConcurrentHashMap(64, 0.6F, 2);
        if (jsonfactory == null)
        {
            _jsonFactory = new MappingJsonFactory(this);
        } else
        {
            _jsonFactory = jsonfactory;
            if (jsonfactory.getCodec() == null)
            {
                _jsonFactory.setCodec(this);
            }
        }
        _typeFactory = TypeFactory.defaultInstance();
        if (serializationconfig == null)
        {
            serializationconfig = new SerializationConfig(DEFAULT_INTROSPECTOR, DEFAULT_ANNOTATION_INTROSPECTOR, STD_VISIBILITY_CHECKER, null, null, _typeFactory, null);
        }
        _serializationConfig = serializationconfig;
        if (deserializationconfig == null)
        {
            deserializationconfig = new DeserializationConfig(DEFAULT_INTROSPECTOR, DEFAULT_ANNOTATION_INTROSPECTOR, STD_VISIBILITY_CHECKER, null, null, _typeFactory, null);
        }
        _deserializationConfig = deserializationconfig;
        jsonfactory = serializerprovider;
        if (serializerprovider == null)
        {
            jsonfactory = new StdSerializerProvider();
        }
        _serializerProvider = jsonfactory;
        jsonfactory = deserializerprovider;
        if (deserializerprovider == null)
        {
            jsonfactory = new StdDeserializerProvider();
        }
        _deserializerProvider = jsonfactory;
        _serializerFactory = BeanSerializerFactory.instance;
    }

    public ObjectMapper(SerializerFactory serializerfactory)
    {
        this(null, null, null);
        setSerializerFactory(serializerfactory);
    }

    private final void _configAndWriteCloseable(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        Closeable closeable;
        Object obj1;
        Closeable closeable1;
        closeable1 = (Closeable)obj;
        closeable = closeable1;
        obj1 = jsongenerator;
        _serializerProvider.serializeValue(serializationconfig, jsongenerator, obj, _serializerFactory);
        obj = null;
        closeable = closeable1;
        obj1 = obj;
        jsongenerator.close();
        closeable = null;
        obj1 = obj;
        closeable1.close();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        throw new NullPointerException();
        return;
        jsongenerator;
        if (obj1 != null)
        {
            try
            {
                ((JsonGenerator) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (closeable != null)
        {
            try
            {
                closeable.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw jsongenerator;
        jsongenerator;
    }

    private final void _writeCloseableValue(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        Closeable closeable;
        Closeable closeable1;
        closeable1 = (Closeable)obj;
        closeable = closeable1;
        _serializerProvider.serializeValue(serializationconfig, jsongenerator, obj, _serializerFactory);
        closeable = closeable1;
        if (!serializationconfig.isEnabled(SerializationConfig.Feature.FLUSH_AFTER_WRITE_VALUE))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        closeable = closeable1;
        jsongenerator.flush();
        closeable = null;
        closeable1.close();
        if (true)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        throw new NullPointerException();
        return;
        jsongenerator;
        if (closeable != null)
        {
            try
            {
                closeable.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw jsongenerator;
        jsongenerator;
    }

    protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        SerializationConfig serializationconfig;
        serializationconfig = copySerializationConfig();
        if (serializationconfig.isEnabled(SerializationConfig.Feature.INDENT_OUTPUT))
        {
            jsongenerator.useDefaultPrettyPrinter();
        }
        if (!serializationconfig.isEnabled(SerializationConfig.Feature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) goto _L2; else goto _L1
_L1:
        _configAndWriteCloseable(jsongenerator, obj, serializationconfig);
_L4:
        return;
_L2:
        boolean flag = false;
        _serializerProvider.serializeValue(serializationconfig, jsongenerator, obj, _serializerFactory);
        flag = true;
        jsongenerator.close();
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            jsongenerator.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            return;
        }
        obj;
        if (!flag)
        {
            try
            {
                jsongenerator.close();
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
        }
        throw obj;
    }

    protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj, Class class1)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        class1 = copySerializationConfig().withView(class1);
        if (class1.isEnabled(SerializationConfig.Feature.INDENT_OUTPUT))
        {
            jsongenerator.useDefaultPrettyPrinter();
        }
        if (!class1.isEnabled(SerializationConfig.Feature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) goto _L2; else goto _L1
_L1:
        _configAndWriteCloseable(jsongenerator, obj, class1);
_L4:
        return;
_L2:
        boolean flag = false;
        _serializerProvider.serializeValue(class1, jsongenerator, obj, _serializerFactory);
        flag = true;
        jsongenerator.close();
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            jsongenerator.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JsonGenerator jsongenerator)
        {
            return;
        }
        obj;
        if (!flag)
        {
            try
            {
                jsongenerator.close();
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator) { }
        }
        throw obj;
    }

    protected Object _convert(Object obj, JavaType javatype)
        throws IllegalArgumentException
    {
        if (obj == null)
        {
            return null;
        }
        TokenBuffer tokenbuffer = new TokenBuffer(this);
        try
        {
            writeValue(tokenbuffer, obj);
            obj = tokenbuffer.asParser();
            javatype = ((JavaType) (readValue(((JsonParser) (obj)), javatype)));
            ((JsonParser) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
        }
        return javatype;
    }

    protected DeserializationContext _createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return new StdDeserializationContext(deserializationconfig, jsonparser, _deserializerProvider, _injectableValues);
    }

    protected PrettyPrinter _defaultPrettyPrinter()
    {
        return new DefaultPrettyPrinter();
    }

    protected JsonDeserializer _findRootDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer = (JsonDeserializer)_rootDeserializers.get(javatype);
        if (jsondeserializer != null)
        {
            return jsondeserializer;
        }
        deserializationconfig = _deserializerProvider.findTypedValueDeserializer(deserializationconfig, javatype, null);
        if (deserializationconfig == null)
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not find a deserializer for type ").append(javatype).toString());
        } else
        {
            _rootDeserializers.put(javatype, deserializationconfig);
            return deserializationconfig;
        }
    }

    protected JsonToken _initForReading(JsonParser jsonparser)
        throws IOException, JsonParseException, JsonMappingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        Object obj = jsontoken;
        if (jsontoken == null)
        {
            jsonparser = jsonparser.nextToken();
            obj = jsonparser;
            if (jsonparser == null)
            {
                throw new EOFException("No content to map to Object due to end of input");
            }
        }
        return ((JsonToken) (obj));
    }

    protected Object _readMapAndClose(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        Object obj = _initForReading(jsonparser);
        if (obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        javatype = ((JavaType) (_findRootDeserializer(_deserializationConfig, javatype).getNullValue()));
_L3:
        jsonparser.clearCurrentToken();
        DeserializationContext deserializationcontext;
        JsonDeserializer jsondeserializer;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            return javatype;
        }
        return javatype;
_L2:
        if (obj == JsonToken.END_ARRAY || obj == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_124;
        }
label0:
        {
            obj = copyDeserializationConfig();
            deserializationcontext = _createDeserializationContext(jsonparser, ((DeserializationConfig) (obj)));
            jsondeserializer = _findRootDeserializer(((DeserializationConfig) (obj)), javatype);
            if (!((DeserializationConfig) (obj)).isEnabled(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE))
            {
                break label0;
            }
            javatype = ((JavaType) (_unwrapAndDeserialize(jsonparser, javatype, deserializationcontext, jsondeserializer)));
        }
          goto _L3
        javatype = ((JavaType) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
          goto _L3
        javatype;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser) { }
        throw javatype;
        javatype = null;
          goto _L3
    }

    protected Object _readValue(DeserializationConfig deserializationconfig, JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        JsonToken jsontoken = _initForReading(jsonparser);
        if (jsontoken == JsonToken.VALUE_NULL)
        {
            deserializationconfig = ((DeserializationConfig) (_findRootDeserializer(deserializationconfig, javatype).getNullValue()));
        } else
        if (jsontoken == JsonToken.END_ARRAY || jsontoken == JsonToken.END_OBJECT)
        {
            deserializationconfig = null;
        } else
        {
            DeserializationContext deserializationcontext = _createDeserializationContext(jsonparser, deserializationconfig);
            JsonDeserializer jsondeserializer = _findRootDeserializer(deserializationconfig, javatype);
            if (deserializationconfig.isEnabled(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE))
            {
                deserializationconfig = ((DeserializationConfig) (_unwrapAndDeserialize(jsonparser, javatype, deserializationcontext, jsondeserializer)));
            } else
            {
                deserializationconfig = ((DeserializationConfig) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
            }
        }
        jsonparser.clearCurrentToken();
        return deserializationconfig;
    }

    protected Object _unwrapAndDeserialize(JsonParser jsonparser, JavaType javatype, DeserializationContext deserializationcontext, JsonDeserializer jsondeserializer)
        throws IOException, JsonParseException, JsonMappingException
    {
        SerializedString serializedstring = _deserializerProvider.findExpectedRootName(deserializationcontext.getConfig(), javatype);
        if (jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not START_OBJECT (needed to unwrap root name '").append(serializedstring).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        if (jsonparser.nextToken() != JsonToken.FIELD_NAME)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not FIELD_NAME (to contain expected root name '").append(serializedstring).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        }
        String s = jsonparser.getCurrentName();
        if (!serializedstring.getValue().equals(s))
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Root name '").append(s).append("' does not match expected ('").append(serializedstring).append("') for type ").append(javatype).toString());
        }
        jsonparser.nextToken();
        javatype = ((JavaType) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
        if (jsonparser.nextToken() != JsonToken.END_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not END_OBJECT (to match wrapper object with root name '").append(serializedstring).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        } else
        {
            return javatype;
        }
    }

    public boolean canDeserialize(JavaType javatype)
    {
        return _deserializerProvider.hasValueDeserializerFor(copyDeserializationConfig(), javatype);
    }

    public boolean canSerialize(Class class1)
    {
        return _serializerProvider.hasSerializerFor(copySerializationConfig(), class1, _serializerFactory);
    }

    public ObjectMapper configure(org.codehaus.jackson.JsonGenerator.Feature feature, boolean flag)
    {
        _jsonFactory.configure(feature, flag);
        return this;
    }

    public ObjectMapper configure(org.codehaus.jackson.JsonParser.Feature feature, boolean flag)
    {
        _jsonFactory.configure(feature, flag);
        return this;
    }

    public ObjectMapper configure(DeserializationConfig.Feature feature, boolean flag)
    {
        _deserializationConfig.set(feature, flag);
        return this;
    }

    public ObjectMapper configure(SerializationConfig.Feature feature, boolean flag)
    {
        _serializationConfig.set(feature, flag);
        return this;
    }

    public JavaType constructType(Type type)
    {
        return _typeFactory.constructType(type);
    }

    public Object convertValue(Object obj, Class class1)
        throws IllegalArgumentException
    {
        return _convert(obj, _typeFactory.constructType(class1));
    }

    public Object convertValue(Object obj, JavaType javatype)
        throws IllegalArgumentException
    {
        return _convert(obj, javatype);
    }

    public Object convertValue(Object obj, TypeReference typereference)
        throws IllegalArgumentException
    {
        return _convert(obj, _typeFactory.constructType(typereference));
    }

    public DeserializationConfig copyDeserializationConfig()
    {
        return _deserializationConfig.createUnshared(_subtypeResolver).passSerializationFeatures(_serializationConfig._featureFlags);
    }

    public SerializationConfig copySerializationConfig()
    {
        return _serializationConfig.createUnshared(_subtypeResolver);
    }

    public volatile JsonNode createArrayNode()
    {
        return createArrayNode();
    }

    public ArrayNode createArrayNode()
    {
        return _deserializationConfig.getNodeFactory().arrayNode();
    }

    public volatile JsonNode createObjectNode()
    {
        return createObjectNode();
    }

    public ObjectNode createObjectNode()
    {
        return _deserializationConfig.getNodeFactory().objectNode();
    }

    public ObjectWriter defaultPrettyPrintingWriter()
    {
        return writerWithDefaultPrettyPrinter();
    }

    public transient ObjectMapper disable(DeserializationConfig.Feature afeature[])
    {
        _deserializationConfig = _deserializationConfig.without(afeature);
        return this;
    }

    public transient ObjectMapper disable(SerializationConfig.Feature afeature[])
    {
        _serializationConfig = _serializationConfig.without(afeature);
        return this;
    }

    public ObjectMapper disableDefaultTyping()
    {
        return setDefaultTyping(null);
    }

    public transient ObjectMapper enable(DeserializationConfig.Feature afeature[])
    {
        _deserializationConfig = _deserializationConfig.with(afeature);
        return this;
    }

    public transient ObjectMapper enable(SerializationConfig.Feature afeature[])
    {
        _serializationConfig = _serializationConfig.with(afeature);
        return this;
    }

    public ObjectMapper enableDefaultTyping()
    {
        return enableDefaultTyping(DefaultTyping.OBJECT_AND_NON_CONCRETE);
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaulttyping)
    {
        return enableDefaultTyping(defaulttyping, org.codehaus.jackson.annotate.JsonTypeInfo.As.WRAPPER_ARRAY);
    }

    public ObjectMapper enableDefaultTyping(DefaultTyping defaulttyping, org.codehaus.jackson.annotate.JsonTypeInfo.As as)
    {
        return setDefaultTyping((new DefaultTypeResolverBuilder(defaulttyping)).init(org.codehaus.jackson.annotate.JsonTypeInfo.Id.CLASS, null).inclusion(as));
    }

    public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaulttyping, String s)
    {
        return setDefaultTyping((new DefaultTypeResolverBuilder(defaulttyping)).init(org.codehaus.jackson.annotate.JsonTypeInfo.Id.CLASS, null).inclusion(org.codehaus.jackson.annotate.JsonTypeInfo.As.PROPERTY).typeProperty(s));
    }

    public ObjectWriter filteredWriter(FilterProvider filterprovider)
    {
        return writer(filterprovider);
    }

    public JsonSchema generateJsonSchema(Class class1)
        throws JsonMappingException
    {
        return generateJsonSchema(class1, copySerializationConfig());
    }

    public JsonSchema generateJsonSchema(Class class1, SerializationConfig serializationconfig)
        throws JsonMappingException
    {
        return _serializerProvider.generateJsonSchema(class1, serializationconfig, _serializerFactory);
    }

    public DeserializationConfig getDeserializationConfig()
    {
        return _deserializationConfig;
    }

    public DeserializerProvider getDeserializerProvider()
    {
        return _deserializerProvider;
    }

    public JsonFactory getJsonFactory()
    {
        return _jsonFactory;
    }

    public JsonNodeFactory getNodeFactory()
    {
        return _deserializationConfig.getNodeFactory();
    }

    public SerializationConfig getSerializationConfig()
    {
        return _serializationConfig;
    }

    public SerializerProvider getSerializerProvider()
    {
        return _serializerProvider;
    }

    public SubtypeResolver getSubtypeResolver()
    {
        if (_subtypeResolver == null)
        {
            _subtypeResolver = new StdSubtypeResolver();
        }
        return _subtypeResolver;
    }

    public TypeFactory getTypeFactory()
    {
        return _typeFactory;
    }

    public VisibilityChecker getVisibilityChecker()
    {
        return _serializationConfig.getDefaultVisibilityChecker();
    }

    public boolean isEnabled(org.codehaus.jackson.JsonGenerator.Feature feature)
    {
        return _jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(org.codehaus.jackson.JsonParser.Feature feature)
    {
        return _jsonFactory.isEnabled(feature);
    }

    public boolean isEnabled(DeserializationConfig.Feature feature)
    {
        return _deserializationConfig.isEnabled(feature);
    }

    public boolean isEnabled(SerializationConfig.Feature feature)
    {
        return _serializationConfig.isEnabled(feature);
    }

    public ObjectWriter prettyPrintingWriter(PrettyPrinter prettyprinter)
    {
        return writer(prettyprinter);
    }

    public JsonNode readTree(File file)
        throws IOException, JsonProcessingException
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(file), JSON_NODE_TYPE);
        file = jsonnode;
        if (jsonnode == null)
        {
            file = NullNode.instance;
        }
        return file;
    }

    public JsonNode readTree(InputStream inputstream)
        throws IOException, JsonProcessingException
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(inputstream), JSON_NODE_TYPE);
        inputstream = jsonnode;
        if (jsonnode == null)
        {
            inputstream = NullNode.instance;
        }
        return inputstream;
    }

    public JsonNode readTree(Reader reader1)
        throws IOException, JsonProcessingException
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(reader1), JSON_NODE_TYPE);
        reader1 = jsonnode;
        if (jsonnode == null)
        {
            reader1 = NullNode.instance;
        }
        return reader1;
    }

    public JsonNode readTree(String s)
        throws IOException, JsonProcessingException
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(s), JSON_NODE_TYPE);
        s = jsonnode;
        if (jsonnode == null)
        {
            s = NullNode.instance;
        }
        return s;
    }

    public JsonNode readTree(URL url)
        throws IOException, JsonProcessingException
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(url), JSON_NODE_TYPE);
        url = jsonnode;
        if (jsonnode == null)
        {
            url = NullNode.instance;
        }
        return url;
    }

    public JsonNode readTree(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        Object obj = copyDeserializationConfig();
        if (jsonparser.getCurrentToken() == null && jsonparser.nextToken() == null)
        {
            jsonparser = null;
        } else
        {
            obj = (JsonNode)_readValue(((DeserializationConfig) (obj)), jsonparser, JSON_NODE_TYPE);
            jsonparser = ((JsonParser) (obj));
            if (obj == null)
            {
                return getNodeFactory().nullNode();
            }
        }
        return jsonparser;
    }

    public JsonNode readTree(JsonParser jsonparser, DeserializationConfig deserializationconfig)
        throws IOException, JsonProcessingException
    {
        deserializationconfig = (JsonNode)_readValue(deserializationconfig, jsonparser, JSON_NODE_TYPE);
        jsonparser = deserializationconfig;
        if (deserializationconfig == null)
        {
            jsonparser = NullNode.instance;
        }
        return jsonparser;
    }

    public JsonNode readTree(byte abyte0[])
        throws IOException, JsonProcessingException
    {
        JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createJsonParser(abyte0), JSON_NODE_TYPE);
        abyte0 = jsonnode;
        if (jsonnode == null)
        {
            abyte0 = NullNode.instance;
        }
        return abyte0;
    }

    public Object readValue(File file, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(file), _typeFactory.constructType(class1));
    }

    public Object readValue(File file, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(file), javatype);
    }

    public Object readValue(File file, TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(file), _typeFactory.constructType(typereference));
    }

    public Object readValue(InputStream inputstream, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(inputstream), _typeFactory.constructType(class1));
    }

    public Object readValue(InputStream inputstream, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(inputstream), javatype);
    }

    public Object readValue(InputStream inputstream, TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(inputstream), _typeFactory.constructType(typereference));
    }

    public Object readValue(Reader reader1, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(reader1), _typeFactory.constructType(class1));
    }

    public Object readValue(Reader reader1, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(reader1), javatype);
    }

    public Object readValue(Reader reader1, TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(reader1), _typeFactory.constructType(typereference));
    }

    public Object readValue(String s, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(s), _typeFactory.constructType(class1));
    }

    public Object readValue(String s, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(s), javatype);
    }

    public Object readValue(String s, TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(s), _typeFactory.constructType(typereference));
    }

    public Object readValue(URL url, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(url), _typeFactory.constructType(class1));
    }

    public Object readValue(URL url, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(url), javatype);
    }

    public Object readValue(URL url, TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(url), _typeFactory.constructType(typereference));
    }

    public Object readValue(JsonNode jsonnode, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(copyDeserializationConfig(), treeAsTokens(jsonnode), _typeFactory.constructType(class1));
    }

    public Object readValue(JsonNode jsonnode, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(copyDeserializationConfig(), treeAsTokens(jsonnode), javatype);
    }

    public Object readValue(JsonNode jsonnode, TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(copyDeserializationConfig(), treeAsTokens(jsonnode), _typeFactory.constructType(typereference));
    }

    public Object readValue(JsonParser jsonparser, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(copyDeserializationConfig(), jsonparser, _typeFactory.constructType(class1));
    }

    public Object readValue(JsonParser jsonparser, Class class1, DeserializationConfig deserializationconfig)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(deserializationconfig, jsonparser, _typeFactory.constructType(class1));
    }

    public Object readValue(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(copyDeserializationConfig(), jsonparser, javatype);
    }

    public Object readValue(JsonParser jsonparser, JavaType javatype, DeserializationConfig deserializationconfig)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(deserializationconfig, jsonparser, javatype);
    }

    public Object readValue(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(copyDeserializationConfig(), jsonparser, _typeFactory.constructType(typereference));
    }

    public Object readValue(JsonParser jsonparser, TypeReference typereference, DeserializationConfig deserializationconfig)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readValue(deserializationconfig, jsonparser, _typeFactory.constructType(typereference));
    }

    public Object readValue(byte abyte0[], int i, int j, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0, i, j), _typeFactory.constructType(class1));
    }

    public Object readValue(byte abyte0[], int i, int j, JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0, i, j), javatype);
    }

    public Object readValue(byte abyte0[], int i, int j, TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0, i, j), _typeFactory.constructType(typereference));
    }

    public Object readValue(byte abyte0[], Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0), _typeFactory.constructType(class1));
    }

    public Object readValue(byte abyte0[], JavaType javatype)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0), javatype);
    }

    public Object readValue(byte abyte0[], TypeReference typereference)
        throws IOException, JsonParseException, JsonMappingException
    {
        return _readMapAndClose(_jsonFactory.createJsonParser(abyte0), _typeFactory.constructType(typereference));
    }

    public volatile Iterator readValues(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException
    {
        return readValues(jsonparser, class1);
    }

    public volatile Iterator readValues(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonProcessingException
    {
        return readValues(jsonparser, javatype);
    }

    public volatile Iterator readValues(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonProcessingException
    {
        return readValues(jsonparser, typereference);
    }

    public MappingIterator readValues(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException
    {
        return readValues(jsonparser, _typeFactory.constructType(class1));
    }

    public MappingIterator readValues(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonProcessingException
    {
        DeserializationConfig deserializationconfig = copyDeserializationConfig();
        return new MappingIterator(javatype, jsonparser, _createDeserializationContext(jsonparser, deserializationconfig), _findRootDeserializer(deserializationconfig, javatype), false, null);
    }

    public MappingIterator readValues(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonProcessingException
    {
        return readValues(jsonparser, _typeFactory.constructType(typereference));
    }

    public ObjectReader reader()
    {
        return (new ObjectReader(this, copyDeserializationConfig())).withInjectableValues(_injectableValues);
    }

    public ObjectReader reader(Class class1)
    {
        return reader(_typeFactory.constructType(class1));
    }

    public ObjectReader reader(FormatSchema formatschema)
    {
        return new ObjectReader(this, copyDeserializationConfig(), null, null, formatschema, _injectableValues);
    }

    public ObjectReader reader(InjectableValues injectablevalues)
    {
        return new ObjectReader(this, copyDeserializationConfig(), null, null, null, injectablevalues);
    }

    public ObjectReader reader(JsonNodeFactory jsonnodefactory)
    {
        return (new ObjectReader(this, copyDeserializationConfig())).withNodeFactory(jsonnodefactory);
    }

    public ObjectReader reader(JavaType javatype)
    {
        return new ObjectReader(this, copyDeserializationConfig(), javatype, null, null, _injectableValues);
    }

    public ObjectReader reader(TypeReference typereference)
    {
        return reader(_typeFactory.constructType(typereference));
    }

    public ObjectReader readerForUpdating(Object obj)
    {
        JavaType javatype = _typeFactory.constructType(obj.getClass());
        return new ObjectReader(this, copyDeserializationConfig(), javatype, obj, null, _injectableValues);
    }

    public void registerModule(Module module)
    {
        if (module.getModuleName() == null)
        {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (module.version() == null)
        {
            throw new IllegalArgumentException("Module without defined version");
        } else
        {
            module.setupModule(new Module.SetupContext() {

                final ObjectMapper this$0;
                final ObjectMapper val$mapper;

                public void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
                {
                    mapper._deserializerProvider = mapper._deserializerProvider.withAbstractTypeResolver(abstracttyperesolver);
                }

                public void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
                {
                    mapper._deserializerProvider = mapper._deserializerProvider.withDeserializerModifier(beandeserializermodifier);
                }

                public void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier)
                {
                    mapper._serializerFactory = mapper._serializerFactory.withSerializerModifier(beanserializermodifier);
                }

                public void addDeserializers(Deserializers deserializers)
                {
                    mapper._deserializerProvider = mapper._deserializerProvider.withAdditionalDeserializers(deserializers);
                }

                public void addKeyDeserializers(KeyDeserializers keydeserializers)
                {
                    mapper._deserializerProvider = mapper._deserializerProvider.withAdditionalKeyDeserializers(keydeserializers);
                }

                public void addKeySerializers(Serializers serializers)
                {
                    mapper._serializerFactory = mapper._serializerFactory.withAdditionalKeySerializers(serializers);
                }

                public void addSerializers(Serializers serializers)
                {
                    mapper._serializerFactory = mapper._serializerFactory.withAdditionalSerializers(serializers);
                }

                public void addTypeModifier(TypeModifier typemodifier)
                {
                    typemodifier = mapper._typeFactory.withModifier(typemodifier);
                    mapper.setTypeFactory(typemodifier);
                }

                public void addValueInstantiators(ValueInstantiators valueinstantiators)
                {
                    mapper._deserializerProvider = mapper._deserializerProvider.withValueInstantiators(valueinstantiators);
                }

                public void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
                {
                    mapper._deserializationConfig = mapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
                    mapper._serializationConfig = mapper._serializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
                }

                public DeserializationConfig getDeserializationConfig()
                {
                    return mapper.getDeserializationConfig();
                }

                public Version getMapperVersion()
                {
                    return version();
                }

                public SerializationConfig getSerializationConfig()
                {
                    return mapper.getSerializationConfig();
                }

                public void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
                {
                    mapper._deserializationConfig = mapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
                    mapper._serializationConfig = mapper._serializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
                }

                public boolean isEnabled(org.codehaus.jackson.JsonGenerator.Feature feature)
                {
                    return mapper.isEnabled(feature);
                }

                public boolean isEnabled(org.codehaus.jackson.JsonParser.Feature feature)
                {
                    return mapper.isEnabled(feature);
                }

                public boolean isEnabled(DeserializationConfig.Feature feature)
                {
                    return mapper.isEnabled(feature);
                }

                public boolean isEnabled(SerializationConfig.Feature feature)
                {
                    return mapper.isEnabled(feature);
                }

                public void setMixInAnnotations(Class class1, Class class2)
                {
                    mapper._deserializationConfig.addMixInAnnotations(class1, class2);
                    mapper._serializationConfig.addMixInAnnotations(class1, class2);
                }

            
            {
                this$0 = ObjectMapper.this;
                mapper = objectmapper1;
                super();
            }
            });
            return;
        }
    }

    public transient void registerSubtypes(Class aclass[])
    {
        getSubtypeResolver().registerSubtypes(aclass);
    }

    public transient void registerSubtypes(NamedType anamedtype[])
    {
        getSubtypeResolver().registerSubtypes(anamedtype);
    }

    public ObjectReader schemaBasedReader(FormatSchema formatschema)
    {
        return reader(formatschema);
    }

    public ObjectWriter schemaBasedWriter(FormatSchema formatschema)
    {
        return writer(formatschema);
    }

    public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        _serializationConfig = _serializationConfig.withAnnotationIntrospector(annotationintrospector);
        _deserializationConfig = _deserializationConfig.withAnnotationIntrospector(annotationintrospector);
        return this;
    }

    public void setDateFormat(DateFormat dateformat)
    {
        _deserializationConfig = _deserializationConfig.withDateFormat(dateformat);
        _serializationConfig = _serializationConfig.withDateFormat(dateformat);
    }

    public ObjectMapper setDefaultTyping(TypeResolverBuilder typeresolverbuilder)
    {
        _deserializationConfig = _deserializationConfig.withTypeResolverBuilder(typeresolverbuilder);
        _serializationConfig = _serializationConfig.withTypeResolverBuilder(typeresolverbuilder);
        return this;
    }

    public ObjectMapper setDeserializationConfig(DeserializationConfig deserializationconfig)
    {
        _deserializationConfig = deserializationconfig;
        return this;
    }

    public ObjectMapper setDeserializerProvider(DeserializerProvider deserializerprovider)
    {
        _deserializerProvider = deserializerprovider;
        return this;
    }

    public void setFilters(FilterProvider filterprovider)
    {
        _serializationConfig = _serializationConfig.withFilters(filterprovider);
    }

    public void setHandlerInstantiator(HandlerInstantiator handlerinstantiator)
    {
        _deserializationConfig = _deserializationConfig.withHandlerInstantiator(handlerinstantiator);
        _serializationConfig = _serializationConfig.withHandlerInstantiator(handlerinstantiator);
    }

    public ObjectMapper setInjectableValues(InjectableValues injectablevalues)
    {
        _injectableValues = injectablevalues;
        return this;
    }

    public ObjectMapper setNodeFactory(JsonNodeFactory jsonnodefactory)
    {
        _deserializationConfig = _deserializationConfig.withNodeFactory(jsonnodefactory);
        return this;
    }

    public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
    {
        _serializationConfig = _serializationConfig.withPropertyNamingStrategy(propertynamingstrategy);
        _deserializationConfig = _deserializationConfig.withPropertyNamingStrategy(propertynamingstrategy);
        return this;
    }

    public ObjectMapper setSerializationConfig(SerializationConfig serializationconfig)
    {
        _serializationConfig = serializationconfig;
        return this;
    }

    public ObjectMapper setSerializationInclusion(org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion inclusion)
    {
        _serializationConfig = _serializationConfig.withSerializationInclusion(inclusion);
        return this;
    }

    public ObjectMapper setSerializerFactory(SerializerFactory serializerfactory)
    {
        _serializerFactory = serializerfactory;
        return this;
    }

    public ObjectMapper setSerializerProvider(SerializerProvider serializerprovider)
    {
        _serializerProvider = serializerprovider;
        return this;
    }

    public void setSubtypeResolver(SubtypeResolver subtyperesolver)
    {
        _subtypeResolver = subtyperesolver;
    }

    public ObjectMapper setTypeFactory(TypeFactory typefactory)
    {
        _typeFactory = typefactory;
        _deserializationConfig = _deserializationConfig.withTypeFactory(typefactory);
        _serializationConfig = _serializationConfig.withTypeFactory(typefactory);
        return this;
    }

    public ObjectMapper setVisibility(JsonMethod jsonmethod, org.codehaus.jackson.annotate.JsonAutoDetect.Visibility visibility)
    {
        _deserializationConfig = _deserializationConfig.withVisibility(jsonmethod, visibility);
        _serializationConfig = _serializationConfig.withVisibility(jsonmethod, visibility);
        return this;
    }

    public void setVisibilityChecker(VisibilityChecker visibilitychecker)
    {
        _deserializationConfig = _deserializationConfig.withVisibilityChecker(visibilitychecker);
        _serializationConfig = _serializationConfig.withVisibilityChecker(visibilitychecker);
    }

    public JsonParser treeAsTokens(JsonNode jsonnode)
    {
        return new TreeTraversingParser(jsonnode, this);
    }

    public Object treeToValue(JsonNode jsonnode, Class class1)
        throws IOException, JsonParseException, JsonMappingException
    {
        return readValue(treeAsTokens(jsonnode), class1);
    }

    public ObjectWriter typedWriter(Class class1)
    {
        return writerWithType(class1);
    }

    public ObjectWriter typedWriter(JavaType javatype)
    {
        return writerWithType(javatype);
    }

    public ObjectWriter typedWriter(TypeReference typereference)
    {
        return writerWithType(typereference);
    }

    public ObjectReader updatingReader(Object obj)
    {
        return readerForUpdating(obj);
    }

    public JsonNode valueToTree(Object obj)
        throws IllegalArgumentException
    {
        if (obj == null)
        {
            return null;
        }
        Object obj1 = new TokenBuffer(this);
        try
        {
            writeValue(((JsonGenerator) (obj1)), obj);
            obj = ((TokenBuffer) (obj1)).asParser();
            obj1 = readTree(((JsonParser) (obj)));
            ((JsonParser) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
        }
        return ((JsonNode) (obj1));
    }

    public Version version()
    {
        return VersionUtil.versionFor(getClass());
    }

    public ObjectWriter viewWriter(Class class1)
    {
        return writerWithView(class1);
    }

    public ObjectMapper withModule(Module module)
    {
        registerModule(module);
        return this;
    }

    public void writeTree(JsonGenerator jsongenerator, JsonNode jsonnode)
        throws IOException, JsonProcessingException
    {
        SerializationConfig serializationconfig = copySerializationConfig();
        _serializerProvider.serializeValue(serializationconfig, jsongenerator, jsonnode, _serializerFactory);
        if (serializationconfig.isEnabled(SerializationConfig.Feature.FLUSH_AFTER_WRITE_VALUE))
        {
            jsongenerator.flush();
        }
    }

    public void writeTree(JsonGenerator jsongenerator, JsonNode jsonnode, SerializationConfig serializationconfig)
        throws IOException, JsonProcessingException
    {
        _serializerProvider.serializeValue(serializationconfig, jsongenerator, jsonnode, _serializerFactory);
        if (serializationconfig.isEnabled(SerializationConfig.Feature.FLUSH_AFTER_WRITE_VALUE))
        {
            jsongenerator.flush();
        }
    }

    public void writeValue(File file, Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        _configAndWriteValue(_jsonFactory.createJsonGenerator(file, JsonEncoding.UTF8), obj);
    }

    public void writeValue(OutputStream outputstream, Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        _configAndWriteValue(_jsonFactory.createJsonGenerator(outputstream, JsonEncoding.UTF8), obj);
    }

    public void writeValue(Writer writer1, Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        _configAndWriteValue(_jsonFactory.createJsonGenerator(writer1), obj);
    }

    public void writeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        SerializationConfig serializationconfig = copySerializationConfig();
        if (serializationconfig.isEnabled(SerializationConfig.Feature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
        {
            _writeCloseableValue(jsongenerator, obj, serializationconfig);
        } else
        {
            _serializerProvider.serializeValue(serializationconfig, jsongenerator, obj, _serializerFactory);
            if (serializationconfig.isEnabled(SerializationConfig.Feature.FLUSH_AFTER_WRITE_VALUE))
            {
                jsongenerator.flush();
                return;
            }
        }
    }

    public void writeValue(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        if (serializationconfig.isEnabled(SerializationConfig.Feature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
        {
            _writeCloseableValue(jsongenerator, obj, serializationconfig);
        } else
        {
            _serializerProvider.serializeValue(serializationconfig, jsongenerator, obj, _serializerFactory);
            if (serializationconfig.isEnabled(SerializationConfig.Feature.FLUSH_AFTER_WRITE_VALUE))
            {
                jsongenerator.flush();
                return;
            }
        }
    }

    public byte[] writeValueAsBytes(Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder(_jsonFactory._getBufferRecycler());
        _configAndWriteValue(_jsonFactory.createJsonGenerator(bytearraybuilder, JsonEncoding.UTF8), obj);
        obj = bytearraybuilder.toByteArray();
        bytearraybuilder.release();
        return ((byte []) (obj));
    }

    public String writeValueAsString(Object obj)
        throws IOException, JsonGenerationException, JsonMappingException
    {
        SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_jsonFactory._getBufferRecycler());
        _configAndWriteValue(_jsonFactory.createJsonGenerator(segmentedstringwriter), obj);
        return segmentedstringwriter.getAndClear();
    }

    public ObjectWriter writer()
    {
        return new ObjectWriter(this, copySerializationConfig());
    }

    public ObjectWriter writer(DateFormat dateformat)
    {
        return new ObjectWriter(this, copySerializationConfig().withDateFormat(dateformat));
    }

    public ObjectWriter writer(FormatSchema formatschema)
    {
        return new ObjectWriter(this, copySerializationConfig(), formatschema);
    }

    public ObjectWriter writer(PrettyPrinter prettyprinter)
    {
        PrettyPrinter prettyprinter1 = prettyprinter;
        if (prettyprinter == null)
        {
            prettyprinter1 = ObjectWriter.NULL_PRETTY_PRINTER;
        }
        return new ObjectWriter(this, copySerializationConfig(), null, prettyprinter1);
    }

    public ObjectWriter writer(FilterProvider filterprovider)
    {
        return new ObjectWriter(this, copySerializationConfig().withFilters(filterprovider));
    }

    public ObjectWriter writerWithDefaultPrettyPrinter()
    {
        return new ObjectWriter(this, copySerializationConfig(), null, _defaultPrettyPrinter());
    }

    public ObjectWriter writerWithType(Class class1)
    {
        if (class1 == null)
        {
            class1 = null;
        } else
        {
            class1 = _typeFactory.constructType(class1);
        }
        return new ObjectWriter(this, copySerializationConfig(), class1, null);
    }

    public ObjectWriter writerWithType(JavaType javatype)
    {
        return new ObjectWriter(this, copySerializationConfig(), javatype, null);
    }

    public ObjectWriter writerWithType(TypeReference typereference)
    {
        if (typereference == null)
        {
            typereference = null;
        } else
        {
            typereference = _typeFactory.constructType(typereference);
        }
        return new ObjectWriter(this, copySerializationConfig(), typereference, null);
    }

    public ObjectWriter writerWithView(Class class1)
    {
        return new ObjectWriter(this, copySerializationConfig().withView(class1));
    }

    static 
    {
        DEFAULT_INTROSPECTOR = BasicClassIntrospector.instance;
    }
}
