// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;

// Referenced classes of package com.google.android.gms.auth.api:
//            Auth

public static final class ation.zzRo
    implements com.google.android.gms.common.api.ion.zzRo
{
    public static class Builder
    {

        private PasswordSpecification zzQY;

        public Builder()
        {
            zzQY = PasswordSpecification.zzRo;
        }
    }


    private final String zzQX;
    private final PasswordSpecification zzQY;

    public Bundle zzli()
    {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", zzQX);
        bundle.putParcelable("password_specification", zzQY);
        return bundle;
    }
}
