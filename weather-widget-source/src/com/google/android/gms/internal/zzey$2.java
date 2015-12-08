// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzey

class zzzH
    implements android.content.nterface.OnClickListener
{

    final zzey zzzH;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zzzH.zzah("User canceled the download.");
    }

    Listener(zzey zzey1)
    {
        zzzH = zzey1;
        super();
    }
}
