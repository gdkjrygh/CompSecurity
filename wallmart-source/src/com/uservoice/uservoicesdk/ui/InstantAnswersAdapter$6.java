// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import com.uservoice.uservoicesdk.deflection.Deflection;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback, InstantAnswersAdapter

class this._cls0 extends DefaultCallback
{

    final InstantAnswersAdapter this$0;

    public volatile void onModel(Object obj)
    {
        onModel((List)obj);
    }

    public void onModel(List list)
    {
        Deflection.trackSearchDeflection(list);
        instantAnswers = list;
        if (instantAnswers.isEmpty())
        {
            state = ate.DETAILS;
        } else
        {
            state = ate.INSTANT_ANSWERS;
        }
        notifyDataSetChanged();
    }

    ate(Context context)
    {
        this$0 = InstantAnswersAdapter.this;
        super(context);
    }
}
