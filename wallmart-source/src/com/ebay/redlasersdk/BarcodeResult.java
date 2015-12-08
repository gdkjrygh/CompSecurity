// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

public class BarcodeResult
    implements Parcelable, Serializable
{

    public static android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final BarcodeResult createFromParcel(Parcel parcel)
        {
            return new BarcodeResult(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final BarcodeResult[] newArray(int i)
        {
            return new BarcodeResult[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String TAG = "BarcodeResult";
    private static final long serialVersionUID = 0x752d57b8f3c8ec45L;
    public UUID associatedBarcode;
    public ArrayList barcodeLocation;
    public String barcodeString;
    public int barcodeType;
    public String extendedBarcodeString;
    public Date firstScanTime;
    public boolean isPartialBarcode;
    public Date mostRecentScanTime;
    public UUID uniqueID;

    public BarcodeResult()
    {
        isPartialBarcode = false;
        if (uniqueID == null)
        {
            uniqueID = UUID.randomUUID();
        }
        if (barcodeLocation == null)
        {
            barcodeLocation = new ArrayList();
        }
        firstScanTime = new Date();
    }

    protected BarcodeResult(Parcel parcel)
    {
        isPartialBarcode = false;
        barcodeType = parcel.readInt();
        barcodeString = parcel.readString();
        extendedBarcodeString = parcel.readString();
        firstScanTime = (Date)parcel.readSerializable();
        mostRecentScanTime = (Date)parcel.readSerializable();
        uniqueID = (UUID)parcel.readSerializable();
        associatedBarcode = (UUID)parcel.readSerializable();
        barcodeLocation = new ArrayList();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            PointF pointf = new PointF(parcel.readFloat(), parcel.readFloat());
            barcodeLocation.add(pointf);
        }

    }

    public BarcodeResult(BarcodeResult barcoderesult)
    {
        isPartialBarcode = false;
        barcodeType = barcoderesult.barcodeType;
        barcodeString = barcoderesult.barcodeString;
        extendedBarcodeString = barcoderesult.extendedBarcodeString;
        firstScanTime = barcoderesult.firstScanTime;
        mostRecentScanTime = barcoderesult.mostRecentScanTime;
        uniqueID = barcoderesult.uniqueID;
        associatedBarcode = barcoderesult.associatedBarcode;
        barcodeLocation = new ArrayList();
        for (int i = 0; i < barcoderesult.barcodeLocation.size(); i++)
        {
            PointF pointf = (PointF)barcoderesult.barcodeLocation.get(i);
            pointf = new PointF(pointf.x, pointf.y);
            barcodeLocation.add(pointf);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof BarcodeResult))
            {
                return false;
            }
            obj = (BarcodeResult)obj;
            if (barcodeType != ((BarcodeResult) (obj)).barcodeType || !barcodeString.equals(((BarcodeResult) (obj)).barcodeString))
            {
                return false;
            }
        }
        return true;
    }

    public BarcodeResult getAssociatedBarcode(AbstractCollection abstractcollection)
    {
        if (associatedBarcode == null)
        {
            return null;
        }
        Iterator iterator = abstractcollection.iterator();
        abstractcollection = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BarcodeResult barcoderesult = (BarcodeResult)iterator.next();
            if (barcoderesult.associatedBarcode != null && barcoderesult.associatedBarcode.equals(uniqueID) && associatedBarcode.equals(barcoderesult.uniqueID))
            {
                abstractcollection = barcoderesult;
            }
        } while (true);
        return abstractcollection;
    }

    public String getBarcodeType()
    {
        switch (barcodeType)
        {
        default:
            return "NONE";

        case 1: // '\001'
            return "EAN-13";

        case 2: // '\002'
            return "UPC-E";

        case 4: // '\004'
            return "EAN-8";

        case 8: // '\b'
            return "StickyBits";

        case 16: // '\020'
            return "QR Code";

        case 32: // ' '
            return "Code 128";

        case 64: // '@'
            return "Code 39";

        case 128: 
            return "DataMatrix";

        case 256: 
            return "ITF";

        case 512: 
            return "Code 93";

        case 1024: 
            return "DataBar";

        case 2048: 
            return "Codabar";

        case 4096: 
            return "EAN-5";

        case 8192: 
            return "EAN-2";

        case 16384: 
            return "PDF 417";

        case 32768: 
            return "DataBar Expanded";
        }
    }

    public int hashCode()
    {
        return (barcodeType + 7471) * 31 + barcodeString.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(barcodeType);
        parcel.writeString(barcodeString);
        parcel.writeString(extendedBarcodeString);
        parcel.writeSerializable(firstScanTime);
        parcel.writeSerializable(mostRecentScanTime);
        parcel.writeSerializable(uniqueID);
        parcel.writeSerializable(associatedBarcode);
        parcel.writeInt(barcodeLocation.size());
        PointF pointf;
        for (Iterator iterator = barcodeLocation.iterator(); iterator.hasNext(); parcel.writeFloat(pointf.y))
        {
            pointf = (PointF)iterator.next();
            parcel.writeFloat(pointf.x);
        }

    }

}
