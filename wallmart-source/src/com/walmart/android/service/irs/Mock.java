// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.irs;

import com.walmartlabs.mockaroo.base.Mockaroo;
import com.walmartlabs.mockaroo.base.RequestMatch;

public class Mock
{

    public Mock()
    {
    }

    private static void registerMock(String s, String s1, String s2)
    {
        Mockaroo.registerMockFromCompleteResponseFile(s, new RequestMatch(s1, "/irs-ws/irs/3.0"), s2);
    }

    public static void registerMocks(String s)
    {
        registerMock("valid", s, "mock/irs/item_27678567");
        registerMock("fail - unknown/invalid item", s, "mock/irs/item_2767");
        registerMock("fail - status 503", s, "mock/irs/error_503");
    }
}
