// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.user;

import android.content.Context;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.data.WishCachedBillingInfo;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.GetProfileService;
import com.contextlogic.wish.facebook.FacebookManager;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.user:
//            UserFollowingManager, UserPreferences

public class LoggedInUser
{

    private static LoggedInUser _instance = new LoggedInUser();
    private WishCachedBillingInfo cachedBillingInfo;
    private WishUser currentUser;
    private UserFollowingManager followingManager;
    private GetProfileService getProfileService;
    private long loginTime;

    private LoggedInUser()
    {
        cachedBillingInfo = null;
        currentUser = null;
        followingManager = new UserFollowingManager();
        getProfileService = new GetProfileService();
    }

    public static LoggedInUser getInstance()
    {
        return _instance;
    }

    public String deserializeSession(String s, String s1, String s2)
    {
        if (!UserPreferences.getForceRelogin()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj1;
        Object obj2;
        String s3;
        Object obj3;
        Object obj4;
        obj3 = null;
        obj2 = null;
        obj1 = null;
        s3 = null;
        obj4 = null;
        Object obj = WishApplication.getAppInstance().openFileInput("serialized_session");
        obj1 = obj;
        obj2 = obj;
        ObjectInputStream objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
        JSONObject jsonobject = new JSONObject((String)objectinputstream.readObject());
        obj2 = null;
        obj1 = obj2;
        if (!jsonobject.has("fbId"))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj1 = obj2;
        if (!jsonobject.isNull("fbId"))
        {
            obj1 = jsonobject.getString("fbId");
        }
        s3 = null;
        obj2 = s3;
        if (!jsonobject.has("googlePlusId"))
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj2 = s3;
        if (!jsonobject.isNull("googlePlusId"))
        {
            obj2 = jsonobject.getString("googlePlusId");
        }
        obj4 = null;
        s3 = obj4;
        if (!jsonobject.has("email"))
        {
            break MISSING_BLOCK_LABEL_189;
        }
        s3 = obj4;
        if (!jsonobject.isNull("email"))
        {
            s3 = jsonobject.getString("email");
        }
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        if (s == null) goto _L4; else goto _L3
_L3:
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (s.equals(obj1)) goto _L4; else goto _L6
_L4:
        flag1 = flag;
        if (s1 == null) goto _L8; else goto _L7
_L7:
        if (s3 == null) goto _L10; else goto _L9
_L9:
        flag1 = flag;
        if (s1.equals(s3)) goto _L8; else goto _L10
_L8:
        flag = flag1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        flag = flag1;
        if (!s2.equals(obj2))
        {
            break MISSING_BLOCK_LABEL_479;
        }
_L15:
        s = obj3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        long l = jsonobject.getLong("timestamp");
        s = obj3;
        if (System.currentTimeMillis() - l < 0x19bfcc00L)
        {
            getInstance().setLoginTime(l);
            s = jsonobject.getString("sessionCookie");
            WishApi.getInstance().getConfig().addSessionCookie(s);
            s = jsonobject.getString("userId");
        }
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return s;
            }
            return s;
        } else
        {
            return s;
        }
        s;
        s = obj4;
        obj = obj1;
_L14:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (obj == null) goto _L1; else goto _L11
_L11:
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return null;
        s;
        s1 = s3;
        obj = obj2;
_L13:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        s1 = objectinputstream;
        if (true) goto _L13; else goto _L12
_L12:
        s;
        s = objectinputstream;
          goto _L14
_L6:
        flag = true & false;
          goto _L4
_L10:
        flag1 = flag & false;
          goto _L8
        flag = flag1 & false;
          goto _L15
    }

    public WishCachedBillingInfo getCachedBillingInfo()
    {
        return cachedBillingInfo;
    }

    public WishUser getCurrentUser()
    {
        return currentUser;
    }

    public UserFollowingManager getFollowingManager()
    {
        return followingManager;
    }

    public String getLoginMethodName(Context context)
    {
        if (UserPreferences.getLoginMode().equals("LoginModeFB"))
        {
            return context.getString(0x7f060157);
        }
        if (UserPreferences.getLoginMode().equals("LoginModeGooglePlus"))
        {
            return context.getString(0x7f060218);
        } else
        {
            return context.getString(0x7f06013b);
        }
    }

    public long getLoginTime()
    {
        return loginTime;
    }

    public boolean isLoggedIn()
    {
        boolean flag;
        boolean flag1;
        if (currentUser != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (UserPreferences.getLoginMode().equals("LoginModeFB"))
        {
            flag1 = flag & FacebookManager.getInstance().isLoggedIn();
        }
        return flag1;
    }

    public void logout(boolean flag)
    {
        currentUser = null;
        cachedBillingInfo = null;
        followingManager.setFollowingMapping(null, flag);
        getProfileService.cancelAllRequests();
    }

    public void refreshProfile()
    {
        if (getProfileService.isPending() || getCurrentUser() == null)
        {
            return;
        } else
        {
            getProfileService.requestService(getCurrentUser().getUserId(), false, true, new com.contextlogic.wish.api.service.GetProfileService.SuccessCallback() {

                final LoggedInUser this$0;

                public void onServiceSucceeded(WishUser wishuser)
                {
                    if (isLoggedIn())
                    {
                        setCurrentUser(wishuser);
                    }
                }

            
            {
                this$0 = LoggedInUser.this;
                super();
            }
            }, null);
            return;
        }
    }

    public void setCachedBillingInfo(WishCachedBillingInfo wishcachedbillinginfo)
    {
        cachedBillingInfo = wishcachedbillinginfo;
    }

    public void setCurrentUser(WishUser wishuser)
    {
        if (currentUser != wishuser)
        {
            currentUser = wishuser;
            if (wishuser != null)
            {
                UserPreferences.setLastLoggedInUserName(wishuser.getName());
                UserPreferences.setLastLoggedInUserImage(wishuser.getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Large));
                wishuser.serialize();
            }
            ApiDataChangeNotificationManager.getInstance().notifyListenersForUserUpdated(wishuser.getUserId());
        }
    }

    public void setLoginTime(long l)
    {
        loginTime = l;
    }

}
