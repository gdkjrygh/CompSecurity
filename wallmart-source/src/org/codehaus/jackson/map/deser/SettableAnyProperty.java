// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.lang.reflect.Method;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.type.JavaType;

public final class SettableAnyProperty
{

    protected final BeanProperty _property;
    protected final Method _setter;
    protected final JavaType _type;
    protected JsonDeserializer _valueDeserializer;

    public SettableAnyProperty(BeanProperty beanproperty, Method method, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        _property = beanproperty;
        _type = javatype;
        _setter = method;
        _valueDeserializer = jsondeserializer;
    }

    public SettableAnyProperty(BeanProperty beanproperty, AnnotatedMethod annotatedmethod, JavaType javatype)
    {
        this(beanproperty, annotatedmethod, javatype, null);
    }

    public SettableAnyProperty(BeanProperty beanproperty, AnnotatedMethod annotatedmethod, JavaType javatype, JsonDeserializer jsondeserializer)
    {
        this(beanproperty, annotatedmethod.getAnnotated(), javatype, jsondeserializer);
    }

    private String getClassName()
    {
        return _setter.getDeclaringClass().getName();
    }

    protected void _throwAsIOE(Exception exception, String s, Object obj)
        throws IOException
    {
        if (exception instanceof IllegalArgumentException)
        {
            if (obj == null)
            {
                obj = "[NULL]";
            } else
            {
                obj = obj.getClass().getName();
            }
            s = (new StringBuilder("Problem deserializing \"any\" property '")).append(s);
            s.append((new StringBuilder()).append("' of class ").append(getClassName()).append(" (expected type: ").toString()).append(_type);
            s.append("; actual type: ").append(((String) (obj))).append(")");
            obj = exception.getMessage();
            if (obj != null)
            {
                s.append(", problem: ").append(((String) (obj)));
            } else
            {
                s.append(" (no error message provided)");
            }
            throw new JsonMappingException(s.toString(), null, exception);
        }
        if (exception instanceof IOException)
        {
            throw (IOException)exception;
        }
        if (exception instanceof RuntimeException)
        {
            throw (RuntimeException)exception;
        }
        for (; exception.getCause() != null; exception = exception.getCause()) { }
        throw new JsonMappingException(exception.getMessage(), null, exception);
    }

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            return null;
        } else
        {
            return _valueDeserializer.deserialize(jsonparser, deserializationcontext);
        }
    }

    public final void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        set(obj, s, deserialize(jsonparser, deserializationcontext));
    }

    public BeanProperty getProperty()
    {
        return _property;
    }

    public JavaType getType()
    {
        return _type;
    }

    public boolean hasValueDeserializer()
    {
        return _valueDeserializer != null;
    }

    public final void set(Object obj, String s, Object obj1)
        throws IOException
    {
        try
        {
            _setter.invoke(obj, new Object[] {
                s, obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            _throwAsIOE(((Exception) (obj)), s, obj1);
        }
    }

    public void setValueDeserializer(JsonDeserializer jsondeserializer)
    {
        if (_valueDeserializer != null)
        {
            throw new IllegalStateException("Already had assigned deserializer for SettableAnyProperty");
        } else
        {
            _valueDeserializer = jsondeserializer;
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[any property on class ").append(getClassName()).append("]").toString();
    }

    public SettableAnyProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new SettableAnyProperty(_property, _setter, _type, jsondeserializer);
    }
}
