// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package com.walmart.android.service:
//            ServiceException

public class JsonMapper
{

    private ObjectMapper mObjectMapper;

    public JsonMapper()
    {
        mObjectMapper = new ObjectMapper();
        mObjectMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mObjectMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }

    public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationproblemhandler)
    {
        mObjectMapper.getDeserializationConfig().addHandler(deserializationproblemhandler);
    }

    public JsonNode readTree(String s)
        throws JsonProcessingException, IOException
    {
        return mObjectMapper.readTree(s);
    }

    public Object readValue(File file, Class class1)
        throws JsonParseException, JsonMappingException, IOException
    {
        return mObjectMapper.readValue(file, class1);
    }

    public Object readValue(InputStream inputstream, Class class1)
        throws JsonParseException, JsonMappingException, IOException
    {
        return mObjectMapper.readValue(inputstream, class1);
    }

    public Object readValue(InputStream inputstream, TypeReference typereference)
        throws JsonParseException, JsonMappingException, IOException
    {
        return mObjectMapper.readValue(inputstream, typereference);
    }

    public Object readValue(String s, Class class1)
        throws JsonParseException, JsonMappingException, ServiceException, IOException
    {
        return mObjectMapper.readValue(s, class1);
    }

    public Object readValue(String s, TypeReference typereference)
        throws JsonParseException, JsonMappingException, ServiceException, IOException
    {
        return mObjectMapper.readValue(s, typereference);
    }

    public void writeValue(File file, Object obj)
        throws JsonGenerationException, JsonMappingException, IOException
    {
        mObjectMapper.writeValue(file, obj);
    }

    public String writeValueAsString(Object obj)
        throws JsonGenerationException, JsonMappingException, IOException
    {
        return mObjectMapper.writeValueAsString(obj);
    }
}
