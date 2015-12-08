// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.io.SerializedString;
import org.codehaus.jackson.map.AbstractTypeResolver;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.ContextualDeserializer;
import org.codehaus.jackson.map.ContextualKeyDeserializer;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializerFactory;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.Deserializers;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.KeyDeserializers;
import org.codehaus.jackson.map.ResolvableDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.CollectionLikeType;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.MapLikeType;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.RootNameLookup;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            BeanDeserializerFactory, BeanDeserializer, BeanDeserializerModifier, ValueInstantiators

public class StdDeserializerProvider extends DeserializerProvider
{
    protected static final class WrappedDeserializer extends JsonDeserializer
    {

        final JsonDeserializer _deserializer;
        final TypeDeserializer _typeDeserializer;

        public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
            throws IOException, JsonProcessingException
        {
            return _deserializer.deserializeWithType(jsonparser, deserializationcontext, _typeDeserializer);
        }

        public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
            throws IOException, JsonProcessingException
        {
            return _deserializer.deserialize(jsonparser, deserializationcontext, obj);
        }

        public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
            throws IOException, JsonProcessingException
        {
            throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
        }

        public WrappedDeserializer(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        {
            _typeDeserializer = typedeserializer;
            _deserializer = jsondeserializer;
        }
    }


    protected final ConcurrentHashMap _cachedDeserializers;
    protected DeserializerFactory _factory;
    protected final HashMap _incompleteDeserializers;
    protected final RootNameLookup _rootNames;

    public StdDeserializerProvider()
    {
        this(((DeserializerFactory) (BeanDeserializerFactory.instance)));
    }

    public StdDeserializerProvider(DeserializerFactory deserializerfactory)
    {
        _cachedDeserializers = new ConcurrentHashMap(64, 0.75F, 2);
        _incompleteDeserializers = new HashMap(8);
        _factory = deserializerfactory;
        _rootNames = new RootNameLookup();
    }

    protected JsonDeserializer _createAndCache2(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        try
        {
            beanproperty = _createDeserializer(deserializationconfig, javatype, beanproperty);
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationConfig deserializationconfig)
        {
            throw new JsonMappingException(deserializationconfig.getMessage(), null, deserializationconfig);
        }
        if (beanproperty == null)
        {
            deserializationconfig = null;
        } else
        {
            boolean flag2 = beanproperty instanceof ResolvableDeserializer;
            boolean flag;
            boolean flag1;
            if (beanproperty.getClass() == org/codehaus/jackson/map/deser/BeanDeserializer)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (!flag)
            {
                flag1 = flag;
                if (deserializationconfig.isEnabled(org.codehaus.jackson.map.DeserializationConfig.Feature.USE_ANNOTATIONS))
                {
                    Object obj = deserializationconfig.getAnnotationIntrospector();
                    obj = ((AnnotationIntrospector) (obj)).findCachability(AnnotatedClass.construct(beanproperty.getClass(), ((AnnotationIntrospector) (obj)), null));
                    flag1 = flag;
                    if (obj != null)
                    {
                        flag1 = ((Boolean) (obj)).booleanValue();
                    }
                }
            }
            if (flag2)
            {
                _incompleteDeserializers.put(javatype, beanproperty);
                _resolveDeserializer(deserializationconfig, (ResolvableDeserializer)beanproperty);
                _incompleteDeserializers.remove(javatype);
            }
            deserializationconfig = beanproperty;
            if (flag1)
            {
                _cachedDeserializers.put(javatype, beanproperty);
                return beanproperty;
            }
        }
        return deserializationconfig;
    }

