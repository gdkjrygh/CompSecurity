// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.squareup.otto.Bus;
import com.walmart.android.app.ereceipt.EReceiptReturnActivity;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.app.shop.SimpleItemDetailsPresenter;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.SaverUtils;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.TextUtils;
import com.walmart.android.utils.UrlUtils;
import com.walmartlabs.ereceipt.EReceiptNotificationUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFragment, SaverCelebrationActivity, SaverReceiptListPresenter, SaverReceiptDetailsPresenter, 
//            SaverNotificationUtils, SaverFAQPresenter, SaverFeedbackConfirmationPresenter, SaverGettingResultsPresenter, 
//            SaverReceiptItemComparisonPresenter, SaverReceiptImageActivity, SaverNearbyCompetitorsPresenter, SaverFeedbackPresenter

public class SaverReceiptFragment extends SaverFragment
{
    private class FeedbackCallbacks
        implements SaverFeedbackPresenter.ActionCallbacks
    {

        final SaverReceiptFragment this$0;

        public void onEligibilityLinkClicked()
        {
            SaverFAQPresenter saverfaqpresenter = new SaverFAQPresenter(getActivity(), "faq", "itemEligibility");
            .pushPresenter(saverfaqpresenter, true);
        }

        public void onFeedbackSubmitted()
        {
            .pushAndReplacePresenter(new SaverFeedbackConfirmationPresenter(getActivity()), true);
        }

        private FeedbackCallbacks()
        {
            this$0 = SaverReceiptFragment.this;
            super();
        }

    }

