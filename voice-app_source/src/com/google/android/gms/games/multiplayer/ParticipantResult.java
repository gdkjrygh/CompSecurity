// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.constants.MatchResult;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantResultCreator

public final class ParticipantResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ParticipantResultCreator();
    public static final int MATCH_RESULT_DISAGREED = 5;
    public static final int MATCH_RESULT_DISCONNECT = 4;
    public static final int MATCH_RESULT_LOSS = 1;
    public static final int MATCH_RESULT_NONE = 3;
    public static final int MATCH_RESULT_TIE = 2;
    public static final int MATCH_RESULT_UNINITIALIZED = -1;
    public static final int MATCH_RESULT_WIN = 0;
    public static final int PLACING_UNINITIALIZED = -1;
    private final int zzCY;
    private final String zzapO;
    private final int zzauo;
    private final int zzaup;

    public ParticipantResult(int i, String s, int j, int k)
    {
        zzCY = i;
        zzapO = (String)zzu.zzu(s);
        zzu.zzU(MatchResult.isValid(j));
        zzauo = j;
        zzaup = k;
    }

    public ParticipantResult(String s, int i, int j)
    {
        this(1, s, i, j);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getParticipantId()
    {
        return zzapO;
    }

    public int getPlacing()
    {
        return zzaup;
    }

    public int getResult()
    {
        return zzauo;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParticipantResultCreator.zza(this, parcel, i);
    }

}
