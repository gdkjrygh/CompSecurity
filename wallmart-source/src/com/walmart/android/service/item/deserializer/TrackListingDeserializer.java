// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.deserializer;

import com.walmart.android.service.item.model.Track;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class TrackListingDeserializer extends JsonDeserializer
{

    private static final String TAG = com/walmart/android/service/item/deserializer/TrackListingDeserializer.getSimpleName();
    private static final String TRACK_LIST = "track_list";

    public TrackListingDeserializer()
    {
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public ArrayList deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        deserializationcontext = new ArrayList();
        jsonparser = jsonparser.readValueAsTree();
        if (!jsonparser.has("track_list") || !jsonparser.get("track_list").has("values"))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        jsonparser = jsonparser.get("track_list").get("values").iterator();
_L2:
        JsonNode jsonnode;
        do
        {
            do
            {
                if (!jsonparser.hasNext())
                {
                    break MISSING_BLOCK_LABEL_149;
                }
                jsonnode = (JsonNode)jsonparser.next();
            } while (!jsonnode.has("nameValueList") || jsonnode.get("nameValueList").size() <= 0);
            jsonnode = jsonnode.get("nameValueList").get(0);
        } while (jsonnode == null);
        if (!jsonnode.has("displayValue")) goto _L2; else goto _L1
_L1:
        deserializationcontext.add(new Track(jsonnode.get("displayValue").asText()));
          goto _L2
        jsonparser;
        WLog.e(TAG, "Failed deserialize [track listings]", jsonparser);
        return deserializationcontext;
    }

}
