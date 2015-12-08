// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.push;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings.push:
//            PushNotificationSettingsFragment

class val.preferences
    implements Runnable
{

    final val.preferences this$1;
    final ArrayList val$preferences;

    public void run()
    {
        PushNotificationSettingsFragment.access$000(_fld0, val$preferences);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$preferences = ArrayList.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/settings/push/PushNotificationSettingsFragment$1

/* anonymous class */
    class PushNotificationSettingsFragment._cls1
        implements com.contextlogic.wish.api.service.GetPushPreferencesService.SuccessCallback
    {

        final PushNotificationSettingsFragment this$0;

        public void onServiceSucceeded(ArrayList arraylist)
        {
            postDelayed(arraylist. new PushNotificationSettingsFragment._cls1._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = PushNotificationSettingsFragment.this;
                super();
            }
    }

}
