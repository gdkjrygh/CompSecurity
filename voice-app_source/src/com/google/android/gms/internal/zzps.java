// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.signin.internal.zze;
import java.util.Set;

public interface zzps
    extends com.google.android.gms.common.api.Api.Client
{

    public abstract void connect();

    public abstract void zza(IAccountAccessor iaccountaccessor, Set set, zze zze);

    public abstract void zza(IAccountAccessor iaccountaccessor, boolean flag);

    public abstract void zza(zzq zzq);

    public abstract void zzxY();
}
