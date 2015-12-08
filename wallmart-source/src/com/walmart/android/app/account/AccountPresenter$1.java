// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import java.util.Iterator;

// Referenced classes of package com.walmart.android.app.account:
//            AccountPresenter

class val.iterator
    implements egateCallback
{

    final AccountPresenter this$0;
    final boolean val$accountCreated;
    final boolean val$emailSignup;
    final boolean val$guest;
    final Iterator val$iterator;

    public void onComplete()
    {
        delegateFinish(val$guest, val$accountCreated, val$emailSignup, val$iterator);
    }

    egateCallback()
    {
        this$0 = final_accountpresenter;
        val$guest = flag;
        val$accountCreated = flag1;
        val$emailSignup = flag2;
        val$iterator = Iterator.this;
        super();
    }
}
