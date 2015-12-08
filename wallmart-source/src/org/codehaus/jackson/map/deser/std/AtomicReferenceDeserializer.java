// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser.std;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.BeanProperty;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializerProvider;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ResolvableDeserializer;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser.std:
//            StdScalarDeserializer

public class AtomicReferenceDeserializer extends StdScalarDeserializer
    implements ResolvableDeserializer
{

    protected final BeanProperty _property;
    protected final JavaType _referencedType;
    protected JsonDeserializer _valueDeserializer;

    public AtomicReferenceDeserializer(JavaType javatype, BeanProperty beanproperty)
    {
        super(java/util/concurrent/atomic/AtomicReference);
        _referencedType = javatype;
        _property = beanproperty;
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public AtomicReference deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return new AtomicReference(_valueDeserializer.deserialize(jsonparser, deserializationcontext));
    }

    public void resolve(DeserializationConfig deserializationconfig, DeserializerProvider deserializerprovider)
        throws JsonMappingException
    {
        _valueDeserializer = deserializerprovider.findValueDeserializer(deserializationconfig, _referencedType, _property);
    }
}
