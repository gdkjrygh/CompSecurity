// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            AnonymousPhoneNumberResponse

public final class Shape_AnonymousPhoneNumberResponse extends AnonymousPhoneNumberResponse
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final AnonymousPhoneNumberResponse createFromParcel(Parcel parcel)
        {
            return new Shape_AnonymousPhoneNumberResponse(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AnonymousPhoneNumberResponse[] newArray(int i)
        {
            return new AnonymousPhoneNumberResponse[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_AnonymousPhoneNumberResponse.getClassLoader();
    private String anonymous_number;
    private String anonymous_number_formatted;
    private String anonymous_sms_number;
    private String anonymous_sms_number_formatted;
    private String anonymous_voice_number;
    private String anonymous_voice_number_formatted;

    Shape_AnonymousPhoneNumberResponse()
    {
    }

    private Shape_AnonymousPhoneNumberResponse(Parcel parcel)
    {
        anonymous_number = (String)parcel.readValue(PARCELABLE_CL);
        anonymous_number_formatted = (String)parcel.readValue(PARCELABLE_CL);
        anonymous_sms_number = (String)parcel.readValue(PARCELABLE_CL);
        anonymous_sms_number_formatted = (String)parcel.readValue(PARCELABLE_CL);
        anonymous_voice_number = (String)parcel.readValue(PARCELABLE_CL);
        anonymous_voice_number_formatted = (String)parcel.readValue(PARCELABLE_CL);
    }


    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AnonymousPhoneNumberResponse)obj;
            if (((AnonymousPhoneNumberResponse) (obj)).getAnonymousNumber() == null ? getAnonymousNumber() != null : !((AnonymousPhoneNumberResponse) (obj)).getAnonymousNumber().equals(getAnonymousNumber()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberResponse) (obj)).getAnonymousNumberFormatted() == null ? getAnonymousNumberFormatted() != null : !((AnonymousPhoneNumberResponse) (obj)).getAnonymousNumberFormatted().equals(getAnonymousNumberFormatted()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberResponse) (obj)).getAnonymousSmsNumber() == null ? getAnonymousSmsNumber() != null : !((AnonymousPhoneNumberResponse) (obj)).getAnonymousSmsNumber().equals(getAnonymousSmsNumber()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberResponse) (obj)).getAnonymousSmsNumberFormatted() == null ? getAnonymousSmsNumberFormatted() != null : !((AnonymousPhoneNumberResponse) (obj)).getAnonymousSmsNumberFormatted().equals(getAnonymousSmsNumberFormatted()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberResponse) (obj)).getAnonymousVoiceNumber() == null ? getAnonymousVoiceNumber() != null : !((AnonymousPhoneNumberResponse) (obj)).getAnonymousVoiceNumber().equals(getAnonymousVoiceNumber()))
            {
                return false;
            }
            if (((AnonymousPhoneNumberResponse) (obj)).getAnonymousVoiceNumberFormatted() == null ? getAnonymousVoiceNumberFormatted() != null : !((AnonymousPhoneNumberResponse) (obj)).getAnonymousVoiceNumberFormatted().equals(getAnonymousVoiceNumberFormatted()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAnonymousNumber()
    {
        return anonymous_number;
    }

    public final String getAnonymousNumberFormatted()
    {
        return anonymous_number_formatted;
    }

    public final String getAnonymousSmsNumber()
    {
        return anonymous_sms_number;
    }

    public final String getAnonymousSmsNumberFormatted()
    {
        return anonymous_sms_number_formatted;
    }

    public final String getAnonymousVoiceNumber()
    {
        return anonymous_voice_number;
    }

    public final String getAnonymousVoiceNumberFormatted()
    {
        return anonymous_voice_number_formatted;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (anonymous_number == null)
        {
            i = 0;
        } else
        {
            i = anonymous_number.hashCode();
        }
        if (anonymous_number_formatted == null)
        {
            j = 0;
        } else
        {
            j = anonymous_number_formatted.hashCode();
        }
        if (anonymous_sms_number == null)
        {
            k = 0;
        } else
        {
            k = anonymous_sms_number.hashCode();
        }
        if (anonymous_sms_number_formatted == null)
        {
            l = 0;
        } else
        {
            l = anonymous_sms_number_formatted.hashCode();
        }
        if (anonymous_voice_number == null)
        {
            i1 = 0;
        } else
        {
            i1 = anonymous_voice_number.hashCode();
        }
        if (anonymous_voice_number_formatted != null)
        {
            j1 = anonymous_voice_number_formatted.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    final AnonymousPhoneNumberResponse setAnonymousNumber(String s)
    {
        anonymous_number = s;
        return this;
    }

    final AnonymousPhoneNumberResponse setAnonymousNumberFormatted(String s)
    {
        anonymous_number_formatted = s;
        return this;
    }

    final AnonymousPhoneNumberResponse setAnonymousSmsNumber(String s)
    {
        anonymous_sms_number = s;
        return this;
    }

    final AnonymousPhoneNumberResponse setAnonymousSmsNumberFormatted(String s)
    {
        anonymous_sms_number_formatted = s;
        return this;
    }

    final AnonymousPhoneNumberResponse setAnonymousVoiceNumber(String s)
    {
        anonymous_voice_number = s;
        return this;
    }

    final AnonymousPhoneNumberResponse setAnonymousVoiceNumberFormatted(String s)
    {
        anonymous_voice_number_formatted = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("AnonymousPhoneNumberResponse{anonymous_number=")).append(anonymous_number).append(", anonymous_number_formatted=").append(anonymous_number_formatted).append(", anonymous_sms_number=").append(anonymous_sms_number).append(", anonymous_sms_number_formatted=").append(anonymous_sms_number_formatted).append(", anonymous_voice_number=").append(anonymous_voice_number).append(", anonymous_voice_number_formatted=").append(anonymous_voice_number_formatted).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(anonymous_number);
        parcel.writeValue(anonymous_number_formatted);
        parcel.writeValue(anonymous_sms_number);
        parcel.writeValue(anonymous_sms_number_formatted);
        parcel.writeValue(anonymous_voice_number);
        parcel.writeValue(anonymous_voice_number_formatted);
    }

}
