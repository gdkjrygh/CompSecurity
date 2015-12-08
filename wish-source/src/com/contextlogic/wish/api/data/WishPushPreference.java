// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishPushPreference
    implements Serializable
{

    private static final long serialVersionUID = 0xe12eb9672781edb6L;
    private int index;
    private String name;
    private boolean preferenceSelected;

    public WishPushPreference(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            name = jsonobject.getString("name");
            preferenceSelected = jsonobject.getBoolean("value");
            index = jsonobject.getInt("idx");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }

    public boolean isPreferenceSelected()
    {
        return preferenceSelected;
    }

    public void setPreferenceSelected(boolean flag)
    {
        preferenceSelected = flag;
    }
}
