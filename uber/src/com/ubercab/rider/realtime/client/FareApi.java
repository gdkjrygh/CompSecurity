// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.ShoppingCartChargesBody;
import ica;

public interface FareApi
{

    public abstract ica postEatsEstimate(ShoppingCartChargesBody shoppingcartchargesbody);
}
