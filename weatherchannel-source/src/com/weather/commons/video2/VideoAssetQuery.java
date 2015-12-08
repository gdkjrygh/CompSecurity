// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.os.Parcel;
import com.google.common.base.Preconditions;
import java.util.Locale;

// Referenced classes of package com.weather.commons.video2:
//            RangedQuery, QueryRange

public final class VideoAssetQuery
    implements RangedQuery
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public VideoAssetQuery createFromParcel(Parcel parcel)
        {
            return new VideoAssetQuery(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public VideoAssetQuery[] newArray(int i)
        {
            return new VideoAssetQuery[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String QUERY_FORMAT = "%%3B%s%%3A%%24in%%28%%27%s%%27%%29";
    private final boolean isBaseline;
    private final QueryRange queryRange;
    private final String queryValue;
    private final String tagToQuery;

    public VideoAssetQuery(Parcel parcel)
    {
        Preconditions.checkNotNull(parcel);
        tagToQuery = parcel.readString();
        queryValue = parcel.readString();
        queryRange = (QueryRange)QueryRange.CREATOR.createFromParcel(parcel);
        isBaseline = ((Boolean)parcel.readValue(null)).booleanValue();
    }

    public VideoAssetQuery(String s, String s1, QueryRange queryrange, boolean flag)
    {
        tagToQuery = (String)Preconditions.checkNotNull(s);
        queryValue = (String)Preconditions.checkNotNull(s1);
        queryRange = (QueryRange)Preconditions.checkNotNull(queryrange);
        isBaseline = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (VideoAssetQuery)obj;
                    flag = flag1;
                    if (isBaseline == ((VideoAssetQuery) (obj)).isBaseline)
                    {
                        flag = flag1;
                        if (tagToQuery.equals(((VideoAssetQuery) (obj)).tagToQuery))
                        {
                            flag = flag1;
                            if (queryValue.equals(((VideoAssetQuery) (obj)).queryValue))
                            {
                                return queryRange.equals(((VideoAssetQuery) (obj)).queryRange);
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public QueryRange getQueryRange()
    {
        return queryRange;
    }

    public String getQueryString()
    {
        return String.format(Locale.US, "%%3B%s%%3A%%24in%%28%%27%s%%27%%29", new Object[] {
            tagToQuery, queryValue
        });
    }

    public int hashCode()
    {
        int j = tagToQuery.hashCode();
        int k = queryValue.hashCode();
        int l = queryRange.hashCode();
        int i;
        if (isBaseline)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return ((j * 31 + k) * 31 + l) * 31 + i;
    }

    public boolean isBaseline()
    {
        return isBaseline;
    }

    public volatile RangedQuery next()
    {
        return next();
    }

    public volatile RangedQuery next(int i)
    {
        return next(i);
    }

    public VideoAssetQuery next()
    {
        return new VideoAssetQuery(tagToQuery, queryValue, queryRange.next(), false);
    }

    public VideoAssetQuery next(int i)
    {
        return new VideoAssetQuery(tagToQuery, queryValue, queryRange.next(i), false);
    }

    public String toString()
    {
        return (new StringBuilder()).append("VideoAssetQuery{tagToQuery='").append(tagToQuery).append('\'').append(", queryValue='").append(queryValue).append('\'').append(", queryRange=").append(queryRange).append(", isBaseline=").append(isBaseline).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(tagToQuery);
        parcel.writeString(queryValue);
        queryRange.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(isBaseline));
    }

}
