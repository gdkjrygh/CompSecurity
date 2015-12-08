// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

final class GetTokenClient extends PlatformServiceClient
{

    GetTokenClient(Context context, String s)
    {
        super(context, 0x10000, 0x10001, 0x133060d, s);
    }

    protected void populateRequestBundle(Bundle bundle)
    {
    }
}
