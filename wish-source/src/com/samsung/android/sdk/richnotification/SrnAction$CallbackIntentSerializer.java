// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.Intent;
import android.os.Parcel;
import android.util.Base64;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnAction

static final class Q
    implements JsonSerializer
{

    public JsonElement serialize(Q q, Type type, JsonSerializationContext jsonserializationcontext)
    {
        type = Parcel.obtain();
        Q(q).writeToParcel(type, 0);
        q = type.marshall();
        type.recycle();
        return new JsonPrimitive(Base64.encodeToString(q, 2));
    }

    public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return serialize((serialize)obj, type, jsonserializationcontext);
    }

    Q()
    {
    }
}
