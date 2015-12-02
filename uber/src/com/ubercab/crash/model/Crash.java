// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;

import android.os.Bundle;
import android.os.Parcelable;

// Referenced classes of package com.ubercab.crash.model:
//            Shape_Crash

public abstract class Crash
    implements Parcelable
{

    public Crash()
    {
    }

    public static Crash create(Bundle bundle, String s)
    {
        return (new Shape_Crash()).setExperimentTreatments(bundle).setCrashId(s);
    }

    public void addExperimentTreatment(String s, Boolean boolean1)
    {
        if (getExperimentTreatments() == null)
        {
            setExperimentTreatments(new Bundle());
        }
        Bundle bundle = getExperimentTreatments();
        boolean flag;
        if (boolean1 != null)
        {
            flag = boolean1.booleanValue();
        } else
        {
            flag = false;
        }
        bundle.putBoolean(s, flag);
    }

    public abstract String getCrashId();

    public abstract Bundle getExperimentTreatments();

    public abstract String getStackTrace();

    public boolean isExperimentOn(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (getExperimentTreatments() != null)
        {
            flag = flag1;
            if (getExperimentTreatments().getBoolean(s, false))
            {
                flag = true;
            }
        }
        return flag;
    }

    public abstract Crash setCrashId(String s);

    public abstract Crash setExperimentTreatments(Bundle bundle);

    public abstract Crash setStackTrace(String s);
}
