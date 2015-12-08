// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzdd

class zzvH
    implements android.content.nterface.OnClickListener
{

    final String zzvG;
    final String zzvH;
    final zzdd zzvI;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)zzdd.zza(zzvI).getSystemService("download");
        try
        {
            dialoginterface.enqueue(zzvI.zzg(zzvG, zzvH));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            zzvI.zzQ("Could not store picture.");
        }
    }

    Listener(zzdd zzdd1, String s, String s1)
    {
        zzvI = zzdd1;
        zzvG = s;
        zzvH = s1;
        super();
    }
}
