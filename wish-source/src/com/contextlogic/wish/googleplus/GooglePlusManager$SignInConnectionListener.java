// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.googleplus;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.contextlogic.wish.googleplus:
//            GooglePlusManager

private class <init>
    implements com.google.android.gms.common.api.init>, com.google.android.gms.common.api.init>
{

    final GooglePlusManager this$0;

    public void onConnected(Bundle bundle)
    {
        if (getLoggedInUser() == null)
        {
            if (GooglePlusManager.access$800(GooglePlusManager.this) != null)
            {
                GooglePlusManager.access$800(GooglePlusManager.this)._mth0();
            }
        } else
        {
            if (GooglePlusManager.access$800(GooglePlusManager.this) != null)
            {
                GooglePlusManager.access$800(GooglePlusManager.this)._mth0();
            }
            resetWalletClient();
        }
        GooglePlusManager.access$802(GooglePlusManager.this, null);
        GooglePlusManager.access$902(GooglePlusManager.this, null);
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        if (connectionresult.hasResolution())
        {
            if (GooglePlusManager.access$800(GooglePlusManager.this) != null && GooglePlusManager.access$800(GooglePlusManager.this).ForErrorResolution() != null)
            {
                android.app.Activity activity = GooglePlusManager.access$800(GooglePlusManager.this).ForErrorResolution();
                if (activity != null)
                {
                    try
                    {
                        connectionresult.startResolutionForResult(activity, 9314);
                    }
                    catch (android.content.lback lback)
                    {
                        GooglePlusManager.access$902(GooglePlusManager.this, null);
                        GooglePlusManager.access$1000(GooglePlusManager.this);
                    }
                }
            } else
            {
                if (GooglePlusManager.access$800(GooglePlusManager.this) != null)
                {
                    GooglePlusManager.access$800(GooglePlusManager.this)._mth0();
                }
                GooglePlusManager.access$802(GooglePlusManager.this, null);
            }
            GooglePlusManager.access$902(GooglePlusManager.this, connectionresult);
        } else
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (GooglePlusManager.access$800(GooglePlusManager.this) != null)
            {
                flag = flag1;
                if (GooglePlusManager.access$800(GooglePlusManager.this).ForErrorResolution() != null)
                {
                    android.app.Activity activity1 = GooglePlusManager.access$800(GooglePlusManager.this).ForErrorResolution();
                    flag = flag1;
                    if (activity1 != null)
                    {
                        connectionresult = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), activity1, 9314);
                        flag = flag1;
                        if (connectionresult != null)
                        {
                            flag = true;
                            connectionresult.show();
                            if (GooglePlusManager.access$800(GooglePlusManager.this) != null)
                            {
                                GooglePlusManager.access$800(GooglePlusManager.this).lure();
                            }
                            GooglePlusManager.access$802(GooglePlusManager.this, null);
                        }
                    }
                }
            }
            if (!flag)
            {
                if (GooglePlusManager.access$800(GooglePlusManager.this) != null)
                {
                    GooglePlusManager.access$800(GooglePlusManager.this)._mth0();
                }
                GooglePlusManager.access$802(GooglePlusManager.this, null);
                return;
            }
        }
    }

    public void onConnectionSuspended(int i)
    {
        GooglePlusManager.access$902(GooglePlusManager.this, null);
    }

    private ()
    {
        this$0 = GooglePlusManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
