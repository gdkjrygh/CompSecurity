// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.push;


// Referenced classes of package com.contextlogic.wish.ui.fragment.settings.push:
//            PushNotificationSettingsFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        PushNotificationSettingsFragment.access$100(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/settings/push/PushNotificationSettingsFragment$2

/* anonymous class */
    class PushNotificationSettingsFragment._cls2
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final PushNotificationSettingsFragment this$0;

        public void onServiceFailed()
        {
            postDelayed(new PushNotificationSettingsFragment._cls2._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = PushNotificationSettingsFragment.this;
                super();
            }
    }

}
