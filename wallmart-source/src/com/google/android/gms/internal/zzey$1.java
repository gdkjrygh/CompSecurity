// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzey

class zzzG
    implements android.content.nterface.OnClickListener
{

    final String zzzF;
    final String zzzG;
    final zzey zzzH;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)zzey.zza(zzzH).getSystemService("download");
        try
        {
            dialoginterface.enqueue(zzzH.zzg(zzzF, zzzG));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            zzzH.zzah("Could not store picture.");
        }
    }

    Listener(zzey zzey1, String s, String s1)
    {
        zzzH = zzey1;
        zzzF = s;
        zzzG = s1;
        super();
    }
}
