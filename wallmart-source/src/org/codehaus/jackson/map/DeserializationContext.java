// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.codehaus.jackson.Base64Variant;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ArrayBuilders;
import org.codehaus.jackson.map.util.ObjectBuffer;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map:
//            DeserializationConfig, JsonMappingException, BeanProperty, DeserializerProvider, 
//            JsonDeserializer

public abstract class DeserializationContext
{

    protected final DeserializationConfig _config;
    protected final int _featureFlags;

    protected DeserializationContext(DeserializationConfig deserializationconfig)
    {
        _config = deserializationconfig;
        _featureFlags = deserializationconfig._featureFlags;
    }

    public abstract Calendar constructCalendar(Date date);

    public JavaType constructType(Class class1)
    {
        return _config.constructType(class1);
    }

    public abstract Object findInjectableValue(Object obj, BeanProperty beanproperty, Object obj1);

    public abstract ArrayBuilders getArrayBuilders();

    public Base64Variant getBase64Variant()
    {
        return _config.getBase64Variant();
    }

    public DeserializationConfig getConfig()
    {
        return _config;
    }

    public DeserializerProvider getDeserializerProvider()
    {
        return null;
    }

    public final JsonNodeFactory getNodeFactory()
    {
        return _config.getNodeFactory();
    }

    public abstract JsonParser getParser();

    public TypeFactory getTypeFactory()
    {
        return _config.getTypeFactory();
    }

    public abstract boolean handleUnknownProperty(JsonParser jsonparser, JsonDeserializer jsondeserializer, Object obj, String s)
        throws IOException, JsonProcessingException;

    public abstract JsonMappingException instantiationException(Class class1, String s);

    public abstract JsonMappingException instantiationException(Class class1, Throwable throwable);

    public boolean isEnabled(DeserializationConfig.Feature feature)
    {
        return (_featureFlags & feature.getMask()) != 0;
    }

    public abstract ObjectBuffer leaseObjectBuffer();

    public abstract JsonMappingException mappingException(Class class1);

    public abstract JsonMappingException mappingException(Class class1, JsonToken jsontoken);

    public JsonMappingException mappingException(String s)
    {
        return JsonMappingException.from(getParser(), s);
    }

    public abstract Date parseDate(String s)
        throws IllegalArgumentException;

    public abstract void returnObjectBuffer(ObjectBuffer objectbuffer);

    public abstract JsonMappingException unknownFieldException(Object obj, String s);

    public abstract JsonMappingException unknownTypeException(JavaType javatype, String s);

    public abstract JsonMappingException weirdKeyException(Class class1, String s, String s1);

    public abstract JsonMappingException weirdNumberException(Class class1, String s);

    public abstract JsonMappingException weirdStringException(Class class1, String s);

    public abstract JsonMappingException wrongTokenException(JsonParser jsonparser, JsonToken jsontoken, String s);
}
