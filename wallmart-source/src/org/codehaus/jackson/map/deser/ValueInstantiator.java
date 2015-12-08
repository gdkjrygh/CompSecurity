// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.deser;

import java.io.IOException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.introspect.AnnotatedWithParams;
import org.codehaus.jackson.type.JavaType;

// Referenced classes of package org.codehaus.jackson.map.deser:
//            SettableBeanProperty

public abstract class ValueInstantiator
{

    public ValueInstantiator()
    {
    }

    public boolean canCreateFromBoolean()
    {
        return false;
    }

    public boolean canCreateFromDouble()
    {
        return false;
    }

    public boolean canCreateFromInt()
    {
        return false;
    }

    public boolean canCreateFromLong()
    {
        return false;
    }

    public boolean canCreateFromObjectWith()
    {
        return false;
    }

    public boolean canCreateFromString()
    {
        return false;
    }

    public boolean canCreateUsingDefault()
    {
        return getDefaultCreator() != null;
    }

    public boolean canCreateUsingDelegate()
    {
        return getDelegateType() != null;
    }

    public boolean canInstantiate()
    {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public Object createFromBoolean(boolean flag)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from JSON boolean value").toString());
    }

    public Object createFromDouble(double d)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from JSON floating-point number").toString());
    }

    public Object createFromInt(int i)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from JSON int number").toString());
    }

    public Object createFromLong(long l)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from JSON long number").toString());
    }

    public Object createFromObjectWith(Object aobj[])
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" with arguments").toString());
    }

    public Object createFromString(String s)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" from JSON String").toString());
    }

    public Object createUsingDefault()
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append("; no default creator found").toString());
    }

    public Object createUsingDelegate(Object obj)
        throws IOException, JsonProcessingException
    {
        throw new JsonMappingException((new StringBuilder()).append("Can not instantiate value of type ").append(getValueTypeDesc()).append(" using delegate").toString());
    }

    public AnnotatedWithParams getDefaultCreator()
    {
        return null;
    }

    public AnnotatedWithParams getDelegateCreator()
    {
        return null;
    }

    public JavaType getDelegateType()
    {
        return null;
    }

    public SettableBeanProperty[] getFromObjectArguments()
    {
        return null;
    }

    public abstract String getValueTypeDesc();

    public AnnotatedWithParams getWithArgsCreator()
    {
        return null;
    }
}
