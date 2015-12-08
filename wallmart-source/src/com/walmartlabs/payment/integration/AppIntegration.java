// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.integration;

import android.content.Context;
import android.content.Intent;

public interface AppIntegration
{

    public abstract Intent createSubmitToSaverIntent(Context context, String s, String s1);

    public abstract Intent createTermsIntent(Context context);

    public abstract Intent handleSubmitToSaverResult(Context context, int i, Intent intent);
}
