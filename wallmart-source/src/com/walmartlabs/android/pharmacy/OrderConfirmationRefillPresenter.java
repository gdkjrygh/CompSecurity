// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.android.pharmacy.service.Cart;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.utils.WLog;
import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationBasePresenter, PharmacyManager, PrescriptionPresenter

public class OrderConfirmationRefillPresenter extends OrderConfirmationBasePresenter
{
    public static interface RefillListener
    {

        public abstract void refill();
    }


    private static final String TAG = com/walmartlabs/android/pharmacy/OrderConfirmationRefillPresenter.getSimpleName();
    private static final SimpleDateFormat sPickupDateEventFormat;
    private Cart mCart;
    private RefillListener mListener;
    private boolean mPageEventSent;

    public OrderConfirmationRefillPresenter(Activity activity, Cart cart, StoreData storedata)
    {
        this(activity, cart, storedata, null);
    }

    public OrderConfirmationRefillPresenter(Activity activity, Cart cart, StoreData storedata, RefillListener refilllistener)
    {
        super(activity, cart.pickupDate, cart.pickupTime, storedata);
        init(cart, refilllistener);
    }

    private com.walmartlabs.android.pharmacy.service.Cart.Guest getRefillGuest()
    {
        if (mCart != null && mCart.guests != null)
        {
            com.walmartlabs.android.pharmacy.service.Cart.Guest aguest[] = mCart.guests;
            int j = aguest.length;
            for (int i = 0; i < j; i++)
            {
                com.walmartlabs.android.pharmacy.service.Cart.Guest guest = aguest[i];
                if (guest.refills != null && guest.refills.length > 0)
                {
                    return guest;
                }
            }

        }
        return null;
    }

    private void init(Cart cart, RefillListener refilllistener)
    {
        mCart = cart;
        mListener = refilllistener;
    }

    protected Presenter getCreateAppAccountPresenter(PharmacyManager.OnFlowCompleted onflowcompleted)
    {
        return PharmacyManager.get().createAppAccount(mActivity, onflowcompleted);
    }

    protected Presenter getLinkAccountPresenter(PharmacyManager.OnFlowCompleted onflowcompleted)
    {
        com.walmartlabs.android.pharmacy.service.Cart.Refill refill = mCart.getRefill();
        if (refill != null)
        {
            return PharmacyManager.get().linkAccount(mActivity, refill.rxNumber, refill.storeNumber, onflowcompleted);
        } else
        {
            return PharmacyManager.get().linkAccount(mActivity, onflowcompleted);
        }
    }

    protected void populateAccountSections(boolean flag, boolean flag1)
    {
        boolean flag3;
        boolean flag4 = true;
        com.walmartlabs.android.pharmacy.service.Cart.Guest guest = getRefillGuest();
        boolean flag2;
        if (guest != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        flag3 = flag4;
        if (flag2)
        {
            if (guest.accountIsLinked || flag)
            {
                break MISSING_BLOCK_LABEL_123;
            }
            flag3 = flag4;
        }
_L1:
        populateCreateAccountSection(flag3, flag);
        if (mRootView != null)
        {
            if (flag2 || !flag)
            {
                ViewUtil.findViewById(mRootView, R.id.pharmacy_order_confirmation_email_advice).setVisibility(8);
            } else
            {
                ViewUtil.findViewById(mRootView, R.id.pharmacy_order_confirmation_email_advice).setVisibility(0);
                if (flag1)
                {
                    obj = (Button)ViewUtil.findViewById(mRootView, R.id.view_history_button);
                    ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                        final OrderConfirmationRefillPresenter this$0;

                        public void onClick(View view)
                        {
                            view = new PharmacyManager.OnFlowCompleted() {

                                final _cls2 this$1;

                                public void onFlowCompleted()
                                {
                                    getPresenterStack().popToRoot();
                                    PrescriptionPresenter prescriptionpresenter = new PrescriptionPresenter(mActivity, true);
                                    pushPresenter(prescriptionpresenter);
                                }

            
            {
                this$1 = _cls2.this;
                super();
            }
                            };
                            PharmacyManager.get().accessPharmacyAuthRequiredFlow(mActivity, getPresenterStack(), view);
                        }

            
            {
                this$0 = OrderConfirmationRefillPresenter.this;
                super();
            }
                    });
                    ((Button) (obj)).setVisibility(0);
                }
            }
        }
        if (!mPageEventSent)
        {
            Object obj;
            if (!flag)
            {
                obj = "Rx:OrderConfirmationNotSignedIn";
            } else
            if (flag1)
            {
                obj = "Rx:OrderConfirmationSignedInandPharmEnabled";
            } else
            {
                obj = "Rx:OrderConfirmationSignedInNotPharmSignedIn";
            }
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", ((String) (obj))));
        }
        return;
        flag3 = false;
          goto _L1
    }

    protected void populateView(View view)
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmacyOrderConfirmation");
        com.walmartlabs.android.pharmacy.service.Cart.Refill refill = mCart.getRefill();
        if (mPickupDate > 0L && refill != null)
        {
            if (refill.numOfRemainingReFills != 0)
            {
                String s = mActivity.getString(R.string.pharmacy_pickup_date, new Object[] {
                    sTimeFormat.format(Long.valueOf(mPickupDate)), sDateFormat.format(Long.valueOf(mPickupDate))
                });
                ViewUtil.setText(R.id.pickup_date, view, s);
            } else
            {
                ViewUtil.findViewById(view, R.id.pickup_date).setVisibility(8);
                ViewUtil.findViewById(view, R.id.pharmacy_order_confirmation_ready_by_text).setVisibility(8);
                ViewUtil.setTextHtml(R.id.pharmacy_order_confirmation_instructional_text, view, R.string.pharmacy_order_confirmation_norefill_pickup_instructions, new Object[] {
                    sTimeFormat.format(Long.valueOf(mPickupDate)), sDateFormat.format(Long.valueOf(mPickupDate))
                });
                ViewUtil.findViewById(view, R.id.pharmacy_order_confirmation_instructional_text).setVisibility(0);
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Rx:NoRefillsLeft"));
                mPageEventSent = true;
            }
            builder.putString("pickupDate", sPickupDateEventFormat.format(Long.valueOf(mPickupDate)));
        }
        ((Button)ViewUtil.findViewById(view, R.id.refill_another_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final OrderConfirmationRefillPresenter this$0;

            public void onClick(View view1)
            {
                pop();
                if (mListener != null)
                {
                    mListener.refill();
                    mListener = null;
                }
            }

            
            {
                this$0 = OrderConfirmationRefillPresenter.this;
                super();
            }
        });
        if (mPickupStore != null)
        {
            try
            {
                builder.putInt("storeId", Integer.valueOf(mPickupStore.getId()).intValue());
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                WLog.e(TAG, "Failed to parse store id", view);
            }
        }
        MessageBus.getBus().post(builder.putInt("pharmOrderUnitCount", 1));
    }

    static 
    {
        sPickupDateEventFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    }




/*
    static RefillListener access$102(OrderConfirmationRefillPresenter orderconfirmationrefillpresenter, RefillListener refilllistener)
    {
        orderconfirmationrefillpresenter.mListener = refilllistener;
        return refilllistener;
    }

*/

}
