// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.integration;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

public interface IntegrationProvider
{

    public abstract String getAnonymousEmail(Context context);

    public abstract int getListSelector();

    public abstract ViewGroup initAndGetViewLayout(AppCompatActivity appcompatactivity);
}
