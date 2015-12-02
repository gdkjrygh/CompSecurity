// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.widget.ListView;

// Referenced classes of package android.support.v4.app:
//            ListFragment

class this._cls0
    implements Runnable
{

    final ListFragment this$0;

    public void run()
    {
        mList.focusableViewAvailable(mList);
    }

    ()
    {
        this$0 = ListFragment.this;
        super();
    }
}
