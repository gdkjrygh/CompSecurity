// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonObjectStreamingParser
{

    public JsonObjectStreamingParser()
    {
    }

    public JSONArray parseJsonArray(JsonReader jsonreader)
        throws IOException, JSONException
    {
        JSONArray jsonarray = new JSONArray();
        jsonreader.beginArray();
        do
        {
            if (!jsonreader.hasNext())
            {
                break;
            }
            JsonToken jsontoken = jsonreader.peek();
            static class _cls1
            {

                static final int $SwitchMap$com$google$gson$stream$JsonToken[];

                static 
                {
                    $SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
            {
            case 1: // '\001'
                jsonarray.put(parseJsonArray(jsonreader));
                break;

            case 2: // '\002'
                throw new JSONException("Invalid token found: End Array");

            case 3: // '\003'
                jsonarray.put(parseJsonObject(jsonreader));
                break;

            case 4: // '\004'
                throw new JSONException("Invalid token found: End Object");

            case 5: // '\005'
                throw new JSONException("Invalid token found: Name");

            case 6: // '\006'
                jsonarray.put(jsonreader.nextString());
                break;

            case 7: // '\007'
                Double double1 = Double.valueOf(jsonreader.nextDouble());
                long l = double1.longValue();
                if ((double)l == double1.doubleValue())
                {
                    jsonarray.put(Long.valueOf(l));
                } else
                {
                    jsonarray.put(double1);
                }
                break;

            case 8: // '\b'
                jsonarray.put(jsonreader.nextBoolean());
                break;

            case 9: // '\t'
                jsonarray.put(JSONObject.NULL);
                jsonreader.skipValue();
                break;

            case 10: // '\n'
                throw new JSONException("Invalid token found: End Document");
            }
        } while (true);
        jsonreader.endArray();
        return jsonarray;
    }

    public JSONObject parseJsonObject(JsonReader jsonreader)
        throws IOException, JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonreader.beginObject();
        String s = null;
        do
        {
            if (!jsonreader.hasNext())
            {
                break;
            }
            JsonToken jsontoken = jsonreader.peek();
            switch (_cls1..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
            {
            case 1: // '\001'
                if (s != null)
                {
                    jsonobject.put(s, parseJsonArray(jsonreader));
                    s = null;
                } else
                {
                    throw new JSONException("Value found without name");
                }
                break;

            case 2: // '\002'
                throw new JSONException("Invalid token found: End Array");

            case 3: // '\003'
                if (s != null)
                {
                    jsonobject.put(s, parseJsonObject(jsonreader));
                    s = null;
                } else
                {
                    throw new JSONException("Value found without name");
                }
                break;

            case 4: // '\004'
                throw new JSONException("Invalid token found: End Object");

            case 5: // '\005'
                s = jsonreader.nextName();
                break;

            case 6: // '\006'
                if (s != null)
                {
                    jsonobject.put(s, jsonreader.nextString());
                    s = null;
                } else
                {
                    throw new JSONException("Value found without name");
                }
                break;

            case 7: // '\007'
                if (s != null)
                {
                    Double double1 = Double.valueOf(jsonreader.nextDouble());
                    long l = double1.longValue();
                    if ((double)l == double1.doubleValue())
                    {
                        jsonobject.put(s, l);
                    } else
                    {
                        jsonobject.put(s, double1);
                    }
                    s = null;
                } else
                {
                    throw new JSONException("Value found without name");
                }
                break;

            case 8: // '\b'
                if (s != null)
                {
                    jsonobject.put(s, jsonreader.nextBoolean());
                    s = null;
                } else
                {
                    throw new JSONException("Value found without name");
                }
                break;

            case 9: // '\t'
                jsonobject.put(s, JSONObject.NULL);
                jsonreader.skipValue();
                break;

            case 10: // '\n'
                throw new JSONException("Invalid token found: End Document");
            }
        } while (true);
        jsonreader.endObject();
        return jsonobject;
    }
}
