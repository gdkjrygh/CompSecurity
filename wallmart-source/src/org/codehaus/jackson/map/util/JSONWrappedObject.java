// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.util;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializableWithType;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.JavaType;

public class JSONWrappedObject
    implements JsonSerializableWithType
{

    protected final String _prefix;
    protected final JavaType _serializationType;
    protected final String _suffix;
    protected final Object _value;

    public JSONWrappedObject(String s, String s1, Object obj)
    {
        this(s, s1, obj, (JavaType)null);
    }

    public JSONWrappedObject(String s, String s1, Object obj, Class class1)
    {
        _prefix = s;
        _suffix = s1;
        _value = obj;
        if (class1 == null)
        {
            s = null;
        } else
        {
            s = TypeFactory.defaultInstance().constructType(class1);
        }
        _serializationType = s;
    }

    public JSONWrappedObject(String s, String s1, Object obj, JavaType javatype)
    {
        _prefix = s;
        _suffix = s1;
        _value = obj;
        _serializationType = javatype;
    }

    public String getPrefix()
    {
        return _prefix;
    }

    public JavaType getSerializationType()
    {
        return _serializationType;
    }

    public String getSuffix()
    {
        return _suffix;
    }

    public Object getValue()
    {
        return _value;
    }

    public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        if (_prefix != null)
        {
            jsongenerator.writeRaw(_prefix);
        }
        if (_value == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
        } else
        if (_serializationType != null)
        {
            serializerprovider.findTypedValueSerializer(_serializationType, true, null).serialize(_value, jsongenerator, serializerprovider);
        } else
        {
            serializerprovider.findTypedValueSerializer(_value.getClass(), true, null).serialize(_value, jsongenerator, serializerprovider);
        }
        if (_suffix != null)
        {
            jsongenerator.writeRaw(_suffix);
        }
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serialize(jsongenerator, serializerprovider);
    }
}
