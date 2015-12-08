// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.map.deser.ValueInstantiator;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;

// Referenced classes of package org.codehaus.jackson.map:
//            DeserializationConfig, JsonDeserializer, KeyDeserializer, SerializationConfig, 
//            JsonSerializer, MapperConfig

public abstract class HandlerInstantiator
{

    public HandlerInstantiator()
    {
    }

    public abstract JsonDeserializer deserializerInstance(DeserializationConfig deserializationconfig, Annotated annotated, Class class1);

    public abstract KeyDeserializer keyDeserializerInstance(DeserializationConfig deserializationconfig, Annotated annotated, Class class1);

    public abstract JsonSerializer serializerInstance(SerializationConfig serializationconfig, Annotated annotated, Class class1);

    public abstract TypeIdResolver typeIdResolverInstance(MapperConfig mapperconfig, Annotated annotated, Class class1);

    public abstract TypeResolverBuilder typeResolverBuilderInstance(MapperConfig mapperconfig, Annotated annotated, Class class1);

    public ValueInstantiator valueInstantiatorInstance(MapperConfig mapperconfig, Annotated annotated, Class class1)
    {
        return null;
    }
}
