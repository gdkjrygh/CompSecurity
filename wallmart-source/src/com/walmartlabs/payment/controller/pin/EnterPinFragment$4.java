// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.view.View;
import android.widget.TextView;
import com.walmartlabs.payment.view.OnSingleClickListener;
import com.walmartlabs.ui.CodeView;

// Referenced classes of package com.walmartlabs.payment.controller.pin:
//            EnterPinFragment

class val.codeView extends OnSingleClickListener
{

    final EnterPinFragment this$0;
    final CodeView val$codeView;
    final TextView val$errorView;

    public void onSingleClick(View view)
    {
        val$errorView.setVisibility(4);
        val$codeView.append("2");
    }

    ()
    {
        this$0 = final_enterpinfragment;
        val$errorView = textview;
        val$codeView = CodeView.this;
        super();
    }
}
