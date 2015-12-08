// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map:
//            MapperConfig, BeanDescription, DeserializationConfig, SerializationConfig

public abstract class ClassIntrospector
{
    public static interface MixInResolver
    {

        public abstract Class findMixInClassFor(Class class1);
    }


    protected ClassIntrospector()
    {
    }

    public BeanDescription forClassAnnotations(MapperConfig mapperconfig, Class class1, MixInResolver mixinresolver)
    {
        return forClassAnnotations(mapperconfig, mapperconfig.constructType(class1), mixinresolver);
    }

    public abstract BeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, MixInResolver mixinresolver);

    public abstract BeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, MixInResolver mixinresolver);

    public abstract BeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, MixInResolver mixinresolver);

    public BeanDescription forDirectClassAnnotations(MapperConfig mapperconfig, Class class1, MixInResolver mixinresolver)
    {
        return forDirectClassAnnotations(mapperconfig, mapperconfig.constructType(class1), mixinresolver);
    }

    public abstract BeanDescription forDirectClassAnnotations(MapperConfig mapperconfig, JavaType javatype, MixInResolver mixinresolver);

    public abstract BeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, MixInResolver mixinresolver);
}
