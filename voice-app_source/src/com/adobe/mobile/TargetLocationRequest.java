// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Map;

public class TargetLocationRequest
{

    public static final String TARGET_PARAMETER_CATEGORY_ID = "categoryId";
    public static final String TARGET_PARAMETER_MBOX_3RDPARTY_ID = "mbox3rdPartyId";
    public static final String TARGET_PARAMETER_MBOX_HOST = "mboxHost";
    public static final String TARGET_PARAMETER_MBOX_PAGE_VALUE = "mboxPageValue";
    public static final String TARGET_PARAMETER_MBOX_PC = "mboxPC";
    public static final String TARGET_PARAMETER_MBOX_SESSION_ID = "mboxSession";
    public static final String TARGET_PARAMETER_ORDER_ID = "orderId";
    public static final String TARGET_PARAMETER_ORDER_TOTAL = "orderTotal";
    public static final String TARGET_PARAMETER_PRODUCT_PURCHASE_ID = "productPurchasedId";
    public String defaultContent;
    public String name;
    public HashMap parameters;

    protected TargetLocationRequest(String s, String s1, Map map)
    {
        name = s;
        defaultContent = s1;
        if (map != null)
        {
            s = new HashMap(map);
        } else
        {
            s = new HashMap();
        }
        parameters = s;
    }

    protected static TargetLocationRequest createRequestWithOrderConfirm(String s, String s1, String s2, String s3, Map map)
    {
        s = new TargetLocationRequest(s, "none", map);
        if (s1 != null)
        {
            ((TargetLocationRequest) (s)).parameters.put("orderId", s1);
        }
        if (s2 != null)
        {
            ((TargetLocationRequest) (s)).parameters.put("orderTotal", s2);
        }
        if (s3 != null)
        {
            ((TargetLocationRequest) (s)).parameters.put("productPurchasedId", s3);
        }
        return s;
    }
}
