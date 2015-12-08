// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishCreditCardInfo, WishBoletoInfo, WishOxxoInfo, WishKlarnaInfo, 
//            WishBraintreePayPalInfo

public class WishUserBillingInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x20bf15d48c4b0dcbL;
    private ArrayList boletoBillingInfoArray;
    private ArrayList braintreePaypalBillingInfoArray;
    private HashMap creditCardBillingInfo;
    private ArrayList klarnaBillingInfoArray;
    private ArrayList oxxoBillingInfoArray;

    public WishUserBillingInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        creditCardBillingInfo = new HashMap();
        boletoBillingInfoArray = new ArrayList();
        oxxoBillingInfoArray = new ArrayList();
        klarnaBillingInfoArray = new ArrayList();
        braintreePaypalBillingInfoArray = new ArrayList();
        Object obj;
        if (!CartExperimentManager.canCheckoutWithCreditCard(null))
        {
            break MISSING_BLOCK_LABEL_190;
        }
        obj = WishCart.PaymentProcessor.creditCardPaymentProcessors.iterator();
_L1:
        WishCart.PaymentProcessor paymentprocessor;
        JSONArray jsonarray;
        ArrayList arraylist;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_190;
        }
        paymentprocessor = (WishCart.PaymentProcessor)((Iterator) (obj)).next();
        jsonarray = jsonobject.optJSONArray(Integer.toString(paymentprocessor.getValue()));
        arraylist = new ArrayList();
        if (jsonarray != null)
        {
            int i = 0;
            do
            {
                try
                {
                    if (i >= jsonarray.length())
                    {
                        break;
                    }
                    arraylist.add(new WishCreditCardInfo(jsonarray.getJSONObject(i)));
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    throw new ApiMalformedDataException(jsonobject.getMessage());
                }
                i++;
            } while (true);
        }
        creditCardBillingInfo.put(paymentprocessor, arraylist);
          goto _L1
        if (!CartExperimentManager.canCheckoutWithBoleto(null)) goto _L3; else goto _L2
_L2:
        obj = jsonobject.optJSONArray(Integer.toString(WishCart.PaymentProcessor.Boleto.getValue()));
        if (obj == null) goto _L3; else goto _L4
_L4:
        int j = 0;
_L5:
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        WishBoletoInfo wishboletoinfo = new WishBoletoInfo(((JSONArray) (obj)).getJSONObject(j));
        boletoBillingInfoArray.add(wishboletoinfo);
        j++;
        if (true) goto _L5; else goto _L3
_L3:
        if (!CartExperimentManager.canCheckoutWithOxxo(null)) goto _L7; else goto _L6
_L6:
        obj = jsonobject.optJSONArray(Integer.toString(WishCart.PaymentProcessor.Oxxo.getValue()));
        if (obj == null) goto _L7; else goto _L8
_L8:
        j = 0;
_L9:
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        WishOxxoInfo wishoxxoinfo = new WishOxxoInfo(((JSONArray) (obj)).getJSONObject(j));
        oxxoBillingInfoArray.add(wishoxxoinfo);
        j++;
        if (true) goto _L9; else goto _L7
_L7:
        if (!CartExperimentManager.canCheckoutWithKlarnaHybrid(null)) goto _L11; else goto _L10
_L10:
        obj = jsonobject.optJSONArray(Integer.toString(WishCart.PaymentProcessor.Klarna.getValue()));
        if (obj == null) goto _L11; else goto _L12
_L12:
        j = 0;
_L13:
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        WishKlarnaInfo wishklarnainfo = new WishKlarnaInfo(((JSONArray) (obj)).getJSONObject(j));
        klarnaBillingInfoArray.add(wishklarnainfo);
        j++;
        if (true) goto _L13; else goto _L11
_L11:
        if (!CartExperimentManager.canCheckoutWithFuturePayPal(null)) goto _L15; else goto _L14
_L14:
        jsonobject = jsonobject.optJSONArray(Integer.toString(WishCart.PaymentProcessor.BraintreePayPal.getValue()));
        if (jsonobject == null) goto _L15; else goto _L16
_L16:
        j = 0;
_L17:
        if (j >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        WishBraintreePayPalInfo wishbraintreepaypalinfo = new WishBraintreePayPalInfo(jsonobject.getJSONObject(j));
        braintreePaypalBillingInfoArray.add(wishbraintreepaypalinfo);
        j++;
        if (true) goto _L17; else goto _L15
_L15:
    }

    public WishBoletoInfo getBoletoInfo()
    {
        if (boletoBillingInfoArray.size() > 0)
        {
            return (WishBoletoInfo)boletoBillingInfoArray.get(0);
        } else
        {
            return null;
        }
    }

    public WishBraintreePayPalInfo getBraintreePayPalInfo()
    {
        if (braintreePaypalBillingInfoArray.size() > 0)
        {
            return (WishBraintreePayPalInfo)braintreePaypalBillingInfoArray.get(0);
        } else
        {
            return null;
        }
    }

    public WishCreditCardInfo getCreditCardInfo(WishCart.PaymentProcessor paymentprocessor)
    {
        paymentprocessor = (ArrayList)creditCardBillingInfo.get(paymentprocessor);
        if (paymentprocessor != null && paymentprocessor.size() > 0)
        {
            return (WishCreditCardInfo)paymentprocessor.get(0);
        } else
        {
            return null;
        }
    }

    public WishKlarnaInfo getKlarnaInfo()
    {
        if (klarnaBillingInfoArray.size() > 0)
        {
            return (WishKlarnaInfo)klarnaBillingInfoArray.get(0);
        } else
        {
            return null;
        }
    }

    public WishOxxoInfo getOxxoInfo()
    {
        if (oxxoBillingInfoArray.size() > 0)
        {
            return (WishOxxoInfo)oxxoBillingInfoArray.get(0);
        } else
        {
            return null;
        }
    }
}
