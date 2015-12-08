// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//            WebDialog, Utility, Validate

public static class finishInit
{

    private AccessToken accessToken;
    private String action;
    private String applicationId;
    private Context context;
    private teListener listener;
    private Bundle parameters;
    private int theme;

    private void finishInit(Context context1, String s, Bundle bundle)
    {
        context = context1;
        action = s;
        if (bundle != null)
        {
            parameters = bundle;
            return;
        } else
        {
            parameters = new Bundle();
            return;
        }
    }

    public WebDialog build()
    {
        if (accessToken != null)
        {
            parameters.putString("app_id", accessToken.getApplicationId());
            parameters.putString("access_token", accessToken.getToken());
        } else
        {
            parameters.putString("app_id", applicationId);
        }
        return new WebDialog(context, action, parameters, theme, listener);
    }

    public String getApplicationId()
    {
        return applicationId;
    }

    public Context getContext()
    {
        return context;
    }

    public teListener getListener()
    {
        return listener;
    }

    public Bundle getParameters()
    {
        return parameters;
    }

    public int getTheme()
    {
        return theme;
    }

    public teListener setOnCompleteListener(teListener telistener)
    {
        listener = telistener;
        return this;
    }

    public listener setTheme(int i)
    {
        theme = i;
        return this;
    }

    public teListener(Context context1, String s, Bundle bundle)
    {
label0:
        {
            super();
            theme = 0x1030010;
            accessToken = AccessToken.getCurrentAccessToken();
            if (accessToken == null)
            {
                String s1 = Utility.getMetadataApplicationId(context1);
                if (s1 == null)
                {
                    break label0;
                }
                applicationId = s1;
            }
            finishInit(context1, s, bundle);
            return;
        }
        throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
    }

    public finishInit(Context context1, String s, String s1, Bundle bundle)
    {
        theme = 0x1030010;
        String s2 = s;
        if (s == null)
        {
            s2 = Utility.getMetadataApplicationId(context1);
        }
        Validate.notNullOrEmpty(s2, "applicationId");
        applicationId = s2;
        finishInit(context1, s1, bundle);
    }
}
