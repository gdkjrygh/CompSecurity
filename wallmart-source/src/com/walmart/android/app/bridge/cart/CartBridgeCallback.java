// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.cart;


public interface CartBridgeCallback
{
    public static interface OnAppearListener
    {

        public abstract void onAppear();
    }


    public abstract void setOnAppear(OnAppearListener onappearlistener);
}
