// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ae, e, b

public class PIMEUpdate
    implements SafeParcelable
{

    public static final ae CREATOR = new ae();
    public final long createdTimestamp;
    public final boolean inputByUser;
    final int jE;
    final byte kf[];
    final byte kg[];
    final Bundle kh;
    public final long score;
    public final int sourceClass;
    public final String sourceCorpusHandle;
    public final String sourcePackageName;

    PIMEUpdate(int i, byte abyte0[], byte abyte1[], int j, String s, String s1, boolean flag, 
            Bundle bundle, long l, long l1)
    {
        jE = i;
        kf = abyte0;
        kg = abyte1;
        sourceClass = j;
        sourcePackageName = s;
        sourceCorpusHandle = s1;
        inputByUser = flag;
        kh = bundle;
        score = l;
        createdTimestamp = l1;
    }

    public int describeContents()
    {
        ae ae1 = CREATOR;
        return 0;
    }

    public byte[] getContents()
    {
        return kf;
    }

    public e getTokenIterator()
    {
        return new e(this);
    }

    public b[] getTopLanguageScores()
    {
        if (kh == null)
        {
            return new b[0];
        }
        b ab[] = new b[kh.size()];
        Iterator iterator = kh.keySet().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            String s = (String)iterator.next();
            double d = kh.getDouble(s, 0.0D);
            if (d <= 0.0D)
            {
                d = 0.0D;
            }
            ab[i] = new b(s, d);
        }

        Arrays.sort(ab, b.a);
        return ab;
    }

    public byte[] getVarIntLengths()
    {
        return kg;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ae ae1 = CREATOR;
        ae.a(this, parcel);
    }

}
