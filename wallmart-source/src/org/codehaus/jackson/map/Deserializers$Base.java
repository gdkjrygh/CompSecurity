// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.type.CollectionLikeType;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.MapLikeType;
import org.codehaus.jackson.map.type.MapType;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map:
//            Deserializers, JsonMappingException, DeserializationConfig, DeserializerProvider, 
//            BeanProperty, TypeDeserializer, JsonDeserializer, BeanDescription, 
//            KeyDeserializer

public static class n
    implements Deserializers
{

    public JsonDeserializer findArrayDeserializer(ArrayType arraytype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        return null;
    }

    public JsonDeserializer findBeanDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BeanDescription beandescription, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return null;
    }

    public JsonDeserializer findCollectionDeserializer(CollectionType collectiontype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BeanDescription beandescription, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        return null;
    }

    public JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType collectionliketype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BeanDescription beandescription, BeanProperty beanproperty, TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        return null;
    }

    public JsonDeserializer findEnumDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanDescription beandescription, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return null;
    }

    public JsonDeserializer findMapDeserializer(MapType maptype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BeanDescription beandescription, BeanProperty beanproperty, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, 
            JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        return null;
    }

    public JsonDeserializer findMapLikeDeserializer(MapLikeType mapliketype, DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider, BeanDescription beandescription, BeanProperty beanproperty, KeyDeserializer keydeserializer, TypeDeserializer typedeserializer, 
            JsonDeserializer jsondeserializer)
        throws JsonMappingException
    {
        return null;
    }

    public JsonDeserializer findTreeNodeDeserializer(Class class1, DeserializationConfig deserializationconfig, BeanProperty beanproperty)
        throws JsonMappingException
    {
        return null;
    }

    public n()
    {
    }
}
