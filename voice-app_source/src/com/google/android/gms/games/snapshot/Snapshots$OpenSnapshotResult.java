// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            Snapshots, Snapshot, SnapshotContents

public static interface 
    extends Result
{

    public abstract String getConflictId();

    public abstract Snapshot getConflictingSnapshot();

    public abstract SnapshotContents getResolutionSnapshotContents();

    public abstract Snapshot getSnapshot();
}
