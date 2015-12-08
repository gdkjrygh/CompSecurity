// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.device.authorization.api;

import android.os.Bundle;
import com.amazon.identity.auth.device.shared.APIListener;

public interface AuthorizationListener
    extends APIListener
{

    public abstract void onCancel(Bundle bundle);
}
