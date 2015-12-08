// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.io.Serializable;
import java.util.Calendar;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProfileImage

public class FacebookFriendInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x8f8a7fccba88f5a4L;
    private int age;
    private String birthday;
    private String fbId;
    private String firstName;
    private String name;
    private WishProfileImage profileImage;

    public FacebookFriendInfo()
    {
        age = 0;
    }

    public int getAge()
    {
        return age;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public String getFbId()
    {
        return fbId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getName()
    {
        return name;
    }

    public WishProfileImage getProfileImage()
    {
        return profileImage;
    }

    public void setBirthday(String s)
    {
        birthday = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        s = s.split("/");
        if (s.length < 3)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        age = Calendar.getInstance().get(1) - Integer.valueOf(s[2]).intValue();
        return;
        s;
    }

    public void setFbId(String s)
    {
        fbId = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setProfileImage(WishProfileImage wishprofileimage)
    {
        profileImage = wishprofileimage;
    }
}
