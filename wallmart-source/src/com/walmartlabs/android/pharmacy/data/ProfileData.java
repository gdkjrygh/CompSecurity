// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.data;

import android.text.TextUtils;

public class ProfileData
{
    public static class Communication
    {

        public static final int BUSSINES_TYPE = 2;
        public static final int HOME_TYPE = 1;
        public static final int MOBILE_TYPE = 0;
        public static final int NONE_TYPE = -1;
        public String cellPhone;
        public String homePhone;
        public boolean textMessageNotifications;
        public String workPhone;

        public Communication copy()
        {
            Communication communication1 = new Communication();
            communication1.cellPhone = cellPhone;
            communication1.homePhone = homePhone;
            communication1.workPhone = workPhone;
            communication1.textMessageNotifications = textMessageNotifications;
            return communication1;
        }

        public int determinePreferredPhoneType()
        {
            if (!TextUtils.isEmpty(cellPhone))
            {
                return 0;
            }
            if (!TextUtils.isEmpty(homePhone))
            {
                return 1;
            }
            return TextUtils.isEmpty(workPhone) ? -1 : 2;
        }

        public String getPhoneNumber(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 0: // '\0'
                return cellPhone;

            case 1: // '\001'
                return homePhone;

            case 2: // '\002'
                return workPhone;
            }
        }

        public void setPhoneNumber(int i, String s)
        {
            switch (i)
            {
            default:
                return;

            case 0: // '\0'
                cellPhone = s;
                return;

            case 1: // '\001'
                homePhone = s;
                return;

            case 2: // '\002'
                workPhone = s;
                break;
            }
        }

        public Communication()
        {
        }
    }

    public static class PatientName
    {

        public String firstName;
        public String lastName;
        public String middleName;

        public PatientName()
        {
        }
    }

    public static class PrimaryAddress
    {

        public String city;
        public String country;
        public String county;
        public String state;
        public String street1;
        public String street2;
        public String street3;
        public String street4;
        public String zip;

        public PrimaryAddress()
        {
        }
    }


    public Communication communication;
    public String gender;
    public PatientName patientName;
    public PrimaryAddress primaryAddress;

    public ProfileData()
    {
    }
}
