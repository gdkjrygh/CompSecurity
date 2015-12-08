// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;

import com.walmartlabs.payment.service.BaseResponse;
import java.util.List;

public class UserResponse extends BaseResponse
{
    public static class Data
    {

        public List giftCards;
        public String id;
        public String type;
        public boolean useGiftCardsFirst;

        public Data()
        {
        }
    }

    public static class UserGiftCard
    {

        public String id;
        public boolean optOut;

        public UserGiftCard()
        {
        }
    }


    public Data data;

    public UserResponse()
    {
    }
}
