// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.codehaus.jackson.FormatSchema;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.Versioned;
import org.codehaus.jackson.io.SerializedString;
import org.codehaus.jackson.map.deser.StdDeserializationContext;
import org.codehaus.jackson.map.type.SimpleType;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.NullNode;
import org.codehaus.jackson.node.TreeTraversingParser;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;
import org.codehaus.jackson.util.VersionUtil;

// Referenced classes of package org.codehaus.jackson.map:
//            ObjectMapper, DeserializationConfig, JsonMappingException, JsonDeserializer, 
//            DeserializerProvider, DeserializationContext, MappingIterator, InjectableValues

public class ObjectReader extends ObjectCodec
    implements Versioned
{

    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(org/codehaus/jackson/JsonNode);
    protected final DeserializationConfig _config;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected final DeserializerProvider _provider;
    protected final ConcurrentHashMap _rootDeserializers;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    protected ObjectReader(ObjectMapper objectmapper, DeserializationConfig deserializationconfig)
    {
        this(objectmapper, deserializationconfig, null, null, null, null);
    }

    protected ObjectReader(ObjectMapper objectmapper, DeserializationConfig deserializationconfig, JavaType javatype, Object obj, FormatSchema formatschema, InjectableValues injectablevalues)
    {
        _config = deserializationconfig;
        _rootDeserializers = objectmapper._rootDeserializers;
        _provider = objectmapper._deserializerProvider;
        _jsonFactory = objectmapper._jsonFactory;
        _valueType = javatype;
        _valueToUpdate = obj;
        if (obj != null && javatype.isArrayType())
        {
            throw new IllegalArgumentException("Can not update an array value");
        } else
        {
            _schema = formatschema;
            _injectableValues = injectablevalues;
            _unwrapRoot = deserializationconfig.isEnabled(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE);
            return;
        }
    }

    protected ObjectReader(ObjectReader objectreader, DeserializationConfig deserializationconfig, JavaType javatype, Object obj, FormatSchema formatschema, InjectableValues injectablevalues)
    {
        _config = deserializationconfig;
        _rootDeserializers = objectreader._rootDeserializers;
        _provider = objectreader._provider;
        _jsonFactory = objectreader._jsonFactory;
        _valueType = javatype;
        _valueToUpdate = obj;
        if (obj != null && javatype.isArrayType())
        {
            throw new IllegalArgumentException("Can not update an array value");
        } else
        {
            _schema = formatschema;
            _injectableValues = injectablevalues;
            _unwrapRoot = deserializationconfig.isEnabled(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE);
            return;
        }
    }

    protected static JsonToken _initForReading(JsonParser jsonparser)
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

    protected Object _bind(JsonParser jsonparser)
        throws IOException, JsonParseException, JsonMappingException
    {
        Object obj = _initForReading(jsonparser);
        if (obj == JsonToken.VALUE_NULL)
        {
            if (_valueToUpdate == null)
            {
                obj = _findRootDeserializer(_config, _valueType).getNullValue();
            } else
            {
                obj = _valueToUpdate;
            }
        } else
        if (obj == JsonToken.END_ARRAY || obj == JsonToken.END_OBJECT)
        {
            obj = _valueToUpdate;
        } else
        {
            obj = _createDeserializationContext(jsonparser, _config);
            JsonDeserializer jsondeserializer = _findRootDeserializer(_config, _valueType);
            if (_unwrapRoot)
            {
                obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), _valueType, jsondeserializer);
            } else
            if (_valueToUpdate == null)
            {
                obj = jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)));
            } else
            {
                jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)), _valueToUpdate);
                obj = _valueToUpdate;
            }
        }
        jsonparser.clearCurrentToken();
        return obj;
    }

    protected Object _bindAndClose(JsonParser jsonparser)
        throws IOException, JsonParseException, JsonMappingException
    {
        if (_schema != null)
        {
            jsonparser.setSchema(_schema);
        }
        Object obj = _initForReading(jsonparser);
        if (obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
_L1:
        if (_valueToUpdate != null) goto _L4; else goto _L3
_L3:
        obj = _findRootDeserializer(_config, _valueType).getNullValue();
_L5:
        JsonDeserializer jsondeserializer;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            return obj;
        }
        return obj;
_L4:
        obj = _valueToUpdate;
          goto _L5
_L2:
label0:
        {
            if (obj != JsonToken.END_ARRAY && obj != JsonToken.END_OBJECT)
            {
                break label0;
            }
            obj = _valueToUpdate;
        }
          goto _L5
label1:
        {
            obj = _createDeserializationContext(jsonparser, _config);
            jsondeserializer = _findRootDeserializer(_config, _valueType);
            if (!_unwrapRoot)
            {
                break label1;
            }
            obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), _valueType, jsondeserializer);
        }
          goto _L5
