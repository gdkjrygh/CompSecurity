// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.deserializer;

import com.walmart.android.service.item.StringPair;
import com.walmart.android.service.item.model.DrugFacts;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

public class DrugFactsDeserializer extends JsonDeserializer
{

    private static final String ACTIVE_INGREDIENTS = "active_ingredients";
    private static final String DIRECTIONS = "directions";
    private static final String INACTIVE_INGREDIENTS = "inactive_ingredients";
    private static final ObjectMapper OBJ_MAPPER;
    private static final String OTHER_INFORMATION = "other_information";
    private static final String QUESTIONS = "questions";
    private static final String TAG = com/walmart/android/service/item/deserializer/DrugFactsDeserializer.getSimpleName();
    private static final TypeFactory TYPE_FACTORY;
    private static final String WARNINGS = "warnings";

    public DrugFactsDeserializer()
    {
    }

    private List deserializeActiveIngredients(JsonNode jsonnode)
    {
        jsonnode = findNameValueListNode(jsonnode, "active_ingredients");
        if (jsonnode != null) goto _L2; else goto _L1
_L1:
        jsonnode = Collections.emptyList();
_L4:
        return jsonnode;
_L2:
        ArrayList arraylist = new ArrayList(jsonnode.size());
        Iterator iterator = jsonnode.iterator();
        do
        {
            jsonnode = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            JsonNode jsonnode1 = ((JsonNode)iterator.next()).findValue("nameValueList");
            jsonnode = jsonnode1.get(0).findValue("displayValue");
            jsonnode1 = jsonnode1.get(1).findValue("displayValue");
            if (jsonnode != null && jsonnode1 != null)
            {
                arraylist.add(new com.walmart.android.service.item.model.DrugFacts.Ingredient(jsonnode.asText(), jsonnode1.asText()));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private List deserializeDirections(JsonNode jsonnode)
    {
        jsonnode = getNameValueListNode(jsonnode, "directions");
        if (jsonnode != null)
        {
            return jsonnode.findValuesAsText("displayValue");
        } else
        {
            return Collections.emptyList();
        }
    }

    private String deserializeInActiveIngredients(JsonNode jsonnode)
    {
        jsonnode = getNameValueListNode(jsonnode, "inactive_ingredients");
        if (jsonnode != null && jsonnode.size() > 0)
        {
            jsonnode = jsonnode.get(0).findValue("displayValue");
            if (jsonnode != null)
            {
                return jsonnode.asText();
            } else
            {
                return "";
            }
        } else
        {
            return "";
        }
    }

    private List deserializeStringPairList(JsonNode jsonnode, String s)
    {
        jsonnode = getNameValueListNode(jsonnode, s);
        if (jsonnode == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        jsonnode = (List)OBJ_MAPPER.readValue(jsonnode, TYPE_FACTORY.constructCollectionType(java/util/ArrayList, com/walmart/android/service/item/StringPair));
        return jsonnode;
        jsonnode;
        WLog.e(TAG, (new StringBuilder()).append("Failed deserialize [").append(s).append("]").toString(), jsonnode);
        return Collections.emptyList();
    }

    private static JsonNode findNameValueListNode(JsonNode jsonnode, String s)
    {
        Object obj = null;
        if (jsonnode != null)
        {
            jsonnode = jsonnode.findValue(s);
        } else
        {
            jsonnode = null;
        }
        s = obj;
        if (jsonnode != null)
        {
            s = obj;
            if (jsonnode.has("values"))
            {
                s = jsonnode.get("values");
            }
        }
        return s;
    }

    private static JsonNode getNameValueListNode(JsonNode jsonnode, String s)
    {
        if (jsonnode != null && jsonnode.has(s) && jsonnode.get(s).has("values") && jsonnode.get(s).get("values").size() > 0)
        {
            return jsonnode.get(s).get("values").get(0).findValue("nameValueList");
        } else
        {
            return null;
        }
    }

    public DrugFacts deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        List list;
        String s;
        List list1;
        Object obj;
        String s1;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        list6 = Collections.emptyList();
        list2 = Collections.emptyList();
        s1 = "";
        list3 = Collections.emptyList();
        list4 = Collections.emptyList();
        list5 = Collections.emptyList();
        obj = list6;
        list1 = list2;
        s = s1;
        list = list3;
        deserializationcontext = list4;
        JsonNode jsonnode = jsonparser.readValueAsTree();
        obj = list6;
        list1 = list2;
        s = s1;
        list = list3;
        deserializationcontext = list4;
        jsonparser = deserializeActiveIngredients(jsonnode);
        obj = jsonparser;
        list1 = list2;
        s = s1;
        list = list3;
        deserializationcontext = list4;
        s1 = deserializeInActiveIngredients(jsonnode);
        obj = jsonparser;
        list1 = list2;
        s = s1;
        list = list3;
        deserializationcontext = list4;
        list2 = deserializeDirections(jsonnode);
        obj = jsonparser;
        list1 = list2;
        s = s1;
        list = list3;
        deserializationcontext = list4;
        list3 = deserializeStringPairList(jsonnode, "other_information");
        obj = jsonparser;
        list1 = list2;
        s = s1;
        list = list3;
        deserializationcontext = list4;
        list4 = deserializeStringPairList(jsonnode, "warnings");
        obj = jsonparser;
        list1 = list2;
        s = s1;
        list = list3;
        deserializationcontext = list4;
        list6 = deserializeStringPairList(jsonnode, "questions");
        obj = list6;
        deserializationcontext = list4;
        list = list3;
        s = s1;
        list1 = list2;
_L2:
        return new DrugFacts(jsonparser, list1, s, list, deserializationcontext, ((List) (obj)));
        jsonparser;
        WLog.e(TAG, "Failed deserialize [drug facts]", jsonparser);
        jsonparser = ((JsonParser) (obj));
        obj = list5;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    static 
    {
        OBJ_MAPPER = DefaultObjectMapper.getInstance();
        TYPE_FACTORY = OBJ_MAPPER.getTypeFactory();
    }
}
