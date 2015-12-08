// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import com.contextlogic.wish.api.service.GetUserStatusService;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupUpdateProfileFragment

class this._cls0
    implements com.contextlogic.wish.api.service.llback
{

    final SignupUpdateProfileFragment this$0;

    public void onServiceSucceeded()
    {
        LoggedInUser.getInstance().refreshProfile();
        SignupUpdateProfileFragment.access$600(SignupUpdateProfileFragment.this).requestService(false, new com.contextlogic.wish.api.service.GetUserStatusService.SuccessCallback() {

            final SignupUpdateProfileFragment._cls5 this$1;

            public void onServiceSucceeded()
            {
                postDelayed(new Runnable() {

                    final _cls1 this$2;

                    public void run()
                    {
                        SignupUpdateProfileFragment.access$400(this$0);
                        SignupUpdateProfileFragment.access$500(this$0);
                        SignupUpdateProfileFragment.access$300(this$0);
                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                }, 0L);
            }

            
            {
                this$1 = SignupUpdateProfileFragment._cls5.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

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
        });
    }

    _cls2.this._cls1()
    {
        this$0 = SignupUpdateProfileFragment.this;
        super();
    }
}
