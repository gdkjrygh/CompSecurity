// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;


// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupCategoryFragment

class this._cls0
    implements com.contextlogic.wish.api.service.
{

    final SignupCategoryFragment this$0;

    public void onServiceFailed()
    {
        postDelayed(new Runnable() {

            final SignupCategoryFragment._cls10 this$1;

            public void run()
            {
                SignupCategoryFragment.access$600(this$0);
            }

            
            {
                this$1 = SignupCategoryFragment._cls10.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = SignupCategoryFragment.this;
        super();
    }
}
