// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.api.service.GetUserStatusService;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupUpdateProfileFragment

class this._cls2
    implements Runnable
{

    final ._cls0 this$2;

    public void run()
    {
        SignupUpdateProfileFragment.access$400(_fld0);
        SignupUpdateProfileFragment.access$500(_fld0);
        SignupUpdateProfileFragment.access$300(_fld0);
    }

    ._cls0()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/signup/SignupUpdateProfileFragment$5

/* anonymous class */
    class SignupUpdateProfileFragment._cls5
        implements com.contextlogic.wish.api.service.UpdateProfileService.SuccessCallback
    {

        final SignupUpdateProfileFragment this$0;

        public void onServiceSucceeded()
        {
            LoggedInUser.getInstance().refreshProfile();
            SignupUpdateProfileFragment.access$600(SignupUpdateProfileFragment.this).requestService(false, new SignupUpdateProfileFragment._cls5._cls1(), new SignupUpdateProfileFragment._cls5._cls2());
        }

            
            {
                this$0 = SignupUpdateProfileFragment.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/signup/SignupUpdateProfileFragment$5$2

/* anonymous class */
        class SignupUpdateProfileFragment._cls5._cls2
            implements com.contextlogic.wish.api.service.ApiService.FailureCallback
        {

            final SignupUpdateProfileFragment._cls5 this$1;

            public void onServiceFailed()
            {
                SignupUpdateProfileFragment.access$400(this$0);
                SignupUpdateProfileFragment.access$500(this$0);
                SignupUpdateProfileFragment.access$300(this$0);
            }

                    
                    {
                        this$1 = SignupUpdateProfileFragment._cls5.this;
                        super();
                    }
        }

    }


    // Unreferenced inner class com/contextlogic/wish/ui/fragment/signup/SignupUpdateProfileFragment$5$1

/* anonymous class */
    class SignupUpdateProfileFragment._cls5._cls1
        implements com.contextlogic.wish.api.service.GetUserStatusService.SuccessCallback
    {

        final SignupUpdateProfileFragment._cls5 this$1;

        public void onServiceSucceeded()
        {
            postDelayed(new SignupUpdateProfileFragment._cls5._cls1._cls1(), 0L);
        }

            
            {
                this$1 = SignupUpdateProfileFragment._cls5.this;
                super();
            }
    }

}
