// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.content.res.Resources;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import java.util.Timer;

// Referenced classes of package com.contextlogic.wish.ui.fragment.dealdash:
//            DealDashView

class this._cls0
    implements com.contextlogic.wish.api.service.vice.FailureCallback
{

    final DealDashView this$0;

    public void onServiceFailed(String s)
    {
        PopupAlertDialog.showError(getContext(), getResources().getString(0x7f0602c5), getResources().getString(0x7f0602c4));
        DealDashView.access$1300(DealDashView.this).cancel();
        DealDashView.access$1402(DealDashView.this, 0);
        DealDashView.access$1200(DealDashView.this);
        changeState(com.contextlogic.wish.api.data.o.PAGE.ACCESS_GRANTED);
    }

    ()
    {
        this$0 = DealDashView.this;
        super();
    }
}
