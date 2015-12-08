// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationListener;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserFollowingManager;
import com.contextlogic.wish.util.DateUtil;
import com.contextlogic.wish.util.StateSerializer;
import com.contextlogic.wish.util.StringUtil;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProfileImage, WishNonSerializableContainer, WishUserProductBucket

public class WishUser
    implements ApiDataChangeNotificationListener, Serializable
{
    public static final class WishUserState extends Enum
    {

        private static final WishUserState $VALUES[];
        public static final WishUserState Registered;
        public static final WishUserState Unknown;
        public static final WishUserState Unregistered;

        public static WishUserState valueOf(String s)
        {
            return (WishUserState)Enum.valueOf(com/contextlogic/wish/api/data/WishUser$WishUserState, s);
        }

        public static WishUserState[] values()
        {
            return (WishUserState[])$VALUES.clone();
        }

        static 
        {
            Registered = new WishUserState("Registered", 0);
            Unregistered = new WishUserState("Unregistered", 1);
            Unknown = new WishUserState("Unknown", 2);
            $VALUES = (new WishUserState[] {
                Registered, Unregistered, Unknown
            });
        }

        private WishUserState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x7c73ebd9a70463fL;
    private String bdayBannerDeepLink;
    private Date birthday;
    private String birthdayMessage;
    private boolean canGift;
    private WishNonSerializableContainer coreObject;
    private String countryCode;
    private String email;
    private String fbId;
    private Date fetchTime;
    private ArrayList followers;
    private int followersCount;
    private String followersSetId;
    private ArrayList following;
    private int followingCount;
    private String followingSetId;
    private String friendJsLink;
    private String gender;
    private String googleId;
    private boolean isAdmin;
    private boolean isLoggedInUser;
    private boolean isPreview;
    private String name;
    private ArrayList productBuckets;
    private WishProfileImage profileImage;
    private String shortName;
    private ArrayList tags;
    private String userId;
    private WishUserState userState;
    private int wishesCount;

    public WishUser(String s)
    {
        name = null;
        fbId = null;
        userId = s;
        fetchTime = new Date();
        isPreview = true;
        userState = WishUserState.Unknown;
        profileImage = new WishProfileImage(null);
        boolean flag;
        if (LoggedInUser.getInstance().isLoggedIn() && userId != null)
        {
            flag = LoggedInUser.getInstance().getCurrentUser().getUserId().equals(userId);
        } else
        {
            flag = false;
        }
        isLoggedInUser = flag;
    }

    public WishUser(String s, WishProfileImage wishprofileimage)
    {
        name = s;
        fetchTime = new Date();
        isPreview = true;
        userState = WishUserState.Unknown;
        isLoggedInUser = false;
        profileImage = wishprofileimage;
    }

    public WishUser(String s, String s1)
    {
        name = s;
        fbId = s1;
        fetchTime = new Date();
        isPreview = true;
        userState = WishUserState.Unknown;
        isLoggedInUser = false;
        profileImage = new WishProfileImage(s1, true);
    }

    public WishUser(String s, String s1, String s2)
    {
        name = s;
        fbId = null;
        googleId = s1;
        fetchTime = new Date();
        isPreview = true;
        userState = WishUserState.Unknown;
        isLoggedInUser = false;
        profileImage = new WishProfileImage(s2, false);
        profileImage.setUrlString(GooglePlusManager.resizeProfileImageUrl(s2, 50), WishProfileImage.ImageSize.Small);
        profileImage.setUrlString(GooglePlusManager.resizeProfileImageUrl(s2, 100), WishProfileImage.ImageSize.Medium);
        profileImage.setUrlString(GooglePlusManager.resizeProfileImageUrl(s2, 200), WishProfileImage.ImageSize.Large);
        profileImage.setCanResize(true);
    }

    public WishUser(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        this(jsonobject, false);
    }

    public WishUser(JSONObject jsonobject, boolean flag)
        throws ApiMalformedDataException
    {
        Object obj;
        Object obj1;
        boolean flag1;
        try
        {
            productBuckets = new ArrayList();
            following = new ArrayList();
            followers = new ArrayList();
            tags = new ArrayList();
            fetchTime = new Date();
            obj = jsonobject.optJSONObject("user");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        isPreview = false;
_L23:
        if (!((JSONObject) (obj)).has("id")) goto _L4; else goto _L3
_L3:
        userId = ((JSONObject) (obj)).getString("id");
_L24:
        if (!((JSONObject) (obj)).has("fb_uid") || ((JSONObject) (obj)).isNull("fb_uid")) goto _L6; else goto _L5
_L5:
        fbId = StringUtil.ensureString(((JSONObject) (obj)).get("fb_uid"));
_L25:
        if (!((JSONObject) (obj)).has("google_plus_uid") || ((JSONObject) (obj)).isNull("google_plus_uid")) goto _L8; else goto _L7
_L7:
        googleId = StringUtil.ensureString(((JSONObject) (obj)).get("google_plus_uid"));
_L26:
        if (!((JSONObject) (obj)).has("profile_pic_small") || !((JSONObject) (obj)).has("profile_pic_medium") || !((JSONObject) (obj)).has("profile_pic_large")) goto _L10; else goto _L9
_L9:
        profileImage = new WishProfileImage(((JSONObject) (obj)).getString("profile_pic_medium"));
        profileImage.setUrlString(((JSONObject) (obj)).getString("profile_pic_small"), WishProfileImage.ImageSize.Small);
        profileImage.setUrlString(((JSONObject) (obj)).getString("profile_pic_medium"), WishProfileImage.ImageSize.Medium);
        profileImage.setUrlString(((JSONObject) (obj)).getString("profile_pic_large"), WishProfileImage.ImageSize.Large);
        profileImage.setCanResize(true);
_L27:
        if (!((JSONObject) (obj)).has("is_admin")) goto _L12; else goto _L11
_L11:
        isAdmin = ((JSONObject) (obj)).getBoolean("is_admin");
_L28:
        if (((JSONObject) (obj)).has("country_code") && !((JSONObject) (obj)).isNull("country_code"))
        {
            countryCode = ((JSONObject) (obj)).getString("country_code");
        }
        flag1 = ((JSONObject) (obj)).has("birthday");
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        int i;
        int j;
        try
        {
            birthday = DateUtil.parseIsoDate(((JSONObject) (obj)).getString("birthday"), false);
        }
        catch (Exception exception) { }
        name = ((JSONObject) (obj)).getString("name");
        if (((JSONObject) (obj)).has("short_name"))
        {
            shortName = ((JSONObject) (obj)).getString("short_name");
        }
        if (!jsonobject.has("birthday_banner"))
        {
            break MISSING_BLOCK_LABEL_423;
        }
        obj1 = jsonobject.optJSONObject("birthday_banner");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        if (((JSONObject) (obj1)).has("long_message"))
        {
            birthdayMessage = ((JSONObject) (obj1)).getString("long_message");
        }
        if (((JSONObject) (obj1)).has("deep_link"))
        {
            bdayBannerDeepLink = ((JSONObject) (obj1)).getString("deep_link");
        }
        canGift = ((JSONObject) (obj)).optBoolean("can_gift", false);
        if (!jsonobject.optBoolean("is_registered", true)) goto _L14; else goto _L13
_L13:
        obj1 = WishUserState.Registered;
_L29:
        userState = ((WishUserState) (obj1));
        if (!((JSONObject) (obj)).has("is_following")) goto _L16; else goto _L15
_L15:
        flag1 = ((JSONObject) (obj)).getBoolean("is_following");
        if (!LoggedInUser.getInstance().isLoggedIn()) goto _L16; else goto _L17
_L17:
        if (!flag1) goto _L19; else goto _L18
_L18:
        LoggedInUser.getInstance().getFollowingManager().setFollowing(userId);
_L16:
        if (!LoggedInUser.getInstance().isLoggedIn() || userId == null) goto _L21; else goto _L20
_L20:
        flag1 = LoggedInUser.getInstance().getCurrentUser().getUserId().equals(userId);
_L40:
        isLoggedInUser = flag1;
        isLoggedInUser = isLoggedInUser | flag;
        if (isLoggedInUser)
        {
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserFollowed, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUnfollowed, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketDelete, this);
            coreObject = new WishNonSerializableContainer();
            coreObject.storeObject("coreObject", jsonobject);
        }
        if (isPreview)
        {
            return;
        }
          goto _L22
_L2:
        isPreview = true;
        obj = jsonobject;
          goto _L23
_L4:
label0:
        {
            if (!((JSONObject) (obj)).has("uid"))
            {
                break label0;
            }
            userId = ((JSONObject) (obj)).getString("uid");
        }
          goto _L24
        throw new ApiMalformedDataException("Missing user ID");
_L6:
        fbId = null;
          goto _L25
_L8:
        googleId = null;
          goto _L26
_L10:
        profileImage = new WishProfileImage(fbId, true);
          goto _L27
_L12:
        isAdmin = false;
          goto _L28
_L14:
        obj1 = WishUserState.Unregistered;
          goto _L29
_L19:
        LoggedInUser.getInstance().getFollowingManager().setNotFollowing(userId);
          goto _L16
_L22:
        wishesCount = jsonobject.getInt("num_wishes");
        followersCount = jsonobject.getInt("num_followers");
        followingCount = jsonobject.getInt("num_following");
        if (((JSONObject) (obj)).has("friend_js"))
        {
            friendJsLink = ((JSONObject) (obj)).getString("friend_js");
        }
        if (((JSONObject) (obj)).has("email"))
        {
            email = ((JSONObject) (obj)).getString("email");
        }
        gender = ((JSONObject) (obj)).optString("gender", "female");
        jsonobject = jsonobject.getJSONArray("bucket_data");
        i = 0;
_L41:
        if (i >= jsonobject.length()) goto _L31; else goto _L30
_L30:
        obj = jsonobject.getJSONObject(i);
        obj1 = ((JSONObject) (obj)).getString("type");
        if (!((String) (obj1)).equals("product")) goto _L33; else goto _L32
_L32:
        obj = new WishUserProductBucket(((JSONObject) (obj)), name, userId);
        if (isLoggedInUser || ((WishUserProductBucket) (obj)).getProductCount() > 0)
        {
            productBuckets.add(obj);
        }
        if (((WishUserProductBucket) (obj)).getTag() != null)
        {
            tags.add(((WishUserProductBucket) (obj)).getTag());
        }
          goto _L34
_L33:
        if (!((String) (obj1)).equals("user.following")) goto _L36; else goto _L35
_L35:
        followingSetId = ((JSONObject) (obj)).getString("set_id");
        obj = ((JSONObject) (obj)).getJSONArray("preview");
        j = 0;
_L37:
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = new WishUser(((JSONArray) (obj)).getJSONObject(j));
        following.add(obj1);
        j++;
        if (true) goto _L37; else goto _L34
_L36:
        if (!((String) (obj1)).equals("user.followers")) goto _L34; else goto _L38
_L38:
        followersSetId = ((JSONObject) (obj)).getString("set_id");
        obj = ((JSONObject) (obj)).getJSONArray("preview");
        j = 0;
_L39:
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        WishUser wishuser = new WishUser(((JSONArray) (obj)).getJSONObject(j));
        followers.add(wishuser);
        j++;
        if (true) goto _L39; else goto _L34
_L31:
        return;
_L21:
        flag1 = false;
          goto _L40
_L34:
        i++;
          goto _L41
    }

    public static WishUser deserializeLoggedInUser()
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj2 = null;
        obj1 = null;
        obj4 = null;
        obj5 = null;
        obj3 = null;
        Object obj = WishApplication.getAppInstance().openFileInput("serialized_profile");
        obj1 = obj;
        obj2 = obj;
        ObjectInputStream objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
        obj1 = new WishUser(new JSONObject((String)objectinputstream.readObject()), true);
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return ((WishUser) (obj1));
        }
        return ((WishUser) (obj1));
        obj;
        obj2 = obj5;
        obj = obj1;
_L4:
        if (obj2 != null)
        {
            try
            {
                ((ObjectInputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        obj1 = obj3;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj;
        obj1 = obj4;
_L2:
        if (obj1 != null)
        {
            try
            {
                ((ObjectInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj2 != null)
        {
            try
            {
                ((FileInputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        Exception exception;
        exception;
        obj1 = objectinputstream;
        obj2 = obj;
        obj = exception;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj2 = objectinputstream;
        if (true) goto _L4; else goto _L3
_L3:
        return ((WishUser) (obj1));
    }

    private void handleBucketDeleteNotification(Bundle bundle)
    {
        if (!bundle.getString("UserId").equals(userId)) goto _L2; else goto _L1
_L1:
        int i;
        bundle = bundle.getString("BucketId");
        i = 0;
_L7:
        if (i >= productBuckets.size()) goto _L2; else goto _L3
_L3:
        if (!((WishUserProductBucket)productBuckets.get(i)).getBucketId().equals(bundle)) goto _L5; else goto _L4
_L4:
        productBuckets.remove(i);
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean canGift()
    {
        return canGift;
    }

    public String getBdayBannerDeepLink()
    {
        return bdayBannerDeepLink;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public String getBirthdayMessage()
    {
        return birthdayMessage;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFbId()
    {
        return fbId;
    }

    public Date getFetchTime()
    {
        return fetchTime;
    }

    public ArrayList getFollowers()
    {
        return followers;
    }

    public int getFollowersCount()
    {
        return followersCount;
    }

    public String getFollowersSetId()
    {
        return followersSetId;
    }

    public ArrayList getFollowing()
    {
        return following;
    }

    public int getFollowingCount()
    {
        return followingCount;
    }

    public String getFollowingSetId()
    {
        return followingSetId;
    }

    public String getFriendJsLink()
    {
        return friendJsLink;
    }

    public String getGender()
    {
        return gender;
    }

    public String getGoogleId()
    {
        return googleId;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList getProductBuckets()
    {
        return productBuckets;
    }

    public WishProfileImage getProfileImage()
    {
        return profileImage;
    }

    public String getShortName()
    {
        if (shortName == null)
        {
            return getName();
        } else
        {
            return shortName;
        }
    }

    public ArrayList getTags()
    {
        return tags;
    }

    public String getUserId()
    {
        return userId;
    }

    public WishUserState getUserState()
    {
        return userState;
    }

    public int getWishesCount()
    {
        return wishesCount;
    }

    public boolean isAdmin()
    {
        return isAdmin;
    }

    public boolean isLoggedInUser()
    {
        return isLoggedInUser;
    }

    public boolean isPreview()
    {
        return isPreview;
    }

    public void onNotificationReceived(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType notificationtype, Bundle bundle)
    {
        if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserFollowed)
        {
            followingCount = followingCount + 1;
        } else
        {
            if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUnfollowed)
            {
                followingCount = Math.max(0, followingCount - 1);
                return;
            }
            if (notificationtype == com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.BucketDelete)
            {
                handleBucketDeleteNotification(bundle);
                return;
            }
        }
    }

    public void serialize()
    {
        final JSONObject coreJsonObject;
        if (isLoggedInUser && coreObject != null)
        {
            if ((coreJsonObject = (JSONObject)coreObject.getContainedObject("coreObject")) != null)
            {
                StateSerializer.getInstance().getThreadPool(com.contextlogic.wish.util.StateSerializer.SerializationType.Profile).execute(new Runnable() {

                    final WishUser this$0;
                    final JSONObject val$coreJsonObject;

                    public void run()
                    {
                        Object obj1;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        obj2 = null;
                        obj1 = null;
                        obj3 = null;
                        obj4 = null;
                        Object obj = WishApplication.getAppInstance().openFileOutput("serialized_profile", 0);
                        obj1 = obj;
                        obj2 = obj;
                        ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
                        objectoutputstream.writeObject(coreJsonObject.toString());
                        if (objectoutputstream != null)
                        {
                            try
                            {
                                objectoutputstream.close();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj1) { }
                        }
                        if (obj == null)
                        {
                            break MISSING_BLOCK_LABEL_150;
                        }
                        ((FileOutputStream) (obj)).close();
_L2:
                        return;
                        obj;
                        return;
                        obj;
                        obj2 = obj4;
                        obj = obj1;
_L5:
                        if (obj2 != null)
                        {
                            try
                            {
                                ((ObjectOutputStream) (obj2)).close();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj1) { }
                        }
                        if (obj == null) goto _L2; else goto _L1
_L1:
                        try
                        {
                            ((FileOutputStream) (obj)).close();
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            return;
                        }
                        obj;
                        obj1 = obj3;
_L4:
                        if (obj1 != null)
                        {
                            try
                            {
                                ((ObjectOutputStream) (obj1)).close();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj1) { }
                        }
                        if (obj2 != null)
                        {
                            try
                            {
                                ((FileOutputStream) (obj2)).close();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj1) { }
                        }
                        throw obj;
                        Exception exception;
                        exception;
                        obj1 = objectoutputstream;
                        obj2 = obj;
                        obj = exception;
                        if (true) goto _L4; else goto _L3
_L3:
                        Throwable throwable;
                        throwable;
                        obj2 = objectoutputstream;
                          goto _L5
                    }

            
            {
                this$0 = WishUser.this;
                coreJsonObject = jsonobject;
                super();
            }
                });
                return;
            }
        }
    }

    public void setIsLoggedInUser(boolean flag)
    {
        isLoggedInUser = flag;
        if (isLoggedInUser)
        {
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserFollowed, this);
            ApiDataChangeNotificationManager.getInstance().addListener(com.contextlogic.wish.api.core.ApiDataChangeNotificationManager.NotificationType.UserUnfollowed, this);
        }
    }

    public void setUserState(WishUserState wishuserstate)
    {
        userState = wishuserstate;
    }
}
