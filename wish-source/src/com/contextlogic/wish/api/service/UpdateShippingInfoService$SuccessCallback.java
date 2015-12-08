// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishShippingInfo;

// Referenced classes of package com.contextlogic.wish.api.service:
//            UpdateShippingInfoService

public static interface Q
{

    public abstract void onServiceSucceeded(WishShippingInfo wishshippinginfo, WishCart wishcart);
}
