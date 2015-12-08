// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.IpLibUtil;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            RecognitionContext

public class BarCodeReader
{

    private static volatile boolean a;
    private static boolean h;
    private int b;
    private Symbology c[];
    private Direction d;
    private final Handler e;
    private ErrorInfo f;
    private final ArrayList g;

    public BarCodeReader()
    {
        e = new Handler(Looper.getMainLooper());
        g = new ArrayList();
        b = 1;
        c = new Symbology[0];
        d = Direction.ALL;
    }

    public BarCodeReader(Symbology asymbology[], Direction direction, int i)
    {
        e = new Handler(Looper.getMainLooper());
        g = new ArrayList();
        if (i == 0)
        {
            b = 1;
        }
        b = i;
        if (asymbology == null)
        {
            c = new Symbology[0];
        }
        c = asymbology;
        if (direction == null)
        {
            d = Direction.ALL;
        }
        d = direction;
    }

    private int a(Symbology asymbology[])
    {
        int i = 0;
        int k = asymbology.length;
        int j = 0;
        for (; i < k; i++)
        {
            j |= Symbology.a(asymbology[i]);
        }

        return j;
    }

    private ErrorInfo a(int i, RecognitionContext recognitioncontext)
    {
        recognitioncontext = ErrorInfo.KMC_SUCCESS;
        if (i != 0)
        {
            recognitioncontext = ErrorInfo.KMC_BC_UNKNOWN;
        }
        return recognitioncontext;
    }

    static ErrorInfo a(BarCodeReader barcodereader, int i, RecognitionContext recognitioncontext)
    {
        return barcodereader.a(i, recognitioncontext);
    }

    static ArrayList a(BarCodeReader barcodereader)
    {
        return barcodereader.g;
    }

    private static void a()
    {
label0:
        {
            if (!h)
            {
                if (!IpLibUtil.isIpLicensed())
                {
                    break label0;
                }
                h = true;
            }
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_EV_LICENSING);
    }

    private void a(Image image)
    {
        f = ErrorInfo.KMC_SUCCESS;
        a();
        f = b(image);
        if (f != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcException(f);
        }
        com.kofax.kmc.ken.engines.data.Image.ImageRep imagerep = image.getImageRepresentation();
        Bitmap bitmap;
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE)
        {
            image.imageReadFromFile();
            bitmap = image.getImageBitmap();
        } else
        {
            bitmap = image.getImageBitmap();
        }
        a(image, imagerep, bitmap, bitmap.getWidth(), bitmap.getHeight(), a(c), Direction.a(d), b, image.getImageOutputColor().getBitsPerPixel());
    }

    private void a(Image image, com.kofax.kmc.ken.engines.data.Image.ImageRep imagerep, Bitmap bitmap, int i, int j, int k, int l, 
            int i1, int j1)
    {
        (new _cls1(bitmap, i, j, k, l, i1, j1, image, imagerep)).start();
    }

    static boolean a(boolean flag)
    {
        a = flag;
        return flag;
    }

    static Handler b(BarCodeReader barcodereader)
    {
        return barcodereader.e;
    }

    private ErrorInfo b(Image image)
    {
        ErrorInfo errorinfo;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = false;
        errorinfo = ErrorInfo.KMC_SUCCESS;
        if (image != null) goto _L2; else goto _L1
_L1:
        ErrorInfo errorinfo1 = ErrorInfo.KMC_BC_INVALID_IMAGE;
_L4:
        return errorinfo1;
_L2:
        if (image.getImageOutputColor().getBitsPerPixel() == 1)
        {
            errorinfo = ErrorInfo.KMC_BC_INVALID_IMAGE;
        }
        boolean flag;
        if (image.getImageBitmapScaling().floatValue() < 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BITMAP)
        {
            if (flag)
            {
                errorinfo = ErrorInfo.KMC_BC_NO_REPRESENTATION;
                errorinfo.setErrCause("Only representation is bitmap but it is scaled down");
                flag = flag1;
            } else
            {
                flag = true;
            }
        } else
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_FILE)
        {
            flag = flag1;
            if (image.getImageFileRep() == com.kofax.kmc.ken.engines.data.Image.ImageFileRep.FILE_BUFFERED)
            {
                errorinfo = ErrorInfo.KMC_BC_IMAGE_BUFFERED;
                flag = flag1;
            }
        } else
        if (image.getImageRepresentation() == com.kofax.kmc.ken.engines.data.Image.ImageRep.IMAGE_REP_BOTH)
        {
            if (!flag)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
        } else
        {
            errorinfo = ErrorInfo.KMC_BC_NO_REPRESENTATION;
            flag = flag1;
        }
        errorinfo1 = errorinfo;
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        errorinfo1 = errorinfo;
        if (image.getImageBitmap() == null)
        {
            image = ErrorInfo.KMC_ED_NOIMAGE;
            image.setErrCause("imageBitmap field is null");
            return image;
        }
        if (true) goto _L4; else goto _L3
