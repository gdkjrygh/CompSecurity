// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.data;


// Referenced classes of package com.weather.dal2.data:
//            Record

public interface WWIR
    extends Record
{

    public abstract String getBluntPhrase();

    public abstract Integer getOverallType();

    public abstract String getStandardPhrase();

    public abstract boolean hasNarrative();
}
