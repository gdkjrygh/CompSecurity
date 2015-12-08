// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package io.theholygrail.dingo:
//            JsonTransformer

public class JsonHandler
    implements JsonTransformer
{

    private static JsonHandler sInstance;
    private ObjectMapper mMapper;

    private JsonHandler()
    {
        mMapper = new ObjectMapper();
        mMapper.setSerializationInclusion(org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion.NON_NULL);
        mMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static JsonHandler get()
    {
        io/theholygrail/dingo/JsonHandler;
        JVM INSTR monitorenter ;
        JsonHandler jsonhandler;
        if (sInstance == null)
        {
            sInstance = new JsonHandler();
        }
        jsonhandler = sInstance;
        io/theholygrail/dingo/JsonHandler;
        JVM INSTR monitorexit ;
        return jsonhandler;
        Exception exception;
        exception;
        throw exception;
    }

    public Object fromJson(String s, Class class1)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
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

    public String toJson(Object obj)
    {
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
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
