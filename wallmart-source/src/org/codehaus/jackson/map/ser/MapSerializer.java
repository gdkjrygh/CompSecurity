// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.util.HashSet;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.type.JavaType;

public class MapSerializer extends org.codehaus.jackson.map.ser.std.MapSerializer
{

    protected MapSerializer()
    {
        this((HashSet)null, null, null, false, null, null, null, null);
    }

    protected MapSerializer(HashSet hashset, JavaType javatype, JavaType javatype1, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, BeanProperty beanproperty)
    {
        super(hashset, javatype, javatype1, flag, typeserializer, jsonserializer, null, beanproperty);
    }

    protected MapSerializer(HashSet hashset, JavaType javatype, JavaType javatype1, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, 
            BeanProperty beanproperty)
    {
        super(hashset, javatype, javatype1, flag, typeserializer, jsonserializer, jsonserializer1, beanproperty);
    }

    protected MapSerializer(HashSet hashset, JavaType javatype, boolean flag, TypeSerializer typeserializer)
    {
        super(hashset, UNSPECIFIED_TYPE, javatype, flag, typeserializer, null, null, null);
    }
}
