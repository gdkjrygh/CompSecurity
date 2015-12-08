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
//            WishFilter

public class WishFilterGroup
    implements Serializable
{

    private static final long serialVersionUID = 0xcf66fa324af58a7cL;
    private ArrayList filters;
    private String iconUrl;
    private boolean isExclusive;
    private String name;

    public WishFilterGroup(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        isExclusive = jsonobject.optBoolean("is_exclusive", false);
        name = jsonobject.getString("name");
        iconUrl = jsonobject.getString("icon_url");
        if (!jsonobject.has("filters") || jsonobject.isNull("filters"))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        filters = new ArrayList();
        jsonobject = jsonobject.getJSONArray("filters");
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonobject.length())
                {
                    break;
                }
                filters.add(new WishFilter(jsonobject.getJSONObject(i)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new ApiMalformedDataException(jsonobject.getMessage());
            }
            i++;
        } while (true);
    }

    public ArrayList getFilters()
    {
        return filters;
    }

    public String getIconUrl()
    {
        return iconUrl;
    }

    public String getName()
    {
        return name;
    }

    public boolean isExclusive()
    {
        return isExclusive;
    }
}
