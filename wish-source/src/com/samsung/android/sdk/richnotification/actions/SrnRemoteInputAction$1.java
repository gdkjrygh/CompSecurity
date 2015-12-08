// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.samsung.android.sdk.richnotification.SrnAction;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

class 
    implements JsonSerializer
{

    public JsonElement serialize(SrnRemoteInputAction srnremoteinputaction, Type type, JsonSerializationContext jsonserializationcontext)
    {
        type = jsonserializationcontext.serialize(srnremoteinputaction, com/samsung/android/sdk/richnotification/SrnAction).getAsJsonObject();
        type.add("description", jsonserializationcontext.serialize(SrnRemoteInputAction.access$0(srnremoteinputaction)));
        type.add("icon", jsonserializationcontext.serialize(SrnRemoteInputAction.access$1(srnremoteinputaction)));
        srnremoteinputaction = jsonserializationcontext.serialize(SrnRemoteInputAction.access$2(srnremoteinputaction)).getAsJsonObject().entrySet().iterator();
        do
        {
            if (!srnremoteinputaction.hasNext())
            {
                return type;
            }
            jsonserializationcontext = (java.util.et)srnremoteinputaction.next();
            type.add((String)jsonserializationcontext.et(), (JsonElement)jsonserializationcontext.et());
        } while (true);
    }

    public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
    {
        return serialize((SrnRemoteInputAction)obj, type, jsonserializationcontext);
    }

    ()
    {
    }
}
