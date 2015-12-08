// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzi

class zzMf
    implements Runnable
{

    final zzMf zzMe;
    final ComponentName zzMf;

    public void run()
    {
        zzi.zza(zzMe.Ma, zzMf);
    }

    _cls9(_cls9 _pcls9, ComponentName componentname)
    {
        zzMe = _pcls9;
        zzMf = componentname;
        super();
    }
}
