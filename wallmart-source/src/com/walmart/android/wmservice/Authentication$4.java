// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;


// Referenced classes of package com.walmart.android.wmservice:
//            Authentication

class thCallback
    implements Runnable
{

    final Authentication this$0;
    final thCallback val$callback;
    final boolean val$force;

    public void run()
    {
        if (hasCredentials())
        {
            if (val$force || needsSessionRenewal())
            {
                Authentication.access$800(Authentication.this, val$callback);
            } else
            {
                val$callback.onSuccess();
            }
        } else
        {
            val$callback.onFailure(4);
        }
        Authentication.access$900(Authentication.this);
    }

    thCallback()
    {
        this$0 = final_authentication;
        val$force = flag;
        val$callback = thCallback.this;
        super();
    }
}
