// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gtalkservice:
//            d, e

public final class Presence
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public static final int HAS_CAMERA_V1 = 4;
    public static final int HAS_PMUC_V1 = 8;
    public static final int HAS_VIDEO_V1 = 2;
    public static final int HAS_VOICE_V1 = 1;
    public static final int NO_CAPABILITIES = 0;
    public static final Presence OFFLINE = new Presence();
    private static final int STATUS_MIN_VERSION_FOR_INVISIBILITY = 2;
    private boolean mAllowInvisibility;
    private boolean mAvailable;
    private int mCapabilities;
    private List mDefaultStatusList;
    private List mDndStatusList;
    private boolean mInvisible;
    private Show mShow;
    private String mStatus;
    private int mStatusListContentsMax;
    private int mStatusListMax;
    private int mStatusMax;

    public Presence()
    {
        this(false, Show.NONE, null, 8);
    }

    public Presence(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        setStatusMax(parcel.readInt());
        setStatusListMax(parcel.readInt());
        setStatusListContentsMax(parcel.readInt());
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setAllowInvisibility(flag);
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setAvailable(flag);
        setShow((Show)Enum.valueOf(com/google/android/gtalkservice/Presence$Show, parcel.readString()));
        mStatus = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        setInvisible(flag);
        mDefaultStatusList = new ArrayList();
        parcel.readStringList(mDefaultStatusList);
        mDndStatusList = new ArrayList();
        parcel.readStringList(mDndStatusList);
        setCapabilities(parcel.readInt());
    }

    public Presence(Presence presence)
    {
        mStatusMax = presence.mStatusMax;
        mStatusListMax = presence.mStatusListMax;
        mStatusListContentsMax = presence.mStatusListContentsMax;
        mAllowInvisibility = presence.mAllowInvisibility;
        mAvailable = presence.mAvailable;
        mShow = presence.mShow;
        mStatus = presence.mStatus;
        mInvisible = presence.mInvisible;
        mDefaultStatusList = presence.mDefaultStatusList;
        mDndStatusList = presence.mDndStatusList;
        mCapabilities = presence.mCapabilities;
    }

    public Presence(boolean flag, Show show, String s, int i)
    {
        mAvailable = flag;
        mShow = show;
        mStatus = s;
        mInvisible = false;
        mDefaultStatusList = new ArrayList();
        mDndStatusList = new ArrayList();
        mCapabilities = i;
    }

    private boolean addToList(List list, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            if (((String)iterator.next()).trim().equals(s.trim()))
            {
                return false;
            }
        }

        int i = getStatusMax();
        String s1 = s;
        if (s.length() > i)
        {
            s1 = s.substring(0, i);
        }
        list.add(0, s1);
        checkListContentsLength(list);
        return true;
    }

    private List checkListContentsLength(List list)
    {
        int j = getStatusListContentsMax();
        int i = list.size();
        if (i > j)
        {
            for (i--; i >= j; i--)
            {
                list.remove(i);
            }

        }
        return list;
    }

    private boolean listEqual(List list, List list1)
    {
        int j = list.size();
        if (j != list1.size())
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (!((String)list.get(i)).equals((String)list1.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    private void setStatus(String s, boolean flag)
    {
        mStatus = s;
        if (!flag) goto _L2; else goto _L1
_L1:
        e.a[mShow.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 45
    //                   2 56;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        addToList(mDndStatusList, s);
        return;
_L4:
        addToList(mDefaultStatusList, s);
        return;
    }

    public final boolean allowInvisibility()
    {
        return mAllowInvisibility;
    }

    public final void clearStatusLists()
    {
        mDefaultStatusList.clear();
        mDndStatusList.clear();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Presence presence)
    {
_L2:
        return false;
        if (presence == null || mAvailable != presence.mAvailable || mShow != presence.mShow) goto _L2; else goto _L1
_L1:
        if (mStatus == null) goto _L4; else goto _L3
_L3:
        if (!mStatus.equals(presence.mStatus))
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        if (mInvisible == presence.mInvisible && mStatusMax == presence.mStatusMax && mStatusListMax == presence.mStatusListMax && mStatusListContentsMax == presence.mStatusListContentsMax && mAllowInvisibility == presence.mAllowInvisibility && listEqual(mDefaultStatusList, presence.mDefaultStatusList) && listEqual(mDndStatusList, presence.mDndStatusList) && mCapabilities == presence.mCapabilities)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (presence.mStatus == null) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L7
_L7:
        return false;
    }

    public final int getCapabilities()
    {
        return mCapabilities;
    }

    public final List getDefaultStatusList()
    {
        return new ArrayList(mDefaultStatusList);
    }

    public final List getDndStatusList()
    {
        return new ArrayList(mDndStatusList);
    }

    public final Show getShow()
    {
        return mShow;
    }

    public final String getStatus()
    {
        return mStatus;
    }

    public final int getStatusListContentsMax()
    {
        return mStatusListContentsMax;
    }

    public final int getStatusListMax()
    {
        return mStatusListMax;
    }

    public final int getStatusMax()
    {
        return mStatusMax;
    }

    public final boolean isAvailable()
    {
        return mAvailable;
    }

    public final boolean isInvisible()
    {
        return mInvisible;
    }

    public final String printDetails()
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{ available=");
        stringbuilder.append(mAvailable);
        stringbuilder.append(", show=");
        stringbuilder.append(mShow);
        stringbuilder.append(", ");
        Object obj;
        if (mStatus == null)
        {
            obj = "";
        } else
        {
            obj = mStatus;
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append((new StringBuilder(", invisible=")).append(mInvisible).toString());
        stringbuilder.append(", allowInvisible=");
        stringbuilder.append(mAllowInvisibility);
        stringbuilder.append(", caps=0x");
        stringbuilder.append(Integer.toHexString(mCapabilities));
        stringbuilder.append(", default={");
        if (mDefaultStatusList != null)
        {
            obj = mDefaultStatusList.iterator();
            for (int i = 0; ((Iterator) (obj)).hasNext(); i++)
            {
                String s = (String)((Iterator) (obj)).next();
                if (i > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(s);
            }

        }
        stringbuilder.append("}, dnd={");
        if (mDndStatusList != null)
        {
            Iterator iterator = mDndStatusList.iterator();
            for (int j = ((flag) ? 1 : 0); iterator.hasNext(); j++)
            {
                String s1 = (String)iterator.next();
                if (j > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(s1);
            }

        }
        stringbuilder.append("}");
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void setAllowInvisibility(boolean flag)
    {
        mAllowInvisibility = flag;
    }

    public final void setAvailable(boolean flag)
    {
        mAvailable = flag;
    }

    public final void setCapabilities(int i)
    {
        mCapabilities = i;
    }

    public final boolean setInvisible(boolean flag)
    {
        mInvisible = flag;
        return !flag || allowInvisibility();
    }

    public final void setShow(Show show)
    {
        mShow = show;
    }

    public final void setStatus(Show show, String s)
    {
        setShow(show);
        setStatus(s, true);
    }

    public final void setStatus(String s)
    {
        setStatus(s, false);
    }

    public final void setStatusListContentsMax(int i)
    {
        mStatusListContentsMax = i;
    }

    public final void setStatusListMax(int i)
    {
        mStatusListMax = i;
    }

    public final void setStatusMax(int i)
    {
        mStatusMax = i;
    }

    public final String toString()
    {
        if (!isAvailable())
        {
            return "UNAVAILABLE";
        }
        if (isInvisible())
        {
            return "INVISIBLE";
        }
        StringBuilder stringbuilder = new StringBuilder(40);
        if (mShow == Show.NONE)
        {
            stringbuilder.append("AVAILABLE(x)");
        } else
        {
            stringbuilder.append(mShow.toString());
        }
        if ((mCapabilities & 8) != 0)
        {
            stringbuilder.append(" pmuc-v1");
        }
        if ((mCapabilities & 1) != 0)
        {
            stringbuilder.append(" voice-v1");
        }
        if ((mCapabilities & 2) != 0)
        {
            stringbuilder.append(" video-v1");
        }
        if ((mCapabilities & 4) != 0)
        {
            stringbuilder.append(" camera-v1");
        }
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(getStatusMax());
        parcel.writeInt(getStatusListMax());
        parcel.writeInt(getStatusListContentsMax());
        if (allowInvisibility())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mAvailable)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(mShow.toString());
        parcel.writeString(mStatus);
        if (mInvisible)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeStringList(mDefaultStatusList);
        parcel.writeStringList(mDndStatusList);
        parcel.writeInt(getCapabilities());
    }


    private class Show extends Enum
    {

        private static final Show $VALUES[];
        public static final Show AVAILABLE;
        public static final Show AWAY;
        public static final Show DND;
        public static final Show EXTENDED_AWAY;
        public static final Show NONE;

        public static Show valueOf(String s)
        {
            return (Show)Enum.valueOf(com/google/android/gtalkservice/Presence$Show, s);
        }

        public static Show[] values()
        {
            return (Show[])$VALUES.clone();
        }

        static 
        {
            NONE = new Show("NONE", 0);
            AWAY = new Show("AWAY", 1);
            EXTENDED_AWAY = new Show("EXTENDED_AWAY", 2);
            DND = new Show("DND", 3);
            AVAILABLE = new Show("AVAILABLE", 4);
            $VALUES = (new Show[] {
                NONE, AWAY, EXTENDED_AWAY, DND, AVAILABLE
            });
        }

        private Show(String s, int i)
        {
            super(s, i);
        }
    }

}
