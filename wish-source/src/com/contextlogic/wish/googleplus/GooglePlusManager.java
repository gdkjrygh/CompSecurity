// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.googleplus;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.service.GetBraintreeClientTokenService;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.user.UserStatusManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;

public class GooglePlusManager
{
    public static interface ChangeMaskedWalletIntentCallback
    {

        public abstract void onMaskedWalletChangeCancelled();

        public abstract void onMaskedWalletChangeError(int i);

        public abstract void onMaskedWalletChangeSuccess(MaskedWallet maskedwallet);
    }

    public static interface FullWalletIntentCallback
    {

        public abstract CartManager getCartManager();

        public abstract void onFullWalletCancelled();

        public abstract void onFullWalletError(int i);

        public abstract void onFullWalletSuccess(FullWallet fullwallet, String s, String s1);
    }

    public static interface LoginCallback
    {

        public abstract Activity getActivityForErrorResolution();

        public abstract void onFailure();

        public abstract void onSilentFailure();

        public abstract void onSuccess();
    }

    public static interface MaskedWalletIntentCallback
    {

        public abstract void onMaskedWalletCancelled();

        public abstract void onMaskedWalletError(int i);

        public abstract void onMaskedWalletSuccess(MaskedWallet maskedwallet);
    }

    public static interface ShareIntentCallback
    {

        public abstract void onShareFailure();

        public abstract void onShareSuccess(String s);
    }

    private class SignInConnectionListener
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final GooglePlusManager this$0;

