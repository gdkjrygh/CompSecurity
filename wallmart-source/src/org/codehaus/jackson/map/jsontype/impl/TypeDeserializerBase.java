// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.jsontype.impl;

import java.io.IOException;
import java.util.HashMap;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;
import org.codehaus.jackson.type.JavaType;

public abstract class TypeDeserializerBase extends TypeDeserializer
{

    protected final JavaType _baseType;
    protected final JavaType _defaultImpl;
    protected JsonDeserializer _defaultImplDeserializer;
    protected final HashMap _deserializers;
    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;

    protected TypeDeserializerBase(JavaType javatype, TypeIdResolver typeidresolver, BeanProperty beanproperty)
    {
        this(javatype, typeidresolver, beanproperty, null);
    }

    protected TypeDeserializerBase(JavaType javatype, TypeIdResolver typeidresolver, BeanProperty beanproperty, Class class1)
    {
        _baseType = javatype;
        _idResolver = typeidresolver;
        _property = beanproperty;
        _deserializers = new HashMap();
        if (class1 == null)
        {
            _defaultImpl = null;
            return;
        } else
        {
            _defaultImpl = javatype.forcedNarrowBy(class1);
            return;
        }
    }

    protected final JsonDeserializer _findDefaultImplDeserializer(DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_defaultImpl == null)
        {
            return null;
        }
        synchronized (_defaultImpl)
        {
            if (_defaultImplDeserializer == null)
            {
                _defaultImplDeserializer = deserializationcontext.getDeserializerProvider().findValueDeserializer(deserializationcontext.getConfig(), _defaultImpl, _property);
            }
            deserializationcontext = _defaultImplDeserializer;
        }
        return deserializationcontext;
        deserializationcontext;
        javatype;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
    }

    protected final JsonDeserializer _findDeserializer(DeserializationContext deserializationcontext, String s)
        throws IOException, JsonProcessingException
    {
        HashMap hashmap = _deserializers;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj1 = (JsonDeserializer)_deserializers.get(s);
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = _idResolver.typeFromId(s);
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        if (_defaultImpl == null)
        {
            throw deserializationcontext.unknownTypeException(_baseType, s);
        }
        break MISSING_BLOCK_LABEL_70;
        deserializationcontext;
        hashmap;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        deserializationcontext = _findDefaultImplDeserializer(deserializationcontext);
_L5:
        _deserializers.put(s, deserializationcontext);
        obj = deserializationcontext;
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return ((JsonDeserializer) (obj));
_L4:
        obj = obj1;
        if (_baseType == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj = obj1;
        if (_baseType.getClass() == obj1.getClass())
        {
            obj = _baseType.narrowBy(((JavaType) (obj1)).getRawClass());
        }
        deserializationcontext = deserializationcontext.getDeserializerProvider().findValueDeserializer(deserializationcontext.getConfig(), ((JavaType) (obj)), _property);
          goto _L5
    }

    public String baseTypeName()
    {
        return _baseType.getRawClass().getName();
    }

    public Class getDefaultImpl()
    {
        if (_defaultImpl == null)
        {
            return null;
        } else
        {
            return _defaultImpl.getRawClass();
        }
    }

    public String getPropertyName()
    {
        return null;
    }

    public TypeIdResolver getTypeIdResolver()
    {
        return _idResolver;
    }

    public abstract org.codehaus.jackson.annotate.JsonTypeInfo.As getTypeInclusion();

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[').append(getClass().getName());
        stringbuilder.append("; base-type:").append(_baseType);
        stringbuilder.append("; id-resolver: ").append(_idResolver);
        stringbuilder.append(']');
        return stringbuilder.toString();
    }
}
