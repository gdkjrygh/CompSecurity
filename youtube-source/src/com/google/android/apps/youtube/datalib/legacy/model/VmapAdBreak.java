// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            bh, TrackingPingAuthenticationSettings, VastAd, bj, 
//            bk

public final class VmapAdBreak
    implements Parcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new bh();
    private final String adBreakId;
    private final List ads;
    private final List breakEndPingUris;
    private final List breakStartPingUris;
    private final BreakType breakType;
    private final List errorPingUris;
    private final boolean isDisplayAdAllowed;
    private final boolean isForOffline;
    private final boolean isLinearAdAllowed;
    private final boolean isNonlinearAdAllowed;
    private final OffsetType offsetType;
    private final int offsetValue;
    private final String originalVideoId;
    private final TrackingPingAuthenticationSettings trackingDecoration;

    public VmapAdBreak(Parcel parcel)
    {
        OffsetType offsettype = OffsetType.values()[parcel.readInt()];
        int i = parcel.readInt();
        String s;
        String s1;
        List list;
        List list1;
        List list2;
        List list3;
        TrackingPingAuthenticationSettings trackingpingauthenticationsettings;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
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
        } else
        {
            flag1 = false;
        }
        if (parcel.readInt() == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        s = parcel.readString();
        s1 = parcel.readString();
        list = readAdBreakList(parcel);
        list1 = readUriList(parcel);
        list2 = readUriList(parcel);
        list3 = readUriList(parcel);
        trackingpingauthenticationsettings = (TrackingPingAuthenticationSettings)parcel.readParcelable(com/google/android/apps/youtube/datalib/legacy/model/TrackingPingAuthenticationSettings.getClassLoader());
        if (parcel.readInt() == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        this(offsettype, i, flag, flag1, flag2, s, s1, list, list1, list2, list3, trackingpingauthenticationsettings, flag3);
    }

    private VmapAdBreak(OffsetType offsettype, int i, boolean flag, boolean flag1, boolean flag2, String s, String s1, 
            List list, List list1, List list2, List list3, TrackingPingAuthenticationSettings trackingpingauthenticationsettings, boolean flag3)
    {
label0:
        {
            super();
            offsetType = (OffsetType)c.a(offsettype);
            breakStartPingUris = com.google.android.apps.youtube.common.e.c.a(list1);
            breakEndPingUris = com.google.android.apps.youtube.common.e.c.a(list2);
            errorPingUris = com.google.android.apps.youtube.common.e.c.a(list3);
            trackingDecoration = trackingpingauthenticationsettings;
            isLinearAdAllowed = flag;
            isNonlinearAdAllowed = flag1;
            isDisplayAdAllowed = flag2;
            adBreakId = c.a(s, "adBreakId must not be empty");
            originalVideoId = (String)c.a(s1, "originalVideoId must not be null");
            ads = com.google.android.apps.youtube.common.e.c.a(list);
            isForOffline = flag3;
            int j;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.a(flag, "offsetValue must be >= 0");
            if (offsettype == OffsetType.PRE_ROLL || offsettype == OffsetType.POST_ROLL)
            {
                j = 0;
            } else
            {
                j = i;
            }
            offsetValue = j;
            if (offsettype != OffsetType.PRE_ROLL && (offsettype != OffsetType.TIME || i != 0))
            {
                boolean flag5;
                if (offsettype == OffsetType.PERCENTAGE)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (i == 0)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                if (!(flag5 & j))
                {
                    break label0;
                }
            }
            breakType = BreakType.PRE_ROLL;
            return;
        }
label1:
        {
            if (offsettype != OffsetType.POST_ROLL)
            {
                boolean flag4;
                if (offsettype == OffsetType.PERCENTAGE)
                {
                    flag4 = true;
                } else
                {
                    flag4 = false;
                }
                if (i == 100)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if ((i & flag4) == 0)
                {
                    break label1;
                }
            }
            breakType = BreakType.POST_ROLL;
            return;
        }
        breakType = BreakType.MID_ROLL;
    }

    VmapAdBreak(OffsetType offsettype, int i, boolean flag, boolean flag1, boolean flag2, String s, String s1, 
            List list, List list1, List list2, List list3, TrackingPingAuthenticationSettings trackingpingauthenticationsettings, boolean flag3, bh bh1)
    {
        this(offsettype, i, flag, flag1, flag2, s, s1, list, list1, list2, list3, trackingpingauthenticationsettings, flag3);
    }

    public static VastAd firstPrerollAd(List list)
    {
        list = firstPrerollAdBreak(list);
        if (list == null)
        {
            return null;
        } else
        {
            return (VastAd)list.getAds().get(0);
        }
    }

    public static VmapAdBreak firstPrerollAdBreak(List list)
    {
        if (list == null)
        {
            return null;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            VmapAdBreak vmapadbreak = (VmapAdBreak)list.next();
            if (vmapadbreak.getBreakType() == BreakType.PRE_ROLL && vmapadbreak.getAds() != null && !vmapadbreak.getAds().isEmpty())
            {
                return vmapadbreak;
            }
        }

        return null;
    }

    private static List readAdBreakList(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, VastAd.CREATOR);
        return Collections.unmodifiableList(arraylist);
    }

    private static List readUriList(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, Uri.CREATOR);
        return Collections.unmodifiableList(arraylist);
    }

    public final bj buildUpon()
    {
        bj bj1 = (new bj()).a(getOffsetType()).a(getOffsetValue()).a(isLinearAdAllowed()).b(isNonlinearAdAllowed()).c(isDisplayAdAllowed()).a(getAdBreakId()).b(getOriginalVideoId()).a(getAds()).d(isForOffline());
        com.google.android.apps.youtube.datalib.legacy.model.bj.a(bj1, getBreakStartPingUris());
        com.google.android.apps.youtube.datalib.legacy.model.bj.b(bj1, getBreakEndPingUris());
        com.google.android.apps.youtube.datalib.legacy.model.bj.c(bj1, getErrorPingUris());
        return bj1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (VmapAdBreak)obj;
            if (getOffsetType() == ((VmapAdBreak) (obj)).getOffsetType() && getOffsetValue() == ((VmapAdBreak) (obj)).getOffsetValue() && isLinearAdAllowed() == ((VmapAdBreak) (obj)).isLinearAdAllowed() && isNonlinearAdAllowed() == ((VmapAdBreak) (obj)).isNonlinearAdAllowed() && isDisplayAdAllowed() == ((VmapAdBreak) (obj)).isDisplayAdAllowed() && b.a(getAdBreakId(), ((VmapAdBreak) (obj)).getAdBreakId()) && b.a(getOriginalVideoId(), ((VmapAdBreak) (obj)).getOriginalVideoId()) && b.a(getAds(), ((VmapAdBreak) (obj)).getAds()) && b.a(getBreakStartPingUris(), ((VmapAdBreak) (obj)).getBreakStartPingUris()) && b.a(getBreakEndPingUris(), ((VmapAdBreak) (obj)).getBreakEndPingUris()) && b.a(getErrorPingUris(), ((VmapAdBreak) (obj)).getErrorPingUris()) && b.a(getTrackingDecoration(), ((VmapAdBreak) (obj)).getTrackingDecoration()) && isForOffline() == ((VmapAdBreak) (obj)).isForOffline())
            {
                return true;
            }
        }
        return false;
    }

    public final String getAdBreakId()
    {
        return adBreakId;
    }

    public final List getAds()
    {
        return ads;
    }

    public final List getBreakEndPingUris()
    {
        return breakEndPingUris;
    }

    public final List getBreakStartPingUris()
    {
        return breakStartPingUris;
    }

    public final BreakType getBreakType()
    {
        return breakType;
    }

    public final volatile com.google.android.apps.youtube.datalib.legacy.a.b getConverter()
    {
        return getConverter();
    }

    public final bk getConverter()
    {
        return new bk(this);
    }

    public final List getErrorPingUris()
    {
        return errorPingUris;
    }

    public final OffsetType getOffsetType()
    {
        return offsetType;
    }

    public final int getOffsetValue()
    {
        return offsetValue;
    }

    public final String getOriginalVideoId()
    {
        return originalVideoId;
    }

    public final TrackingPingAuthenticationSettings getTrackingDecoration()
    {
        return trackingDecoration;
    }

    public final boolean isDisplayAdAllowed()
    {
        return isDisplayAdAllowed;
    }

    public final boolean isForOffline()
    {
        return isForOffline;
    }

    public final boolean isLinearAdAllowed()
    {
        return isLinearAdAllowed;
    }

    public final boolean isNonlinearAdAllowed()
    {
        return isNonlinearAdAllowed;
    }

    public final String toString()
    {
        String s1 = getAdBreakId();
        OffsetType offsettype = getOffsetType();
        int i = getOffsetValue();
        boolean flag = isLinearAdAllowed();
        boolean flag1 = isNonlinearAdAllowed();
        boolean flag2 = isDisplayAdAllowed();
        String s;
        if (getAds() != null)
        {
            s = Arrays.toString(getAds().toArray());
        } else
        {
            s = "none";
        }
        return String.format("VastAdBreak: [id=%s, offsetType=%s, offset:%s, allow:[l:%s , nl:%s, da:%s] ads: %s]", new Object[] {
            s1, offsettype, Integer.valueOf(i), Boolean.valueOf(flag), Boolean.valueOf(flag1), Boolean.valueOf(flag2), s
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(getOffsetType().ordinal());
        parcel.writeInt(getOffsetValue());
        if (isLinearAdAllowed())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isNonlinearAdAllowed())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isDisplayAdAllowed())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(getAdBreakId());
        parcel.writeString(getOriginalVideoId());
        parcel.writeTypedList(getAds());
        parcel.writeTypedList(getBreakStartPingUris());
        parcel.writeTypedList(getBreakEndPingUris());
        parcel.writeTypedList(getErrorPingUris());
        parcel.writeParcelable(getTrackingDecoration(), 0);
        if (isForOffline())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    private class OffsetType extends Enum
    {

        private static final OffsetType $VALUES[];
        public static final OffsetType PERCENTAGE;
        public static final OffsetType POSITIONAL;
        public static final OffsetType POST_ROLL;
        public static final OffsetType PRE_ROLL;
        public static final OffsetType TIME;
        public static final OffsetType UNKNOWN;

        public static OffsetType valueOf(String s)
        {
            return (OffsetType)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VmapAdBreak$OffsetType, s);
        }

        public static OffsetType[] values()
        {
            return (OffsetType[])$VALUES.clone();
        }

        static 
        {
            TIME = new OffsetType("TIME", 0);
            PERCENTAGE = new OffsetType("PERCENTAGE", 1);
            PRE_ROLL = new OffsetType("PRE_ROLL", 2);
            POST_ROLL = new OffsetType("POST_ROLL", 3);
            POSITIONAL = new OffsetType("POSITIONAL", 4);
            UNKNOWN = new OffsetType("UNKNOWN", 5);
            $VALUES = (new OffsetType[] {
                TIME, PERCENTAGE, PRE_ROLL, POST_ROLL, POSITIONAL, UNKNOWN
            });
        }

        private OffsetType(String s, int i)
        {
            super(s, i);
        }
    }


    private class BreakType extends Enum
    {

        private static final BreakType $VALUES[];
        public static final BreakType MID_ROLL;
        public static final BreakType POST_ROLL;
        public static final BreakType PRE_ROLL;
        private int val;

        public static BreakType valueOf(String s)
        {
            return (BreakType)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VmapAdBreak$BreakType, s);
        }

        public static BreakType[] values()
        {
            return (BreakType[])$VALUES.clone();
        }

        public final int value()
        {
            return val;
        }

        static 
        {
            PRE_ROLL = new BreakType("PRE_ROLL", 0, 1);
            MID_ROLL = new BreakType("MID_ROLL", 1, 2);
            POST_ROLL = new BreakType("POST_ROLL", 2, 3);
            $VALUES = (new BreakType[] {
                PRE_ROLL, MID_ROLL, POST_ROLL
            });
        }

        private BreakType(String s, int i, int j)
        {
            super(s, i);
            val = j;
        }
    }

}
