// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ar;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            e

public class Credential
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;
    private final List g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;

    Credential(int l, String s, String s1, String s2, String s3, Uri uri, List list, 
            String s4, String s5, String s6, String s7)
    {
        a = l;
        b = s;
        c = s1;
        d = (String)au.a(s2);
        e = s3;
        f = uri;
        if (list == null)
        {
            s = Collections.emptyList();
        } else
        {
            s = Collections.unmodifiableList(list);
        }
        g = s;
        h = s4;
        i = s5;
        j = s6;
        k = s7;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Credential))
            {
                return false;
            }
            obj = (Credential)obj;
            if (!TextUtils.equals(d, ((Credential) (obj)).d) || !TextUtils.equals(e, ((Credential) (obj)).e) || !ar.a(f, ((Credential) (obj)).f) || !TextUtils.equals(h, ((Credential) (obj)).h) || !TextUtils.equals(i, ((Credential) (obj)).i) || !TextUtils.equals(j, ((Credential) (obj)).j))
            {
                return false;
            }
        }
        return true;
    }

    public List f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public String h()
    {
        return j;
    }

    public int hashCode()
    {
        return ar.a(new Object[] {
            d, e, f, h, i, j
        });
    }

    public String i()
    {
        return i;
    }

    public String j()
    {
        return k;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.auth.api.credentials.e.a(this, parcel, l);
    }

}
