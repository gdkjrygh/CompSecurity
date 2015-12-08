// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.CartPaymentVaultProcessor;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.BitmapUtil;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBaseBillingHeader

public class CartBillingHeader extends CartBaseBillingHeader
{

    protected View boletoButton;
    protected View buttonsContainer;
    protected View creditCardButton;
    protected View googleWalletButton;
    protected TextView googleWalletOfferText;
    protected View oxxoButton;
    protected View paypalButton;

    public CartBillingHeader(Context context)
    {
        super(context);
        init();
    }

    public CartBillingHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void completeSectionSelection(CartBaseBillingHeader.CartBillingSection cartbillingsection, boolean flag)
    {
        CartBaseBillingHeader.CartBillingSection cartbillingsection1 = getSelectedSection();
        deselectAllSections();
        getButtonForSection(cartbillingsection).setSelected(true);
        if (!flag)
        {
            alertCallbackOnSectionSelected(cartbillingsection, cartbillingsection1);
        }
    }

    private View getButtonForSection(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        static class _cls7
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection = new int[CartBaseBillingHeader.CartBillingSection.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.CREDIT_CARD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.BOLETO.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.OXXO.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$cartmodal$ui$billing$CartBaseBillingHeader$CartBillingSection[CartBaseBillingHeader.CartBillingSection.PAYPAL.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls7..SwitchMap.com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.CartBaseBillingHeader.CartBillingSection[cartbillingsection.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return creditCardButton;

        case 2: // '\002'
            return googleWalletButton;

        case 3: // '\003'
            return boletoButton;

        case 4: // '\004'
            return oxxoButton;

        case 5: // '\005'
            return paypalButton;
        }
    }

    public void changeAllSectionVisibility(boolean flag)
    {
        CartBaseBillingHeader.CartBillingSection acartbillingsection[] = CartBaseBillingHeader.CartBillingSection.values();
        int j = acartbillingsection.length;
        for (int i = 0; i < j; i++)
        {
            setSectionVisible(acartbillingsection[i], flag);
        }

    }

    public void deselectAllSections()
    {
        CartBaseBillingHeader.CartBillingSection acartbillingsection[] = CartBaseBillingHeader.CartBillingSection.values();
        int j = acartbillingsection.length;
        for (int i = 0; i < j; i++)
        {
            getButtonForSection(acartbillingsection[i]).setSelected(false);
        }

    }

    protected void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03001e, this);
        setOrientation(1);
        buttonsContainer = view.findViewById(0x7f0d008c);
        googleWalletOfferText = (TextView)view.findViewById(0x7f0d008b);
        creditCardButton = view.findViewById(0x7f0d008d);
        creditCardButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartBillingHeader this$0;

            public void onClick(View view1)
            {
                selectSection(CartBaseBillingHeader.CartBillingSection.CREDIT_CARD);
            }

            
            {
                this$0 = CartBillingHeader.this;
                super();
            }
        });
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d008e), 0x7f020041);
        googleWalletButton = view.findViewById(0x7f0d008f);
        googleWalletButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartBillingHeader this$0;

            public void onClick(View view1)
            {
                selectSection(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET);
            }

            
            {
                this$0 = CartBillingHeader.this;
                super();
            }
        });
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0090), 0x7f020042);
        paypalButton = view.findViewById(0x7f0d0091);
        paypalButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartBillingHeader this$0;

            public void onClick(View view1)
            {
                selectSection(CartBaseBillingHeader.CartBillingSection.PAYPAL);
            }

            
            {
                this$0 = CartBillingHeader.this;
                super();
            }
        });
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0092), 0x7f020045);
        boletoButton = view.findViewById(0x7f0d0093);
        boletoButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartBillingHeader this$0;

            public void onClick(View view1)
            {
                selectSection(CartBaseBillingHeader.CartBillingSection.BOLETO);
            }

            
            {
                this$0 = CartBillingHeader.this;
                super();
            }
        });
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0094), 0x7f020040);
        oxxoButton = view.findViewById(0x7f0d0095);
        oxxoButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartBillingHeader this$0;

            public void onClick(View view1)
            {
                selectSection(CartBaseBillingHeader.CartBillingSection.OXXO);
            }

            
            {
                this$0 = CartBillingHeader.this;
                super();
            }
        });
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0096), 0x7f020044);
        updateTabVisibility();
    }

    public boolean isSectionSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        return getButtonForSection(cartbillingsection).isSelected();
    }

    public boolean isSectionVisible(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        return getButtonForSection(cartbillingsection).getVisibility() == 0;
    }

    public void selectSection(final CartBaseBillingHeader.CartBillingSection section, final boolean withoutCheck)
    {
        if (isSectionVisible(section))
        {
            if (withoutCheck)
            {
                completeSectionSelection(section, withoutCheck);
                return;
            }
            logSectionSelection(section);
            CartPaymentVaultProcessor cartpaymentvaultprocessor = getVaultProcessorForSection(section, cartManager);
            if (cartpaymentvaultprocessor != null)
            {
                cartpaymentvaultprocessor.prepareTab(new com.contextlogic.wish.ui.fragment.cartmodal.ui.billing.vault.CartPaymentVaultProcessor.PrepareListener() {

                    final CartBillingHeader this$0;
                    final CartBaseBillingHeader.CartBillingSection val$section;
                    final boolean val$withoutCheck;

                    public void onTabPrepareCancelled(CartPaymentVaultProcessor cartpaymentvaultprocessor1)
                    {
                    }

                    public void onTabPrepareFailed(CartPaymentVaultProcessor cartpaymentvaultprocessor1, String s)
                    {
                        if (s != null)
                        {
                            cartManager.showErrorMessage(s);
                        }
                    }

                    public void onTabPrepared(CartPaymentVaultProcessor cartpaymentvaultprocessor1)
                    {
                        completeSectionSelection(section, withoutCheck);
                    }

            
            {
                this$0 = CartBillingHeader.this;
                section = cartbillingsection;
                withoutCheck = flag;
                super();
            }
                });
                return;
            }
        }
    }

    public void setCartManager(CartManager cartmanager)
    {
        super.setCartManager(cartmanager);
        updateTabVisibility();
    }

    public void setSectionVisible(CartBaseBillingHeader.CartBillingSection cartbillingsection, boolean flag)
    {
        cartbillingsection = getButtonForSection(cartbillingsection);
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        cartbillingsection.setVisibility(i);
        updateTabVisibility();
    }

    protected void updateTabVisibility()
    {
        View view = buttonsContainer;
        int i;
        if (getNumActivePaymentMethods() > 1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        if (isSectionVisible(CartBaseBillingHeader.CartBillingSection.GOOGLE_WALLET) && cartManager != null && cartManager.getCart() != null && cartManager.getCart().hasGoogleOffer() && UserStatusManager.getInstance().getGoogleWalletOfferText() != null)
        {
            googleWalletOfferText.setText(UserStatusManager.getInstance().getGoogleWalletOfferText());
            googleWalletOfferText.setVisibility(0);
            return;
        } else
        {
            googleWalletOfferText.setVisibility(8);
            return;
        }
    }

}
