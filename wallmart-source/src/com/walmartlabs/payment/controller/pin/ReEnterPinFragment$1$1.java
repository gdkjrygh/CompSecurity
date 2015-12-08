// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import com.walmartlabs.ui.CodeView;

// Referenced classes of package com.walmartlabs.payment.controller.pin:
//            ReEnterPinFragment

class this._cls1
    implements Runnable
{

    final backs.onPinNotConfirmed this$1;

    public void run()
    {
        ((backs)ReEnterPinFragment.access$100(_fld0)).onPinNotConfirmed();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/pin/ReEnterPinFragment$1

/* anonymous class */
    class ReEnterPinFragment._cls1
        implements com.walmartlabs.ui.CodeView.OnCodeEnteredListener
    {

        final ReEnterPinFragment this$0;

        public void onCodeEntered(CharSequence charsequence)
        {
            CharSequence charsequence1;
            if (getArguments() != null)
            {
                charsequence1 = getArguments().getCharSequence("EXTRA_PIN");
            } else
            {
                charsequence1 = null;
            }
            if (charsequence1 != null && charsequence.toString().equals(charsequence1.toString()))
            {
                ((ReEnterPinFragment.Callbacks)ReEnterPinFragment.access$000(ReEnterPinFragment.this)).onPinConfirmed(charsequence.toString());
            } else
            {
                ReEnterPinFragment.access$200(ReEnterPinFragment.this).postDelayed(new ReEnterPinFragment._cls1._cls1(), 280L);
                ReEnterPinFragment.access$400(ReEnterPinFragment.this).startAnimation(ReEnterPinFragment.access$300(ReEnterPinFragment.this));
                if (ReEnterPinFragment.access$500(ReEnterPinFragment.this).hasVibrator())
                {
                    ReEnterPinFragment.access$500(ReEnterPinFragment.this).vibrate(280L);
                    return;
                }
            }
        }

            
            {
                this$0 = ReEnterPinFragment.this;
                super();
            }
    }

}
