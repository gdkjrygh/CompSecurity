// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            EncryptCreditCardService

private static class <init>
{

    private final List mCallbacks;
    private final String mCc;
    private final String mCvv;
    private final String mUuid;

    public void addCallback(<init> <init>1)
    {
        mCallbacks.add(<init>1);
    }





    private Y(String s, String s1)
    {
        mCallbacks = new ArrayList();
        mCc = s;
        mCvv = s1;
        mUuid = UUID.randomUUID().toString();
    }

    mUuid(String s, String s1, mUuid muuid)
    {
        this(s, s1);
    }
}
