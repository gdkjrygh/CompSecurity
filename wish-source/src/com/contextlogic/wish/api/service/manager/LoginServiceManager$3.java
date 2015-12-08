// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;


// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class val.password
    implements Runnable
{

    final LoginServiceManager this$0;
    final String val$email;
    final String val$password;

    public void run()
    {
        (new yncEmailLoginOperation(LoginServiceManager.this, val$email, val$password)).execute(new Void[0]);
    }

    yncEmailLoginOperation()
    {
        this$0 = final_loginservicemanager;
        val$email = s;
        val$password = String.this;
        super();
    }
}
