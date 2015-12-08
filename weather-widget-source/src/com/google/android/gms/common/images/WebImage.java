// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//            zzb

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final int mVersionCode;
    private final Uri zzacb;
    private final int zznP;
    private final int zznQ;

    WebImage(int i, Uri uri, int j, int k)
    {
        mVersionCode = i;
        zzacb = uri;
        zznP = j;
        zznQ = k;
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
            if (!zzw.equal(zzacb, ((WebImage) (obj)).zzacb) || zznP != ((WebImage) (obj)).zznP || zznQ != ((WebImage) (obj)).zznQ)
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return zznQ;
    }

    public Uri getUrl()
    {
        return zzacb;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public int getWidth()
    {
        return zznP;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzacb, Integer.valueOf(zznP), Integer.valueOf(zznQ)
        });
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", zzacb.toString());
            jsonobject.put("width", zznP);
            jsonobject.put("height", zznQ);
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
            Integer.valueOf(zznP), Integer.valueOf(zznQ), zzacb.toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
