// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            af, ae

public final class SubtitleWindowSettings
    implements Parcelable, Serializable
{

    public static final int ANCHOR_BOTTOM = 32;
    public static final int ANCHOR_CENTER_HORIZONTAL = 2;
    public static final int ANCHOR_CENTER_VERTICAL = 16;
    public static final int ANCHOR_LEFT = 1;
    public static final int ANCHOR_POS_MAX = 100;
    public static final int ANCHOR_POS_MIN = 0;
    public static final int ANCHOR_RIGHT = 4;
    public static final int ANCHOR_TOP = 8;
    public static final android.os.Parcelable.Creator CREATOR = new af((byte)0);
    public static final int DEFAULT_ANCHOR_HORIZONTAL_POS = 50;
    public static final int DEFAULT_ANCHOR_POINT = 34;
    public static final int DEFAULT_ANCHOR_VERTICAL_POS = 95;
    public static final SubtitleWindowSettings DEFAULT_SUBTITLE_WINDOW_SETTINGS = new SubtitleWindowSettings(34, 50, 95, true, false);
    public final int anchorHorizontalPos;
    public final int anchorPoint;
    public final int anchorVerticalPos;
    public final boolean rollUp;
    public final boolean visible;

    public SubtitleWindowSettings(int i, int j, int k, boolean flag, boolean flag1)
    {
        boolean flag3 = true;
        super();
        boolean flag2;
        if (j >= 0 && j <= 100)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        c.a(flag2, (new StringBuilder("invalid anchorHorizontalPos: ")).append(j).toString());
        if (k >= 0 && k <= 100)
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
        c.a(flag2, (new StringBuilder("invalid anchorVerticalPos: ")).append(k).toString());
        anchorPoint = i;
        anchorHorizontalPos = j;
        anchorVerticalPos = k;
        visible = flag;
        rollUp = flag1;
    }

    private SubtitleWindowSettings(Parcel parcel)
    {
        boolean flag1 = false;
        int i = parcel.readInt();
        int j = parcel.readInt();
        int k = parcel.readInt();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (parcel.readInt() == 1)
        {
            flag1 = true;
        }
        this(i, j, k, flag, flag1);
    }

    SubtitleWindowSettings(Parcel parcel, ae ae)
    {
        this(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format("ap=%d, ah=%d, av=%d, vs=%b, sd=%b", new Object[] {
            Integer.valueOf(anchorPoint), Integer.valueOf(anchorHorizontalPos), Integer.valueOf(anchorVerticalPos), Boolean.valueOf(visible), Boolean.valueOf(rollUp)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(anchorPoint);
        parcel.writeInt(anchorHorizontalPos);
        parcel.writeInt(anchorVerticalPos);
        if (visible)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (rollUp)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
