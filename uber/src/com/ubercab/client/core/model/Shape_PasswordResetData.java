// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            PasswordResetData, PasswordResetCommonData, PasswordResetNameVerifyData, PasswordResetNewPasswordData, 
//            PasswordResetTokenVerifyData, PasswordResetTripVerifyData

public final class Shape_PasswordResetData extends PasswordResetData
{

    private PasswordResetCommonData commonData;
    private PasswordResetNameVerifyData nameVerifyData;
    private PasswordResetNewPasswordData newPasswordData;
    private String phoneNumberE164;
    private String state;
    private PasswordResetTokenVerifyData tokenVerifyData;
    private PasswordResetTripVerifyData tripVerifyData;

    Shape_PasswordResetData()
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
            obj = (PasswordResetData)obj;
            if (((PasswordResetData) (obj)).getPhoneNumberE164() == null ? getPhoneNumberE164() != null : !((PasswordResetData) (obj)).getPhoneNumberE164().equals(getPhoneNumberE164()))
            {
                return false;
            }
            if (((PasswordResetData) (obj)).getState() == null ? getState() != null : !((PasswordResetData) (obj)).getState().equals(getState()))
            {
                return false;
            }
            if (((PasswordResetData) (obj)).getCommonData() == null ? getCommonData() != null : !((PasswordResetData) (obj)).getCommonData().equals(getCommonData()))
            {
                return false;
            }
            if (((PasswordResetData) (obj)).getNameVerifyData() == null ? getNameVerifyData() != null : !((PasswordResetData) (obj)).getNameVerifyData().equals(getNameVerifyData()))
            {
                return false;
            }
            if (((PasswordResetData) (obj)).getTokenVerifyData() == null ? getTokenVerifyData() != null : !((PasswordResetData) (obj)).getTokenVerifyData().equals(getTokenVerifyData()))
            {
                return false;
            }
            if (((PasswordResetData) (obj)).getTripVerifyData() == null ? getTripVerifyData() != null : !((PasswordResetData) (obj)).getTripVerifyData().equals(getTripVerifyData()))
            {
                return false;
            }
            if (((PasswordResetData) (obj)).getNewPasswordData() == null ? getNewPasswordData() != null : !((PasswordResetData) (obj)).getNewPasswordData().equals(getNewPasswordData()))
            {
                return false;
            }
        }
        return true;
    }

    public final PasswordResetCommonData getCommonData()
    {
        return commonData;
    }

    public final PasswordResetNameVerifyData getNameVerifyData()
    {
        return nameVerifyData;
    }

    public final PasswordResetNewPasswordData getNewPasswordData()
    {
        return newPasswordData;
    }

    public final String getPhoneNumberE164()
    {
        return phoneNumberE164;
    }

    public final String getState()
    {
        return state;
    }

    public final PasswordResetTokenVerifyData getTokenVerifyData()
    {
        return tokenVerifyData;
    }

    public final PasswordResetTripVerifyData getTripVerifyData()
    {
        return tripVerifyData;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (phoneNumberE164 == null)
        {
            i = 0;
        } else
        {
            i = phoneNumberE164.hashCode();
        }
        if (state == null)
        {
            j = 0;
        } else
        {
            j = state.hashCode();
        }
        if (commonData == null)
        {
            k = 0;
        } else
        {
            k = commonData.hashCode();
        }
        if (nameVerifyData == null)
        {
            l = 0;
        } else
        {
            l = nameVerifyData.hashCode();
        }
        if (tokenVerifyData == null)
        {
            i1 = 0;
        } else
        {
            i1 = tokenVerifyData.hashCode();
        }
        if (tripVerifyData == null)
        {
            j1 = 0;
        } else
        {
            j1 = tripVerifyData.hashCode();
        }
        if (newPasswordData != null)
        {
            k1 = newPasswordData.hashCode();
        }
        return (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k1;
    }

    public final PasswordResetData setCommonData(PasswordResetCommonData passwordresetcommondata)
    {
        commonData = passwordresetcommondata;
        return this;
    }

    final PasswordResetData setNameVerifyData(PasswordResetNameVerifyData passwordresetnameverifydata)
    {
        nameVerifyData = passwordresetnameverifydata;
        return this;
    }

    final PasswordResetData setNewPasswordData(PasswordResetNewPasswordData passwordresetnewpassworddata)
    {
        newPasswordData = passwordresetnewpassworddata;
        return this;
    }

    final PasswordResetData setPhoneNumberE164(String s)
    {
        phoneNumberE164 = s;
        return this;
    }

    final PasswordResetData setState(String s)
    {
        state = s;
        return this;
    }

    final PasswordResetData setTokenVerifyData(PasswordResetTokenVerifyData passwordresettokenverifydata)
    {
        tokenVerifyData = passwordresettokenverifydata;
        return this;
    }

    final PasswordResetData setTripVerifyData(PasswordResetTripVerifyData passwordresettripverifydata)
    {
        tripVerifyData = passwordresettripverifydata;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PasswordResetData{phoneNumberE164=")).append(phoneNumberE164).append(", state=").append(state).append(", commonData=").append(commonData).append(", nameVerifyData=").append(nameVerifyData).append(", tokenVerifyData=").append(tokenVerifyData).append(", tripVerifyData=").append(tripVerifyData).append(", newPasswordData=").append(newPasswordData).append("}").toString();
    }
}