    protected JsonDeserializer _createAndCacheValueDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        HashMap hashmap = _incompleteDeserializers;
        hashmap;
        JVM INSTR monitorenter ;
        JsonDeserializer jsondeserializer = _findCachedDeserializer(javatype);
        if (jsondeserializer == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return jsondeserializer;
        int i = _incompleteDeserializers.size();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        jsondeserializer = (JsonDeserializer)_incompleteDeserializers.get(javatype);
        if (jsondeserializer == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return jsondeserializer;
        deserializationconfig = _createAndCache2(deserializationconfig, javatype, beanproperty);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        if (_incompleteDeserializers.size() > 0)
        {
            _incompleteDeserializers.clear();
        }
        hashmap;
        JVM INSTR monitorexit ;
        return deserializationconfig;
        deserializationconfig;
        hashmap;
        JVM INSTR monitorexit ;
        throw deserializationconfig;
        deserializationconfig;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (_incompleteDeserializers.size() > 0)
        {
            _incompleteDeserializers.clear();
        }
        throw deserializationconfig;
    }

    protected JsonDeserializer _createDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        if (javatype.isEnumType())
        {
            return _factory.createEnumDeserializer(deserializationconfig, this, javatype, beanproperty);
        }
        if (javatype.isContainerType())
        {
            if (javatype.isArrayType())
            {
                return _factory.createArrayDeserializer(deserializationconfig, this, (ArrayType)javatype, beanproperty);
            }
            if (javatype.isMapLikeType())
            {
                javatype = (MapLikeType)javatype;
                if (javatype.isTrueMapType())
                {
                    return _factory.createMapDeserializer(deserializationconfig, this, (MapType)javatype, beanproperty);
                } else
                {
                    return _factory.createMapLikeDeserializer(deserializationconfig, this, javatype, beanproperty);
                }
            }
            if (javatype.isCollectionLikeType())
            {
                javatype = (CollectionLikeType)javatype;
                if (javatype.isTrueCollectionType())
                {
                    return _factory.createCollectionDeserializer(deserializationconfig, this, (CollectionType)javatype, beanproperty);
                } else
                {
                    return _factory.createCollectionLikeDeserializer(deserializationconfig, this, javatype, beanproperty);
                }
            }
        }
        if (org/codehaus/jackson/JsonNode.isAssignableFrom(javatype.getRawClass()))
        {
            return _factory.createTreeDeserializer(deserializationconfig, this, javatype, beanproperty);
        } else
        {
            return _factory.createBeanDeserializer(deserializationconfig, this, javatype, beanproperty);
        }
    }

    protected JsonDeserializer _findCachedDeserializer(JavaType javatype)
    {
        if (javatype == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            return (JsonDeserializer)_cachedDeserializers.get(javatype);
        }
    }

    protected KeyDeserializer _handleUnknownKeyDeserializer(JavaType javatype)
        throws JsonMappingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not find a (Map) Key deserializer for type ").append(javatype).toString());
    }

