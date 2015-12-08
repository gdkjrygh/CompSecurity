// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzd;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.internal.model.people.zzk;

// Referenced classes of package com.google.android.gms.plus.model.people:
//            Person

public final class PersonBuffer extends AbstractDataBuffer
{

    private final zzd zzaBj;

    public PersonBuffer(DataHolder dataholder)
    {
        super(dataholder);
        if (dataholder.zzll() != null && dataholder.zzll().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false))
        {
            zzaBj = new zzd(dataholder, PersonEntity.CREATOR);
            return;
        } else
        {
            zzaBj = null;
            return;
        }
    }

    public Person get(int i)
    {
        if (zzaBj != null)
        {
            return (Person)zzaBj.zzaC(i);
        } else
        {
            return new zzk(zzPy, i);
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
