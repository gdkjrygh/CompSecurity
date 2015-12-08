// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ei;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.common.images:
//            g

public final class WebImage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final int jE;
    private final Uri sC;
    private final int v;
    private final int w;

    WebImage(int i, Uri uri, int j, int k)
    {
        jE = i;
        sC = uri;
        w = j;
        v = k;
    }

    public WebImage(Uri uri)
    {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int j)
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
    {
        this(f(jsonobject), jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
    }

    private static Uri f(JSONObject jsonobject)
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

    public final JSONObject aU()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("url", sC.toString());
            jsonobject.put("width", w);
            jsonobject.put("height", v);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof WebImage))
            {
                return false;
            }
            obj = (WebImage)obj;
            if (!ei.a(sC, ((WebImage) (obj)).sC) || w != ((WebImage) (obj)).w || v != ((WebImage) (obj)).v)
            {
                return false;
            }
        }
        return true;
    }

    public final int getHeight()
    {
        return v;
    }

    public final Uri getUrl()
    {
        return sC;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final int getWidth()
    {
        return w;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            sC, Integer.valueOf(w), Integer.valueOf(v)
        });
    }

    public final String toString()
    {
        return String.format("Image %dx%d %s", new Object[] {
            Integer.valueOf(w), Integer.valueOf(v), sC.toString()
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
