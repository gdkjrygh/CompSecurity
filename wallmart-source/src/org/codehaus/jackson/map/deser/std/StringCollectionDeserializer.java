// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
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
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            ContainerDeserializerBase

public final class StringCollectionDeserializer extends ContainerDeserializerBase
    implements ResolvableDeserializer
{

    protected final JavaType _collectionType;
    protected JsonDeserializer _delegateDeserializer;
    protected final boolean _isDefaultDeserializer;
    protected final JsonDeserializer _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    protected StringCollectionDeserializer(StringCollectionDeserializer stringcollectiondeserializer)
    {
        super(stringcollectiondeserializer._valueClass);
        _collectionType = stringcollectiondeserializer._collectionType;
        _valueDeserializer = stringcollectiondeserializer._valueDeserializer;
        _valueInstantiator = stringcollectiondeserializer._valueInstantiator;
        _isDefaultDeserializer = stringcollectiondeserializer._isDefaultDeserializer;
    }

    public StringCollectionDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, ValueInstantiator valueinstantiator)
    {
        super(javatype.getRawClass());
        _collectionType = javatype;
        _valueDeserializer = jsondeserializer;
        _valueInstantiator = valueinstantiator;
        _isDefaultDeserializer = isDefaultSerializer(jsondeserializer);
    }

    private Collection deserializeUsingCustom(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
        throws IOException, JsonProcessingException
    {
        JsonDeserializer jsondeserializer = _valueDeserializer;
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj != JsonToken.END_ARRAY)
            {
                if (obj == JsonToken.VALUE_NULL)
                {
                    obj = null;
                } else
                {
                    obj = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
                }
                collection.add(obj);
            } else
            {
                return collection;
            }
        } while (true);
    }

    private final Collection handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
        throws IOException, JsonProcessingException
    {
        if (!deserializationcontext.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_collectionType.getRawClass());
        }
        JsonDeserializer jsondeserializer = _valueDeserializer;
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            jsonparser = null;
        } else
        if (jsondeserializer == null)
        {
            jsonparser = jsonparser.getText();
        } else
        {
            jsonparser = (String)jsondeserializer.deserialize(jsonparser, deserializationcontext);
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
        } else
        {
            return deserialize(jsonparser, deserializationcontext, (Collection)_valueInstantiator.createUsingDefault());
        }
    }

    public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.isExpectedStartArrayToken()) goto _L2; else goto _L1
_L1:
        deserializationcontext = handleNonArray(jsonparser, deserializationcontext, collection);
_L4:
        return deserializationcontext;
_L2:
        if (!_isDefaultDeserializer)
        {
            return deserializeUsingCustom(jsonparser, deserializationcontext, collection);
        }
        do
        {
            JsonToken jsontoken = jsonparser.nextToken();
            deserializationcontext = collection;
            if (jsontoken == JsonToken.END_ARRAY)
            {
                continue;
            }
            if (jsontoken == JsonToken.VALUE_NULL)
            {
                deserializationcontext = null;
            } else
            {
                deserializationcontext = jsonparser.getText();
            }
            collection.add(deserializationcontext);
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
        org.codehaus.jackson.map.introspect.AnnotatedWithParams annotatedwithparams = _valueInstantiator.getDelegateCreator();
        if (annotatedwithparams != null)
        {
            JavaType javatype = _valueInstantiator.getDelegateType();
            _delegateDeserializer = findDeserializer(deserializationconfig, deserializerprovider, javatype, new org.codehaus.jackson.map.BeanProperty.Std(null, javatype, null, annotatedwithparams));
        }
    }
}