_L3:
        image = image.getImageFilePath();
        if (image == null)
        {
            image = ErrorInfo.KMC_ED_FILEPATH;
            image.setErrCause("imageFilePath field is null");
            return image;
        }
        errorinfo1 = errorinfo;
        if (!(new File(image)).exists())
        {
            return ErrorInfo.KMC_GN_FILE_NOT_FOUND;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void addBarcodeReadCompleteEventListener(BarcodeReadCompleteListener barcodereadcompletelistener)
    {
        if (barcodereadcompletelistener == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_BC_UNKNOWN);
        }
        if (!g.contains(barcodereadcompletelistener))
        {
            g.add(barcodereadcompletelistener);
        }
    }

    public int getMaxBarcodes()
    {
        return b;
    }

    public Direction getSearchDirections()
    {
        return d;
    }

    public Symbology[] getSearchSymbology()
    {
        return c;
    }

    public void readBarcodes(Image image)
    {
        Handler handler = e;
        handler;
        JVM INSTR monitorenter ;
        if (a)
        {
            throw new KmcException(ErrorInfo.KMC_BC_BUSY);
        }
        break MISSING_BLOCK_LABEL_29;
        image;
        handler;
        JVM INSTR monitorexit ;
        throw image;
        a = true;
        handler;
        JVM INSTR monitorexit ;
        try
        {
            a(image);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Image image)
        {
            a = false;
        }
        throw image;
    }

    public void removeBarcodeReadCompleteEventListener(BarcodeReadCompleteListener barcodereadcompletelistener)
    {
        if (barcodereadcompletelistener != null)
        {
            g.remove(barcodereadcompletelistener);
        }
    }

    public void setMaxBarcodes(int i)
    {
        b = i;
    }

    public void setSearchDirections(Direction direction)
    {
        d = direction;
    }

    public void setSearchSymbology(Symbology asymbology[])
    {
        c = asymbology;
    }

    private class Symbology extends Enum
    {

        public static final Symbology Codabar;
        public static final Symbology Code128;
        public static final Symbology Code25;
        public static final Symbology Code39;
        public static final Symbology Code93;
        public static final Symbology Ean;
        public static final Symbology Pdf417;
        public static final Symbology Postnet;
        public static final Symbology QRCode;
        public static final Symbology Upc;
        private static final Symbology b[];
        private final int a;

        static int a(Symbology symbology)
        {
            return symbology.a;
        }

        public static BarCodeType getBarCodeType(int i)
        {
            switch (i)
            {
            default:
                return BarCodeType.UNKNOWN;

            case 1: // '\001'
                return BarCodeType.CODE128;

            case 2: // '\002'
            case 4: // '\004'
                return BarCodeType.EAN;

            case 8: // '\b'
            case 16: // '\020'
                return BarCodeType.UPC;

            case 32: // ' '
                return BarCodeType.CODE39;

            case 64: // '@'
                return BarCodeType.CODE25;

            case 512: 
                return BarCodeType.CODE93;

            case 1024: 
                return BarCodeType.CODABAR;

            case 4096: 
                return BarCodeType.POSTNET;

            case 2097152: 
                return BarCodeType.PDF417;

            case 4194304: 
                return BarCodeType.QR;
            }
        }

        public static Symbology valueOf(String s)
        {
            return (Symbology)Enum.valueOf(com/kofax/kmc/ken/engines/BarCodeReader$Symbology, s);
        }

        public static Symbology[] values()
        {
            return (Symbology[])b.clone();
        }

        static 
        {
            Code128 = new Symbology("Code128", 0, 1);
            Ean = new Symbology("Ean", 1, 6);
            Upc = new Symbology("Upc", 2, 24);
            Code39 = new Symbology("Code39", 3, 32);
            Code25 = new Symbology("Code25", 4, 64);
            Code93 = new Symbology("Code93", 5, 512);
            Codabar = new Symbology("Codabar", 6, 1024);
            Postnet = new Symbology("Postnet", 7, 4096);
            Pdf417 = new Symbology("Pdf417", 8, 0x200000);
            QRCode = new Symbology("QRCode", 9, 0x400000);
            b = (new Symbology[] {
                Code128, Ean, Upc, Code39, Code25, Code93, Codabar, Postnet, Pdf417, QRCode
            });
        }

        private Symbology(String s, int i, int j)
        {
            super(s, i);
            a = j;
        }
    }


    private class Direction extends Enum
    {

        public static final Direction ALL;
        public static final Direction BOTTOM_UP;
        public static final Direction LEFT_RIGHT;
        public static final Direction RIGHT_LEFT;
        public static final Direction TOP_DOWN;
        private static final Direction b[];
        private final int a;

        static int a(Direction direction)
        {
            return direction.a;
        }

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(com/kofax/kmc/ken/engines/BarCodeReader$Direction, s);
        }

        public static Direction[] values()
        {
            return (Direction[])b.clone();
        }

        static 
        {
            LEFT_RIGHT = new Direction("LEFT_RIGHT", 0, 1);
            RIGHT_LEFT = new Direction("RIGHT_LEFT", 1, 4);
            TOP_DOWN = new Direction("TOP_DOWN", 2, 2);
            BOTTOM_UP = new Direction("BOTTOM_UP", 3, 8);
            ALL = new Direction("ALL", 4, LEFT_RIGHT.a | RIGHT_LEFT.a | TOP_DOWN.a | BOTTOM_UP.a);
            b = (new Direction[] {
                LEFT_RIGHT, RIGHT_LEFT, TOP_DOWN, BOTTOM_UP, ALL
            });
        }

        private Direction(String s, int i, int j)
        {
            super(s, i);
            a = j;
        }
    }


    private class _cls1 extends Thread
    {

        final Bitmap a;
        final int b;
        final int c;
        final int d;
        final int e;
        final int f;
        final int g;
        final Image h;
        final com.kofax.kmc.ken.engines.data.Image.ImageRep i;
        final BarCodeReader j;

        public void run()
        {
            RecognitionContext recognitioncontext = (new BarcodeReaderEngineManager()).ABE_BarcodeEngine_Recognize(a, b, c, d, e, f, g);
            class _cls1
                implements Runnable
            {

                final RecognitionContext a;
                final _cls1 b;

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
                            BarcodeReadCompleteListener barcodereadcompletelistener = (BarcodeReadCompleteListener)list.next();
                            if (barcodereadcompletelistener != null)
                            {
                                barcodereadcompletelistener.barcodeReadComplete(new BarcodeReadCompleteEvent(this, errorinfo, image));
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
                    b = _cls1.this;
                    a = recognitioncontext;
                    super();
                }

                private class BarcodeReadCompleteListener
                {

                    public abstract void barcodeReadComplete(BarcodeReadCompleteEvent barcodereadcompleteevent);
                }


                private class BarcodeReadCompleteEvent extends EventObject
                {

                    private static final long serialVersionUID = 0x4792eb13ac00a96aL;
                    private ErrorInfo a;
                    private Image b;

                    public Image getImage()
                    {
                        return b;
                    }

                    public ErrorInfo getStatus()
                    {
                        return a;
                    }

                    public BarcodeReadCompleteEvent(Object obj, ErrorInfo errorinfo, Image image)
                    {
                        super(obj);
                        a = errorinfo;
                        b = image;
                    }
                }

            }

            BarCodeReader.b(j).post(new _cls1(recognitioncontext));
        }

        _cls1(Bitmap bitmap, int k, int l, int i1, int j1, int k1, 
                int l1, Image image, com.kofax.kmc.ken.engines.data.Image.ImageRep imagerep)
        {
            j = BarCodeReader.this;
            a = bitmap;
            b = k;
            c = l;
            d = i1;
            e = j1;
            f = k1;
            g = l1;
            h = image;
            i = imagerep;
            super();
        }
    }

}
