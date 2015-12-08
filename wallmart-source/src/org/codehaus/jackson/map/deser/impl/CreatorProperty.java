// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.SettableBeanProperty;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedParameter;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.type.JavaType;

public class CreatorProperty extends SettableBeanProperty
{

    protected final AnnotatedParameter _annotated;
    protected final Object _injectableValueId;

    public CreatorProperty(String s, JavaType javatype, TypeDeserializer typedeserializer, Annotations annotations, AnnotatedParameter annotatedparameter, int i, Object obj)
    {
        super(s, javatype, typedeserializer, annotations);
        _annotated = annotatedparameter;
        _propertyIndex = i;
        _injectableValueId = obj;
    }

    protected CreatorProperty(CreatorProperty creatorproperty, JsonDeserializer jsondeserializer)
    {
        super(creatorproperty, jsondeserializer);
        _annotated = creatorproperty._annotated;
        _injectableValueId = creatorproperty._injectableValueId;
    }

    public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        set(obj, deserialize(jsonparser, deserializationcontext));
    }

    public Object findInjectableValue(DeserializationContext deserializationcontext, Object obj)
    {
        if (_injectableValueId == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Property '").append(getName()).append("' (type ").append(getClass().getName()).append(") has no injectable value id configured").toString());
        } else
        {
            return deserializationcontext.findInjectableValue(_injectableValueId, this, obj);
        }
    }

    public Annotation getAnnotation(Class class1)
    {
        if (_annotated == null)
        {
            return null;
        } else
        {
            return _annotated.getAnnotation(class1);
        }
    }

    public Object getInjectableValueId()
    {
        return _injectableValueId;
    }

    public AnnotatedMember getMember()
    {
        return _annotated;
    }

    public void inject(DeserializationContext deserializationcontext, Object obj)
        throws IOException
    {
        set(obj, findInjectableValue(deserializationcontext, obj));
    }

    public void set(Object obj, Object obj1)
        throws IOException
    {
    }

    public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return withValueDeserializer(jsondeserializer);
    }

    public CreatorProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new CreatorProperty(this, jsondeserializer);
    }
}