    private class NearbyCompetitorsCallback
        implements SaverNearbyCompetitorsPresenter.ActionCallbacks
    {

        private final SaverReceiptListPresenter mListPresenter;
        final SaverReceiptFragment this$0;

        public void onForceClose()
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                
// JavaClassFileOutputException: get_constant: invalid tag

        public void onGettingResults()
        {
            
// JavaClassFileOutputException: get_constant: invalid tag

        public void onScanAnother()
        {
        }

        public void onShowMerchandise(String s)
        {
            NavigationItemUtils.launchFromUri(getActivity(), s);
        }

        public void onShowReceipt(String s, String s1, String s2, String s3, boolean flag)
        {
            if (mListPresenter != null)
            {
                s = new SaverReceiptDetailsPresenter(getActivity(), s, new ReceiptDetailsCallbacks(mListPresenter));
                
// JavaClassFileOutputException: get_constant: invalid tag

        private NearbyCompetitorsCallback(SaverReceiptListPresenter saverreceiptlistpresenter)
        {
            this$0 = SaverReceiptFragment.this;
            super();
            mListPresenter = saverreceiptlistpresenter;
        }

    }

    private class ReceiptDetailsCallbacks
        implements SaverReceiptDetailsPresenter.ActionCallbacks
    {

        private final SaverReceiptListPresenter mListPresenter;
        final SaverReceiptFragment this$0;

        private String createImageUrl(com.walmart.android.service.saver.SaverReceipt.Item item)
        {
            String s = item.productImageUrl;
            if (item.hasProductImageUrl())
            {
                s = UrlUtils.getURLFromThumbnailURL(UrlUtils.IMAGE_SIZE_300, item.productImageUrl);
            }
            return s;
        }

        private Presenter createPresenter(final SaverReceipt receipt, com.walmart.android.service.saver.SaverReceipt.Item item, boolean flag)
        {
            if (!item.hasProductId() || flag)
            {
                android.text.Spanned spanned = item.getDisplayName();
                String s = null;
                String s1;
                final String imageUrl;
                Bitmap bitmap;
                if ("lb".equalsIgnoreCase(item.unitType))
                {
                    s = getActivity().getString(0x7f0900cb, new Object[] {
                        Float.valueOf(item.quantity), Integer.valueOf(item.unitQuantity)
                    });
                    s1 = getActivity().getString(0x7f0900fc, new Object[] {
                        Float.valueOf(item.getUnitPriceInDollar())
                    });
                } else
                if (item.quantity > 0.0F && item.unitType == null)
                {
                    s = getActivity().getString(0x7f0900d8, new Object[] {
                        Integer.valueOf((int)item.quantity), Integer.valueOf(item.unitQuantity)
                    });
                    s1 = getActivity().getString(0x7f0900fc, new Object[] {
                        Float.valueOf(item.getUnitPriceInDollar())
                    });
                } else
                {
                    s1 = getActivity().getString(0x7f0900fc, new Object[] {
                        Float.valueOf(item.getPriceInDollar())
                    });
                }
                imageUrl = createImageUrl(item);
                bitmap = BitmapFactory.decodeResource(getActivity().getResources(), 0x7f02021b);
                if (flag)
                {
                    item = new SaverReceiptItemComparisonPresenter(getActivity(), item, spanned, imageUrl);
                    item.setDefaultImage(Bitmap.createScaledBitmap(bitmap, 100, 100, true));
                    item.setActionCallbacks(s1. new SaverReceiptItemComparisonPresenter.ActionCallbacks() {

                        final ReceiptDetailsCallbacks this$1;
                        final String val$imageUrl;
                        final SaverReceipt val$receipt;
                        final String val$receiptPrice;

                        public void onShowFeedback(com.walmart.android.service.saver.SaverReceipt.Item item)
                        {
                            PresenterStack presenterstack = 
// JavaClassFileOutputException: get_constant: invalid tag

                        public void onShowItemDetails(com.walmart.android.service.saver.SaverReceipt.Item item)
                        {
                            
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$1 = final_receiptdetailscallbacks;
                receipt = saverreceipt;
                imageUrl = s;
                receiptPrice = String.this;
                super();
            }
                    });
                    return item;
                } else
                {
                    receipt = new SimpleItemDetailsPresenter(getActivity());
                    receipt.setDefaultImage(Bitmap.createScaledBitmap(bitmap, 300, 300, true));
                    receipt.init(spanned, item.upc, imageUrl, s, s1, null, null, null);
                    sendItemDetailsEvent();
                    return receipt;
                }
            } else
            {
                receipt = new ItemDetailsPresenter(getActivity(), item.productId);
                sendItemDetailsEvent();
                return receipt;
            }
        }

        private void sendItemDetailsEvent()
        {
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new Builder("pageView")).putString("name", "Item details").putString("section", "Saver").putString("subCategory", "Savings Catcher");
            MessageBus.getBus().post(builder);
        }

        public void launchReceiptImage(String s)
        {
            Intent intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverReceiptImageActivity);
            intent.putExtra("EXTRA_ERECEIPT_UUID", s);
            startActivity(intent);
        }

        public void launchReceiptItem(SaverReceipt saverreceipt, com.walmart.android.service.saver.SaverReceipt.Item item)
        {
            boolean flag;
            if (com.walmart.android.service.saver.SaverContract.SaverState.isProcessed(saverreceipt.state) && item.itemId != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            saverreceipt = createPresenter(saverreceipt, item, flag);
            productImageUrl.pushPresenter(saverreceipt, true);
        }

        public void launchReturn(String s)
        {
            Intent intent = new Intent(getActivity(), com/walmart/android/app/ereceipt/EReceiptReturnActivity);
            intent.putExtra("tcnumber", s);
            startActivity(intent);
        }

        public void launchSignIn()
        {
            startActivityForResult(SaverUtils.createSignInIntent(getActivity()), 1);
            getActivity().overridePendingTransition(0x7f05002c, 0x7f050033);
        }

        public void moveTo(int i)
        {
            mListPresenter.moveTo(i);
        }

        public void onShowCompetitors(String s, String s1, String s2, String s3)
        {
            productImageUrl.pushPresenter(new SaverNearbyCompetitorsPresenter(getActivity(), s, s3, s1, s2, false, new NearbyCompetitorsCallback(null)), true);
        }

        public void onUnseen(SaverReceipt saverreceipt)
        {
            if (com.walmart.android.service.saver.SaverContract.SaverState.isProcessed(saverreceipt.state))
            {
                startCelebrationActivity(saverreceipt.getItBack);
                SaverManager.get().markAsSeen(saverreceipt);
            }
        }


        private ReceiptDetailsCallbacks(SaverReceiptListPresenter saverreceiptlistpresenter)
        {
            this$0 = SaverReceiptFragment.this;
            super();
            mListPresenter = saverreceiptlistpresenter;
        }

    }

    private class ReceiptListCallbacks
        implements SaverReceiptListPresenter.ActionCallbacks
    {

        final SaverReceiptFragment this$0;

        public void launchDetails(SaverReceiptListPresenter saverreceiptlistpresenter, String s)
        {
            saverreceiptlistpresenter = new SaverReceiptDetailsPresenter(getActivity(), s, new ReceiptDetailsCallbacks(saverreceiptlistpresenter));
            access$200.pushPresenter(saverreceiptlistpresenter, true);
        }

        public void launchSignIn()
        {
            startActivityForResult(SaverUtils.createSignInIntent(getActivity()), 1);
            getActivity().overridePendingTransition(0x7f05002c, 0x7f050033);
        }

        public void onShowCompetitors(SaverReceiptListPresenter saverreceiptlistpresenter, String s, String s1, String s2, String s3)
        {
            access$200.pushPresenter(new SaverNearbyCompetitorsPresenter(getActivity(), s, s3, s1, s2, false, new NearbyCompetitorsCallback(saverreceiptlistpresenter)), true);
        }

        private ReceiptListCallbacks()
        {
            this$0 = SaverReceiptFragment.this;
            super();
        }

    }


    private static final String TAG = com/walmart/android/app/saver/SaverReceiptFragment.getSimpleName();

    public SaverReceiptFragment()
    {
    }

    private void showAmountSaved(int i, String s)
    {
        if (i >= 0)
        {
            startCelebrationActivity(i);
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("saverResult");
            String s1;
            if (i > 0)
            {
                s1 = "lowerFound";
            } else
            {
                s1 = "lowerNotFound";
            }
            s = builder.putString("saverResultMsg", s1).putString("tcNumber", s).putString("creditAmount", TextUtils.getFormattedAmount(i));
            MessageBus.getBus().post(s);
        }
    }

    private void startCelebrationActivity(int i)
    {
        if (isResumed() && SharedPreferencesUtil.shouldShowSaverCelebration(getActivity()))
        {
            Object obj = new Intent(getActivity(), com/walmart/android/app/saver/SaverCelebrationActivity);
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((Intent) (obj)).putExtra("EXTRA_LOWER_PRICES_FOUND", flag);
            startActivity(((Intent) (obj)));
            builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView");
            if (flag)
            {
                obj = "Celebration Lower Price";
            } else
            {
                obj = "Celebration No Lower Price";
            }
            obj = builder.putString("name", ((String) (obj))).putString("section", "Saver").putString("subCategory", "Receipt");
            MessageBus.getBus().post(obj);
        }
    }

    protected void handleDynamicArguments(Bundle bundle)
    {
        super.handleDynamicArguments(bundle);
        String s = EReceiptNotificationUtils.getEReceiptId(bundle);
        Object obj;
        boolean flag;
        if (!android.text.TextUtils.isEmpty(s))
        {
            EReceiptNotificationUtils.clearNotification(getActivity(), s);
        } else
        {
            String s1 = SaverNotificationUtils.getReceiptId(bundle);
            s = s1;
            if (!android.text.TextUtils.isEmpty(s1))
            {
                SaverNotificationUtils.clearNotification(getActivity(), s1);
                s = s1;
            }
        }
        if (bundle != null && bundle.getBoolean("SUBMIT_NOW", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new SaverFragment.EReceiptScannerImpl(getActivity(), this);
        obj = new SaverReceiptListPresenter(getActivity(), ((com.walmartlabs.ereceipt.EReceiptScanner) (obj)), new ReceiptListCallbacks());
        if (flag)
        {
            ((SaverReceiptListPresenter) (obj)).setUnconfirmedReceipts(SaverManager.get().getUnconfirmedReceipts());
        }
        mPresenterStack.pushPresenter(((Presenter) (obj)), false);
        if (!android.text.TextUtils.isEmpty(s))
        {
            obj = new SaverReceiptDetailsPresenter(getActivity(), s, new ReceiptDetailsCallbacks(((SaverReceiptListPresenter) (obj))));
            if (bundle != null && bundle.containsKey("EXTRA_AMOUNT"))
            {
                showAmountSaved(bundle.getInt("EXTRA_AMOUNT"), s);
            }
            mPresenterStack.pushPresenter(((Presenter) (obj)), false);
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 2 && j == 11 && intent != null && intent.getExtras() != null)
        {
            setDynamicArguments(intent.getExtras());
        }
        super.onActivityResult(i, j, intent);
    }














}
