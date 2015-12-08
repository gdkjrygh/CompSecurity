// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.storelocator;


public class InStoreCriteria
{

    public static final float MAX_ACCURACY = 100F;
    public static final float MAX_DISTANCE = 300F;

    private InStoreCriteria()
    {
    }

    public static boolean isInStore(float f, float f1)
    {
        return f <= 100F && f1 <= 300F;
    }
}
