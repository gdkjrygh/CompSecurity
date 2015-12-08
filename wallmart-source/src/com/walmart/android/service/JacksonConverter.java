// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import com.walmartlabs.kangaroo.service.Converter;
import java.io.IOException;
import okio.BufferedSource;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonConverter
    implements Converter
{

    private final ObjectMapper mObjectMapper;

    public JacksonConverter(ObjectMapper objectmapper)
    {
        mObjectMapper = objectmapper;
    }

    public Object from(BufferedSource bufferedsource, Class class1)
        throws IOException
    {
        return mObjectMapper.readValue(bufferedsource.inputStream(), class1);
    }

    public String getContentType()
    {
        return "application/json";
    }

    public String toString(Object obj)
        throws IOException
    {
        return mObjectMapper.writeValueAsString(obj);
    }
}
