// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;


// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class val.errorMessage
    implements Runnable
{

    final LoginServiceManager this$0;
    final String val$errorMessage;
    final boolean val$facebookError;
    final boolean val$googlePlusError;

    public void run()
    {
        LoginServiceManager.access$900(LoginServiceManager.this, val$facebookError, val$googlePlusError, val$errorMessage);
    }

    ()
    {
        this$0 = final_loginservicemanager;
        val$facebookError = flag;
        val$googlePlusError = flag1;
        val$errorMessage = String.this;
        super();
    }
}
