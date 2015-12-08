// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.places.internal.zzm;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacesStatusCodes, PlaceLikelihood

public class PlaceLikelihoodBuffer extends AbstractDataBuffer
    implements Result
{
    public static class zza
    {

        static int zzhb(int i)
        {
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("invalid source: ").append(i).toString());

            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
                return i;
            }
        }
    }


    private final Context mContext;
    private final Status zzQA;
    private final int zzaDD;
    private final String zzaDy;

    public PlaceLikelihoodBuffer(DataHolder dataholder, int i, Context context)
    {
        super(dataholder);
        mContext = context;
        zzQA = PlacesStatusCodes.zzhg(dataholder.getStatusCode());
        zzaDD = zza.zzhb(i);
        if (dataholder != null && dataholder.zznP() != null)
        {
            zzaDy = dataholder.zznP().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
            return;
        } else
        {
            zzaDy = null;
            return;
        }
    }

    public PlaceLikelihood get(int i)
    {
        return new zzm(zzYX, i, mContext);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public CharSequence getAttributions()
    {
        return zzaDy;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("status", getStatus()).zzg("attributions", zzaDy).toString();
    }
}