        public void onConnected(Bundle bundle)
        {
            if (getLoggedInUser() == null)
            {
                if (loginCallback != null)
                {
                    loginCallback.onFailure();
                }
            } else
            {
                if (loginCallback != null)
                {
                    loginCallback.onSuccess();
                }
                resetWalletClient();
            }
            loginCallback = null;
            cachedResult = null;
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            if (connectionresult.hasResolution())
            {
                if (loginCallback != null && loginCallback.getActivityForErrorResolution() != null)
                {
                    Activity activity = loginCallback.getActivityForErrorResolution();
                    if (activity != null)
                    {
                        try
                        {
                            connectionresult.startResolutionForResult(activity, 9314);
                        }
                        catch (android.content.IntentSender.SendIntentException sendintentexception)
                        {
                            cachedResult = null;
                            safeConnect();
                        }
                    }
                } else
                {
                    if (loginCallback != null)
                    {
                        loginCallback.onFailure();
                    }
                    loginCallback = null;
                }
                cachedResult = connectionresult;
            } else
            {
                boolean flag1 = false;
                boolean flag = flag1;
                if (loginCallback != null)
                {
                    flag = flag1;
                    if (loginCallback.getActivityForErrorResolution() != null)
                    {
                        Activity activity1 = loginCallback.getActivityForErrorResolution();
                        flag = flag1;
                        if (activity1 != null)
                        {
                            connectionresult = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), activity1, 9314);
                            flag = flag1;
                            if (connectionresult != null)
                            {
                                flag = true;
                                connectionresult.show();
                                if (loginCallback != null)
                                {
                                    loginCallback.onSilentFailure();
                                }
                                loginCallback = null;
                            }
                        }
                    }
                }
                if (!flag)
                {
                    if (loginCallback != null)
                    {
                        loginCallback.onFailure();
                    }
                    loginCallback = null;
                    return;
                }
            }
        }

        public void onConnectionSuspended(int i)
        {
            cachedResult = null;
        }

        private SignInConnectionListener()
        {
            this$0 = GooglePlusManager.this;
            super();
        }

    }

    public static interface WalletClientCallback
    {

        public abstract void onWalletClientLoadFailed(int i);

        public abstract void onWalletClientLoaded(GoogleApiClient googleapiclient);
    }

    private class WalletConnectionListener
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final GooglePlusManager this$0;

        public void onConnected(Bundle bundle)
        {
            walletClient = connectingWalletClient;
            connectingWalletClient = null;
            if (walletClientCallback != null)
            {
                walletClientCallback.onWalletClientLoaded(walletClient);
                clearWalletClientCallback();
            }
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            walletClient = null;
            connectingWalletClient = null;
            if (walletClientCallback != null)
            {
                walletClientCallback.onWalletClientLoadFailed(connectionresult.getErrorCode());
                clearWalletClientCallback();
            }
        }

        public void onConnectionSuspended(int i)
        {
            walletClient = null;
            connectingWalletClient = null;
            if (walletClientCallback != null)
            {
                walletClientCallback.onWalletClientLoadFailed(413);
                clearWalletClientCallback();
            }
        }

        private WalletConnectionListener()
        {
            this$0 = GooglePlusManager.this;
            super();
        }

    }

    public static interface WalletPreauthorizationIntentCallback
    {

        public abstract void onWalletPreauthorizationCancelled();

        public abstract void onWalletPreauthorizationError(int i);

        public abstract void onWalletPreauthorizationResult(boolean flag);
    }


    private static final String EMAIL_SCOPE = "email";
    private static final int REQUEST_CODE_CHANGE_MASKED_WALLET_INTENT = 2000;
    private static final int REQUEST_CODE_FULL_WALLET_INTENT = 5000;
    private static final int REQUEST_CODE_MASKED_WALLET_INTENT = 6000;
    private static final int REQUEST_CODE_PREAUTHORIZATION_CHECK_INTENT = 8000;
    private static final int REQUEST_CODE_RESOLVE_ERR = 9314;
    private static final int REQUEST_CODE_SHARE_INTENT = 7000;
    private static GooglePlusManager _instance = new GooglePlusManager();
    private Braintree braintree;
    private com.braintreepayments.api.Braintree.ErrorListener braintreeErrorListener;
    private com.braintreepayments.api.Braintree.PaymentMethodNonceListener braintreePaymentMethodNonceListener;
    private ConnectionResult cachedResult;
    private HashMap changeWalletIntentListeners;
    private GoogleApiClient client;
    private GoogleApiClient connectingWalletClient;
    private HashMap fullWalletIntentListeners;
    private GetBraintreeClientTokenService getBraintreeClientTokenService;
    private LoginCallback loginCallback;
    private HashMap maskedWalletIntentListeners;
    private Random random;
    private HashMap shareIntentListeners;
    private SignInConnectionListener signInConnectionListener;
    private GoogleApiClient walletClient;
    private WalletClientCallback walletClientCallback;
    private WalletConnectionListener walletConnectionListener;
    private HashMap walletPreauthorizationIntentListeners;

    private GooglePlusManager()
    {
        walletConnectionListener = new WalletConnectionListener();
        signInConnectionListener = new SignInConnectionListener();
        resetPlusClient();
        random = new Random();
        shareIntentListeners = new HashMap();
        maskedWalletIntentListeners = new HashMap();
        fullWalletIntentListeners = new HashMap();
        changeWalletIntentListeners = new HashMap();
        walletPreauthorizationIntentListeners = new HashMap();
        getBraintreeClientTokenService = new GetBraintreeClientTokenService();
    }

    public static FullWalletRequest createFullWalletRequest(CartManager cartmanager, MaskedWallet maskedwallet)
    {
        return FullWalletRequest.newBuilder().setCart(createGoogleWalletCart(cartmanager)).setGoogleTransactionId(maskedwallet.getGoogleTransactionId()).build();
    }

    public static Cart createGoogleWalletCart(CartManager cartmanager)
    {
        com.google.android.gms.wallet.Cart.Builder builder = Cart.newBuilder();
        if (CartExperimentManager.mustUseUsd(cartmanager))
        {
            builder.setCurrencyCode("USD");
            builder.setTotalPrice(String.format(Locale.US, "%.2f", new Object[] {
                Double.valueOf(cartmanager.getCart().getTotal().getUsdValue())
            }));
        } else
        {
            builder.setCurrencyCode(cartmanager.getCart().getTotal().getLocalizedCurrencyCode());
            builder.setTotalPrice(String.format(Locale.US, "%.2f", new Object[] {
                Double.valueOf(cartmanager.getCart().getTotal().getValue())
            }));
        }
        return builder.build();
    }

    public static MaskedWalletRequest createMaskedWalletRequest(CartManager cartmanager)
    {
        com.google.android.gms.wallet.MaskedWalletRequest.Builder builder = MaskedWalletRequest.newBuilder().setPhoneNumberRequired(true).setShippingAddressRequired(true).setCart(createGoogleWalletCart(cartmanager)).setMerchantName(WishApplication.getAppInstance().getAppName());
        if (CartExperimentManager.mustUseUsd(cartmanager))
        {
            builder.setCurrencyCode("USD");
            builder.setEstimatedTotalPrice(String.format(Locale.US, "%.2f", new Object[] {
                Double.valueOf(cartmanager.getCart().getTotal().getUsdValue())
            }));
        } else
        {
            builder.setCurrencyCode(cartmanager.getCart().getTotal().getLocalizedCurrencyCode());
            builder.setEstimatedTotalPrice(String.format(Locale.US, "%.2f", new Object[] {
                Double.valueOf(cartmanager.getCart().getTotal().getValue())
            }));
        }
        getInstance().prepareMaskedWalletRequest(cartmanager, builder);
        return builder.build();
    }

    public static String getGoogleWalletErrorMessage(int i, String s)
    {
        String s1;
        if (i == 409 || i == 411)
        {
            s1 = WishApplication.getAppInstance().getString(0x7f06021c);
        } else
        {
            if (i == 405 || i == 402 || i == 412 || i == 1 || i == 2 || i == 3 || i == 9 || i == 16 || i == 11 || i == 5)
            {
                return WishApplication.getAppInstance().getString(0x7f060220);
            }
            if (i == 406)
            {
                return WishApplication.getAppInstance().getString(0x7f06021f);
            }
            s1 = s;
            if (s == null)
            {
                return WishApplication.getAppInstance().getString(0x7f06021e);
            }
        }
        return s1;
    }

    public static GooglePlusManager getInstance()
    {
        return _instance;
    }

    public static boolean isGooglePlayServicesAllowed()
    {
        return !WishApplication.getAppInstance().isAmazonBuild();
    }

    private void loadWalletClient(Activity activity)
    {
        int i;
        if (UserStatusManager.getInstance().getUsePaymentTestMode() || WishApplication.getAppInstance().isGooglePlusBuild())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        connectingWalletClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(activity)).addConnectionCallbacks(walletConnectionListener).addOnConnectionFailedListener(walletConnectionListener).setAccountName(getAccountName()).addApi(Wallet.API, (new com.google.android.gms.wallet.Wallet.WalletOptions.Builder()).setEnvironment(i).setTheme(1).build()).build();
        connectingWalletClient.connect();
    }

    public static String resizeProfileImageUrl(String s, int i)
    {
        if (s == null)
        {
            return null;
        }
        int j = s.indexOf('?');
        String s1 = s;
        if (j != -1)
        {
            s1 = s.substring(0, j);
        }
        return (new StringBuilder()).append(s1).append("?sz=").append(i).toString();
    }

    private void safeConnect()
    {
        if (client.isConnected() || client.isConnecting())
        {
            client.disconnect();
        }
        client.connect();
    }

    public void changeMaskedWallet(GoogleApiClient googleapiclient, MaskedWallet maskedwallet, ChangeMaskedWalletIntentCallback changemaskedwalletintentcallback)
    {
        int i;
        for (i = random.nextInt(1000); changeWalletIntentListeners.containsKey(Integer.valueOf(i + 2000)); i = random.nextInt(1000)) { }
        i += 2000;
        changeWalletIntentListeners.put(Integer.valueOf(i), changemaskedwalletintentcallback);
        Wallet.Payments.changeMaskedWallet(googleapiclient, maskedwallet.getGoogleTransactionId(), maskedwallet.getMerchantTransactionId(), i);
    }

    public void checkWalletPreauthorization(GoogleApiClient googleapiclient, WalletPreauthorizationIntentCallback walletpreauthorizationintentcallback)
    {
        int i;
        for (i = random.nextInt(1000); walletPreauthorizationIntentListeners.containsKey(Integer.valueOf(i + 8000)); i = random.nextInt(1000)) { }
        i += 8000;
        walletPreauthorizationIntentListeners.put(Integer.valueOf(i), walletpreauthorizationintentcallback);
        Wallet.Payments.checkForPreAuthorization(googleapiclient, i);
    }

    public void clearWalletClientCallback()
    {
        walletClientCallback = null;
    }

    public String getAccountName()
    {
        if (isLoggedIn())
        {
            return Plus.AccountApi.getAccountName(client);
        } else
        {
            return null;
        }
    }

    public Person getLoggedInUser()
    {
        if (isLoggedIn())
        {
            return Plus.PeopleApi.getCurrentPerson(client);
        } else
        {
            return null;
        }
    }

    public GoogleApiClient getPlusClient()
    {
        return client;
    }

    public String getScopeString()
    {
        return "oauth2:https://www.googleapis.com/auth/plus.login email";
    }

    public void getWalletClient(final CartManager cartManager, final Activity activity, final WalletClientCallback callback)
    {
        if (cartManager == null || cartManager.getCart() == null || cartManager.getCart().getPaymentProcessor() != com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Braintree || braintree != null) goto _L2; else goto _L1
_L1:
        getBraintreeClientTokenService.requestService(new com.contextlogic.wish.api.service.GetBraintreeClientTokenService.SuccessCallback() {

            final GooglePlusManager this$0;
            final Activity val$activity;
            final WalletClientCallback val$callback;
            final CartManager val$cartManager;

            public void onServiceSucceeded(String s)
            {
                Braintree.setup(activity, s, new com.braintreepayments.api.Braintree.BraintreeSetupFinishedListener() {

                    final _cls3 this$1;

                    public void onBraintreeSetupFinished(boolean flag, Braintree braintree1, String s, Exception exception)
                    {
                        if (flag && braintree1 != null)
                        {
                            braintree = braintree1;
                            getWalletClient(cartManager, activity, callback);
                            return;
                        }
                        if (callback != null)
                        {
                            callback.onWalletClientLoadFailed(413);
                        }
                        clearWalletClientCallback();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
            }

            
            {
                this$0 = GooglePlusManager.this;
                activity = activity1;
                cartManager = cartmanager;
                callback = walletclientcallback;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final GooglePlusManager this$0;
            final WalletClientCallback val$callback;

            public void onServiceFailed()
            {
                if (callback != null)
                {
                    callback.onWalletClientLoadFailed(413);
                }
                clearWalletClientCallback();
            }

            
            {
                this$0 = GooglePlusManager.this;
                callback = walletclientcallback;
                super();
            }
        });
_L4:
        return;
_L2:
        if (walletClient == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (callback != null)
        {
            callback.onWalletClientLoaded(walletClient);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        walletClientCallback = callback;
        if (connectingWalletClient == null)
        {
            loadWalletClient(activity);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean isLoggedIn()
    {
        return client != null && client.isConnected();
    }

    public void loadFullWallet(GoogleApiClient googleapiclient, FullWalletRequest fullwalletrequest, FullWalletIntentCallback fullwalletintentcallback)
        throws android.content.IntentSender.SendIntentException
    {
        int i;
        for (i = random.nextInt(1000); fullWalletIntentListeners.containsKey(Integer.valueOf(i + 5000)); i = random.nextInt(1000)) { }
        i += 5000;
        fullWalletIntentListeners.put(Integer.valueOf(i), fullwalletintentcallback);
        Wallet.Payments.loadFullWallet(googleapiclient, fullwalletrequest, i);
    }

    public void loadMaskedWallet(GoogleApiClient googleapiclient, MaskedWalletRequest maskedwalletrequest, MaskedWalletIntentCallback maskedwalletintentcallback)
    {
        int i;
        for (i = random.nextInt(1000); maskedWalletIntentListeners.containsKey(Integer.valueOf(i + 6000)); i = random.nextInt(1000)) { }
        i += 6000;
        maskedWalletIntentListeners.put(Integer.valueOf(i), maskedwalletintentcallback);
        Wallet.Payments.loadMaskedWallet(googleapiclient, maskedwalletrequest, i);
    }

    public void logout()
    {
        if (client.isConnected())
        {
            Plus.AccountApi.clearDefaultAccount(client);
            client.disconnect();
        }
        resetWalletClient();
    }

    public void onActivityResult(final Activity callback, int i, int j, Intent intent)
    {
        if (i != 9314 || j != -1) goto _L2; else goto _L1
_L1:
        cachedResult = null;
        safeConnect();
_L4:
        return;
_L2:
        if (i != 9314 || j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        cachedResult = null;
        if (loginCallback != null)
        {
            loginCallback.onFailure();
            loginCallback = null;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (shareIntentListeners.containsKey(Integer.valueOf(i)))
        {
            callback = (ShareIntentCallback)shareIntentListeners.get(Integer.valueOf(i));
            if (callback != null)
            {
                if (j == -1)
                {
                    callback.onShareSuccess(Integer.toString(i));
                } else
                {
                    callback.onShareFailure();
                }
            }
            shareIntentListeners.remove(Integer.valueOf(i));
            return;
        }
        if (walletPreauthorizationIntentListeners.containsKey(Integer.valueOf(i)))
        {
            callback = (WalletPreauthorizationIntentCallback)walletPreauthorizationIntentListeners.get(Integer.valueOf(i));
            if (callback != null)
            {
                if (j == -1)
                {
                    callback.onWalletPreauthorizationResult(intent.getBooleanExtra("com.google.android.gm.wallet.EXTRA_IS_USER_PREAUTHORIZED", false));
                } else
                if (j == 0)
                {
                    callback.onWalletPreauthorizationCancelled();
                } else
                {
                    callback.onWalletPreauthorizationError(intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413));
                }
            }
            walletPreauthorizationIntentListeners.remove(Integer.valueOf(i));
            return;
        }
        if (maskedWalletIntentListeners.containsKey(Integer.valueOf(i)))
        {
            callback = (MaskedWalletIntentCallback)maskedWalletIntentListeners.get(Integer.valueOf(i));
            if (callback != null)
            {
                if (j == -1)
                {
                    intent = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                    if (intent != null)
                    {
                        callback.onMaskedWalletSuccess(intent);
                    } else
                    {
                        callback.onMaskedWalletError(413);
                    }
                } else
                if (j == 0)
                {
                    callback.onMaskedWalletCancelled();
                } else
                {
                    callback.onMaskedWalletError(intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413));
                }
            }
            maskedWalletIntentListeners.remove(Integer.valueOf(i));
            return;
        }
        if (changeWalletIntentListeners.containsKey(Integer.valueOf(i)))
        {
            callback = (ChangeMaskedWalletIntentCallback)changeWalletIntentListeners.get(Integer.valueOf(i));
            if (callback != null)
            {
                if (j == -1)
                {
                    intent = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                    if (intent != null)
                    {
                        callback.onMaskedWalletChangeSuccess(intent);
                    } else
                    {
                        callback.onMaskedWalletChangeError(413);
                    }
                } else
                if (j == 0)
                {
                    callback.onMaskedWalletChangeCancelled();
                } else
                {
                    callback.onMaskedWalletChangeError(intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413));
                }
            }
            changeWalletIntentListeners.remove(Integer.valueOf(i));
            return;
        }
        if (fullWalletIntentListeners.containsKey(Integer.valueOf(i)))
        {
            callback = (FullWalletIntentCallback)fullWalletIntentListeners.get(Integer.valueOf(i));
            if (callback != null)
            {
                if (j == -1)
                {
                    final FullWallet fullWallet = (FullWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET");
                    if (fullWallet != null)
                    {
                        if (callback.getCartManager().getCart() != null && callback.getCartManager().getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Braintree && braintree != null)
                        {
                            if (braintreePaymentMethodNonceListener != null)
                            {
                                braintree.removeListener(braintreePaymentMethodNonceListener);
                            }
                            braintreePaymentMethodNonceListener = new com.braintreepayments.api.Braintree.PaymentMethodNonceListener() {

                                final GooglePlusManager this$0;
                                final FullWalletIntentCallback val$callback;
                                final FullWallet val$fullWallet;

                                public void onPaymentMethodNonce(String s)
                                {
                                    callback.onFullWalletSuccess(fullWallet, null, s);
                                    braintree.removeListener(braintreePaymentMethodNonceListener);
                                    braintreePaymentMethodNonceListener = null;
                                }

            
            {
                this$0 = GooglePlusManager.this;
                callback = fullwalletintentcallback;
                fullWallet = fullwallet;
                super();
            }
                            };
                            braintree.addListener(braintreePaymentMethodNonceListener);
                            if (braintreeErrorListener != null)
                            {
                                braintree.removeListener(braintreeErrorListener);
                            }
                            braintreeErrorListener = new com.braintreepayments.api.Braintree.ErrorListener() {

                                final GooglePlusManager this$0;
                                final FullWalletIntentCallback val$callback;

                                public void onRecoverableError(ErrorWithResponse errorwithresponse)
                                {
                                    braintree.removeListener(braintreeErrorListener);
                                    callback.onFullWalletError(413);
                                    braintreeErrorListener = null;
                                }

                                public void onUnrecoverableError(Throwable throwable)
                                {
                                    callback.onFullWalletError(413);
                                    braintree.removeListener(braintreeErrorListener);
                                    braintreeErrorListener = null;
                                }

            
            {
                this$0 = GooglePlusManager.this;
                callback = fullwalletintentcallback;
                super();
            }
                            };
                            braintree.addListener(braintreeErrorListener);
                            braintree.getNonceFromAndroidPayFullWalletResponse(j, intent);
                        } else
                        if (fullWallet.getPaymentMethodToken() != null && fullWallet.getPaymentMethodToken().getToken() != null)
                        {
                            try
                            {
                                callback.onFullWalletSuccess(fullWallet, (new JSONObject(fullWallet.getPaymentMethodToken().getToken())).getString("id"), null);
                            }
                            // Misplaced declaration of an exception variable
                            catch (Intent intent)
                            {
                                callback.onFullWalletError(413);
                            }
                        } else
                        {
                            callback.onFullWalletError(413);
                        }
                    } else
                    {
                        callback.onFullWalletError(413);
                    }
                } else
                if (j == 0)
                {
                    callback.onFullWalletCancelled();
                } else
                {
                    callback.onFullWalletError(intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ERROR_CODE", 413));
                }
            }
            fullWalletIntentListeners.remove(Integer.valueOf(i));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void preConnect()
    {
        if (!client.isConnected() && !client.isConnecting())
        {
            safeConnect();
        }
    }

    public void prepareMaskedWalletRequest(CartManager cartmanager, com.google.android.gms.wallet.MaskedWalletRequest.Builder builder)
    {
        if (cartmanager.getCart() != null && cartmanager.getCart().getPaymentProcessor() == com.contextlogic.wish.api.data.WishCart.PaymentProcessor.Braintree && braintree != null)
        {
            builder.setPaymentMethodTokenizationParameters(braintree.getAndroidPayTokenizationParameters());
            return;
        } else
        {
            builder.setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters.newBuilder().setPaymentMethodTokenizationType(1).addParameter("gateway", "stripe").addParameter("stripe:publishableKey", UserStatusManager.getInstance().getStripeKey()).addParameter("stripe:version", "1.1.15").build());
            return;
        }
    }

    public void resetBraintree()
    {
        braintree = null;
    }

    public void resetPlusClient()
    {
        client = (new com.google.android.gms.common.api.GoogleApiClient.Builder(WishApplication.getAppInstance())).addConnectionCallbacks(signInConnectionListener).addOnConnectionFailedListener(signInConnectionListener).addApi(Plus.API, (new com.google.android.gms.plus.Plus.PlusOptions.Builder()).build()).addScope(Plus.SCOPE_PLUS_LOGIN).addScope(new Scope("email")).build();
    }

    public void resetWalletClient()
    {
        resetBraintree();
        clearWalletClientCallback();
        if (connectingWalletClient != null)
        {
            try
            {
                connectingWalletClient.disconnect();
            }
            catch (Throwable throwable1) { }
        }
        connectingWalletClient = null;
        if (walletClient != null)
        {
            try
            {
                walletClient.disconnect();
            }
            catch (Throwable throwable) { }
        }
        walletClient = null;
    }

    public void startLogin(Activity activity, LoginCallback logincallback)
    {
        loginCallback = logincallback;
        if (isLoggedIn())
        {
            if (loginCallback != null)
            {
                loginCallback.onSuccess();
            }
        } else
        if (!client.isConnecting())
        {
            activity = loginCallback.getActivityForErrorResolution();
            if (cachedResult != null && activity != null)
            {
                try
                {
                    cachedResult.startResolutionForResult(activity, 9314);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    cachedResult = null;
                }
                safeConnect();
                return;
            } else
            {
                cachedResult = null;
                safeConnect();
                return;
            }
        }
    }

    public void startShareIntent(Activity activity, Intent intent, ShareIntentCallback shareintentcallback)
    {
        int i;
        for (i = random.nextInt(1000); shareIntentListeners.containsKey(Integer.valueOf(i + 7000)); i = random.nextInt(1000)) { }
        i += 7000;
        shareIntentListeners.put(Integer.valueOf(i), shareintentcallback);
        activity.startActivityForResult(intent, i);
    }





/*
    static com.braintreepayments.api.Braintree.PaymentMethodNonceListener access$202(GooglePlusManager googleplusmanager, com.braintreepayments.api.Braintree.PaymentMethodNonceListener paymentmethodnoncelistener)
    {
        googleplusmanager.braintreePaymentMethodNonceListener = paymentmethodnoncelistener;
        return paymentmethodnoncelistener;
    }

*/



/*
    static Braintree access$302(GooglePlusManager googleplusmanager, Braintree braintree1)
    {
        googleplusmanager.braintree = braintree1;
        return braintree1;
    }

*/



/*
    static com.braintreepayments.api.Braintree.ErrorListener access$402(GooglePlusManager googleplusmanager, com.braintreepayments.api.Braintree.ErrorListener errorlistener)
    {
        googleplusmanager.braintreeErrorListener = errorlistener;
        return errorlistener;
    }

*/



/*
    static GoogleApiClient access$502(GooglePlusManager googleplusmanager, GoogleApiClient googleapiclient)
    {
        googleplusmanager.walletClient = googleapiclient;
        return googleapiclient;
    }

*/



/*
    static GoogleApiClient access$602(GooglePlusManager googleplusmanager, GoogleApiClient googleapiclient)
    {
        googleplusmanager.connectingWalletClient = googleapiclient;
        return googleapiclient;
    }

*/




/*
    static LoginCallback access$802(GooglePlusManager googleplusmanager, LoginCallback logincallback)
    {
        googleplusmanager.loginCallback = logincallback;
        return logincallback;
    }

*/


/*
    static ConnectionResult access$902(GooglePlusManager googleplusmanager, ConnectionResult connectionresult)
    {
        googleplusmanager.cachedResult = connectionresult;
        return connectionresult;
    }

*/
}
