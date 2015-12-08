// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            MomentEntity, zzb

public final class zzc extends com.google.android.gms.common.data.zzc
    implements Moment
{

    private MomentEntity zzaIN;

    public zzc(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private MomentEntity zzxI()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzaIN == null)
        {
            byte abyte0[] = getByteArray("momentImpl");
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall(abyte0, 0, abyte0.length);
            parcel.setDataPosition(0);
            zzaIN = MomentEntity.CREATOR.zzfL(parcel);
            parcel.recycle();
        }
        this;
        JVM INSTR monitorexit ;
        return zzaIN;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object freeze()
    {
        return zzxH();
    }

    public String getId()
    {
        return zzxI().getId();
    }

    public ItemScope getResult()
    {
        return zzxI().getResult();
    }

    public String getStartDate()
    {
        return zzxI().getStartDate();
    }

    public ItemScope getTarget()
    {
        return zzxI().getTarget();
    }

    public String getType()
    {
        return zzxI().getType();
    }

    public boolean hasId()
    {
        return zzxI().hasId();
    }

    public boolean hasResult()
    {
        return zzxI().hasResult();
    }

    public boolean hasStartDate()
    {
        return zzxI().hasStartDate();
    }

    public boolean hasTarget()
    {
        return zzxI().hasTarget();
    }

    public boolean hasType()
    {
        return zzxI().hasType();
    }

    public MomentEntity zzxH()
    {
        return zzxI();
    }
}
