// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ag, CorpusId, f

public class PhraseAffinityCorpusSpec
    implements SafeParcelable
{

    public static final ag CREATOR = new ag();
    public final CorpusId corpus;
    final int jE;
    final Bundle ko;

    PhraseAffinityCorpusSpec(int i, CorpusId corpusid, Bundle bundle)
    {
        jE = i;
        corpus = corpusid;
        ko = bundle;
    }

    public PhraseAffinityCorpusSpec(String s, String s1, Map map)
    {
        this(1, new CorpusId(s, s1), new Bundle());
        for (s = map.entrySet().iterator(); s.hasNext(); ko.putInt((String)s1.getKey(), ((Integer)s1.getValue()).intValue()))
        {
            s1 = (java.util.Map.Entry)s.next();
        }

    }

    public static f builder()
    {
        return new f();
    }

    public int describeContents()
    {
        ag ag1 = CREATOR;
        return 0;
    }

    public Map getSectionWeights()
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = ko.keySet().iterator(); iterator.hasNext(); hashmap.put(s, Integer.valueOf(ko.getInt(s))))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ag ag1 = CREATOR;
        ag.a(this, parcel, i);
    }

}
