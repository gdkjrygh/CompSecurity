// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            zzae

class zzpo
    implements Runnable
{

    final View zzpo;
    final zzae zzpp;

    public void run()
    {
        zzpp.zzg(zzpo);
    }

    (zzae zzae1, View view)
    {
        zzpp = zzae1;
        zzpo = view;
        super();
    }
}
