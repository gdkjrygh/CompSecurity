// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.map.deser.BeanDeserializerModifier;
import org.codehaus.jackson.map.deser.ValueInstantiator;
import org.codehaus.jackson.map.deser.ValueInstantiators;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.CollectionLikeType;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.MapLikeType;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map:
//            Deserializers, JsonMappingException, DeserializationConfig, DeserializerProvider, 
//            BeanProperty, JsonDeserializer, KeyDeserializer, TypeDeserializer, 
//            AbstractTypeResolver, KeyDeserializers

public abstract class DeserializerFactory
{
    public static abstract class Config
    {

        public abstract Iterable abstractTypeResolvers();

        public abstract Iterable deserializerModifiers();

        public abstract Iterable deserializers();

        public abstract boolean hasAbstractTypeResolvers();

        public abstract boolean hasDeserializerModifiers();

        public abstract boolean hasDeserializers();

        public abstract boolean hasKeyDeserializers();

        public abstract boolean hasValueInstantiators();

        public abstract Iterable keyDeserializers();

        public abstract Iterable valueInstantiators();

        public abstract Config withAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver);

        public abstract Config withAdditionalDeserializers(Deserializers deserializers1);

        public abstract Config withAdditionalKeyDeserializers(KeyDeserializers keydeserializers);

        public abstract Config withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier);

        public abstract Config withValueInstantiators(ValueInstantiators valueinstantiators);

        public Config()
        {
        }
    }


    protected static final Deserializers NO_DESERIALIZERS[] = new Deserializers[0];

    public DeserializerFactory()
    {
    }

    public abstract JsonDeserializer createArrayDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, ArrayType arraytype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract JsonDeserializer createBeanDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract JsonDeserializer createCollectionDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, CollectionType collectiontype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract JsonDeserializer createCollectionLikeDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, CollectionLikeType collectionliketype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract JsonDeserializer createEnumDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException;

    public KeyDeserializer createKeyDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return null;
    }

    public abstract JsonDeserializer createMapDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, MapType maptype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract JsonDeserializer createMapLikeDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, MapLikeType mapliketype, BeanProperty beanproperty)
        throws JsonMappingException;

    public abstract JsonDeserializer createTreeDeserializer(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException;

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return null;
    }

    public abstract ValueInstantiator findValueInstantiator(DeserializationConfig deserializationconfig, BasicBeanDescription basicbeandescription)
        throws JsonMappingException;

    public abstract Config getConfig();

    public abstract JavaType mapAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
        throws JsonMappingException;

    public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
    {
        return withConfig(getConfig().withAbstractTypeResolver(abstracttyperesolver));
    }

    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers)
    {
        return withConfig(getConfig().withAdditionalDeserializers(deserializers));
    }

    public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keydeserializers)
    {
        return withConfig(getConfig().withAdditionalKeyDeserializers(keydeserializers));
    }

    public abstract DeserializerFactory withConfig(Config config);

    public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
    {
        return withConfig(getConfig().withDeserializerModifier(beandeserializermodifier));
    }

    public final DeserializerFactory withValueInstantiators(ValueInstantiators valueinstantiators)
    {
        return withConfig(getConfig().withValueInstantiators(valueinstantiators));
    }

}
