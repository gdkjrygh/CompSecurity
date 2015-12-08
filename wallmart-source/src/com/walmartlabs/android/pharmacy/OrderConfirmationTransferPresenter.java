// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.data.TransferRxData;
import java.text.SimpleDateFormat;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationBasePresenter, PharmacyManager

public class OrderConfirmationTransferPresenter extends OrderConfirmationBasePresenter
{

    private TransferRxData mTransferData;

    public OrderConfirmationTransferPresenter(Activity activity, TransferRxData transferrxdata)
    {
        super(activity, transferrxdata.pickupDate, transferrxdata.pickupTime, transferrxdata.pickupStoreData);
        mTransferData = transferrxdata;
    }

    protected Presenter getCreateAppAccountPresenter(PharmacyManager.OnFlowCompleted onflowcompleted)
    {
        return PharmacyManager.get().createAppAccount(mActivity, mTransferData.patientInfo.firstName, mTransferData.patientInfo.lastName, mTransferData.patientInfo.emailAddress, onflowcompleted);
    }

    protected Presenter getLinkAccountPresenter(PharmacyManager.OnFlowCompleted onflowcompleted)
    {
        return PharmacyManager.get().linkAccount(mActivity, onflowcompleted);
    }

    public String getScreenName()
    {
        return "Rx:TransferredPrescription";
    }

    protected void populateView(View view)
    {
        ViewUtil.hideKeyboard(view);
        ViewUtil.findViewById(view, R.id.pharmacy_order_confirmation_ready_by_text).setVisibility(8);
        ViewUtil.findViewById(view, R.id.pickup_date).setVisibility(8);
        ViewUtil.findViewById(view, R.id.pharmacy_order_confirmation_email_advice).setVisibility(0);
        if (mPickupDate > 0L)
        {
            ViewUtil.setTextHtml(R.id.pharmacy_order_confirmation_instructional_text, view, R.string.pharmacy_order_confirmation_transfer_pickup_instructions, new Object[] {
                sTimeFormat.format(Long.valueOf(mPickupDate)), sDateFormat.format(Long.valueOf(mPickupDate))
            });
            ViewUtil.findViewById(view, R.id.pharmacy_order_confirmation_instructional_text).setVisibility(0);
        }
        view = (Button)ViewUtil.findViewById(view, R.id.refill_another_button);
        view.setText(R.string.pharmacy_order_confirmation_done_button);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final OrderConfirmationTransferPresenter this$0;

            public void onClick(View view1)
            {
                popToRoot();
            }

            
            {
                this$0 = OrderConfirmationTransferPresenter.this;
                super();
            }
        });
    }

}
