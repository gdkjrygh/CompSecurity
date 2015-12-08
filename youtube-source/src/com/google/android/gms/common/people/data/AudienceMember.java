// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ge;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.ik;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.people.data:
//            b

public final class AudienceMember
    implements SafeParcelable
{

    public static final String AUDIENCE_GROUP_DOMAIN = "domain";
    public static final String AUDIENCE_GROUP_EXTENDED = "extendedCircles";
    public static final String AUDIENCE_GROUP_PUBLIC = "public";
    public static final String AUDIENCE_GROUP_YOUR_CIRCLES = "myCircles";
    public static final b CREATOR = new b();
    public static final int TYPE_CIRCLE = 1;
    public static final int TYPE_PERSON = 2;
    private final int jE;
    private final int le;
    private final Bundle rQ;
    private final int uc;
    private final String ud;
    private final String ue;
    private final String uf;
    private final String ug;

    AudienceMember(int i, int j, int k, String s, String s1, String s2, String s3, 
            Bundle bundle)
    {
        jE = i;
        le = j;
        uc = k;
        ud = s;
        ue = s1;
        uf = s2;
        ug = s3;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        rQ = bundle;
    }

    private AudienceMember(int i, int j, String s, String s1, String s2, String s3)
    {
        this(1, i, j, s, s1, s2, s3, null);
    }

    public static AudienceMember forCircle(String s, String s1)
    {
        return new AudienceMember(1, -1, s, null, s1, null);
    }

    public static AudienceMember forGroup(String s, String s1)
    {
        Integer integer = (Integer)ik.a.get(s);
        if (integer == null)
        {
            integer = (Integer)ik.a.get(null);
        }
        return new AudienceMember(1, integer.intValue(), s, null, s1, null);
    }

    public static AudienceMember forPersonWithEmail(String s, String s1)
    {
        return forPersonWithPeopleQualifiedId(ik.b(s), s1, null);
    }

    public static AudienceMember forPersonWithGaiaId(String s, String s1, String s2)
    {
        gi.a(s, "Person ID must not be empty.");
        return forPersonWithPeopleQualifiedId(ik.a(s), s1, s2);
    }

    public static AudienceMember forPersonWithPeopleQualifiedId(String s, String s1, String s2)
    {
        return new AudienceMember(2, 0, null, s, s1, s2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof AudienceMember)
        {
            if (jE == ((AudienceMember) (obj = (AudienceMember)obj)).jE && le == ((AudienceMember) (obj)).le && uc == ((AudienceMember) (obj)).uc && ge.a(ud, ((AudienceMember) (obj)).ud) && ge.a(ue, ((AudienceMember) (obj)).ue))
            {
                return true;
            }
        }
        return false;
    }

    public final String getAvatarUrl()
    {
        return ug;
    }

    public final String getCircleId()
    {
        return ud;
    }

    public final int getCircleType()
    {
        return uc;
    }

    public final String getDisplayName()
    {
        return uf;
    }

    public final Bundle getMetadata()
    {
        return rQ;
    }

    public final String getPeopleQualifiedId()
    {
        return ue;
    }

    public final int getType()
    {
        return le;
    }

    public final int getVersionCode()
    {
        return jE;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(jE), Integer.valueOf(le), Integer.valueOf(uc), ud, ue
        });
    }

    public final boolean isPerson()
    {
        return le == 2;
    }

    public final boolean isPersonalCircle()
    {
        return le == 1 && uc == -1;
    }

    public final boolean isPublicSystemGroup()
    {
        return le == 1 && uc == 1;
    }

    public final boolean isSystemGroup()
    {
        return le == 1 && uc != -1;
    }

    public final String toString()
    {
        if (isPerson())
        {
            return String.format("Person [%s] %s", new Object[] {
                getPeopleQualifiedId(), getDisplayName()
            });
        }
        if (isPersonalCircle())
        {
            return String.format("Circle [%s] %s", new Object[] {
                getCircleId(), getDisplayName()
            });
        } else
        {
            return String.format("Group [%s] %s", new Object[] {
                getCircleId(), getDisplayName()
            });
        }
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel);
    }

}
