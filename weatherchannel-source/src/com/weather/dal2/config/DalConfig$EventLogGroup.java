// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.config;

import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.config:
//            DalConfig

public static class isEnabled
{

    private final boolean isEnabled;

    public boolean isEnabled()
    {
        return isEnabled;
    }

    ()
    {
        isEnabled = false;
    }

    isEnabled(JSONObject jsonobject)
    {
        isEnabled = jsonobject.optBoolean("enabled", false);
    }
}
