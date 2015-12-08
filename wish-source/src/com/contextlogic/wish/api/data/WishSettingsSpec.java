// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import org.json.JSONException;
import org.json.JSONObject;

public class WishSettingsSpec
{

    private String action;
    private String name;

    public WishSettingsSpec(String s, String s1)
    {
        name = s;
        action = s1;
    }

    public WishSettingsSpec(JSONObject jsonobject)
    {
        try
        {
            name = jsonobject.getString("name");
            action = jsonobject.getString("action");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return;
        }
    }

    public String action()
    {
        return action;
    }

    public String getName()
    {
        return name;
    }
}
