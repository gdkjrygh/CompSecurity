// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            RecognitionContext, BarCodeReader

class a
    implements Runnable
{

    final RecognitionContext a;
    final  b;

    private void a(Image image, ErrorInfo errorinfo, List list)
    {
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                odeReadCompleteListener odereadcompletelistener = (odeReadCompleteListener)list.next();
                if (odereadcompletelistener != null)
                {
                    odereadcompletelistener.barcodeReadComplete(new odeReadCompleteEvent(this, errorinfo, image));
                }
            } while (true);
        }
    }

    public void run()
    {
        ErrorInfo errorinfo;
        ErrorInfo errorinfo1;
        ArrayList arraylist;
        errorinfo = ErrorInfo.KMC_SUCCESS;
        arraylist = new ArrayList();
        errorinfo1 = errorinfo;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (a.getBarcode().length == 0)
        {
            errorinfo = BarCodeReader.a(b.b, a.getResultCode(), a);
        }
        arraylist.addAll(a.getBarCodeResults());
        errorinfo1 = errorinfo;
        if (b.b.getImageBarCodes().size() > 0)
        {
            b.b.getImageBarCodes().clear();
        }
        b.b.setImageBarCodes(arraylist);
        if (b.b == com.kofax.kmc.ken.engines.data.GE_REP_FILE)
        {
            b.b.imageClearBitmap();
        }
        BarCodeReader.a(false);
        a(b.b, errorinfo1, BarCodeReader.a(b.b));
        return;
        Exception exception;
        exception;
        BarCodeReader.a(false);
        throw exception;
    }

    ( , RecognitionContext recognitioncontext)
    {
        b = ;
        a = recognitioncontext;
        super();
    }
}