    protected JsonDeserializer _handleUnknownValueDeserializer(JavaType javatype)
        throws JsonMappingException
    {
        if (!ClassUtil.isConcrete(javatype.getRawClass()))
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not find a Value deserializer for abstract type ").append(javatype).toString());
        } else
        {
            throw new JsonMappingException((new StringBuilder()).append("Can not find a Value deserializer for type ").append(javatype).toString());
        }
    }

    protected void _resolveDeserializer(DeserializationConfig deserializationconfig, ResolvableDeserializer resolvabledeserializer)
        throws JsonMappingException
    {
        resolvabledeserializer.resolve(deserializationconfig, this);
    }

    public int cachedDeserializersCount()
    {
        return _cachedDeserializers.size();
    }

    public SerializedString findExpectedRootName(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
        return _rootNames.findRootName(javatype, deserializationconfig);
    }

    public KeyDeserializer findKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        KeyDeserializer keydeserializer1 = _factory.createKeyDeserializer(deserializationconfig, javatype, beanproperty);
        KeyDeserializer keydeserializer = keydeserializer1;
        if (keydeserializer1 instanceof ContextualKeyDeserializer)
        {
            keydeserializer = ((ContextualKeyDeserializer)keydeserializer1).createContextual(deserializationconfig, beanproperty);
        }
        deserializationconfig = keydeserializer;
        if (keydeserializer == null)
        {
            deserializationconfig = _handleUnknownKeyDeserializer(javatype);
        }
        return deserializationconfig;
    }

    public JsonDeserializer findTypedValueDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer = findValueDeserializer(deserializationconfig, javatype, beanproperty);
        javatype = _factory.findTypeDeserializer(deserializationconfig, javatype, beanproperty);
        deserializationconfig = jsondeserializer;
        if (javatype != null)
        {
            deserializationconfig = new WrappedDeserializer(javatype, jsondeserializer);
        }
        return deserializationconfig;
    }

    public JsonDeserializer findValueDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonDeserializer jsondeserializer = _findCachedDeserializer(javatype);
        if (jsondeserializer != null)
        {
            javatype = jsondeserializer;
            if (jsondeserializer instanceof ContextualDeserializer)
            {
                javatype = ((ContextualDeserializer)jsondeserializer).createContextual(deserializationconfig, beanproperty);
            }
            return javatype;
        }
        JsonDeserializer jsondeserializer1 = _createAndCacheValueDeserializer(deserializationconfig, javatype, beanproperty);
        jsondeserializer = jsondeserializer1;
        if (jsondeserializer1 == null)
        {
            jsondeserializer = _handleUnknownValueDeserializer(javatype);
        }
        javatype = jsondeserializer;
        if (jsondeserializer instanceof ContextualDeserializer)
        {
            javatype = ((ContextualDeserializer)jsondeserializer).createContextual(deserializationconfig, beanproperty);
        }
        return javatype;
    }

    public void flushCachedDeserializers()
    {
        _cachedDeserializers.clear();
    }

    public boolean hasValueDeserializerFor(DeserializationConfig deserializationconfig, JavaType javatype)
    {
        boolean flag = false;
        JsonDeserializer jsondeserializer1 = _findCachedDeserializer(javatype);
        JsonDeserializer jsondeserializer = jsondeserializer1;
        if (jsondeserializer1 == null)
        {
            try
            {
                jsondeserializer = _createAndCacheValueDeserializer(deserializationconfig, javatype, null);
            }
            // Misplaced declaration of an exception variable
            catch (DeserializationConfig deserializationconfig)
            {
                return false;
            }
        }
        if (jsondeserializer != null)
        {
            flag = true;
        }
        return flag;
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException
    {
        return _factory.mapAbstractType(deserializationconfig, javatype);
    }

    public DeserializerProvider withAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
    {
        return withFactory(_factory.withAbstractTypeResolver(abstracttyperesolver));
    }

    public DeserializerProvider withAdditionalDeserializers(Deserializers deserializers)
    {
        return withFactory(_factory.withAdditionalDeserializers(deserializers));
    }

    public DeserializerProvider withAdditionalKeyDeserializers(KeyDeserializers keydeserializers)
    {
        return withFactory(_factory.withAdditionalKeyDeserializers(keydeserializers));
    }

    public DeserializerProvider withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
    {
        return withFactory(_factory.withDeserializerModifier(beandeserializermodifier));
    }

    public volatile DeserializerProvider withFactory(DeserializerFactory deserializerfactory)
    {
        return withFactory(deserializerfactory);
    }

    public StdDeserializerProvider withFactory(DeserializerFactory deserializerfactory)
    {
        if (getClass() != org/codehaus/jackson/map/deser/StdDeserializerProvider)
        {
            throw new IllegalStateException((new StringBuilder()).append("DeserializerProvider of type ").append(getClass().getName()).append(" does not override 'withFactory()' method").toString());
        } else
        {
            return new StdDeserializerProvider(deserializerfactory);
        }
    }

    public DeserializerProvider withValueInstantiators(ValueInstantiators valueinstantiators)
    {
        return withFactory(_factory.withValueInstantiators(valueinstantiators));
    }
}
