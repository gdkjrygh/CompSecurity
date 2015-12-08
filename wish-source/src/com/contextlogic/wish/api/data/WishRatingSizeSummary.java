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
//            WishRatingSizeSummaryBar

public class WishRatingSizeSummary
    implements Serializable
{

    private static final long serialVersionUID = 0x1866203c527cc6afL;
    private int numRatings;
    private ArrayList sizeBars;
    private String subtitle;

    public WishRatingSizeSummary(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        subtitle = jsonobject.getString("subtitle");
        numRatings = jsonobject.getInt("num_ratings");
        sizeBars = new ArrayList();
        if (!jsonobject.has("size_bars"))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        jsonobject = jsonobject.getJSONArray("size_bars");
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonobject.length())
                {
                    break;
                }
                sizeBars.add(new WishRatingSizeSummaryBar(jsonobject.getJSONObject(i)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new ApiMalformedDataException(jsonobject.getMessage());
            }
            i++;
        } while (true);
    }

    public long getNumRatings()
    {
        return (long)numRatings;
    }

    public ArrayList getSizeBars()
    {
        return sizeBars;
    }

    public String getSubtitle()
    {
        return subtitle;
    }
}
