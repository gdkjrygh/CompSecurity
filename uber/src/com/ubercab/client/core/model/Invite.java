// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class Invite
{

    public static final String STATUS_INVITED = "INVITED";
    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_SUCCESS = "SUCCESS";
    private String avatarUrl;
    private String email;
    private String fullName;
    private String inviteMessage;
    private String inviteStatus;
    private String mobile;
    private String mobileCountryId;

    Invite()
    {
    }

    public Invite(String s, String s1, String s2)
    {
        fullName = s;
        inviteStatus = s1;
        avatarUrl = s2;
    }

    public Invite(String s, String s1, String s2, String s3)
    {
        fullName = s;
        inviteMessage = s1;
        email = s3;
        avatarUrl = s2;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Invite)obj;
            if (avatarUrl == null ? ((Invite) (obj)).avatarUrl != null : !avatarUrl.equals(((Invite) (obj)).avatarUrl))
            {
                return false;
            }
            if (email == null ? ((Invite) (obj)).email != null : !email.equals(((Invite) (obj)).email))
            {
                return false;
            }
            if (fullName == null ? ((Invite) (obj)).fullName != null : !fullName.equals(((Invite) (obj)).fullName))
            {
                return false;
            }
            if (inviteMessage == null ? ((Invite) (obj)).inviteMessage != null : !inviteMessage.equals(((Invite) (obj)).inviteMessage))
            {
                return false;
            }
            if (inviteStatus == null ? ((Invite) (obj)).inviteStatus != null : !inviteStatus.equals(((Invite) (obj)).inviteStatus))
            {
                return false;
            }
            if (mobile == null ? ((Invite) (obj)).mobile != null : !mobile.equals(((Invite) (obj)).mobile))
            {
                return false;
            }
            if (mobileCountryId == null ? ((Invite) (obj)).mobileCountryId != null : !mobileCountryId.equals(((Invite) (obj)).mobileCountryId))
            {
                return false;
            }
        }
        return true;
    }

    public String getAvatarUrl()
    {
        return avatarUrl;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getInviteMessage()
    {
        return inviteMessage;
    }

    public String getInviteStatus()
    {
        return inviteStatus;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getMobileCountryId()
    {
        return mobileCountryId;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (fullName != null)
        {
            i = fullName.hashCode();
        } else
        {
            i = 0;
        }
        if (mobile != null)
        {
            j = mobile.hashCode();
        } else
        {
            j = 0;
        }
        if (mobileCountryId != null)
        {
            k = mobileCountryId.hashCode();
        } else
        {
            k = 0;
        }
        if (email != null)
        {
            l = email.hashCode();
        } else
        {
            l = 0;
        }
        if (inviteStatus != null)
        {
            i1 = inviteStatus.hashCode();
        } else
        {
            i1 = 0;
        }
        if (inviteMessage != null)
        {
            j1 = inviteMessage.hashCode();
        } else
        {
            j1 = 0;
        }
        if (avatarUrl != null)
        {
            k1 = avatarUrl.hashCode();
        }
        return (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + k1;
    }

    public void setAvatarUrl(String s)
    {
        avatarUrl = s;
    }

    public void setFullName(String s)
    {
        fullName = s;
    }
}
