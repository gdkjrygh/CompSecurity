// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCategoryFragment

class val.items
    implements Runnable
{

    final val.items this$1;
    final ArrayList val$items;

    public void run()
    {
        SignupCategoryFragment.access$500(_fld0, val$items);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$items = ArrayList.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/signup/SignupCategoryFragment$9

/* anonymous class */
    class SignupCategoryFragment._cls9
        implements com.contextlogic.wish.api.service.GetSignupCategoriesService.SuccessCallback
    {

        final SignupCategoryFragment this$0;

        public void onServiceSucceeded(ArrayList arraylist)
        {
            postDelayed(arraylist. new SignupCategoryFragment._cls9._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = SignupCategoryFragment.this;
                super();
            }
    }

}
