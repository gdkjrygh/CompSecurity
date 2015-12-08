// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.push;


// Referenced classes of package com.contextlogic.wish.ui.fragment.settings.push:
//            PushNotificationSettingsFragment

class this._cls0
    implements com.contextlogic.wish.api.service.ngsFragment._cls2
{

    final PushNotificationSettingsFragment this$0;

    public void onServiceFailed()
    {
        postDelayed(new Runnable() {

            final PushNotificationSettingsFragment._cls2 this$1;

            public void run()
            {
                PushNotificationSettingsFragment.access$100(this$0);
            }

            
            {
                this$1 = PushNotificationSettingsFragment._cls2.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = PushNotificationSettingsFragment.this;
        super();
    }
}
