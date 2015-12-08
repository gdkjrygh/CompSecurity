// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.config:
//            ModuleConfig

public class ModulesConfig
{

    private final Map configMap;
    public final List moduleConfigs;

    public ModulesConfig(Iterable iterable)
    {
        configMap = Maps.newHashMap();
        moduleConfigs = ImmutableList.copyOf(iterable);
        ModuleConfig moduleconfig;
        for (iterable = iterable.iterator(); iterable.hasNext(); configMap.put(moduleconfig.id, moduleconfig))
        {
            moduleconfig = (ModuleConfig)iterable.next();
        }

    }

    public ModulesConfig(JSONObject jsonobject)
        throws JSONException
    {
        configMap = Maps.newHashMap();
        jsonobject = jsonobject.getJSONArray("modules");
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        int j = jsonobject.length();
        for (int i = 0; i < j; i++)
        {
            ModuleConfig moduleconfig = ModuleConfig.fromJson(jsonobject.getJSONObject(i));
            builder.add(moduleconfig);
            configMap.put(moduleconfig.id, moduleconfig);
        }

        moduleConfigs = builder.build();
    }

    public ModuleConfig getMConfig(String s)
    {
        return (ModuleConfig)configMap.get(Preconditions.checkNotNull(s));
    }
}
