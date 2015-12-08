// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.io.SerializedString;
import org.codehaus.jackson.map.deser.BeanDeserializerModifier;
import org.codehaus.jackson.map.deser.ValueInstantiators;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map:
//            JsonMappingException, DeserializationConfig, BeanProperty, KeyDeserializer, 
//            JsonDeserializer, AbstractTypeResolver, Deserializers, KeyDeserializers, 
//            DeserializerFactory

public abstract class DeserializerProvider
{

    protected DeserializerProvider()
    {
    }

    public abstract int cachedDeserializersCount();

    public abstract SerializedString findExpectedRootName(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException;

    public abstract KeyDeserializer findKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract JsonDeserializer findTypedValueDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract JsonDeserializer findValueDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract void flushCachedDeserializers();

    public abstract boolean hasValueDeserializerFor(DeserializationConfig deserializationconfig, JavaType javatype);

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException;

    public abstract DeserializerProvider withAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver);

    public abstract DeserializerProvider withAdditionalDeserializers(Deserializers deserializers);

    public abstract DeserializerProvider withAdditionalKeyDeserializers(KeyDeserializers keydeserializers);

    public abstract DeserializerProvider withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier);

    public abstract DeserializerProvider withFactory(DeserializerFactory deserializerfactory);

    public abstract DeserializerProvider withValueInstantiators(ValueInstantiators valueinstantiators);
}
