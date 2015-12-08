// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.model.GraphUser;
import com.google.common.base.Preconditions;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.ups.UserDetails;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.weather.commons.ups.ui:
//            SocialSignUpFragment

class FacebookSignUp
{
    private class FacebookProfileCreationCallback
        implements com.facebook.Request.GraphUserCallback
    {

        private final Session session;
        final FacebookSignUp this$0;

        private void completeProfileForFB(GraphUser graphuser)
        {
            if (graphuser != null)
            {
                DsxAccount dsxaccount = new DsxAccount(graphuser.getId(), session.getAccessToken(), com.weather.commons.ups.facade.DsxAccount.AccountProvider.PROVIDER_FACEBOOK);
                String s;
                if (graphuser.getProperty("email") != null)
                {
                    s = graphuser.getProperty("email").toString();
                } else
                {
                    s = "";
                }
                graphuser = new UserDetails(graphuser.getId(), graphuser.getFirstName(), graphuser.getLastName(), s);
                SocialSignUpFragment.newInstance(activity.getFragmentManager(), dsxaccount, graphuser);
                return;
            } else
            {
                Log.e("FacebookSignup", "facebook user is not logged in");
                return;
            }
        }

        public void onCompleted(GraphUser graphuser, Response response)
        {
            if (graphuser != null)
            {
                completeProfileForFB(graphuser);
                return;
            } else
            {
                Toast.makeText(activity, "Failed to Login to Facebook", 1).show();
                return;
            }
        }

        private FacebookProfileCreationCallback(Session session1)
        {
            this$0 = FacebookSignUp.this;
            super();
            session = session1;
        }

    }


    private static final String TAG = "FacebookSignup";
    private final Activity activity;

    FacebookSignUp(Activity activity1)
    {
        activity = (Activity)Preconditions.checkNotNull(activity1);
    }

    void handleActivityResult(int i, int j, Intent intent)
    {
        if (Session.getActiveSession() != null)
        {
            Session.getActiveSession().onActivityResult(activity, i, j, intent);
            if (Session.getActiveSession().isClosed())
            {
                Session.setActiveSession(null);
            }
        }
    }

    void signUp()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("email");
        Session.openActiveSession(activity, true, arraylist, new com.facebook.Session.StatusCallback() {

            final FacebookSignUp this$0;

            public void call(Session session, SessionState sessionstate, Exception exception)
            {
                if (session.isOpened())
                {
                    Request.newMeRequest(session, new FacebookProfileCreationCallback(session)).executeAsync();
                }
            }

            
            {
                this$0 = FacebookSignUp.this;
                super();
            }
        });
    }

}
