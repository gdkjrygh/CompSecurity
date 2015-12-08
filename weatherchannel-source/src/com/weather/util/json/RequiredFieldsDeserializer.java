// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.json;

import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

public class RequiredFieldsDeserializer
    implements JsonDeserializer
{

    private final Class classOfMyType;
    private final List requiredFields;

    RequiredFieldsDeserializer(List list, Class class1)
    {
        requiredFields = (List)Preconditions.checkNotNull(list);
        classOfMyType = (Class)Preconditions.checkNotNull(class1);
    }

    private void validate(JsonObject jsonobject)
    {
        for (Iterator iterator = requiredFields.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            if (jsonobject.get(s) == null)
            {
                throw new JsonParseException((new StringBuilder()).append("Required Field Not Found: ").append(s).toString());
            }
        }

    }

    public Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
        throws JsonParseException
    {
        validate(jsonelement.getAsJsonObject());
        return (new Gson()).fromJson(jsonelement, classOfMyType);
    }
}
