// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;


// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        ProfileFragment.access$1800(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/profile/ProfileFragment$14

/* anonymous class */
    class ProfileFragment._cls14
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final ProfileFragment this$0;

        public void onServiceFailed()
        {
            postDelayed(new ProfileFragment._cls14._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }
    }

}
