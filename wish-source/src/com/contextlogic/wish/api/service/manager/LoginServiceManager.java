// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.EmailLoginService;
import com.contextlogic.wish.api.service.EmailSignupService;
import com.contextlogic.wish.api.service.FbLoginService;
import com.contextlogic.wish.api.service.GetProfileService;
import com.contextlogic.wish.api.service.GetUserFolloweesService;
import com.contextlogic.wish.api.service.GetUserStatusService;
import com.contextlogic.wish.api.service.GooglePlusLoginService;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserFollowingManager;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.model.GraphUser;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.plus.model.people.Person;
import java.util.Date;

public class LoginServiceManager
{
    private class AsyncEmailLoginOperation extends AsyncTask
    {

        private String password;
        final LoginServiceManager this$0;
        private String username;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            startWishLoginWithEmail(username, password);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
        }

        protected void onPreExecute()
        {
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        public AsyncEmailLoginOperation(String s, String s1)
        {
            this$0 = LoginServiceManager.this;
            super();
            username = s;
            password = s1;
        }
    }

    private class AsyncEmailSignupOperation extends AsyncTask
    {

        private String firstName;
        private String lastName;
        private String password;
        final LoginServiceManager this$0;
        private String username;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            startWishSignupWithEmail(firstName, lastName, username, password);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
        }

        protected void onPreExecute()
        {
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        public AsyncEmailSignupOperation(String s, String s1, String s2, String s3)
        {
            this$0 = LoginServiceManager.this;
            super();
            username = s2;
            password = s3;
            firstName = s;
            lastName = s1;
        }
    }

    private class AsyncFbLoginOperation extends AsyncTask
    {

        private boolean allowStoredSession;
        private String fbId;
        final LoginServiceManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            startWishLoginWithFb(fbId, allowStoredSession);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
        }

        protected void onPreExecute()
        {
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        public AsyncFbLoginOperation(String s, boolean flag)
        {
            this$0 = LoginServiceManager.this;
            super();
            fbId = s;
            allowStoredSession = flag;
        }
    }

    private class AsyncGooglePlusLoginOperation extends AsyncTask
    {

        private boolean allowStoredSession;
        private String googlePlusId;
        final LoginServiceManager this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient Void doInBackground(Void avoid[])
        {
            startWishLoginWithGooglePlus(googlePlusId, allowStoredSession);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
        }

        protected void onPreExecute()
        {
        }

        protected volatile void onProgressUpdate(Object aobj[])
        {
            onProgressUpdate((Void[])aobj);
        }

        protected transient void onProgressUpdate(Void avoid[])
        {
        }

        public AsyncGooglePlusLoginOperation(String s, boolean flag)
        {
            this$0 = LoginServiceManager.this;
            super();
            googlePlusId = s;
            allowStoredSession = flag;
        }
    }

    public static interface Callback
    {

        public abstract void onFailure(boolean flag, boolean flag1, String s);

        public abstract void onSuccess(boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow);
    }


    private Callback callback;
    private EmailLoginService emailLoginService;
    private EmailSignupService emailSignupService;
    private FbLoginService fbLoginService;
    private boolean followeesLoaded;
    private boolean followeesNeedsRefresh;
    private GetProfileService getProfileService;
    private GetUserFolloweesService getUserFolloweesService;
    private GetUserStatusService getUserStatusService;
    private GooglePlusLoginService googlePlusLoginService;
    private Handler handler;
    private boolean profileLoaded;
    private boolean profileNeedsRefresh;
    private boolean userStatusLoaded;

    public LoginServiceManager()
    {
        if (Looper.myLooper() != null)
        {
            handler = new Handler();
        }
        fbLoginService = new FbLoginService();
        emailLoginService = new EmailLoginService();
        emailSignupService = new EmailSignupService();
        getProfileService = new GetProfileService();
        getUserFolloweesService = new GetUserFolloweesService();
        getUserStatusService = new GetUserStatusService();
        googlePlusLoginService = new GooglePlusLoginService();
    }

