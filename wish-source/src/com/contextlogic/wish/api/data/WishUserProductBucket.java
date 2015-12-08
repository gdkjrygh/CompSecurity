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
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProduct, WishTag

public class WishUserProductBucket
    implements ApiDataChangeNotificationListener, Serializable
{

    private static final long serialVersionUID = 0x1f79e4f8e9db82b4L;
    private String bucketId;
    private boolean editable;
    private boolean modifiable;
    private String name;
    private String permalink;
    private int productCount;
    private ArrayList productPreviews;
    private String setId;
    private WishTag tag;
    private String userId;
    private String userName;

    public WishUserProductBucket(JSONObject jsonobject, String s, String s1)
        throws ApiMalformedDataException
    {
        Object obj;
        int i;
        try
        {
            productCount = jsonobject.getInt("size");
            name = jsonobject.getString("name");
            setId = jsonobject.getString("set_id");
            userName = s;
            userId = s1;
            bucketId = jsonobject.getString("bid");
            productPreviews = new ArrayList();
            s = jsonobject.getJSONArray("preview");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        i = 0;
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s.getJSONObject(i);
        s1 = ((JSONObject) (obj)).getString("id");
        obj = ((JSONObject) (obj)).getString("img");
        productPreviews.add(new WishProduct(s1, ((String) (obj))));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_75;
_L1:
        if (jsonobject.has("tag"))
        {
            tag = new WishTag(jsonobject.getJSONObject("tag"));
        }
        if (jsonobject.has("permalink") && !jsonobject.isNull("permalink"))
        {
            permalink = jsonobject.getString("permalink");
        }
        editable = jsonobject.optBoolean("editable_by_user");
        modifiable = jsonobject.optBoolean("modifiable_by_user");
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketEdit, this);
        ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketRename, this);
        return;
    }

    public static long getSerialversionuid()
    {
        return 0x1f79e4f8e9db82b4L;
    }

    private void handleBucketEditNotification(Bundle bundle)
    {
        String s = bundle.getString("UserId");
        if (!bundle.getString("BucketId").equals(bucketId) || !s.equals(userId)) goto _L2; else goto _L1
_L1:
        bundle = bundle.getStringArrayList("ProductId");
        productCount = Math.max(0, productCount - bundle.size());
        bundle = bundle.iterator();
_L4:
        if (bundle.hasNext())
        {
            String s1 = (String)bundle.next();
            int i = 0;
            do
            {
                if (i >= productPreviews.size())
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (((WishProduct)productPreviews.get(i)).getProductId().equals(s1))
                {
                    productPreviews.remove(i);
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
        }
_L2:
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void handleBucketRenameNotification(Bundle bundle)
    {
        String s = bundle.getString("UserId");
        if (bundle.getString("BucketId").equals(bucketId) && s.equals(userId))
        {
            name = bundle.getString("Name");
        }
    }

    public String getBucketId()
    {
        return bucketId;
    }

    public String getName()
    {
        return name;
    }

    public String getPermalink()
    {
        return permalink;
    }

    public int getProductCount()
    {
        return productCount;
    }

    public ArrayList getProductPreviews()
    {
        return productPreviews;
    }

    public String getSetId()
    {
        return setId;
    }

    public WishTag getTag()
    {
        return tag;
    }

    public String getUserId()
    {
        return userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public boolean isEditable()
    {
        return editable;
    }

    public boolean isModifiable()
    {
        return modifiable;
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketEdit)
        {
            handleBucketEditNotification(bundle);
        } else
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketRename)
        {
            handleBucketRenameNotification(bundle);
            return;
        }
    }
}
