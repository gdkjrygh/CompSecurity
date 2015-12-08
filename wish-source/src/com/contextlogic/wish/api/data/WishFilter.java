// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishFilterGroup

public class WishFilter
    implements Serializable
{

    private static final long serialVersionUID = 0x4e60fab0f7f598a6L;
    private ArrayList childFilterGroups;
    private String filterId;
    private String name;

    public WishFilter(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        name = jsonobject.getString("name");
        filterId = jsonobject.getString("filter_id");
        if (!jsonobject.has("child_filter_groups") || jsonobject.isNull("child_filter_groups"))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        childFilterGroups = new ArrayList();
        jsonobject = jsonobject.getJSONArray("child_filter_groups");
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonobject.length())
                {
                    break;
                }
                childFilterGroups.add(new WishFilterGroup(jsonobject.getJSONObject(i)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new ApiMalformedDataException(jsonobject.getMessage());
            }
            i++;
        } while (true);
    }

    public ArrayList getChildFilterGroups()
    {
        return childFilterGroups;
    }

    public String getFilterId()
    {
        return filterId;
    }

    public String getName()
    {
        return name;
    }
}
