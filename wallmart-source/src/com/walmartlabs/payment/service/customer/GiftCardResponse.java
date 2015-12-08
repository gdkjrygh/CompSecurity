// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.service.BaseResponse;

public class GiftCardResponse extends BaseResponse
{
    public static class Data
    {

        public GiftCard items[];

        public Data()
        {
        }
    }


    public Data data;

    public GiftCardResponse()
    {
    }
}
