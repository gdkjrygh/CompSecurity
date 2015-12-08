// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.recognizers;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.ebay.redlasersdk.BarcodeResult;
import java.io.Serializable;
import java.util.ArrayList;

public class BarcodeResultInternal extends BarcodeResult
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new BarcodeResultInternal(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new BarcodeResultInternal[i];
        }

    };
    private static final long serialVersionUID = 0x4b0a2e466560f213L;
    public int recognizeCount;
    public int recognizedBy;

    public BarcodeResultInternal()
    {
    }

    public BarcodeResultInternal(int i, String s, String s1, int j, boolean flag)
    {
        this();
        barcodeType = i;
        barcodeString = s;
        extendedBarcodeString = s1;
        recognizedBy = j;
        isPartialBarcode = flag;
    }

    private BarcodeResultInternal(Parcel parcel)
    {
        super(parcel);
        recognizedBy = parcel.readInt();
        recognizeCount = parcel.readInt();
    }


    public BarcodeResultInternal(BarcodeResultInternal barcoderesultinternal)
    {
        super(barcoderesultinternal);
        recognizedBy = barcoderesultinternal.recognizedBy;
        recognizeCount = barcoderesultinternal.recognizeCount;
    }

    public void AddBarcodeLocationPoint(PointF pointf)
    {
        barcodeLocation.add(pointf);
    }

    public void AssociateWith(BarcodeResult barcoderesult)
    {
        associatedBarcode = barcoderesult.uniqueID;
        barcoderesult.associatedBarcode = uniqueID;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getBarcodeTrackingType()
    {
        switch (barcodeType)
        {
        default:
            return "NONE";

        case 1: // '\001'
            return "EAN13";

        case 2: // '\002'
            return "UPCE";

        case 4: // '\004'
            return "EAN8";

        case 8: // '\b'
            return "StickyBits";

        case 16: // '\020'
            return "QRCode";

        case 32: // ' '
            return "Code128";

        case 64: // '@'
            return "Code39";

        case 128: 
            return "DataMatrix";

        case 256: 
            return "ITF";

        case 512: 
            return "Code93";

        case 1024: 
            return "DataBar";

        case 2048: 
            return "Codabar";

        case 4096: 
            return "EAN5";

        case 8192: 
            return "EAN2";

        case 16384: 
            return "PDF417";

        case 32768: 
            return "DataBar_Expanded";
        }
    }

    public String getRecognizedBy()
    {
        String s1 = new String();
        String s = s1;
        if ((recognizedBy & 1) != 0)
        {
            s = s1.concat("Occipital ");
        }
        s1 = s;
        if ((recognizedBy & 2) != 0)
        {
            s1 = s.concat("ZXing ");
        }
        s = s1;
        if ((recognizedBy & 4) != 0)
        {
            s = s1.concat("NewLaser ");
        }
        s1 = s;
        if ((recognizedBy & 8) != 0)
        {
            s1 = s.concat("NLBlurry ");
        }
        if (s1.length() == 0)
        {
            return "None";
        } else
        {
            return s1.substring(0, s1.length() - 1);
        }
    }

    public void setRecognizedBy(int i)
    {
        recognizedBy = recognizedBy | i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(recognizedBy);
        parcel.writeInt(recognizeCount);
    }

}
