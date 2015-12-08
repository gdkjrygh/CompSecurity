// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ge;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            u

public class CorpusStatus
    implements SafeParcelable
{

    public static final u CREATOR = new u();
    final int jE;
    final boolean jF;
    final long jG;
    final long jH;
    final long jI;
    final Bundle jJ;
    final String jK;

    CorpusStatus()
    {
        this(2, false, 0L, 0L, 0L, null, null);
    }

    CorpusStatus(int i, boolean flag, long l, long l1, long l2, Bundle bundle, String s)
    {
        jE = i;
        jF = flag;
        jG = l;
        jH = l1;
        jI = l2;
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        jJ = bundle1;
        jK = s;
    }

    public int describeContents()
    {
        u u1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof CorpusStatus)
        {
            obj = (CorpusStatus)obj;
            flag = flag1;
            if (ge.a(Boolean.valueOf(jF), Boolean.valueOf(((CorpusStatus) (obj)).jF)))
            {
                flag = flag1;
                if (ge.a(Long.valueOf(jG), Long.valueOf(((CorpusStatus) (obj)).jG)))
                {
                    flag = flag1;
                    if (ge.a(Long.valueOf(jH), Long.valueOf(((CorpusStatus) (obj)).jH)))
                    {
                        flag = flag1;
                        if (ge.a(Long.valueOf(jI), Long.valueOf(((CorpusStatus) (obj)).jI)))
                        {
                            flag = flag1;
                            if (ge.a(getCounters(), ((CorpusStatus) (obj)).getCounters()))
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public boolean found()
    {
        return jF;
    }

    public long getCommittedNumDocuments()
    {
        return jI;
    }

    public int getCounter(String s)
    {
        return jJ.getInt(s, -1);
    }

    public Map getCounters()
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = jJ.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            int i = jJ.getInt(s, -1);
            if (i != -1)
            {
                hashmap.put(s, Integer.valueOf(i));
            }
        } while (true);
        return hashmap;
    }

    public long getLastCommittedSeqno()
    {
        return jH;
    }

    public long getLastIndexedSeqno()
    {
        return jG;
    }

    public String getVersion()
    {
        return jK;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Boolean.valueOf(jF), Long.valueOf(jG), Long.valueOf(jH), Long.valueOf(jI), getCounters()
        });
    }

    public String toString()
    {
        return (new StringBuilder("CorpusStatus{found=")).append(jF).append(", lastIndexedSeqno=").append(jG).append(", lastCommittedSeqno=").append(jH).append(", committedNumDocuments=").append(jI).append(", counters=").append(jJ).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        u u1 = CREATOR;
        u.a(this, parcel);
    }

}
