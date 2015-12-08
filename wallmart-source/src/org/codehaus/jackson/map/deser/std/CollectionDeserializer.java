// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collection;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ResolvableDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.ValueInstantiator;
import org.codehaus.jackson.map.introspect.AnnotatedConstructor;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            ContainerDeserializerBase, StdValueInstantiator

public class CollectionDeserializer extends ContainerDeserializerBase
    implements ResolvableDeserializer
{

    protected final JavaType _collectionType;
    protected JsonDeserializer _delegateDeserializer;
    protected final JsonDeserializer _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    protected CollectionDeserializer(CollectionDeserializer collectiondeserializer)
    {
        super(collectiondeserializer._valueClass);
        _collectionType = collectiondeserializer._collectionType;
        _valueDeserializer = collectiondeserializer._valueDeserializer;
        _valueTypeDeserializer = collectiondeserializer._valueTypeDeserializer;
        _valueInstantiator = collectiondeserializer._valueInstantiator;
        _delegateDeserializer = collectiondeserializer._delegateDeserializer;
    }

    protected CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, Constructor constructor)
    {
        super(javatype.getRawClass());
        _collectionType = javatype;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
        javatype = new StdValueInstantiator(null, javatype);
        if (constructor != null)
        {
            javatype.configureFromObjectSettings(new AnnotatedConstructor(constructor, null, null), null, null, null, null);
        }
        _valueInstantiator = javatype;
    }

    public CollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator)
    {
        super(javatype.getRawClass());
        _collectionType = javatype;
        _valueDeserializer = jsondeserializer;
        _valueTypeDeserializer = typedeserializer;
        _valueInstantiator = valueinstantiator;
    }

    private final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
        throws IOException, JsonProcessingException
    {
        if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_collectionType.getRawClass());
        }
        JsonDeserializer jsondeserializer = _valueDeserializer;
        TypeDeserializer typedeserializer = _valueTypeDeserializer;
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            jsonparser = null;
        } else
        if (typedeserializer == null)
        {
            jsonparser = ((JsonParser) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
        } else
        {
            jsonparser = ((JsonParser) (jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
        }
        collection.add(jsonparser);
        return collection;
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext, (Collection)obj);
    }

    public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_delegateDeserializer != null)
        {
            return (Collection)_valueInstantiator.createUsingDelegate(_delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING)
        {
            String s = jsonparser.getText();
            if (s.length() == 0)
            {
                return (Collection)_valueInstantiator.createFromString(s);
            }
        }
        return deserialize(jsonparser, deserializationcontext, (Collection)_valueInstantiator.createUsingDefault());
    }

    public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
_L1:
        Object obj = handleNonArray(jsonparser, deserializationcontext, collection);
_L4:
        return ((Collection) (obj));
_L2:
        JsonDeserializer jsondeserializer = _valueDeserializer;
        TypeDeserializer typedeserializer = _valueTypeDeserializer;
        do
        {
            JsonToken jsontoken = jsonparser.nextToken();
            obj = collection;
            if (jsontoken == JsonToken.END_ARRAY)
            {
                continue;
            }
            if (jsontoken == JsonToken.VALUE_NULL)
            {
                obj = null;
            } else
            if (typedeserializer == null)
            {
                obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
            } else
            {
                obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
            }
            collection.add(obj);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
    }

    public JsonDeserializer getContentDeserializer()
    {
        return _valueDeserializer;
    }

    public JavaType getContentType()
    {
        return _collectionType.getContentType();
    }

    public void resolve(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider)
        throws JsonMappingException
    {
        if (_valueInstantiator.canCreateUsingDelegate())
        {
            JavaType javatype = _valueInstantiator.getDelegateType();
            if (javatype == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid delegate-creator definition for ").append(_collectionType).append(": value instantiator (").append(_valueInstantiator.getClass().getName()).append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'").toString());
            }
            _delegateDeserializer = findDeserializer(deserializationconfig, deserializerprovider, javatype, new org.codehaus.jackson.map.BeanProperty.Std(null, javatype, null, _valueInstantiator.getDelegateCreator()));
        }
    }
}
