// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.ResolvableDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.SettableBeanProperty;
import org.codehaus.jackson.map.deser.ValueInstantiator;
import org.codehaus.jackson.map.deser.impl.PropertyBasedCreator;
import org.codehaus.jackson.map.deser.impl.PropertyValueBuffer;
import org.codehaus.jackson.map.introspect.AnnotatedConstructor;
import org.codehaus.jackson.map.util.ArrayBuilders;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            ContainerDeserializerBase, StdValueInstantiator

public class MapDeserializer extends ContainerDeserializerBase
    implements ResolvableDeserializer
{

    protected JsonDeserializer _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected HashSet _ignorableProperties;
    protected final KeyDeserializer _keyDeserializer;
    protected final JavaType _mapType;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected final JsonDeserializer _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    protected MapDeserializer(MapDeserializer mapdeserializer)
    {
        super(mapdeserializer._valueClass);
        _mapType = mapdeserializer._mapType;
        _keyDeserializer = mapdeserializer._keyDeserializer;
        _valueDeserializer = mapdeserializer._valueDeserializer;
        _valueTypeDeserializer = mapdeserializer._valueTypeDeserializer;
        _valueInstantiator = mapdeserializer._valueInstantiator;
        _propertyBasedCreator = mapdeserializer._propertyBasedCreator;
        _delegateDeserializer = mapdeserializer._delegateDeserializer;
        _hasDefaultCreator = mapdeserializer._hasDefaultCreator;
        _ignorableProperties = mapdeserializer._ignorableProperties;
    }

    protected MapDeserializer(JavaType javatype, Constructor constructor, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super(java/util/Map);
        _mapType = javatype;
        _keyDeserializer = keydeserializer;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
        javatype = new StdValueInstantiator(null, javatype);
        if (constructor != null)
        {
            javatype.configureFromObjectSettings(new AnnotatedConstructor(constructor, null, null), null, null, null, null);
        }
        boolean flag;
        if (constructor != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _hasDefaultCreator = flag;
        _valueInstantiator = javatype;
    }

    public MapDeserializer(JavaType javatype, ValueInstantiator valueinstantiator, KeyDeserializer keydeserializer, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer)
    {
        super(java/util/Map);
        _mapType = javatype;
        _keyDeserializer = keydeserializer;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
        _valueInstantiator = valueinstantiator;
        if (valueinstantiator.canCreateFromObjectWith())
        {
            _propertyBasedCreator = new PropertyBasedCreator(valueinstantiator);
        } else
        {
            _propertyBasedCreator = null;
        }
        _hasDefaultCreator = valueinstantiator.canCreateUsingDefault();
    }

    public Map _deserializeUsingCreator(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        PropertyBasedCreator propertybasedcreator = _propertyBasedCreator;
        PropertyValueBuffer propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext);
        Object obj1 = jsonparser.getCurrentToken();
        Object obj = obj1;
        if (obj1 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
        obj1 = _valueDeserializer;
        TypeDeserializer typedeserializer = _valueTypeDeserializer;
        while (obj == JsonToken.FIELD_NAME) 
        {
            Object obj2 = jsonparser.getCurrentName();
            obj = jsonparser.nextToken();
            if (_ignorableProperties != null && _ignorableProperties.contains(obj2))
            {
                jsonparser.skipChildren();
            } else
            {
                obj2 = propertybasedcreator.findCreatorProperty(((String) (obj2)));
                if (obj2 != null)
                {
                    obj = ((SettableBeanProperty) (obj2)).deserialize(jsonparser, deserializationcontext);
                    if (propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj2)).getPropertyIndex(), obj))
                    {
                        jsonparser.nextToken();
                        try
                        {
                            obj = (Map)propertybasedcreator.build(propertyvaluebuffer);
                        }
                        // Misplaced declaration of an exception variable
                        catch (JsonParser jsonparser)
                        {
                            wrapAndThrow(jsonparser, _mapType.getRawClass());
                            return null;
                        }
                        _readAndBind(jsonparser, deserializationcontext, ((Map) (obj)));
                        return ((Map) (obj));
                    }
                } else
                {
                    Object obj3 = jsonparser.getCurrentName();
                    obj3 = _keyDeserializer.deserializeKey(((String) (obj3)), deserializationcontext);
                    if (obj == JsonToken.VALUE_NULL)
                    {
                        obj = null;
                    } else
                    if (typedeserializer == null)
                    {
                        obj = ((JsonDeserializer) (obj1)).deserialize(jsonparser, deserializationcontext);
                    } else
                    {
                        obj = ((JsonDeserializer) (obj1)).deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
                    }
                    propertyvaluebuffer.bufferMapProperty(obj3, obj);
                }
            }
            obj = jsonparser.nextToken();
        }
        try
        {
            jsonparser = (Map)propertybasedcreator.build(propertyvaluebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            wrapAndThrow(jsonparser, _mapType.getRawClass());
            return null;
        }
        return jsonparser;
    }

    protected final void _readAndBind(JsonParser jsonparser, DeserializationContext deserializationcontext, Map map)
        throws IOException, JsonProcessingException
    {
        Object obj2 = jsonparser.getCurrentToken();
        Object obj = obj2;
        if (obj2 == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
        obj2 = _keyDeserializer;
        JsonDeserializer jsondeserializer = _valueDeserializer;
        TypeDeserializer typedeserializer = _valueTypeDeserializer;
        while (obj == JsonToken.FIELD_NAME) 
        {
            obj = jsonparser.getCurrentName();
            Object obj3 = ((KeyDeserializer) (obj2)).deserializeKey(((String) (obj)), deserializationcontext);
            JsonToken jsontoken = jsonparser.nextToken();
            if (_ignorableProperties != null && _ignorableProperties.contains(obj))
            {
                jsonparser.skipChildren();
            } else
            {
                Object obj1;
                if (jsontoken == JsonToken.VALUE_NULL)
                {
                    obj1 = null;
                } else
                if (typedeserializer == null)
                {
                    obj1 = jsondeserializer.deserialize(jsonparser, deserializationcontext);
                } else
                {
                    obj1 = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
                }
                map.put(obj3, obj1);
            }
            obj = jsonparser.nextToken();
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext, (Map)obj);
    }

    public Map deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_propertyBasedCreator != null)
        {
            return _deserializeUsingCreator(jsonparser, deserializationcontext);
        }
        if (_delegateDeserializer != null)
        {
            return (Map)_valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (!_hasDefaultCreator)
        {
            throw deserializationcontext.instantiationException(getMapClass(), "No default constructor found");
        }
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.START_OBJECT && jsontoken != JsonToken.FIELD_NAME && jsontoken != JsonToken.END_OBJECT)
        {
            if (jsontoken == JsonToken.VALUE_STRING)
            {
                return (Map)_valueInstantiator.createFromString(jsonparser.getText());
            } else
            {
                throw deserializationcontext.mappingException(getMapClass());
            }
        } else
        {
            Map map = (Map)_valueInstantiator.createUsingDefault();
            _readAndBind(jsonparser, deserializationcontext, map);
            return map;
        }
    }

    public Map deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Map map)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken != JsonToken.START_OBJECT && jsontoken != JsonToken.FIELD_NAME)
        {
            throw deserializationcontext.mappingException(getMapClass());
        } else
        {
            _readAndBind(jsonparser, deserializationcontext, map);
            return map;
        }
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _valueDeserializer;
    }

    public JavaType getContentType()
    {
        return _mapType.getContentType();
    }

    public final Class getMapClass()
    {
        return _mapType.getRawClass();
    }

    public JavaType getValueType()
    {
        return _mapType;
    }

    public void resolve(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider)
        throws JsonMappingException
    {
        if (_valueInstantiator.canCreateUsingDelegate())
        {
            JavaType javatype = _valueInstantiator.getDelegateType();
            if (javatype == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid delegate-creator definition for ").append(_mapType).append(": value instantiator (").append(_valueInstantiator.getClass().getName()).append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'").toString());
            }
            _delegateDeserializer = findDeserializer(deserializationconfig, deserializerprovider, javatype, new org.codehaus.jackson.map.BeanProperty.Std(null, javatype, null, _valueInstantiator.getDelegateCreator()));
        }
        if (_propertyBasedCreator != null)
        {
            Iterator iterator = _propertyBasedCreator.getCreatorProperties().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                SettableBeanProperty settablebeanproperty = (SettableBeanProperty)iterator.next();
                if (!settablebeanproperty.hasValueDeserializer())
                {
                    _propertyBasedCreator.assignDeserializer(settablebeanproperty, findDeserializer(deserializationconfig, deserializerprovider, settablebeanproperty.getType(), settablebeanproperty));
                }
            } while (true);
        }
    }

    public void setIgnorableProperties(String as[])
    {
        if (as == null || as.length == 0)
        {
            as = null;
        } else
        {
            as = ArrayBuilders.arrayToSet(as);
        }
        _ignorableProperties = as;
    }

    protected void wrapAndThrow(Throwable throwable, Object obj)
        throws IOException
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        if ((throwable instanceof IOException) && !(throwable instanceof JsonMappingException))
        {
            throw (IOException)throwable;
        } else
        {
            throw JsonMappingException.wrapWithPath(throwable, obj, null);
        }
    }
}
