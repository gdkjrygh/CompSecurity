// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.realtime.models.steps.bgc;

import android.os.Parcelable;
import java.util.ArrayList;

public abstract class Models
    implements Parcelable
{

    public Models()
    {
    }

    public abstract ArrayList getAuthorizations();

    public abstract ArrayList getDisclosures();

    abstract Models setAuthorizations(ArrayList arraylist);

    abstract Models setDisclosures(ArrayList arraylist);
}
