// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import android.content.Context;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.util.DateUtil;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProduct, WishUser, WishImage, WishProfileImage, 
//            WishTag, WishBrandFilter

public class WishNotification
    implements Serializable
{
    public static final class NotificationTargetType extends Enum
    {

        private static final NotificationTargetType $VALUES[];
        public static final NotificationTargetType Alert;
        public static final NotificationTargetType BrandFeed;
        public static final NotificationTargetType DeepLink;
        public static final NotificationTargetType Feed;
        public static final NotificationTargetType Invite;
        public static final NotificationTargetType None;
        public static final NotificationTargetType Product;
        public static final NotificationTargetType Profile;
        public static final NotificationTargetType Rate;
        public static final NotificationTargetType Website;

        public static NotificationTargetType valueOf(String s)
        {
            return (NotificationTargetType)Enum.valueOf(com/contextlogic/wish/api/data/WishNotification$NotificationTargetType, s);
        }

        public static NotificationTargetType[] values()
        {
            return (NotificationTargetType[])$VALUES.clone();
        }

        static 
        {
            Website = new NotificationTargetType("Website", 0);
            Product = new NotificationTargetType("Product", 1);
            None = new NotificationTargetType("None", 2);
            Invite = new NotificationTargetType("Invite", 3);
            Feed = new NotificationTargetType("Feed", 4);
            Profile = new NotificationTargetType("Profile", 5);
            Alert = new NotificationTargetType("Alert", 6);
            BrandFeed = new NotificationTargetType("BrandFeed", 7);
            Rate = new NotificationTargetType("Rate", 8);
            DeepLink = new NotificationTargetType("DeepLink", 9);
            $VALUES = (new NotificationTargetType[] {
                Website, Product, None, Invite, Feed, Profile, Alert, BrandFeed, Rate, DeepLink
            });
        }

        private NotificationTargetType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class NotificationType extends Enum
    {

        private static final NotificationType $VALUES[];
        public static final NotificationType BeingFollowed;
        public static final NotificationType Default;
        public static final NotificationType Recommendation;
        public static final NotificationType ViralProduct;
        public static final NotificationType VisitFeed;
        public static final NotificationType VisitProfile;

        public static NotificationType valueOf(String s)
        {
            return (NotificationType)Enum.valueOf(com/contextlogic/wish/api/data/WishNotification$NotificationType, s);
        }

        public static NotificationType[] values()
        {
            return (NotificationType[])$VALUES.clone();
        }

        static 
        {
            Default = new NotificationType("Default", 0);
            Recommendation = new NotificationType("Recommendation", 1);
            BeingFollowed = new NotificationType("BeingFollowed", 2);
            ViralProduct = new NotificationType("ViralProduct", 3);
            VisitFeed = new NotificationType("VisitFeed", 4);
            VisitProfile = new NotificationType("VisitProfile", 5);
            $VALUES = (new NotificationType[] {
                Default, Recommendation, BeingFollowed, ViralProduct, VisitFeed, VisitProfile
            });
        }

        private NotificationType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x10765d99833554aL;
    private String actionButtonText;
    private int bonusWishes;
    private int bucketNumber;
    private HashMap extraInfo;
    private WishImage image;
    private boolean isClicked;
    private boolean isNew;
    private boolean isReward;
    private boolean isViewed;
    private String message;
    private int notificationNumber;
    private Object target;
    private NotificationTargetType targetType;
    private Date timestamp;
    private NotificationType type;

    public WishNotification(WishImage wishimage, NotificationTargetType notificationtargettype, Object obj, String s)
    {
        extraInfo = new HashMap();
        image = wishimage;
        targetType = notificationtargettype;
        target = obj;
        message = s;
        timestamp = new Date();
        isViewed = true;
        isClicked = true;
        isNew = false;
    }

    public WishNotification(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        boolean flag;
        flag = true;
        super();
        extraInfo = new HashMap();
        bucketNumber = jsonobject.getInt("bucket");
        notificationNumber = jsonobject.getInt("num");
        isViewed = jsonobject.getBoolean("viewed");
        isClicked = isViewed;
        Object obj;
        Object obj1;
        WishUser wishuser;
        if (isViewed)
        {
            flag = false;
        }
        isNew = flag;
        timestamp = DateUtil.parseIsoDate(jsonobject.getString("isotime"));
        actionButtonText = null;
        bonusWishes = 0;
        isReward = false;
        target = null;
        image = null;
        obj = WishApplication.getAppInstance();
        obj1 = jsonobject.getString("type");
        if (!((String) (obj1)).equals("Recommendation"))
        {
            break MISSING_BLOCK_LABEL_290;
        }
        type = NotificationType.Recommendation;
        targetType = NotificationTargetType.Product;
        obj1 = new WishProduct(jsonobject.getJSONObject("contest"));
        wishuser = new WishUser(jsonobject.getJSONObject("recommender"));
        extraInfo.put("recommended_by", wishuser.getUserId());
        target = obj1;
        image = ((WishProduct) (obj1)).getImage();
        if (jsonobject.has("message") && !jsonobject.isNull("message"))
        {
            message = String.format(((Context) (obj)).getString(0x7f0602f8), new Object[] {
                wishuser.getShortName(), jsonobject.getString("message")
            });
            return;
        }
        try
        {
            message = String.format(((Context) (obj)).getString(0x7f0602f7), new Object[] {
                wishuser.getShortName()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        if (((String) (obj1)).equals("Being Followed"))
        {
            type = NotificationType.BeingFollowed;
            targetType = NotificationTargetType.Profile;
            jsonobject = new WishUser(jsonobject.getJSONObject("follower"));
            target = jsonobject;
            image = new WishImage(jsonobject.getProfileImage().getUrlString(WishProfileImage.ImageSize.Medium));
            image.setCanResize(false);
            message = String.format(((Context) (obj)).getString(0x7f0602f4), new Object[] {
                jsonobject.getShortName()
            });
            return;
        }
        if (((String) (obj1)).equals("viral.product"))
        {
            type = NotificationType.ViralProduct;
            targetType = NotificationTargetType.Product;
            obj1 = new WishProduct(jsonobject.getJSONObject("contest"));
            if (jsonobject.has("num_points") && !jsonobject.isNull("num_points"))
            {
                bonusWishes = jsonobject.getInt("num_points");
            }
            target = obj1;
            image = ((WishProduct) (obj1)).getImage();
            int i = jsonobject.getInt("num_wishes");
            message = String.format(((Context) (obj)).getString(0x7f0602f9), new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
        if (((String) (obj1)).equals("visit.feed"))
        {
            type = NotificationType.VisitFeed;
            targetType = NotificationTargetType.Feed;
            message = ((Context) (obj)).getString(0x7f0602fa);
            return;
        }
        if (((String) (obj1)).equals("visit.profile"))
        {
            type = NotificationType.VisitProfile;
            targetType = NotificationTargetType.Profile;
            message = ((Context) (obj)).getString(0x7f0602fb);
            return;
        }
        type = NotificationType.Default;
        if (!jsonobject.has("mobile_message") || jsonobject.isNull("mobile_message")) goto _L2; else goto _L1
_L1:
        message = jsonobject.getString("mobile_message");
_L13:
        if (jsonobject.has("mobile_image_url") && !jsonobject.isNull("mobile_image_url"))
        {
            image = new WishImage(jsonobject.getString("mobile_image_url"));
            image.setCanResize(false);
        }
        if (jsonobject.has("mobile_action_button_text") && !jsonobject.isNull("mobile_action_button_text"))
        {
            actionButtonText = jsonobject.getString("mobile_action_button_text");
        }
        obj1 = null;
        obj = obj1;
        if (!jsonobject.has("mobile_target_param"))
        {
            break MISSING_BLOCK_LABEL_748;
        }
        obj = obj1;
        if (!jsonobject.isNull("mobile_target_param"))
        {
            obj = jsonobject.get(jsonobject.getString("mobile_target_param"));
        }
        if (jsonobject.has("num_points") && !jsonobject.isNull("num_points"))
        {
            bonusWishes = jsonobject.getInt("num_points");
        }
        if (jsonobject.has("mobile_is_reward") && !jsonobject.isNull("mobile_is_reward"))
        {
            isReward = jsonobject.getBoolean("mobile_is_reward");
        }
        jsonobject.getInt("mobile_target_type");
        JVM INSTR tableswitch 1 11: default 1187
    //                   1 894
    //                   2 946
    //                   3 954
    //                   4 982
    //                   5 1055
    //                   6 872
    //                   7 1082
    //                   8 1110
    //                   9 872
    //                   10 1145
    //                   11 1153;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L3 _L9 _L10 _L3 _L11 _L12
_L3:
        targetType = NotificationTargetType.None;
        return;
_L2:
        message = ((Context) (obj)).getString(0x7f0602f6);
          goto _L13
_L4:
        if (obj == null) goto _L15; else goto _L14
_L14:
        targetType = NotificationTargetType.Product;
        jsonobject = new WishProduct((JSONObject)obj);
        target = jsonobject;
        if (image == null)
        {
            image = jsonobject.getImage();
            return;
        }
        break MISSING_BLOCK_LABEL_1180;
_L15:
        targetType = NotificationTargetType.None;
        return;
_L5:
        targetType = NotificationTargetType.Invite;
        return;
_L6:
        if (obj == null) goto _L17; else goto _L16
_L16:
        targetType = NotificationTargetType.Website;
        target = (String)obj;
        return;
_L17:
        targetType = NotificationTargetType.None;
        return;
_L7:
        if (obj == null) goto _L19; else goto _L18
_L18:
        targetType = NotificationTargetType.Profile;
        jsonobject = new WishUser((JSONObject)obj);
        target = jsonobject;
        if (image == null)
        {
            image = new WishImage(jsonobject.getProfileImage().getUrlString(WishProfileImage.ImageSize.Medium));
            image.setCanResize(false);
            return;
        }
        break MISSING_BLOCK_LABEL_1180;
_L19:
        targetType = NotificationTargetType.None;
        return;
_L8:
        targetType = NotificationTargetType.Feed;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1180;
        }
        target = new WishTag((JSONObject)obj);
        return;
_L9:
        if (obj == null) goto _L21; else goto _L20
_L20:
        targetType = NotificationTargetType.Alert;
        target = (String)obj;
        return;
_L21:
        targetType = NotificationTargetType.None;
        return;
_L10:
        if (obj == null) goto _L23; else goto _L22
_L22:
        targetType = NotificationTargetType.BrandFeed;
        target = new WishBrandFilter((JSONObject)obj);
        return;
_L23:
        targetType = NotificationTargetType.None;
        return;
_L11:
        targetType = NotificationTargetType.Rate;
        return;
_L12:
        if (obj == null) goto _L25; else goto _L24
_L24:
        targetType = NotificationTargetType.DeepLink;
        target = (String)obj;
        return;
_L25:
        targetType = NotificationTargetType.None;
    }

    private String getRebateUrl(String s, String s1)
    {
        if (s != null)
        {
            return String.format((new StringBuilder()).append("https://").append(WishApi.getInstance().getConfig().getApiBaseUrlString()).append("/r/%s").toString(), new Object[] {
                s
            });
        }
        if (s1 != null)
        {
            return String.format((new StringBuilder()).append("https://").append(WishApi.getInstance().getConfig().getApiBaseUrlString()).append("/winner/%s").toString(), new Object[] {
                s1
            });
        } else
        {
            return (new StringBuilder()).append("https://").append(WishApi.getInstance().getConfig().getApiBaseUrlString()).append("/active-rebates").toString();
        }
    }

    public String getActionButtonText()
    {
        return actionButtonText;
    }

    public int getBonusWishes()
    {
        return bonusWishes;
    }

    public int getBucketNumber()
    {
        return bucketNumber;
    }

    public HashMap getExtraInfo()
    {
        return extraInfo;
    }

    public WishImage getImage()
    {
        return image;
    }

    public String getMessage()
    {
        return message;
    }

    public int getNotificationNumber()
    {
        return notificationNumber;
    }

    public Object getTarget()
    {
        return target;
    }

    public NotificationTargetType getTargetType()
    {
        return targetType;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public NotificationType getType()
    {
        return type;
    }

    public boolean isClicked()
    {
        return isClicked;
    }

    public boolean isNew()
    {
        return isNew;
    }

    public boolean isReward()
    {
        return isReward;
    }

    public boolean isViewed()
    {
        return isViewed;
    }

    public void markClicked()
    {
        isClicked = true;
    }

    public void markViewed()
    {
        isViewed = true;
    }
}
