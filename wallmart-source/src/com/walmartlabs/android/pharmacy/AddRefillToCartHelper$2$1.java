// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Dialog;
import android.os.Handler;
import android.util.Log;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.android.pharmacy.service.Cart;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            AddRefillToCartHelper, PharmacyResponse, PharmacyManager

class this._cls1
    implements com.walmartlabs.android.pharmacy.ui.tener
{

    final dateDob this$1;

    public void onCancel()
    {
        AddRefillToCartHelper.access$900(_fld0);
        AddRefillToCartHelper.access$000(_fld0).onCancel();
    }

    public void onDateEntered(String s)
    {
        validateDob(s);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/android/pharmacy/AddRefillToCartHelper$2

/* anonymous class */
    class AddRefillToCartHelper._cls2 extends AsyncCallbackOnThread
    {

        final AddRefillToCartHelper this$0;

        public void handleServerResponse(PharmacyResponse pharmacyresponse)
        {
            AddRefillToCartHelper.access$100(AddRefillToCartHelper.this).dismiss();
            if (AddRefillToCartHelper.access$200(AddRefillToCartHelper.this))
            {
                return;
            }
            if (pharmacyresponse != null)
            {
                Cart cart;
                int i;
                switch (pharmacyresponse.status)
                {
                default:
                    Log.w(AddRefillToCartHelper.access$1000(), (new StringBuilder()).append("Unknown error code received: ").append(pharmacyresponse.status).append(" with message: ").append(pharmacyresponse.message).toString());
                    AddRefillToCartHelper.access$1100(AddRefillToCartHelper.this).show();
                    PharmacyManager.get().deleteRefillFromCartSilent(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
                    return;

                case 1008: 
                    AddRefillToCartHelper.access$300(AddRefillToCartHelper.this).show();
                    return;

                case 1071: 
                    AddRefillToCartHelper.access$400(AddRefillToCartHelper.this);
                    return;

                case 1073: 
                case 1074: 
                    AddRefillToCartHelper.access$400(AddRefillToCartHelper.this);
                    return;

                case 1072: 
                    AddRefillToCartHelper.access$500(AddRefillToCartHelper.this).show();
                    return;

                case 1: // '\001'
                    cart = (Cart)pharmacyresponse.data;
                    i = cart.getStatus(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
                    break;
                }
                if (i == 0 || i == 1)
                {
                    if (cart.canBeRefilled(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this)))
                    {
                        AddRefillToCartHelper.access$000(AddRefillToCartHelper.this).onRefillAdded((Cart)pharmacyresponse.data);
                        return;
                    } else
                    {
                        AddRefillToCartHelper.access$500(AddRefillToCartHelper.this).show();
                        PharmacyManager.get().deleteRefillFromCartSilent(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
                        return;
                    }
                }
                if (i == 2)
                {
                    DialogFactory.showDobDialog(AddRefillToCartHelper.access$800(AddRefillToCartHelper.this), new AddRefillToCartHelper._cls2._cls1());
                    return;
                } else
                {
                    AddRefillToCartHelper.access$300(AddRefillToCartHelper.this).show();
                    PharmacyManager.get().deleteRefillFromCartSilent(AddRefillToCartHelper.access$600(AddRefillToCartHelper.this), AddRefillToCartHelper.access$700(AddRefillToCartHelper.this));
                    return;
                }
            } else
            {
                AddRefillToCartHelper.access$1100(AddRefillToCartHelper.this).show();
                return;
            }
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
    }

}
