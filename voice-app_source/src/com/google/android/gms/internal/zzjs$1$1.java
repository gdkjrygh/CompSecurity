// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.internal.zzo;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzjs

class zzTC
    implements com.google.android.gms.cast.ageReceivedCallback
{

    final  zzTC;

    public void onMessageReceived(CastDevice castdevice, String s, String s1)
    {
        zzTC.TB.zzbB(s1);
    }

    agerClient(agerClient agerclient)
    {
        zzTC = agerclient;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzjs$1

/* anonymous class */
    class zzjs._cls1 extends zzjs.zzc
    {

        final zzjs zzTB;

        public void execute()
        {
            zzjs.zzc(zzTB).setMessageReceivedCallbacks(zzjs.zzb(zzTB), zzTB.getNamespace(), new zzjs._cls1._cls1(this));
            zzjs.zzd(zzTB);
            zzjs.zze(zzTB);
            zzjs.zza(zzTB, null, 1100, null, zzlA());
            return;
            Object obj;
            obj;
_L2:
            zzlA().zza(-1L, 8, null);
            return;
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

            
            {
                zzTB = zzjs1;
                super(zzjs1, gamemanagerclient);
            }
    }

}
