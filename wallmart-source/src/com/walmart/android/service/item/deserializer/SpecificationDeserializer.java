// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.deserializer;

import com.walmart.android.service.item.StringPair;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

// Referenced classes of package com.walmart.android.service.item.deserializer:
//            DefaultObjectMapper

public class SpecificationDeserializer extends JsonDeserializer
{

    private static final ObjectMapper OBJ_MAPPER;
    private static final String SPECIFICATIONS = "specifications";
    private static final String TAG = com/walmart/android/service/item/deserializer/SpecificationDeserializer.getSimpleName();
    private static final TypeFactory TYPE_FACTORY;

    public SpecificationDeserializer()
    {
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public List deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = null;
        jsonparser = jsonparser.readValueAsTree().get("specifications");
        if (jsonparser == null) goto _L2; else goto _L1
_L1:
        deserializationcontext = jsonparser.get("values");
_L4:
        jsonparser = obj;
        if (deserializationcontext == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        jsonparser = obj;
        if (deserializationcontext.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        deserializationcontext = deserializationcontext.get(0).get("nameValueList");
        jsonparser = obj;
        if (deserializationcontext != null)
        {
            try
            {
                jsonparser = (List)OBJ_MAPPER.readValue(deserializationcontext, TYPE_FACTORY.constructCollectionType(java/util/ArrayList, com/walmart/android/service/item/StringPair));
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                WLog.e(TAG, "Failed deserialize [specification]", jsonparser);
                jsonparser = obj;
            }
        }
        if (jsonparser != null)
        {
            return jsonparser;
        } else
        {
            return Collections.emptyList();
        }
_L2:
        deserializationcontext = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        OBJ_MAPPER = DefaultObjectMapper.getInstance();
        TYPE_FACTORY = OBJ_MAPPER.getTypeFactory();
    }
}
