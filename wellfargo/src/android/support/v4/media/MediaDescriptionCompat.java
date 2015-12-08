// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media:
//            a, b, c, d

public final class MediaDescriptionCompat
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final String a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence d;
    private final Bitmap e;
    private final Uri f;
    private final Bundle g;
    private Object h;

    private MediaDescriptionCompat(Parcel parcel)
    {
        a = parcel.readString();
        b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        e = (Bitmap)parcel.readParcelable(null);
        f = (Uri)parcel.readParcelable(null);
        g = parcel.readBundle();
    }

    MediaDescriptionCompat(Parcel parcel, a a1)
    {
        this(parcel);
    }

    private MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle)
    {
        a = s;
        b = charsequence;
        c = charsequence1;
        d = charsequence2;
        e = bitmap;
        f = uri;
        g = bundle;
    }

    MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
            a a1)
    {
        this(s, charsequence, charsequence1, charsequence2, bitmap, uri, bundle);
    }

    public static MediaDescriptionCompat a(Object obj)
    {
        if (obj == null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return null;
        } else
        {
            Object obj1 = new b();
            ((b) (obj1)).a(android.support.v4.media.c.a(obj));
            ((b) (obj1)).a(android.support.v4.media.c.b(obj));
            ((b) (obj1)).b(android.support.v4.media.c.c(obj));
            ((b) (obj1)).c(android.support.v4.media.c.d(obj));
            ((b) (obj1)).a(android.support.v4.media.c.e(obj));
            ((b) (obj1)).a(android.support.v4.media.c.f(obj));
            ((b) (obj1)).a(android.support.v4.media.c.g(obj));
            obj1 = ((b) (obj1)).a();
            obj1.h = obj;
            return ((MediaDescriptionCompat) (obj1));
        }
    }

    public Object a()
    {
        if (h != null || android.os.Build.VERSION.SDK_INT < 21)
        {
            return h;
        } else
        {
            Object obj = android.support.v4.media.d.a();
            android.support.v4.media.d.a(obj, a);
            android.support.v4.media.d.a(obj, b);
            android.support.v4.media.d.b(obj, c);
            android.support.v4.media.d.c(obj, d);
            android.support.v4.media.d.a(obj, e);
            android.support.v4.media.d.a(obj, f);
            android.support.v4.media.d.a(obj, g);
            h = android.support.v4.media.d.a(obj);
            return h;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append(", ").append(c).append(", ").append(d).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            parcel.writeString(a);
            TextUtils.writeToParcel(b, parcel, i);
            TextUtils.writeToParcel(c, parcel, i);
            TextUtils.writeToParcel(d, parcel, i);
            parcel.writeParcelable(e, i);
            parcel.writeParcelable(f, i);
            parcel.writeBundle(g);
            return;
        } else
        {
            android.support.v4.media.c.a(a(), parcel, i);
            return;
        }
    }

}
