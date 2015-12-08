// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.payment;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.ebay.redlasersdk.BarcodeResult;
import com.ebay.redlasersdk.BarcodeTypes;
import com.walmart.android.app.main.RedLaserActivity;
import com.walmart.android.util.WalmartUri;
import com.walmartlabs.payment.controller.mpay.MobilePayController;
import com.walmartlabs.payment.controller.mpay.PaymentDrawerController;
import com.walmartlabs.payment.controller.settings.MobilePaySettingsActivity;
import com.walmartlabs.payment.service.mpay.MobilePayManager;

public class MobilePayScannerActivity extends RedLaserActivity
{

    private static final int REQUEST_SETTINGS = 100;
    private PaymentDrawerController mPaymentDrawerController;

    public MobilePayScannerActivity()
    {
    }

    private void initMobilePay()
    {
        mHandleFinish = true;
        enabledTypes.setQRCode(true);
        mPaymentDrawerController = new PaymentDrawerController(this);
        mPaymentDrawerController.init(new com.walmartlabs.payment.controller.mpay.PaymentDrawerController.Callback() {

            final MobilePayScannerActivity this$0;

            public void disableScan()
            {
                if (!isFinishing())
                {
                    disableScanning();
                }
            }

            public void enableScan()
            {
                if (!isFinishing())
                {
                    enableScanning();
                }
            }

            public void onCancel()
            {
                if (!isFinishing())
                {
                    finish();
                    setResult(0);
                }
            }

            
            {
                this$0 = MobilePayScannerActivity.this;
                super();
            }
        });
    }

    private void initToolbar()
    {
        Toolbar toolbar = (Toolbar)findViewById(0x7f100207);
        if (toolbar != null)
        {
            toolbar.setOnMenuItemClickListener(new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {

                final MobilePayScannerActivity this$0;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
                    if (menuitem.getItemId() == 0x7f100696)
                    {
                        MobilePaySettingsActivity.show(MobilePayScannerActivity.this, 100);
                        return true;
                    }
                    if (menuitem.getItemId() == 0x7f100697)
                    {
                        MobilePayController.startMoreInfo(MobilePayScannerActivity.this);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = MobilePayScannerActivity.this;
                super();
            }
            });
            toolbar.inflateMenu(0x7f120003);
        }
    }

    protected void handleValidBarcode(BarcodeResult barcoderesult)
    {
        if (getMode() == 4 && barcoderesult.barcodeType == 16)
        {
            WalmartUri walmarturi = WalmartUri.parse(barcoderesult.barcodeString);
            if (walmarturi != null && walmarturi.getType() == 26)
            {
                MobilePayManager.get().setManuallyEnabled(true);
                setResult(0);
                finish();
                return;
            } else
            {
                Intent intent = new Intent();
                intent.putExtra("qrcode", barcoderesult.barcodeString);
                intent.putExtra("credit_card_id", mPaymentDrawerController.getCreditCardId());
                intent.putExtra("use_assoc_discount", mPaymentDrawerController.isUsingAssociateDiscount());
                intent.putExtra("use_gift_cards", mPaymentDrawerController.isUsingGiftCards());
                setResult(-1, intent);
                finish();
                return;
            }
        } else
        {
            super.handleValidBarcode(barcoderesult);
            return;
        }
    }

    protected void init()
    {
        if (getMode() == 4)
        {
            initMobilePay();
            initToolbar();
            return;
        } else
        {
            super.init();
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 100)
        {
            if (j == -1)
            {
                mPaymentDrawerController.updateData();
            }
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (mPaymentDrawerController.hasUpdatedCards())
        {
            mPaymentDrawerController.updateData();
            mPaymentDrawerController.setHasUpdatedCards(false);
        }
    }


}
