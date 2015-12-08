// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.tropical;

import com.google.common.collect.ImmutableList;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ActiveStorms
{

    private final List stormIds;

    private ActiveStorms(Collection collection)
    {
        stormIds = ImmutableList.copyOf(collection);
    }

    static ActiveStorms fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        jsonobject = jsonobject.getJSONObject("ActTropData").getJSONArray("ATIds");
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        for (int j = jsonobject.length(); i < j; i++)
        {
            Object obj = jsonobject.get(i);
            Validation.validateClass(java/lang/String, (new StringBuilder()).append("ATIds[").append(i).append(']').toString(), obj);
            builder.add(obj.toString());
        }

        return new ActiveStorms(builder.build());
    }

    Iterable getStormIds()
    {
        return ImmutableList.copyOf(stormIds);
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActiveStorms{stormIds=").append(stormIds).append('}').toString();
    }
}
