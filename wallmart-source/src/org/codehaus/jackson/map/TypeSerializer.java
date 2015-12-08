// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;

public abstract class TypeSerializer
{

    public TypeSerializer()
    {
    }

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract org.codehaus.jackson.annotate.JsonTypeInfo.As getTypeInclusion();

    public abstract void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
        throws IOException, JsonProcessingException
    {
        writeTypePrefixForArray(obj, jsongenerator);
    }

    public abstract void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
        throws IOException, JsonProcessingException
    {
        writeTypePrefixForObject(obj, jsongenerator);
    }

    public abstract void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
        throws IOException, JsonProcessingException
    {
        writeTypePrefixForScalar(obj, jsongenerator);
    }

    public abstract void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public abstract void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;

    public abstract void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException;
}
