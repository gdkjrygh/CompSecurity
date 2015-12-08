// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;

// Referenced classes of package com.google.android.gms.common.api:
//            Api

public static interface nt
{

    public abstract int getPriority();

    public abstract nt zza(Context context, Looper looper, zze zze, Object obj, iClient.ConnectionCallbacks connectioncallbacks, iClient.OnConnectionFailedListener onconnectionfailedlistener);
}
