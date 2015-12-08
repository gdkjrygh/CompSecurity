// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzjs, zzju, zzjt

public abstract class <init> extends <init>
{

    final zzjs zzTB;
    private GameManagerClient zzTJ;

    static GameManagerClient zza(<init> <init>1)
    {
        return <init>1.zzTJ;
    }

    public Result createFailedResult(Status status)
    {
        return zzp(status);
    }

    public com.google.android.gms.cast.games.erClient.GameManagerInstanceResult zzp(Status status)
    {
        return new <init>(status, null);
    }

    public agerClient(zzjs zzjs1, GameManagerClient gamemanagerclient)
    {
        zzTB = zzjs1;
        super(zzjs1);
        zzTJ = gamemanagerclient;
        zzTa = new zzo(zzjs1) {

            final zzjs zzTH;
            final zzjs.zzc zzTK;

            public void zza(long l, int i, Object obj)
            {
                if (obj == null)
                {
                    zzjt zzjt1;
                    try
                    {
                        zzTK.setResult(new zzjs.zzd(new Status(i, null, null), zzjs.zzc.zza(zzTK)));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        zzTK.setResult(zzTK.zzp(new Status(13)));
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
                    zzTK.setResult(zzTK.zzp(new Status(2150, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", new Object[] {
                        zzjt1.getVersion(), "1.0.0"
                    }))));
                    zzjs.zza(zzTK.zzTB, null);
                    return;
                }
                break MISSING_BLOCK_LABEL_157;
                return;
                zzTK.setResult(new zzjs.zzd(new Status(i, ((zzju) (obj)).zzlD(), null), zzjs.zzc.zza(zzTK)));
                return;
            }

            public void zzy(long l)
            {
                zzTK.setResult(zzTK.zzp(new Status(2103)));
            }

            
            {
                zzTK = zzjs.zzc.this;
                zzTH = zzjs1;
                super();
            }
        };
    }
}
