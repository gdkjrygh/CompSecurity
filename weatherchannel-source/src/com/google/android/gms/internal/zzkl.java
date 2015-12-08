// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

// Referenced classes of package com.google.android.gms.internal:
//            zzkn, zzkm

public final class zzkl
{

    public static final Api API;
    public static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;
    public static final zzkm zzabj = new zzkn();

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new _cls1();
        API = new Api("Common.API", zzNY, zzNX, new Scope[0]);
    }

    /* member class not found */
    class _cls1 {}

}
