// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.android.partner.funnel.realtime.models.steps.bgc:
//            Legal, Ssn

public abstract class Display
    implements Parcelable
{

    public Display()
    {
    }

    public abstract Legal getLegal();

    public abstract Ssn getSsn();

    abstract Display setLegal(Legal legal);

    abstract Display setSsn(Ssn ssn);
}
