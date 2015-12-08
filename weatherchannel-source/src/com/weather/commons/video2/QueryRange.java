// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Preconditions;

public final class QueryRange
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public QueryRange createFromParcel(Parcel parcel)
        {
            return new QueryRange(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public QueryRange[] newArray(int i)
        {
            return new QueryRange[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final int MAX_COUNT = 500;
    static final int MAX_START = 0x186a0;
    static final int MIN_COUNT = 1;
    private final int count;
    private final int start;

    public QueryRange(int i, int j)
    {
        boolean flag;
        if (i >= 0 && i <= 0x186a0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "start of %s, is not a reasonable starting index", new Object[] {
            Integer.valueOf(i)
        });
        if (j >= 1 && j <= 500)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "count of %s, is not a reasonable number to fetch", new Object[] {
            Integer.valueOf(j)
        });
        start = i;
        count = j;
    }

    public QueryRange(Parcel parcel)
    {
        this(parcel.readInt(), parcel.readInt());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (QueryRange)obj;
            if (start != ((QueryRange) (obj)).start)
            {
                return false;
            }
            if (count != ((QueryRange) (obj)).count)
            {
                return false;
            }
        }
        return true;
    }

    public int getCount()
    {
        return count;
    }

    public int getStart()
    {
        return start;
    }

    public int hashCode()
    {
        return start * 31 + count;
    }

    public QueryRange next()
    {
        return new QueryRange(start + count, count);
    }

    public QueryRange next(int i)
    {
        return new QueryRange(start + count, i);
    }

    public String toString()
    {
        return (new StringBuilder()).append("QueryRange{start=").append(start).append(", count=").append(count).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Preconditions.checkNotNull(parcel);
        parcel.writeInt(start);
        parcel.writeInt(count);
    }

}
