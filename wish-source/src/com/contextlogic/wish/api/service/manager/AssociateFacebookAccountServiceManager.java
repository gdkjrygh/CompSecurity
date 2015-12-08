// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import android.os.Handler;
import android.os.Looper;
import com.contextlogic.wish.api.service.AssociateFacebookAccountService;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.user.UserPreferences;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.model.GraphUser;
import java.util.Date;

public class AssociateFacebookAccountServiceManager
{

    private AssociateFacebookAccountService associateFacebookAccountService;
    com.contextlogic.wish.api.service.AssociateFacebookAccountService.FailureCallback failureCallback;
    private Handler handler;
    com.contextlogic.wish.api.service.AssociateFacebookAccountService.SuccessCallback successCallback;

    public AssociateFacebookAccountServiceManager()
    {
        if (Looper.myLooper() != null)
        {
            handler = new Handler();
        }
        associateFacebookAccountService = new AssociateFacebookAccountService();
    }

    private void requestFacebookProfile()
    {
        Request.newMeRequest(FacebookManager.getInstance().getFacebookSession(), new com.facebook.Request.GraphUserCallback() {

            final AssociateFacebookAccountServiceManager this$0;

            public void onCompleted(GraphUser graphuser, Response response)
            {
                if (response.getError() != null)
                {
                    sendCallbackFailureOnMainThread(null);
                    return;
                } else
                {
                    graphuser = graphuser.getId();
                    UserPreferences.setFbId(graphuser);
                    startWishAssociateWithFbOnMainThread(graphuser);
                    return;
                }
            }

            
            {
                this$0 = AssociateFacebookAccountServiceManager.this;
                super();
            }
        }).executeAsync();
    }

    private void requestFacebookProfileOnMainThread()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final AssociateFacebookAccountServiceManager this$0;

                public void run()
                {
                    requestFacebookProfile();
                }

            
            {
                this$0 = AssociateFacebookAccountServiceManager.this;
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

    private void sendCallbackFailure(String s)
    {
        if (failureCallback != null)
        {
            failureCallback.onServiceFailed(s);
            failureCallback = null;
            successCallback = null;
        }
    }

    private void sendCallbackFailureOnMainThread(final String error)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final AssociateFacebookAccountServiceManager this$0;
                final String val$error;

                public void run()
                {
                    sendCallbackFailure(error);
                }

            
            {
                this$0 = AssociateFacebookAccountServiceManager.this;
                error = s;
                super();
            }
            });
            return;
        } else
        {
            sendCallbackFailure(error);
            return;
        }
    }

    private void sendCallbackSuccess()
    {
        if (successCallback != null)
        {
            successCallback.onServiceSucceeded();
            successCallback = null;
            failureCallback = null;
        }
    }

    private void sendCallbackSuccessOnMainThread()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final AssociateFacebookAccountServiceManager this$0;

                public void run()
                {
                    sendCallbackSuccess();
                }

            
            {
                this$0 = AssociateFacebookAccountServiceManager.this;
                super();
            }
            });
            return;
        } else
        {
            sendCallbackSuccess();
            return;
        }
    }

    private void startWishAssociateWithFb(String s)
    {
        String s1 = FacebookManager.getInstance().getFacebookSession().getAccessToken();
        long l = FacebookManager.getInstance().getFacebookSession().getExpirationDate().getTime() / 1000L;
        associateFacebookAccountService.requestService(s, s1, l, new com.contextlogic.wish.api.service.AssociateFacebookAccountService.SuccessCallback() {

            final AssociateFacebookAccountServiceManager this$0;

            public void onServiceSucceeded()
            {
                sendCallbackSuccessOnMainThread();
            }

            
            {
                this$0 = AssociateFacebookAccountServiceManager.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.AssociateFacebookAccountService.FailureCallback() {

            final AssociateFacebookAccountServiceManager this$0;

            public void onServiceFailed(String s2)
            {
                sendCallbackFailureOnMainThread(s2);
            }

            
            {
                this$0 = AssociateFacebookAccountServiceManager.this;
                super();
            }
        });
    }

    private void startWishAssociateWithFbOnMainThread(final String fbId)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final AssociateFacebookAccountServiceManager this$0;
                final String val$fbId;

                public void run()
                {
                    startWishAssociateWithFb(fbId);
                }

            
            {
                this$0 = AssociateFacebookAccountServiceManager.this;
                fbId = s;
                super();
            }
            });
            return;
        } else
        {
            startWishAssociateWithFb(fbId);
            return;
        }
    }

    public void associateAccount(com.contextlogic.wish.api.service.AssociateFacebookAccountService.SuccessCallback successcallback, com.contextlogic.wish.api.service.AssociateFacebookAccountService.FailureCallback failurecallback)
    {
        successCallback = successcallback;
        failureCallback = failurecallback;
        requestFacebookProfileOnMainThread();
    }







}
