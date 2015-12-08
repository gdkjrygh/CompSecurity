// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.os.Bundle;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            GsonHelper

private static class <init>
    implements JsonSerializer
{

    public JsonElement serialize(Bundle bundle, Type type, JsonSerializationContext jsonserializationcontext)
    {
        type = new JsonArray();
        jsonserializationcontext = bundle.keySet().iterator();
        do
        {
            if (!jsonserializationcontext.hasNext())
            {
                return type;
            }
            String s = (String)jsonserializationcontext.next();
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("key", s);
            jsonobject.addProperty("value", bundle.get(s).toString());
            type.add(jsonobject);
        } while (true);
    }

    public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return serialize((Bundle)obj, type, jsonserializationcontext);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
