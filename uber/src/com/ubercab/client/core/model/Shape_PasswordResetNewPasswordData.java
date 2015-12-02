// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            PasswordResetNewPasswordData

public final class Shape_PasswordResetNewPasswordData extends PasswordResetNewPasswordData
{

    private String newPassword;

    Shape_PasswordResetNewPasswordData()
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
            obj = (PasswordResetNewPasswordData)obj;
            if (((PasswordResetNewPasswordData) (obj)).getNewPassword() == null ? getNewPassword() != null : !((PasswordResetNewPasswordData) (obj)).getNewPassword().equals(getNewPassword()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getNewPassword()
    {
        return newPassword;
    }

    public final int hashCode()
    {
        int i;
        if (newPassword == null)
        {
            i = 0;
        } else
        {
            i = newPassword.hashCode();
        }
        return i ^ 0xf4243;
    }

    final PasswordResetNewPasswordData setNewPassword(String s)
    {
        newPassword = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PasswordResetNewPasswordData{newPassword=")).append(newPassword).append("}").toString();
    }
}
