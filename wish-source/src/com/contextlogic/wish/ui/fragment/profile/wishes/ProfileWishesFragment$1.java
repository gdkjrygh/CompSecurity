// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.wishes;


// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.wishes:
//            ProfileWishesFragment

class this._cls0
    implements Runnable
{

    final ProfileWishesFragment this$0;

    public void run()
    {
        queueVisibleTask(new Runnable() {

            final ProfileWishesFragment._cls1 this$1;

            public void run()
            {
                ProfileWishesFragment.access$000(this$0);
            }

            
            {
                this$1 = ProfileWishesFragment._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = ProfileWishesFragment.this;
        super();
    }
}
