// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import com.walmart.android.ui.Presenter;

public interface EReceiptItemPresenterFactory
{

    public abstract Presenter createPresenter(com.walmartlabs.ereceipt.service.EReceipt.Item item, long l);

    public abstract void launchRegistration();

    public abstract void launchSignIn();

    public abstract void startReturn(String s);
}
