// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.DialogInterface;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            TermsConditionsFragment

class this._cls1
    implements android.content.ner
{

    final this._cls1 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/mpay/TermsConditionsFragment$1

/* anonymous class */
    class TermsConditionsFragment._cls1
        implements android.view.View.OnClickListener
    {

        final TermsConditionsFragment this$0;

        public void onClick(View view)
        {
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mobilePayTC")).putString("name", "cancel"));
            (new com.walmart.android.ui.CustomAlertDialog.Builder(getActivity())).setTitle(com.walmartlabs.android.payment.R.string.mpay_tc_title).setMessage(com.walmartlabs.android.payment.R.string.mpay_setup_tc_dlg_msg).setPositiveButton(0x104000a, new TermsConditionsFragment._cls1._cls1()).show();
        }

            
            {
                this$0 = TermsConditionsFragment.this;
                super();
            }
    }

}
