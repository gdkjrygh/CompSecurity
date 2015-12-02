// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;
import com.ubercab.android.partner.funnel.realtime.models.officehours.OfficeHours;
import com.ubercab.android.partner.funnel.realtime.models.steps.BaseStep;

// Referenced classes of package com.ubercab.android.partner.funnel.realtime.models.steps.bgc:
//            Display, Models, Submission

public abstract class BgcStep extends BaseStep
    implements Parcelable
{

    public static final String TYPE = "background_check";

    public BgcStep()
    {
    }

    public abstract Display getDisplay();

    public abstract Models getModels();

    public abstract OfficeHours getOfficeHours();

    public abstract Submission getSubmission();

    abstract BgcStep setDisplay(Display display);

    abstract BgcStep setModels(Models models);

    abstract BgcStep setOfficeHours(OfficeHours officehours);

    abstract BgcStep setSubmission(Submission submission);
}
