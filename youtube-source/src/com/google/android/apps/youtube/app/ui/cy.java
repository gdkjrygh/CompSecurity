// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class cy
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.values().length];
        try
        {
            a[com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ADDING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.ALREADY_ADDED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult.CANNOT_ADD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
