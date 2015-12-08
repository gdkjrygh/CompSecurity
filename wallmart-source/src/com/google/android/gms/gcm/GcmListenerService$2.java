// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.AsyncTask;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmListenerService

class val.intent extends AsyncTask
{

    final Intent val$intent;
    final GcmListenerService zzazF;

    protected Object doInBackground(Object aobj[])
    {
        return zzb((Void[])aobj);
    }

    protected transient Void zzb(Void avoid[])
    {
        GcmListenerService.zza(zzazF, val$intent);
        return null;
    }

    (Intent intent1)
    {
        zzazF = final_gcmlistenerservice;
        val$intent = intent1;
        super();
    }
}
