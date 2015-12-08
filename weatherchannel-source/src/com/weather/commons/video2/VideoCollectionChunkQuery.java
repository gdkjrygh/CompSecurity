// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.os.Parcel;
import com.google.common.base.Preconditions;
import com.weather.commons.video2.dsx.VideoValidation;
import com.weather.util.TwcPreconditions;
import com.weather.util.parsing.ValidationException;

// Referenced classes of package com.weather.commons.video2:
//            RangedQuery, QueryRange

public final class VideoCollectionChunkQuery
    implements RangedQuery
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public VideoCollectionChunkQuery createFromParcel(Parcel parcel)
        {
            return new VideoCollectionChunkQuery(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public VideoCollectionChunkQuery[] newArray(int i)
        {
            return new VideoCollectionChunkQuery[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final String collectionName;
    private final QueryRange queryRange;

    public VideoCollectionChunkQuery(Parcel parcel)
    {
        Preconditions.checkNotNull(parcel);
        collectionName = parcel.readString();
        queryRange = (QueryRange)QueryRange.CREATOR.createFromParcel(parcel);
    }

    public VideoCollectionChunkQuery(String s, QueryRange queryrange)
    {
        collectionName = TwcPreconditions.checkNotBlank(s);
        try
        {
            VideoValidation.validatePlaylistOrCollectionId("collectionName", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
        queryRange = (QueryRange)Preconditions.checkNotNull(queryrange);
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
                    obj = (VideoCollectionChunkQuery)obj;
                    flag = flag1;
                    if (collectionName.equals(((VideoCollectionChunkQuery) (obj)).collectionName))
                    {
                        return queryRange.equals(((VideoCollectionChunkQuery) (obj)).queryRange);
                    }
                }
            }
        }
        return flag;
    }

    public String getCollectionName()
    {
        return collectionName;
    }

    public QueryRange getQueryRange()
    {
        return queryRange;
    }

    public int hashCode()
    {
        return collectionName.hashCode() * 31 + queryRange.hashCode();
    }

    public boolean isBaseline()
    {
        return false;
    }

    public volatile RangedQuery next()
    {
        return next();
    }

    public volatile RangedQuery next(int i)
    {
        return next(i);
    }

    public VideoCollectionChunkQuery next()
    {
        return new VideoCollectionChunkQuery(collectionName, queryRange.next());
    }

    public VideoCollectionChunkQuery next(int i)
    {
        return new VideoCollectionChunkQuery(collectionName, queryRange.next(i));
    }

    public String toString()
    {
        return (new StringBuilder()).append("VideoPlaylistQuery{collectionName='").append(collectionName).append('\'').append(", queryRange=").append(queryRange).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(collectionName);
        queryRange.writeToParcel(parcel, i);
    }

}
