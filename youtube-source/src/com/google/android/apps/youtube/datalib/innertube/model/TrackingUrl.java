// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.a.a.a.a.tb;
import com.google.android.apps.youtube.a.a.h;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            aq

public class TrackingUrl
    implements Parcelable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new aq();
    private static final int NOT_SET = -1;
    public static final Set NO_CLIENT_PARAMS = Collections.emptySet();
    private final String baseUrl;
    private final Set clientParams;
    private final int elapsedMediaTimeSec;

    public TrackingUrl(tb tb1, Set set)
    {
        baseUrl = (String)c.a(tb1.b);
        clientParams = (Set)c.a(set);
        int i;
        if (tb1.c != 0)
        {
            i = tb1.c;
        } else
        {
            i = -1;
        }
        elapsedMediaTimeSec = i;
    }

    public TrackingUrl(h h1)
    {
        Object obj;
        if (h1.b())
        {
            obj = h1.a();
        } else
        {
            obj = "";
        }
        baseUrl = ((String) (obj));
        clientParams = new HashSet();
        int i;
        for (obj = h1.c().iterator(); ((Iterator) (obj)).hasNext(); clientParams.add(ClientParam.fromValue(i)))
        {
            i = ((Integer)((Iterator) (obj)).next()).intValue();
        }

        int k;
        if (h1.g())
        {
            k = h1.d();
        } else
        {
            k = 0;
        }
        elapsedMediaTimeSec = k;
    }

    public TrackingUrl(String s, Set set)
    {
        this(s, set, -1);
    }

    public TrackingUrl(String s, Set set, int i)
    {
        baseUrl = (String)c.a(s);
        clientParams = (Set)c.a(set);
        elapsedMediaTimeSec = i;
    }

    public int compareTo(TrackingUrl trackingurl)
    {
        if (elapsedMediaTimeSec != trackingurl.elapsedMediaTimeSec)
        {
            return elapsedMediaTimeSec >= trackingurl.elapsedMediaTimeSec ? 1 : -1;
        } else
        {
            return baseUrl.compareTo(trackingurl.baseUrl);
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TrackingUrl)obj);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!(obj instanceof TrackingUrl))
            {
                break label0;
            }
            obj = (TrackingUrl)obj;
            if (this != obj)
            {
                flag = flag1;
                if (((TrackingUrl) (obj)).compareTo(this) != 0)
                {
                    break label0;
                }
                flag = flag1;
                if (hashCode() != ((TrackingUrl) (obj)).hashCode())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public Uri getBaseUri()
    {
        return Uri.parse(baseUrl);
    }

    public Set getClientParams()
    {
        return clientParams;
    }

    public int getElapsedMediaTimeSec(int i)
    {
        if (elapsedMediaTimeSec == -1)
        {
            return i;
        } else
        {
            return elapsedMediaTimeSec;
        }
    }

    public int hashCode()
    {
        return ((baseUrl.hashCode() + 31) * 31 + clientParams.hashCode()) * 31 + elapsedMediaTimeSec;
    }

    public boolean shouldPingNow(long l)
    {
        return baseUrl.length() > 0 && elapsedMediaTimeSec >= 0 && (long)(elapsedMediaTimeSec * 1000) <= l;
    }

    public String toString()
    {
        return (new StringBuilder("@")).append(elapsedMediaTimeSec).append("s->").append(baseUrl).append(clientParams).toString();
    }

    public h toTrackingUrlProto()
    {
        h h1 = (new h()).a(baseUrl).b(elapsedMediaTimeSec);
        for (Iterator iterator = clientParams.iterator(); iterator.hasNext(); h1.a(((ClientParam)iterator.next()).value)) { }
        return h1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, toTrackingUrlProto());
    }


    private class ClientParam extends Enum
    {

        private static final ClientParam $VALUES[];
        public static final ClientParam C;
        public static final ClientParam CMT;
        public static final ClientParam CONN;
        public static final ClientParam CPN;
        public static final ClientParam MS;
        public static final ClientParam NO_OP;
        private final int value;

        public static ClientParam fromValue(int i)
        {
            ClientParam aclientparam[] = values();
            int l = aclientparam.length;
            for (int k = 0; k < l; k++)
            {
                ClientParam clientparam = aclientparam[k];
                if (clientparam.value == i)
                {
                    return clientparam;
                }
            }

            return NO_OP;
        }

        public static ClientParam valueOf(String s)
        {
            return (ClientParam)Enum.valueOf(com/google/android/apps/youtube/datalib/innertube/model/TrackingUrl$ClientParam, s);
        }

        public static ClientParam[] values()
        {
            return (ClientParam[])$VALUES.clone();
        }

        static 
        {
            MS = new ClientParam("MS", 0, -2);
            NO_OP = new ClientParam("NO_OP", 1, -1);
            C = new ClientParam("C", 2, 1);
            CPN = new ClientParam("CPN", 3, 2);
            CONN = new ClientParam("CONN", 4, 8);
            CMT = new ClientParam("CMT", 5, 10);
            $VALUES = (new ClientParam[] {
                MS, NO_OP, C, CPN, CONN, CMT
            });
        }


        private ClientParam(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

}
