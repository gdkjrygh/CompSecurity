// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.form.model;

import android.os.Parcelable;
import hnx;
import hny;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.form.model:
//            Shape_Name

public abstract class Name extends hnx
    implements Parcelable
{

    public Name()
    {
    }

    public static Name create()
    {
        return new Shape_Name();
    }

    public abstract String getCompleteName();

    public abstract String getFirstName();

    public abstract boolean getIsCjkName();

    public abstract String getLastName();

    protected Object onGet(hny hny, Object obj)
    {
        switch (_cls1..SwitchMap.com.ubercab.android.partner.funnel.signup.form.model.Shape_Name.Property[((Shape_Name.Property)hny).ordinal()])
        {
        default:
            return obj;

        case 1: // '\001'
            break;
        }
        if (getIsCjkName())
        {
            return getFirstName();
        } else
        {
            return String.format("%s %s", new Object[] {
                getFirstName(), getLastName()
            });
        }
    }

    abstract Name setCompleteName(String s);

    public abstract Name setFirstName(String s);

    public abstract Name setIsCjkName(boolean flag);

    public abstract Name setLastName(String s);

    /* member class not found */
    class _cls1 {}

}
