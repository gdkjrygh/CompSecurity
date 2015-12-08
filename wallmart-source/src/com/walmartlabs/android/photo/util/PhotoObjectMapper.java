// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class PhotoObjectMapper
{

    private static PhotoObjectMapper sInstance;
    private ObjectMapper mMapper;

    private PhotoObjectMapper()
    {
        mMapper = new ObjectMapper();
        mMapper.setSerializationInclusion(org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion.NON_NULL);
        mMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static PhotoObjectMapper get()
    {
        com/walmartlabs/android/photo/util/PhotoObjectMapper;
        JVM INSTR monitorenter ;
        PhotoObjectMapper photoobjectmapper;
        if (sInstance == null)
        {
            sInstance = new PhotoObjectMapper();
        }
        photoobjectmapper = sInstance;
        com/walmartlabs/android/photo/util/PhotoObjectMapper;
        JVM INSTR monitorexit ;
        return photoobjectmapper;
        Exception exception;
        exception;
        throw exception;
    }

    public ObjectMapper mapper()
    {
        return mMapper;
    }

    public Object readFromStream(InputStream inputstream, Class class1)
    {
        inputstream = ((InputStream) (mMapper.readValue(inputstream, class1)));
        return inputstream;
        inputstream;
        inputstream.printStackTrace();
_L2:
        return null;
        inputstream;
        inputstream.printStackTrace();
        continue; /* Loop/switch isn't completed */
        inputstream;
        inputstream.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public List readFromStream(InputStream inputstream, TypeReference typereference)
    {
        inputstream = (List)mMapper.readValue(inputstream, typereference);
        return inputstream;
        inputstream;
        inputstream.printStackTrace();
_L2:
        return null;
        inputstream;
        inputstream.printStackTrace();
        continue; /* Loop/switch isn't completed */
        inputstream;
        inputstream.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object readFromString(String s, Class class1)
    {
        s = ((String) (mMapper.readValue(s, class1)));
        return s;
        s;
        s.printStackTrace();
_L2:
        return null;
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public List readFromString(String s, TypeReference typereference)
    {
        s = (List)mMapper.readValue(s, typereference);
        return s;
        s;
        s.printStackTrace();
_L2:
        return null;
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String writeAsString(Object obj)
    {
        obj = mMapper.writeValueAsString(obj);
        return ((String) (obj));
        obj;
        ((JsonProcessingException) (obj)).printStackTrace();
_L2:
        return null;
        obj;
        ((IOException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }
}
