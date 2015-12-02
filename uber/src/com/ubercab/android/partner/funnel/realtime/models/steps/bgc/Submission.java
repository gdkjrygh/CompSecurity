// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.android.partner.funnel.realtime.models.steps.bgc:
//            Submit

public abstract class Submission
    implements Parcelable
{

    public Submission()
    {
    }

    public abstract Submit getSubmit();

    abstract Submission setSubmit(Submit submit);
}
