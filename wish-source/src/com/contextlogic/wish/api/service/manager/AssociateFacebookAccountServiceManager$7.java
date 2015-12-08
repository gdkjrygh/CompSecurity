// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;


// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            AssociateFacebookAccountServiceManager

class val.error
    implements Runnable
{

    final AssociateFacebookAccountServiceManager this$0;
    final String val$error;

    public void run()
    {
        AssociateFacebookAccountServiceManager.access$600(AssociateFacebookAccountServiceManager.this, val$error);
    }

    ()
    {
        this$0 = final_associatefacebookaccountservicemanager;
        val$error = String.this;
        super();
    }
}
