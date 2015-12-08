// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.user.UserStatusManager;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class WishLocalizedCurrencyValue
    implements Serializable
{

    public static final double NON_LOCALIZED_DEFAULT = 4.9406564584124654E-324D;
    private static final long serialVersionUID = 0x64d1250c88a87a50L;
    private String localizedCurrencyCode;
    private double localizedValue;
    private double usdValue;

    public WishLocalizedCurrencyValue(double d)
    {
        this(d, 4.9406564584124654E-324D, null);
    }

    public WishLocalizedCurrencyValue(double d, double d1, String s)
    {
        usdValue = d;
        localizedValue = d1;
        localizedCurrencyCode = s;
    }

    public WishLocalizedCurrencyValue(double d, JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        usdValue = d;
        localizedValue = 4.9406564584124654E-324D;
        localizedCurrencyCode = null;
        boolean flag;
        if (UserStatusManager.getInstance().getBucketForExperiment("mobile_localized_currency").equals("show") || UserStatusManager.getInstance().getBucketForExperiment("mobile_psuedo_localized_currency").equals("show"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        if (!jsonobject.has("localized_value") || jsonobject.isNull("localized_value"))
        {
            break MISSING_BLOCK_LABEL_136;
        }
        localizedValue = jsonobject.optDouble("localized_value", 4.9406564584124654E-324D);
_L1:
        if (jsonobject.has("currency_code") && !jsonobject.isNull("currency_code"))
        {
            localizedCurrencyCode = jsonobject.getString("currency_code");
        }
        if (localizedValue == 4.9406564584124654E-324D)
        {
            localizedCurrencyCode = null;
            return;
        }
        break MISSING_BLOCK_LABEL_159;
        try
        {
            localizedValue = 4.9406564584124654E-324D;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
          goto _L1
        if (localizedCurrencyCode != null && localizedCurrencyCode.toLowerCase().equals("usd"))
        {
            usdValue = localizedValue;
            localizedValue = 4.9406564584124654E-324D;
            localizedCurrencyCode = null;
            return;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        localizedValue = 4.9406564584124654E-324D;
        localizedCurrencyCode = null;
    }

    private boolean isLocalizedManipulationAllowed(WishLocalizedCurrencyValue wishlocalizedcurrencyvalue)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (isLocalized())
        {
            flag = flag1;
            if (wishlocalizedcurrencyvalue.isLocalized())
            {
                flag = flag1;
                if (getLocalizedCurrencyCode().equals(wishlocalizedcurrencyvalue.getLocalizedCurrencyCode()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public WishLocalizedCurrencyValue add(WishLocalizedCurrencyValue wishlocalizedcurrencyvalue)
    {
        if (isLocalizedManipulationAllowed(wishlocalizedcurrencyvalue))
        {
            return new WishLocalizedCurrencyValue(usdValue + wishlocalizedcurrencyvalue.getUsdValue(), localizedValue * wishlocalizedcurrencyvalue.getLocalizedValue(), localizedCurrencyCode);
        } else
        {
            return new WishLocalizedCurrencyValue(usdValue + wishlocalizedcurrencyvalue.getUsdValue(), 4.9406564584124654E-324D, null);
        }
    }

    public WishLocalizedCurrencyValue delocalize()
    {
        return new WishLocalizedCurrencyValue(usdValue, 4.9406564584124654E-324D, null);
    }

    public double divide(WishLocalizedCurrencyValue wishlocalizedcurrencyvalue)
    {
        return usdValue / wishlocalizedcurrencyvalue.getUsdValue();
    }

    public void floorValue()
    {
        usdValue = Math.floor(usdValue);
        localizedValue = Math.floor(localizedValue);
    }

    public String getLocalizedCurrencyCode()
    {
        if (isLocalized())
        {
            return localizedCurrencyCode;
        } else
        {
            return "USD";
        }
    }

    public double getLocalizedValue()
    {
        return localizedValue;
    }

    public double getUsdValue()
    {
        return usdValue;
    }

    public double getValue()
    {
        if (isLocalized())
        {
            return localizedValue;
        } else
        {
            return usdValue;
        }
    }

    public boolean isLocalized()
    {
        return localizedCurrencyCode != null;
    }

    public WishLocalizedCurrencyValue multiply(double d)
    {
        return new WishLocalizedCurrencyValue(usdValue * d, localizedValue * d, localizedCurrencyCode);
    }

    public WishLocalizedCurrencyValue multiply(WishLocalizedCurrencyValue wishlocalizedcurrencyvalue)
    {
        if (isLocalizedManipulationAllowed(wishlocalizedcurrencyvalue))
        {
            return new WishLocalizedCurrencyValue(usdValue * wishlocalizedcurrencyvalue.getUsdValue(), localizedValue * wishlocalizedcurrencyvalue.getLocalizedValue(), localizedCurrencyCode);
        } else
        {
            return new WishLocalizedCurrencyValue(usdValue * wishlocalizedcurrencyvalue.getUsdValue(), 4.9406564584124654E-324D, null);
        }
    }

    public WishLocalizedCurrencyValue subtract(WishLocalizedCurrencyValue wishlocalizedcurrencyvalue)
    {
        if (isLocalizedManipulationAllowed(wishlocalizedcurrencyvalue))
        {
            return new WishLocalizedCurrencyValue(usdValue - wishlocalizedcurrencyvalue.getUsdValue(), localizedValue - wishlocalizedcurrencyvalue.getLocalizedValue(), localizedCurrencyCode);
        } else
        {
            return new WishLocalizedCurrencyValue(usdValue - wishlocalizedcurrencyvalue.getUsdValue(), 4.9406564584124654E-324D, null);
        }
    }

    public String toFormattedString()
    {
        return toFormattedString(false, true);
    }

    public String toFormattedString(boolean flag, boolean flag1)
    {
        if (!UserStatusManager.getInstance().getBucketForExperiment("mobile_localized_currency").equals("show") && !UserStatusManager.getInstance().getBucketForExperiment("mobile_psuedo_localized_currency").equals("show"))
        {
            if (flag1 && usdValue == (double)(int)usdValue)
            {
                return String.format("$%.0f", new Object[] {
                    Double.valueOf(usdValue)
                });
            } else
            {
                return String.format("$%.2f", new Object[] {
                    Double.valueOf(usdValue)
                });
            }
        }
        double d;
        Object obj;
        NumberFormat numberformat;
        if (flag || !isLocalized())
        {
            obj = "USD";
        } else
        {
            obj = localizedCurrencyCode;
        }
        obj = Currency.getInstance(((String) (obj)));
        numberformat = NumberFormat.getCurrencyInstance(Locale.getDefault());
        numberformat.setCurrency(((Currency) (obj)));
        numberformat.setMaximumFractionDigits(((Currency) (obj)).getDefaultFractionDigits());
        if (flag || !isLocalized())
        {
            d = usdValue;
        } else
        {
            d = localizedValue;
        }
        if (flag1 && d == (double)(int)d)
        {
            numberformat.setMaximumFractionDigits(0);
        }
        return numberformat.format(d);
    }

    public void zeroOutValue()
    {
        usdValue = 0.0D;
        localizedValue = 0.0D;
    }
}
