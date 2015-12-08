// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.service.UpdateShippingInfoService;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.MaskedWallet;

public class GoogleWalletHelper
{
    public static interface ChangeListener
    {

        public abstract void onChangeCancelled();

        public abstract void onChangeComplete();

        public abstract void onChangeFailed();
    }


    private CartManager cartManager;
    private UpdateShippingInfoService updateShippingInfoService;

    public GoogleWalletHelper(CartManager cartmanager)
    {
        cartManager = cartmanager;
        updateShippingInfoService = new UpdateShippingInfoService();
    }

    private void performPreauthorizationCheck(final GoogleApiClient client, final ChangeListener changeListener)
    {
        if (cartManager.googleWalletMaskedWalletNeedsReload())
        {
            try
            {
                GooglePlusManager.getInstance().checkWalletPreauthorization(client, new com.contextlogic.wish.googleplus.GooglePlusManager.WalletPreauthorizationIntentCallback() {

                    final GoogleWalletHelper this$0;
                    final ChangeListener val$changeListener;
                    final GoogleApiClient val$client;

                    public void onWalletPreauthorizationCancelled()
                    {
                        cartManager.hideLoadingSpinner();
                        changeListener.onChangeCancelled();
                    }

                    public void onWalletPreauthorizationError(int i)
                    {
                        cartManager.hideLoadingSpinner();
                        cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(i, null));
                        changeListener.onChangeFailed();
                    }

                    public void onWalletPreauthorizationResult(boolean flag)
                    {
                        reloadMaskedWallet(client, changeListener, flag);
                    }

            
            {
                this$0 = GoogleWalletHelper.this;
                client = googleapiclient;
                changeListener = changelistener;
                super();
            }
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (final GoogleApiClient client)
            {
                cartManager.hideLoadingSpinner();
            }
            cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(413, null));
            changeListener.onChangeFailed();
            return;
        } else
        {
            requestChangedMaskedWallet(client, changeListener);
            return;
        }
    }

    private void reloadMaskedWallet(final GoogleApiClient client, final ChangeListener changeListener, final boolean preauthorized)
    {
        try
        {
            GooglePlusManager.getInstance().loadMaskedWallet(client, GooglePlusManager.createMaskedWalletRequest(cartManager), new com.contextlogic.wish.googleplus.GooglePlusManager.MaskedWalletIntentCallback() {

                final GoogleWalletHelper this$0;
                final ChangeListener val$changeListener;
                final GoogleApiClient val$client;
                final boolean val$preauthorized;

                public void onMaskedWalletCancelled()
                {
                    cartManager.hideLoadingSpinner();
                    changeListener.onChangeCancelled();
                }

                public void onMaskedWalletError(int i)
                {
                    cartManager.hideLoadingSpinner();
                    cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(i, null));
                    changeListener.onChangeFailed();
                }

                public void onMaskedWalletSuccess(MaskedWallet maskedwallet)
                {
                    cartManager.updateGoogleWalletMaskedWallet(maskedwallet);
                    if (preauthorized)
                    {
                        requestChangedMaskedWallet(client, changeListener);
                        return;
                    } else
                    {
                        saveShippingAddress(changeListener);
                        return;
                    }
                }

            
            {
                this$0 = GoogleWalletHelper.this;
                preauthorized = flag;
                client = googleapiclient;
                changeListener = changelistener;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final GoogleApiClient client)
        {
            cartManager.hideLoadingSpinner();
        }
        cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(413, null));
        changeListener.onChangeFailed();
    }

    private void requestChangedMaskedWallet(GoogleApiClient googleapiclient, final ChangeListener changeListener)
    {
        try
        {
            GooglePlusManager.getInstance().changeMaskedWallet(googleapiclient, cartManager.getGoogleWalletMaskedWallet(), new com.contextlogic.wish.googleplus.GooglePlusManager.ChangeMaskedWalletIntentCallback() {

                final GoogleWalletHelper this$0;
                final ChangeListener val$changeListener;

                public void onMaskedWalletChangeCancelled()
                {
                    cartManager.hideLoadingSpinner();
                    changeListener.onChangeCancelled();
                }

                public void onMaskedWalletChangeError(int i)
                {
                    cartManager.hideLoadingSpinner();
                    cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(i, null));
                    changeListener.onChangeFailed();
                }

                public void onMaskedWalletChangeSuccess(MaskedWallet maskedwallet)
                {
                    cartManager.updateGoogleWalletMaskedWallet(maskedwallet);
                    saveShippingAddress(changeListener);
                }

            
            {
                this$0 = GoogleWalletHelper.this;
                changeListener = changelistener;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            cartManager.hideLoadingSpinner();
        }
        cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(413, null));
        changeListener.onChangeFailed();
    }

    private void saveShippingAddress(final ChangeListener changeListener)
    {
        Object obj = cartManager.getGoogleWalletMaskedWallet();
        String s = ((MaskedWallet) (obj)).getShippingAddress().getName();
        String s1 = ((MaskedWallet) (obj)).getShippingAddress().getAddress1();
        String s2 = ((MaskedWallet) (obj)).getShippingAddress().getAddress2();
        String s3 = ((MaskedWallet) (obj)).getShippingAddress().getCity();
        String s4 = ((MaskedWallet) (obj)).getShippingAddress().getState();
        String s5 = ((MaskedWallet) (obj)).getShippingAddress().getPostalCode();
        String s6 = ((MaskedWallet) (obj)).getShippingAddress().getCountryCode();
        obj = ((MaskedWallet) (obj)).getShippingAddress().getPhoneNumber();
        updateShippingInfoService.requestService(s, s1, s2, s3, s4, s5, s6, ((String) (obj)), null, null, new com.contextlogic.wish.api.service.UpdateShippingInfoService.SuccessCallback() {

            final GoogleWalletHelper this$0;
            final ChangeListener val$changeListener;

            public void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart)
            {
                cartManager.hideLoadingSpinner();
                changeListener.onChangeComplete();
            }

            
            {
                this$0 = GoogleWalletHelper.this;
                changeListener = changelistener;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateShippingInfoService.FailureCallback() {

            final GoogleWalletHelper this$0;
            final ChangeListener val$changeListener;

            public void onServiceFailed(String s7)
            {
                cartManager.hideLoadingSpinner();
                if (s7 != null)
                {
                    cartManager.showErrorMessage(s7);
                }
                changeListener.onChangeFailed();
            }

            
            {
                this$0 = GoogleWalletHelper.this;
                changeListener = changelistener;
                super();
            }
        });
    }

    public void changeMaskedWallet(final ChangeListener changeListener)
    {
        if (cartManager.getGoogleWalletMaskedWallet() == null)
        {
            return;
        } else
        {
            cartManager.showLoadingSpinner();
            GooglePlusManager.getInstance().getWalletClient(cartManager, cartManager.getActivity(), new com.contextlogic.wish.googleplus.GooglePlusManager.WalletClientCallback() {

                final GoogleWalletHelper this$0;
                final ChangeListener val$changeListener;

                public void onWalletClientLoadFailed(int i)
                {
                    cartManager.hideLoadingSpinner();
                    cartManager.showErrorMessage(GooglePlusManager.getGoogleWalletErrorMessage(i, null));
                    changeListener.onChangeFailed();
                }

                public void onWalletClientLoaded(GoogleApiClient googleapiclient)
                {
                    performPreauthorizationCheck(googleapiclient, changeListener);
                }

            
            {
                this$0 = GoogleWalletHelper.this;
                changeListener = changelistener;
                super();
            }
            });
            return;
        }
    }





}
