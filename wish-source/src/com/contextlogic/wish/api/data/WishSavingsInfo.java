// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishLocalizedCurrencyValue

public class WishSavingsInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x4cca3e01627a4fc0L;
    private double percentOffLocalized;
    private double percentOffUsd;
    private WishLocalizedCurrencyValue savingsValue;

    public WishSavingsInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            savingsValue = new WishLocalizedCurrencyValue(jsonobject.getDouble("savings_value"), jsonobject.optJSONObject("localized_savings_value"));
            percentOffUsd = jsonobject.getDouble("percent_usd");
            percentOffLocalized = jsonobject.getDouble("percent_localized");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public double getPercentOff(boolean flag)
    {
        if (flag)
        {
            return percentOffUsd;
        } else
        {
            return percentOffLocalized;
        }
    }

    public WishLocalizedCurrencyValue getSavingsValue()
    {
        return savingsValue;
    }
}
