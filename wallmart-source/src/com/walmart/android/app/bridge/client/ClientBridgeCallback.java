// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.client;

import com.walmart.android.app.bridge.ResultCallback;

public interface ClientBridgeCallback
{

    public abstract void openBrowser(String s);

    public abstract void showHome();

    public abstract void showItemPage(String s);

    public abstract void showOrderDetails(String s);

    public abstract void signin(String s, ResultCallback resultcallback);
}
