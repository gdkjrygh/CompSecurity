// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//            zzb

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final int zzCY;
    private final Uri zzZn;
    private final int zznM;
    private final int zznN;

    WebImage(int i, Uri uri, int j, int k)
    {
        zzCY = i;
        zzZn = uri;
        zznM = j;
        zznN = k;
    }

    public WebImage(Uri uri)
        throws IllegalArgumentException
    {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int j)
        throws IllegalArgumentException
    {
        this(1, uri, i, j);
        if (uri == null)
        {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException("width and height must not be negative");
        } else
        {
            return;
        }
    }

    public WebImage(JSONObject jsonobject)
        throws IllegalArgumentException
    {
        this(zzi(jsonobject), jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
    }

    private static Uri zzi(JSONObject jsonobject)
    {
        Uri uri = null;
        if (jsonobject.has("url"))
        {
            try
            {
                uri = Uri.parse(jsonobject.getString("url"));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                return null;
            }
        }
        return uri;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof WebImage))
            {
                return false;
            }
            obj = (WebImage)obj;
            if (!zzt.equal(zzZn, ((WebImage) (obj)).zzZn) || zznM != ((WebImage) (obj)).zznM || zznN != ((WebImage) (obj)).zznN)
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return zznN;
    }

    public Uri getUrl()
    {
        return zzZn;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int getWidth()
    {
        return zznM;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzZn, Integer.valueOf(zznM), Integer.valueOf(zznN)
        });
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", zzZn.toString());
            jsonobject.put("width", zznM);
            jsonobject.put("height", zznN);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public String toString()
    {
        return String.format("Image %dx%d %s", new Object[] {
            Integer.valueOf(zznM), Integer.valueOf(zznN), zzZn.toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
