// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.ups;


// Referenced classes of package com.weather.dal2.ups:
//            Demographics

public interface DemographicsStorage
{

    public abstract Demographics getDemographics();

    public abstract void post();

    public abstract void write(Demographics demographics);
}
