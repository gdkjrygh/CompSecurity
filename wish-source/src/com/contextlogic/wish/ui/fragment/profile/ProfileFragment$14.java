// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;


// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls0
    implements com.contextlogic.wish.api.service.allback
{

    final ProfileFragment this$0;

    public void onServiceFailed()
    {
        postDelayed(new Runnable() {

            final ProfileFragment._cls14 this$1;

            public void run()
            {
                ProfileFragment.access$1800(this$0);
            }

            
            {
                this$1 = ProfileFragment._cls14.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = ProfileFragment.this;
        super();
    }
}
