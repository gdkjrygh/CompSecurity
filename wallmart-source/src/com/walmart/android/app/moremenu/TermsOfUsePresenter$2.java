// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import java.util.List;

// Referenced classes of package com.walmart.android.app.moremenu:
//            TermsOfUsePresenter

class > extends AsyncCallbackOnThread
{

    final TermsOfUsePresenter this$0;

    public void onFailureSameThread(Integer integer, List list)
    {
        if (isPopped())
        {
            return;
        } else
        {
            (new com.walmart.android.ui.dialog.nit>(TermsOfUsePresenter.access$000(TermsOfUsePresenter.this))).tTitle("Network Error").tMessage("No network. Try again later.").tCancelable(true).tPositiveButton("OK", null).ow();
            TermsOfUsePresenter.access$100(TermsOfUsePresenter.this);
            return;
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (List)obj1);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((List)obj);
    }

    public void onSuccessSameThread(List list)
    {
        if (!isPopped())
        {
            TermsOfUsePresenter.access$202(TermsOfUsePresenter.this, list);
            if (TermsOfUsePresenter.access$300(TermsOfUsePresenter.this))
            {
                if (System.currentTimeMillis() - TermsOfUsePresenter.access$400(TermsOfUsePresenter.this) >= 500L)
                {
                    TermsOfUsePresenter.access$500(TermsOfUsePresenter.this);
                    return;
                } else
                {
                    TermsOfUsePresenter.access$600(TermsOfUsePresenter.this, 500L - (System.currentTimeMillis() - TermsOfUsePresenter.access$400(TermsOfUsePresenter.this)));
                    return;
                }
            }
        }
    }

    (Handler handler)
    {
        this$0 = TermsOfUsePresenter.this;
        super(handler);
    }
}
