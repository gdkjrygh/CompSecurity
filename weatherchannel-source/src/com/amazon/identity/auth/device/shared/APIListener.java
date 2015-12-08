// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.shared;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;

public interface APIListener
{

    public abstract void onError(AuthError autherror);

    public abstract void onSuccess(Bundle bundle);
}
