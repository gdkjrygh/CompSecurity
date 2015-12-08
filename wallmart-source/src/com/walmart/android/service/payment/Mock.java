// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.payment;

import com.walmartlabs.mockaroo.base.Mockaroo;
import com.walmartlabs.mockaroo.base.RequestMatch;
import java.util.HashMap;

public class Mock
{

    public Mock()
    {
    }

    private static void registerCreateResource(String s, String s1, String s2, String s3)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s, new RequestMatch(s1, s2, "POST"), s3);
    }

    private static void registerDeleteResource(String s, String s1, String s2, String s3)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s, new RequestMatch(s1, s2, "DELETE"), s3);
    }

    private static void registerGetResource(String s, String s1, String s2, String s3)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s, new RequestMatch(s1, s2, "GET"), s3);
    }

    public static void registerMocks(String s)
    {
        registerGetResource("get all cards", s, "v1/customer/card", "mock/customer/cards.resp");
        registerCreateResource("create gift card", s, "v1/customer/gift-card", "mock/customer/gift_card.resp");
        registerGetResource("get all gift cards", s, "v1/customer/gift-card", "mock/customer/gift_cards.resp");
        registerDeleteResource("delete gift card", s, "v1/customer/gift-card/\\d+", "mock/customer/delete.resp");
        registerPutResource("update gift card", s, "v1/customer/gift-card/\\d+", "mock/customer/gift_card.resp");
        registerCreateResource("create credit card", s, "v1/customer/credit-card", "mock/customer/credit_card.resp");
        registerGetResource("get all credit cards", s, "v1/customer/credit-card", "mock/customer/credit_cards.resp");
        registerDeleteResource("delete credit card", s, "v1/customer/credit-card/\\d+", "mock/customer/delete.resp");
        registerPutResource("update credit card", s, "v1/customer/credit-card/\\d+", "mock/customer/credit_card.resp");
        registerGetResource("get wmpay user", s, "v1/user", "mock/customer/user.resp");
        registerCreateResource("create wmpay user", s, "v1/user", "mock/customer/create_user.resp");
        Mockaroo.registerMockFromCompleteResponseFile("get wmpay user cards", new RequestMatch(s, "v1/user", "GET", new HashMap() {

            
            {
                put("related", "cards");
            }
        }), "mock/customer/user_related_cards.resp");
        registerCreateResource("update user cards", s, "v1/user/gift-cards", "mock/customer/user_update_cards.resp");
        Mockaroo.registerMockFromCompleteResponseFile("get wmpay last transaction", new RequestMatch(s, "v1/user", "GET", new HashMap() {

            
            {
                put("related", "lastTransaction");
            }
        }), "mock/customer/user_last_transaction.resp");
    }

    private static void registerPutResource(String s, String s1, String s2, String s3)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s, new RequestMatch(s1, s2, "PUT"), s3);
    }
}
