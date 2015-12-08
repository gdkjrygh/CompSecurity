// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import android.content.DialogInterface;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.UnfollowService;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls1
    implements com.contextlogic.wish.api.service.ssCallback
{

    final is._cls0 this$1;

    public void onServiceSucceeded()
    {
        ProfileFragment.access$2100(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/profile/ProfileFragment$25

/* anonymous class */
    class ProfileFragment._cls25
        implements android.content.DialogInterface.OnClickListener
    {

        final ProfileFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Unfollow);
            ProfileFragment.access$2200(ProfileFragment.this).requestService(ProfileFragment.access$000(ProfileFragment.this).getUserId(), new ProfileFragment._cls25._cls1(), new ProfileFragment._cls25._cls2());
            ProfileFragment.access$2100(ProfileFragment.this);
        }

            
            {
                this$0 = ProfileFragment.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/profile/ProfileFragment$25$2

/* anonymous class */
        class ProfileFragment._cls25._cls2
            implements com.contextlogic.wish.api.service.ApiService.FailureCallback
        {

            final ProfileFragment._cls25 this$1;

            public void onServiceFailed()
            {
                ProfileFragment.access$2100(this$0);
            }

                    
                    {
                        this$1 = ProfileFragment._cls25.this;
                        super();
                    }
        }

    }

}
