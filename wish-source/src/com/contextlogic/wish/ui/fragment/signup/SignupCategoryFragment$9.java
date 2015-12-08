// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCategoryFragment

class this._cls0
    implements com.contextlogic.wish.api.service.e.SuccessCallback
{

    final SignupCategoryFragment this$0;

    public void onServiceSucceeded(final ArrayList items)
    {
        postDelayed(new Runnable() {

            final SignupCategoryFragment._cls9 this$1;
            final ArrayList val$items;

            public void run()
            {
                SignupCategoryFragment.access$500(this$0, items);
            }

            
            {
                this$1 = SignupCategoryFragment._cls9.this;
                items = arraylist;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.items()
    {
        this$0 = SignupCategoryFragment.this;
        super();
    }
}
