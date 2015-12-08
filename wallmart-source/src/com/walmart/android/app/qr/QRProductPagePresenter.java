// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.data.StoreItem;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartNetService;

// Referenced classes of package com.walmart.android.app.qr:
//            QRDataHandler, QRMediaPlayer, LandingPageAdapter

public class QRProductPagePresenter extends Presenter
{

    private static final int DIALOG_OPEN_BROWSER = 1;
    protected static final String TAG = com/walmart/android/app/qr/QRProductPagePresenter.getSimpleName();
    private String itemId;
    private Activity mActivity;
    private Handler mHandler;
    private String mURL;
    private QRDataHandler mUrlHandler;
    private boolean mVideoStarted;
    private View mView;

    public QRProductPagePresenter(Activity activity, String s)
    {
        mView = LayoutInflater.from(activity).inflate(0x7f04013e, null);
        mActivity = activity;
        mHandler = new Handler();
        mURL = s;
    }

    private void initProductPage()
    {
        itemId = mUrlHandler.getItemID();
        mView.findViewById(0x7f100466).setVisibility(8);
        loadItemDetails(itemId);
        mView.findViewById(0x7f100464).setOnClickListener(new android.view.View.OnClickListener() {

            final QRProductPagePresenter this$0;

            public void onClick(View view)
            {
                playMedia();
            }

            
            {
                this$0 = QRProductPagePresenter.this;
                super();
            }
        });
        mView.findViewById(0x7f100463).setOnClickListener(new android.view.View.OnClickListener() {

            final QRProductPagePresenter this$0;

            public void onClick(View view)
            {
                playMedia();
            }

            
            {
                this$0 = QRProductPagePresenter.this;
                super();
            }
        });
    }

    private void loadItemDetails(String s)
    {
        Services.get().getWalmartService().getStoreItemDetails(s, new AsyncCallbackOnThread(mHandler) {

            final QRProductPagePresenter this$0;

            public void onFailureSameThread(Integer integer, StoreItem storeitem)
            {
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (StoreItem)obj1);
            }

            public void onSuccessSameThread(StoreItem storeitem)
            {
                ViewUtil.setText(0x7f100462, mView, storeitem.getName());
                mView.findViewById(0x7f100462);
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((StoreItem)obj);
            }

            
            {
                this$0 = QRProductPagePresenter.this;
                super(handler);
            }
        });
    }

    private void playMedia()
    {
        if (!mVideoStarted)
        {
            mVideoStarted = true;
            String s = mUrlHandler.getMediaURL();
            if (s != null)
            {
                Intent intent = new Intent(mActivity, com/walmart/android/app/qr/QRMediaPlayer);
                intent.putExtra("media", s);
                mActivity.startActivity(intent);
            }
        }
    }

    private void shareItem()
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "View this Walmart product");
        intent.putExtra("android.intent.extra.TEXT", mURL);
        if (intent.resolveActivity(mActivity.getPackageManager()) != null)
        {
            mActivity.startActivity(Intent.createChooser(intent, "Share"));
        }
    }

    public String getTitleText()
    {
        return "Scanned Item";
    }

    public View getView()
    {
        return mView;
    }

    protected Dialog onCreateDialog(int i)
    {
        if (i == 1)
        {
            return (new com.walmart.android.ui.CustomAlertDialog.Builder(mActivity)).setMessage("This product is not in the Walmart catalog, but you may be able to view it on the Web. Would you like to continue?").setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

                final QRProductPagePresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface.dismiss();
                }

            
            {
                this$0 = QRProductPagePresenter.this;
                super();
            }
            }).setPositiveButton("Open URL", new android.content.DialogInterface.OnClickListener() {

                final QRProductPagePresenter this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(mURL));
                    if (dialoginterface.resolveActivity(mActivity.getPackageManager()) != null)
                    {
                        mActivity.startActivity(dialoginterface);
                        GoogleAnalytics.trackEvent("Scan", "QR scan browser open", mURL);
                    }
                }

            
            {
                this$0 = QRProductPagePresenter.this;
                super();
            }
            }).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final QRProductPagePresenter this$0;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    mActivity.finish();
                }

            
            {
                this$0 = QRProductPagePresenter.this;
                super();
            }
            }).create();
        } else
        {
            return super.onCreateDialog(i);
        }
    }

    public void onPushed()
    {
        super.onPushed();
        ListView listview = (ListView)mView.findViewById(0x7f100465);
        listview.setCacheColorHint(0);
        listview.setAdapter(new LandingPageAdapter(mActivity));
        mUrlHandler = new QRDataHandler(mActivity);
        mUrlHandler.init(mURL, new QRDataHandler.Callback() {

            final QRProductPagePresenter this$0;

            public void onInitDone(int i, String s)
            {
                if (s != null)
                {
                    mURL = s;
                }
                i;
                JVM INSTR tableswitch 0 6: default 56
            //                           0 138
            //                           1 130
            //                           2 147
            //                           3 57
            //                           4 165
            //                           5 240
            //                           6 299;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
                return;
_L5:
                if ((s = new Intent("android.intent.action.VIEW", Uri.parse(mURL))).resolveActivity(mActivity.getPackageManager()) != null)
                {
                    mActivity.startActivity(s);
                    mActivity.finish();
                    GoogleAnalytics.trackEvent("Scan", "QR scan browser open", mURL);
                    return;
                }
                  goto _L1
_L3:
                initProductPage();
                return;
_L2:
                showDialog(1);
                return;
_L4:
                playMedia();
                mActivity.finish();
                return;
_L6:
                s = new Bundle();
                s.putString("search_query", mUrlHandler.getKeyword());
                s.putString("search_department", mUrlHandler.getDepartment());
                s.putBoolean("from_qr_scan", true);
                MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, s));
                mActivity.finish();
                return;
_L7:
                s = new Bundle();
                s.putString("browse_token", mUrlHandler.getKeyword());
                s.putBoolean("from_qr_scan", true);
                MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, s));
                mActivity.finish();
                return;
_L8:
                s = new ItemDetailsPresenter(mActivity, mUrlHandler.getItemID());
                pushAndReplacePresenter(s, false);
                return;
            }

            
            {
                this$0 = QRProductPagePresenter.this;
                super();
            }
        });
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final QRProductPagePresenter this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (i != 1) goto _L2; else goto _L1
_L1:
                pushPresenter(new ItemDetailsPresenter(mActivity, itemId));
_L4:
                return;
_L2:
                if (i != 2)
                {
                    continue; /* Loop/switch isn't completed */
                }
                adapterview = mUrlHandler.getKeyword();
                if (adapterview == null) goto _L4; else goto _L3
_L3:
                view = new Bundle();
                view.putString("search_query", adapterview);
                view.putString("search_department", mUrlHandler.getDepartment());
                view.putBoolean("from_qr_scan", true);
                MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, view));
                return;
                if (i != 3) goto _L4; else goto _L5
_L5:
                shareItem();
                return;
            }

            
            {
                this$0 = QRProductPagePresenter.this;
                super();
            }
        });
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mVideoStarted = false;
    }




/*
    static String access$002(QRProductPagePresenter qrproductpagepresenter, String s)
    {
        qrproductpagepresenter.mURL = s;
        return s;
    }

*/










}
