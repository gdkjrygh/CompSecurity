// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.stripe.net.APIResource;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.stripe.model:
//            Charge, Discount, Customer, Invoice, 
//            InvoiceItem, Plan, Subscription, Token, 
//            Coupon, Transfer, Dispute, EventData, 
//            StripeObject

public class EventDataDeserializer
    implements JsonDeserializer
{

    static Map objectMap;

    public EventDataDeserializer()
    {
    }

    private Object[] deserializeJsonArray(JsonArray jsonarray)
    {
        Object aobj[] = new Object[jsonarray.size()];
        jsonarray = jsonarray.iterator();
        int i = 0;
        while (jsonarray.hasNext()) 
        {
            JsonElement jsonelement = (JsonElement)jsonarray.next();
            i++;
            aobj[i] = deserializeJsonElement(jsonelement);
        }
        return aobj;
    }

    private Object deserializeJsonElement(JsonElement jsonelement)
    {
        if (jsonelement.isJsonNull())
        {
            return null;
        }
        if (jsonelement.isJsonObject())
        {
            HashMap hashmap = new HashMap();
            populateMapFromJSONObject(hashmap, jsonelement.getAsJsonObject());
            return hashmap;
        }
        if (jsonelement.isJsonPrimitive())
        {
            return deserializeJsonPrimitive(jsonelement.getAsJsonPrimitive());
        }
        if (jsonelement.isJsonArray())
        {
            return ((Object) (deserializeJsonArray(jsonelement.getAsJsonArray())));
        } else
        {
            System.err.println((new StringBuilder()).append("Unknown JSON element type for element ").append(jsonelement).append(". ").append("If you're seeing this messaage, it's probably a bug in the Stripe Java ").append("library. Please contact us by email at support@stripe.com.").toString());
            return null;
        }
    }

    private Object deserializeJsonPrimitive(JsonPrimitive jsonprimitive)
    {
        if (jsonprimitive.isBoolean())
        {
            return Boolean.valueOf(jsonprimitive.getAsBoolean());
        }
        if (jsonprimitive.isNumber())
        {
            return jsonprimitive.getAsNumber();
        } else
        {
            return jsonprimitive.getAsString();
        }
    }

    private void populateMapFromJSONObject(Map map, JsonObject jsonobject)
    {
        java.util.Map.Entry entry;
        for (jsonobject = jsonobject.entrySet().iterator(); jsonobject.hasNext(); map.put((String)entry.getKey(), deserializeJsonElement((JsonElement)entry.getValue())))
        {
            entry = (java.util.Map.Entry)jsonobject.next();
        }

    }

    public EventData deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
        throws JsonParseException
    {
        type = new EventData();
        jsonelement = jsonelement.getAsJsonObject().entrySet().iterator();
        do
        {
            if (!jsonelement.hasNext())
            {
                break;
            }
            jsondeserializationcontext = (java.util.Map.Entry)jsonelement.next();
            String s = (String)jsondeserializationcontext.getKey();
            Object obj = (JsonElement)jsondeserializationcontext.getValue();
            if ("previous_attributes".equals(s))
            {
                jsondeserializationcontext = new HashMap();
                populateMapFromJSONObject(jsondeserializationcontext, ((JsonElement) (obj)).getAsJsonObject());
                type.setPreviousAttributes(jsondeserializationcontext);
            } else
            if ("object".equals(s))
            {
                obj = ((JsonElement) (obj)).getAsJsonObject().get("object").getAsString();
                obj = (Class)objectMap.get(obj);
                type.setObject((StripeObject)APIResource.gson.fromJson((JsonElement)jsondeserializationcontext.getValue(), ((Class) (obj))));
            }
        } while (true);
        return type;
    }

    public volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
        throws JsonParseException
    {
        return deserialize(jsonelement, type, jsondeserializationcontext);
    }

    static 
    {
        objectMap = new HashMap();
        objectMap.put("charge", com/stripe/model/Charge);
        objectMap.put("discount", com/stripe/model/Discount);
        objectMap.put("customer", com/stripe/model/Customer);
        objectMap.put("invoice", com/stripe/model/Invoice);
        objectMap.put("invoiceitem", com/stripe/model/InvoiceItem);
        objectMap.put("plan", com/stripe/model/Plan);
        objectMap.put("subscription", com/stripe/model/Subscription);
        objectMap.put("token", com/stripe/model/Token);
        objectMap.put("coupon", com/stripe/model/Coupon);
        objectMap.put("transfer", com/stripe/model/Transfer);
        objectMap.put("dispute", com/stripe/model/Dispute);
    }
}
