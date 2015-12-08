// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import android.widget.AdapterView;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFeedbackPresenter

class this._cls0
    implements android.widget.dListener
{

    final SaverFeedbackPresenter this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        SaverFeedbackPresenter.access$100(SaverFeedbackPresenter.this).show();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        SaverFeedbackPresenter.access$100(SaverFeedbackPresenter.this).hide();
    }

    ()
    {
        this$0 = SaverFeedbackPresenter.this;
        super();
    }
}
