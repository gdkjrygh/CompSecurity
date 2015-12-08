// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;


public interface AsyncCallback
{

    public abstract int getID();

    public abstract void onCancelled();

    public abstract void onFailure(Object obj, Object obj1);

    public abstract void onSuccess(Object obj);

    public abstract void setID(int i);
}
