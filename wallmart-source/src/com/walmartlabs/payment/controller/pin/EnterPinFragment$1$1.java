// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.animation.Animation;
import android.widget.TextView;
import com.walmartlabs.payment.service.pin.PinPreferences;
import com.walmartlabs.ui.CodeView;

// Referenced classes of package com.walmartlabs.payment.controller.pin:
//            EnterPinFragment

class this._cls1
    implements android.view.animation.stener
{

    final is._cls0 this$1;

    public void onAnimationEnd(Animation animation)
    {
        EnterPinFragment.access$100(_fld0).cancel();
        codeView.clear();
        ((backs)EnterPinFragment.access$200(_fld0)).onWrongPinEntered();
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        if (EnterPinFragment.access$100(_fld0).hasVibrator())
        {
            EnterPinFragment.access$100(_fld0).vibrate(280L);
        }
    }

    l.codeView()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/pin/EnterPinFragment$1

/* anonymous class */
    class EnterPinFragment._cls1
        implements com.walmartlabs.ui.CodeView.OnCodeEnteredListener
    {

        final EnterPinFragment this$0;
        final CodeView val$codeView;
        final TextView val$errorView;

        public void onCodeEntered(CharSequence charsequence)
        {
            if (PinPreferences.comparePin(getActivity(), charsequence.toString(), getArguments().getString("EXTRA_CUSTOMER_ID", "")))
            {
                ((EnterPinFragment.Callbacks)EnterPinFragment.access$000(EnterPinFragment.this)).onPinEntered();
                return;
            } else
            {
                errorView.setVisibility(0);
                EnterPinFragment.access$300(EnterPinFragment.this).setAnimationListener(new EnterPinFragment._cls1._cls1());
                codeView.startAnimation(EnterPinFragment.access$300(EnterPinFragment.this));
                return;
            }
        }

            
            {
                this$0 = final_enterpinfragment;
                errorView = textview;
                codeView = CodeView.this;
                super();
            }
    }

}
