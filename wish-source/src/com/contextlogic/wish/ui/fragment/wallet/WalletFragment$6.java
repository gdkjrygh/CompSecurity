// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.wallet;


// Referenced classes of package com.contextlogic.wish.ui.fragment.wallet:
//            WalletFragment

class this._cls0
    implements com.contextlogic.wish.api.service.eCallback
{

    final WalletFragment this$0;

    public void onServiceFailed()
    {
        postDelayed(new Runnable() {

            final WalletFragment._cls6 this$1;

            public void run()
            {
                WalletFragment.access$500(this$0);
            }

            
            {
                this$1 = WalletFragment._cls6.this;
                super();
            }
        }, getAnimationTimeRemaining());
    }

    _cls1.this._cls1()
    {
        this$0 = WalletFragment.this;
        super();
    }
}
