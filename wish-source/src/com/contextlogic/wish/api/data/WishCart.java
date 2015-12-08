// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishLocalizedCurrencyValue, WishCartItem, WishCartSummaryItem, WishAddToCartOfferApplied, 
//            WishCartAbandonOffer, WishSavingsInfo, WishCartEducationModalSpec, WishCheckoutOffer

public class WishCart
    implements Serializable
{
    public static final class PaymentMode extends Enum
    {

        private static final PaymentMode $VALUES[];
        public static final PaymentMode Boleto;
        public static final PaymentMode CreditCard;
        public static final PaymentMode Default;
        public static final PaymentMode GoogleWallet;
        public static final PaymentMode Klarna;
        public static final PaymentMode Oxxo;
        public static final PaymentMode PayPal;
        private static Map map;
        private int value;

        public static PaymentMode getPaymentModeFromPreference(String s)
        {
            byte byte0 = -1;
            s.hashCode();
            JVM INSTR lookupswitch 6: default 64
        //                       -559751798: 150
        //                       -416515006: 136
        //                       -305175410: 178
        //                       -171506468: 122
        //                       1876906729: 164
        //                       2053347017: 108;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            break; /* Loop/switch isn't completed */
_L4:
            break MISSING_BLOCK_LABEL_178;
_L8:
            switch (byte0)
            {
            default:
                return Default;

            case 0: // '\0'
                return CreditCard;

            case 1: // '\001'
                return PayPal;

            case 2: // '\002'
                return GoogleWallet;

            case 3: // '\003'
                return Boleto;

            case 4: // '\004'
                return Oxxo;

            case 5: // '\005'
                return Klarna;
            }
_L7:
            if (s.equals("PaymentModeCC"))
            {
                byte0 = 0;
            }
              goto _L8
_L5:
            if (s.equals("PaymentModePayPal"))
            {
                byte0 = 1;
            }
              goto _L8
_L3:
            if (s.equals("PaymentModeGoogle"))
            {
                byte0 = 2;
            }
              goto _L8
_L2:
            if (s.equals("PaymentModeBoleto"))
            {
                byte0 = 3;
            }
              goto _L8
_L6:
            if (s.equals("PaymentModeOxxo"))
            {
                byte0 = 4;
            }
              goto _L8
            if (s.equals("PaymentModeKlarna"))
            {
                byte0 = 5;
            }
              goto _L8
        }

        public static PaymentMode valueOf(int i)
        {
            return (PaymentMode)map.get(Integer.valueOf(i));
        }

        public static PaymentMode valueOf(String s)
        {
            return (PaymentMode)Enum.valueOf(com/contextlogic/wish/api/data/WishCart$PaymentMode, s);
        }

        public static PaymentMode[] values()
        {
            return (PaymentMode[])$VALUES.clone();
        }

        static 
        {
            Default = new PaymentMode("Default", 0, -1);
            CreditCard = new PaymentMode("CreditCard", 1, 1);
            PayPal = new PaymentMode("PayPal", 2, 2);
            GoogleWallet = new PaymentMode("GoogleWallet", 3, 3);
            Boleto = new PaymentMode("Boleto", 4, 4);
            Klarna = new PaymentMode("Klarna", 5, 5);
            Oxxo = new PaymentMode("Oxxo", 6, 6);
            $VALUES = (new PaymentMode[] {
                Default, CreditCard, PayPal, GoogleWallet, Boleto, Klarna, Oxxo
            });
            map = new HashMap();
            PaymentMode apaymentmode[] = values();
            int j = apaymentmode.length;
            for (int i = 0; i < j; i++)
            {
                PaymentMode paymentmode = apaymentmode[i];
                map.put(Integer.valueOf(paymentmode.value), paymentmode);
            }

        }

        private PaymentMode(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }

    public static final class PaymentProcessor extends Enum
    {

        private static final PaymentProcessor $VALUES[];
        public static final PaymentProcessor Adyen;
        public static final PaymentProcessor Boleto;
        public static final PaymentProcessor Braintree;
        public static final PaymentProcessor BraintreePayPal;
        public static final PaymentProcessor Ebanx;
        public static final PaymentProcessor Klarna;
        public static final PaymentProcessor Oxxo;
        public static final PaymentProcessor PayPal;
        public static final PaymentProcessor Stripe;
        public static List creditCardPaymentProcessors;
        private int value;

        public static PaymentProcessor getCreditCardProcessor(int i, PaymentProcessor paymentprocessor)
        {
            for (Iterator iterator = creditCardPaymentProcessors.iterator(); iterator.hasNext();)
            {
                PaymentProcessor paymentprocessor1 = (PaymentProcessor)iterator.next();
                if (paymentprocessor1.getValue() == i)
                {
                    return paymentprocessor1;
                }
            }

            return paymentprocessor;
        }

        public static PaymentProcessor valueOf(String s)
        {
            return (PaymentProcessor)Enum.valueOf(com/contextlogic/wish/api/data/WishCart$PaymentProcessor, s);
        }

        public static PaymentProcessor[] values()
        {
            return (PaymentProcessor[])$VALUES.clone();
        }

        public int getValue()
        {
            return value;
        }

        static 
        {
            PayPal = new PaymentProcessor("PayPal", 0, 0);
            Braintree = new PaymentProcessor("Braintree", 1, 1);
            Stripe = new PaymentProcessor("Stripe", 2, 3);
            Boleto = new PaymentProcessor("Boleto", 3, 6);
            Klarna = new PaymentProcessor("Klarna", 4, 8);
            Adyen = new PaymentProcessor("Adyen", 5, 9);
            Ebanx = new PaymentProcessor("Ebanx", 6, 10);
            Oxxo = new PaymentProcessor("Oxxo", 7, 11);
            BraintreePayPal = new PaymentProcessor("BraintreePayPal", 8, 16);
            $VALUES = (new PaymentProcessor[] {
                PayPal, Braintree, Stripe, Boleto, Klarna, Adyen, Ebanx, Oxxo, BraintreePayPal
            });
            creditCardPaymentProcessors = Arrays.asList(new PaymentProcessor[] {
                Braintree, Stripe, Adyen, Ebanx
            });
        }

        private PaymentProcessor(String s, int i, int j)
        {
            super(s, i);
            value = j;
        }
    }


    private static final long serialVersionUID = 0x2685bb94c6eb3b6bL;
    private WishAddToCartOfferApplied addToCartOfferApplied;
    private WishCartAbandonOffer cartAbandonOffer;
    private WishCartEducationModalSpec cartEducationModalSpec;
    private String cartId;
    private WishCheckoutOffer checkoutOffer;
    private WishLocalizedCurrencyValue credit;
    private boolean eligibleForBokuCheckout;
    private ArrayList items;
    private PaymentProcessor paymentProcessor;
    private boolean requiresFullBillingAddress;
    private WishSavingsInfo savingsInfo;
    private String shippingOfferText;
    private String shippingOfferTitle;
    private WishLocalizedCurrencyValue shippingPrice;
    private WishLocalizedCurrencyValue subtotal;
    private HashMap summaryItemsByPaymentMode;
    private String taxText;
    private WishLocalizedCurrencyValue total;
    private int totalItemCount;

    public WishCart(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        items = new ArrayList();
        summaryItemsByPaymentMode = new HashMap();
        Object obj;
        paymentProcessor = PaymentProcessor.getCreditCardProcessor(jsonobject.getInt("credit_card_processor"), PaymentProcessor.Stripe);
        totalItemCount = jsonobject.getInt("total_item_quantity");
        shippingPrice = new WishLocalizedCurrencyValue(jsonobject.getDouble("shipping"), jsonobject.optJSONObject("localized_shipping"));
        total = new WishLocalizedCurrencyValue(jsonobject.getDouble("total"), jsonobject.optJSONObject("localized_total"));
        subtotal = new WishLocalizedCurrencyValue(jsonobject.getDouble("subtotal"), jsonobject.optJSONObject("localized_subtotal"));
        credit = new WishLocalizedCurrencyValue(jsonobject.getDouble("credit"), jsonobject.optJSONObject("localized_credit"));
        cartId = jsonobject.getString("id");
        if (!jsonobject.has("items"))
        {
            break MISSING_BLOCK_LABEL_214;
        }
        obj = jsonobject.getJSONArray("items");
        int i = 0;
        do
        {
            Iterator iterator;
            PaymentMode paymentmode;
            Object obj1;
            ArrayList arraylist;
            try
            {
                if (i >= ((JSONArray) (obj)).length())
                {
                    break;
                }
                WishCartItem wishcartitem = new WishCartItem(((JSONArray) (obj)).getJSONObject(i));
                items.add(wishcartitem);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new ApiMalformedDataException(jsonobject.getMessage());
            }
            i++;
        } while (true);
        if (!jsonobject.has("cart_summary_by_payment_mode")) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONObject("cart_summary_by_payment_mode");
        iterator = ((JSONObject) (obj)).keys();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        obj1 = (String)iterator.next();
        paymentmode = PaymentMode.valueOf(Integer.parseInt(((String) (obj1))));
        obj1 = ((JSONObject) (obj)).getJSONArray(((String) (obj1)));
        arraylist = new ArrayList();
        i = 0;
_L5:
        if (i >= ((JSONArray) (obj1)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(new WishCartSummaryItem(((JSONArray) (obj1)).getJSONObject(i)));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        summaryItemsByPaymentMode.put(paymentmode, arraylist);
        continue; /* Loop/switch isn't completed */
_L2:
        boolean flag;
        if (jsonobject.has("shipping_offer_title") && !jsonobject.isNull("shipping_offer_title"))
        {
            shippingOfferTitle = jsonobject.getString("shipping_offer_title");
        }
        if (jsonobject.has("shipping_offer_text") && !jsonobject.isNull("shipping_offer_text"))
        {
            shippingOfferText = jsonobject.getString("shipping_offer_text");
        }
        if (jsonobject.has("tax_text") && !jsonobject.isNull("tax_text"))
        {
            taxText = jsonobject.getString("tax_text");
        }
        if (jsonobject.has("requires_full_billing_address") && !jsonobject.isNull("requires_full_billing_address"))
        {
            requiresFullBillingAddress = jsonobject.optBoolean("requires_full_billing_address", false);
        }
        if (!jsonobject.has("add_to_cart_offer_applied"))
        {
            break MISSING_BLOCK_LABEL_504;
        }
        flag = jsonobject.isNull("add_to_cart_offer_applied");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_504;
        }
        try
        {
            addToCartOfferApplied = new WishAddToCartOfferApplied(jsonobject.getJSONObject("add_to_cart_offer_applied"));
        }
        catch (ApiMalformedDataException apimalformeddataexception2) { }
        if (!jsonobject.has("cart_abandon_offer"))
        {
            break MISSING_BLOCK_LABEL_543;
        }
        flag = jsonobject.isNull("cart_abandon_offer");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_543;
        }
        try
        {
            cartAbandonOffer = new WishCartAbandonOffer(jsonobject.getJSONObject("cart_abandon_offer"));
        }
        catch (ApiMalformedDataException apimalformeddataexception1) { }
        if (!jsonobject.has("savings_info"))
        {
            break MISSING_BLOCK_LABEL_582;
        }
        flag = jsonobject.isNull("savings_info");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_582;
        }
        try
        {
            savingsInfo = new WishSavingsInfo(jsonobject.getJSONObject("savings_info"));
        }
        catch (ApiMalformedDataException apimalformeddataexception) { }
        eligibleForBokuCheckout = jsonobject.optBoolean("eligible_for_boku_checkout");
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean canCheckoutWithBoku()
    {
        return eligibleForBokuCheckout;
    }

    public WishAddToCartOfferApplied getAddToCartOfferApplied()
    {
        return addToCartOfferApplied;
    }

    public WishCartAbandonOffer getCartAbandonOffer()
    {
        return cartAbandonOffer;
    }

    public WishCartEducationModalSpec getCartEducationModalSpec()
    {
        return cartEducationModalSpec;
    }

    public String getCartId()
    {
        return cartId;
    }

    public WishCheckoutOffer getCheckoutOffer()
    {
        return checkoutOffer;
    }

    public WishLocalizedCurrencyValue getCredit()
    {
        return credit;
    }

    public ArrayList getItems()
    {
        return items;
    }

    public PaymentProcessor getPaymentProcessor()
    {
        return paymentProcessor;
    }

    public boolean getRequiresFullBillingAddress()
    {
        return requiresFullBillingAddress;
    }

    public WishSavingsInfo getSavingsInfo()
    {
        return savingsInfo;
    }

    public String getShippingOfferText()
    {
        return shippingOfferText;
    }

    public String getShippingOfferTitle()
    {
        return shippingOfferTitle;
    }

    public WishLocalizedCurrencyValue getShippingPrice()
    {
        return shippingPrice;
    }

    public WishLocalizedCurrencyValue getSubtotal()
    {
        return subtotal;
    }

    public ArrayList getSummaryItems(String s)
    {
        s = PaymentMode.getPaymentModeFromPreference(s);
        ArrayList arraylist = (ArrayList)summaryItemsByPaymentMode.get(s);
        s = arraylist;
        if (arraylist == null)
        {
            s = (ArrayList)summaryItemsByPaymentMode.get(PaymentMode.Default);
        }
        return s;
    }

    public String getTaxText()
    {
        return taxText;
    }

    public WishLocalizedCurrencyValue getTotal()
    {
        return total;
    }

    public int getTotalItemCount()
    {
        return totalItemCount;
    }

    public boolean hasGoogleOffer()
    {
        return summaryItemsByPaymentMode.containsKey("PaymentModeGoogle") && CartExperimentManager.canCheckoutWithGoogleWallet(null);
    }

    public void setAddToCartOfferApplied(WishAddToCartOfferApplied wishaddtocartofferapplied)
    {
        addToCartOfferApplied = wishaddtocartofferapplied;
    }

    public void setCartEducationModalSpec(WishCartEducationModalSpec wishcarteducationmodalspec)
    {
        cartEducationModalSpec = wishcarteducationmodalspec;
    }

    public void setCheckoutOffer(WishCheckoutOffer wishcheckoutoffer)
    {
        checkoutOffer = wishcheckoutoffer;
    }
}
