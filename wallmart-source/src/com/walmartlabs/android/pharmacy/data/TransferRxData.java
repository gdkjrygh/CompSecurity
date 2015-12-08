// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.data;

import com.walmartlabs.storelocator.StoreData;

public class TransferRxData
{
    public static class PatientInfo
    {

        public String dob;
        public String emailAddress;
        public String firstName;
        public String gender;
        public String lastName;
        public String phone;

        public PatientInfo()
        {
        }
    }

    public static class RxInfo
    {

        public String drugName;
        public String pharmacyName;
        public String pharmacyPhone;
        public String prescriberFirstName;
        public String prescriberLastName;
        public String prescriberPhone;
        public String rxNumber;

        public RxInfo()
        {
        }
    }


    public static final int INVALID_STORE = -1;
    public PatientInfo patientInfo;
    public String pickupDate;
    public int pickupStore;
    public StoreData pickupStoreData;
    public String pickupTime;
    public RxInfo rxInfo[] = {
        new RxInfo()
    };

    public TransferRxData()
    {
        pickupStore = -1;
        patientInfo = new PatientInfo();
    }
}
