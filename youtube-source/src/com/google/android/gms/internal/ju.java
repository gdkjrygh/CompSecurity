// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            iy, gi, ge

public class ju
    implements SafeParcelable
{

    public static final iy CREATOR = new iy();
    public final int Lk;
    public final int Ll;
    public final String Lm;
    public final String Ln;
    public final boolean Lo;
    public final String packageName;
    public final int versionCode;

    ju(int i, String s, int j, int k, String s1, String s2, boolean flag)
    {
        versionCode = i;
        packageName = s;
        Lk = j;
        Ll = k;
        Lm = s1;
        Ln = s2;
        Lo = flag;
    }

    public ju(String s, int i, int j, String s1, String s2, boolean flag)
    {
        versionCode = 1;
        packageName = (String)gi.a(s);
        Lk = i;
        Ll = j;
        Lm = s1;
        Ln = s2;
        Lo = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof ju)
            {
                if (!packageName.equals(((ju) (obj = (ju)obj)).packageName) || Lk != ((ju) (obj)).Lk || Ll != ((ju) (obj)).Ll || !ge.a(Lm, ((ju) (obj)).Lm) || !ge.a(Ln, ((ju) (obj)).Ln) || Lo != ((ju) (obj)).Lo)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            packageName, Integer.valueOf(Lk), Integer.valueOf(Ll), Lm, Ln, Boolean.valueOf(Lo)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("package=").append(packageName).append(',');
        stringbuilder.append("versionCode=").append(versionCode).append(',');
        stringbuilder.append("logSource=").append(Ll).append(',');
        stringbuilder.append("uploadAccount=").append(Lm).append(',');
        stringbuilder.append("loggingId=").append(Ln).append(',');
        stringbuilder.append("logAndroidId=").append(Lo);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        iy.a(this, parcel);
    }

}
