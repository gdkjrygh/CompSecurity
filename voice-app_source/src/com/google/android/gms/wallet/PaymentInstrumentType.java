// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import java.util.ArrayList;
import java.util.Arrays;

public final class PaymentInstrumentType
{

    public static final int AMEX = 3;
    public static final int CHROME_PROXY_CARD_TYPE = 2;
    public static final int DISCOVER = 4;
    public static final int JCB = 5;
    public static final int MASTER_CARD = 2;
    public static final int VISA = 1;

    public PaymentInstrumentType()
    {
    }

    public static ArrayList getAll()
    {
        return new ArrayList(Arrays.asList(new Integer[] {
            Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5)
        }));
    }
}
