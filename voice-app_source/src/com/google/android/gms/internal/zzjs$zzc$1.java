// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzjs, zzju, zzjt

class zzTH
    implements zzo
{

    final zzjs zzTH;
    final nit> zzTK;

    public void zza(long l, int i, Object obj)
    {
        if (obj == null)
        {
            zzjt zzjt1;
            try
            {
                zzTK.tResult(new nit>(new Status(i, null, null), a(zzTK)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                zzTK.tResult(zzTK.p(new Status(13)));
            }
            break MISSING_BLOCK_LABEL_156;
        }
        obj = (zzju)obj;
        zzjt1 = ((zzju) (obj)).zzlH();
        if (zzjt1 == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        if (!zzf.zza("1.0.0", zzjt1.getVersion()))
        {
            zzTK.tResult(zzTK.p(new Status(2150, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", new Object[] {
                zzjt1.getVersion(), "1.0.0"
            }))));
            zzjs.zza(zzTK.TB, null);
            return;
        }
        break MISSING_BLOCK_LABEL_157;
        return;
        zzTK.tResult(new nit>(new Status(i, ((zzju) (obj)).zzlD(), null), a(zzTK)));
        return;
    }

    public void zzy(long l)
    {
        zzTK.tResult(zzTK.p(new Status(2103)));
    }

    ( , zzjs zzjs1)
    {
        zzTK = ;
        zzTH = zzjs1;
        super();
    }
}