label2:
        {
            if (_valueToUpdate != null)
            {
                break label2;
            }
            obj = jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)));
        }
          goto _L5
        jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)), _valueToUpdate);
        obj = _valueToUpdate;
          goto _L5
        obj;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser) { }
        throw obj;
    }

    protected JsonNode _bindAndCloseAsTree(JsonParser jsonparser)
        throws IOException, JsonParseException, JsonMappingException
    {
        if (_schema != null)
        {
            jsonparser.setSchema(_schema);
        }
        Object obj = _bindAsTree(jsonparser);
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            return ((JsonNode) (obj));
        }
        return ((JsonNode) (obj));
        obj;
        try
        {
            jsonparser.close();
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser) { }
        throw obj;
    }

    protected JsonNode _bindAsTree(JsonParser jsonparser)
        throws IOException, JsonParseException, JsonMappingException
    {
        Object obj = _initForReading(jsonparser);
        if (obj == JsonToken.VALUE_NULL || obj == JsonToken.END_ARRAY || obj == JsonToken.END_OBJECT)
        {
            obj = NullNode.instance;
        } else
        {
            obj = _createDeserializationContext(jsonparser, _config);
            JsonDeserializer jsondeserializer = _findRootDeserializer(_config, JSON_NODE_TYPE);
            if (_unwrapRoot)
            {
                obj = (JsonNode)_unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), JSON_NODE_TYPE, jsondeserializer);
            } else
            {
                obj = (JsonNode)jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)));
            }
        }
        jsonparser.clearCurrentToken();
        return ((JsonNode) (obj));
    }

    protected DeserializationContext _createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
    {
        return new StdDeserializationContext(deserializationconfig, jsonparser, _provider, _injectableValues);
    }

    protected JsonDeserializer _findRootDeserializer(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
        if (javatype == null)
        {
            throw new JsonMappingException("No value type configured for ObjectReader");
        }
        JsonDeserializer jsondeserializer = (JsonDeserializer)_rootDeserializers.get(javatype);
        if (jsondeserializer != null)
        {
            return jsondeserializer;
        }
        deserializationconfig = _provider.findTypedValueDeserializer(deserializationconfig, javatype, null);
        if (deserializationconfig == null)
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not find a deserializer for type ").append(javatype).toString());
        } else
        {
            _rootDeserializers.put(javatype, deserializationconfig);
            return deserializationconfig;
        }
    }

    protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype, JsonDeserializer jsondeserializer)
        throws IOException, JsonParseException, JsonMappingException
    {
        SerializedString serializedstring = _provider.findExpectedRootName(deserializationcontext.getConfig(), javatype);
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
        if (_valueToUpdate == null)
        {
            deserializationcontext = ((DeserializationContext) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
        } else
        {
            jsondeserializer.deserialize(jsonparser, deserializationcontext, _valueToUpdate);
            deserializationcontext = ((DeserializationContext) (_valueToUpdate));
        }
        if (jsonparser.nextToken() != JsonToken.END_OBJECT)
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not END_OBJECT (to match wrapper object with root name '").append(serializedstring).append("'), but ").append(jsonparser.getCurrentToken()).toString());
        } else
        {
            return deserializationcontext;
        }
    }

    public JsonNode createArrayNode()
    {
        return _config.getNodeFactory().arrayNode();
    }

    public JsonNode createObjectNode()
    {
        return _config.getNodeFactory().objectNode();
    }

    public JsonNode readTree(InputStream inputstream)
        throws IOException, JsonProcessingException
    {
        return _bindAndCloseAsTree(_jsonFactory.createJsonParser(inputstream));
    }

    public JsonNode readTree(Reader reader)
        throws IOException, JsonProcessingException
    {
        return _bindAndCloseAsTree(_jsonFactory.createJsonParser(reader));
    }

    public JsonNode readTree(String s)
        throws IOException, JsonProcessingException
    {
        return _bindAndCloseAsTree(_jsonFactory.createJsonParser(s));
    }

    public JsonNode readTree(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        return _bindAsTree(jsonparser);
    }

    public Object readValue(File file)
        throws IOException, JsonProcessingException
    {
        return _bindAndClose(_jsonFactory.createJsonParser(file));
    }

    public Object readValue(InputStream inputstream)
        throws IOException, JsonProcessingException
    {
        return _bindAndClose(_jsonFactory.createJsonParser(inputstream));
    }

    public Object readValue(Reader reader)
        throws IOException, JsonProcessingException
    {
        return _bindAndClose(_jsonFactory.createJsonParser(reader));
    }

    public Object readValue(String s)
        throws IOException, JsonProcessingException
    {
        return _bindAndClose(_jsonFactory.createJsonParser(s));
    }

    public Object readValue(URL url)
        throws IOException, JsonProcessingException
    {
        return _bindAndClose(_jsonFactory.createJsonParser(url));
    }

    public Object readValue(JsonNode jsonnode)
        throws IOException, JsonProcessingException
    {
        return _bindAndClose(treeAsTokens(jsonnode));
    }

    public Object readValue(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        return _bind(jsonparser);
    }

    public Object readValue(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException
    {
        return withType(class1).readValue(jsonparser);
    }

    public Object readValue(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonProcessingException
    {
        return withType(javatype).readValue(jsonparser);
    }

    public Object readValue(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonProcessingException
    {
        return withType(typereference).readValue(jsonparser);
    }

    public Object readValue(byte abyte0[])
        throws IOException, JsonProcessingException
    {
        return _bindAndClose(_jsonFactory.createJsonParser(abyte0));
    }

    public Object readValue(byte abyte0[], int i, int j)
        throws IOException, JsonProcessingException
    {
        return _bindAndClose(_jsonFactory.createJsonParser(abyte0, i, j));
    }

    public Iterator readValues(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException
    {
        return withType(class1).readValues(jsonparser);
    }

    public Iterator readValues(JsonParser jsonparser, JavaType javatype)
        throws IOException, JsonProcessingException
    {
        return withType(javatype).readValues(jsonparser);
    }

    public Iterator readValues(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonProcessingException
    {
        return withType(typereference).readValues(jsonparser);
    }

    public MappingIterator readValues(File file)
        throws IOException, JsonProcessingException
    {
        file = _jsonFactory.createJsonParser(file);
        if (_schema != null)
        {
            file.setSchema(_schema);
        }
        DeserializationContext deserializationcontext = _createDeserializationContext(file, _config);
        return new MappingIterator(_valueType, file, deserializationcontext, _findRootDeserializer(_config, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(InputStream inputstream)
        throws IOException, JsonProcessingException
    {
        inputstream = _jsonFactory.createJsonParser(inputstream);
        if (_schema != null)
        {
            inputstream.setSchema(_schema);
        }
        DeserializationContext deserializationcontext = _createDeserializationContext(inputstream, _config);
        return new MappingIterator(_valueType, inputstream, deserializationcontext, _findRootDeserializer(_config, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(Reader reader)
        throws IOException, JsonProcessingException
    {
        reader = _jsonFactory.createJsonParser(reader);
        if (_schema != null)
        {
            reader.setSchema(_schema);
        }
        DeserializationContext deserializationcontext = _createDeserializationContext(reader, _config);
        return new MappingIterator(_valueType, reader, deserializationcontext, _findRootDeserializer(_config, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(String s)
        throws IOException, JsonProcessingException
    {
        s = _jsonFactory.createJsonParser(s);
        if (_schema != null)
        {
            s.setSchema(_schema);
        }
        DeserializationContext deserializationcontext = _createDeserializationContext(s, _config);
        return new MappingIterator(_valueType, s, deserializationcontext, _findRootDeserializer(_config, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(URL url)
        throws IOException, JsonProcessingException
    {
        url = _jsonFactory.createJsonParser(url);
        if (_schema != null)
        {
            url.setSchema(_schema);
        }
        DeserializationContext deserializationcontext = _createDeserializationContext(url, _config);
        return new MappingIterator(_valueType, url, deserializationcontext, _findRootDeserializer(_config, _valueType), true, _valueToUpdate);
    }

    public MappingIterator readValues(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        DeserializationContext deserializationcontext = _createDeserializationContext(jsonparser, _config);
        return new MappingIterator(_valueType, jsonparser, deserializationcontext, _findRootDeserializer(_config, _valueType), false, _valueToUpdate);
    }

    public final MappingIterator readValues(byte abyte0[])
        throws IOException, JsonProcessingException
    {
        return readValues(abyte0, 0, abyte0.length);
    }

    public MappingIterator readValues(byte abyte0[], int i, int j)
        throws IOException, JsonProcessingException
    {
        abyte0 = _jsonFactory.createJsonParser(abyte0, i, j);
        if (_schema != null)
        {
            abyte0.setSchema(_schema);
        }
        DeserializationContext deserializationcontext = _createDeserializationContext(abyte0, _config);
        return new MappingIterator(_valueType, abyte0, deserializationcontext, _findRootDeserializer(_config, _valueType), true, _valueToUpdate);
    }

    public JsonParser treeAsTokens(JsonNode jsonnode)
    {
        return new TreeTraversingParser(jsonnode, this);
    }

    public Object treeToValue(JsonNode jsonnode, Class class1)
        throws IOException, JsonProcessingException
    {
        return readValue(treeAsTokens(jsonnode), class1);
    }

    public Version version()
    {
        return VersionUtil.versionFor(getClass());
    }

    public ObjectReader withInjectableValues(InjectableValues injectablevalues)
    {
        if (_injectableValues == injectablevalues)
        {
            return this;
        } else
        {
            return new ObjectReader(this, _config, _valueType, _valueToUpdate, _schema, injectablevalues);
        }
    }

    public ObjectReader withNodeFactory(JsonNodeFactory jsonnodefactory)
    {
        if (jsonnodefactory == _config.getNodeFactory())
        {
            return this;
        } else
        {
            return new ObjectReader(this, _config.withNodeFactory(jsonnodefactory), _valueType, _valueToUpdate, _schema, _injectableValues);
        }
    }

    public ObjectReader withSchema(FormatSchema formatschema)
    {
        if (_schema == formatschema)
        {
            return this;
        } else
        {
            return new ObjectReader(this, _config, _valueType, _valueToUpdate, formatschema, _injectableValues);
        }
    }

    public ObjectReader withType(Class class1)
    {
        return withType(_config.constructType(class1));
    }

    public ObjectReader withType(Type type)
    {
        return withType(_config.getTypeFactory().constructType(type));
    }

    public ObjectReader withType(JavaType javatype)
    {
        if (javatype == _valueType)
        {
            return this;
        } else
        {
            return new ObjectReader(this, _config, javatype, _valueToUpdate, _schema, _injectableValues);
        }
    }

    public ObjectReader withType(TypeReference typereference)
    {
        return withType(_config.getTypeFactory().constructType(typereference.getType()));
    }

    public ObjectReader withValueToUpdate(Object obj)
    {
        if (obj == _valueToUpdate)
        {
            return this;
        }
        if (obj == null)
        {
            throw new IllegalArgumentException("cat not update null value");
        }
        JavaType javatype;
        if (_valueType == null)
        {
            javatype = _config.constructType(obj.getClass());
        } else
        {
            javatype = _valueType;
        }
        return new ObjectReader(this, _config, javatype, obj, _schema, _injectableValues);
    }

    public void writeTree(JsonGenerator jsongenerator, JsonNode jsonnode)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public void writeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

}
