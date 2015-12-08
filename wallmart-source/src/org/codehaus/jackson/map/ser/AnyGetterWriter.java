// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser;

import java.lang.reflect.Method;
import java.util.Map;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.ser.std.MapSerializer;

public class AnyGetterWriter
{

    protected final Method _anyGetter;
    protected final MapSerializer _serializer;

    public AnyGetterWriter(AnnotatedMethod annotatedmethod, MapSerializer mapserializer)
    {
        _anyGetter = annotatedmethod.getAnnotated();
        _serializer = mapserializer;
    }

    public void getAndSerialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        obj = _anyGetter.invoke(obj, new Object[0]);
        if (obj == null)
        {
            return;
        }
        if (!(obj instanceof Map))
        {
            throw new JsonMappingException((new StringBuilder()).append("Value returned by 'any-getter' (").append(_anyGetter.getName()).append("()) not java.util.Map but ").append(obj.getClass().getName()).toString());
        } else
        {
            _serializer.serializeFields((Map)obj, jsongenerator, serializerprovider);
            return;
        }
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        _serializer.resolve(serializerprovider);
    }
}
