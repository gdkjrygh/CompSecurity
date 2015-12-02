// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            Note

public final class Shape_Note extends Note
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Note createFromParcel(Parcel parcel)
        {
            return new Shape_Note(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Note[] newArray(int i)
        {
            return new Note[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_Note.getClassLoader();
    private String text;

    Shape_Note()
    {
    }

    private Shape_Note(Parcel parcel)
    {
        text = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (Note)obj;
            if (((Note) (obj)).getText() == null ? getText() != null : !((Note) (obj)).getText().equals(getText()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getText()
    {
        return text;
    }

    public final int hashCode()
    {
        int i;
        if (text == null)
        {
            i = 0;
        } else
        {
            i = text.hashCode();
        }
        return i ^ 0xf4243;
    }

    public final Note setText(String s)
    {
        text = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.Note{text=")).append(text).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(text);
    }

}
