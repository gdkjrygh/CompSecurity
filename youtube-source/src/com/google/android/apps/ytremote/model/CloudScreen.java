// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.ytremote.util.c;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            c, LoungeToken, TemporaryAccessToken, ClientName, 
//            ScreenId, d

public class CloudScreen
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.apps.ytremote.model.c();
    private final AccessType accessType;
    private final ClientName clientName;
    private final LoungeToken loungeToken;
    private final String name;
    private final ScreenId screenId;
    private final TemporaryAccessToken temporaryAccessToken;

    public CloudScreen(ScreenId screenid, String s, ClientName clientname, LoungeToken loungetoken)
    {
        accessType = AccessType.PERMANENT;
        temporaryAccessToken = null;
        screenId = screenid;
        name = s;
        clientName = clientname;
        loungeToken = loungetoken;
    }

    public CloudScreen(TemporaryAccessToken temporaryaccesstoken, String s)
    {
        accessType = AccessType.TEMPORARY;
        temporaryAccessToken = temporaryaccesstoken;
        screenId = null;
        name = s;
        clientName = null;
        loungeToken = new LoungeToken(temporaryaccesstoken.toString());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (CloudScreen)obj;
        if (accessType != ((CloudScreen) (obj)).accessType)
        {
            return false;
        }
        if (name == null)
        {
            if (((CloudScreen) (obj)).name != null)
            {
                return false;
            }
        } else
        if (!name.equals(((CloudScreen) (obj)).name))
        {
            return false;
        }
        if (clientName == null)
        {
            if (((CloudScreen) (obj)).clientName != null)
            {
                return false;
            }
        } else
        if (!clientName.equals(((CloudScreen) (obj)).clientName))
        {
            return false;
        }
        if (screenId == null)
        {
            if (((CloudScreen) (obj)).screenId != null)
            {
                return false;
            }
        } else
        if (!screenId.equals(((CloudScreen) (obj)).screenId))
        {
            return false;
        }
        if (temporaryAccessToken != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CloudScreen) (obj)).temporaryAccessToken == null) goto _L1; else goto _L3
_L3:
        return false;
        if (temporaryAccessToken.equals(((CloudScreen) (obj)).temporaryAccessToken)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public AccessType getAccessType()
    {
        return accessType;
    }

    public ClientName getClientName()
    {
        return clientName;
    }

    public LoungeToken getLoungeToken()
    {
        return loungeToken;
    }

    public String getName()
    {
        return name;
    }

    public ScreenId getScreenId()
    {
        return screenId;
    }

    public TemporaryAccessToken getTemporaryAccessToken()
    {
        return temporaryAccessToken;
    }

    public boolean hasLoungeToken()
    {
        return loungeToken != null;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (accessType == null)
        {
            i = 0;
        } else
        {
            i = accessType.hashCode();
        }
        if (name == null)
        {
            j = 0;
        } else
        {
            j = name.hashCode();
        }
        if (clientName == null)
        {
            k = 0;
        } else
        {
            k = clientName.hashCode();
        }
        if (screenId == null)
        {
            l = 0;
        } else
        {
            l = screenId.hashCode();
        }
        if (temporaryAccessToken != null)
        {
            i1 = temporaryAccessToken.hashCode();
        }
        return (l + (k + (j + (i + 31) * 31) * 31) * 31) * 31 + i1;
    }

    public String toString()
    {
        return (new StringBuilder("CloudScreen [accessType=")).append(accessType).append(", screenId=").append(screenId).append(", name=").append(name).append("]").toString();
    }

    public CloudScreen withLoungeToken(LoungeToken loungetoken)
    {
        c.a(loungetoken);
        boolean flag;
        if (accessType == AccessType.PERMANENT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return new CloudScreen(screenId, name, clientName, loungetoken);
        }
    }

    public CloudScreen withName(String s)
    {
        switch (d.a[accessType.ordinal()])
        {
        default:
            return this;

        case 1: // '\001'
            return new CloudScreen(screenId, s, clientName, loungeToken);

        case 2: // '\002'
            return new CloudScreen(temporaryAccessToken, s);
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(accessType.ordinal());
        parcel.writeString(name);
        if (accessType == AccessType.PERMANENT)
        {
            parcel.writeParcelable(screenId, i);
            parcel.writeSerializable(loungeToken);
            if (clientName != null)
            {
                parcel.writeSerializable(clientName);
            }
            return;
        } else
        {
            parcel.writeSerializable(temporaryAccessToken);
            return;
        }
    }


    private class AccessType extends Enum
    {

        private static final AccessType $VALUES[];
        public static final AccessType PERMANENT;
        public static final AccessType TEMPORARY;

        public static AccessType fromString(String s)
        {
            if (s == null)
            {
                return null;
            }
            try
            {
                s = valueOf(s.toUpperCase(Locale.US));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public static AccessType valueOf(String s)
        {
            return (AccessType)Enum.valueOf(com/google/android/apps/ytremote/model/CloudScreen$AccessType, s);
        }

        public static AccessType[] values()
        {
            return (AccessType[])$VALUES.clone();
        }

        static 
        {
            PERMANENT = new AccessType("PERMANENT", 0);
            TEMPORARY = new AccessType("TEMPORARY", 1);
            $VALUES = (new AccessType[] {
                PERMANENT, TEMPORARY
            });
        }

        private AccessType(String s, int i)
        {
            super(s, i);
        }
    }

}
