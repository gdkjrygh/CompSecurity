// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.util.Log;
import com.google.common.base.Preconditions;

// Referenced classes of package com.weather.commons.ups.ui:
//            GoogleSignUp, FacebookSignUp, AmazonSignUp

public class SignUpActions
{

    private final AmazonSignUp amazonSignUp;
    private final FacebookSignUp facebookSignUp;
    private final GoogleSignUp googleSignUp;

    public SignUpActions(Activity activity, ProgressDialog progressdialog)
    {
        Preconditions.checkNotNull(activity);
        googleSignUp = new GoogleSignUp(activity, progressdialog);
        googleSignUp.initialize();
        facebookSignUp = new FacebookSignUp(activity);
        amazonSignUp = new AmazonSignUp(activity);
    }

    public void handleActivityResult(int i, int j, Intent intent)
    {
        facebookSignUp.handleActivityResult(i, j, intent);
        googleSignUp.handleActivityResult(i, j);
    }

    public void invalidateAccount()
    {
        Log.e("APK-1491", "SignUpActions:invalidateAccount");
        googleSignUp.invalidateAccount();
    }

    public void onActivityDestroy()
    {
        googleSignUp.uninitialize();
    }

    public void onActivityStart()
    {
        googleSignUp.onActivityStart();
    }

    public void onActivityStop()
    {
        googleSignUp.onActivityStop();
    }

    public void signUpWithAmazon()
    {
        amazonSignUp.signUp();
    }

    public void signUpWithFacebook()
    {
        facebookSignUp.signUp();
    }

    public void signUpWithGooglePlus()
    {
        googleSignUp.signUp();
    }
}
