// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.os.Handler;
import com.kofax.kmc.ken.engines.data.Image;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            BarcodeReaderEngineManager, BarCodeReader

class i extends Thread
{

    final Bitmap a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final int g;
    final Image h;
    final com.kofax.kmc.ken.engines.data.it> i;
    final BarCodeReader j;

    public void run()
    {
        RecognitionContext recognitioncontext = (new BarcodeReaderEngineManager()).ABE_BarcodeEngine_Recognize(a, b, c, d, e, f, g);
        class _cls1
            implements Runnable
        {

            final RecognitionContext a;
            final BarCodeReader._cls1 b;

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
                        BarCodeReader.BarcodeReadCompleteListener barcodereadcompletelistener = (BarCodeReader.BarcodeReadCompleteListener)list.next();
                        if (barcodereadcompletelistener != null)
                        {
                            barcodereadcompletelistener.barcodeReadComplete(new BarCodeReader.BarcodeReadCompleteEvent(this, errorinfo, image));
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
                    errorinfo = BarCodeReader.a(b.j, a.getResultCode(), a);
                }
                arraylist.addAll(a.getBarCodeResults());
                errorinfo1 = errorinfo;
                if (b.h.getImageBarCodes().size() > 0)
                {
                    b.h.getImageBarCodes().clear();
                }
                b.h.setImageBarCodes(arraylist);
                if (b.i == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE)
                {
                    b.h.imageClearBitmap();
                }
                BarCodeReader.a(false);
                a(b.h, errorinfo1, BarCodeReader.a(b.j));
                return;
                Exception exception;
                exception;
                BarCodeReader.a(false);
                throw exception;
            }

            _cls1(RecognitionContext recognitioncontext)
            {
                b = BarCodeReader._cls1.this;
                a = recognitioncontext;
                super();
            }
        }

        BarCodeReader.b(j).post(new _cls1(recognitioncontext));
    }

    Rep(BarCodeReader barcodereader, Bitmap bitmap, int k, int l, int i1, int j1, int k1, 
            int l1, Image image, com.kofax.kmc.ken.engines.data.nager nager)
    {
        j = barcodereader;
        a = bitmap;
        b = k;
        c = l;
        d = i1;
        e = j1;
        f = k1;
        g = l1;
        h = image;
        i = nager;
        super();
    }
}
