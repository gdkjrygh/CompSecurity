// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivitySearchSuggestionsAdapter

class val.doneSignal
    implements com.contextlogic.wish.api.service.er._cls1
{

    final RootActivitySearchSuggestionsAdapter this$0;
    final CountDownLatch val$doneSignal;
    final ArrayList val$resultList;

    public void onServiceSucceeded(ArrayList arraylist, int i, int j, WishFeedEndedButtonSpec wishfeedendedbuttonspec, String s)
    {
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            wishfeedendedbuttonspec = ((WishFeedEndedButtonSpec) (arraylist.next()));
            if (wishfeedendedbuttonspec instanceof WishProduct)
            {
                val$resultList.add((WishProduct)wishfeedendedbuttonspec);
            }
        } while (true);
        val$resultList.add(Integer.valueOf(i));
        val$doneSignal.countDown();
    }

    ()
    {
        this$0 = final_rootactivitysearchsuggestionsadapter;
        val$resultList = arraylist;
        val$doneSignal = CountDownLatch.this;
        super();
    }
}
