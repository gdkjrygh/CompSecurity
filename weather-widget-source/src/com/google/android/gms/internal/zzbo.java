// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.security.MessageDigest;

// Referenced classes of package com.google.android.gms.internal:
//            zzbl, zzbn

public class zzbo extends zzbl
{

    private MessageDigest zzsl;

    public zzbo()
    {
    }

    byte[] zza(String as[])
    {
        byte abyte0[] = new byte[as.length];
        for (int i = 0; i < as.length; i++)
        {
            abyte0[i] = zzj(zzbn.zzC(as[i]));
        }

        return abyte0;
    }

    byte zzj(int i)
    {
        return (byte)(i & 0xff ^ (0xff00 & i) >> 8 ^ (0xff0000 & i) >> 16 ^ (0xff000000 & i) >> 24);
    }

    public byte[] zzz(String s)
    {
        byte abyte0[];
        abyte0 = zza(s.split(" "));
        zzsl = zzcy();
        s = ((String) (zzpc));
        s;
        JVM INSTR monitorenter ;
        Object obj;
        if (zzsl == null)
        {
            return new byte[0];
        }
        zzsl.reset();
        zzsl.update(abyte0);
        obj = zzsl.digest();
        int i = 4;
        if (obj.length <= 4)
        {
            break MISSING_BLOCK_LABEL_94;
        }
_L1:
        byte abyte1[];
        abyte1 = new byte[i];
        System.arraycopy(obj, 0, abyte1, 0, abyte1.length);
        s;
        JVM INSTR monitorexit ;
        return abyte1;
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
        i = obj.length;
          goto _L1
    }
}
