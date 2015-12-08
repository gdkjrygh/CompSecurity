// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import android.os.Bundle;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishImage

public class WishSignupCategory
    implements ApiDataChangeNotificationListener, Serializable
{

    private static final long serialVersionUID = 0xceb8c2f199e788d7L;
    private boolean alreadyWishing;
    private String id;
    private String name;
    private ArrayList previews;

    public WishSignupCategory(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        previews = new ArrayList();
        JSONArray jsonarray;
        int i;
        try
        {
            jsonarray = jsonobject.getJSONArray("previews");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        i = 0;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        previews.add(new WishImage(jsonarray.getString(i)));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_24;
_L1:
        name = jsonobject.optString("name", null);
        id = jsonobject.getString("id");
        alreadyWishing = jsonobject.optBoolean("alreadyWishing");
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.WishForCategory, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UnwishForCategory, this);
        return;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList getPreviews()
    {
        return previews;
    }

    public boolean isAlreadyWishing()
    {
        return alreadyWishing;
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.WishForCategory)
        {
            if (bundle.getString("CategoryId").equals(id))
            {
                alreadyWishing = true;
            }
        } else
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UnwishForCategory && bundle.getString("CategoryId").equals(id))
        {
            alreadyWishing = false;
            return;
        }
    }

    public void setAlreadyWishing(boolean flag)
    {
        alreadyWishing = flag;
    }
}
