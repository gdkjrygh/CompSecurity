// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.push;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings.push:
//            PushNotificationSettingsFragment

class this._cls0
    implements com.contextlogic.wish.api.service.llback
{

    final PushNotificationSettingsFragment this$0;

    public void onServiceSucceeded(final ArrayList preferences)
    {
        postDelayed(new Runnable() {

            final PushNotificationSettingsFragment._cls1 this$1;
            final ArrayList val$preferences;

            public void run()
            {
                PushNotificationSettingsFragment.access$000(this$0, preferences);
            }

            
            {
                this$1 = PushNotificationSettingsFragment._cls1.this;
                preferences = arraylist;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.val.preferences()
    {
        this$0 = PushNotificationSettingsFragment.this;
        super();
    }
}
