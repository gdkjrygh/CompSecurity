// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.data;

import android.net.Uri;

public final class GamesDataChangeUris
{

    private static final Uri zzasD;
    public static final Uri zzasE;
    public static final Uri zzasF;

    public GamesDataChangeUris()
    {
    }

    static 
    {
        zzasD = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        zzasE = zzasD.buildUpon().appendPath("invitations").build();
        zzasF = zzasD.buildUpon().appendEncodedPath("players").build();
    }
}