    private void handleLoadingComplete(boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
    {
        if (followeesLoaded && userStatusLoaded && profileLoaded)
        {
            UserPreferences.setForceRelogin(false);
            sendCallbackSuccessOnMainThread(flag, wishsignupflow);
        }
    }

    private void requestFacebookProfile()
    {
        Request.newMeRequest(FacebookManager.getInstance().getFacebookSession(), new com.facebook.Request.GraphUserCallback() {

            final LoginServiceManager this$0;

            public void onCompleted(GraphUser graphuser, Response response)
            {
                if (response.getError() != null)
                {
                    sendCallbackFailureOnMainThread(true, false, null);
                    return;
                } else
                {
                    graphuser = graphuser.getId();
                    UserPreferences.setFbId(graphuser);
                    startWishLoginWithFbOnMainThread(graphuser, false);
                    return;
                }
            }

            
            {
                this$0 = LoginServiceManager.this;
                super();
            }
        }).executeAsync();
    }

    private void requestFacebookProfileOnMainThread()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final LoginServiceManager this$0;

                public void run()
                {
                    requestFacebookProfile();
                }

            
            {
                this$0 = LoginServiceManager.this;
                super();
            }
            });
            return;
        } else
        {
            requestFacebookProfile();
            return;
        }
    }

    private void sendCallbackFailure(boolean flag, boolean flag1, String s)
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.Login, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
        if (callback != null)
        {
            callback.onFailure(flag, flag1, s);
            callback = null;
        }
    }

    private void sendCallbackFailureOnMainThread(final boolean facebookError, final boolean googlePlusError, final String errorMessage)
    {
        logout();
        fbLoginService.cancelAllRequests();
        getProfileService.cancelAllRequests();
        getUserFolloweesService.cancelAllRequests();
        getUserStatusService.cancelAllRequests();
        if (handler != null)
        {
            handler.post(new Runnable() {

                final LoginServiceManager this$0;
                final String val$errorMessage;
                final boolean val$facebookError;
                final boolean val$googlePlusError;

                public void run()
                {
                    sendCallbackFailure(facebookError, googlePlusError, errorMessage);
                }

            
            {
                this$0 = LoginServiceManager.this;
                facebookError = flag;
                googlePlusError = flag1;
                errorMessage = s;
                super();
            }
            });
            return;
        } else
        {
            sendCallbackFailure(facebookError, googlePlusError, errorMessage);
            return;
        }
    }

    private void sendCallbackSuccess(boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
    {
        if (callback != null)
        {
            callback.onSuccess(flag, wishsignupflow);
            callback = null;
        }
        if (profileNeedsRefresh)
        {
            LoggedInUser.getInstance().refreshProfile();
        }
        if (followeesNeedsRefresh)
        {
            LoggedInUser.getInstance().getFollowingManager().refreshFollowing();
        }
    }

    private void sendCallbackSuccessOnMainThread(final boolean isNewUser, final com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow signupFlow)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final LoginServiceManager this$0;
                final boolean val$isNewUser;
                final com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow val$signupFlow;

                public void run()
                {
                    sendCallbackSuccess(isNewUser, signupFlow);
                }

            
            {
                this$0 = LoginServiceManager.this;
                isNewUser = flag;
                signupFlow = wishsignupflow;
                super();
            }
            });
            return;
        } else
        {
            sendCallbackSuccess(isNewUser, signupFlow);
            return;
        }
    }

    private void startWishLoginTasks(String s, final boolean isNewUser, boolean flag, final com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow signupFlow)
    {
        followeesLoaded = false;
        userStatusLoaded = false;
        profileLoaded = false;
        profileNeedsRefresh = false;
        followeesNeedsRefresh = false;
        WishUser wishuser;
        if (flag)
        {
            wishuser = WishUser.deserializeLoggedInUser();
        } else
        {
            wishuser = null;
        }
        if (wishuser != null)
        {
            LoggedInUser.getInstance().setCurrentUser(wishuser);
            profileLoaded = true;
            profileNeedsRefresh = true;
        } else
        {
            getProfileService.requestService(s, true, false, new com.contextlogic.wish.api.service.GetProfileService.SuccessCallback() {

                final LoginServiceManager this$0;
                final boolean val$isNewUser;
                final com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow val$signupFlow;

                public void onServiceSucceeded(WishUser wishuser1)
                {
                    TransientCache.getInstance().cacheUser(wishuser1);
                    LoggedInUser.getInstance().setCurrentUser(wishuser1);
                    profileLoaded = true;
                    handleLoadingComplete(isNewUser, signupFlow);
                }

            
            {
                this$0 = LoginServiceManager.this;
                isNewUser = flag;
                signupFlow = wishsignupflow;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final LoginServiceManager this$0;
                final boolean val$isNewUser;

                public void onServiceFailed()
                {
                    if (isNewUser)
                    {
                        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.NewUserLoginStepTwo, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    } else
                    {
                        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.LoginStepTwo, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    }
                    sendCallbackFailureOnMainThread(false, false, null);
                }

            
            {
                this$0 = LoginServiceManager.this;
                isNewUser = flag;
                super();
            }
            });
        }
        if (flag && LoggedInUser.getInstance().getFollowingManager().deserialize())
        {
            followeesLoaded = true;
            followeesNeedsRefresh = true;
        } else
        {
            getUserFolloweesService.requestService(false, new com.contextlogic.wish.api.service.GetUserFolloweesService.SuccessCallback() {

                final LoginServiceManager this$0;
                final boolean val$isNewUser;
                final com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow val$signupFlow;

                public void onServiceSucceeded()
                {
                    followeesLoaded = true;
                    handleLoadingComplete(isNewUser, signupFlow);
                }

            
            {
                this$0 = LoginServiceManager.this;
                isNewUser = flag;
                signupFlow = wishsignupflow;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final LoginServiceManager this$0;
                final boolean val$isNewUser;

                public void onServiceFailed()
                {
                    if (isNewUser)
                    {
                        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.NewUserLoginStepThree, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    } else
                    {
                        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.LoginStepThree, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    }
                    sendCallbackFailureOnMainThread(false, false, null);
                }

            
            {
                this$0 = LoginServiceManager.this;
                isNewUser = flag;
                super();
            }
            });
        }
        if (flag && UserStatusManager.getInstance().deserialize())
        {
            userStatusLoaded = true;
        } else
        {
            getUserStatusService.requestService(false, new com.contextlogic.wish.api.service.GetUserStatusService.SuccessCallback() {

                final LoginServiceManager this$0;
                final boolean val$isNewUser;
                final com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow val$signupFlow;

                public void onServiceSucceeded()
                {
                    userStatusLoaded = true;
                    handleLoadingComplete(isNewUser, signupFlow);
                }

            
            {
                this$0 = LoginServiceManager.this;
                isNewUser = flag;
                signupFlow = wishsignupflow;
                super();
            }
            }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                final LoginServiceManager this$0;
                final boolean val$isNewUser;

                public void onServiceFailed()
                {
                    if (isNewUser)
                    {
                        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.NewUserLoginStepFour, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    } else
                    {
                        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.LoginStepFour, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    }
                    sendCallbackFailureOnMainThread(false, false, null);
                }

            
            {
                this$0 = LoginServiceManager.this;
                isNewUser = flag;
                super();
            }
            });
        }
        if (followeesLoaded && userStatusLoaded && profileLoaded)
        {
            handleLoadingComplete(isNewUser, signupFlow);
        }
    }

    private void startWishLoginWithEmail(String s, String s1)
    {
        String s2 = LoggedInUser.getInstance().deserializeSession(null, s, null);
        if (s2 != null)
        {
            startWishLoginTasks(s2, false, true, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.None);
            return;
        } else
        {
            emailLoginService.requestService(s, s1, new com.contextlogic.wish.api.service.FbLoginService.SuccessCallback() {

                final LoginServiceManager this$0;

                public void onServiceSucceeded(String s3, boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
                {
                    LoggedInUser.getInstance().setLoginTime(System.currentTimeMillis());
                    startWishLoginTasks(s3, flag, true, wishsignupflow);
                }

            
            {
                this$0 = LoginServiceManager.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.EmailLoginService.FailureCallback() {

                final LoginServiceManager this$0;

                public void onServiceFailed(String s3)
                {
                    Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.EmailLoginStepOne, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    sendCallbackFailureOnMainThread(false, false, s3);
                }

            
            {
                this$0 = LoginServiceManager.this;
                super();
            }
            });
            return;
        }
    }

    private void startWishLoginWithEmailOnMainThread(final String email, final String password)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final LoginServiceManager this$0;
                final String val$email;
                final String val$password;

                public void run()
                {
                    (new AsyncEmailLoginOperation(email, password)).execute(new Void[0]);
                }

            
            {
                this$0 = LoginServiceManager.this;
                email = s;
                password = s1;
                super();
            }
            });
            return;
        } else
        {
            (new AsyncEmailLoginOperation(email, password)).execute(new Void[0]);
            return;
        }
    }

    private void startWishLoginWithFb(String s, final boolean allowStoredSession)
    {
        String s1 = null;
        String s2 = FacebookManager.getInstance().getFacebookSession().getAccessToken();
        long l = FacebookManager.getInstance().getFacebookSession().getExpirationDate().getTime() / 1000L;
        if (allowStoredSession)
        {
            s1 = LoggedInUser.getInstance().deserializeSession(s, null, null);
        }
        if (s1 != null)
        {
            startWishLoginTasks(s1, false, allowStoredSession, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.None);
            return;
        } else
        {
            fbLoginService.requestService(s, s2, l, new com.contextlogic.wish.api.service.FbLoginService.SuccessCallback() {

                final LoginServiceManager this$0;
                final boolean val$allowStoredSession;

                public void onServiceSucceeded(String s3, boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
                {
                    LoggedInUser.getInstance().setLoginTime(System.currentTimeMillis());
                    startWishLoginTasks(s3, flag, allowStoredSession, wishsignupflow);
                }

            
            {
                this$0 = LoginServiceManager.this;
                allowStoredSession = flag;
                super();
            }
            }, new com.contextlogic.wish.api.service.FbLoginService.FailureCallback() {

                final LoginServiceManager this$0;

                public void onServiceFailed(boolean flag, String s3)
                {
                    Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.LoginStepOne, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    sendCallbackFailureOnMainThread(flag, false, s3);
                }

            
            {
                this$0 = LoginServiceManager.this;
                super();
            }
            });
            return;
        }
    }

    private void startWishLoginWithFbOnMainThread(final String fbId, final boolean allowStoredSession)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final LoginServiceManager this$0;
                final boolean val$allowStoredSession;
                final String val$fbId;

                public void run()
                {
                    (new AsyncFbLoginOperation(fbId, allowStoredSession)).execute(new Void[0]);
                }

            
            {
                this$0 = LoginServiceManager.this;
                fbId = s;
                allowStoredSession = flag;
                super();
            }
            });
            return;
        } else
        {
            (new AsyncFbLoginOperation(fbId, allowStoredSession)).execute(new Void[0]);
            return;
        }
    }

    private void startWishLoginWithGooglePlus(final String googlePlusId, boolean flag)
    {
        String s;
        if (flag)
        {
            s = LoggedInUser.getInstance().deserializeSession(null, null, googlePlusId);
        } else
        {
            s = null;
        }
        if (s != null)
        {
            startWishLoginTasks(s, false, flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.None);
            return;
        }
        s = null;
        String s1 = GoogleAuthUtil.getToken(WishApplication.getAppInstance(), GooglePlusManager.getInstance().getAccountName(), GooglePlusManager.getInstance().getScopeString());
        s = s1;
_L1:
        Throwable throwable;
        if (s != null)
        {
            googlePlusLoginService.requestService(googlePlusId, s, GooglePlusManager.getInstance().getAccountName(), new com.contextlogic.wish.api.service.FbLoginService.SuccessCallback() {

                final LoginServiceManager this$0;
                final String val$googlePlusId;

                public void onServiceSucceeded(String s2, boolean flag1, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
                {
                    UserPreferences.setGooglePlusId(googlePlusId);
                    LoggedInUser.getInstance().setLoginTime(System.currentTimeMillis());
                    startWishLoginTasks(s2, flag1, true, wishsignupflow);
                }

            
            {
                this$0 = LoginServiceManager.this;
                googlePlusId = s;
                super();
            }
            }, new com.contextlogic.wish.api.service.GooglePlusLoginService.FailureCallback() {

                final LoginServiceManager this$0;

                public void onServiceFailed(boolean flag1, String s2)
                {
                    Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.GooglePlusLoginStepOne, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                    sendCallbackFailureOnMainThread(false, flag1, s2);
                }

            
            {
                this$0 = LoginServiceManager.this;
                super();
            }
            });
            return;
        } else
        {
            Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.GooglePlusLoginPrestep, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
            sendCallbackFailureOnMainThread(false, true, null);
            return;
        }
        throwable;
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.GooglePlusLoginPrestep, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
          goto _L1
    }

    private void startWishLoginWithGooglePlusOnMainThread(final String googlePlusId, final boolean allowStoredSession)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final LoginServiceManager this$0;
                final boolean val$allowStoredSession;
                final String val$googlePlusId;

                public void run()
                {
                    (new AsyncGooglePlusLoginOperation(googlePlusId, allowStoredSession)).execute(new Void[0]);
                }

            
            {
                this$0 = LoginServiceManager.this;
                googlePlusId = s;
                allowStoredSession = flag;
                super();
            }
            });
            return;
        } else
        {
            (new AsyncGooglePlusLoginOperation(googlePlusId, allowStoredSession)).execute(new Void[0]);
            return;
        }
    }

    private void startWishSignupWithEmail(String s, String s1, String s2, String s3)
    {
        emailSignupService.requestService(s, s1, s2, s3, new com.contextlogic.wish.api.service.FbLoginService.SuccessCallback() {

            final LoginServiceManager this$0;

            public void onServiceSucceeded(String s4, boolean flag, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
            {
                LoggedInUser.getInstance().setLoginTime(System.currentTimeMillis());
                startWishLoginTasks(s4, flag, false, wishsignupflow);
            }

            
            {
                this$0 = LoginServiceManager.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.EmailSignupService.FailureCallback() {

            final LoginServiceManager this$0;

            public void onServiceFailed(String s4)
            {
                Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.EmailLoginStepOne, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
                sendCallbackFailureOnMainThread(false, false, s4);
            }

            
            {
                this$0 = LoginServiceManager.this;
                super();
            }
        });
    }

    private void startWishSignupWithEmailOnMainThread(final String firstName, final String lastName, final String email, final String password)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final LoginServiceManager this$0;
                final String val$email;
                final String val$firstName;
                final String val$lastName;
                final String val$password;

                public void run()
                {
                    (new AsyncEmailSignupOperation(firstName, lastName, email, password)).execute(new Void[0]);
                }

            
            {
                this$0 = LoginServiceManager.this;
                firstName = s;
                lastName = s1;
                email = s2;
                password = s3;
                super();
            }
            });
            return;
        } else
        {
            (new AsyncEmailSignupOperation(firstName, lastName, email, password)).execute(new Void[0]);
            return;
        }
    }

    public void logout()
    {
        WishApi.getInstance().getConfig().clearSessionCookies();
    }

    public void startLogin(Callback callback1, String s)
    {
        startLogin(callback1, s, null, null, null, null);
    }

    public void startLogin(Callback callback1, String s, String s1, String s2)
    {
        startLogin(callback1, s, null, null, s1, s2);
    }

    public void startLogin(Callback callback1, String s, String s1, String s2, String s3, String s4)
    {
        callback = callback1;
        if (!s.equals("LoginModeFB")) goto _L2; else goto _L1
_L1:
        UserPreferences.setLoginMode("LoginModeFB");
        callback1 = UserPreferences.getFbId();
        if (callback1 == null) goto _L4; else goto _L3
_L3:
        startWishLoginWithFbOnMainThread(callback1, true);
_L6:
        return;
_L4:
        requestFacebookProfileOnMainThread();
        return;
_L2:
        if (!s.equals("LoginModeGooglePlus"))
        {
            break; /* Loop/switch isn't completed */
        }
        UserPreferences.setLoginMode("LoginModeGooglePlus");
        if (GooglePlusManager.getInstance().getLoggedInUser() == null || GooglePlusManager.getInstance().getLoggedInUser().getId() == null)
        {
            if (callback1 != null)
            {
                callback1.onFailure(false, true, null);
                return;
            }
        } else
        {
            callback1 = GooglePlusManager.getInstance().getLoggedInUser().getId();
            if (callback1 != null)
            {
                startWishLoginWithGooglePlusOnMainThread(callback1, true);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!s.equals("LoginModeEmail"))
        {
            continue; /* Loop/switch isn't completed */
        }
        UserPreferences.setLoginMode("LoginModeEmail");
        if (s3 != null && s4 != null)
        {
            startWishLoginWithEmailOnMainThread(s3, s4);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!s.equals("LoginModeEmailSignup")) goto _L6; else goto _L7
_L7:
        UserPreferences.setLoginMode("LoginModeEmail");
        if (s3 != null && s4 != null && s1 != null && s2 != null)
        {
            startWishSignupWithEmailOnMainThread(s1, s2, s3, s4);
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
    }










/*
    static boolean access$402(LoginServiceManager loginservicemanager, boolean flag)
    {
        loginservicemanager.profileLoaded = flag;
        return flag;
    }

*/



/*
    static boolean access$602(LoginServiceManager loginservicemanager, boolean flag)
    {
        loginservicemanager.followeesLoaded = flag;
        return flag;
    }

*/


/*
    static boolean access$702(LoginServiceManager loginservicemanager, boolean flag)
    {
        loginservicemanager.userStatusLoaded = flag;
        return flag;
    }

*/


}
