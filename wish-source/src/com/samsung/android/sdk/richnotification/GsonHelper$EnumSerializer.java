// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            GsonHelper

private static class <init>
    implements JsonSerializer
{

    public JsonElement serialize(Enum enum, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return new JsonPrimitive(Integer.valueOf(enum.ordinal()));
    }

    public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return serialize((Enum)obj, type, jsonserializationcontext);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
