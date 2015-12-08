// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            GsonHelper

private static class <init>
    implements JsonSerializer
{

    public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return serialize((Map)obj, type, jsonserializationcontext);
    }

    public JsonElement serialize(Map map, Type type, JsonSerializationContext jsonserializationcontext)
    {
        if (map.size() == 0)
        {
            return null;
        } else
        {
            return jsonserializationcontext.serialize(map);
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
