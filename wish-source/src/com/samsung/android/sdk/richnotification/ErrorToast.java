// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import java.util.UUID;

final class ErrorToast
{

    private final String mMessage;
    private final UUID mUuid;

    public ErrorToast(UUID uuid, String s)
    {
        mUuid = uuid;
        mMessage = s;
    }

    UUID getUuid()
    {
        return mUuid;
    }
}
