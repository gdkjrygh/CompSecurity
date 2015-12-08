// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.deserializer;

import com.walmart.android.service.item.StringPair;
import com.walmart.android.service.item.model.Nutrition;
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
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.item.deserializer:
//            DefaultObjectMapper

public class NutritionFactsDeserializer extends JsonDeserializer
{

    private static final String CALORIE_INFORMATION = "calorie_information";
    private static final String KEY_NUTRIENTS = "key_nutrients";
    private static final ObjectMapper OBJ_MAPPER = DefaultObjectMapper.getInstance();
    private static final String SERVING_INFORMATION = "serving_information";
    private static final String STATIC_CONTENT = "static_content";
    private static final String TAG = com/walmart/android/service/item/deserializer/NutritionFactsDeserializer.getSimpleName();
    private static final String VITAMINS_MINERALS = "vitamins_minerals";

    public NutritionFactsDeserializer()
    {
    }

    public static com.walmart.android.service.item.model.Nutrition.Nutrient deserializeNutrient(JsonNode jsonnode)
    {
        String s = StringEscapeUtils.unescapeHtml4(getDisplayValue(jsonnode, "nutrient_amount"));
        String s1 = StringEscapeUtils.unescapeHtml4(getDisplayValue(jsonnode, "nutrient_dvp"));
        String s2 = StringEscapeUtils.unescapeHtml4(getDisplayValue(jsonnode, "nutrient_name"));
        ArrayList arraylist = new ArrayList();
        if (jsonnode != null && jsonnode.has("children"))
        {
            for (jsonnode = jsonnode.get("children").iterator(); jsonnode.hasNext(); arraylist.add(deserializeNutrient((JsonNode)jsonnode.next()))) { }
        }
        return new com.walmart.android.service.item.model.Nutrition.Nutrient(s2, s1, s, arraylist);
    }

    private String findDisplayValue(JsonNode jsonnode, String s)
    {
        if (jsonnode != null && jsonnode.has(s))
        {
            jsonnode = jsonnode.get(s).findValue("displayValue");
            if (jsonnode != null)
            {
                return jsonnode.getTextValue();
            }
        }
        return "";
    }

    private static Iterable getChildrenIterable(JsonNode jsonnode, String s)
    {
        if (jsonnode != null && jsonnode.has(s) && jsonnode.get(s).has("children"))
        {
            return jsonnode.get(s).get("children");
        } else
        {
            return Collections.emptyList();
        }
    }

    private static String getDisplayValue(JsonNode jsonnode, String s)
    {
        if (jsonnode != null && jsonnode.has(s) && jsonnode.get(s).has("displayValue"))
        {
            return jsonnode.get(s).get("displayValue").asText();
        } else
        {
            return "";
        }
    }

    public Nutrition deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        arraylist3 = new ArrayList();
        deserializationcontext = null;
        jsonparser = jsonparser.readValueAsTree();
        Iterator iterator = getChildrenIterable(jsonparser, "calorie_information").iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            JsonNode jsonnode = (JsonNode)iterator.next();
            if (jsonnode.has("valueMap"))
            {
                arraylist.add(deserializeNutrient(jsonnode.get("valueMap")));
            }
        } while (true);
          goto _L1
_L3:
        return new Nutrition(arraylist, arraylist1, arraylist2, arraylist3, jsonparser);
_L1:
        Iterator iterator1 = getChildrenIterable(jsonparser, "key_nutrients").iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            JsonNode jsonnode1 = (JsonNode)iterator1.next();
            if (jsonnode1.has("valueMap"))
            {
                arraylist1.add(deserializeNutrient(jsonnode1.get("valueMap")));
            }
        } while (true);
        Iterator iterator2 = getChildrenIterable(jsonparser, "serving_information").iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break;
            }
            JsonNode jsonnode2 = (JsonNode)iterator2.next();
            if (jsonnode2.has("valueMap") && jsonnode2.get("valueMap").getElements().hasNext())
            {
                arraylist2.add(OBJ_MAPPER.readValue((JsonNode)jsonnode2.get("valueMap").getElements().next(), com/walmart/android/service/item/StringPair));
            }
        } while (true);
        Iterator iterator3 = getChildrenIterable(jsonparser, "vitamins_minerals").iterator();
        do
        {
            if (!iterator3.hasNext())
            {
                break;
            }
            JsonNode jsonnode3 = (JsonNode)iterator3.next();
            if (jsonnode3.has("valueMap"))
            {
                arraylist3.add(deserializeNutrient(jsonnode3.get("valueMap")));
            }
        } while (true);
        try
        {
            jsonparser = findDisplayValue(jsonparser, "static_content");
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            WLog.e(TAG, "Failed deserialize [nutrition facts]", jsonparser);
            jsonparser = deserializationcontext;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

}
