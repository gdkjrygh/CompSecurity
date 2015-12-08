// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;


// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            AssociateFacebookAccountServiceManager

class val.fbId
    implements Runnable
{

    final AssociateFacebookAccountServiceManager this$0;
    final String val$fbId;

    public void run()
    {
        AssociateFacebookAccountServiceManager.access$300(AssociateFacebookAccountServiceManager.this, val$fbId);
    }

    ()
    {
        this$0 = final_associatefacebookaccountservicemanager;
        val$fbId = String.this;
        super();
    }
}
