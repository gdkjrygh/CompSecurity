// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;


// Referenced classes of package org.codehaus.jackson.map:
//            JsonMappingException, DeserializationConfig, BeanProperty, JsonDeserializer

public interface ContextualDeserializer
{

    public abstract JsonDeserializer createContextual(DeserializationConfig deserializationconfig, BeanProperty beanproperty)
        throws JsonMappingException;
}
