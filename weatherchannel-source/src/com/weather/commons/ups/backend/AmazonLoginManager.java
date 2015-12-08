// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AmazonAuthorizationManager;
import com.amazon.identity.auth.device.authorization.api.AuthorizationListener;
import com.amazon.identity.auth.device.shared.APIListener;
import com.google.common.base.Preconditions;
import com.weather.commons.ups.backend.location.AmazonLoginListener;
import com.weather.dal2.ups.UserDetails;
import com.weather.util.app.AbstractTwcApplication;

public class AmazonLoginManager
{
    private static class AuthListener
        implements AuthorizationListener
    {

        public void onCancel(Bundle bundle)
        {
            Log.e("AmazonLoginManager", "User cancelled authorization");
            if (AmazonLoginManager.context instanceof Activity)
            {
                ((Activity)AmazonLoginManager.context).runOnUiThread(new Runnable() {

                    final AuthListener this$0;

                    public void run()
                    {
                        Toast.makeText(AbstractTwcApplication.getRootContext(), "Authorization cancelled", 0).show();
                    }

            
            {
                this$0 = AuthListener.this;
                super();
            }
                });
            }
        }

        public void onError(AuthError autherror)
        {
            Log.e("AmazonLoginManager", "AuthError during authorization", autherror);
        }

        public void onSuccess(Bundle bundle)
        {
            if (AmazonLoginManager.amazonAuthManager != null)
            {
                AmazonLoginManager.amazonAuthManager.getProfile(new ProfileListener());
            }
        }

        private AuthListener()
        {
        }

    }

    private static class ProfileListener
        implements APIListener
    {

        public void onError(AuthError autherror)
        {
            Log.e("AmazonLoginManager", autherror.getMessage(), autherror);
            if (AmazonLoginManager.loginListener != null)
            {
                AmazonLoginManager.loginListener.onLoginError(autherror);
            }
        }

        public void onSuccess(Bundle bundle)
        {
            bundle = bundle.getBundle(com.amazon.identity.auth.device.authorization.api.AuthzConstants.BUNDLE_KEY.PROFILE.val);
            if (AmazonLoginManager.amazonAuthManager != null)
            {
                AmazonLoginManager.amazonAuthManager.getToken(AmazonLoginManager.APP_SCOPES, bundle. new APIListener() {

                    final ProfileListener this$0;
                    final Bundle val$profileBundle;

                    public void onError(AuthError autherror)
                    {
                        Log.e("AmazonLoginManager", (new StringBuilder()).append("error in access token ").append(autherror).toString());
                        if (AmazonLoginManager.loginListener != null)
                        {
                            AmazonLoginManager.loginListener.onLoginError(autherror);
                        }
                    }

                    public void onSuccess(Bundle bundle)
                    {
                        bundle = bundle.getString("com.amazon.identity.auth.device.authorization.token");
                        if (bundle != null && profileBundle != null && AmazonLoginManager.loginListener != null)
                        {
                            String s = profileBundle.getString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.PROFILE_KEY.USER_ID.val);
                            UserDetails userdetails = new UserDetails(s, profileBundle.getString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.PROFILE_KEY.NAME.val), null, profileBundle.getString(com.amazon.identity.auth.device.authorization.api.AuthzConstants.PROFILE_KEY.EMAIL.val));
                            Log.i("AmazonLoginManager", (new StringBuilder()).append("user ID ").append(s).toString());
                            Log.i("AmazonLoginManager", (new StringBuilder()).append("access token ").append(bundle).toString());
                            AmazonLoginManager.loginListener.onLoginSuccess(userdetails, bundle);
                        } else
                        if (AmazonLoginManager.loginListener != null)
                        {
                            AmazonLoginManager.loginListener.onLoginError(new AuthError((new StringBuilder()).append("Profile bundle ").append(profileBundle).toString(), com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_ACCESS_DENIED));
                            return;
                        }
                    }

            
            {
                this$0 = final_profilelistener;
                profileBundle = Bundle.this;
                super();
            }
                });
            }
        }

        private ProfileListener()
        {
        }

    }


    private static final String APP_SCOPES[] = {
        "profile"
    };
    private static final String TAG = "AmazonLoginManager";
    private static AmazonAuthorizationManager amazonAuthManager;
    private static Context context;
    private static AmazonLoginListener loginListener;
    private static final AmazonLoginManager mAmazonLoginManager = new AmazonLoginManager();

    private AmazonLoginManager()
    {
    }

    public static AmazonLoginManager getInstance()
    {
        return mAmazonLoginManager;
    }

    public static void initializeAmazonManager(Context context1, AmazonLoginListener amazonloginlistener)
    {
        try
        {
            context = (Context)Preconditions.checkNotNull(context1);
            loginListener = (AmazonLoginListener)Preconditions.checkNotNull(amazonloginlistener);
            amazonAuthManager = new AmazonAuthorizationManager(context, Bundle.EMPTY);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            Log.e("AmazonLoginManager", "Unable to Use Amazon Authorization Manager. APIKey is incorrect or does not exist.", context1);
        }
    }

    public void connectAmazon()
    {
        if (amazonAuthManager != null)
        {
            amazonAuthManager.authorize(APP_SCOPES, Bundle.EMPTY, new AuthListener());
        }
    }

    public void disconnectAmazon()
    {
        if (amazonAuthManager != null)
        {
            amazonAuthManager.clearAuthorizationState(new APIListener() {

                final AmazonLoginManager this$0;

                public void onError(AuthError autherror)
                {
                    Log.d("AmazonLoginManager", (new StringBuilder()).append("Issue in amazon disconnect ").append(autherror).toString());
                }

                public void onSuccess(Bundle bundle)
                {
                    Log.d("AmazonLoginManager", "disconnected with amazon successfully ");
                }

            
            {
                this$0 = AmazonLoginManager.this;
                super();
            }
            });
        }
    }





}
