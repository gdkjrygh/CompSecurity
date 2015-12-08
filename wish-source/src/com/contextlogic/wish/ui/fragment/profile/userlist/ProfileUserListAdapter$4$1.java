// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.userlist;

import android.content.DialogInterface;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.api.service.UnfollowService;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.userlist:
//            ProfileUserListAdapter, ProfileUserListFragment

class this._cls1
    implements com.contextlogic.wish.api.service.back
{

    final eshFollowButtonStates this$1;

    public void onServiceSucceeded()
    {
        refreshFollowButtonStates();
    }

    l.user()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/profile/userlist/ProfileUserListAdapter$4

/* anonymous class */
    class ProfileUserListAdapter._cls4
        implements android.content.DialogInterface.OnClickListener
    {

        final ProfileUserListAdapter this$0;
        final WishUser val$user;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            ProfileUserListAdapter.access$200(ProfileUserListAdapter.this).trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Unfollow);
            ProfileUserListAdapter.access$200(ProfileUserListAdapter.this).unfollowService.requestService(user.getUserId(), new ProfileUserListAdapter._cls4._cls1(), new ProfileUserListAdapter._cls4._cls2());
            refreshFollowButtonStates();
        }

            
            {
                this$0 = final_profileuserlistadapter;
                user = WishUser.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/profile/userlist/ProfileUserListAdapter$4$2

/* anonymous class */
        class ProfileUserListAdapter._cls4._cls2
            implements com.contextlogic.wish.api.service.ApiService.FailureCallback
        {

            final ProfileUserListAdapter._cls4 this$1;

            public void onServiceFailed()
            {
                refreshFollowButtonStates();
            }

                    
                    {
                        this$1 = ProfileUserListAdapter._cls4.this;
                        super();
                    }
        }

    }

}
