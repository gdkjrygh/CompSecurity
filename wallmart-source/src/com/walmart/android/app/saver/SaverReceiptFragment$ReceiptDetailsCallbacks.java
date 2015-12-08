// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentActivity;
import com.squareup.otto.Bus;
import com.walmart.android.app.ereceipt.EReceiptReturnActivity;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.shop.SimpleItemDetailsPresenter;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.SaverUtils;
import com.walmart.android.utils.UrlUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptFragment, SaverReceiptItemComparisonPresenter, SaverReceiptImageActivity, SaverReceiptListPresenter, 
//            SaverNearbyCompetitorsPresenter, SaverFeedbackPresenter

private class <init>
    implements <init>
{

    private final SaverReceiptListPresenter mListPresenter;
    final SaverReceiptFragment this$0;

    private String createImageUrl(com.walmart.android.service.saver.t> t>)
    {
        String s = t>.t>;
        if (t>.t>())
        {
            s = UrlUtils.getURLFromThumbnailURL(UrlUtils.IMAGE_SIZE_300, t>.t>);
        }
        return s;
    }

    private Presenter createPresenter(final SaverReceipt receipt, com.walmart.android.service.saver.t> t>, boolean flag)
    {
        if (!t>.ks() || flag)
        {
            android.text.Spanned spanned = t>.ks();
            String s = null;
            final String receiptPrice;
            final String imageUrl;
            Bitmap bitmap;
            if ("lb".equalsIgnoreCase(t>.ks))
            {
                s = getActivity().getString(0x7f0900cb, new Object[] {
                    Float.valueOf(t>.ks), Integer.valueOf(t>.ks)
                });
                receiptPrice = getActivity().getString(0x7f0900fc, new Object[] {
                    Float.valueOf(t>.ks())
                });
            } else
            if (t>.ks > 0.0F && t>.ks == null)
            {
                s = getActivity().getString(0x7f0900d8, new Object[] {
                    Integer.valueOf((int)t>.ks), Integer.valueOf(t>.ks)
                });
                receiptPrice = getActivity().getString(0x7f0900fc, new Object[] {
                    Float.valueOf(t>.ks())
                });
            } else
            {
                receiptPrice = getActivity().getString(0x7f0900fc, new Object[] {
                    Float.valueOf(t>.ks())
                });
            }
            imageUrl = createImageUrl(t>);
            bitmap = BitmapFactory.decodeResource(getActivity().getResources(), 0x7f02021b);
            if (flag)
            {
                t> = new SaverReceiptItemComparisonPresenter(getActivity(), t>, spanned, imageUrl);
                t>.setDefaultImage(Bitmap.createScaledBitmap(bitmap, 100, 100, true));
                t>.setActionCallbacks(new SaverReceiptItemComparisonPresenter.ActionCallbacks() {

                    final SaverReceiptFragment.ReceiptDetailsCallbacks this$1;
                    final String val$imageUrl;
                    final SaverReceipt val$receipt;
                    final String val$receiptPrice;

                    public void onShowFeedback(com.walmart.android.service.saver.SaverReceipt.Item item)
                    {
                        PresenterStack presenterstack = SaverReceiptFragment.access$1100(this$0);
                        FragmentActivity fragmentactivity = getActivity();
                        String s1;
                        if (receipt.store != null)
                        {
                            s1 = receipt.store.id;
                        } else
                        {
                            s1 = "";
                        }
                        presenterstack.pushPresenter(new SaverFeedbackPresenter(fragmentactivity, s1, item.upc, imageUrl, item.getDisplayName(), receiptPrice, receipt.tcNumber, receipt.localDate, new SaverReceiptFragment.FeedbackCallbacks(this$0, null)), true);
                    }

                    public void onShowItemDetails(com.walmart.android.service.saver.SaverReceipt.Item item)
                    {
                        SaverReceiptFragment.access$900(this$0).pushPresenter(createPresenter(receipt, item, false), true);
                    }

            
            {
                this$1 = SaverReceiptFragment.ReceiptDetailsCallbacks.this;
                receipt = saverreceipt;
                imageUrl = s;
                receiptPrice = s1;
                super();
            }
                });
                return t>;
            } else
            {
                receipt = new SimpleItemDetailsPresenter(getActivity());
                receipt.setDefaultImage(Bitmap.createScaledBitmap(bitmap, 300, 300, true));
                receipt.init(spanned, t>.receipt, imageUrl, s, receiptPrice, null, null, null);
                sendItemDetailsEvent();
                return receipt;
            }
        } else
        {
            receipt = new ItemDetailsPresenter(getActivity(), t>.ItemDetailsEvent);
            sendItemDetailsEvent();
            return receipt;
        }
    }

    private void sendItemDetailsEvent()
    {
        com.walmartlabs.anivia.lbacks lbacks = (new com.walmartlabs.anivia.lbacks("pageView")).lbacks("name", "Item details").lbacks("section", "Saver").lbacks("subCategory", "Savings Catcher");
        MessageBus.getBus().post(lbacks);
    }

    public void launchReceiptImage(String s)
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverReceiptImageActivity);
        intent.putExtra("EXTRA_ERECEIPT_UUID", s);
        startActivity(intent);
    }

    public void launchReceiptItem(SaverReceipt saverreceipt, com.walmart.android.service.saver.ItemDetailsEvent itemdetailsevent)
    {
        boolean flag;
        if (com.walmart.android.service.saver.ItemDetailsEvent(saverreceipt.state) && itemdetailsevent.ItemDetailsEvent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        saverreceipt = createPresenter(saverreceipt, itemdetailsevent, flag);
        SaverReceiptFragment.access$700(SaverReceiptFragment.this).pushPresenter(saverreceipt, true);
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
        SaverReceiptFragment.access$600(SaverReceiptFragment.this).pushPresenter(new SaverNearbyCompetitorsPresenter(getActivity(), s, s3, s1, s2, false, new k(SaverReceiptFragment.this, null, null)), true);
    }

    public void onUnseen(SaverReceipt saverreceipt)
    {
        if (com.walmart.android.service.saver.._mth0(saverreceipt.state))
        {
            SaverReceiptFragment.access$500(SaverReceiptFragment.this, saverreceipt.getItBack);
            SaverManager.get().markAsSeen(saverreceipt);
        }
    }


    private _cls1.val.receiptPrice(SaverReceiptListPresenter saverreceiptlistpresenter)
    {
        this$0 = SaverReceiptFragment.this;
        super();
        mListPresenter = saverreceiptlistpresenter;
    }

    mListPresenter(SaverReceiptListPresenter saverreceiptlistpresenter, mListPresenter mlistpresenter)
    {
        this(saverreceiptlistpresenter);
    }
}
