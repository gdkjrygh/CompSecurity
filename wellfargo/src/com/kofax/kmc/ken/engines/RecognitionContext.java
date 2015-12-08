// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.BarCodeDataFormat;
import com.kofax.kmc.ken.engines.data.BarCodeDirection;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            Barcode

class RecognitionContext
{

    private Barcode _atalaBarcode[];
    private boolean _checksum;
    private int _engineVersion;
    private String _errorMessage;
    private int _resultCode;
    private int _symbolsFound;

    public RecognitionContext(int i, int j, String s, int k, Barcode abarcode[], boolean flag)
    {
        _resultCode = i;
        _engineVersion = j;
        _errorMessage = s;
        _symbolsFound = k;
        _atalaBarcode = abarcode;
        _checksum = flag;
    }

    private BarCodeDirection toDirection(int i)
    {
        if (i > 315 && i <= 45)
        {
            return BarCodeDirection.BOTTOM_UP;
        }
        if (i > 45 && i <= 135)
        {
            return BarCodeDirection.RIGHT_LEFT;
        }
        if (i > 135 && i <= 225)
        {
            return BarCodeDirection.TOP_DOWN;
        } else
        {
            return BarCodeDirection.LEFT_RIGHT;
        }
    }

    private BarCodeDataFormat toFormat(int i)
    {
        switch (i)
        {
        default:
            return BarCodeDataFormat.UNKNOWN;

        case 1: // '\001'
            return BarCodeDataFormat.ASCII;

        case 2: // '\002'
            return BarCodeDataFormat.BASE_64;
        }
    }

    List getBarCodeResults()
    {
        ArrayList arraylist = new ArrayList();
        if (_symbolsFound > 0)
        {
            Barcode abarcode[] = _atalaBarcode;
            int j = abarcode.length;
            for (int i = 0; i < j; i++)
            {
                Barcode barcode = abarcode[i];
                BarCodeResult barcoderesult = new BarCodeResult();
                double ad[] = barcode.getCornerX();
                double ad1[] = barcode.getCornerY();
                barcoderesult.setBoundingBox(new BoundingTetragon((int)ad[0], (int)ad1[0], (int)ad[1], (int)ad1[1], (int)ad[2], (int)ad1[2], (int)ad[3], (int)ad1[3]));
                barcoderesult.setDataFormat(toFormat(barcode.getDataType()));
                barcoderesult.setDirection(toDirection(barcode.getAngle()));
                barcoderesult.setType(BarCodeReader.Symbology.getBarCodeType(barcode.getType()));
                barcoderesult.setValue(barcode.getData());
                arraylist.add(barcoderesult);
            }

        }
        return arraylist;
    }

    Barcode[] getBarcode()
    {
        return _atalaBarcode;
    }

    boolean getChecksum()
    {
        return _checksum;
    }

    int getEngineVersion()
    {
        return _engineVersion;
    }

    String getErrorMessage()
    {
        return _errorMessage;
    }

    int getResultCode()
    {
        return _resultCode;
    }

    int getSymbolsFound()
    {
        return _symbolsFound;
    }
}
