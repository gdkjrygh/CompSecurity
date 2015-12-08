// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnImageAsset

static class Q
    implements JsonSerializer
{

    public JsonElement serialize(SrnImageAsset srnimageasset, Type type, JsonSerializationContext jsonserializationcontext)
    {
        type = new JsonObject();
        if (SrnImageAsset.access$1(srnimageasset) != null)
        {
            type.addProperty("uri", ._mth0(SrnImageAsset.access$1(srnimageasset)));
            int i;
            if (._mth1(SrnImageAsset.access$1(srnimageasset)))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            type.addProperty("update", Integer.valueOf(i));
        }
        type.addProperty("title", SrnImageAsset.access$2(srnimageasset));
        return type;
    }

    public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return serialize((SrnImageAsset)obj, type, jsonserializationcontext);
    }

    Q()
    {
    }
}
