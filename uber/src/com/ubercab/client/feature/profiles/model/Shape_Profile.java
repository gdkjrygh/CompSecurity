// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.model;

import com.ubercab.rider.realtime.model.ManagedBusinessProfileAttributes;
import com.ubercab.rider.realtime.model.ProfileTheme;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.profiles.model:
//            Profile

public final class Shape_Profile extends Profile
{

    private String billingMode;
    private String defaultPaymentProfileUuid;
    private String email;
    private boolean isExpensingEnabled;
    private boolean isVerified;
    private ManagedBusinessProfileAttributes managedBusinessProfileAttributes;
    private String mobile;
    private String name;
    private List selectedSummaryPeriods;
    private ProfileTheme theme;
    private String type;
    private String uuid;

    Shape_Profile()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Profile)obj;
            if (((Profile) (obj)).getBillingMode() == null ? getBillingMode() != null : !((Profile) (obj)).getBillingMode().equals(getBillingMode()))
            {
                return false;
            }
            if (((Profile) (obj)).getDefaultPaymentProfileUuid() == null ? getDefaultPaymentProfileUuid() != null : !((Profile) (obj)).getDefaultPaymentProfileUuid().equals(getDefaultPaymentProfileUuid()))
            {
                return false;
            }
            if (((Profile) (obj)).getEmail() == null ? getEmail() != null : !((Profile) (obj)).getEmail().equals(getEmail()))
            {
                return false;
            }
            if (((Profile) (obj)).getIsExpensingEnabled() != getIsExpensingEnabled())
            {
                return false;
            }
            if (((Profile) (obj)).getIsVerified() != getIsVerified())
            {
                return false;
            }
            if (((Profile) (obj)).getMobile() == null ? getMobile() != null : !((Profile) (obj)).getMobile().equals(getMobile()))
            {
                return false;
            }
            if (((Profile) (obj)).getName() == null ? getName() != null : !((Profile) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((Profile) (obj)).getSelectedSummaryPeriods() == null ? getSelectedSummaryPeriods() != null : !((Profile) (obj)).getSelectedSummaryPeriods().equals(getSelectedSummaryPeriods()))
            {
                return false;
            }
            if (((Profile) (obj)).getManagedBusinessProfileAttributes() == null ? getManagedBusinessProfileAttributes() != null : !((Profile) (obj)).getManagedBusinessProfileAttributes().equals(getManagedBusinessProfileAttributes()))
            {
                return false;
            }
            if (((Profile) (obj)).getTheme() == null ? getTheme() != null : !((Profile) (obj)).getTheme().equals(getTheme()))
            {
                return false;
            }
            if (((Profile) (obj)).getType() == null ? getType() != null : !((Profile) (obj)).getType().equals(getType()))
            {
                return false;
            }
            if (((Profile) (obj)).getUuid() == null ? getUuid() != null : !((Profile) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getBillingMode()
    {
        return billingMode;
    }

    public final String getDefaultPaymentProfileUuid()
    {
        return defaultPaymentProfileUuid;
    }

    public final String getEmail()
    {
        return email;
    }

    public final boolean getIsExpensingEnabled()
    {
        return isExpensingEnabled;
    }

    public final boolean getIsVerified()
    {
        return isVerified;
    }

    public final ManagedBusinessProfileAttributes getManagedBusinessProfileAttributes()
    {
        return managedBusinessProfileAttributes;
    }

    public final String getMobile()
    {
        return mobile;
    }

    public final String getName()
    {
        return name;
    }

    public final List getSelectedSummaryPeriods()
    {
        return selectedSummaryPeriods;
    }

    public final ProfileTheme getTheme()
    {
        return theme;
    }

    public final String getType()
    {
        return type;
    }

    public final String getUuid()
    {
        return uuid;
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        int j2 = 0;
        int i;
        int j;
        int k;
        char c;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (billingMode == null)
        {
            i = 0;
        } else
        {
            i = billingMode.hashCode();
        }
        if (defaultPaymentProfileUuid == null)
        {
            j = 0;
        } else
        {
            j = defaultPaymentProfileUuid.hashCode();
        }
        if (email == null)
        {
            k = 0;
        } else
        {
            k = email.hashCode();
        }
        if (isExpensingEnabled)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!isVerified)
        {
            c1 = '\u04D5';
        }
        if (mobile == null)
        {
            l = 0;
        } else
        {
            l = mobile.hashCode();
        }
        if (name == null)
        {
            i1 = 0;
        } else
        {
            i1 = name.hashCode();
        }
        if (selectedSummaryPeriods == null)
        {
            j1 = 0;
        } else
        {
            j1 = selectedSummaryPeriods.hashCode();
        }
        if (managedBusinessProfileAttributes == null)
        {
            k1 = 0;
        } else
        {
            k1 = managedBusinessProfileAttributes.hashCode();
        }
        if (theme == null)
        {
            l1 = 0;
        } else
        {
            l1 = theme.hashCode();
        }
        if (type == null)
        {
            i2 = 0;
        } else
        {
            i2 = type.hashCode();
        }
        if (uuid != null)
        {
            j2 = uuid.hashCode();
        }
        return (i2 ^ (l1 ^ (k1 ^ (j1 ^ (i1 ^ (l ^ ((c ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ c1) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j2;
    }

    final Profile setBillingMode(String s)
    {
        billingMode = s;
        return this;
    }

    public final Profile setDefaultPaymentProfileUuid(String s)
    {
        defaultPaymentProfileUuid = s;
        return this;
    }

    public final Profile setEmail(String s)
    {
        email = s;
        return this;
    }

    public final Profile setIsExpensingEnabled(boolean flag)
    {
        isExpensingEnabled = flag;
        return this;
    }

    final Profile setIsVerified(boolean flag)
    {
        isVerified = flag;
        return this;
    }

    public final Profile setManagedBusinessProfileAttributes(ManagedBusinessProfileAttributes managedbusinessprofileattributes)
    {
        managedBusinessProfileAttributes = managedbusinessprofileattributes;
        return this;
    }

    final Profile setMobile(String s)
    {
        mobile = s;
        return this;
    }

    public final Profile setName(String s)
    {
        name = s;
        return this;
    }

    public final Profile setSelectedSummaryPeriods(List list)
    {
        selectedSummaryPeriods = list;
        return this;
    }

    public final Profile setTheme(ProfileTheme profiletheme)
    {
        theme = profiletheme;
        return this;
    }

    final Profile setType(String s)
    {
        type = s;
        return this;
    }

    final Profile setUuid(String s)
    {
        uuid = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.feature.profiles.model.Profile{billingMode=")).append(billingMode).append(", defaultPaymentProfileUuid=").append(defaultPaymentProfileUuid).append(", email=").append(email).append(", isExpensingEnabled=").append(isExpensingEnabled).append(", isVerified=").append(isVerified).append(", mobile=").append(mobile).append(", name=").append(name).append(", selectedSummaryPeriods=").append(selectedSummaryPeriods).append(", managedBusinessProfileAttributes=").append(managedBusinessProfileAttributes).append(", theme=").append(theme).append(", type=").append(type).append(", uuid=").append(uuid).append("}").toString();
    }
}
