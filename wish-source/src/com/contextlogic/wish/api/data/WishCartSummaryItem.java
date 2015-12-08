// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.user.UserStatusManager;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishLocalizedCurrencyValue

public class WishCartSummaryItem
    implements Serializable
{

    public static final int CHARGE = 1;
    public static final int CREDIT = 2;
    public static final int SHIPPING = 3;
    public static final int TOTAL = 4;
    private static final long serialVersionUID = 0xd4120894e9ea6159L;
    private WishLocalizedCurrencyValue approxValue;
    private WishLocalizedCurrencyValue currencyValue;
    private String name;
    private int type;

    public WishCartSummaryItem(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            type = jsonobject.getInt("type");
            name = jsonobject.getString("name");
            currencyValue = new WishLocalizedCurrencyValue(jsonobject.getDouble("value"), jsonobject.getJSONObject("localized_value"));
            approxValue = new WishLocalizedCurrencyValue(jsonobject.getDouble("value"), jsonobject.optJSONObject("approx_value"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public WishLocalizedCurrencyValue getApproxValue()
    {
        return approxValue;
    }

    public WishLocalizedCurrencyValue getCurrencyValue()
    {
        return currencyValue;
    }

    public String getName()
    {
        return name;
    }

    public int getType()
    {
        return type;
    }

    public String getValue()
    {
        String s;
        if (currencyValue.getValue() <= 0.0D)
        {
            s = WishApplication.getAppInstance().getString(0x7f0601e1);
        } else
        {
            boolean flag = UserStatusManager.getInstance().getBucketForExperiment("mobile_psuedo_localized_currency").equals("show");
            String s1 = currencyValue.toFormattedString(flag, false);
            s = s1;
            if (type == 2)
            {
                return String.format(WishApplication.getAppInstance().getString(0x7f0600c4), new Object[] {
                    s1
                });
            }
        }
        return s;
    }
}
