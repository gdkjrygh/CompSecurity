// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            aa, g, GlobalSearchApplicationInfo, Feature

public class GlobalSearchApplication
    implements SafeParcelable
{

    public static final aa CREATOR = new aa();
    public final GlobalSearchApplicationInfo appInfo;
    final int jE;
    final g jS[];

    GlobalSearchApplication(int i, GlobalSearchApplicationInfo globalsearchapplicationinfo, g ag[])
    {
        jE = i;
        appInfo = globalsearchapplicationinfo;
        jS = ag;
    }

    public GlobalSearchApplication(GlobalSearchApplicationInfo globalsearchapplicationinfo, Map map)
    {
        this(1, globalsearchapplicationinfo, n(map));
    }

    private static g[] n(Map map)
    {
        if (map == null)
        {
            return null;
        }
        g ag[] = new g[map.size()];
        map = map.entrySet().iterator();
        for (int i = 0; map.hasNext(); i++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            ag[i] = new g((String)gi.a(entry.getKey()), (Feature[])gi.a(entry.getValue()));
        }

        return ag;
    }

    public int describeContents()
    {
        aa aa1 = CREATOR;
        return 0;
    }

    public Feature[] getCorpusFeatures(String s)
    {
        if (jS != null)
        {
            for (int i = 0; i < jS.length; i++)
            {
                if (jS[i].corpusName.equals(s))
                {
                    return jS[i].features;
                }
            }

        }
        return null;
    }

    public Set getCorpusNames()
    {
        if (jS == null)
        {
            return Collections.emptySet();
        }
        HashSet hashset = new HashSet(jS.length);
        for (int i = 0; i < jS.length; i++)
        {
            hashset.add(jS[i].corpusName);
        }

        return hashset;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        aa aa1 = CREATOR;
        aa.a(this, parcel, i);
    }

}
