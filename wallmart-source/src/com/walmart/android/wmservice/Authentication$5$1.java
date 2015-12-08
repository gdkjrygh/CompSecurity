// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.os.Handler;

// Referenced classes of package com.walmart.android.wmservice:
//            Authentication, WalmartNetService

class is._cls0 extends leTaskAsyncCallbackOnThread
{

    final onSuccessSameThread this$1;

    public void onFailureSameThread(Integer integer, Boolean boolean1)
    {
        callback.onFailure(Authentication.access$300(_fld0, integer.intValue()));
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (Boolean)obj1);
    }

    public void onSuccessSameThread(Boolean boolean1)
    {
        Authentication.access$1000(_fld0);
        Authentication.access$600(_fld0);
        if (notifyListeners)
        {
            Authentication.access$1100(_fld0);
        }
        callback.onSuccess();
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((Boolean)obj);
    }

    l.notifyListeners(Handler handler)
    {
        this$1 = this._cls1.this;
        super(_fld0, handler);
    }

    // Unreferenced inner class com/walmart/android/wmservice/Authentication$5

/* anonymous class */
    class Authentication._cls5
        implements Runnable
    {

        final Authentication this$0;
        final Authentication.AuthCallback val$callback;
        final boolean val$notifyListeners;

        public void run()
        {
            Authentication.access$000(Authentication.this).logOut(new Authentication._cls5._cls1(Authentication.access$200(Authentication.this)));
        }

            
            {
                this$0 = final_authentication;
                callback = authcallback;
                notifyListeners = Z.this;
                super();
            }
    }

}
