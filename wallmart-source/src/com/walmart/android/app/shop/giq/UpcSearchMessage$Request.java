// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.giq;

import com.coupons.mobile.networking.NetworkHandler;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app.shop.giq:
//            UpcSearchMessage

public static class PID extends com.coupons.mobile.networking.Request
{

    private static final String NAME = "GetItemInfoForCode";
    private static final String NAMESPACE = "http:/www.coupons.com/OfferServices/";
    protected static final String PARTNER_CODE = NetworkHandler.getPartnerCodeLoyaltyCard();
    private static String PID = NetworkHandler.getPID();
    private static final String SOAP_ACTION = "http:/www.coupons.com/OfferServices/GetItemInfoForCode";
    private static final String TARGET_URI = "FamilyCodeServiceEngine.asmx?op=GetItemInfoForCode";
    private static String targetUrl;

    public String getSoapAction()
    {
        return "http:/www.coupons.com/OfferServices/GetItemInfoForCode";
    }

    public String getSoapObjectName()
    {
        return "GetItemInfoForCode";
    }

    public String getSoapObjectNameSpace()
    {
        return "http:/www.coupons.com/OfferServices/";
    }

    public String getTargetURI()
    {
        return targetUrl;
    }

    public void setUPC(String s)
    {
        mValueMap.put("sUPC", s);
    }

    static 
    {
        targetUrl = (new StringBuilder()).append(NetworkHandler.CLIP_URL).append(NetworkHandler.CLIP_CONTEXT).append("FamilyCodeServiceEngine.asmx?op=GetItemInfoForCode").toString();
    }

    public uest()
    {
        mValueMap.put("sPartnerToken", PARTNER_CODE);
        mValueMap.put("nPID", PID);
    }
}
