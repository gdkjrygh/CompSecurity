// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.model.GraphUser;
import com.weather.commons.ups.facade.DsxAccount;
import com.weather.dal2.ups.UserDetails;

// Referenced classes of package com.weather.commons.ups.ui:
//            FacebookSignUp, SocialSignUpFragment

private class <init>
    implements com.facebook.ationCallback
{

    private final Session session;
    final FacebookSignUp this$0;

    private void completeProfileForFB(GraphUser graphuser)
    {
        if (graphuser != null)
        {
            DsxAccount dsxaccount = new DsxAccount(graphuser.getId(), session.getAccessToken(), com.weather.commons.ups.facade.ion);
            String s;
            if (graphuser.getProperty("email") != null)
            {
                s = graphuser.getProperty("email").toString();
            } else
            {
                s = "";
            }
            graphuser = new UserDetails(graphuser.getId(), graphuser.getFirstName(), graphuser.getLastName(), s);
            SocialSignUpFragment.newInstance(FacebookSignUp.access$100(FacebookSignUp.this).getFragmentManager(), dsxaccount, graphuser);
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
            Toast.makeText(FacebookSignUp.access$100(FacebookSignUp.this), "Failed to Login to Facebook", 1).show();
            return;
        }
    }

    private (Session session1)
    {
        this$0 = FacebookSignUp.this;
        super();
        session = session1;
    }

    session(Session session1, session session2)
    {
        this(session1);
    }
}
