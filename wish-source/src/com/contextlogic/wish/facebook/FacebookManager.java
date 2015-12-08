// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.user.UserPreferences;
import com.facebook.AccessToken;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.Session;
import com.facebook.SessionLoginBehavior;
import com.facebook.SessionState;
import com.facebook.widget.WebDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class FacebookManager
    implements com.facebook.Session.StatusCallback
{
    public static interface DialogCallback
    {

        public abstract void onCancel();

        public abstract void onComplete(Bundle bundle);

        public abstract void onFailure();
    }

    public static final class FacebookProfileImageSize extends Enum
    {

        private static final FacebookProfileImageSize $VALUES[];
        public static final FacebookProfileImageSize Large;
        public static final FacebookProfileImageSize Normal;
        public static final FacebookProfileImageSize Small;
        public static final FacebookProfileImageSize Square;

        public static FacebookProfileImageSize valueOf(String s)
        {
            return (FacebookProfileImageSize)Enum.valueOf(com/contextlogic/wish/facebook/FacebookManager$FacebookProfileImageSize, s);
        }

        public static FacebookProfileImageSize[] values()
        {
            return (FacebookProfileImageSize[])$VALUES.clone();
        }

        static 
        {
            Small = new FacebookProfileImageSize("Small", 0);
            Square = new FacebookProfileImageSize("Square", 1);
            Normal = new FacebookProfileImageSize("Normal", 2);
            Large = new FacebookProfileImageSize("Large", 3);
            $VALUES = (new FacebookProfileImageSize[] {
                Small, Square, Normal, Large
            });
        }

        private FacebookProfileImageSize(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface LoginCallback
    {

        public abstract void onFailure();

        public abstract void onSuccess();
    }


    private static final String FB_READ_PERMISSIONS[] = {
        "email"
    };
    private static FacebookManager _instance = new FacebookManager();
    private AppEventsLogger appEventLogger;
    private Session facebookSession;
    private LoginCallback loginCallback;
    private ArrayList waitingSessions;

    private FacebookManager()
    {
        resetFacebook();
        waitingSessions = new ArrayList();
    }

    public static String getDevAppId()
    {
        return WishApplication.getAppInstance().getString(0x7f0604cc);
    }

    public static FacebookManager getInstance()
    {
        return _instance;
    }

    public static String getProdAppId()
    {
        return WishApplication.getAppInstance().getString(0x7f0604cd);
    }

    public static String getProfileImageUrlString(String s, FacebookProfileImageSize facebookprofileimagesize)
    {
        static class _cls2
        {

            static final int $SwitchMap$com$contextlogic$wish$facebook$FacebookManager$FacebookProfileImageSize[];
            static final int $SwitchMap$com$facebook$SessionState[];

            static 
            {
                $SwitchMap$com$facebook$SessionState = new int[SessionState.values().length];
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.OPENED_TOKEN_UPDATED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.OPENED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.CLOSED_LOGIN_FAILED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$facebook$SessionState[SessionState.CLOSED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$com$contextlogic$wish$facebook$FacebookManager$FacebookProfileImageSize = new int[FacebookProfileImageSize.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$facebook$FacebookManager$FacebookProfileImageSize[FacebookProfileImageSize.Small.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$facebook$FacebookManager$FacebookProfileImageSize[FacebookProfileImageSize.Normal.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$facebook$FacebookManager$FacebookProfileImageSize[FacebookProfileImageSize.Large.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.contextlogic.wish.facebook.FacebookManager.FacebookProfileImageSize[facebookprofileimagesize.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 57
    //                   2 63
    //                   3 69;
           goto _L1 _L2 _L3 _L4
_L1:
        facebookprofileimagesize = "";
_L6:
        return String.format("https://graph.facebook.com/%s/picture%s", new Object[] {
            s, facebookprofileimagesize
        });
_L2:
        facebookprofileimagesize = "?width=50&height=50";
        continue; /* Loop/switch isn't completed */
_L3:
        facebookprofileimagesize = "?width=100&height=100";
        continue; /* Loop/switch isn't completed */
_L4:
        facebookprofileimagesize = "?width=200&height=200";
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void resetFacebook()
    {
        if (UserPreferences.getUseFbDevMode())
        {
            facebookSession = new Session(WishApplication.getAppInstance(), getDevAppId(), null);
            appEventLogger = AppEventsLogger.newLogger(WishApplication.getAppInstance(), getDevAppId());
            return;
        } else
        {
            facebookSession = new Session(WishApplication.getAppInstance(), getProdAppId(), null);
            appEventLogger = AppEventsLogger.newLogger(WishApplication.getAppInstance(), getProdAppId());
            return;
        }
    }

    public void activateApp(Context context)
    {
        String s;
        if (UserPreferences.getUseFbDevMode())
        {
            s = getDevAppId();
        } else
        {
            s = getProdAppId();
        }
        AppEventsLogger.activateApp(context, s);
    }

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (session == facebookSession) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (_cls2..SwitchMap.com.facebook.SessionState[sessionstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            appEventLogger = AppEventsLogger.newLogger(WishApplication.getAppInstance(), session.getApplicationId(), session);
            removeWaitingSession(session);
            return;

        case 2: // '\002'
            appEventLogger = AppEventsLogger.newLogger(WishApplication.getAppInstance(), session.getApplicationId(), session);
            removeWaitingSession(session);
            UserPreferences.setFbAccessToken(null);
            UserPreferences.setFbExpires(0L);
            UserPreferences.setFbPermissionLevel(1);
            if (loginCallback != null)
            {
                loginCallback.onSuccess();
                return;
            }
            break;

        case 3: // '\003'
            appEventLogger = AppEventsLogger.newLogger(WishApplication.getAppInstance(), session.getApplicationId());
            Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.FacebookLogin, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
            // fall through

        case 4: // '\004'
            appEventLogger = AppEventsLogger.newLogger(WishApplication.getAppInstance(), session.getApplicationId());
            removeWaitingSession(session);
            if (loginCallback != null)
            {
                loginCallback.onFailure();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!UserPreferences.getLoginMode().equals("LoginModeFB")) goto _L1; else goto _L4
_L4:
        ApiDataChangeNotificationManager.getInstance().notifyListenersForLogoutRequired();
        return;
    }

    public void deactivateApp(Context context)
    {
        String s;
        if (UserPreferences.getUseFbDevMode())
        {
            s = getDevAppId();
        } else
        {
            s = getProdAppId();
        }
        AppEventsLogger.deactivateApp(context, s);
    }

    public String getActiveAppId()
    {
        if (UserPreferences.getUseFbDevMode())
        {
            return getDevAppId();
        } else
        {
            return getProdAppId();
        }
    }

    public AppEventsLogger getAppEventLogger()
    {
        return appEventLogger;
    }

    public Session getFacebookSession()
    {
        return facebookSession;
    }

    public boolean hasCachedToken()
    {
        return facebookSession != null && facebookSession.getState() == SessionState.CREATED_TOKEN_LOADED;
    }

    public boolean isLoggedIn()
    {
        return facebookSession != null && facebookSession.isOpened();
    }

    public void logout()
    {
        try
        {
            facebookSession.closeAndClearTokenInformation();
        }
        catch (Throwable throwable) { }
        resetFacebook();
    }

    public void onActivityResult(Activity activity, int i, int j, Intent intent)
    {
        for (Iterator iterator = waitingSessions.iterator(); iterator.hasNext();)
        {
            Session session = (Session)iterator.next();
            try
            {
                session.onActivityResult(activity, i, j, intent);
            }
            catch (Throwable throwable) { }
        }

    }

    public void registerWaitingSession(Session session)
    {
        waitingSessions.add(session);
    }

    public void removeWaitingSession(Session session)
    {
        waitingSessions.remove(session);
    }

    public void resetFacebook(String s, long l)
    {
        UserPreferences.setFbAccessToken(s);
        UserPreferences.setFbExpires(l);
        UserPreferences.setFbPermissionLevel(1);
        resetFacebook();
    }

    public void setUseFacebookDevMode(boolean flag)
    {
        UserPreferences.setUseFbDevMode(flag);
        logout();
    }

    public void showAppRequestDialog(Context context, Bundle bundle, DialogCallback dialogcallback)
    {
        if (bundle != null)
        {
            bundle.putString("frictionless", "true");
        }
        showRequestDialog(context, "apprequests", bundle, dialogcallback);
    }

    public void showFeedDialog(Context context, Bundle bundle, DialogCallback dialogcallback)
    {
        showRequestDialog(context, "feed", bundle, dialogcallback);
    }

    public void showRequestDialog(Context context, String s, Bundle bundle, final DialogCallback callback)
    {
        if (isLoggedIn())
        {
            context = ((com.facebook.widget.WebDialog.Builder)(new com.facebook.widget.WebDialog.Builder(context, facebookSession, s, bundle)).setOnCompleteListener(new com.facebook.widget.WebDialog.OnCompleteListener() {

                final FacebookManager this$0;
                final DialogCallback val$callback;

                public void onComplete(Bundle bundle1, FacebookException facebookexception)
                {
                    if (facebookexception == null) goto _L2; else goto _L1
_L1:
                    if (!(facebookexception instanceof FacebookOperationCanceledException)) goto _L4; else goto _L3
_L3:
                    if (callback != null)
                    {
                        callback.onCancel();
                    }
_L6:
                    return;
_L4:
                    if (callback != null)
                    {
                        callback.onFailure();
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L2:
                    if (callback != null)
                    {
                        callback.onComplete(bundle1);
                        return;
                    }
                    if (true) goto _L6; else goto _L5
_L5:
                }

            
            {
                this$0 = FacebookManager.this;
                callback = dialogcallback;
                super();
            }
            })).build();
            try
            {
                context.show();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            if (callback != null)
            {
                callback.onCancel();
                return;
            }
        }
    }

    public void startLogin(Activity activity, LoginCallback logincallback)
    {
        String s;
        long l;
        s = UserPreferences.getFbAccessToken();
        l = UserPreferences.getFbExpires();
        loginCallback = logincallback;
        if (!facebookSession.isOpened()) goto _L2; else goto _L1
_L1:
        if (loginCallback != null)
        {
            loginCallback.onSuccess();
        }
_L4:
        return;
_L2:
        if (facebookSession.getState() != SessionState.CREATED && facebookSession.getState() != SessionState.CREATED_TOKEN_LOADED)
        {
            resetFacebook();
        }
        registerWaitingSession(facebookSession);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        try
        {
            if (l > System.currentTimeMillis())
            {
                activity = AccessToken.createFromExistingAccessToken(s, new Date(l), null, null, null);
                facebookSession.open(activity, this);
                return;
            }
            break MISSING_BLOCK_LABEL_131;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
        if (logincallback == null) goto _L4; else goto _L3
_L3:
        logincallback.onFailure();
        return;
        activity = new com.facebook.Session.OpenRequest(activity);
        if (WishApplication.getAppInstance().isAmazonBuild())
        {
            activity.setLoginBehavior(SessionLoginBehavior.SUPPRESS_SSO);
        }
        activity.setPermissions(Arrays.asList(FB_READ_PERMISSIONS));
        activity.setCallback(this);
        facebookSession.openForRead(activity);
        return;
    }

}
