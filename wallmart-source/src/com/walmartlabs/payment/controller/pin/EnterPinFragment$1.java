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

class val.codeView
    implements com.walmartlabs.ui.redListener
{

    final EnterPinFragment this$0;
    final CodeView val$codeView;
    final TextView val$errorView;

    public void onCodeEntered(CharSequence charsequence)
    {
        if (PinPreferences.comparePin(getActivity(), charsequence.toString(), getArguments().getString("EXTRA_CUSTOMER_ID", "")))
        {
            ((llbacks)EnterPinFragment.access$000(EnterPinFragment.this)).onPinEntered();
            return;
        } else
        {
            val$errorView.setVisibility(0);
            EnterPinFragment.access$300(EnterPinFragment.this).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final EnterPinFragment._cls1 this$1;

                public void onAnimationEnd(Animation animation)
                {
                    EnterPinFragment.access$100(this$0).cancel();
                    codeView.clear();
                    ((EnterPinFragment.Callbacks)EnterPinFragment.access$200(this$0)).onWrongPinEntered();
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    if (EnterPinFragment.access$100(this$0).hasVibrator())
                    {
                        EnterPinFragment.access$100(this$0).vibrate(280L);
                    }
                }

            
            {
                this$1 = EnterPinFragment._cls1.this;
                super();
            }
            });
            val$codeView.startAnimation(EnterPinFragment.access$300(EnterPinFragment.this));
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_enterpinfragment;
        val$errorView = textview;
        val$codeView = CodeView.this;
        super();
    }
}
