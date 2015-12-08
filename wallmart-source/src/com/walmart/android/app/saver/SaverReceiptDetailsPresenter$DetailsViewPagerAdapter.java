// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.database.DataSetObserver;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.app.storelocator.StoreDetailPresenter;
import com.walmart.android.data.AppConfig;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreService;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter, SaverReceiptListAdapter, SaverReceiptDetailsPage

private class notifyDataSetChanged extends PagerAdapter
{

    final SaverReceiptDetailsPresenter this$0;

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (SaverReceiptDetailsPage)obj;
        ((SaverReceiptDetailsPage) (obj)).cancel();
        viewgroup.removeView(((SaverReceiptDetailsPage) (obj)).getView());
    }

    public int getCount()
    {
        return SaverReceiptDetailsPresenter.access$1300(SaverReceiptDetailsPresenter.this).getCount();
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        SaverReceipt saverreceipt = SaverReceiptDetailsPresenter.access$2300(SaverReceiptDetailsPresenter.this, i);
        Object obj = new SaverReceiptDetailsPage.ActionCallbacks() {

            final SaverReceiptDetailsPresenter.DetailsViewPagerAdapter this$1;

            public void onAddressClicked(int j)
            {
                if (!SaverReceiptDetailsPresenter.access$2600(this$0))
                {
                    SaverReceiptDetailsPresenter.access$2700(this$0, true);
                    com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback = new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

                        final _cls2 this$2;

                        private void handleServerResponse(WalmartStore awalmartstore[])
                        {
                            if (isPopped())
                            {
                                return;
                            }
                            if (awalmartstore != null && awalmartstore.length > 0)
                            {
                                awalmartstore = new StoreDetailPresenter(SaverReceiptDetailsPresenter.access$1200(this$0), awalmartstore[0]);
                                awalmartstore.setShowLocalAd(false);
                                SaverReceiptDetailsPresenter.access$2800(this$0, awalmartstore);
                                return;
                            } else
                            {
                                clearSingleClickFlag();
                                return;
                            }
                        }

                        public void onFailure(int i)
                        {
                            handleServerResponse(null);
                        }

                        public void onStoresReceived(WalmartStore awalmartstore[])
                        {
                            handleServerResponse(awalmartstore);
                        }

                        public volatile void onStoresReceived(StoreData astoredata[])
                        {
                            onStoresReceived((WalmartStore[])astoredata);
                        }

            
            {
                this$2 = _cls2.this;
                super();
            }
                    };
                    StoreService.getStoreService().getStore(j, getstorescallback);
                }
            }

            public void onItemClicked(SaverReceipt saverreceipt1, com.walmart.android.service.saver.SaverReceipt.Item item)
            {
                if (!SaverReceiptDetailsPresenter.access$2400(this$0))
                {
                    SaverReceiptDetailsPresenter.access$2500(this$0, true);
                    SaverReceiptDetailsPresenter.access$400(this$0).launchReceiptItem(saverreceipt1, item);
                }
            }

            
            {
                this$1 = SaverReceiptDetailsPresenter.DetailsViewPagerAdapter.this;
                super();
            }
        };
        obj = new SaverReceiptDetailsPage(SaverReceiptDetailsPresenter.access$1200(SaverReceiptDetailsPresenter.this), saverreceipt, ((this._cls0) (obj)));
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        boolean flag;
        if (appconfig != null && appconfig.saverManualSubmit && saverreceipt.needsConfirmation() && SaverManager.get().isLastSaverSyncSuccess())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((SaverReceiptDetailsPage) (obj)).block(flag);
        viewgroup.addView(((SaverReceiptDetailsPage) (obj)).createView(viewgroup));
        return obj;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return ((SaverReceiptDetailsPage)obj).getView() == view;
    }

    public _cls2.this._cls1()
    {
        this.this$0 = SaverReceiptDetailsPresenter.this;
        super();
        SaverReceiptDetailsPresenter.access$1300(SaverReceiptDetailsPresenter.this).registerDataSetObserver(new DataSetObserver() {

            final SaverReceiptDetailsPresenter.DetailsViewPagerAdapter this$1;
            final SaverReceiptDetailsPresenter val$this$0;

            public void onChanged()
            {
                notifyDataSetChanged();
            }

            public void onInvalidated()
            {
                notifyDataSetChanged();
            }

            
            {
                this$1 = SaverReceiptDetailsPresenter.DetailsViewPagerAdapter.this;
                this$0 = saverreceiptdetailspresenter;
                super();
            }
        });
    }
}
