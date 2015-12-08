// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.gtalkservice:
//            c

public class GroupChatInvitation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private long mGroupContactId;
    private String mInviter;
    private String mPassword;
    private String mReason;
    private String mRoomAddress;

    public GroupChatInvitation(Parcel parcel)
    {
        mRoomAddress = parcel.readString();
        mInviter = parcel.readString();
        mReason = parcel.readString();
        mPassword = parcel.readString();
        mGroupContactId = parcel.readLong();
    }

    public GroupChatInvitation(String s, String s1, String s2, String s3, long l)
    {
        mRoomAddress = s;
        mInviter = s1;
        mReason = s2;
        mPassword = s3;
        mGroupContactId = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public long getGroupContactId()
    {
        return mGroupContactId;
    }

    public String getInviter()
    {
        return mInviter;
    }

    public String getPassword()
    {
        return mPassword;
    }

    public String getReason()
    {
        return mReason;
    }

    public String getRoomAddress()
    {
        return mRoomAddress;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mRoomAddress);
        parcel.writeString(mInviter);
        parcel.writeString(mReason);
        parcel.writeString(mPassword);
        parcel.writeLong(mGroupContactId);
    }

}
