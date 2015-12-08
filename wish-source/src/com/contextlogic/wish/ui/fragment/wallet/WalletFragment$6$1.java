// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.wallet;


// Referenced classes of package com.contextlogic.wish.ui.fragment.wallet:
//            WalletFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        WalletFragment.access$500(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/wallet/WalletFragment$6

/* anonymous class */
    class WalletFragment._cls6
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final WalletFragment this$0;

        public void onServiceFailed()
        {
            postDelayed(new WalletFragment._cls6._cls1(), getAnimationTimeRemaining());
        }

            
            {
                this$0 = WalletFragment.this;
                super();
            }
    }

}
