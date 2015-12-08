// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            e

public final class ParticipantResult
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    public static final int MATCH_RESULT_DISAGREED = 5;
    public static final int MATCH_RESULT_DISCONNECT = 4;
    public static final int MATCH_RESULT_LOSS = 1;
    public static final int MATCH_RESULT_NONE = 3;
    public static final int MATCH_RESULT_TIE = 2;
    public static final int MATCH_RESULT_UNINITIALIZED = -1;
    public static final int MATCH_RESULT_WIN = 0;
    public static final int PLACING_UNINITIALIZED = -1;
    private final int AQ;
    private final int AR;
    private final int jE;
    private final String yH;

    public ParticipantResult(int i, String s, int j, int k)
    {
        jE = i;
        yH = (String)gi.a(s);
        j;
        JVM INSTR tableswitch 0 5: default 60
    //                   0 80
    //                   1 80
    //                   2 80
    //                   3 80
    //                   4 80
    //                   5 80;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        boolean flag = false;
_L4:
        gi.a(flag);
        AQ = j;
        AR = k;
        return;
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ParticipantResult(String s, int i, int j)
    {
        this(1, s, i, j);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getParticipantId()
    {
        return yH;
    }

    public final int getPlacing()
    {
        return AR;
    }

    public final int getResult()
    {
        return AQ;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel);
    }

}
