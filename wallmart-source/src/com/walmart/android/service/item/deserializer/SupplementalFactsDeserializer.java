// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.deserializer;

import com.walmart.android.service.item.model.SupplementFacts;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringEscapeUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

// Referenced classes of package com.walmart.android.service.item.deserializer:
//            CommonAttributes

public class SupplementalFactsDeserializer extends JsonDeserializer
{

    private static final String FOOTER = "footer";
    private static final String HEADER = "header";
    private static final String SEGMENT_1 = "segment_1";
    private static final String TAG = com/walmart/android/service/item/deserializer/SupplementalFactsDeserializer.getSimpleName();

    public SupplementalFactsDeserializer()
    {
    }

    private ArrayList getChildren(JsonNode jsonnode)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonnode != null && jsonnode.has("children"))
        {
            JsonNode jsonnode1;
            String s;
            String s1;
            for (jsonnode = jsonnode.get("children").iterator(); jsonnode.hasNext(); arraylist.add(new com.walmart.android.service.item.model.Nutrition.Nutrient(s, StringEscapeUtils.unescapeHtml4(CommonAttributes.replaceNbsp(getDisplayName(jsonnode1, "nutrient_dvp", ""))), s1, getChildren(jsonnode1))))
            {
                jsonnode1 = (JsonNode)jsonnode.next();
                s = StringEscapeUtils.unescapeHtml4(CommonAttributes.replaceNbsp(getDisplayName(jsonnode1, "nutrient_name", "")));
                s1 = StringEscapeUtils.unescapeHtml4(CommonAttributes.replaceNbsp(getDisplayName(jsonnode1, "nutrient_amount", "")));
            }

        }
        return arraylist;
    }

    private static String getDisplayName(JsonNode jsonnode, String s, String s1)
    {
        if (jsonnode.get("valueMap").has(s))
        {
            s1 = jsonnode.get("valueMap").get(s).get("displayValue").asText();
        }
        return s1;
    }

    private static void unescapeHtml4(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            list.set(i, StringEscapeUtils.unescapeHtml4((String)list.get(i)));
        }

    }

    public SupplementFacts deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        List list;
        List list1;
        List list2;
        ArrayList arraylist;
        list2 = Collections.emptyList();
        list1 = Collections.emptyList();
        arraylist = new ArrayList(1);
        list = list1;
        deserializationcontext = list2;
        JsonNode jsonnode1 = jsonparser.readValueAsTree();
        list = list1;
        deserializationcontext = list2;
        jsonparser = jsonnode1.get("header");
        list = list1;
        deserializationcontext = list2;
        JsonNode jsonnode = jsonnode1.get("footer");
        list = list1;
        deserializationcontext = list2;
        jsonnode1 = jsonnode1.get("segment_1");
        list = list1;
        deserializationcontext = list2;
        jsonparser = jsonparser.findValuesAsText("displayValue");
        list = list1;
        deserializationcontext = jsonparser;
        list1 = jsonnode.findValuesAsText("displayValue");
        list = list1;
        deserializationcontext = jsonparser;
        arraylist.add(new com.walmart.android.service.item.model.Nutrition.Nutrient(getChildren(jsonnode1)));
        list = list1;
        deserializationcontext = jsonparser;
        unescapeHtml4(jsonparser);
        list = list1;
        deserializationcontext = jsonparser;
        unescapeHtml4(list1);
        list = list1;
_L2:
        return new SupplementFacts(jsonparser, arraylist, list);
        jsonparser;
        WLog.e(TAG, "Failed deserialize [supplemental facts]", jsonparser);
        jsonparser = deserializationcontext;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

}
