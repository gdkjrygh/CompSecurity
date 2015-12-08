// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzjs, zzju

public abstract class <init> extends <init>
{

    final zzjs zzTB;

    public Result createFailedResult(Status status)
    {
        return zzo(status);
    }

    public com.google.android.gms.cast.games.erClient.GameManagerResult zzo(Status status)
    {
        return new <init>(status, null, -1L, null);
    }

    public _cls1.zzTH(zzjs zzjs1)
    {
        zzTB = zzjs1;
        super(zzjs1);
        zzTa = new zzo(zzjs1) {

            final zzjs zzTH;
            final zzjs.zza zzTI;

            public void zza(long l, int i, Object obj)
            {
                if (obj == null)
                {
                    String s;
                    try
                    {
                        zzTI.setResult(new zzjs.zze(new Status(i, null, null), null, l, null));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        zzTI.setResult(zzTI.zzo(new Status(13)));
                    }
                    break MISSING_BLOCK_LABEL_135;
                }
                obj = (zzju)obj;
                s = ((zzju) (obj)).getPlayerId();
                if (i != 0 || s == null)
                {
                    break MISSING_BLOCK_LABEL_69;
                }
                zzjs.zza(zzTI.zzTB, s);
                zzTI.setResult(new zzjs.zze(new Status(i, ((zzju) (obj)).zzlD(), null), s, ((zzju) (obj)).getRequestId(), ((zzju) (obj)).getExtraMessageData()));
                return;
            }

            public void zzy(long l)
            {
                zzTI.setResult(zzTI.zzo(new Status(2103)));
            }

            
            {
                zzTI = zzjs.zza.this;
                zzTH = zzjs1;
                super();
            }
        };
    }
}
