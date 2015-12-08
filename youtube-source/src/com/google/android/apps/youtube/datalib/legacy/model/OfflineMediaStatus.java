// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.util.SparseArray;

public final class OfflineMediaStatus extends Enum
{

    private static final OfflineMediaStatus $VALUES[];
    public static final OfflineMediaStatus ACTIVE;
    public static final OfflineMediaStatus CANNOT_OFFLINE;
    public static final OfflineMediaStatus COMPLETE;
    public static final OfflineMediaStatus DELETED;
    public static final OfflineMediaStatus DISK_READ_ERROR;
    public static final OfflineMediaStatus DISK_WRITE_ERROR;
    public static final OfflineMediaStatus FAILED_UNKNOWN;
    public static final OfflineMediaStatus NETWORK_READ_ERROR;
    public static final OfflineMediaStatus PAUSED;
    static final SparseArray lookup;
    private final boolean fatal;
    private final int value;

    private OfflineMediaStatus(String s, int i, int j, boolean flag)
    {
        super(s, i);
        value = j;
        fatal = flag;
    }

    public static OfflineMediaStatus fromValue(int i)
    {
        return (OfflineMediaStatus)lookup.get(i);
    }

    public static OfflineMediaStatus valueOf(String s)
    {
        return (OfflineMediaStatus)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/OfflineMediaStatus, s);
    }

    public static OfflineMediaStatus[] values()
    {
        return (OfflineMediaStatus[])$VALUES.clone();
    }

    public final boolean isFatal()
    {
        return fatal;
    }

    public final int value()
    {
        return value;
    }

    static 
    {
        int i = 0;
        DELETED = new OfflineMediaStatus("DELETED", 0, -1, false);
        COMPLETE = new OfflineMediaStatus("COMPLETE", 1, 0, false);
        ACTIVE = new OfflineMediaStatus("ACTIVE", 2, 1, false);
        FAILED_UNKNOWN = new OfflineMediaStatus("FAILED_UNKNOWN", 3, 2, true);
        DISK_WRITE_ERROR = new OfflineMediaStatus("DISK_WRITE_ERROR", 4, 3, true);
        DISK_READ_ERROR = new OfflineMediaStatus("DISK_READ_ERROR", 5, 4, true);
        NETWORK_READ_ERROR = new OfflineMediaStatus("NETWORK_READ_ERROR", 6, 5, false);
        CANNOT_OFFLINE = new OfflineMediaStatus("CANNOT_OFFLINE", 7, 6, true);
        PAUSED = new OfflineMediaStatus("PAUSED", 8, 7, false);
        $VALUES = (new OfflineMediaStatus[] {
            DELETED, COMPLETE, ACTIVE, FAILED_UNKNOWN, DISK_WRITE_ERROR, DISK_READ_ERROR, NETWORK_READ_ERROR, CANNOT_OFFLINE, PAUSED
        });
        lookup = new SparseArray();
        OfflineMediaStatus aofflinemediastatus[] = values();
        for (int j = aofflinemediastatus.length; i < j; i++)
        {
            OfflineMediaStatus offlinemediastatus = aofflinemediastatus[i];
            lookup.put(offlinemediastatus.value, offlinemediastatus);
        }

    }
}
