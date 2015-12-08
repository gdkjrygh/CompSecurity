// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.datalib.legacy.model.VastAd;

public class ad extends Exception
{

    public final VastAd ad;

    public (VastAd vastad, Exception exception)
    {
        super(exception);
        ad = vastad;
    }
}
