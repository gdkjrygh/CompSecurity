// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.os.Handler;
import com.walmart.android.data.LoginResult;

// Referenced classes of package com.walmart.android.wmservice:
//            Authentication, WalmartNetService

class is._cls0 extends leTaskAsyncCallbackOnThread
{

    final onSuccessSameThread this$1;

    public void onFailureSameThread(Integer integer, LoginResult loginresult)
    {
        if (integer.intValue() == 401)
        {
            clearToken();
            callback.onFailure(4);
            return;
        } else
        {
            callback.onFailure(Authentication.access$300(_fld0, integer.intValue()));
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (LoginResult)obj1);
    }

    public void onSuccessSameThread(LoginResult loginresult)
    {
        if (loginresult.isLoggedIn())
        {
            Authentication.access$500(_fld0, loginresult, true);
            callback.onSuccess();
            return;
        } else
        {
            clearToken();
            callback.onFailure(4);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((LoginResult)obj);
    }

    Callback(Handler handler)
    {
        this$1 = this._cls1.this;
        super(_fld0, handler);
    }

    // Unreferenced inner class com/walmart/android/wmservice/Authentication$2

/* anonymous class */
    class Authentication._cls2
        implements Runnable
    {

        final Authentication this$0;
        final Authentication.AuthCallback val$callback;

        public void run()
        {
            if (hasCredentials())
            {
                Authentication.access$000(Authentication.this).validateToken(Authentication.access$700(Authentication.this), new Authentication._cls2._cls1(Authentication.access$200(Authentication.this)));
                return;
            } else
            {
                callback.onFailure(4);
                return;
            }
        }

            
            {
                this$0 = final_authentication;
                callback = Authentication.AuthCallback.this;
                super();
            }
    }

}
