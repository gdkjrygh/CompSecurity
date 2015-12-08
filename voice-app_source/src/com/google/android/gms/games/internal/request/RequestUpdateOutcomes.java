// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes
{
    public static final class Builder
    {

        private int zzTS;
        private HashMap zzatx;

        public Builder zzfQ(int i)
        {
            zzTS = i;
            return this;
        }

        public RequestUpdateOutcomes zztD()
        {
            return new RequestUpdateOutcomes(zzTS, zzatx);
        }

        public Builder zzx(String s, int i)
        {
            if (RequestUpdateResultOutcome.isValid(i))
            {
                zzatx.put(s, Integer.valueOf(i));
            }
            return this;
        }

        public Builder()
        {
            zzatx = new HashMap();
            zzTS = 0;
        }
    }


    private static final String zzatw[] = {
        "requestId", "outcome"
    };
    private final int zzTS;
    private final HashMap zzatx;

    private RequestUpdateOutcomes(int i, HashMap hashmap)
    {
        zzTS = i;
        zzatx = hashmap;
    }


    public static RequestUpdateOutcomes zzX(DataHolder dataholder)
    {
        Builder builder = new Builder();
        builder.zzfQ(dataholder.getStatusCode());
        int j = dataholder.getCount();
        for (int i = 0; i < j; i++)
        {
            int k = dataholder.zzbh(i);
            builder.zzx(dataholder.zzd("requestId", i, k), dataholder.zzc("outcome", i, k));
        }

        return builder.zztD();
    }

    public Set getRequestIds()
    {
        return zzatx.keySet();
    }

    public int getRequestOutcome(String s)
    {
        zzu.zzb(zzatx.containsKey(s), (new StringBuilder()).append("Request ").append(s).append(" was not part of the update operation!").toString());
        return ((Integer)zzatx.get(s)).intValue();
    }

}
