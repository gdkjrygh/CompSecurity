// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AutocompletePrediction
    extends Freezable
{
    public static interface Substring
    {

        public abstract int getLength();

        public abstract int getOffset();
    }


    public abstract String getDescription();

    public abstract List getMatchedSubstrings();

    public abstract String getPlaceId();

    public abstract List getPlaceTypes();
}
