// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.util.Log;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.android.pharmacy.data.ValidatedCart;
import com.walmartlabs.android.pharmacy.service.Cart;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            AddRefillToCartHelper, PharmacyResponse, PharmacyManager

class this._cls1
    implements android.content.tener
{

    final dateDob this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        DialogFactory.showDobDialog(AddRefillToCartHelper.access$800(_fld0), new com.walmartlabs.android.pharmacy.ui.DialogFactory.DobDialogListener() {

            final AddRefillToCartHelper._cls3._cls1 this$2;

            public void onCancel()
            {
                AddRefillToCartHelper.access$900(this$0);
                AddRefillToCartHelper.access$000(this$0).onCancel();
            }

            public void onDateEntered(String s)
            {
                validateDob(s);
            }

            
            {
                this$2 = AddRefillToCartHelper._cls3._cls1.this;
                super();
            }
        });
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/android/pharmacy/AddRefillToCartHelper$3

/* anonymous class */
    class AddRefillToCartHelper._cls3 extends AsyncCallbackOnThread
    {

        final AddRefillToCartHelper this$0;

        public void handleServerResponse(PharmacyResponse pharmacyresponse)
        {
            AddRefillToCartHelper.access$100(AddRefillToCartHelper.this).dismiss();
            if (!AddRefillToCartHelper.access$200(AddRefillToCartHelper.this)) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Object obj;
            if (pharmacyresponse == null)
            {
                break MISSING_BLOCK_LABEL_433;
            }
            obj = null;
            pharmacyresponse.status;
            JVM INSTR lookupswitch 5: default 80
        //                       1: 340
        //                       1001: 260
        //                       1002: 294
        //                       1008: 184
        //                       1072: 222;
               goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
            Log.w(AddRefillToCartHelper.access$1000(), (new StringBuilder()).append("Unknown error code received: ").append(pharmacyresponse.status).append(" with message: ").append(pharmacyresponse.message).toString());
            AddRefillToCartHelper.access$1100(AddRefillToCartHelper.this).show();
            PharmacyManager.get().deleteRefillFromCartSilent(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
            pharmacyresponse = obj;
_L9:
            if (pharmacyresponse != null)
            {
                Bus bus = MessageBus.getBus();
                if (pharmacyresponse.booleanValue())
                {
                    pharmacyresponse = "successDob";
                } else
                {
                    pharmacyresponse = "wrongDob";
                }
                bus.post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder(pharmacyresponse));
                return;
            }
            if (true) goto _L1; else goto _L7
_L7:
            AddRefillToCartHelper.access$300(AddRefillToCartHelper.this).show();
            PharmacyManager.get().deleteRefillFromCartSilent(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
            pharmacyresponse = Boolean.valueOf(true);
              goto _L9
_L8:
            AddRefillToCartHelper.access$500(AddRefillToCartHelper.this).show();
            PharmacyManager.get().deleteRefillFromCartSilent(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
            pharmacyresponse = Boolean.valueOf(true);
              goto _L9
_L5:
            DialogFactory.showInvalidDobDialog(AddRefillToCartHelper.access$800(AddRefillToCartHelper.this), new AddRefillToCartHelper._cls3._cls1(), new AddRefillToCartHelper._cls3._cls2());
            pharmacyresponse = Boolean.valueOf(false);
              goto _L9
_L6:
            DialogFactory.showCoolDownDialog(AddRefillToCartHelper.access$800(AddRefillToCartHelper.this), ((ValidatedCart)pharmacyresponse.data).dobVerificationAttempted, ((ValidatedCart)pharmacyresponse.data).coolDownTimeInSeconds, new AddRefillToCartHelper._cls3._cls3());
            pharmacyresponse = Boolean.valueOf(false);
              goto _L9
_L4:
            if (((ValidatedCart)pharmacyresponse.data).canBeRefilled(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this)))
            {
                AddRefillToCartHelper.access$000(AddRefillToCartHelper.this).onRefillAdded((Cart)pharmacyresponse.data);
            } else
            {
                AddRefillToCartHelper.access$500(AddRefillToCartHelper.this).show();
                PharmacyManager.get().deleteRefillFromCartSilent(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
            }
            pharmacyresponse = Boolean.valueOf(true);
              goto _L9
            AddRefillToCartHelper.access$1100(AddRefillToCartHelper.this).show();
            PharmacyManager.get().deleteRefillFromCartSilent(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
            return;
        }

        public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
        {
            handleServerResponse(pharmacyresponse);
        }

        public volatile void onFailureSameThread(Object obj, Object obj1)
        {
            onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
        }

        public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
        {
            handleServerResponse(pharmacyresponse);
        }

        public volatile void onSuccessSameThread(Object obj)
        {
            onSuccessSameThread((PharmacyResponse)obj);
        }

            
            {
                this$0 = AddRefillToCartHelper.this;
                super(handler);
            }

        // Unreferenced inner class com/walmartlabs/android/pharmacy/AddRefillToCartHelper$3$2

/* anonymous class */
        class AddRefillToCartHelper._cls3._cls2
            implements android.content.DialogInterface.OnCancelListener
        {

            final AddRefillToCartHelper._cls3 this$1;

            public void onCancel(DialogInterface dialoginterface)
            {
                AddRefillToCartHelper.access$900(this$0);
                AddRefillToCartHelper.access$000(this$0).onCancel();
            }

                    
                    {
                        this$1 = AddRefillToCartHelper._cls3.this;
                        super();
                    }
        }


        // Unreferenced inner class com/walmartlabs/android/pharmacy/AddRefillToCartHelper$3$3

/* anonymous class */
        class AddRefillToCartHelper._cls3._cls3
            implements android.content.DialogInterface.OnClickListener
        {

            final AddRefillToCartHelper._cls3 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                AddRefillToCartHelper.access$900(this$0);
                AddRefillToCartHelper.access$000(this$0).onCoolDown();
            }

                    
                    {
                        this$1 = AddRefillToCartHelper._cls3.this;
                        super();
                    }
        }

    }

}
