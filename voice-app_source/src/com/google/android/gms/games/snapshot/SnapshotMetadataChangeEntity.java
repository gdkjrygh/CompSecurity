// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChange, SnapshotMetadataChangeCreator

public final class SnapshotMetadataChangeEntity extends SnapshotMetadataChange
    implements SafeParcelable
{

    public static final SnapshotMetadataChangeCreator CREATOR = new SnapshotMetadataChangeCreator();
    private final int zzCY;
    private final String zzakM;
    private final Long zzavn;
    private final Uri zzavp;
    private final Long zzavq;
    private BitmapTeleporter zzavr;

    SnapshotMetadataChangeEntity()
    {
        this(5, null, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(int i, String s, Long long1, BitmapTeleporter bitmapteleporter, Uri uri, Long long2)
    {
        boolean flag2 = true;
        boolean flag = true;
        super();
        zzCY = i;
        zzakM = s;
        zzavq = long1;
        zzavr = bitmapteleporter;
        zzavp = uri;
        zzavn = long2;
        if (zzavr != null)
        {
            if (zzavp != null)
            {
                flag = false;
            }
            zzu.zza(flag, "Cannot set both a URI and an image");
        } else
        if (zzavp != null)
        {
            boolean flag1;
            if (zzavr == null)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            zzu.zza(flag1, "Cannot set both a URI and an image");
            return;
        }
    }

    SnapshotMetadataChangeEntity(String s, Long long1, BitmapTeleporter bitmapteleporter, Uri uri, Long long2)
    {
        this(5, s, long1, bitmapteleporter, uri, long2);
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap getCoverImage()
    {
        if (zzavr == null)
        {
            return null;
        } else
        {
            return zzavr.zznc();
        }
    }

    public Uri getCoverImageUri()
    {
        return zzavp;
    }

    public String getDescription()
    {
        return zzakM;
    }

    public Long getPlayedTimeMillis()
    {
        return zzavq;
    }

    public Long getProgressValue()
    {
        return zzavn;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotMetadataChangeCreator.zza(this, parcel, i);
    }

    public BitmapTeleporter zztQ()
    {
        return zzavr;
    }

}
