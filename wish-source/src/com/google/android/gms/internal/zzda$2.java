// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzda

class zzvo
    implements android.content.nterface.OnClickListener
{

    final zzda zzvo;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zzvo.zzQ("Operation denied by user.");
    }

    Listener(zzda zzda1)
    {
        zzvo = zzda1;
        super();
    }
}
