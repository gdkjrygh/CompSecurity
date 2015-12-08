// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.content.Context;
import com.walmart.android.ui.Presenter;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderConfigurator;

public interface PharmacyStoreHelper
{

    public abstract String getHomeDeliveryPhoneNumber();

    public abstract String getPharmacyPhoneNumber(StoreData storedata);

    public abstract Presenter getStoreDetailPresenter(Activity activity, StoreData storedata);

    public abstract StoreFinderConfigurator getStoreFinderConfigurator(Context context);
}
