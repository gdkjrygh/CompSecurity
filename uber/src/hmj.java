// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ManagedBusinessProfileAttributes;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.ProfileTheme;
import java.util.List;

public interface hmj
    extends Profile
{

    public abstract void setBillingMode(String s);

    public abstract void setDefaultPaymentProfileUuid(String s);

    public abstract void setEmail(String s);

    public abstract void setIsExpensingEnabled(boolean flag);

    public abstract void setIsVerified(boolean flag);

    public abstract void setManagedBusinessProfileAttributes(ManagedBusinessProfileAttributes managedbusinessprofileattributes);

    public abstract void setMobile(String s);

    public abstract void setName(String s);

    public abstract void setSelectedSummaryPeriods(List list);

    public abstract void setTheme(ProfileTheme profiletheme);

    public abstract void setType(String s);

    public abstract void setUuid(String s);
}
