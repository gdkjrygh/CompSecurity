// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotification

static class 
    implements JsonSerializer
{

    public JsonElement serialize( , Type type, JsonSerializationContext jsonserializationcontext)
    {
        type = new JsonArray();
        type.add(jsonserializationcontext.serialize(()));
        if (() != null)
        {
            type.add(jsonserializationcontext.serialize(()));
        }
        return type;
    }

    public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return serialize((serialize)obj, type, jsonserializationcontext);
    }

    ()
    {
    }
}
