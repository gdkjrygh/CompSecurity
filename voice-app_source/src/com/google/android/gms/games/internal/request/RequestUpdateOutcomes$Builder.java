// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.internal.request:
//            RequestUpdateOutcomes

public static final class zzTS
{

    private int zzTS;
    private HashMap zzatx;

    public zzTS zzfQ(int i)
    {
        zzTS = i;
        return this;
    }

    public RequestUpdateOutcomes zztD()
    {
        return new RequestUpdateOutcomes(zzTS, zzatx, null);
    }

    public zzatx zzx(String s, int i)
    {
        if (RequestUpdateResultOutcome.isValid(i))
        {
            zzatx.put(s, Integer.valueOf(i));
        }
        return this;
    }

    public Q()
    {
        zzatx = new HashMap();
        zzTS = 0;
    }
}
