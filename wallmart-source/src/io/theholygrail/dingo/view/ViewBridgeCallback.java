// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.view;


public interface ViewBridgeCallback
{
    public static interface OnAppearListener
    {

        public abstract void onAppear();
    }

    public static interface OnDisappearListener
    {

        public abstract void onDisappear();
    }


    public abstract void setOnAppear(OnAppearListener onappearlistener);

    public abstract void setOnDisappear(OnDisappearListener ondisappearlistener);

    public abstract void show();
}
