// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ad, CorpusId, CorpusScoringInfo

public class GlobalSearchQuerySpecification
    implements SafeParcelable
{

    public static final ad CREATOR = new ad();
    final int jE;
    final CorpusId jV[];
    final CorpusScoringInfo jW[];
    private final transient Map jX;
    private final transient Map jY;
    public final int scoringVerbosityLevel;

    GlobalSearchQuerySpecification(int i, CorpusId acorpusid[], int j, CorpusScoringInfo acorpusscoringinfo[])
    {
        boolean flag = false;
        super();
        jE = i;
        jV = acorpusid;
        scoringVerbosityLevel = j;
        jW = acorpusscoringinfo;
        if (acorpusid == null || acorpusid.length == 0)
        {
            jX = null;
        } else
        {
            jX = new HashMap();
            i = 0;
            while (i < acorpusid.length) 
            {
                Set set = (Set)jX.get(acorpusid[i].packageName);
                Object obj = set;
                if (set == null)
                {
                    obj = new HashSet();
                    jX.put(acorpusid[i].packageName, obj);
                }
                if (acorpusid[i].corpusName != null)
                {
                    ((Set) (obj)).add(acorpusid[i].corpusName);
                }
                i++;
            }
        }
        if (acorpusscoringinfo == null || acorpusscoringinfo.length == 0)
        {
            jY = null;
        } else
        {
            jY = new HashMap(acorpusscoringinfo.length);
            i = ((flag) ? 1 : 0);
            while (i < acorpusscoringinfo.length) 
            {
                jY.put(acorpusscoringinfo[i].corpus, acorpusscoringinfo[i]);
                i++;
            }
        }
    }

    public int describeContents()
    {
        ad ad1 = CREATOR;
        return 0;
    }

    public CorpusScoringInfo getCorpusScoringInfo(String s, String s1)
    {
        if (jY == null)
        {
            s1 = null;
        } else
        {
            CorpusScoringInfo corpusscoringinfo = (CorpusScoringInfo)jY.get(new CorpusId(s, s1));
            s1 = corpusscoringinfo;
            if (corpusscoringinfo == null)
            {
                return (CorpusScoringInfo)jY.get(new CorpusId(s, null));
            }
        }
        return s1;
    }

    public Collection getCorpusScoringInfos()
    {
        if (jY == null)
        {
            return Collections.emptyList();
        } else
        {
            return jY.values();
        }
    }

    public boolean shouldBeSearched(String s, String s1)
    {
        if (jX == null)
        {
            return true;
        }
        s = (Set)jX.get(s);
        return s != null && (s.isEmpty() || s.contains(s1));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ad ad1 = CREATOR;
        ad.a(this, parcel, i);
    }

}
