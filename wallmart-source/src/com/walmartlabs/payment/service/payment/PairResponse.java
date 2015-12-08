// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;

import com.walmartlabs.payment.service.BaseResponse;
import java.util.List;

public class PairResponse extends BaseResponse
{
    public static class Data
    {

        public List items;

        public Data()
        {
        }
    }

    public static class Token
    {

        public String token;

        public Token()
        {
        }
    }


    public Data data;

    public PairResponse()
    {
    }
}
