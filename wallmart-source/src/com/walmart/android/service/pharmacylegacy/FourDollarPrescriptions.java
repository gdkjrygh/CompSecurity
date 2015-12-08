// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.pharmacylegacy;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class FourDollarPrescriptions
{
    public static class DrugList
    {

        private String mCategory;
        private Drug mDrugList[];

        public String getCategory()
        {
            return mCategory;
        }

        public Drug[] getDrugList()
        {
            return mDrugList;
        }

        public void setCategory(String s)
        {
            mCategory = s;
        }

        public void setDrugList(Drug adrug[])
        {
            ArrayList arraylist = new ArrayList();
            int j = adrug.length;
            for (int i = 0; i < j; i++)
            {
                Drug drug = adrug[i];
                if (drug != null && !TextUtils.isEmpty(drug.mName))
                {
                    arraylist.add(drug);
                }
            }

            mDrugList = (Drug[])arraylist.toArray(new Drug[arraylist.size()]);
        }

        public String toString()
        {
            return (new StringBuilder()).append("DrugList [mCategory=").append(mCategory).append(", mDrugList=").append(Arrays.toString(mDrugList)).append("]").toString();
        }

        public DrugList()
        {
        }
    }

    public static class DrugList.Drug
    {

        private String mName;
        private String mQty30Day;
        private String mQty60Day;

        public String getName()
        {
            return mName;
        }

        public String getQty30Day()
        {
            return mQty30Day;
        }

        public String getQty60Day()
        {
            return mQty60Day;
        }

        public void setName(String s)
        {
            String s1 = s;
            if (s != null)
            {
                s1 = s.trim();
            }
            mName = s1;
        }

        public void setQty30Day(String s)
        {
            mQty30Day = s;
        }

        public void setQty60Day(String s)
        {
            mQty60Day = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Drug [mName=").append(mName).append(", mQty30Day=").append(mQty30Day).append(", mQty60Day=").append(mQty60Day).append("]").toString();
        }


        public DrugList.Drug()
        {
        }
    }


    private String mCategories[];
    private DrugList mDrugList[];

    public FourDollarPrescriptions()
    {
    }

    public String[] getCategories()
    {
        return mCategories;
    }

    public DrugList[] getDrugList()
    {
        return mDrugList;
    }

    public void setCategories(String as[])
    {
        mCategories = as;
    }

    public void setDrugList(DrugList adruglist[])
    {
        mDrugList = adruglist;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FourDollarPrescriptions [mCategories=").append(Arrays.toString(mCategories)).append(", mDrugList=").append(Arrays.toString(mDrugList)).append("]").toString();
    }
}
